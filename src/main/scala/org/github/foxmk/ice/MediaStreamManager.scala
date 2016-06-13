package org.github.foxmk.ice

import java.util.concurrent.Future

import org.github.foxmk.ice.classes.Candidate

/**
  * @author Artyom Artemiev
  */
class MediaStreamManager {

  private def mediaStreams: Map[Long, MediaStream] = ???

  def createMediaStream: Future[MediaStream] = {

  }





  private def handleEvent(event: MSEvent): Unit = event match {
    case CandidateFound(candidate) =>
      val stream = mediaStreams(event.streamId)
      // update candidates
    case CheckListPrioritized() =>
      // send sdp offer?
  }

}

abstract class MSEvent {
  def streamId: Long = ???
}
case class CandidateFound(candidate: Candidate) extends MSEvent
case class CheckListPrioritized() extends MSEvent
