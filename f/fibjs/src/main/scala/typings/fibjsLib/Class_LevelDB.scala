package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief LevelDB 数据库对象
	* @detail 用以创建和管理字典对象，创建方法：,```JavaScript,var db = require("db");,var test = new db.openLevelDB("test.db");,```
	*/
@JSGlobal("Class_LevelDB")
@js.native
class Class_LevelDB () extends Class__object {
  /**
  	 * 
  	 * @brief 在当前数据库上开启一个事务
  	 * @return 返回一个开启的事务对象
  	 * 
  	 * 
  	 */
  def begin(): Class_LevelDB = js.native
  /**
  	 * 
  	 * @brief 枚举数据库中键值在 from 和 to 之间的键值对
  	 * 
  	 * 回调函数有两个参数，(value, key)
  	 * 
  	 * ```JavaScript
  	 * var db = require("db");
  	 * var test = new db.openLevelDB("test.db");
  	 * 
  	 * test.between("aaa", "bbb", function(value, key){
  	 * ...
  	 * });
  	 * ```
  	 * @param from 枚举的最小键值，枚举时包含此键值
  	 * @param to 枚举的最大键值，枚举时不包含此键值
  	 * @param func 枚举回调函数
  	 * 
  	 * 
  	 * 
  	 */
  def between(from: Class_Buffer, to: Class_Buffer, func: js.Function): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 关闭当前数据库连接或事务
  	 * 
  	 * @async
  	 */
  def close(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 提交当前事务
  	 * 
  	 * 
  	 */
  def commit(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 枚举数据库中所有的键值对
  	 * 
  	 * 回调函数有两个参数，(value, key)
  	 * 
  	 * ```JavaScript
  	 * var db = require("db");
  	 * var test = new db.openLevelDB("test.db");
  	 * 
  	 * test.forEach(function(value, key){
  	 * ...
  	 * });
  	 * ```
  	 * @param func 枚举回调函数
  	 * 
  	 * 
  	 * 
  	 */
  def forEach(func: js.Function): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 查询指定键值的值
  	 * @param key 指定要查询的键值
  	 * @return 返回键值所对应的值，若不存在，则返回 null
  	 * 
  	 * 
  	 * @async
  	 */
  def get(key: Class_Buffer): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 检查数据库内是否存在指定键值的数据
  	 * @param key 指定要检查的键值
  	 * @return 返回键值是否存在
  	 * 
  	 * 
  	 * @async
  	 */
  def has(key: Class_Buffer): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 查询一组指定键值的值
  	 * @param keys 指定要查询的键值数组
  	 * @return 返回包含键值得数组
  	 * 
  	 * 
  	 * 
  	 */
  def mget(keys: js.Array[_]): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 删除一组指定键值的值
  	 * @param keys 指定要删除的键值数组
  	 * 
  	 * 
  	 * 
  	 */
  def mremove(keys: js.Array[_]): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 设定一组键值数据，键值不存在则插入新数据
  	 * @param map 指定要设定的键值数据字典
  	 * 
  	 * 
  	 * 
  	 */
  def mset(map: js.Object): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 删除指定键值的全部值
  	 * @param key 指定要删除的键值
  	 * 
  	 * 
  	 * @async
  	 */
  def remove(key: Class_Buffer): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 设定一个键值数据，键值不存在则插入新数据
  	 * @param key 指定要设定的键值
  	 * @param value 指定要设定的数据
  	 * 
  	 * 
  	 * @async
  	 */
  def set(key: Class_Buffer, value: Class_Buffer): scala.Unit = js.native
}

