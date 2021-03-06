organization := "org.scalablytyped"
name := "nivo__line"
version := "0.55.0-d8c05f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "nivo__axes" % "0.55.0-c549c8",
  "org.scalablytyped" %%% "nivo__core" % "0.55.0-1bb451",
  "org.scalablytyped" %%% "nivo__legends" % "0.55.0-2d2c10",
  "org.scalablytyped" %%% "nivo__scales" % "0.55.0-439cc2",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-caf3c8",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        