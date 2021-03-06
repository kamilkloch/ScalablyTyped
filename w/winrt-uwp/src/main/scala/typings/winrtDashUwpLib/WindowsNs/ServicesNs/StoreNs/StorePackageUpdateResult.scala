package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides info about a completed package update request for the current app. */
@JSGlobal("Windows.Services.Store.StorePackageUpdateResult")
@js.native
abstract class StorePackageUpdateResult () extends js.Object {
  /** Gets the state of the completed package update request. */
  var overallState: StorePackageUpdateState = js.native
  /** Gets info about the status of each of the package updates that are associated with the completed request. */
  var storePackageUpdateStatuses: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[StorePackageUpdateStatus] = js.native
}

