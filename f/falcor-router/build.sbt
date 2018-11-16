organization := "com.scalablytyped"
name := "falcor-router"
version := "0.4.0-dt-20181102Z-fada08"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "falcor" % "0.1-dt-20181102Z-4561a5",
  "com.scalablytyped" %%% "falcor-http-datasource" % "0.1.3-dt-20181102Z-0a601b",
  "com.scalablytyped" %%% "falcor-json-graph" % "1.1.7-dt-20181102Z-d92a36",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        