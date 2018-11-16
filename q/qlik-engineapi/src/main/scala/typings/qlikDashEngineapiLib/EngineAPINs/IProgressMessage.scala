package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * ProgressMessage...
     */

trait IProgressMessage extends js.Object {
  /**
           * Code number to the corresponding localized message string.
           */
  var qMessageCode: scala.Double
  /**
           * Parameters to be inserted in the localized message string.
           */
  var qMessageParameters: js.Array[java.lang.String]
}
