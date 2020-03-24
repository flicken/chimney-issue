package net.flicken

object internal {
  case class Event(venue: Venue)

  sealed trait Venue {
    def name: String
  }

  case class ManuallyFilled(name: String) extends Venue
}

object dto {
 case class Event(venue: Venue)
 case class Venue(name: String)
}
