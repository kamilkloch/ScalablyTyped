package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An annotation contains a description of a lint error, detailing the location of the error within the code, the severity of the error,
     * and an explaination as to why the error was thrown.
     */

trait Annotation extends js.Object {
  var from: Position
  var message: js.UndefOr[java.lang.String] = js.undefined
  var severity: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[Position] = js.undefined
}
