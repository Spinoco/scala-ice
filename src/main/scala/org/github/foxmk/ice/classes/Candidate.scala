package org.github.foxmk.ice.classes

import org.github.foxmk.ice.stun.TransportAddress

/**
  * @author Artyom Artemiev
  */
abstract class Candidate {
  def address: TransportAddress
  def candidateType: CandidateType
def priority: Priority


}

case class HostCandidate() extends Candidate
case class RelayedCandidate() extends Candidate
case class ServerReflexiveCandidate() extends Candidate

abstract class CandidateState

case class CandidateType

case class Priority
