package typings
package exorcistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("exorcist", JSImport.Namespace)
@js.native
object exorcistMod extends js.Object {
  /** Externalizes the source map found inside a stream to an external .map file.
    * Works with both JavaScript and CSS input streams
    * @param file full path to the map file to which to write the extracted source map
    * @param [url] full URL to the map file, set as sourceMappingURL in the streaming output (default: file)
    * @param [root] root URL for loading relative source paths, set as sourceRoot in the source map (default: "")
    * @param [base] base path for calculating relative source paths (default: use absolute paths)
    * @param [errorOnMissing] when truthy, causes 'error' to be emitted instead of 'missing-map' if no map was found in the stream (default: falsey)
    */
  def apply(file: java.lang.String): throughLib.throughMod.ThroughStream = js.native
  def apply(file: java.lang.String, url: java.lang.String): throughLib.throughMod.ThroughStream = js.native
  def apply(file: java.lang.String, url: java.lang.String, root: java.lang.String): throughLib.throughMod.ThroughStream = js.native
  def apply(file: java.lang.String, url: java.lang.String, root: java.lang.String, base: java.lang.String): throughLib.throughMod.ThroughStream = js.native
  def apply(
    file: java.lang.String,
    url: java.lang.String,
    root: java.lang.String,
    base: java.lang.String,
    errorOnMissing: scala.Boolean
  ): throughLib.throughMod.ThroughStream = js.native
}

