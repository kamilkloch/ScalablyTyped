package typings
package jweixinLib.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================微信卡券================================*/
trait IchooseCard extends BaseParams {
   // 卡券类型
  var cardId: java.lang.String
   // 签名方式，默认'SHA1'
  var cardSign: java.lang.String
   // 门店Id
  var cardType: java.lang.String
   // 卡券签名时间戳
  var nonceStr: java.lang.String
  var shopId: java.lang.String
   // 卡券签名随机串
  var signType: java.lang.String
   // 卡券Id
  var timestamp: scala.Double
   // 卡券签名
  @JSName("success")
  def success_MIchooseCard(res: jweixinLib.Anon_CardList): scala.Unit
}

object IchooseCard {
  @scala.inline
  def apply(
    cardId: java.lang.String,
    cardSign: java.lang.String,
    cardType: java.lang.String,
    nonceStr: java.lang.String,
    shopId: java.lang.String,
    signType: java.lang.String,
    success: jweixinLib.Anon_CardList => scala.Unit,
    timestamp: scala.Double,
    complete: /* repeated */ js.Any => scala.Unit = null,
    fail: /* repeated */ js.Any => scala.Unit = null
  ): IchooseCard = {
    val __obj = js.Dynamic.literal(cardId = cardId, cardSign = cardSign, cardType = cardType, nonceStr = nonceStr, shopId = shopId, signType = signType, success = js.Any.fromFunction1(success), timestamp = timestamp)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[IchooseCard]
  }
}

