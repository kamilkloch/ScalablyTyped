organization := "org.scalablytyped"
name := "samchon"
version := "2.1.4-b3db8c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ecol" % "1.0.4-a12ef2",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "sxml" % "1.0.3-fc48a6",
  "org.scalablytyped" %%% "tstl" % "2.1.2-c1082d",
  "org.scalablytyped" %%% "url-variables" % "1.0.2-373b7c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        