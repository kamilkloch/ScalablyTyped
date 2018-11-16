package typings
package webpackLib.webpackMod.webpackNs.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SplitChunksOptions extends js.Object {
  /** Assign modules to a cache group (modules from different cache groups are tried to keep in separate chunks) */
  var cacheGroups: js.UndefOr[
    webpackLib.webpackLibNumbers.`false` | java.lang.String | (js.Function1[/* repeated */js.Any, _]) | stdLib.RegExp | (ScalablyTyped.runtime.StringDictionary[CacheGroupsOptions | webpackLib.webpackLibNumbers.`false`])
  ] = js.undefined
  /** Select chunks for determining shared modules (defaults to \"async\", \"initial\" and \"all\" requires adding these chunks to the HTML) */
  var chunks: js.UndefOr[
    webpackLib.webpackLibStrings.initial | webpackLib.webpackLibStrings.async | webpackLib.webpackLibStrings.all | (js.Function1[/* chunk */ webpackLib.webpackMod.webpackNs.compilationNs.Chunk, scala.Boolean])
  ] = js.undefined
  /** Maximum number of requests which are accepted for on-demand loading */
  var maxAsyncRequests: js.UndefOr[scala.Double] = js.undefined
  /** Maximum number of initial chunks which are accepted for an entry point */
  var maxInitialRequests: js.UndefOr[scala.Double] = js.undefined
  /** Maximum size for the created chunk */
  var maxSize: js.UndefOr[scala.Double] = js.undefined
  /** Minimum number of times a module has to be duplicated until it's considered for splitting */
  var minChunks: js.UndefOr[scala.Double] = js.undefined
  /** Minimal size for the created chunk */
  var minSize: js.UndefOr[scala.Double] = js.undefined
  /** Give chunks created a name (chunks with equal name are merged) */
  var name: js.UndefOr[scala.Boolean | java.lang.String | (js.Function1[/* repeated */js.Any, _])] = js.undefined
}
