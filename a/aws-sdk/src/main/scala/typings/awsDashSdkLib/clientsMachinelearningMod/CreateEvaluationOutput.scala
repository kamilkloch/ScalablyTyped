package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEvaluationOutput extends js.Object {
  /**
    * The user-supplied ID that uniquely identifies the Evaluation. This value should be identical to the value of the EvaluationId in the request.
    */
  var EvaluationId: js.UndefOr[EntityId] = js.undefined
}

object CreateEvaluationOutput {
  @scala.inline
  def apply(EvaluationId: EntityId = null): CreateEvaluationOutput = {
    val __obj = js.Dynamic.literal()
    if (EvaluationId != null) __obj.updateDynamic("EvaluationId")(EvaluationId)
    __obj.asInstanceOf[CreateEvaluationOutput]
  }
}

