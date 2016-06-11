package org.github.foxmk.ice.classes

import com.sun.javaws.progress.Progress

/**
  * @author Artyom Artemiev
  */
case class CandidatePair(local: Candidate, remote: Candidate) {
  def setState(state: CandidatePairState.Value)

}


object CandidatePairState extends Enumeration {

  /**
    * This pair can only be checked after being put in the waiting state. To enter the waiting state some other check must succeed first.
    */
  val Frozen = Value("frozen")

  /**
    * As soon as this is the highest priority pair in the check list a check will be performed.
    */
  val Waiting = Value("waiting")

  /**
    * A check has been sent for this pair and the transaction is in progress
    */
  val InProgress = Value("in-progress")

  /**
    * Successful result from pair check.
    */
  val Succeeded = Value("succeeded")

  /**
    * Failed result from pair check.
    */
  val Failed = Value("failed")

}
