package typings
package toDashMarkdownLib.toDashMarkdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Converter extends js.Object {
  var filter: Filter
  def replacement(innerHTML: java.lang.String, node: stdLib.HTMLElement): java.lang.String
}

object Converter {
  @scala.inline
  def apply(filter: Filter, replacement: (java.lang.String, stdLib.HTMLElement) => java.lang.String): Converter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], replacement = js.Any.fromFunction2(replacement))
  
    __obj.asInstanceOf[Converter]
  }
}

