organization := "com.scalablytyped"
name := "chai-http"
version := "3.0-dt-20181102Z-b50bd8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "chai" % "4.1-dt-20181102Z-6ef031",
  "com.scalablytyped" %%% "cookiejar" % "2.1-dt-20181102Z-16aaa7",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "superagent" % "3.8-dt-20181102Z-03f2d9",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        