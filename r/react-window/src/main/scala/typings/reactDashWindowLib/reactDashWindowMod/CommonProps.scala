package typings
package reactDashWindowLib.reactDashWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommonProps extends js.Object {
  /**
       * Optional CSS class to attach to outermost <div> element.
       */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Ref to attach to the inner container element. This is an advanced property.
       */
  var innerRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_]] = js.undefined
  /**
       * Tag name passed to document.createElement to create the inner container element. This is an advanced property; in most cases, the default ("div") should be used.
       */
  var innerTagName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Contextual data to be passed to the item renderer as a data prop. This is a light-weight alternative to React's built-in context API.
       *
       * Item data is useful for item renderers that are class components.
       */
  var itemData: js.UndefOr[js.Any] = js.undefined
  /**
       * Ref to attach to the outer container element. This is an advanced property.
       */
  var outerRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[_]] = js.undefined
  /**
       * Tag name passed to document.createElement to create the outer container element. This is an advanced property; in most cases, the default ("div") should be used.
       */
  var outerTagName: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The number of items (rows or columns) to render outside of the visible area. This property can be important for two reasons:
       *
       * - Overscanning by one row or column allows the tab key to focus on the next (not yet visible) item.
       * - Overscanning slightly can reduce or prevent a flash of empty space when a user first starts scrolling.
       *
       * Note that overscanning too much can negatively impact performance. By default, List overscans by one item.
       */
  var overscanCount: js.UndefOr[scala.Double] = js.undefined
  /**
       * Optional inline style to attach to outermost <div> element.
       */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
       * Adds an additional isScrolling parameter to the children render function. This parameter can be used to show a placeholder row or column while the list is being scrolled.
       *
       * Note that using this parameter will result in an additional render call after scrolling has stopped (whenisScrolling changse from true to false).
       */
  var useIsScrolling: js.UndefOr[scala.Boolean] = js.undefined
}
