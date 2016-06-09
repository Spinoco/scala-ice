package org.github.foxmk.ice.stun

/**
  * The <tt>Transport</tt> enumeration contains all currently known transports
  * that ICE may be interacting with (but not necessarily support).
  *
  * @author Artyom Artemiev
  */
object Transport extends Enumeration {
  /**
    * Represents a TCP transport.
    */
  val TCP = Value("tcp")

  /**
    * Represents a UDP transport.
    */
  val UDP = Value("udp")

  /**
    * Represents a TLS transport.
    */
  val TLS = Value("tls")

  /**
    * Represents a datagram TLS (DTLS) transport.
    */
  val DTLS = Value("dtls")

  /**
    * Represents an SCTP transport.
    */
  val SCTP = Value("sctp")

  /**
    * Represents an Google's SSL TCP transport.
    */
  val SSLTCP = Value("ssltcp")
}
