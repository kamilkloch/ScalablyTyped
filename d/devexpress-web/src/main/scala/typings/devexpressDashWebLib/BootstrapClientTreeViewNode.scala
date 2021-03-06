package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the TreeView's BootstrapTreeViewNode object.
  */
trait BootstrapClientTreeViewNode extends ASPxClientTreeViewNode {
  /**
    * Gets the current node's parent node.
    * Value: A BootstrapClientTreeViewNode object representing the node's immediate parent.
    */
  @JSName("parent")
  var parent_BootstrapClientTreeViewNode: BootstrapClientTreeViewNode
  /**
    * Gets the BootstrapClientTreeView object to which the current node belongs.
    * Value: A <see cref="BootstrapClientTreeView" /> object that is the node's owner.
    */
  @JSName("treeView")
  var treeView_BootstrapClientTreeViewNode: BootstrapClientTreeView
  /**
    * Gets the CSS class of the icon displayed within the node badge.
    */
  def GetBadgeIconCssClass(): java.lang.String
  /**
    * Gets the text displayed within the node badge.
    */
  def GetBadgeText(): java.lang.String
  /**
    * Gets the CSS class of the icon displayed by the node.
    */
  def GetIconCssClass(): java.lang.String
  /**
    * Sets the CSS class of the icon displayed within the node badge.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetBadgeIconCssClass(cssClass: java.lang.String): scala.Unit
  /**
    * Sets the text displayed within the node badge.
    * @param text A String specifying the badge text.
    */
  def SetBadgeText(text: java.lang.String): scala.Unit
  /**
    * Sets the CSS class of the icon displayed by the node.
    * @param cssClass A string containing the name of a CSS class.
    */
  def SetIconCssClass(cssClass: java.lang.String): scala.Unit
}

object BootstrapClientTreeViewNode {
  @scala.inline
  def apply(
    GetBadgeIconCssClass: () => java.lang.String,
    GetBadgeText: () => java.lang.String,
    GetCheckState: () => java.lang.String,
    GetChecked: () => scala.Boolean,
    GetEnabled: () => scala.Boolean,
    GetExpanded: () => scala.Boolean,
    GetHtmlElement: () => js.Object,
    GetIconCssClass: () => java.lang.String,
    GetImageUrl: () => java.lang.String,
    GetNavigateUrl: () => java.lang.String,
    GetNode: scala.Double => BootstrapClientTreeViewNode,
    GetNodeByName: java.lang.String => BootstrapClientTreeViewNode,
    GetNodeByText: java.lang.String => BootstrapClientTreeViewNode,
    GetNodeCount: () => scala.Double,
    GetText: () => java.lang.String,
    GetVisible: () => scala.Boolean,
    SetBadgeIconCssClass: java.lang.String => scala.Unit,
    SetBadgeText: java.lang.String => scala.Unit,
    SetChecked: scala.Boolean => scala.Unit,
    SetEnabled: scala.Boolean => scala.Unit,
    SetExpanded: scala.Boolean => scala.Unit,
    SetIconCssClass: java.lang.String => scala.Unit,
    SetImageUrl: java.lang.String => scala.Unit,
    SetNavigateUrl: java.lang.String => scala.Unit,
    SetText: java.lang.String => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    index: scala.Double,
    name: java.lang.String,
    parent: BootstrapClientTreeViewNode,
    treeView: BootstrapClientTreeView
  ): BootstrapClientTreeViewNode = {
    val __obj = js.Dynamic.literal(GetBadgeIconCssClass = js.Any.fromFunction0(GetBadgeIconCssClass), GetBadgeText = js.Any.fromFunction0(GetBadgeText), GetCheckState = js.Any.fromFunction0(GetCheckState), GetChecked = js.Any.fromFunction0(GetChecked), GetEnabled = js.Any.fromFunction0(GetEnabled), GetExpanded = js.Any.fromFunction0(GetExpanded), GetHtmlElement = js.Any.fromFunction0(GetHtmlElement), GetIconCssClass = js.Any.fromFunction0(GetIconCssClass), GetImageUrl = js.Any.fromFunction0(GetImageUrl), GetNavigateUrl = js.Any.fromFunction0(GetNavigateUrl), GetNode = js.Any.fromFunction1(GetNode), GetNodeByName = js.Any.fromFunction1(GetNodeByName), GetNodeByText = js.Any.fromFunction1(GetNodeByText), GetNodeCount = js.Any.fromFunction0(GetNodeCount), GetText = js.Any.fromFunction0(GetText), GetVisible = js.Any.fromFunction0(GetVisible), SetBadgeIconCssClass = js.Any.fromFunction1(SetBadgeIconCssClass), SetBadgeText = js.Any.fromFunction1(SetBadgeText), SetChecked = js.Any.fromFunction1(SetChecked), SetEnabled = js.Any.fromFunction1(SetEnabled), SetExpanded = js.Any.fromFunction1(SetExpanded), SetIconCssClass = js.Any.fromFunction1(SetIconCssClass), SetImageUrl = js.Any.fromFunction1(SetImageUrl), SetNavigateUrl = js.Any.fromFunction1(SetNavigateUrl), SetText = js.Any.fromFunction1(SetText), SetVisible = js.Any.fromFunction1(SetVisible), index = index, name = name, parent = parent, treeView = treeView)
  
    __obj.asInstanceOf[BootstrapClientTreeViewNode]
  }
}

