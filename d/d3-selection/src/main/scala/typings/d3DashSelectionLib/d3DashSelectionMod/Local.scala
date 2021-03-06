package typings
package d3DashSelectionLib.d3DashSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Local[T] extends js.Object {
  /**
    * Retrieves a local variable stored on the node (or one of its parents).
    *
    * @param node A node element.
    */
  def get(node: stdLib.Element): js.UndefOr[T]
  /**
    * Deletes the value associated with the given node. Values stored on ancestors are not affected, meaning that child nodes will still see inherited values.
    *
    * This function returns true if there was a value stored directly on the node, and false otherwise.
    *
    * @param node A node element.
    */
  def remove(node: stdLib.Element): scala.Boolean
  /**
    * Store a value for this local variable. Calling `.get()` on children of this node will also retrieve the variable's value.
    *
    * @param node A node element.
    * @param value Value to store locally
    */
  def set(node: stdLib.Element, value: T): stdLib.Element
}

object Local {
  @scala.inline
  def apply[T](
    get: stdLib.Element => js.UndefOr[T],
    remove: stdLib.Element => scala.Boolean,
    set: (stdLib.Element, T) => stdLib.Element,
    toString: () => java.lang.String
  ): Local[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Local[T]]
  }
}

