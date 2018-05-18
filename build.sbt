lazy val root = (project in file("."))
  .settings(
    name := "venkat-workshop",
    javacOptions ++= Seq("-source", "1.8", "-target", "1.8"),
    libraryDependencies ++= Seq(
      "org.junit.platform" % "junit-platform-runner" % "1.2.0" % Test,
      "org.junit.jupiter"  % "junit-jupiter-api"     % "5.2.0" % Test,
      "org.junit.jupiter"  % "junit-jupiter-engine"  % "5.2.0" % Test,
      "com.novocode"       % "junit-interface"       % "0.11"  % Test
    )
  )