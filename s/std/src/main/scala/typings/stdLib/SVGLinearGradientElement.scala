package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The SVGLinearGradientElement interface corresponds to the <linearGradient> element. */
@js.native
trait SVGLinearGradientElement extends SVGGradientElement {
  val x1: SVGAnimatedLength = js.native
  val x2: SVGAnimatedLength = js.native
  val y1: SVGAnimatedLength = js.native
  val y2: SVGAnimatedLength = js.native
}

@JSGlobal("SVGLinearGradientElement")
@js.native
class SVGLinearGradientElementCls () extends SVGLinearGradientElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override val href: SVGAnimatedString = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("SVGLinearGradientElement")
@js.native
object SVGLinearGradientElement
  extends org.scalablytyped.runtime.Instantiable0[SVGLinearGradientElement]

