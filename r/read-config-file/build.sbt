organization := "org.scalablytyped"
name := "read-config-file"
version := "3.2.2-721a5f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ajv" % "6.10.0-6800d8",
  "org.scalablytyped" %%% "dotenv" % "6.1-dt-20190329Z-2df7a6",
  "org.scalablytyped" %%% "lazy-val" % "1.0.4-63a268",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        