package typings
package gapiDotClientDotDeploymentmanagerLib.gapiNs.clientNs.deploymentmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TargetConfiguration extends js.Object {
  /** The configuration to use for this deployment. */
  var config: js.UndefOr[ConfigFile] = js.undefined
  /**
               * Specifies any files to import for this configuration. This can be used to import templates or other files. For example, you might import a text file in
               * order to use the file in a template.
               */
  var imports: js.UndefOr[js.Array[ImportFile]] = js.undefined
}
