package typings
package winrtLib.WindowsNs.SystemNs.ProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHardwareIdentificationStatics extends js.Object {
  def getPackageSpecificToken(nonce: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): HardwareToken
}

object IHardwareIdentificationStatics {
  @scala.inline
  def apply(getPackageSpecificToken: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer => HardwareToken): IHardwareIdentificationStatics = {
    val __obj = js.Dynamic.literal(getPackageSpecificToken = js.Any.fromFunction1(getPackageSpecificToken))
  
    __obj.asInstanceOf[IHardwareIdentificationStatics]
  }
}

