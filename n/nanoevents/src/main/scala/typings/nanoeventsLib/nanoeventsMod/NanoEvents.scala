package typings
package nanoeventsLib.nanoeventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NanoEvents[T /* <: js.Object */] extends js.Object {
  def emit[U /* <: java.lang.String */](name: U, value: /* import warning: ImportType.apply Failed type conversion: T[U] */ js.Any): scala.Unit
  def on[U /* <: java.lang.String */](
    name: U,
    callBack: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[U] */ /* arg */ js.Any, 
      _
    ]
  ): js.Function0[scala.Unit]
}

object NanoEvents {
  @scala.inline
  def apply[T /* <: js.Object */](
    emit: (js.Any, /* import warning: ImportType.apply Failed type conversion: T[U] */ js.Any) => scala.Unit,
    on: (js.Any, js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[U] */ /* arg */ js.Any, 
      _
    ]) => js.Function0[scala.Unit]
  ): NanoEvents[T] = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[NanoEvents[T]]
  }
}

