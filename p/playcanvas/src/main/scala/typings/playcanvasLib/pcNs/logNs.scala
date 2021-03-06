package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("pc.log")
@js.native
object logNs extends js.Object {
  /**
    * @private
    * @function
    * @name pc.log.alert
    * @description Write text to the log preceded by 'ALERT:' and pop up an alert dialog box with the text
    * @param {String} text
    */
  def alert(text: java.lang.String): scala.Unit = js.native
  /**
    * @private
    * @function
    * @name pc.log.assert
    * @description If condition is false, then write text to the log preceded by 'ASSERT:' and pop up a dialog box.
    * @param {Boolean} condition
    * @param {String} text
    */
  def assert(condition: scala.Boolean, text: java.lang.String): scala.Unit = js.native
  /**
    * @private
    * @function
    * @name pc.log.debug
    * @description Write text to the log preceded by 'DEBUG:'
    * @param {String} text
    */
  def debug(text: java.lang.String): scala.Unit = js.native
  /**
    * @private
    * @function
    * @name pc.log.error
    * @description Write text to the log preceded by 'ERROR:'
    * @param {String} text
    */
  def error(text: java.lang.String): scala.Unit = js.native
  /**
    * @private
    * @function
    * @name pc.log.info
    * @description Write text to the log preceded by 'INFO:'
    * @param {String} text
    */
  def info(text: java.lang.String): scala.Unit = js.native
  /**
    * @private
    * @function
    * @name pc.log.open
    * @description Starting logging to the console
    * @param {String} text
    */
  def open(text: java.lang.String): scala.Unit = js.native
  /**
    * @private
    * @function
    * @name pc.log.warning
    * @description Write text to the log preceded by 'WARNING:'
    * @param {String} text
    */
  def warning(text: java.lang.String): scala.Unit = js.native
  /**
    * @private
    * @function
    * @name pc.log.write
    * @description Write text to the console
    * @param {String} text
    */
  def write(text: java.lang.String): scala.Unit = js.native
}

