package org.github.foxmk.ice

import java.net.SocketAddress
import java.nio.{ FloatBuffer, LongBuffer, _ }

import org.scalatest.FunSuite

/**
  * Created by Artyom Artemiev on 08.06.16.
  */
class IceAgentTest extends FunSuite {

  def createAgent(): IceAgent = {
    val agent = new IceLiteAgent
    agent.start()
    agent
  }

  ignore("IceAgent usage example") {
    // We initialize ICE Agent and all necessary components.
    val agent = createAgent()

    // We want to send video stream to peer, so we create MediaStream with RTP and RTCP components.
    //
    // At this point ICE Agent starts to gather local candidates.
    val videoStream = agent.createMediaStream("videoStream", rtcp = true, rtcpMux = false)

    // We can obtait SDP offer message for MediaStream with required data.
    // Future is completed when all local candidates are harvested.
    // Then we can send this SDP message to peer.
    val sdpMessage = agent.getSdpDescription(videoStream).get()

    // When peer receive SDP offer, it starts to gather own local candidates.
    // Once candidates are harvested, peer sends SDP answer message to caller.

    // When we receive SDP answer we combine local and remote candidates into candidate pairs
    // and start connectivity checking.
    //
    // From Agent point of view candidate pair is holder for remote address, port, transport and connection status.
    // For each pair we check connection, and assign its priority.
    //
    // We can get the handle for the connection with the highest priority from the stream.
    // Future is complete once the acceptable connection is chosen.
    val datagramChannel = videoStream.datagramChannel().get()

    // Now we can send data through channel
    val buffer = ByteBuffer.allocate(100)
    buffer.put("This is a video stream".getBytes)
    datagramChannel.write(buffer)
  }



}
