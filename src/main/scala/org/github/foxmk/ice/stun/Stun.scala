package org.github.foxmk.ice.stun

/**
  * @author Artyom Artemiev
  */
class Stun {

  /**
    * Subscribe for incoming STUN messages
    *
    * @param messageHandler
    */
  def subscribe(messageHandler: Message => Unit): Unit = ???

  /**
    * Send STUN message
    *
    * @param message
    */
  def send(message: Message): Unit = ???



}
