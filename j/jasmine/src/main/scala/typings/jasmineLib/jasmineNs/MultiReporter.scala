package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiReporter extends Reporter {
  def addReporter(reporter: Reporter): scala.Unit
}

object MultiReporter {
  @scala.inline
  def apply(
    addReporter: Reporter => scala.Unit,
    log: java.lang.String => scala.Unit,
    reportRunnerResults: Runner => scala.Unit,
    reportRunnerStarting: Runner => scala.Unit,
    reportSpecResults: Spec => scala.Unit,
    reportSpecStarting: Spec => scala.Unit,
    reportSuiteResults: Suite => scala.Unit
  ): MultiReporter = {
    val __obj = js.Dynamic.literal(addReporter = js.Any.fromFunction1(addReporter), log = js.Any.fromFunction1(log), reportRunnerResults = js.Any.fromFunction1(reportRunnerResults), reportRunnerStarting = js.Any.fromFunction1(reportRunnerStarting), reportSpecResults = js.Any.fromFunction1(reportSpecResults), reportSpecStarting = js.Any.fromFunction1(reportSpecStarting), reportSuiteResults = js.Any.fromFunction1(reportSuiteResults))
  
    __obj.asInstanceOf[MultiReporter]
  }
}

