organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20190313Z-1ecc94"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-021bff",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-63c277",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-306a6e",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-3b3ab5",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-b0b70f",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        