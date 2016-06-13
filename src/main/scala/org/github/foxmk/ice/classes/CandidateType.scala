package org.github.foxmk.ice.classes

/**
  * According to the ICE specification, Candidates have a type property which
  * makes them server reflexive, peer reflexive, relayed or host).
  *
  * Class is taken from ice4j (https://github.com/jitsi/ice4j)
  *
  * @author Emil Ivov
  */
object CandidateType extends Enumeration {
  /**
    * Peer Reflexive Candidate: A candidate whose IP address and port are
    * a binding allocated by a NAT for an agent when it sent a STUN
    * Binding Request through the NAT to its peer.
    */
  val PeerReflexiveCandidate = Value("prflx")

  /**
    * A Server Reflexive Candidate is a candidate whose IP address and port
    * are a binding allocated by a NAT for an agent when it sent a
    * packet through the NAT to a server. Server reflexive candidates
    * can be learned by STUN servers using the Binding Request, or TURN
    * servers, which provides both a Relayed and Server Reflexive
    * candidate.
    */
  val ServerReflexiveCandidate = Value("srflx")

  /**
    * A Relayed Candidate is a candidate obtained by sending a TURN Allocate
    * request from a host candidate to a TURN server. The relayed candidate is
    * resident on the TURN server, and the TURN server relays packets back
    * towards the agent.
    */
  val RelayedCandidate = Value("relay")

  /**
    * A candidate obtained by binding to a specific port
    * from an interface on the host. This includes both physical
    * interfaces and logical ones, such as ones obtained through Virtual
    * Private Networks (VPNs) and Realm Specific IP (RSIP) [RFC3102]
    * (which lives at the operating system level).
    */
  val HostCandidate = Value("host")

  /**
    * A candidate obtained by binding to a specific port
    * from an interface on the host. This includes both physical
    * interfaces and logical ones, such as ones obtained through Virtual
    * Private Networks (VPNs) and Realm Specific IP (RSIP) [RFC3102]
    * (which lives at the operating system level). This is the old name for
    * "host".
    */
  val LocalCandidate = Value("local")

  /**
    * A Server Reflexive Candidate is a candidate whose IP address and port
    * are a binding allocated by a NAT for an agent when it sent a
    * packet through the NAT to a server. Server reflexive candidates
    * can be learned by STUN servers using the Binding Request, or TURN
    * servers, which provides both a Relayed and Server Reflexive
    * candidate. This is the old name for "srflx".
    */
  val StunCandidate = Value("stun")
}
