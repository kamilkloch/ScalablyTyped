organization := "org.scalablytyped"
name := "google-cloud__storage"
version := "2.5.0-1b4d72"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-37ce53",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-e3c2b3",
  "org.scalablytyped" %%% "gaxios" % "1.8.3-1f6746",
  "org.scalablytyped" %%% "google-auth-library" % "3.1.2-50d40e",
  "org.scalablytyped" %%% "google-cloud__common" % "0.32.0-eda3ce",
  "org.scalablytyped" %%% "gtoken" % "2.3.3-edaf46",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190412Z-78185a",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-36601b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        