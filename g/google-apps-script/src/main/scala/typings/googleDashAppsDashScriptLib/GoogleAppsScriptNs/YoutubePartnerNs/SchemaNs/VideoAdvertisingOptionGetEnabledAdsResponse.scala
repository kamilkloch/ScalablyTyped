package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoAdvertisingOptionGetEnabledAdsResponse extends js.Object {
  var adBreaks: js.UndefOr[js.Array[AdBreak]] = js.undefined
  var adsOnEmbeds: js.UndefOr[scala.Boolean] = js.undefined
  var countriesRestriction: js.UndefOr[js.Array[CountriesRestriction]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object VideoAdvertisingOptionGetEnabledAdsResponse {
  @scala.inline
  def apply(
    adBreaks: js.Array[AdBreak] = null,
    adsOnEmbeds: js.UndefOr[scala.Boolean] = js.undefined,
    countriesRestriction: js.Array[CountriesRestriction] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null
  ): VideoAdvertisingOptionGetEnabledAdsResponse = {
    val __obj = js.Dynamic.literal()
    if (adBreaks != null) __obj.updateDynamic("adBreaks")(adBreaks)
    if (!js.isUndefined(adsOnEmbeds)) __obj.updateDynamic("adsOnEmbeds")(adsOnEmbeds)
    if (countriesRestriction != null) __obj.updateDynamic("countriesRestriction")(countriesRestriction)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[VideoAdvertisingOptionGetEnabledAdsResponse]
  }
}

