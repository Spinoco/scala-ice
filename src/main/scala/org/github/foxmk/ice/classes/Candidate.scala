package org.github.foxmk.ice.classes

import org.github.foxmk.ice.harvest.Component

/**
  * @author Artyom Artemiev
  */
abstract class Candidate {
  def address: TransportAddress
  def candidateType: CandidateType.Value
  def priority: Priority
  def isDefault: Boolean
  def foundation: Foundation

  def component: Component


}

case class HostCandidate() extends Candidate
case class RelayedCandidate() extends Candidate
case class ServerReflexiveCandidate() extends Candidate

abstract class CandidateState



case class Priority
