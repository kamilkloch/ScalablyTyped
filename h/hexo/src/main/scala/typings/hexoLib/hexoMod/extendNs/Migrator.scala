package typings
package hexoLib.hexoMod.extendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Migrator extends js.Object {
  def register(
    name: java.lang.String,
    fn: js.Function2[
      /* args */ minimistLib.minimistMod.ParsedArgs, 
      /* fn */ js.Function1[/* err */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit
}

object Migrator {
  @scala.inline
  def apply(
    register: (java.lang.String, js.Function2[
      /* args */ minimistLib.minimistMod.ParsedArgs, 
      /* fn */ js.Function1[/* err */ js.Any, scala.Unit], 
      scala.Unit
    ]) => scala.Unit
  ): Migrator = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction2(register))
  
    __obj.asInstanceOf[Migrator]
  }
}

