organization := "org.scalablytyped"
name := "rx-lite-testing"
version := "4.0-dt-20180214Z-c9bcb3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-a6bcd2",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-f95e82",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-1f2229",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        