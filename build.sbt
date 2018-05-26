lazy val root = (project in file("."))
  .settings(
    name := "venkat-workshop",
    javacOptions ++= Seq("-source", "1.8", "-target", "1.8"),
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.0.5" % Test,
      "org.scalatest" %% "scalatest" % "3.0.5" % Test,
    )
  )