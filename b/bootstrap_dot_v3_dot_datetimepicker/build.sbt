organization := "org.scalablytyped"
name := "bootstrap_dot_v3_dot_datetimepicker"
version := "4.17-dt-20190213Z-daddbd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-45cee7",
  "org.scalablytyped" %%% "moment" % "2.24.0-06383d",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-dae54d",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        