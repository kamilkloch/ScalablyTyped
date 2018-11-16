package typings
package rollupLib.rollupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PluginContext extends js.Object {
  var cache: PluginCache = js.native
  @JSName("isExternal")
  var isExternal_Original: IsExternal = js.native
  var meta: PluginContextMeta = js.native
  @JSName("resolveId")
  var resolveId_Original: ResolveIdHook = js.native
  // TODO deprecate:
  var watcher: Watcher = js.native
  def addWatchFile(id: java.lang.String): scala.Unit = js.native
  def emitAsset(name: java.lang.String): java.lang.String = js.native
  def emitAsset(name: java.lang.String, source: java.lang.String): java.lang.String = js.native
  def emitAsset(name: java.lang.String, source: nodeLib.Buffer): java.lang.String = js.native
  def error(err: java.lang.String): scala.Unit = js.native
  def error(err: java.lang.String, pos: rollupLib.Anon_Column): scala.Unit = js.native
  def error(err: RollupError): scala.Unit = js.native
  def error(err: RollupError, pos: rollupLib.Anon_Column): scala.Unit = js.native
  def getAssetFileName(assetId: java.lang.String): java.lang.String = js.native
  def isExternal(id: java.lang.String, parentId: java.lang.String, isResolved: scala.Boolean): scala.Boolean | scala.Unit = js.native
  def parse(input: java.lang.String, options: js.Any): estreeLib.estreeMod.Program = js.native
  def resolveId(`this`: PluginContext, id: java.lang.String, parent: java.lang.String): (stdLib.Promise[java.lang.String | scala.Boolean | scala.Unit | scala.Null]) | java.lang.String | scala.Boolean | scala.Unit | scala.Null = js.native
  def setAssetSource(assetId: java.lang.String, source: java.lang.String): scala.Unit = js.native
  def setAssetSource(assetId: java.lang.String, source: nodeLib.Buffer): scala.Unit = js.native
  def warn(warning: java.lang.String): scala.Unit = js.native
  def warn(warning: java.lang.String, pos: rollupLib.Anon_Column): scala.Unit = js.native
  def warn(warning: RollupWarning): scala.Unit = js.native
  def warn(warning: RollupWarning, pos: rollupLib.Anon_Column): scala.Unit = js.native
}
