package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConditionalForwarderRequest extends js.Object {
  /**
    * The directory ID for which you are deleting the conditional forwarder.
    */
  var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryId
  /**
    * The fully qualified domain name (FQDN) of the remote domain with which you are deleting the conditional forwarder.
    */
  var RemoteDomainName: awsDashSdkLib.clientsDirectoryserviceMod.RemoteDomainName
}

object DeleteConditionalForwarderRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, RemoteDomainName: RemoteDomainName): DeleteConditionalForwarderRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId, RemoteDomainName = RemoteDomainName)
  
    __obj.asInstanceOf[DeleteConditionalForwarderRequest]
  }
}

