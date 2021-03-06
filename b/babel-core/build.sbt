organization := "org.scalablytyped"
name := "babel-core"
version := "6.25-dt-20190212Z-fb35e6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "babel-generator" % "6.25-dt-20190212Z-3419f6",
  "org.scalablytyped" %%% "babel-template" % "6.25-dt-20190212Z-311017",
  "org.scalablytyped" %%% "babel-traverse" % "6.25-dt-20190212Z-6bfd56",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20190424Z-5b73dd",
  "org.scalablytyped" %%% "babylon" % "6.16-dt-20190212Z-a6dbee",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        