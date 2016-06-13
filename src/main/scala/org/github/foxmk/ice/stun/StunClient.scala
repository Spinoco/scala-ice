package org.github.foxmk.ice.stun

import org.github.foxmk.ice.classes.TransportAddress

/**
  * Created by Artyom Artemiev on 08.06.16.
  */
class StunClient {

  def sendMessage(message: Message, to: TransportAddress): Transaction = {

    message match {
      case req: Request => handleRequest(req)
      case ind: Indication => handleIndication(ind)
      case res: Response => handleResponse(res)
    }
  }


}
