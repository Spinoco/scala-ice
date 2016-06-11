package org.github.foxmk.ice.sdp

import org.github.foxmk.ice.MediaStreamGroup
import org.github.foxmk.ice.classes.SdpMessage
import org.github.foxmk.ice.stun.TransportAddress

/**
  * @author Artyom Artemiev
  */
class SdpMessageSender {

  def send(message: SdpMessage, address: TransportAddress): Unit = ???

}

class SdpMessageListener {

  def addHandler(handler: SdpMessage => Unit) = ???

  def start(): Unit = ???

}


class SdpMessageFactory {


  def createSdpMessage(mediaStreamGroup: MediaStreamGroup): SdpMessage = {

  }

}
