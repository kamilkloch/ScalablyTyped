package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Int32ArrayConstructor
  extends ScalablyTyped.runtime.Instantiable0[Int32Array]
     with ScalablyTyped.runtime.Instantiable2[/* buffer */ ArrayBufferLike, /* byteOffset */ scala.Double, Int32Array]
     with ScalablyTyped.runtime.Instantiable3[
      /* buffer */ ArrayBufferLike, 
      /* byteOffset */ scala.Double, 
      /* length */ scala.Double, 
      Int32Array
    ]
     with ScalablyTyped.runtime.Instantiable1[
      (/* length */ scala.Double) | (/* arrayOrArrayBuffer */ ArrayLike[scala.Double]) | (/* arrayOrArrayBuffer */ ArrayBufferLike) | (/* elements */ Iterable[scala.Double]), 
      Int32Array
    ] {
  /**
        * The size in bytes of each element in the array.
        */
  val BYTES_PER_ELEMENT: scala.Double = js.native
  /**
        * Creates an array from an array-like or iterable object.
        * @param arrayLike An array-like or iterable object to convert to an array.
        * @param mapfn A mapping function to call on every element of the array.
        * @param thisArg Value of 'this' used to invoke the mapfn.
        */
  def from(arrayLike: ArrayLike[scala.Double]): Int32Array = js.native
  /**
        * Creates an array from an array-like or iterable object.
        * @param arrayLike An array-like or iterable object to convert to an array.
        * @param mapfn A mapping function to call on every element of the array.
        * @param thisArg Value of 'this' used to invoke the mapfn.
        */
  def from(
    arrayLike: ArrayLike[scala.Double],
    mapfn: js.Function2[/* v */ scala.Double, /* k */ scala.Double, scala.Double]
  ): Int32Array = js.native
  /**
        * Creates an array from an array-like or iterable object.
        * @param arrayLike An array-like or iterable object to convert to an array.
        * @param mapfn A mapping function to call on every element of the array.
        * @param thisArg Value of 'this' used to invoke the mapfn.
        */
  def from(
    arrayLike: ArrayLike[scala.Double],
    mapfn: js.Function2[/* v */ scala.Double, /* k */ scala.Double, scala.Double],
    thisArg: js.Any
  ): Int32Array = js.native
  /**
       * Creates an array from an array-like or iterable object.
       * @param arrayLike An array-like or iterable object to convert to an array.
       * @param mapfn A mapping function to call on every element of the array.
       * @param thisArg Value of 'this' used to invoke the mapfn.
       */
  def from(arrayLike: Iterable[scala.Double]): Int32Array = js.native
  /**
       * Creates an array from an array-like or iterable object.
       * @param arrayLike An array-like or iterable object to convert to an array.
       * @param mapfn A mapping function to call on every element of the array.
       * @param thisArg Value of 'this' used to invoke the mapfn.
       */
  def from(
    arrayLike: Iterable[scala.Double],
    mapfn: js.Function2[/* v */ scala.Double, /* k */ scala.Double, scala.Double]
  ): Int32Array = js.native
  /**
       * Creates an array from an array-like or iterable object.
       * @param arrayLike An array-like or iterable object to convert to an array.
       * @param mapfn A mapping function to call on every element of the array.
       * @param thisArg Value of 'this' used to invoke the mapfn.
       */
  def from(
    arrayLike: Iterable[scala.Double],
    mapfn: js.Function2[/* v */ scala.Double, /* k */ scala.Double, scala.Double],
    thisArg: js.Any
  ): Int32Array = js.native
  /**
        * Returns a new array from a set of elements.
        * @param items A set of elements to include in the new array object.
        */
  def of(items: scala.Double*): Int32Array = js.native
}
