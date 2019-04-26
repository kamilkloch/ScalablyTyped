organization := "org.scalablytyped"
name := "express-serve-static-core"
version := "4.16-dt-20190423Z-de8f34"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-80e7e1",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b4ef5a",
  "org.scalablytyped" %%% "std" % "3.4-d6b295")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        