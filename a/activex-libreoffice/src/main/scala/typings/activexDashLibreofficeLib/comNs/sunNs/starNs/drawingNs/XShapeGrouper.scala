package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the group/ungroup functionality. */
trait XShapeGrouper
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * groups the {@link Shapes} inside a collection.
    *
    * Grouping of objects in text documents works only if none of the objects has an anchor of type
    * com::sun::star::text::TextContentAnchorType::AS_CHARACTER
    *
    * .
    * @param xShapes the {@link Shapes} that will be grouped. They must all be inserted into the same {@link GenericDrawPage} .
    * @returns a newly created {@link GroupShape} that contains all {@link Shapes} from xShapes and is also added to the {@link GenericDrawPage} of the {@link S
    */
  def group(xShapes: XShapes): XShapeGroup
  /**
    * ungroups a given {@link GroupShape} .
    * @param aGroup moves all {@link Shapes} from this {@link GroupShape} to the parent {@link XShapes} of the {@link GroupShape} . The {@link GroupShape} is
    */
  def ungroup(aGroup: XShapeGroup): scala.Unit
}

object XShapeGrouper {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    group: XShapes => XShapeGroup,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    ungroup: XShapeGroup => scala.Unit
  ): XShapeGrouper = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), group = js.Any.fromFunction1(group), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), ungroup = js.Any.fromFunction1(ungroup))
  
    __obj.asInstanceOf[XShapeGrouper]
  }
}

