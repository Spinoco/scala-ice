package org.github.foxmk.ice.stun

import java.util.logging.Level

import com.typesafe.scalalogging.LazyLogging
/**
  * Created by Artyom Artemiev on 08.06.16.
  */
class StunServer extends LazyLogging {

  private def transactionManager: TransactionManager = ???

  def handleMessage(message: StunMessage): Unit = {
    //logger.debug("Received a message on " + ev.getLocalAddress + " of type:" + msg.getMessageType.toInt)

    message match {
      case req: Request => handleRequest(req)
      case ind: Indication => handleIndication(ind)
      case res: Response => handleResponse(res)
    }
  }

  private def handleRequest(request: Request): Unit = {
    transactionManager.createTransaction()
    // get or create transaction
    // if new => send request
    // if existing => retransmit response
  }

  private def handleResponse(response: Response): Unit = {
    val tid: TransactionId = TransactionId
    val tran: StunClientTransaction = transactionManager.removeTransaction(tid).asInstanceOf[StunClientTransaction]
    if (tran != null) {
      tran.handleResponse(ev)
    }
    else {
      logger.fine("Dropped response - no matching client tran found for" + " tid " + tid + "\n" + "all tids in stock were " + transactionManager.transactionIds)
    }
  }

  private def handleIndication(indication: Indication): Unit = {
    eventDispatcher.fireMessageEvent(ev)
  }
}
