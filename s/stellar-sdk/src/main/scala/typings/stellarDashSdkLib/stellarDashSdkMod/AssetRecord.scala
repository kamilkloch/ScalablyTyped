package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AssetRecord extends Record {
  var amount: java.lang.String
  var asset_code: java.lang.String
  var asset_issuer: java.lang.String
  var asset_type: stellarDashSdkLib.stellarDashSdkLibStrings.credit_alphanum4 | stellarDashSdkLib.stellarDashSdkLibStrings.credit_alphanum12
  var flags: stellarDashSdkLib.Anon_Authrevocable
  var num_accounts: scala.Double
  var paging_token: java.lang.String
}
