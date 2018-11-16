package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UploadProgress extends js.Object {
  /**
       * Whether the request is currently active. If this is false no other properties
       * will be set
       */
  var active: scala.Boolean
  /**
       * The number of bytes that have been uploaded so far
       */
  var current: scala.Double
  /**
       * Whether the upload has started. If this is false both current and total will be
       * set to 0.
       */
  var started: scala.Boolean
  /**
       * The number of bytes that will be uploaded this request
       */
  var total: scala.Double
}
