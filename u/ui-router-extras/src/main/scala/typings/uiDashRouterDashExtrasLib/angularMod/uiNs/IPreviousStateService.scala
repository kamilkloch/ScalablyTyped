package typings
package uiDashRouterDashExtrasLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Previous state service
         */
@js.native
trait IPreviousStateService extends js.Object {
  /**
               * Forget a memorized name
               * @param memoName Memo name
               */
  def forget(memoName: java.lang.String): scala.Unit = js.native
  /**
               * Get a previous state
               * @param memoName Memo name
               * @return Previous state
               */
  def get(): IPreviousState = js.native
  /**
               * Get a previous state
               * @param memoName Memo name
               * @return Previous state
               */
  def get(memoName: java.lang.String): IPreviousState = js.native
  /**
               * Go to a state
               * @param memoName Memo name
               * @param options State options
               * @return Promise
               */
  def go(memoName: java.lang.String): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
               * Go to a state
               * @param memoName Memo name
               * @param options State options
               * @return Promise
               */
  def go(memoName: java.lang.String, options: js.Any): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
               * Memorize a state
               * @param memoName Memo name
               * @param defaultStateName Default state name
               * @param defaultStateParams Default state parameters
               */
  def memo(memoName: java.lang.String): scala.Unit = js.native
  /**
               * Memorize a state
               * @param memoName Memo name
               * @param defaultStateName Default state name
               * @param defaultStateParams Default state parameters
               */
  def memo(memoName: java.lang.String, defaultStateName: java.lang.String): scala.Unit = js.native
  /**
               * Memorize a state
               * @param memoName Memo name
               * @param defaultStateName Default state name
               * @param defaultStateParams Default state parameters
               */
  def memo(memoName: java.lang.String, defaultStateName: java.lang.String, defaultStateParams: js.Object): scala.Unit = js.native
}
