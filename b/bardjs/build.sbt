organization := "com.scalablytyped"
name := "bardjs"
version := "0.1.4-dt-20181102Z-e04d25"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "angular" % "1.6-dt-20181102Z-a88d5e",
  "com.scalablytyped" %%% "chai" % "4.1-dt-20181102Z-6ef031",
  "com.scalablytyped" %%% "mocha" % "5.2-dt-20181102Z-a716de",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        