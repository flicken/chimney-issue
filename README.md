Example regression in chimney library 0.5.0:

Worked previously in 0.4.2:
```
CHIMNEY_VERSION="0.4.2" sbt example/run fails/run
...
Using chimney version 0.4.2
...
[info] running net.flicken.ChimneyExample
Venue(Venue Name)
...
[info] running net.flicken.ChimneyExample
Event(ManuallyFilled(Venue Name))
Venue(Venue Name)
[success] Total time: 1 s, completed Mar 24, 2020, 12:17:12 PM
```

No longer works in 0.5.0:
```
 CHIMNEY_VERSION="0.5.0" sbt example/run fails/run
...
 Using chimney version 0.5.0
...
 [info] running net.flicken.ChimneyExample
 Venue(Venue Name)
 [success] Total time: 3 s, completed Mar 24, 2020, 12:17:52 PM
....
 [error] .../fails/src/main/scala/net/flicken/ChimneyExample.scala:16:35: Chimney can't derive transformation from net.flicken.internal.Venue to net.flicken.dto.Venue
 [error]
 [error] net.flicken.dto.Venue
 [error]   name: java.lang.String - no accessor named name in source type net.flicken.internal.Venue
 [error]
 [error] Consult https://scalalandio.github.io/chimney for usage examples.
 [error]
 [error]     println(venue.into[dto.Venue].transform)
 [error]                                   ^
 [error] one error found
 [error] (fails / Compile / compileIncremental) Compilation failed
 [error] Total time: 0 s, completed Mar 24, 2020, 12:17:52 PM
```
