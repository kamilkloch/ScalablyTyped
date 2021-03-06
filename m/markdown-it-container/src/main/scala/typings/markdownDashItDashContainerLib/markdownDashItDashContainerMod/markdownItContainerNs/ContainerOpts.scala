package typings
package markdownDashItDashContainerLib.markdownDashItDashContainerMod.markdownItContainerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerOpts extends js.Object {
  var marker: js.UndefOr[java.lang.String] = js.undefined
  var render: js.UndefOr[
    js.Function5[
      /* tokens */ js.Array[markdownDashItLib.libTokenMod.^], 
      /* index */ scala.Double, 
      /* options */ js.Any, 
      /* env */ js.Any, 
      /* self */ markdownDashItLib.libRendererMod.^, 
      scala.Unit
    ]
  ] = js.undefined
  var validate: js.UndefOr[js.Function1[/* params */ java.lang.String, scala.Boolean]] = js.undefined
}

object ContainerOpts {
  @scala.inline
  def apply(
    marker: java.lang.String = null,
    render: (/* tokens */ js.Array[markdownDashItLib.libTokenMod.^], /* index */ scala.Double, /* options */ js.Any, /* env */ js.Any, /* self */ markdownDashItLib.libRendererMod.^) => scala.Unit = null,
    validate: /* params */ java.lang.String => scala.Boolean = null
  ): ContainerOpts = {
    val __obj = js.Dynamic.literal()
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction5(render))
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction1(validate))
    __obj.asInstanceOf[ContainerOpts]
  }
}

