package typings
package semanticDashUiDashReactLib.distCommonjsElementsListListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictListProps extends js.Object {
  /** A list can animate to set the current item apart from the list. */
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** A list can mark items with a bullet. */
  var bulleted: js.UndefOr[scala.Boolean] = js.undefined
  /** A list can divide its items into cells. */
  var celled: js.UndefOr[scala.Boolean] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /** Additional classes. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** Shorthand for primary content. */
  var content: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent] = js.undefined
  /** A list can show divisions between content. */
  var divided: js.UndefOr[scala.Boolean] = js.undefined
  /** An list can be floated left or right. */
  var floated: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticFLOATS] = js.undefined
  /** A list can be formatted to have items appear horizontally. */
  var horizontal: js.UndefOr[scala.Boolean] = js.undefined
  /** A list can be inverted to appear on a dark background. */
  var inverted: js.UndefOr[scala.Boolean] = js.undefined
  /** Shorthand array of props for ListItem. */
  var items: js.UndefOr[
    semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[semanticDashUiDashReactLib.distCommonjsElementsListListItemMod.ListItemProps]
  ] = js.undefined
  /** A list can be specially formatted for navigation links. */
  var link: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * onClick handler for ListItem. Mutually exclusive with children.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All item props.
    */
  var onItemClick: js.UndefOr[
    js.Function2[
      /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLAnchorElement, reactLib.NativeMouseEvent], 
      /* data */ semanticDashUiDashReactLib.distCommonjsElementsListListItemMod.ListItemProps, 
      scala.Unit
    ]
  ] = js.undefined
  /** A list can be ordered numerically. */
  var ordered: js.UndefOr[scala.Boolean] = js.undefined
  /** A list can relax its padding to provide more negative space. */
  var relaxed: js.UndefOr[
    scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very
  ] = js.undefined
  /** A selection list formats list items as possible choices. */
  var selection: js.UndefOr[scala.Boolean] = js.undefined
  /** A list can vary in size. */
  var size: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticSIZES] = js.undefined
  /** An element inside a list can be vertically aligned. */
  var verticalAlign: js.UndefOr[semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS] = js.undefined
}

object StrictListProps {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    as: js.Any = null,
    bulleted: js.UndefOr[scala.Boolean] = js.undefined,
    celled: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    content: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandContent = null,
    divided: js.UndefOr[scala.Boolean] = js.undefined,
    floated: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticFLOATS = null,
    horizontal: js.UndefOr[scala.Boolean] = js.undefined,
    inverted: js.UndefOr[scala.Boolean] = js.undefined,
    items: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticShorthandCollection[semanticDashUiDashReactLib.distCommonjsElementsListListItemMod.ListItemProps] = null,
    link: js.UndefOr[scala.Boolean] = js.undefined,
    onItemClick: (/* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLAnchorElement, reactLib.NativeMouseEvent], /* data */ semanticDashUiDashReactLib.distCommonjsElementsListListItemMod.ListItemProps) => scala.Unit = null,
    ordered: js.UndefOr[scala.Boolean] = js.undefined,
    relaxed: scala.Boolean | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.very = null,
    selection: js.UndefOr[scala.Boolean] = js.undefined,
    size: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticSIZES = null,
    verticalAlign: semanticDashUiDashReactLib.distCommonjsGenericMod.SemanticVERTICALALIGNMENTS = null
  ): StrictListProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (as != null) __obj.updateDynamic("as")(as)
    if (!js.isUndefined(bulleted)) __obj.updateDynamic("bulleted")(bulleted)
    if (!js.isUndefined(celled)) __obj.updateDynamic("celled")(celled)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(divided)) __obj.updateDynamic("divided")(divided)
    if (floated != null) __obj.updateDynamic("floated")(floated)
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal)
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted)
    if (items != null) __obj.updateDynamic("items")(items)
    if (!js.isUndefined(link)) __obj.updateDynamic("link")(link)
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered)
    if (relaxed != null) __obj.updateDynamic("relaxed")(relaxed.asInstanceOf[js.Any])
    if (!js.isUndefined(selection)) __obj.updateDynamic("selection")(selection)
    if (size != null) __obj.updateDynamic("size")(size)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    __obj.asInstanceOf[StrictListProps]
  }
}

