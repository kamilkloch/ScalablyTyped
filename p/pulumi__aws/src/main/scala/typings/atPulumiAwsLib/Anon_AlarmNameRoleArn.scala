package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlarmNameRoleArn extends js.Object {
  var alarmName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var stateReason: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var stateValue: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_AlarmNameRoleArn {
  @scala.inline
  def apply(
    alarmName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    stateReason: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    stateValue: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_AlarmNameRoleArn = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], stateReason = stateReason.asInstanceOf[js.Any], stateValue = stateValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AlarmNameRoleArn]
  }
}

