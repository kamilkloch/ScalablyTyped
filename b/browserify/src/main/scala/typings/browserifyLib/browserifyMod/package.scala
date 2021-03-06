package typings
package browserifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object browserifyMod {
  // Browserify accepts a filename, an input stream for file inputs, or a FileOptions configuration
  // for each file in a bundle.
  type InputFile = java.lang.String | nodeLib.NodeJSNs.ReadableStream | FileOptions
}
