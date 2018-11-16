package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #############################################################################################
// ECMAScript 7
// Modules: es7.array.includes, es7.string.at, es7.string.pad-start, es7.string.pad-end,
//          es7.object.to-array, es7.object.get-own-property-descriptors, es7.regexp.escape,
//          es7.map.to-json, es7.set.to-json, es7.reflect.define-metadata, es7.reflect.delete-metadata
//          es7.reflect.get-metadata, es7.reflect.get-metadata-keys, es7.reflect.get-own-metadata,
//          es7.reflect.get-own-metadata-keys, es7.reflect.has-metadata, es7.reflect.has-own-metadata
//          es7.reflect.metadata
// #############################################################################################
// #############################################################################################
// Escaping characters - https://github.com/zloirock/core-js/#escaping-characters
// Modules: core.string.escape-html
// #############################################################################################
@js.native
trait String extends js.Object {
  def at(index: scala.Double): java.lang.String = js.native
  /**
       * Non-standard.
       */
  def escapeHTML(): java.lang.String = js.native
  def padEnd(length: scala.Double): java.lang.String = js.native
  def padEnd(length: scala.Double, fillStr: java.lang.String): java.lang.String = js.native
  def padStart(length: scala.Double): java.lang.String = js.native
  def padStart(length: scala.Double, fillStr: java.lang.String): java.lang.String = js.native
  /**
       * Non-standard.
       */
  def unescapeHTML(): java.lang.String = js.native
}
