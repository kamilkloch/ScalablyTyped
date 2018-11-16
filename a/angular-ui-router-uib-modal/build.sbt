organization := "com.scalablytyped"
name := "angular-ui-router-uib-modal"
version := "0.0.11-8ef65f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "angular" % "1.6-dt-20181102Z-a88d5e",
  "com.scalablytyped" %%% "angular-ui-bootstrap" % "0.13.3-dt-20181102Z-f6c4be",
  "com.scalablytyped" %%% "angular-ui-router" % "1.1.38-dt-20181102Z-7e7fbb",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        