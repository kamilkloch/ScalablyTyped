organization := "com.scalablytyped"
name := "pascal-case"
version := "2.0.1-60ea5b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "camel-case" % "3.0.0-a2fdbe",
  "com.scalablytyped" %%% "lower-case" % "1.1.4-7a65c7",
  "com.scalablytyped" %%% "no-case" % "2.3.2-aaaa3f",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "upper-case" % "1.1.3-7482b2",
  "com.scalablytyped" %%% "upper-case-first" % "1.1.2-6f6a0d",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        