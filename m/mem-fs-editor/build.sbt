organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-29440e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-83e603",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e5f5fa",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-1dec11",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-57138d",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-93d7c4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        