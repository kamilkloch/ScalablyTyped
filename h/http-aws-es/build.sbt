organization := "com.scalablytyped"
name := "http-aws-es"
version := "1.1-dt-20181102Z-71051b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "aws-sdk" % "2.348.0-513528",
  "com.scalablytyped" %%% "elasticsearch" % "5.0-dt-20181102Z-644835",
  "com.scalablytyped" %%% "events" % "1.2-dt-20181102Z-6596f0",
  "com.scalablytyped" %%% "jmespath" % "0.15-dt-20181102Z-21d4cc",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "sax" % "1.x-dt-20181102Z-e57b8b",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "uuid" % "3.4-dt-20181102Z-8308dc",
  "com.scalablytyped" %%% "xml2js" % "0.4-dt-20181102Z-5b99b7",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        