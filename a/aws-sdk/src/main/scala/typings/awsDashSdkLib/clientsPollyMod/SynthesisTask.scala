package typings
package awsDashSdkLib.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SynthesisTask extends js.Object {
  /**
    * Timestamp for the time the synthesis task was started.
    */
  var CreationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Optional language code for a synthesis task. This is only necessary if using a bilingual voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).  If a bilingual voice is used and no language code is specified, Amazon Polly will use the default language of the bilingual voice. The default language for any voice is the one returned by the DescribeVoices operation for the LanguageCode parameter. For example, if no language code is specified, Aditi will use Indian English rather than Hindi.
    */
  var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
  /**
    * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are applied only if the language of the lexicon is the same as the language of the voice. 
    */
  var LexiconNames: js.UndefOr[LexiconNameList] = js.undefined
  /**
    * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will be json. 
    */
  var OutputFormat: js.UndefOr[OutputFormat] = js.undefined
  /**
    * Pathway for the output speech file.
    */
  var OutputUri: js.UndefOr[OutputUri] = js.undefined
  /**
    * Number of billable characters synthesized.
    */
  var RequestCharacters: js.UndefOr[RequestCharacters] = js.undefined
  /**
    * The audio frequency specified in Hz. The valid values for mp3 and ogg_vorbis are "8000", "16000", and "22050". The default value is "22050". Valid values for pcm are "8000" and "16000" The default value is "16000". 
    */
  var SampleRate: js.UndefOr[SampleRate] = js.undefined
  /**
    * ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
    */
  var SnsTopicArn: js.UndefOr[SnsTopicArn] = js.undefined
  /**
    * The type of speech marks returned for the input text.
    */
  var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.undefined
  /**
    * The Amazon Polly generated identifier for a speech synthesis task.
    */
  var TaskId: js.UndefOr[TaskId] = js.undefined
  /**
    * Current status of the individual speech synthesis task.
    */
  var TaskStatus: js.UndefOr[TaskStatus] = js.undefined
  /**
    * Reason for the current status of a specific speech synthesis task, including errors if the task has failed.
    */
  var TaskStatusReason: js.UndefOr[TaskStatusReason] = js.undefined
  /**
    * Specifies whether the input text is plain text or SSML. The default value is plain text. 
    */
  var TextType: js.UndefOr[TextType] = js.undefined
  /**
    * Voice ID to use for the synthesis. 
    */
  var VoiceId: js.UndefOr[VoiceId] = js.undefined
}

object SynthesisTask {
  @scala.inline
  def apply(
    CreationTime: DateTime = null,
    LanguageCode: LanguageCode = null,
    LexiconNames: LexiconNameList = null,
    OutputFormat: OutputFormat = null,
    OutputUri: OutputUri = null,
    RequestCharacters: js.UndefOr[RequestCharacters] = js.undefined,
    SampleRate: SampleRate = null,
    SnsTopicArn: SnsTopicArn = null,
    SpeechMarkTypes: SpeechMarkTypeList = null,
    TaskId: TaskId = null,
    TaskStatus: TaskStatus = null,
    TaskStatusReason: TaskStatusReason = null,
    TextType: TextType = null,
    VoiceId: VoiceId = null
  ): SynthesisTask = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (LanguageCode != null) __obj.updateDynamic("LanguageCode")(LanguageCode.asInstanceOf[js.Any])
    if (LexiconNames != null) __obj.updateDynamic("LexiconNames")(LexiconNames)
    if (OutputFormat != null) __obj.updateDynamic("OutputFormat")(OutputFormat.asInstanceOf[js.Any])
    if (OutputUri != null) __obj.updateDynamic("OutputUri")(OutputUri)
    if (!js.isUndefined(RequestCharacters)) __obj.updateDynamic("RequestCharacters")(RequestCharacters)
    if (SampleRate != null) __obj.updateDynamic("SampleRate")(SampleRate)
    if (SnsTopicArn != null) __obj.updateDynamic("SnsTopicArn")(SnsTopicArn)
    if (SpeechMarkTypes != null) __obj.updateDynamic("SpeechMarkTypes")(SpeechMarkTypes)
    if (TaskId != null) __obj.updateDynamic("TaskId")(TaskId)
    if (TaskStatus != null) __obj.updateDynamic("TaskStatus")(TaskStatus.asInstanceOf[js.Any])
    if (TaskStatusReason != null) __obj.updateDynamic("TaskStatusReason")(TaskStatusReason)
    if (TextType != null) __obj.updateDynamic("TextType")(TextType.asInstanceOf[js.Any])
    if (VoiceId != null) __obj.updateDynamic("VoiceId")(VoiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesisTask]
  }
}

