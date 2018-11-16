package typings
package es6DashShimLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayConstructor extends js.Object {
  /**
        * Creates an array from an array-like object.
        * @param arrayLike An array-like object to convert to an array.
        */
  def from[T](arrayLike: stdLib.ArrayLike[T]): Array[T] = js.native
  /**
        * Creates an array from an iterable object.
        * @param iterable An iterable object to convert to an array.
        */
  def from[T](iterable: IterableShim[T]): Array[T] = js.native
  /**
        * Creates an array from an array-like object.
        * @param arrayLike An array-like object to convert to an array.
        * @param mapfn A mapping function to call on every element of the array.
        * @param thisArg Value of 'this' used to invoke the mapfn.
        */
  def from[T, U](arrayLike: stdLib.ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U]): Array[U] = js.native
  /**
        * Creates an array from an array-like object.
        * @param arrayLike An array-like object to convert to an array.
        * @param mapfn A mapping function to call on every element of the array.
        * @param thisArg Value of 'this' used to invoke the mapfn.
        */
  def from[T, U](
    arrayLike: stdLib.ArrayLike[T],
    mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U],
    thisArg: js.Any
  ): Array[U] = js.native
  /**
        * Creates an array from an iterable object.
        * @param iterable An iterable object to convert to an array.
        * @param mapfn A mapping function to call on every element of the array.
        * @param thisArg Value of 'this' used to invoke the mapfn.
        */
  def from[T, U](iterable: IterableShim[T], mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U]): Array[U] = js.native
  /**
        * Creates an array from an iterable object.
        * @param iterable An iterable object to convert to an array.
        * @param mapfn A mapping function to call on every element of the array.
        * @param thisArg Value of 'this' used to invoke the mapfn.
        */
  def from[T, U](
    iterable: IterableShim[T],
    mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U],
    thisArg: js.Any
  ): Array[U] = js.native
  /**
        * Returns a new array from a set of elements.
        * @param items A set of elements to include in the new array object.
        */
  def of[T](items: T*): Array[T] = js.native
}
