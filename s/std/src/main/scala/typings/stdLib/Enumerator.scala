package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows enumerating over a COM collection, which may not have indexed item access.
  */
trait Enumerator[T] extends js.Object {
  /**
    * Returns true if the current item is the last one in the collection, or the collection is empty,
    * or the current item is undefined.
    */
  def atEnd(): scala.Boolean
  /**
    * Returns the current item in the collection
    */
  def item(): T
  /**
    * Resets the current item in the collection to the first item. If there are no items in the collection,
    * the current item is set to undefined.
    */
  def moveFirst(): scala.Unit
  /**
    * Moves the current item to the next item in the collection. If the enumerator is at the end of
    * the collection or the collection is empty, the current item is set to undefined.
    */
  def moveNext(): scala.Unit
}

@JSGlobal("Enumerator")
@js.native
class EnumeratorCls[T] protected () extends Enumerator[T] {
  def this(collection: js.Any) = this()
  def this(collection: Anon_Index[T]) = this()
  def this(safearray: SafeArray[T]) = this()
  /**
    * Returns true if the current item is the last one in the collection, or the collection is empty,
    * or the current item is undefined.
    */
  /* CompleteClass */
  override def atEnd(): scala.Boolean = js.native
  /**
    * Returns the current item in the collection
    */
  /* CompleteClass */
  override def item(): T = js.native
  /**
    * Resets the current item in the collection to the first item. If there are no items in the collection,
    * the current item is set to undefined.
    */
  /* CompleteClass */
  override def moveFirst(): scala.Unit = js.native
  /**
    * Moves the current item to the next item in the collection. If the enumerator is at the end of
    * the collection or the collection is empty, the current item is set to undefined.
    */
  /* CompleteClass */
  override def moveNext(): scala.Unit = js.native
}

object Enumerator {
  @scala.inline
  def apply[T](atEnd: () => scala.Boolean, item: () => T, moveFirst: () => scala.Unit, moveNext: () => scala.Unit): Enumerator[T] = {
    val __obj = js.Dynamic.literal(atEnd = js.Any.fromFunction0(atEnd), item = js.Any.fromFunction0(item), moveFirst = js.Any.fromFunction0(moveFirst), moveNext = js.Any.fromFunction0(moveNext))
  
    __obj.asInstanceOf[Enumerator[T]]
  }
}

