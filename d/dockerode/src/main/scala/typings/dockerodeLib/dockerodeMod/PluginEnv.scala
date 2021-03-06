package typings
package dockerodeLib.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginEnv extends js.Object {
  var Description: java.lang.String
  var Name: java.lang.String
  var Settable: js.Array[java.lang.String]
  var Value: java.lang.String
}

object PluginEnv {
  @scala.inline
  def apply(
    Description: java.lang.String,
    Name: java.lang.String,
    Settable: js.Array[java.lang.String],
    Value: java.lang.String
  ): PluginEnv = {
    val __obj = js.Dynamic.literal(Description = Description, Name = Name, Settable = Settable, Value = Value)
  
    __obj.asInstanceOf[PluginEnv]
  }
}

