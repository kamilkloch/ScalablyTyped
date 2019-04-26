organization := "org.scalablytyped"
name := "react-redux-facade"
version := "201904211043-c1d18b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-6a3c49",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-5ba316",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-39ba6e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190419Z-289e02",
  "org.scalablytyped" %%% "react-redux" % "7.0-dt-20190419Z-0c84ef",
  "org.scalablytyped" %%% "redux" % "4.0.1-0d7c9d",
  "org.scalablytyped" %%% "std" % "3.4-d6b295")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        