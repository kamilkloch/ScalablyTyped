organization := "org.scalablytyped"
name := "material-ui__lab"
version := "3.0.0-alpha.30-db7319"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-61d3d0",
  "org.scalablytyped" %%% "indefinite-observable" % "2.0.1-564613",
  "org.scalablytyped" %%% "jss" % "9.5-dt-20190227Z-d393bc",
  "org.scalablytyped" %%% "material-ui__core" % "3.9.3-2b9c94",
  "org.scalablytyped" %%% "popper_dot_js" % "1.15.0-c232b0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-7e744c",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-caf3c8",
  "org.scalablytyped" %%% "react-transition-group" % "2.9-dt-20190409Z-0aa82b",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        