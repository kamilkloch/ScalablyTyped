package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manipulates storage items (files and folders) and their contents, and provides information about them. */
@js.native
trait IStorageItem extends js.Object {
  /** Gets the attributes of a storage item. */
  var attributes: FileAttributes = js.native
  /** Gets the date and time when the current item was created. */
  var dateCreated: stdLib.Date = js.native
  /** Gets the name of the item including the file name extension if there is one. */
  var name: java.lang.String = js.native
  /** Gets the full file-system path of the item, if the item has a path. */
  var path: java.lang.String = js.native
  /**
    * Deletes the current item.
    * @return No object or value is returned by this method when it completes.
    */
  def deleteAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Deletes the current item, optionally deleting it permanently.
    * @param option A value that indicates whether to delete the item permanently.
    * @return No object or value is returned by this method when it completes.
    */
  def deleteAsync(option: StorageDeleteOption): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Gets the basic properties of the current item (like a file or folder).
    * @return When this method completes successfully, it returns the basic properties of the current item as a BasicProperties object.
    */
  def getBasicPropertiesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.FilePropertiesNs.BasicProperties] = js.native
  /**
    * Gets the parent folder of the current storage item.
    * @return When this method completes, it returns the parent folder as a StorageFolder .
    */
  def getParentAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[StorageFolder] = js.native
  /**
    * Indicates whether the current item is the same as the specified item.
    * @param item The IStorageItem object that represents a storage item to compare against.
    * @return Returns true if the current storage item is the same as the specified storage item; otherwise false.
    */
  def isEqual(item: IStorageItem): scala.Boolean = js.native
  /**
    * Determines whether the current IStorageItem matches the specified StorageItemTypes value.
    * @param type The value to match against.
    * @return True if the IStorageItem matches the specified value; otherwise false.
    */
  def isOfType(`type`: StorageItemTypes): scala.Boolean = js.native
  /**
    * Renames the current item.
    * @param desiredName The desired, new name of the item.
    * @return No object or value is returned by this method when it completes.
    */
  def renameAsync(desiredName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
    * Renames the current item. This method also specifies what to do if an existing item in the current item's location has the same name.
    * @param desiredName The desired, new name of the current item.
    * @param option The enum value that determines how Windows responds if the desiredName is the same as the name of an existing item in the current item's location.
    * @return No object or value is returned by this method when it completes.
    */
  def renameAsync(desiredName: java.lang.String, option: NameCollisionOption): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

