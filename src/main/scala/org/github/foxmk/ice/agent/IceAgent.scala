package org.github.foxmk.ice.agent

import org.github.foxmk.ice.MediaStream
import org.github.foxmk.ice.classes.Candidate
import org.github.foxmk.ice.harvest.CandidateHarvester
import org.github.foxmk.ice.sdp.SdpMessage

case class IceState()


abstract class IceAgent {

  private val mediaStreams: Seq[MediaStream] = ???


  def request[F[_]](request: IceRequest): F[Unit] = ???

  def responses[F[_]]: F[IceResponse] = ???



  def processRequest(state: IceState)(request: IceRequest): Unit = request match {
    case IncomingSdpOffer(message) => ???
    case IncomingSdpAnswer(message) => ???
    case CreateStream(name) => ???
    case CandidateFound(candidate) => ???
    case CandidatesPrioritized(candidates) => ???
    case ConnectivityCheckSuccessful() => ???
    case ConnectivityCheckFailed() => ???
  }




  def addHarvester(harvester: CandidateHarvester): Unit = ???

  private def run(): Unit = {
    // Candidate harvest (on creating stream or SDP request)
    // -----------
    // for {
    //   stream <- mediaStreams
    //   component <- stream.component
    //   harvester <- harvesters
    // } harvester.harvest(component)
    //
    // collect (component, Seq[Candidates])

    //
    // manually send SDP message to peer

    // on Stun response:
    // ------------
    // 1) make candidate pair
    // 2) range candidate pairs
    // 3) start checking:
    // for {
    //   pair <- candidatePairs
    // } connectivityCheckClient.check(pair)
    // 4) prioritize
    // 5) response to caller
  }


}





