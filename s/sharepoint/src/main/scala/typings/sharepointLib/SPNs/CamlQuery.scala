package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a Collaborative Application Markup Language (CAML) query on a list. */
@JSGlobal("SP.CamlQuery")
@js.native
class CamlQuery () extends ClientValueObject {
  /** Returns true if the query returns dates in Coordinated Universal Time (UTC) format. */
  def get_datesInUtc(): scala.Boolean = js.native
  /** Server relative URL of a list folder from which results will be returned. */
  def get_folderServerRelativeUrl(): java.lang.String = js.native
  def get_listItemCollectionPosition(): ListItemCollectionPosition = js.native
  /** Gets value that specifies the XML schema that defines the list view. */
  def get_viewXml(): java.lang.String = js.native
  /** Sets a value that indicates whether the query returns dates in Coordinated Universal Time (UTC) format. */
  def set_datesInUtc(value: scala.Boolean): scala.Unit = js.native
  /** Sets a value that specifies the server relative URL of a list folder from which results will be returned. */
  def set_folderServerRelativeUrl(value: java.lang.String): scala.Unit = js.native
  /** Sets a value that specifies the information required to get the next page of data for the list view. */
  def set_listItemCollectionPosition(value: ListItemCollectionPosition): scala.Unit = js.native
  /** Sets value that specifies the XML schema that defines the list view. It must be null, empty, or an XML fragment that conforms to the ViewDefinition type.  */
  def set_viewXml(value: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSGlobal("SP.CamlQuery")
@js.native
object CamlQuery extends js.Object {
  /** This method creates a Collaborative Application Markup Language (CAML) string
    that can be used to recursively get all of the folders in a list, including
    the subfolders. */
  def createAllFoldersQuery(): sharepointLib.SPNs.CamlQuery = js.native
  /** This method creates a Collaborative Application Markup Language (CAML) string
    that can be used to recursively get all of the items in a list, including
    the items in the subfolders. */
  def createAllItemsQuery(): sharepointLib.SPNs.CamlQuery = js.native
}

