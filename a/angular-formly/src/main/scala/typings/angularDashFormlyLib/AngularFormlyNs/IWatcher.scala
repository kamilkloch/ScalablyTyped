package typings
package angularDashFormlyLib.AngularFormlyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * An object which has at least two properties called expression and listener. The watch.expression
	 * is added to the formly-form directive's scope (to allow it to run even when hide is true). You
	 * can specify a type ($watchCollection or $watchGroup) via the watcher.type property (defaults to
	 * $watch) and whether you want it to be a deep watch via the watcher.deep property (defaults to false).
	 *
	 * see http://docs.angular-formly.com/docs/field-configuration-object#watcher-objectarray-of-watches
	 */

trait IWatcher extends js.Object {
  var deep: js.UndefOr[scala.Boolean] = js.undefined
   //Defaults to false
  var expression: js.UndefOr[java.lang.String | angularDashFormlyLib.Anon_Field] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  def listener(
    field: java.lang.String,
    newValue: js.Any,
    oldValue: js.Any,
    scope: ITemplateScope,
    stopWatching: js.Function
  ): scala.Unit
}
