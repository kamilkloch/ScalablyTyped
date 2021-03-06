package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a key event.
  * @see InputEvent
  */
trait KeyEvent extends InputEvent {
  /** contains the Unicode character generated by this event or 0. */
  var KeyChar: java.lang.String
  /**
    * contains the integer code representing the key of the event.
    *
    * This is a constant from the constant group {@link Key} .
    */
  var KeyCode: scala.Double
  /**
    * contains the function type of the key event.
    *
    * This is a constant from the constant group {@link KeyFunction} .
    */
  var KeyFunc: scala.Double
}

object KeyEvent {
  @scala.inline
  def apply(
    KeyChar: java.lang.String,
    KeyCode: scala.Double,
    KeyFunc: scala.Double,
    Modifiers: scala.Double,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): KeyEvent = {
    val __obj = js.Dynamic.literal(KeyChar = KeyChar, KeyCode = KeyCode, KeyFunc = KeyFunc, Modifiers = Modifiers, Source = Source)
  
    __obj.asInstanceOf[KeyEvent]
  }
}

