package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Polygon")
@js.native
class Polygon protected () extends IPolygonOptions {
  /**
  	 * Constructor
  	 * @param points Array of points
  	 * @param [options] Options object
  	 */
  def this(points: js.Array[fabricLib.Anon_Y]) = this()
  /**
  	 * Constructor
  	 * @param points Array of points
  	 * @param [options] Options object
  	 */
  def this(points: js.Array[fabricLib.Anon_Y], options: IObjectOptions) = this()
  /**
  	 * Constructor
  	 * @param points Array of points
  	 * @param [options] Options object
  	 */
  def this(points: js.Array[fabricLib.Anon_Y], options: IObjectOptions, skipOffset: scala.Boolean) = this()
  /**
  	 * Returns complexity of an instance
  	 * @return complexity of this instance
  	 */
  def complexity(): scala.Double = js.native
  /**
  	 * Returns object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return object representation of an instance
  	 */
  def toObject(): js.Any = js.native
  /**
  	 * Returns object representation of an instance
  	 * @param [propertiesToInclude] Any properties that you might want to additionally include in the output
  	 * @return object representation of an instance
  	 */
  def toObject(propertiesToInclude: js.Array[java.lang.String]): js.Any = js.native
  /**
  	 * Returns svg representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(): java.lang.String = js.native
  /**
  	 * Returns svg representation of an instance
  	 * @param [reviver] Method for further parsing of svg representation.
  	 * @return svg representation of an instance
  	 */
  def toSVG(reviver: js.Function): java.lang.String = js.native
}

/* RemoveDifficultInheritance: 
- Dropped Object */ @JSImport("fabric/fabric-impl", "Polygon")
@js.native
object Polygon extends js.Object {
  /**
  	 * List of attribute names to account for when parsing SVG element (used by `fabric.Polygon.fromElement`)
  	 */
  var ATTRIBUTE_NAMES: js.Array[java.lang.String] = js.native
  /**
  	 * Returns Polygon instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement): fabricLib.fabricDashImplMod.Polygon = js.native
  /**
  	 * Returns Polygon instance from an SVG element
  	 * @param element Element to parse
  	 * @param [options] Options object
  	 */
  def fromElement(element: stdLib.SVGElement, options: fabricLib.fabricDashImplMod.IPolygonOptions): fabricLib.fabricDashImplMod.Polygon = js.native
  /**
  	 * Returns fabric.Polygon instance from an object representation
  	 * @param object Object to create an instance from
  	 */
  def fromObject(`object`: js.Any): fabricLib.fabricDashImplMod.Polygon = js.native
}
