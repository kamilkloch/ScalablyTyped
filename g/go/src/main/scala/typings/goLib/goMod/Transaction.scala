package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Transaction holds a list of ChangedEvents collected during a transaction,
  * as the value of the read-only .changes property.
  */
@JSImport("go", "Transaction")
@js.native
/**
  * Construct an object holding an empty list of ChangedEvents and no .name.
  */
class Transaction () extends js.Object {
  /**This read-only property returns the list of ChangedEvents.*/
  var changes: List[ChangedEvent] = js.native
  /**Gets or sets whether we can add more ChangedEvents to this list of changes.*/
  var isComplete: scala.Boolean = js.native
  /**Gets or sets the transaction name for this collection of changes.*/
  var name: java.lang.String = js.native
  /**
    * This predicate returns true if you can call .redo, namely when .isComplete is true.
    */
  def canRedo(): scala.Boolean = js.native
  /**
    * This predicate returns true if you can call .undo, namely when .isComplete is true.
    */
  def canUndo(): scala.Boolean = js.native
  /**
    * Clear all of the saved changes.
    */
  def clear(): scala.Unit = js.native
  /**
    * Re-perform these changes after an .undo.
    */
  def redo(): scala.Unit = js.native
  /**
    * Undo all of the changes, in reverse order.
    */
  def undo(): scala.Unit = js.native
}

