package typings
package awsDashSdkLib.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVoicesInput extends js.Object {
  /**
    * Boolean value indicating whether to return any bilingual voices that use the specified language as an additional language. For instance, if you request all languages that use US English (es-US), and there is an Italian voice that speaks both Italian (it-IT) and US English, that voice will be included if you specify yes but not if you specify no.
    */
  var IncludeAdditionalLanguageCodes: js.UndefOr[IncludeAdditionalLanguageCodes] = js.undefined
  /**
    *  The language identification tag (ISO 639 code for the language name-ISO 3166 country code) for filtering the list of voices returned. If you don't specify this optional parameter, all available voices are returned. 
    */
  var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
  /**
    * An opaque pagination token returned from the previous DescribeVoices operation. If present, this indicates where to continue the listing.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeVoicesInput {
  @scala.inline
  def apply(
    IncludeAdditionalLanguageCodes: js.UndefOr[IncludeAdditionalLanguageCodes] = js.undefined,
    LanguageCode: LanguageCode = null,
    NextToken: NextToken = null
  ): DescribeVoicesInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IncludeAdditionalLanguageCodes)) __obj.updateDynamic("IncludeAdditionalLanguageCodes")(IncludeAdditionalLanguageCodes)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeVoicesInput]
  }
}

