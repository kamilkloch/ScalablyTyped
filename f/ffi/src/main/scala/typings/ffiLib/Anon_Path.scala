package typings
package ffiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Path
  extends ScalablyTyped.runtime.Instantiable0[ffiLib.ffiMod.DynamicLibrary]
     with ScalablyTyped.runtime.Instantiable1[/* path */ java.lang.String, ffiLib.ffiMod.DynamicLibrary]
     with ScalablyTyped.runtime.Instantiable2[/* path */ java.lang.String, /* mode */ scala.Double, ffiLib.ffiMod.DynamicLibrary] {
  var FLAGS: Anon_RTLDNOLOAD = js.native
  def apply(): ffiLib.ffiMod.DynamicLibrary = js.native
  def apply(path: java.lang.String): ffiLib.ffiMod.DynamicLibrary = js.native
  def apply(path: java.lang.String, mode: scala.Double): ffiLib.ffiMod.DynamicLibrary = js.native
}
