package org.github.foxmk.ice.harvest

import org.github.foxmk.ice.classes.Candidate

/**
  * @author Artyom Artemiev
  */
trait CandidateHarvester {
  def harvest(component: Component): Seq[Candidate]
}
