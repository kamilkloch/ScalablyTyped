organization := "com.scalablytyped"
name := "react-instantsearch"
version := "5.2-dt-20181109Z-119fc9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "csstype" % "2.5.7-8f5757",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20181102Z-3c49da",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181116Z-28281f",
  "com.scalablytyped" %%% "react-instantsearch-core" % "5.2-dt-20181102Z-f6daef",
  "com.scalablytyped" %%% "react-instantsearch-dom" % "5.2-dt-20181109Z-78fc9e",
  "com.scalablytyped" %%% "react-instantsearch-native" % "5.3-dt-20181102Z-907031",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        