package typings
package typesettableLib.buildSrcContextsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/contexts", "HtmlUtils")
@js.native
class HtmlUtils ()
  extends typesettableLib.buildSrcContextsHtmlMod.HtmlUtils

/* static members */
@JSImport("typesettable/build/src/contexts", "HtmlUtils")
@js.native
object HtmlUtils extends js.Object {
  /**
    * Adds the variadic classnames to the Element
    */
  def addClasses(element: stdLib.Element, classNames: java.lang.String*): scala.Unit = js.native
  /**
    * Appends an HTML element with the specified tag name to the provided element.
    * The variadic classnames are added to the new element.
    *
    * Returns the new element.
    */
  def append(element: stdLib.Element, tagName: java.lang.String, classNames: java.lang.String*): stdLib.HTMLElement = js.native
  /**
    * Creates and returns a new HTMLElement with the attached classnames.
    */
  def create(tagName: java.lang.String, classNames: java.lang.String*): stdLib.HTMLElement = js.native
  /**
    * Returns the width/height of HTMLElement's bounding box
    */
  def getDimensions(element: stdLib.HTMLElement): typesettableLib.buildSrcMeasurersAbstractMeasurerMod.IDimensions = js.native
}

