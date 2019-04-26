organization := "org.scalablytyped"
name := "angular__router"
version := "7.2.14-12fc72"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "angular__common" % "7.2.14-b7b1e8",
  "org.scalablytyped" %%% "angular__core" % "7.2.14-289592",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-80e7e1",
  "org.scalablytyped" %%% "rxjs" % "6.5.1-4c687f",
  "org.scalablytyped" %%% "std" % "3.4-d6b295")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        