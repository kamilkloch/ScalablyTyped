package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueObject extends js.Object {
  /**
    * True if this and the other Collection have value equality, as defined
    * by `Immutable.is()`.
    *
    * Note: This is equivalent to `Immutable.is(this, other)`, but provided to
    * allow for chained expressions.
    */
  def equals(other: js.Any): scala.Boolean
}

object ValueObject {
  @scala.inline
  def apply(equals: js.Any => scala.Boolean, hashCode: () => scala.Double): ValueObject = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), hashCode = js.Any.fromFunction0(hashCode))
  
    __obj.asInstanceOf[ValueObject]
  }
}

