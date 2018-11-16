package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExpandColumnOptions extends js.Object {
  /**
  	 * set the width of indicator column.
  	 */
  var columnWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
  	 * If both an indicator column and a selection column are displaying, this specifies whether the indicator column
  	 * should be shown first. Default is true, false will move the expand indicator column after selection column.
  	 */
  var expandColumnBeforeSelectColumn: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * a callback function to customize the appearance of the indicator column.
  	 */
  var expandColumnComponent: js.UndefOr[
    js.Function1[
      /* props */ ExpandColumnComponentProps, 
      java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
  /**
  	 * Will enable an indicator column at first column if true. Default is false.
  	 */
  var expandColumnVisible: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * a callback function to customise the header column
  	 */
  var expandedColumnHeaderComponent: js.UndefOr[
    js.Function1[
      /* props */ ExpandedColumnHeaderProps, 
      java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]
    ]
  ] = js.undefined
}
