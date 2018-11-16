package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeploymentsCancelPreviewRequest extends js.Object {
  /**
               * Specifies a fingerprint for cancelPreview() requests. A fingerprint is a randomly generated value that must be provided in cancelPreview() requests to
               * perform optimistic locking. This ensures optimistic concurrency so that the deployment does not have conflicting requests (e.g. if someone attempts to
               * make a new update request while another user attempts to cancel a preview, this would prevent one of the requests).
               *
               * The fingerprint is initially generated by Deployment Manager and changes after every request to modify a deployment. To get the latest fingerprint
               * value, perform a get() request on the deployment.
               */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
}
