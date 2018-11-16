package typings
package ibmDashMobilefirstLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WLNs {
  type LoggerCallback = js.Function3[
    /* message */ java.lang.String | js.Array[java.lang.String], 
    /* level */ java.lang.String, 
    /* package */ java.lang.String, 
    scala.Unit
  ]
  type ResponseHandler[T] = js.Function1[/* response */ T, scala.Unit]
}