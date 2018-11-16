package typings
package zapierDashPlatformDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Scope[InputData] extends js.Object {
  var authorizeUrl: java.lang.String | (js.Function2[
    /* z */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.Z, 
    /* bundle */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthorizeUrlBundle[InputData], 
    java.lang.String | stdLib.Promise[java.lang.String]
  ]) | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpRequestOptions
  var autoRefresh: scala.Boolean
  var getAccessToken: (js.Function2[
    /* z */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.Z, 
    /* bundle */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.GetAccessTokenBundle[InputData], 
    zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthData | stdLib.Promise[zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthData]
  ]) | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpRequestOptions
  var refreshAccessToken: js.UndefOr[
    (js.Function2[
      /* z */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.Z, 
      /* bundle */ zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.RefreshAccessTokenBundle[InputData], 
      zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthData | stdLib.Promise[zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.AuthData]
    ]) | zapierDashPlatformDashCoreLib.zapierDashPlatformDashCoreMod.HttpRequestOptions
  ] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
}
