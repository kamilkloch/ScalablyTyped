package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the combine/split functionality. */
trait XShapeCombiner
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * combines {@link Shapes}
    * @param xShapes the {@link Shapes} inside this container are converted to PolyPolygonBezierShapes and are than combined into one {@link PolyPolygonBezier
    * @returns a newly created {@link PolyPolygonBezierShape} which contains all converted {@link PolyPolygonBezierShape} combined. It is also added to the {@li
    */
  def combine(xShapes: XShapes): XShape
  /**
    * splits {@link Shapes} .
    * @param Group the {@link Shape} is converted to a PolyPolygonBezierShapes and then split into several PolyPolygonBezierShapes The {@link Shapes} in xShap
    */
  def split(Group: XShape): scala.Unit
}

object XShapeCombiner {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    combine: XShapes => XShape,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    split: XShape => scala.Unit
  ): XShapeCombiner = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), combine = js.Any.fromFunction1(combine), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), split = js.Any.fromFunction1(split))
  
    __obj.asInstanceOf[XShapeCombiner]
  }
}

