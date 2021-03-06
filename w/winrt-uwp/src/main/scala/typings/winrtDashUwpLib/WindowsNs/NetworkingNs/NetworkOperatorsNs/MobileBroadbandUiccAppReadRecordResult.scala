package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Encapsulates the results of a UICC application record read operation. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUiccAppReadRecordResult")
@js.native
abstract class MobileBroadbandUiccAppReadRecordResult () extends js.Object {
  /** Gets the data returned by the application record read operation. Note that if Status is not Success, this value may be invalid or empty. */
  var data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets a value which indicates whether the record read completed successfully. */
  var status: MobileBroadbandUiccAppOperationStatus = js.native
}

