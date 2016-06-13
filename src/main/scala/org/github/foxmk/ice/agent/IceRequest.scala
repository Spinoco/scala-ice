package org.github.foxmk.ice.agent

import org.github.foxmk.ice.classes.Candidate
import org.github.foxmk.ice.sdp.SdpMessage

/**
  * @author Artyom Artemiev
  */
sealed abstract class IceRequest

case class IncomingSdpOffer(message: SdpMessage) extends IceRequest
case class IncomingSdpAnswer(message: SdpMessage) extends IceRequest

case class CreateStream(name: String) extends IceRequest

case class CandidateFound(candidate: Candidate) extends IceRequest
case class CandidatesPrioritized(candidates: Seq[Candidate]) extends IceRequest

case class ConnectivityCheckSuccessful() extends IceRequest
case class ConnectivityCheckFailed() extends IceRequest
