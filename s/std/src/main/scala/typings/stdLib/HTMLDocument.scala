package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The HTMLDocument property of Window objects is an alias that browsers expose for the Document interface object. */
@js.native
trait HTMLDocument extends Document

@JSGlobal("HTMLDocument")
@js.native
class HTMLDocumentCls () extends HTMLDocument {
  /* CompleteClass */
  override val activeElement: Element | scala.Null = js.native
  /* CompleteClass */
  override val fullscreenElement: Element | scala.Null = js.native
  /* CompleteClass */
  override val pointerLockElement: Element | scala.Null = js.native
  /**
    * Retrieves a collection of styleSheet objects representing the style sheets that correspond to each instance of a link or style object in the document.
    */
  /* CompleteClass */
  override val styleSheets: StyleSheetList = js.native
  /* CompleteClass */
  override def caretPositionFromPoint(x: scala.Double, y: scala.Double): CaretPosition | scala.Null = js.native
  /** @deprecated */
  /* CompleteClass */
  override def caretRangeFromPoint(x: scala.Double, y: scala.Double): Range = js.native
  /* CompleteClass */
  override def elementFromPoint(x: scala.Double, y: scala.Double): Element | scala.Null = js.native
  /* CompleteClass */
  override def elementsFromPoint(x: scala.Double, y: scala.Double): js.Array[Element] = js.native
  /**
    * Returns the first element within node's descendants whose ID is elementId.
    */
  /* CompleteClass */
  override def getElementById(elementId: java.lang.String): Element | scala.Null = js.native
  /* CompleteClass */
  override def getSelection(): Selection | scala.Null = js.native
}

@JSGlobal("HTMLDocument")
@js.native
object HTMLDocument
  extends org.scalablytyped.runtime.Instantiable0[HTMLDocument]

