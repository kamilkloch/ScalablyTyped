package typings
package markoLib.srcCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/compiler", "modules")
@js.native
object modulesNs extends js.Object {
  def deresolve(targetFilename: java.lang.String, from: java.lang.String): java.lang.String = js.native
  def require(path: java.lang.String): js.Any = js.native
  def resolve(path: java.lang.String): java.lang.String = js.native
  def resolveFrom(from: java.lang.String, target: java.lang.String): java.lang.String | scala.Null = js.native
}

