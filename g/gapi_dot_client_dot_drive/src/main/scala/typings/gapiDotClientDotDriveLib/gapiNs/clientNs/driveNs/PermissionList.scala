package typings
package gapiDotClientDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PermissionList extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "drive#permissionList". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The page token for the next page of permissions. This field will be absent if the end of the permissions list has been reached. If the token is
               * rejected for any reason, it should be discarded, and pagination should be restarted from the first page of results.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** The list of permissions. If nextPageToken is populated, then this list may be incomplete and an additional page of results should be fetched. */
  var permissions: js.UndefOr[js.Array[Permission]] = js.undefined
}
