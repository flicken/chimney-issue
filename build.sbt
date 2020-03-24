scalaVersion in ThisBuild := "2.13.1"

val chimney = "io.scalaland" %% "chimney" % {
val v = sys.env.getOrElse("CHIMNEY_VERSION", "0.4.2")
println(s"Using chimney version $v")
v
 }

lazy val dto = (project in file("dto"))
  .settings(libraryDependencies += chimney)

lazy val example = (project in file("example"))
  .settings(libraryDependencies += chimney)
  .dependsOn(dto)

lazy val fails = (project in file("fails"))
  .settings(libraryDependencies += chimney)
  .dependsOn(dto)

