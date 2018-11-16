package typings
package reactDashSmoothDashScrollbarLib.reactDashSmoothDashScrollbarMod.ScrollbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Lifted 1 members from Set(std.Partial) */ 
trait ScrollbarProps extends js.Object {
  /**
           * Keep scrollbar tracks visible whether it's scrolling or not
           * @default false
           */
  var alwaysShowTracks: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Optional class name
           */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Pipe to scrollbar.addListener()
           */
  var onScroll: js.UndefOr[
    js.Function2[
      /* status */ smoothDashScrollbarLib.interfacesScrollbarMod.ScrollStatus, 
      /* scrollbarInstance */ smoothDashScrollbarLib.smoothDashScrollbarMod.default, 
      scala.Unit
    ]
  ] = js.undefined
  /**
           * Optional style
           */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}
