organization := "org.scalablytyped"
name := "topojson"
version := "3.2-dt-20190326Z-08075f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-72e3ef",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "topojson-client" % "3.0-dt-20180414Z-cdf2ba",
  "org.scalablytyped" %%% "topojson-simplify" % "3.0-dt-20180414Z-43b7c0",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-c36641")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        