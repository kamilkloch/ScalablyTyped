package typings
package kiiDashCloudDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnErrorStringFailureSuccessAny extends js.Object {
  def failure(anErrorString: java.lang.String): js.Any
  def success(): js.Any
}

object Anon_AnErrorStringFailureSuccessAny {
  @scala.inline
  def apply(failure: java.lang.String => js.Any, success: () => js.Any): Anon_AnErrorStringFailureSuccessAny = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction1(failure), success = js.Any.fromFunction0(success))
  
    __obj.asInstanceOf[Anon_AnErrorStringFailureSuccessAny]
  }
}

