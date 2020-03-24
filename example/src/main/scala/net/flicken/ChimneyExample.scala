package net.flicken

import net.flicken.dto
import net.flicken.internal

object ChimneyExample {

  def main(args: Array[String]): Unit = {
    import io.scalaland.chimney.dsl._

    val venue = internal.ManuallyFilled("Venue Name")

    println(venue.into[dto.Venue].transform)
  }
}
