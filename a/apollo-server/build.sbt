organization := "org.scalablytyped"
name := "apollo-server"
version := "2.4.8-75bfe9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-b38978",
  "org.scalablytyped" %%% "apollo-server-express" % "2.4.8-82b108",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-2ffec6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-44a2a2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20190425Z-649625",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-f548c5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-a197d0",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-25f524",
  "org.scalablytyped" %%% "graphql-subscriptions" % "1.1.0-93ad4c",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-acd59f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-c951c0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-9667a6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        