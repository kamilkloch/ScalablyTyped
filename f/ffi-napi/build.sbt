organization := "org.scalablytyped"
name := "ffi-napi"
version := "2.4-dt-20190212Z-6a9c23"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "ref-napi" % "1.4-dt-20190322Z-217030",
  "org.scalablytyped" %%% "ref-struct-di" % "1.1-dt-20190322Z-bbb326",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        