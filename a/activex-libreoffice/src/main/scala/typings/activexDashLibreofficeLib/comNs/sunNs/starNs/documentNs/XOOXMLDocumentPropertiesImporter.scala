package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to import the document properties from OOXML format */
trait XOOXMLDocumentPropertiesImporter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * allows to import the document properties from OOXML format
    *
    * The implementation should parse the document properties from OOXML format storage and set them to the target {@link XDocumentProperties}
    * implementation.
    *
    * The storage must represent OOXML format and support {@link com.sun.star.embed.XRelationshipAccess} interface. Please see {@link
    * com.sun.star.embed.StorageFactory} for details regarding creation of such a storage.
    * @param xSource the source storage representing OOXML document
    * @param xDocumentProperties the target {@link XDocumentProperties} interface implementation
    * @throws com::sun::star::lang::IllegalArgumentException the exception is thrown in case unexpected arguments are provided
    * @throws com::sun::star::xml::sax::SAXException the exception is thrown in case of parsing problems
    * @throws com::sun::star::uno::Exception the exception is thrown in case of other problems during the import
    */
  def importProperties(
    xSource: activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage,
    xDocumentProperties: XDocumentProperties
  ): scala.Unit
}

object XOOXMLDocumentPropertiesImporter {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    importProperties: (activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs.XStorage, XDocumentProperties) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XOOXMLDocumentPropertiesImporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), importProperties = js.Any.fromFunction2(importProperties), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XOOXMLDocumentPropertiesImporter]
  }
}

