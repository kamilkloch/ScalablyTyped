package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseLocationSuccess extends js.Object {
  /**
    * 详细地址
    */
  var address: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 纬度，浮点数，范围为-90~90，负数表示南纬
    */
  var latitude: js.UndefOr[scala.Double] = js.undefined
  /**
    * 经度，范围为-180~180，负数表示西经
    */
  var longitude: js.UndefOr[scala.Double] = js.undefined
  /**
    * 位置名称
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object ChooseLocationSuccess {
  @scala.inline
  def apply(
    address: java.lang.String = null,
    latitude: scala.Int | scala.Double = null,
    longitude: scala.Int | scala.Double = null,
    name: java.lang.String = null
  ): ChooseLocationSuccess = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ChooseLocationSuccess]
  }
}

