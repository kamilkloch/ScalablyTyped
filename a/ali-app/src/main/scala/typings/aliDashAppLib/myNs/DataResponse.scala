package typings
package aliDashAppLib.myNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region 基本参数

trait DataResponse extends js.Object {
  /** 回调函数返回的内容 */
  var data: js.Any
  /** 开发者服务器返回的 HTTP Response Header */
  var headers: js.Object
  /** 开发者服务器返回的 HTTP 状态码 */
  var status: scala.Double
}
