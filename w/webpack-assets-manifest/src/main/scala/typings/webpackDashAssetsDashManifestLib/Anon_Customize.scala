package typings
package webpackDashAssetsDashManifestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Customize extends js.Object {
  var afterOptions: tapableLib.tapableMod.SyncHook[
    webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifestNs.Options, 
    _, 
    _
  ]
  @JSName("apply")
  var apply: tapableLib.tapableMod.SyncHook[
    webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifest, 
    _, 
    _
  ]
  /**
  		 * The `SyncWaterfallHook` class supports 3 type parameters only but this hook actually has 4 parameters. The type of 4th parameter is `AnyObject`.
  		 *
  		 * Refer to https://github.com/webdeveric/webpack-assets-manifest#hooks for details
  		 */
  var customize: tapableLib.tapableMod.SyncWaterfallHook[
    webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifestNs.Entry, 
    webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifestNs.AnyObject, 
    webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifest
  ]
  var done: tapableLib.tapableMod.SyncHook[
    webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifest, 
    webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifestNs.AnyObject, 
    _
  ]
  var options: tapableLib.tapableMod.SyncWaterfallHook[
    webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifestNs.Options, 
    _, 
    _
  ]
  var transform: tapableLib.tapableMod.SyncWaterfallHook[
    webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifestNs.AnyObject, 
    webpackDashAssetsDashManifestLib.webpackDashAssetsDashManifestMod.WebpackAssetsManifest, 
    _
  ]
}
