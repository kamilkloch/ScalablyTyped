organization := "com.scalablytyped"
name := "koa-logger-winston"
version := "0.0-dt-20181102Z-cac7aa"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "accepts" % "1.3-dt-20181102Z-7a5c11",
  "com.scalablytyped" %%% "async" % "2.0.1-dt-20181102Z-7ddc02",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20181102Z-5991c4",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20181102Z-210269",
  "com.scalablytyped" %%% "cookies" % "0.7-dt-20181102Z-3fb174",
  "com.scalablytyped" %%% "express" % "4.16-dt-20181102Z-d3111c",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20181102Z-8da2fa",
  "com.scalablytyped" %%% "http-assert" % "1.3-dt-20181102Z-44a725",
  "com.scalablytyped" %%% "is-stream" % "1.1-dt-20181102Z-13af04",
  "com.scalablytyped" %%% "keygrip" % "1.0-dt-20181102Z-d4622f",
  "com.scalablytyped" %%% "koa" % "2.x-dt-20181102Z-d783af",
  "com.scalablytyped" %%% "koa-compose" % "3.2-dt-20181102Z-9b7173",
  "com.scalablytyped" %%% "logform" % "1.2-dt-20181102Z-26421a",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20181102Z-16ee55",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20181102Z-399813",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20181102Z-c1072c",
  "com.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20181102Z-ffe6d2",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "triple-beam" % "1.3-dt-20181102Z-ce1d40",
  "com.scalablytyped" %%% "winston" % "3.1.0-d04355",
  "com.scalablytyped" %%% "winston-transport" % "4.2.0-77e5cb",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        