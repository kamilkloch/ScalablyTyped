package typings
package paymentLib.paymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("payment", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var fns: Fns = js.native
  /**
    * Formats card CVC:
    * * Restricts length to 4 numbers
    * * Restricts input to numbers
    */
  def formatCardCVC(elem: stdLib.HTMLInputElement): stdLib.HTMLInputElement = js.native
  /**
    * Formats card expiry:
    * * Includes a / between the month and year
    * * Restricts input to numbers
    * * Restricts length
    */
  def formatCardExpiry(elem: stdLib.HTMLInputElement): stdLib.HTMLInputElement = js.native
  /**
    * Formats card numbers:
    * * Includes a space between every 4 digits
    * * Restricts input to numbers
    * * Limits to 16 numbers
    * * Supports American Express formatting
    * * Adds a class of the card type (e.g. 'visa') to the input
    */
  def formatCardNumber(elem: stdLib.HTMLInputElement): stdLib.HTMLInputElement = js.native
  /**
    * General numeric input restriction.
    */
  def restrictNumeric(elem: stdLib.HTMLInputElement): stdLib.HTMLInputElement = js.native
}

