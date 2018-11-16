organization := "com.scalablytyped"
name := "mongoose-mock"
version := "0.4.0-dt-20181102Z-9cbf01"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bson" % "1.0.6-dt-20181102Z-f13572",
  "com.scalablytyped" %%% "mongodb" % "v3.1-dt-20181102Z-036bcc",
  "com.scalablytyped" %%% "mongoose" % "5.3.4-dt-20181109Z-6d074f",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        