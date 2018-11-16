package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Object internal property descriptor. This property isn't normally visible in JavaScript code.
         */

trait InternalPropertyDescriptor extends js.Object {
  /**
               * Conventional property name.
               */
  var name: java.lang.String
  /**
               * The value associated with the property.
               */
  var value: js.UndefOr[RemoteObject] = js.undefined
}
