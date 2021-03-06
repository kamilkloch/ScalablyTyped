package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskFilter extends js.Object {
  /**
  		 * The task type to return;
  		 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * The task version as used in the tasks.json file.
  		 * The string support the package.json semver notation.
  		 */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object TaskFilter {
  @scala.inline
  def apply(`type`: java.lang.String = null, version: java.lang.String = null): TaskFilter = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[TaskFilter]
  }
}

