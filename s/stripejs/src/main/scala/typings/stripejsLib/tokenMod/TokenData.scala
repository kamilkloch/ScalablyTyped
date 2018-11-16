package typings
package stripejsLib.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TokenData extends js.Object {
  var address_city: java.lang.String
  /**
       * A two character country code identifying the country
       * @example 'US'
       */
  var address_country: java.lang.String
  /**
       * Fields for billing address information.
       */
  var address_line1: java.lang.String
  var address_line2: java.lang.String
  var address_state: java.lang.String
  var address_zip: java.lang.String
  /**
       * Used to add a card to an account
       * NOTE: Currently, the only supported currency for debit card payouts is 'usd'
       */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The Cardholder name
       */
  var name: java.lang.String
}
