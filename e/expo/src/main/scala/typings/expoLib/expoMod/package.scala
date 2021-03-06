package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expoMod {
  type Axis = scala.Double
  type BarCodeScannedCallback = js.Function1[/* result */ expoLib.Anon_Data, scala.Unit]
  type HashMap = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Md5 = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - RequireSource
    - expoLib.Anon_Uri
    - Asset
  */
  type PlaybackSource = _PlaybackSource | RequireSource
  type RequireSource = reactDashNativeLib.reactDashNativeMod.ImageRequireSource
  type ResizeModeContain = expoLib.expoLibStrings.contain
  type ResizeModeCover = expoLib.expoLibStrings.cover
  type ResizeModeStretch = expoLib.expoLibStrings.stretch
  type StringHashMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type URISource = reactDashNativeLib.reactDashNativeMod.ImageURISource
}
