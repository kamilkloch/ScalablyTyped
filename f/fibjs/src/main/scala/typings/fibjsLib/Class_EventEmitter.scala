package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 事件触发对象，可用于建立观察者模式，支持事件触发的对象均继承于此，同一事件的同一函数只会产生一次回调
	* @detail Event 对象可独立创建，以用于组建自定义的事件系统：,```JavaScript,var EventEmitter = require('events');,,var e = new EventEmitter();,```
	*/

@JSGlobal("Class_EventEmitter")
@js.native
class Class_EventEmitter () extends Class__object {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 默认全局最大监听器数
  	 * @static
  	 * 
  	 * @type Integer
  	 */
  var defaultMaxListeners: scala.Double = js.native
  /**
  	 * 
  	 * @brief 绑定一个事件处理函数到对象
  	 * @param ev 指定事件的名称
  	 * @param func 指定事件处理函数
  	 * @return 返回事件对象本身，便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def addListener(ev: java.lang.String, func: js.Function): js.Object = js.native
  /**
  	 * 
  	 * @brief 绑定一个事件处理函数到对象
  	 * @param map 指定事件映射关系，对象属性名称将作为事件名称，属性的值将作为事件处理函数
  	 * @return 返回事件对象本身，便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def addListener(map: js.Object): js.Object = js.native
  /**
  	 * 
  	 * @brief 主动触发一个事件
  	 * @param ev 事件名称
  	 * @param args 事件参数，将会传递给事件处理函数
  	 * @return 返回事件触发状态，有响应事件返回 true，否则返回 false
  	 * 
  	 * 
  	 * 
  	 */
  def emit(ev: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 查询监听器事件名称
  	 * @return 返回事件名称数组
  	 * 
  	 * 
  	 * 
  	 */
  def eventNames(): js.Array[_] = js.native
  /**
  	 * 
  	 * 获取监听器的默认限制的数量，仅用于兼容
  	 * @return 返回默认限制数量
  	 * 
  	 * 
  	 * 
  	 */
  def getMaxListeners(): scala.Double = js.native
  /**
  	 * 
  	 * @brief 查询对象指定事件的监听器数量
  	 * @param ev 指定事件的名称
  	 * @return 返回指定事件的监听器数量
  	 * 
  	 * 
  	 * 
  	 */
  def listenerCount(ev: java.lang.String): scala.Double = js.native
  /**
  	 * 
  	 * @brief 查询对象指定事件的监听器数组
  	 * @param ev 指定事件的名称
  	 * @return 返回指定事件的监听器数组
  	 * 
  	 * 
  	 * 
  	 */
  def listeners(ev: java.lang.String): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 取消对象处理队列中的全部函数
  	 * @param ev 指定事件的名称
  	 * @return 返回事件对象本身，便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def off(ev: java.lang.String): js.Object = js.native
  /**
  	 * 
  	 * @brief 从对象处理队列中取消指定函数
  	 * @param ev 指定事件的名称
  	 * @param func 指定事件处理函数
  	 * @return 返回事件对象本身，便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def off(ev: java.lang.String, func: js.Function): js.Object = js.native
  /**
  	 * 
  	 * @brief 从对象处理队列中取消指定函数
  	 * @param map 指定事件映射关系，对象属性名称作为事件名称，属性的值作为事件处理函数
  	 * @return 返回事件对象本身，便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def off(map: js.Object): js.Object = js.native
  /**
  	 * 
  	 * @brief 绑定一个事件处理函数到对象
  	 * @param ev 指定事件的名称
  	 * @param func 指定事件处理函数
  	 * @return 返回成功绑定的数量，如果函数已绑定则返回 0
  	 * 
  	 * 
  	 * 
  	 */
  def on(ev: java.lang.String, func: js.Function): js.Object = js.native
  /**
  	 * 
  	 * @brief 绑定一个事件处理函数到对象
  	 * @param map 指定事件映射关系，对象属性名称将作为事件名称，属性的值将作为事件处理函数
  	 * @return 返回事件对象本身，便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def on(map: js.Object): js.Object = js.native
  /**
  	 * 
  	 * @brief 绑定一个一次性事件处理函数到对象，一次性处理函数只会触发一次
  	 * @param ev 指定事件的名称
  	 * @param func 指定事件处理函数
  	 * @return 返回事件对象本身，便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def once(ev: java.lang.String, func: js.Function): js.Object = js.native
  /**
  	 * 
  	 * @brief 绑定一个一次性事件处理函数到对象，一次性处理函数只会触发一次
  	 * @param map 指定事件映射关系，对象属性名称将作为事件名称，属性的值将作为事件处理函数
  	 * @return 返回事件对象本身，便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def once(map: js.Object): js.Object = js.native
  /**
  	 * 
  	 * @brief 绑定一个事件处理函数到对象起始
  	 * @param ev 指定事件的名称
  	 * @param func 指定事件处理函数
  	 * @return 返回成功绑定的数量，如果函数已绑定则返回 0
  	 * 
  	 * 
  	 * 
  	 */
  def prependListener(ev: java.lang.String, func: js.Function): js.Object = js.native
  /**
  	 * 
  	 * @brief 绑定一个事件处理函数到对象起始
  	 * @param map 指定事件映射关系，对象属性名称将作为事件名称，属性的值将作为事件处理函数
  	 * @return 返回成功绑定的数量，如果函数已绑定则返回 0
  	 * 
  	 * 
  	 * 
  	 */
  def prependListener(map: js.Object): js.Object = js.native
  /**
  	 * 
  	 * @brief 绑定一个事件处理函数到对象起始
  	 * @param ev 指定事件的名称
  	 * @param func 指定事件处理函数
  	 * @return 返回成功绑定的数量，如果函数已绑定则返回 0
  	 * 
  	 * 
  	 * 
  	 */
  def prependOnceListener(ev: java.lang.String, func: js.Function): js.Object = js.native
  /**
  	 * 
  	 * @brief 绑定一个事件处理函数到对象起始
  	 * @param map 指定事件映射关系，对象属性名称将作为事件名称，属性的值将作为事件处理函数
  	 * @return 返回成功绑定的数量，如果函数已绑定则返回 0
  	 * 
  	 * 
  	 * 
  	 */
  def prependOnceListener(map: js.Object): js.Object = js.native
  /**
  	 * 
  	 * @brief 从对象处理队列中取消所有事件的所有监听器， 如果指定事件，则移除指定事件的所有监听器。
  	 * @param evs 指定事件的名称
  	 * @return 返回事件对象本身，便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def removeAllListeners(): js.Object = js.native
  /**
  	 * 
  	 * @brief 从对象处理队列中取消所有事件的所有监听器， 如果指定事件，则移除指定事件的所有监听器。
  	 * @param evs 指定事件的名称
  	 * @return 返回事件对象本身，便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def removeAllListeners(evs: js.Array[_]): js.Object = js.native
  /**
  	 * 
  	 * @brief 取消对象处理队列中的全部函数
  	 * @param ev 指定事件的名称
  	 * @return 返回事件对象本身，便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def removeListener(ev: java.lang.String): js.Object = js.native
  /**
  	 * 
  	 * @brief 从对象处理队列中取消指定函数
  	 * @param ev 指定事件的名称
  	 * @param func 指定事件处理函数
  	 * @return 返回事件对象本身，便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def removeListener(ev: java.lang.String, func: js.Function): js.Object = js.native
  /**
  	 * 
  	 * @brief 从对象处理队列中取消指定函数
  	 * @param map 指定事件映射关系，对象属性名称作为事件名称，属性的值作为事件处理函数
  	 * @return 返回事件对象本身，便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def removeListener(map: js.Object): js.Object = js.native
  /**
  	 * 
  	 * 监听器的默认限制的数量，仅用于兼容
  	 * @param n 指定事件的数量
  	 * 
  	 * 
  	 * 
  	 */
  def setMaxListeners(n: scala.Double): scala.Unit = js.native
}
