package typings
package domhandlerLib.domhandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends DomElement {
  val firstChild: DomElement
  val lastChild: DomElement
  val nodeType: scala.Double
}

object Node {
  @scala.inline
  def apply(
    firstChild: DomElement,
    lastChild: DomElement,
    nodeType: scala.Double,
    attribs: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    children: js.Array[DomElement] = null,
    data: js.Any = null,
    name: java.lang.String = null,
    next: DomElement = null,
    parent: DomElement = null,
    prev: DomElement = null,
    `type`: java.lang.String = null
  ): Node = {
    val __obj = js.Dynamic.literal(firstChild = firstChild, lastChild = lastChild, nodeType = nodeType)
    if (attribs != null) __obj.updateDynamic("attribs")(attribs)
    if (children != null) __obj.updateDynamic("children")(children)
    if (data != null) __obj.updateDynamic("data")(data)
    if (name != null) __obj.updateDynamic("name")(name)
    if (next != null) __obj.updateDynamic("next")(next)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Node]
  }
}

