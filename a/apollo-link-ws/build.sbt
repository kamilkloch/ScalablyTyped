organization := "org.scalablytyped"
name := "apollo-link-ws"
version := "1.0.17-162f70"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-b38978",
  "org.scalablytyped" %%% "eventemitter3" % "3.1.1-834517",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-25f524",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "subscriptions-transport-ws" % "0.9.16-df2615",
  "org.scalablytyped" %%% "ws" % "6.0-dt-20180830Z-5ba073",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-9667a6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        