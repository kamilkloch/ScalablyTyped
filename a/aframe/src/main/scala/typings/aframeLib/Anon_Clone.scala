package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clone extends js.Object {
  def clone(uniforms_src: js.Any): js.Any
  def merge(uniforms: js.Array[_]): js.Any
}

object Anon_Clone {
  @scala.inline
  def apply(clone: js.Any => js.Any, merge: js.Array[_] => js.Any): Anon_Clone = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction1(clone), merge = js.Any.fromFunction1(merge))
  
    __obj.asInstanceOf[Anon_Clone]
  }
}

