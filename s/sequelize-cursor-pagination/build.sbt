organization := "org.scalablytyped"
name := "sequelize-cursor-pagination"
version := "1.2-dt-20181019Z-97653e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-e9bc8b",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20181219Z-c46161",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-ea402e",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "sequelize" % "4.27.11-dt-20190412Z-cc551f",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "validator" % "v10.11.0-dt-20190329Z-da95e8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        