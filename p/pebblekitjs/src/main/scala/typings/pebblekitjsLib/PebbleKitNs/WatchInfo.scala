package typings
package pebblekitjsLib.PebbleKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Object containing information about the currently connected watch,
     * returned by Pebble.getActiveWatchInfo().
     * Read the PebbleKit JS guides for complete information on possible values.
     * @see Pebble.getActiveWatchInfo
     */

trait WatchInfo extends js.Object {
  var firmware: Firmware
  var language: java.lang.String
  var model: java.lang.String
  var platform: java.lang.String
}
