package typings
package awsDashSdkLib.clientsTranscribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateVocabularyRequest extends js.Object {
  /**
    * The language code of the vocabulary entries.
    */
  var LanguageCode: awsDashSdkLib.clientsTranscribeserviceMod.LanguageCode
  /**
    * An array of strings containing the vocabulary entries.
    */
  var Phrases: js.UndefOr[Phrases] = js.undefined
  /**
    * The S3 location of the text file that contains the definition of the custom vocabulary. The URI must be in the same region as the API endpoint that you are calling. The general form is    https://s3-&lt;aws-region&gt;.amazonaws.com/&lt;bucket-name&gt;/&lt;keyprefix&gt;/&lt;objectkey&gt;   For example:  https://s3-us-east-1.amazonaws.com/examplebucket/vocab.txt  For more information about S3 object names, see Object Keys in the Amazon S3 Developer Guide. For more information about custom vocabularies, see Custom Vocabularies.
    */
  var VocabularyFileUri: js.UndefOr[Uri] = js.undefined
  /**
    * The name of the vocabulary to update. The name is case-sensitive.
    */
  var VocabularyName: awsDashSdkLib.clientsTranscribeserviceMod.VocabularyName
}

object UpdateVocabularyRequest {
  @scala.inline
  def apply(
    LanguageCode: LanguageCode,
    VocabularyName: VocabularyName,
    Phrases: Phrases = null,
    VocabularyFileUri: Uri = null
  ): UpdateVocabularyRequest = {
    val __obj = js.Dynamic.literal(LanguageCode = LanguageCode.asInstanceOf[js.Any], VocabularyName = VocabularyName)
    if (Phrases != null) __obj.updateDynamic("Phrases")(Phrases)
    if (VocabularyFileUri != null) __obj.updateDynamic("VocabularyFileUri")(VocabularyFileUri)
    __obj.asInstanceOf[UpdateVocabularyRequest]
  }
}

