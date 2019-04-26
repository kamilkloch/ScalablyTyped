organization := "org.scalablytyped"
name := "material-ui__core"
version := "3.9.3-bb728a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-6a3c49",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-564613",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-9aa05a",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-cd973b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-39ba6e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190419Z-289e02",
  "org.scalablytyped" %%% "react-transition-group" % "2.9-dt-20190409Z-028a8d",
  "org.scalablytyped" %%% "std" % "3.4-d6b295")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        