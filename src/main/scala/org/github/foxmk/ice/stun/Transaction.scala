package org.github.foxmk.ice.stun

/**
  * Created by Artyom Artemiev on 08.06.16.
  */

case class TransactionId()

abstract class Transaction {

  def id: TransactionId

}

case class ServerTransaction() extends Transaction {
  override def id: TransactionId = ???
}

case class ClientTransaction() extends Transaction {
  override def id: TransactionId = ???
}
