package org.github.foxmk.ice

import org.github.foxmk.ice.classes.Candidate

/**
  * @author Artyom Artemiev
  */
class MediaStreamManager {





  private def handleEvent(event: MSEvent): Unit = event match {
    case CandidateFound(candidate) => ???
    case CheckListPrioritized() => ???
  }

}

abstract class MSEvent {
  def streamId: Long = ???
}
case class CandidateFound(candidate: Candidate) extends MSEvent
case class CheckListPrioritized() extends MSEvent
