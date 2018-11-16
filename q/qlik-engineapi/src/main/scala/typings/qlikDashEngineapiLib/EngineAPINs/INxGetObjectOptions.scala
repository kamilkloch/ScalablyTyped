package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * NxGetObjectOptions.
     */

trait INxGetObjectOptions extends js.Object {
  /**
           * Set of data.
           */
  var qData: js.Any
  /**
           * Set to true to include session objects.
           *
           * Default: false
           */
  var qIncludeSessionObjects: scala.Boolean
  /**
           * List of object types..
           */
  var qTypes: js.Array[java.lang.String]
}
