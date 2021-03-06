package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectSyntaxRequest extends js.Object {
  /**
    * The language code of the input documents. You can specify English ("en") or Spanish ("es").
    */
  var LanguageCode: SyntaxLanguageCode
  /**
    * A UTF-8 string. Each string must contain fewer that 5,000 bytes of UTF encoded characters.
    */
  var Text: String
}

object DetectSyntaxRequest {
  @scala.inline
  def apply(LanguageCode: SyntaxLanguageCode, Text: String): DetectSyntaxRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], Text = Text)
  
    __obj.asInstanceOf[DetectSyntaxRequest]
  }
}

