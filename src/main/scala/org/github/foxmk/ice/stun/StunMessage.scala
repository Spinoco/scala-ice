package org.github.foxmk.ice.stun

/**
  * Created by Artyom Artemiev on 08.06.16.
  */
abstract class StunMessage {

}

case class Request() extends StunMessage
case class Indication() extends StunMessage
case class Response() extends StunMessage
