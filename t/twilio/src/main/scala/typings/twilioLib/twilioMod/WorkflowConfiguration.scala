package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "WorkflowConfiguration")
@js.native
class WorkflowConfiguration ()
  extends twilioLib.twilioMod.twilioNs.WorkflowConfiguration {
   // Defined property mapped to task_routing.
  def this(options: twilioLib.twilioMod.twilioNs.WorkflowConfigurationOptions) = this()
  /* CompleteClass */
  override var taskRouting: twilioLib.twilioMod.twilioNs.TaskRoutingConfiguration = js.native
  /* CompleteClass */
  override var task_routing: twilioLib.twilioMod.twilioNs.TaskRoutingConfiguration = js.native
  /* CompleteClass */
  override def toJSON(): java.lang.String = js.native
}

@JSImport("twilio", "WorkflowConfiguration")
@js.native
object WorkflowConfiguration extends js.Object {
  def fromJSON(json: java.lang.String): twilioLib.twilioMod.twilioNs.WorkflowConfiguration = js.native
}
