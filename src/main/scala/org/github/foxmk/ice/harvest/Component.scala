package org.github.foxmk.ice.harvest

import org.github.foxmk.ice.MediaStream
import org.github.foxmk.ice.classes.Candidate

/**
  * @author Artyom Artemiev
  */
class Component(val mediaStream: MediaStream) {

  def componentId: Int = ???

  def localCandidates: Seq[Candidate] = ???

}
