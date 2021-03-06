package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EquationSymbol extends js.Object {
  def copy(): EquationSymbol
  def getAttributes(): js.Object
  def getCode(): java.lang.String
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): scala.Boolean
  def merge(): EquationSymbol
  def removeFromParent(): EquationSymbol
  def setAttributes(attributes: js.Object): EquationSymbol
}

object EquationSymbol {
  @scala.inline
  def apply(
    copy: () => EquationSymbol,
    getAttributes: () => js.Object,
    getCode: () => java.lang.String,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    isAtDocumentEnd: () => scala.Boolean,
    merge: () => EquationSymbol,
    removeFromParent: () => EquationSymbol,
    setAttributes: js.Object => EquationSymbol
  ): EquationSymbol = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getAttributes = js.Any.fromFunction0(getAttributes), getCode = js.Any.fromFunction0(getCode), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), merge = js.Any.fromFunction0(merge), removeFromParent = js.Any.fromFunction0(removeFromParent), setAttributes = js.Any.fromFunction1(setAttributes))
  
    __obj.asInstanceOf[EquationSymbol]
  }
}

