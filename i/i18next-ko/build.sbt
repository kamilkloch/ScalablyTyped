organization := "org.scalablytyped"
name := "i18next-ko"
version := "3.0-dt-20181017Z-0d8c19"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "i18next" % "12.1-dt-20181126Z-aaef30",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190415Z-78a449",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        