package typings
package signalrLib.SignalRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object HubNs {
  type HubCreator = js.Function2[
    /* url */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[Options], 
    Connection
  ]
}
