organization := "com.scalablytyped"
name := "constant-case"
version := "2.0.0-44bd54"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "lower-case" % "1.1.4-7a65c7",
  "com.scalablytyped" %%% "no-case" % "2.3.2-aaaa3f",
  "com.scalablytyped" %%% "snake-case" % "2.1.0-4329f7",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "upper-case" % "1.1.3-7482b2",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        