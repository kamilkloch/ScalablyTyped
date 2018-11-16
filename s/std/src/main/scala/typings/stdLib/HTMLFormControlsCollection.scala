package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HTMLFormControlsCollection extends HTMLCollectionBase {
  /**
       * element = collection[name]
       */
  def namedItem(name: java.lang.String): RadioNodeList | Element | scala.Null
}

@JSGlobal("HTMLFormControlsCollection")
@js.native
object HTMLFormControlsCollection
  extends ScalablyTyped.runtime.Instantiable0[HTMLFormControlsCollection]
