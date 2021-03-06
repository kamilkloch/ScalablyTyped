organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.5.7-8f9744"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-datasource" % "0.3.1-6d1f87",
  "org.scalablytyped" %%% "apollo-engine-reporting" % "1.0.7-8bf2ec",
  "org.scalablytyped" %%% "apollo-engine-reporting-protobuf" % "0.2.1-e2388f",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-b38978",
  "org.scalablytyped" %%% "apollo-server-caching" % "0.3.1-ebac30",
  "org.scalablytyped" %%% "apollo-server-core" % "2.4.8-387578",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-33686b",
  "org.scalablytyped" %%% "apollo-server-errors" % "2.2.1-26be16",
  "org.scalablytyped" %%% "apollo-server-plugin-base" % "0.3.7-87d797",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.5-34afda",
  "org.scalablytyped" %%% "apollographql__graphql-playground-html" % "1.6.6-774fcb",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.1-834517",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-25f524",
  "org.scalablytyped" %%% "graphql-tools" % "4.0.4-acd59f",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "protobufjs" % "6.8.8-090e63",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-df2615",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-5ba073",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-9667a6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        