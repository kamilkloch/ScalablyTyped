package typings
package w3cDashGamepadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Navigator extends js.Object {
  /**
       * The currently connected and interacted-with gamepads. Gamepads must only appear in the list if they are currently connected to the user agent, and have been interacted with by the user. Otherwise, they must not appear in the list to avoid a malicious page from fingerprinting the user based on connected devices.
       * @readonly
       */
  def getGamepads(): js.Array[w3cDashGamepadLib.GamepadNs.Gamepad]
  def webkitGetGamepads(): w3cDashGamepadLib.GamepadNs.GamepadList
}
