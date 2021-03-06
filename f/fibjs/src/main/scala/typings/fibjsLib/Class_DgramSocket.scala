package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_DgramSocket")
@js.native
class Class_DgramSocket () extends Class_EventEmitter {
  /**
  	 * 
  	 * @brief 返回一个包含 socket 地址信息的对象。对于 UDP socket，该对象将包含 address、family 和 port 属性。
  	 * @return 返回对象绑定地址
  	 * 
  	 * 
  	 * 
  	 */
  def address(): js.Any = js.native
  /**
  	 * 
  	 * @brief 该方法会令 dgram.Socket 在指定的 `port` 和 `addr` 上监听数据包信息。绑定完成时会触发一个 `listening` 事件。
  	 * @param port 指定绑定端口，若 `port` 未指定或为 0，操作系统会尝试绑定一个随机的端口
  	 * @param addr 指定绑定地址，若 address 未指定，操作系统会尝试在所有地址上监听。
  	 * 
  	 * 
  	 * @async
  	 */
  def bind(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 该方法会令 dgram.Socket 在 `opts` 指定的 `port` 和 `address` 上监听数据包信息。绑定完成时会触发一个 `listening` 事件。
  	 * @param opts 指定绑定参数
  	 * 
  	 * 
  	 * @async
  	 */
  def bind(opts: js.Object): scala.Unit = js.native
  def bind(port: scala.Double): scala.Unit = js.native
  def bind(port: scala.Double, addr: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 关闭当前 socket
  	 * 
  	 * 
  	 */
  def close(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 关闭当前 socket
  	 * @param callback 关闭完成后的回调函数，它相当于为 `close` 事件添加了一个监听器
  	 * 
  	 * 
  	 * 
  	 */
  def close(callback: js.Function): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 查询 socket 接收缓冲区大小
  	 * @return 返回查询结果
  	 * 
  	 * 
  	 * 
  	 */
  def getRecvBufferSize(): scala.Double = js.native
  /**
  	 * 
  	 * @brief 查询 socket 发送缓冲区大小
  	 * @return 返回查询结果
  	 * 
  	 * 
  	 * 
  	 */
  def getSendBufferSize(): scala.Double = js.native
  /**
  	 * 
  	 * @brief 维持 fibjs 进程不退出，在对象绑定期间阻止 fibjs 进程退出
  	 * @return 返回当前对象
  	 * 
  	 * 
  	 * 
  	 */
  def ref(): Class_DgramSocket = js.native
  /**
  	 * 
  	 * @brief 在 socket 上发送一个数据包
  	 * @param msg 指定发送的数据
  	 * @param offset 从指定偏移开始发送
  	 * @param length 之发送指定长度
  	 * @param port 指定发送的目的端口
  	 * @param address 指定发送的目的地址
  	 * @return 返回发送尺寸
  	 * 
  	 * 
  	 * @async
  	 */
  def send(msg: Class_Buffer, offset: scala.Double, length: scala.Double, port: scala.Double): scala.Double = js.native
  def send(
    msg: Class_Buffer,
    offset: scala.Double,
    length: scala.Double,
    port: scala.Double,
    address: java.lang.String
  ): scala.Double = js.native
  /**
  	 * 
  	 * @brief 在 socket 上发送一个数据包
  	 * @param msg 指定发送的数据
  	 * @param port 指定发送的目的端口
  	 * @param address 指定发送的目的地址
  	 * @return 返回发送尺寸
  	 * 
  	 * 
  	 * @async
  	 */
  def send(msg: Class_Buffer, port: scala.Double): scala.Double = js.native
  def send(msg: Class_Buffer, port: scala.Double, address: java.lang.String): scala.Double = js.native
  /**
  	 * 
  	 * @brief 设置或清除 SO_BROADCAST socket 选项
  	 * @param flag 当设置为 true, UDP包会被发送到一个本地接口的广播地址
  	 * 
  	 * 
  	 * 
  	 */
  def setBroadcast(flag: scala.Boolean): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 设置 socket 接收缓冲区大小
  	 * @param size 指定要设置的尺寸
  	 * 
  	 * 
  	 * 
  	 */
  def setRecvBufferSize(size: scala.Double): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 设置 socket 发送缓冲区大小
  	 * @param size 指定要设置的尺寸
  	 * 
  	 * 
  	 * 
  	 */
  def setSendBufferSize(size: scala.Double): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 允许 fibjs 进程退出，在对象绑定期间允许 fibjs 进程退出
  	 * @return 返回当前对象
  	 * 
  	 * 
  	 * 
  	 */
  def unref(): Class_DgramSocket = js.native
}

