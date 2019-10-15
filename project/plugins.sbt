addSbtPlugin("org.scalameta"     % "sbt-scalafmt"  % "2.0.1")
addSbtPlugin("org.scoverage"     % "sbt-scoverage" % "1.6.0")
addSbtPlugin("org.foundweekends" % "sbt-bintray"   % "0.5.4")
addSbtPlugin("com.github.gseitz" % "sbt-release"   % "1.0.9")
addSbtPlugin("com.typesafe.sbt"  % "sbt-twirl"     % "1.4.2")

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value
libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value