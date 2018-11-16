package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_WebSocket")
@js.native
class Class_WebSocket protected () extends Class_EventEmitter {
  /**
  	 * 
  	 * @brief WebSocket 构造函数
  	 * @param url 指定连接的服务器
  	 * @param protocol 指定握手协议，缺省为 ""
  	 * @param origin 指定握手时模拟的源
  	 * 
  	 * 
  	 * 
  	 */
  def this(url: java.lang.String) = this()
  /**
  	 * 
  	 * @brief WebSocket 构造函数
  	 * @param url 指定连接的服务器
  	 * @param protocol 指定握手协议，缺省为 ""
  	 * @param origin 指定握手时模拟的源
  	 * 
  	 * 
  	 * 
  	 */
  def this(url: java.lang.String, protocol: java.lang.String) = this()
  /**
  	 * 
  	 * @brief WebSocket 构造函数
  	 * @param url 指定连接的服务器
  	 * @param protocol 指定握手协议，缺省为 ""
  	 * @param origin 指定握手时模拟的源
  	 * 
  	 * 
  	 * 
  	 */
  def this(url: java.lang.String, protocol: java.lang.String, origin: java.lang.String) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和绑定连接关闭的事件，相当于 on("close", func);
  	 * 
  	 * 
  	 * @type Function
  	 */
  var onclose: js.Function = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和绑定错误发生的事件，相当于 on("error", func);
  	 * 
  	 * 
  	 * @type Function
  	 */
  var onerror: js.Function = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和绑定接受到对方消息的事件，相当于 on("message", func);
  	 * 
  	 * 
  	 * @type Function
  	 */
  var onmessage: js.Function = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和绑定连接成功事件，相当于 on("open", func);
  	 * 
  	 * 
  	 * @type Function
  	 */
  var onopen: js.Function = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询当前对象连接的源
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var origin: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询当前对象连接时的协议
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var protocol: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询当前对象的连接状态，参见 ws
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var readyState: scala.Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询当前对象连接的服务器
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var url: java.lang.String = js.native
  /**
  	 * 
  	 * @brief 关闭当前连接，此操作会向对方发送 CLOSE 数据包，并等待对方响应
  	 * @param code 指定关闭的代码，允许值为 3000-4999 或者 1000，缺省为 1000
  	 * @param reason 指定关闭的原因，缺省为 ""
  	 * 
  	 * 
  	 * 
  	 */
  def close(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 关闭当前连接，此操作会向对方发送 CLOSE 数据包，并等待对方响应
  	 * @param code 指定关闭的代码，允许值为 3000-4999 或者 1000，缺省为 1000
  	 * @param reason 指定关闭的原因，缺省为 ""
  	 * 
  	 * 
  	 * 
  	 */
  def close(code: scala.Double): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 关闭当前连接，此操作会向对方发送 CLOSE 数据包，并等待对方响应
  	 * @param code 指定关闭的代码，允许值为 3000-4999 或者 1000，缺省为 1000
  	 * @param reason 指定关闭的原因，缺省为 ""
  	 * 
  	 * 
  	 * 
  	 */
  def close(code: scala.Double, reason: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 维持 fibjs 进程不退出，在对象绑定期间阻止 fibjs 进程退出
  	 * @return 返回当前对象
  	 * 
  	 * 
  	 * 
  	 */
  def ref(): Class_WebSocket = js.native
  /**
  	 * 
  	 * @brief 向对方发送一段二进制数据
  	 * @param data 指定发送的二进制数据
  	 * 
  	 * 
  	 * 
  	 */
  def send(data: Class_Buffer): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 向对方发送一段文本
  	 * @param data 指定发送的文本
  	 * 
  	 * 
  	 * 
  	 */
  def send(data: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 允许 fibjs 进程退出，在对象绑定期间允许 fibjs 进程退出
  	 * @return 返回当前对象
  	 * 
  	 * 
  	 * 
  	 */
  def unref(): Class_WebSocket = js.native
}
