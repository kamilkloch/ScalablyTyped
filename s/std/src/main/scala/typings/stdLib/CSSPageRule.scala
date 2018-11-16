package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CSSPageRule extends CSSRule {
  val pseudoClass: java.lang.String
  val selector: java.lang.String
  var selectorText: java.lang.String
  val style: CSSStyleDeclaration
}

@JSGlobal("CSSPageRule")
@js.native
object CSSPageRule
  extends ScalablyTyped.runtime.Instantiable0[CSSPageRule]
