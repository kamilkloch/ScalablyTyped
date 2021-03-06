package typings
package commangularLib.commangularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Object type expected to be passed into the callback function
	 * of the dispatch() function
	 */
trait ICommandInfo extends js.Object {
  /**
  		 * Indicates if the command execution was cancelled.
  		 */
  def canceled(): scala.Boolean
  /**
  		 * Indicates if the command was executed????
  		 */
  def commandExecuted(): scala.Boolean
  /**
  		 * The data that was passed into the command
  		 * @param key The property name that is in the object that was passed
  		 */
  def dataPassed(key: java.lang.String): js.Any
  /**
  		 * The data that was returned by the command
  		 * @param key The result key that was defined in the command. If no result
  		 * 		was defined use 'lastResult' as the key
  		 */
  def resultKey(key: java.lang.String): js.Any
}

object ICommandInfo {
  @scala.inline
  def apply(
    canceled: () => scala.Boolean,
    commandExecuted: () => scala.Boolean,
    dataPassed: java.lang.String => js.Any,
    resultKey: java.lang.String => js.Any
  ): ICommandInfo = {
    val __obj = js.Dynamic.literal(canceled = js.Any.fromFunction0(canceled), commandExecuted = js.Any.fromFunction0(commandExecuted), dataPassed = js.Any.fromFunction1(dataPassed), resultKey = js.Any.fromFunction1(resultKey))
  
    __obj.asInstanceOf[ICommandInfo]
  }
}

