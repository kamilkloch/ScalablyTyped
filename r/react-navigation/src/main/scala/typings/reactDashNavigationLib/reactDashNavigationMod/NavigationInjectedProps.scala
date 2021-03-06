package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationInjectedProps[P] extends js.Object {
  var navigation: NavigationScreenProp[NavigationRoute[P], P]
}

object NavigationInjectedProps {
  @scala.inline
  def apply[P](navigation: NavigationScreenProp[NavigationRoute[P], P]): NavigationInjectedProps[P] = {
    val __obj = js.Dynamic.literal(navigation = navigation)
  
    __obj.asInstanceOf[NavigationInjectedProps[P]]
  }
}

