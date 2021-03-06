package typings
package transducersDotJsLib.transducersDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reduced[T] extends js.Object {
  var `@@transducer/reduced`: transducersDotJsLib.transducersDotJsLibNumbers.`true`
  var `@@transducer/value`: T
}

@JSImport("transducers.js", "Reduced")
@js.native
class ReducedCls[T] protected () extends Reduced[T] {
  def this(value: T) = this()
  /* CompleteClass */
  override var `@@transducer/reduced`: transducersDotJsLib.transducersDotJsLibNumbers.`true` = js.native
  /* CompleteClass */
  override var `@@transducer/value`: T = js.native
}

object Reduced {
  @scala.inline
  def apply[T](
    `@@transducer/reduced`: transducersDotJsLib.transducersDotJsLibNumbers.`true`,
    `@@transducer/value`: T
  ): Reduced[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@transducer/reduced")(`@@transducer/reduced`)
    __obj.updateDynamic("@@transducer/value")(`@@transducer/value`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reduced[T]]
  }
}

