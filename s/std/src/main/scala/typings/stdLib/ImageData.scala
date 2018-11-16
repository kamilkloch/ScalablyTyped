package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ImageData extends js.Object {
  /**
       * Returns the one-dimensional array containing the data in RGBA order, as integers in the
       * range 0 to 255.
       */
  val data: Uint8ClampedArray
  /**
       * Returns the actual dimensions of the data in the ImageData object, in
       * pixels.
       */
  val height: scala.Double
  val width: scala.Double
}

@JSGlobal("ImageData")
@js.native
object ImageData
  extends ScalablyTyped.runtime.Instantiable2[/* width */ scala.Double, /* height */ scala.Double, ImageData]
     with ScalablyTyped.runtime.Instantiable3[
      /* array */ Uint8ClampedArray, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      ImageData
    ]
