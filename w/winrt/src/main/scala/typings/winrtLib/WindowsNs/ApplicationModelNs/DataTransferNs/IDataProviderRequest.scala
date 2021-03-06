package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProviderRequest extends js.Object {
  var deadline: stdLib.Date
  var formatId: java.lang.String
  def getDeferral(): DataProviderDeferral
  def setData(value: js.Any): scala.Unit
}

object IDataProviderRequest {
  @scala.inline
  def apply(
    deadline: stdLib.Date,
    formatId: java.lang.String,
    getDeferral: () => DataProviderDeferral,
    setData: js.Any => scala.Unit
  ): IDataProviderRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline, formatId = formatId, getDeferral = js.Any.fromFunction0(getDeferral), setData = js.Any.fromFunction1(setData))
  
    __obj.asInstanceOf[IDataProviderRequest]
  }
}

