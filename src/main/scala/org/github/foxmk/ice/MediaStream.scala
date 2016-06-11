package org.github.foxmk.ice

import java.net.DatagramSocket
import java.nio.channels.DatagramChannel
import java.util.concurrent.Future

import org.github.foxmk.ice.harvest.Component

/**
  * @author Artyom Artemiev
  */
class MediaStream {

  /**
    * Returns handle for obtaining DatagramChannel, when harvesting and checks are finished
    *
    * @return `Future` of java.nio.DatagramChannel
    */
  def datagramChannel(): Future[DatagramChannel] = ???

  def components: Seq[Component] = ???

  def checkList: Option[CheckList] = ???


}

abstract class MediaStreamState

/*

Media stream lifecycle

1. Created
2. Gathering local/remote candidates
3. Calculating foundations
4. Prioritizing
5. Finish init

6. Waiting to peer's answer

7. Making candidate pairs
8. Pruning/prioritizing candidates
9. Starting checks

 */
