package typings
package awsDashSdkLib.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserRequest extends js.Object {
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: awsDashSdkLib.clientsQuicksightMod.AwsAccountId
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: awsDashSdkLib.clientsQuicksightMod.Namespace
  /**
    * The name of the user that you want to describe.
    */
  var UserName: awsDashSdkLib.clientsQuicksightMod.UserName
}

object DescribeUserRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, Namespace: Namespace, UserName: UserName): DescribeUserRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId, Namespace = Namespace, UserName = UserName)
  
    __obj.asInstanceOf[DescribeUserRequest]
  }
}

