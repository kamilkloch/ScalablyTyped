package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Interface for the form's record context, {@link Data.entity formContext.data.entity}
     * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-data-entity External Link: formContext.data.entity (Client API reference)}
     */
@js.native
trait Entity extends js.Object {
  /**
           * The collection of attributes for the record.
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/attributes External Link: Attributes (Client API reference)}
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
           */
  var attributes: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.AttributesNs.Attribute] = js.native
  /**
           * Adds a handler to be called when the record is saved.
           * @param handler The handler.
           */
  def addOnSave(handler: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler): scala.Unit = js.native
  /**
           * Gets an serialized-XML string representing data that will be passed to the server upon saving the record.
           * @returns The XML in string format.
           * @remarks This function does not work with Microsoft Dynamics CRM for tablets.
           * @example "<account><name>Contoso</name><accountnumber>55555</accountnumber><telephone2>425
           *          555-1234</telephone2></account>".
           */
  def getDataXml(): java.lang.String = js.native
  /**
           * Gets entity's logical name.
           * @returns  The logical name.
           */
  def getEntityName(): java.lang.String = js.native
  /**
           * Gets a lookup value that references the record.
           * @returns A lookup value that references the record.
           * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/formcontext-data-entity/getentityreference External Link: getEntityReference API Documentation}
           */
  def getEntityReference(): LookupValue = js.native
  /**
           * Gets the record's unique identifier.
           * @returns The identifier, in Guid format.
           * @example Example: "{825CB223-A651-DF11-AA8B-00155DBA3804}".
           */
  def getId(): java.lang.String = js.native
  /**
           * Gets a boolean value indicating whether the record has unsaved changes.
           * @returns true if there are unsaved changes, otherwise false.
           */
  def getIsDirty(): scala.Boolean = js.native
  /**
           * Gets the record's primary attribute value.
           * @returns The primary attribute value.
           * @remarks The value for this attribute is used when links to the record are displayed.
           */
  def getPrimaryAttributeValue(): java.lang.String = js.native
  /**
           * Gets a boolean value indicating whether all of the entity data is valid.
           * @returns true if all of the entity data is valid; false otherwise.
           */
  def isValid(): scala.Boolean = js.native
  /**
           * Removes the handler from the "on save" event.
           * @param handler The handler.
           */
  def removeOnSave(handler: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler): scala.Unit = js.native
  /**
           * Saves the record.
           * @remarks  When using quick create forms in the web application the saveandnew option is not
           *           applied. It will always work as if saveandclose were used. Quick create forms in
           *           Microsoft Dynamics CRM for tablets will apply the saveandnew behavior.
           */
  def save(): scala.Unit = js.native
  /**
           * Saves the record with the given save mode.
           * @param saveMode (Optional) the save mode to save, as either "saveandclose" or "saveandnew".  If no parameter is included in the method, the record will simply be saved.
           */
  def save(saveMode: EntitySaveMode): scala.Unit = js.native
}
