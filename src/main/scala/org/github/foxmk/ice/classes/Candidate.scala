package org.github.foxmk.ice.classes

/**
  * @author Artyom Artemiev
  */
abstract class Candidate {
}

case class HostCandidate() extends Candidate
case class RelayedCandidate() extends Candidate
case class ServerReflexiveCandidate() extends Candidate


