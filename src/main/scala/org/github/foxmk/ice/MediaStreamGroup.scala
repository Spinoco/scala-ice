package org.github.foxmk.ice

/**
  * Container for logically connected media streams.
  *
  * @author Artyom Artemiev
  */
class MediaStreamGroup {

  def streams: Seq[MediaStream] = ???

  def addStream(mediaStream: MediaStream): Unit = ???

}
