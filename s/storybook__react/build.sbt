organization := "org.scalablytyped"
name := "storybook__react"
version := "4.0-dt-20190213Z-df26a8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-6a3c49",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-80e7e1",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-39ba6e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190419Z-289e02",
  "org.scalablytyped" %%% "std" % "3.4-d6b295")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        