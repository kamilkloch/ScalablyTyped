package typings
package launchpadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object launchpadMod {
  type BrowserFunction = js.Function2[
    /* url */ java.lang.String, 
    /* callback */ js.Function2[/* err */ js.Any, /* instance */ Instance, scala.Unit], 
    scala.Unit
  ]
}
