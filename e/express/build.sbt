organization := "org.scalablytyped"
name := "express"
version := "4.16-dt-20190122Z-c9c559"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-32e57d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-565405",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190423Z-de8f34",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-84f722",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-80e7e1",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b4ef5a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-015958",
  "org.scalablytyped" %%% "std" % "3.4-d6b295")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        