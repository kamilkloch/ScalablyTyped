organization := "org.scalablytyped"
name := "feathersjs__authentication-oauth2"
version := "1.0-dt-20180416Z-748dd2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e9bff8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-014b69",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-fc1b93",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-eee1c1",
  "org.scalablytyped" %%% "feathersjs__feathers" % "3.1-dt-20181204Z-37b62b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a57469",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-f9c9b0",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        