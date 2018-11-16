organization := "com.scalablytyped"
name := "asyncblock"
version := "2.2.12-b5618d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "asyncblock-generators" % "2.2.12-f5e642",
  "com.scalablytyped" %%% "esprima" % "4.0-dt-20181102Z-16e295",
  "com.scalablytyped" %%% "estree" % "0.0-unknown-dt-20181102Z-983838",
  "com.scalablytyped" %%% "fibers" % "0.0-unknown-dt-20181102Z-5d8bf4",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        