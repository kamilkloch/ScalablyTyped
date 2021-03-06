organization := "org.scalablytyped"
name := "hapi__catbox-redis"
version := "5.0-dt-20190425Z-32bded"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190404Z-9ac4a8",
  "org.scalablytyped" %%% "ioredis" % "4.0-dt-20190311Z-31c328",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        