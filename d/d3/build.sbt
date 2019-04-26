organization := "org.scalablytyped"
name := "d3"
version := "5.7-dt-20190212Z-7891c7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-8136a9",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-58cadd",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-166597",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-a290f8",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-5e1a96",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-1042c5",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-758c60",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-002f7a",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-c04af0",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-5d380f",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-c9b6cd",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-803952",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-e80b9f",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-f319d6",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-7865e6",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-0eff76",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-da6196",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-06605a",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-b5fdd6",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-293a1d",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-2d560d",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-4c5acf",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-e9be3d",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-5c871a",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-b7698f",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-332ea4",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-719a87",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-e84473",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-3471f3",
  "org.scalablytyped" %%% "std" % "3.4-d6b295")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        