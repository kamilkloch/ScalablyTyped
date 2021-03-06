package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDirectoryRequest extends js.Object {
  /**
    * The ARN of the directory.
    */
  var DirectoryArn: awsDashSdkLib.clientsClouddirectoryMod.DirectoryArn
}

object GetDirectoryRequest {
  @scala.inline
  def apply(DirectoryArn: DirectoryArn): GetDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn)
  
    __obj.asInstanceOf[GetDirectoryRequest]
  }
}

