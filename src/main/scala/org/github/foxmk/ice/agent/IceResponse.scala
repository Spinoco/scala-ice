package org.github.foxmk.ice.agent

import org.github.foxmk.ice.classes.CandidatePair
import org.github.foxmk.ice.harvest.Component
import org.github.foxmk.ice.sdp.SdpMessage

/**
  * @author Artyom Artemiev
  */
sealed abstract class IceResponse

case class PreparedSdpOffer(message: SdpMessage) extends IceResponse
case class PreparedSdpAnswer(message: SdpMessage) extends IceResponse
case class ConnectionEstablished(candidatePair: CandidatePair) extends IceResponse

case class StartConnectivityChecks(candidatePair: CandidatePair) extends IceResponse

case class HarvestCandidates(component: Component) extends IceResponse


