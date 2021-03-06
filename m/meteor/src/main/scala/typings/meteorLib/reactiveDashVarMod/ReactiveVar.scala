package typings
package meteorLib.reactiveDashVarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactiveVar[T] extends js.Object {
  def get(): T
  def set(newValue: T): scala.Unit
}

@JSImport("meteor/reactive-var", "ReactiveVar")
@js.native
class ReactiveVarCls[T] protected () extends ReactiveVar[T] {
  def this(initialValue: T) = this()
  def this(initialValue: T, equalsFunc: js.Function) = this()
  /* CompleteClass */
  override def get(): T = js.native
  /* CompleteClass */
  override def set(newValue: T): scala.Unit = js.native
}

object ReactiveVar {
  @scala.inline
  def apply[T](get: () => T, set: T => scala.Unit): ReactiveVar[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[ReactiveVar[T]]
  }
}

