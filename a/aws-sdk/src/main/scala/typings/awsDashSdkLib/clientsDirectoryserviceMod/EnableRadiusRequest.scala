package typings
package awsDashSdkLib.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableRadiusRequest extends js.Object {
  /**
    * The identifier of the directory for which to enable MFA.
    */
  var DirectoryId: awsDashSdkLib.clientsDirectoryserviceMod.DirectoryId
  /**
    * A RadiusSettings object that contains information about the RADIUS server.
    */
  var RadiusSettings: awsDashSdkLib.clientsDirectoryserviceMod.RadiusSettings
}

object EnableRadiusRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, RadiusSettings: RadiusSettings): EnableRadiusRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId, RadiusSettings = RadiusSettings)
  
    __obj.asInstanceOf[EnableRadiusRequest]
  }
}

