organization := "org.scalablytyped"
name := "dc"
version := "0.0-unknown-dt-20190322Z-6e0d9f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-0e60cb",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-037d61",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        