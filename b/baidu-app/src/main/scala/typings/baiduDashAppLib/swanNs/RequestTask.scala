package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * 返回一个 requestTask 对象，通过 requestTask，可中断请求任务。
	 */
trait RequestTask extends js.Object {
  def abort(): scala.Unit
}

object RequestTask {
  @scala.inline
  def apply(abort: () => scala.Unit): RequestTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
  
    __obj.asInstanceOf[RequestTask]
  }
}

