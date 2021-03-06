package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief x509 证书对象
	* @detail X509Cert 对象属于 crypto 模块，创建：,```JavaScript,var k = new crypto.X509Cert();,```
	*/
@JSGlobal("Class_X509Cert")
@js.native
/**
	 * 
	 * @brief X509Cert 构造函数
	 * 
	 * 
	 */
class Class_X509Cert () extends Class__object {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取证书是否是 ca 证书
  	 * 
  	 * @readonly
  	 * @type Boolean
  	 */
  var ca: scala.Boolean = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取证书颁发者的可分辨名称
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var issuer: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取证书链中得下一个证书
  	 * 
  	 * @readonly
  	 * @type X509Cert
  	 */
  var next: Class_X509Cert = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取证书的到期时间
  	 * 
  	 * @readonly
  	 * @type Date
  	 */
  var notAfter: stdLib.Date = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取证书的生效时间
  	 * 
  	 * @readonly
  	 * @type Date
  	 */
  var notBefore: stdLib.Date = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取证书的 pathlen
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var pathlen: scala.Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取证书的公钥
  	 * 
  	 * @readonly
  	 * @type PKey
  	 */
  var publicKey: Class_PKey = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取证书的序列号
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var serial: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取证书的主题可分辨名称
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var subject: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取证书的 Netscape 证书类型
  	 * 
  	 * 结果为全部或部分以下内容：client, server, email, objsign, reserved, sslCA, emailCA, objCA
  	 * 
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var `type`: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取证书的使用范围
  	 * 
  	 * 结果为全部或部分以下内容：digitalSignature, nonRepudiation, keyEncipherment, dataEncipherment, keyAgreement, keyCertSign, cRLSign
  	 * 
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var usage: java.lang.String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 获取证书的版本
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var version: scala.Double = js.native
  /**
  	 * 
  	 * @brief 清空已经加载的证书
  	 * 
  	 * 
  	 */
  def clear(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 导出已经加载的证书
  	 * @return 以数组方式导出证书链
  	 * 
  	 * 
  	 * 
  	 */
  def dump(): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 加载一个 DER 格式的证书，可多次调用
  	 * @param derCert DER 格式的证书
  	 * 
  	 * 
  	 * 
  	 */
  def load(derCert: Class_Buffer): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 加载一个 CRT/PEM/TXT 格式的证书，可多次调用
  	 * 
  	 * load 加载 mozilla 的 certdata,txt， 可于 http://hg.mozilla.org/releases/mozilla-release/raw-file/default/security/nss/lib/ckfw/builtins/certdata.txt 下载使用
  	 * @param txtCert PEM 格式的证书
  	 * 
  	 * 
  	 * 
  	 */
  def load(txtCert: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 加载一个 CRT/PEM/DER/TXT 格式的证书，可多次调用
  	 * 
  	 * loadFile 加载 mozilla 的 certdata,txt， 可于 http://hg.mozilla.org/releases/mozilla-release/raw-file/default/security/nss/lib/ckfw/builtins/certdata.txt 下载使用
  	 * @param filename 证书文件名
  	 * 
  	 * 
  	 * 
  	 */
  def loadFile(filename: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 加载自带的缺省根证书
  	 * 此证书内容源自：http://hg.mozilla.org/releases/mozilla-release/raw-file/default/security/nss/lib/ckfw/builtins/certdata.txt
  	 * 
  	 * 
  	 */
  def loadRootCerts(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 使用当前证书链验证给定的证书
  	 * @param cert 给定需要验证的证书
  	 * @return 如果验证成功则返回 True
  	 * 
  	 * 
  	 * @async
  	 */
  def verify(cert: Class_X509Cert): scala.Boolean = js.native
}

