package typings
package requestretryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestretryMod {
  type RetryStrategy = js.Function3[
    /* err */ stdLib.Error, 
    /* response */ nodeLib.httpMod.IncomingMessage, 
    /* body */ js.Any, 
    scala.Boolean
  ]
}
