package typings
package aqbLib.aqbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLiteral
  extends Expression
     with ScalablyTyped.runtime.Instantiable1[/* value */ js.Any, Expression] {
  var _value: js.Object = js.native
  def toAQL(): java.lang.String = js.native
}
