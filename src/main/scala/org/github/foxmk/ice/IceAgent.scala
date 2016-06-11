package org.github.foxmk.ice

import java.util.concurrent.Future

import fs2.task.Input.Send
import org.github.foxmk.ice.classes.{ Candidate, SdpMessage }
import org.github.foxmk.ice.harvest.{ CandidateHarvester, Component }

/**
  * Created by Artyom Artemiev on 08.06.16.
  */
abstract class IceAgent {


  private val mediaStreams: Seq[MediaStream] = ???

  def createMediaStream(streamName: String, rtcp: Boolean, rtcpMux: Boolean): MediaStream = {




    ???
  }

  def start(): Unit = {
    // init ICE
  }

  def addHarvester(harvester: CandidateHarvester): Unit = ???

  /**
    * Future is complete once stream has its candidates
    *
    * @return
    */
  def getSdpDescription(mediaStream: MediaStreamGroup): Future[SdpMessage] = ???

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

class IceLiteAgent extends IceAgent {

}

class IceFullAgent extends IceAgent {

}

class HarvestManager {

  val harvesters: Seq[CandidateHarvester] = ???

  def harvest(component: Component): Seq[Candidate] = {
    harvesters.flatMap(_.harvest(component))
  }
}
