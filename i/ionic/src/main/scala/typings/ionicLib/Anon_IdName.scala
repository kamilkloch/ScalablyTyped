package typings
package ionicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdName extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var `type`: ionicLib.definitionsMod.ProjectType
}

object Anon_IdName {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, `type`: ionicLib.definitionsMod.ProjectType): Anon_IdName = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_IdName]
  }
}

