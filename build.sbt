scalaVersion := "2.12.7"

crossScalaVersions := Seq("2.11.12", "2.12.7")

scalacOptions ++= Seq("-feature", "-deprecation", "-Ywarn-unused-import" /*, "-Xlog-implicits"*/ )

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

addCompilerPlugin("org.spire-math" % "kind-projector" % "0.9.6" cross CrossVersion.binary)

lazy val core   = (project in file("./core"))
lazy val mapper = (project in file("./mapper"))

lazy val asuna = (project in file(".")).dependsOn(core).aggregate(core).dependsOn(mapper).aggregate(mapper)

lazy val template = (project in file("./template"))

scalafmtOnCompile := false
