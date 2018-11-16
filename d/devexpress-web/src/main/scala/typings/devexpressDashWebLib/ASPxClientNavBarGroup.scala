package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the navbar's NavBarGroup object.
 */

trait ASPxClientNavBarGroup extends js.Object {
  /**
       * Gets the group's index within a collection of a navbar's groups.
       * Value: An integer value representing the group's zero-based index within the Groups collection of the navbar to which the group belongs.
       */
  var index: scala.Double
  /**
       * Gets the name that uniquely identifies the group.
       * Value: A string value that represents the value assigned to the group's Name property.
       */
  var name: java.lang.String
  /**
       * Gets the navbar to which the current group belongs.
       * Value: An ASPxClientNavBar object representing the navbar to which the group belongs.
       */
  var navBar: ASPxClientNavBar
  /**
       * Returns a value specifying whether a group is enabled.
       */
  def GetEnabled(): scala.Boolean
  /**
       * Returns a value specifying whether the group is expanded.
       */
  def GetExpanded(): scala.Boolean
  /**
       * Returns the group's item specified by its index.
       * @param index An integer value specifying the zero-based index of the item to be retrieved.
       */
  def GetItem(index: scala.Double): ASPxClientNavBarItem
  /**
       * Returns a group item specified by its name.
       * @param name A string value specifying the name of the item.
       */
  def GetItemByName(name: java.lang.String): ASPxClientNavBarItem
  /**
       * Returns the number of items in the group.
       */
  def GetItemCount(): scala.Double
  /**
       * Returns text displayed within a group.
       */
  def GetText(): java.lang.String
  /**
       * Returns a value specifying whether a group is displayed.
       */
  def GetVisible(): scala.Boolean
  /**
       * Sets the group's expansion state.
       * @param value true to expand the group; false to collapse the group.
       */
  def SetExpanded(value: scala.Boolean): scala.Unit
  /**
       * Specifies the text displayed within a group.
       * @param text A string value that is the text displayed within the navbar group.
       */
  def SetText(text: java.lang.String): scala.Unit
  /**
       * Specifies whether the group is visible.
       * @param value true if the group is visible; otherwise, false.
       */
  def SetVisible(value: scala.Boolean): scala.Unit
}
