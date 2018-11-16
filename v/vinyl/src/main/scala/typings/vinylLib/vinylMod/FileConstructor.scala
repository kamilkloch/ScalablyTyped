package typings
package vinylLib.vinylMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileConstructor
  extends ScalablyTyped.runtime.Instantiable0[File]
     with ScalablyTyped.runtime.Instantiable1[
      (/* options */ ConstructorOptions with vinylLib.Anon_Contents) | (/* options */ ConstructorOptions with vinylLib.Anon_ContentsBuffer) | (/* options */ ConstructorOptions with vinylLib.Anon_ContentsReadableStream) | (/* options */ ConstructorOptions), 
      NullFile | BufferFile | StreamFile | File
    ] {
  /**
       * Checks if a property is not managed internally.
       */
  def isCustomProp(name: java.lang.String): scala.Boolean = js.native
  /**
       * Checks if a given object is a vinyl file.
       */
  def isVinyl(obj: js.Any): /* is File */scala.Boolean = js.native
}
