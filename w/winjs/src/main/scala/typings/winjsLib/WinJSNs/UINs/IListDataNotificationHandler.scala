package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Notifies clients when an IListDataAdapter object's data changes.
    **/
@js.native
trait IListDataNotificationHandler[T] extends js.Object {
  //#region Methods
  /**
           * Indicates the start of a notification batch. Objects that are listening for notifications should defer making updates until endNotifications is called.
          **/
  def beginNotifications(): scala.Unit = js.native
  /**
           * Raises a notification that an item in the IListDataAdapter object's data source has changed.
           * @param item The item that changed.
          **/
  def changed(item: IItem[T]): scala.Unit = js.native
  /**
           * Indicates the end of a notification batch. When the beginNotifications method is called, objects listening for notifications should defer making updates until endNotifications is called.
          **/
  def endNotifications(): scala.Unit = js.native
  /**
           * Raises a notification that an item has been added to the IListDataAdapter object's data source.
           * @param newItem The new item added to the IListDataAdapter object's data source.
           * @param previousKey The key of the item that now precedes the new item, or null if the item was inserted at the start of the list. If nextKey is provided, this parameter may be null.
           * @param nextKey The key of the item that now follows the new item, or null if the item was inserted at the end of the list. If previousKey is provided, this parameter may be null.
           * @param index The index of the new item.
          **/
  def inserted(newItem: IItem[T], previousKey: java.lang.String, nextKey: java.lang.String): scala.Unit = js.native
  /**
           * Raises a notification that an item has been added to the IListDataAdapter object's data source.
           * @param newItem The new item added to the IListDataAdapter object's data source.
           * @param previousKey The key of the item that now precedes the new item, or null if the item was inserted at the start of the list. If nextKey is provided, this parameter may be null.
           * @param nextKey The key of the item that now follows the new item, or null if the item was inserted at the end of the list. If previousKey is provided, this parameter may be null.
           * @param index The index of the new item.
          **/
  def inserted(newItem: IItem[T], previousKey: java.lang.String, nextKey: java.lang.String, index: scala.Double): scala.Unit = js.native
  /**
           * Indicates that all previous data obtained from the IListDataAdapter is invalid and should be refreshed.
           * @returns A Promise that completes when the data has been completely refreshed and all change notifications have been sent.
          **/
  def invalidateAll(): winjsLib.WinJSNs.Promise[_] = js.native
  /**
           * Raises a notification that an item was moved within the IListDataAdapter object's data source.
           * @param item The item that was moved.
           * @param previousKey The key of the item that now precedes the new item, or null if the item was moved to the beginning of the list. If nextKey is provided, this parameter may be null.
           * @param nextKey The key of the item that now follows the new item, or null if the item was moved to the end of the list. If previousKey is provided, this parameter may be null.
           * @param oldIndex The item's original index.
           * @param newIndex The item's new index.
          **/
  def moved(item: IItem[T], previousKey: java.lang.String, nextKey: java.lang.String): scala.Unit = js.native
  /**
           * Raises a notification that an item was moved within the IListDataAdapter object's data source.
           * @param item The item that was moved.
           * @param previousKey The key of the item that now precedes the new item, or null if the item was moved to the beginning of the list. If nextKey is provided, this parameter may be null.
           * @param nextKey The key of the item that now follows the new item, or null if the item was moved to the end of the list. If previousKey is provided, this parameter may be null.
           * @param oldIndex The item's original index.
           * @param newIndex The item's new index.
          **/
  def moved(item: IItem[T], previousKey: java.lang.String, nextKey: java.lang.String, oldIndex: scala.Double): scala.Unit = js.native
  /**
           * Raises a notification that an item was moved within the IListDataAdapter object's data source.
           * @param item The item that was moved.
           * @param previousKey The key of the item that now precedes the new item, or null if the item was moved to the beginning of the list. If nextKey is provided, this parameter may be null.
           * @param nextKey The key of the item that now follows the new item, or null if the item was moved to the end of the list. If previousKey is provided, this parameter may be null.
           * @param oldIndex The item's original index.
           * @param newIndex The item's new index.
          **/
  def moved(
    item: IItem[T],
    previousKey: java.lang.String,
    nextKey: java.lang.String,
    oldIndex: scala.Double,
    newIndex: scala.Double
  ): scala.Unit = js.native
  /**
           * Reloads data from the IListDataAdapter.
          **/
  def reload(): scala.Unit = js.native
  /**
           * Raises a notification that an item was removed from the IListDataAdapter object's data source.
           * @param key The key of the item that was removed.
           * @param index The index of the item that was removed.
          **/
  def removed(key: java.lang.String): scala.Unit = js.native
  /**
           * Raises a notification that an item was removed from the IListDataAdapter object's data source.
           * @param key The key of the item that was removed.
           * @param index The index of the item that was removed.
          **/
  def removed(key: java.lang.String, index: scala.Double): scala.Unit = js.native
}
