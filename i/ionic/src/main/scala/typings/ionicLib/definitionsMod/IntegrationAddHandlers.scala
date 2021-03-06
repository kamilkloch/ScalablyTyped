package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegrationAddHandlers extends js.Object {
  var conflictHandler: js.UndefOr[
    js.Function2[/* f */ java.lang.String, /* stats */ nodeLib.fsMod.Stats, js.Promise[scala.Boolean]]
  ] = js.undefined
  var onFileCreate: js.UndefOr[js.Function1[/* f */ java.lang.String, scala.Unit]] = js.undefined
}

object IntegrationAddHandlers {
  @scala.inline
  def apply(
    conflictHandler: (/* f */ java.lang.String, /* stats */ nodeLib.fsMod.Stats) => js.Promise[scala.Boolean] = null,
    onFileCreate: /* f */ java.lang.String => scala.Unit = null
  ): IntegrationAddHandlers = {
    val __obj = js.Dynamic.literal()
    if (conflictHandler != null) __obj.updateDynamic("conflictHandler")(js.Any.fromFunction2(conflictHandler))
    if (onFileCreate != null) __obj.updateDynamic("onFileCreate")(js.Any.fromFunction1(onFileCreate))
    __obj.asInstanceOf[IntegrationAddHandlers]
  }
}

