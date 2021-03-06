package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSchemaResponse extends js.Object {
  /**
    * The input ARN that is returned as part of the response. For more information, see arns.
    */
  var SchemaArn: js.UndefOr[Arn] = js.undefined
}

object DeleteSchemaResponse {
  @scala.inline
  def apply(SchemaArn: Arn = null): DeleteSchemaResponse = {
    val __obj = js.Dynamic.literal()
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn)
    __obj.asInstanceOf[DeleteSchemaResponse]
  }
}

