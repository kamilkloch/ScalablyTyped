package typings
package sammyLib.SammyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Form extends js.Object {
  def formFor(name: java.lang.String, `object`: js.Any, content_callback: js.Function): FormBuilder
}

object Form {
  @scala.inline
  def apply(formFor: (java.lang.String, js.Any, js.Function) => FormBuilder): Form = {
    val __obj = js.Dynamic.literal(formFor = js.Any.fromFunction3(formFor))
  
    __obj.asInstanceOf[Form]
  }
}

