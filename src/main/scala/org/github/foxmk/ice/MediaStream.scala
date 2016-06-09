package org.github.foxmk.ice

import java.net.DatagramSocket
import java.nio.channels.DatagramChannel
import java.util.concurrent.Future

/**
  * Created by Artyom Artemiev on 08.06.16.
  */
class MediaStream {

  /**
    * Returns handle for obtaining DatagramChannel, when harvesting and checks are finished
    *
    * @return `Future` of java.nio.DatagramChannel
    */
  def datagramChannel(): Future[DatagramChannel] = ???

}
