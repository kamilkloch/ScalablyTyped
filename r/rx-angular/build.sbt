organization := "org.scalablytyped"
name := "rx-angular"
version := "0.0-unknown-dt-20190322Z-77bf3c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular" % "1.6-dt-20190206Z-e0d7c8",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-a6bcd2",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-f95e82",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-8a670c",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        