package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateContinuousBackupsInput extends js.Object {
  /**
    * Represents the settings used to enable point in time recovery.
    */
  var PointInTimeRecoverySpecification: awsDashSdkLib.clientsDynamodbMod.PointInTimeRecoverySpecification
  /**
    * The name of the table.
    */
  var TableName: awsDashSdkLib.clientsDynamodbMod.TableName
}

object UpdateContinuousBackupsInput {
  @scala.inline
  def apply(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: TableName): UpdateContinuousBackupsInput = {
    val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification, TableName = TableName)
  
    __obj.asInstanceOf[UpdateContinuousBackupsInput]
  }
}

