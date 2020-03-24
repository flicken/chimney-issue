package net.flicken

import net.flicken.dto
import net.flicken.internal


object ChimneyExample {

  def main(args: Array[String]): Unit = {
    import io.scalaland.chimney.dsl._

    val event = internal.Event(internal.ManuallyFilled("Venue Name"))
    println(event)

    val venue = event.venue
    println(venue.into[dto.Venue].transform)
  }
}
