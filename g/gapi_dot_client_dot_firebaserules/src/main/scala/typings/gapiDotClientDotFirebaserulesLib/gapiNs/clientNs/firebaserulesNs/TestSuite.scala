package typings
package gapiDotClientDotFirebaserulesLib.gapiNs.clientNs.firebaserulesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestSuite extends js.Object {
  /** Collection of test cases associated with the `TestSuite`. */
  var testCases: js.UndefOr[js.Array[TestCase]] = js.undefined
}

object TestSuite {
  @scala.inline
  def apply(testCases: js.Array[TestCase] = null): TestSuite = {
    val __obj = js.Dynamic.literal()
    if (testCases != null) __obj.updateDynamic("testCases")(testCases)
    __obj.asInstanceOf[TestSuite]
  }
}

