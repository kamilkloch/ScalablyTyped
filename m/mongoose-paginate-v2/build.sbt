organization := "org.scalablytyped"
name := "mongoose-paginate-v2"
version := "1.0-dt-20190227Z-075652"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-388b34",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190422Z-8769c6",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190426Z-a93439",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        