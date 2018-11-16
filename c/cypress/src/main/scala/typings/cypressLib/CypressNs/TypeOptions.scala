package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * Options that control `cy.type` command
   *
   * @see https://on.cypress.io/type
   */

trait TypeOptions
  extends Loggable
     with Timeoutable {
  /**
       * Delay after each keypress (ms)
       *
       * @default 10
       */
  var delay: scala.Double
  /**
       * Forces the action, disables waiting for actionability
       *
       * @default false
       */
  var force: scala.Boolean
  /**
       * Keep a modifier activated between commands
       *
       * @default true
       */
  var release: scala.Boolean
}
