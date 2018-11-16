package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/mediaconvert", "MediaConvert")
@js.native
object MediaConvertNs extends js.Object {
  
  trait AacSettings extends js.Object {
    var AudioDescriptionBroadcasterMix: js.UndefOr[AacAudioDescriptionBroadcasterMix] = js.undefined
    /**
         * Average bitrate in bits/second. Defaults and valid values depend on rate control mode and profile.
         */
    var Bitrate: js.UndefOr[__integerMin6000Max1024000] = js.undefined
    var CodecProfile: js.UndefOr[AacCodecProfile] = js.undefined
    var CodingMode: js.UndefOr[AacCodingMode] = js.undefined
    var RateControlMode: js.UndefOr[AacRateControlMode] = js.undefined
    var RawFormat: js.UndefOr[AacRawFormat] = js.undefined
    /**
         * Sample rate in Hz. Valid values depend on rate control mode and profile.
         */
    var SampleRate: js.UndefOr[__integerMin8000Max96000] = js.undefined
    var Specification: js.UndefOr[AacSpecification] = js.undefined
    var VbrQuality: js.UndefOr[AacVbrQuality] = js.undefined
  }
  
  
  trait Ac3Settings extends js.Object {
    /**
         * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
         */
    var Bitrate: js.UndefOr[__integerMin64000Max640000] = js.undefined
    var BitstreamMode: js.UndefOr[Ac3BitstreamMode] = js.undefined
    var CodingMode: js.UndefOr[Ac3CodingMode] = js.undefined
    /**
         * Sets the dialnorm for the output. If blank and input audio is Dolby Digital, dialnorm will be passed through.
         */
    var Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined
    var DynamicRangeCompressionProfile: js.UndefOr[Ac3DynamicRangeCompressionProfile] = js.undefined
    var LfeFilter: js.UndefOr[Ac3LfeFilter] = js.undefined
    var MetadataControl: js.UndefOr[Ac3MetadataControl] = js.undefined
    /**
         * Sample rate in hz. Sample rate is always 48000.
         */
    var SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined
  }
  
  
  trait AiffSettings extends js.Object {
    /**
         * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
         */
    var BitDepth: js.UndefOr[__integerMin16Max24] = js.undefined
    /**
         * Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console will give you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
         */
    var Channels: js.UndefOr[__integerMin1Max2] = js.undefined
    /**
         * Sample rate in hz.
         */
    var SampleRate: js.UndefOr[__integerMin8000Max192000] = js.undefined
  }
  
  
  trait AncillarySourceSettings extends js.Object {
    /**
         * Specifies the 608 channel number in the ancillary data track from which to extract captions. Unused for passthrough.
         */
    var SourceAncillaryChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined
  }
  
  
  trait AudioCodecSettings extends js.Object {
    var AacSettings: js.UndefOr[AacSettings] = js.undefined
    var Ac3Settings: js.UndefOr[Ac3Settings] = js.undefined
    var AiffSettings: js.UndefOr[AiffSettings] = js.undefined
    var Codec: js.UndefOr[AudioCodec] = js.undefined
    var Eac3Settings: js.UndefOr[Eac3Settings] = js.undefined
    var Mp2Settings: js.UndefOr[Mp2Settings] = js.undefined
    var WavSettings: js.UndefOr[WavSettings] = js.undefined
  }
  
  
  trait AudioDescription extends js.Object {
    var AudioNormalizationSettings: js.UndefOr[AudioNormalizationSettings] = js.undefined
    /**
         * Specifies which audio data to use from each input. In the simplest case, specify an "Audio Selector":#inputs-audio_selector by name based on its order within each input. For example if you specify "Audio Selector 3", then the third audio selector will be used from each input. If an input does not have an "Audio Selector 3", then the audio selector marked as "default" in that input will be used. If there is no audio selector marked as "default", silence will be inserted for the duration of that input. Alternatively, an "Audio Selector Group":#inputs-audio_selector_group name may be specified, with similar default/silence behavior. If no audio_source_name is specified, then "Audio Selector 1" will be chosen automatically.
         */
    var AudioSourceName: js.UndefOr[__string] = js.undefined
    /**
         * Applies only if Follow Input Audio Type is unchecked (false). A number between 0 and 255. The following are defined in ISO-IEC 13818-1: 0 = Undefined, 1 = Clean Effects, 2 = Hearing Impaired, 3 = Visually Impaired Commentary, 4-255 = Reserved.
         */
    var AudioType: js.UndefOr[__integerMin0Max255] = js.undefined
    var AudioTypeControl: js.UndefOr[AudioTypeControl] = js.undefined
    var CodecSettings: js.UndefOr[AudioCodecSettings] = js.undefined
    /**
         * Specify the language for this audio output track, using the ISO 639-2 or ISO 639-3 three-letter language code. The language specified will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected but there is no ISO 639 language code specified by the input.
         */
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined
    /**
         * Indicates the language of the audio output track. The ISO 639 language specified in the 'Language Code' drop down will be used when 'Follow Input Language Code' is not selected or when 'Follow Input Language Code' is selected but there is no ISO 639 language code specified by the input.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    var LanguageCodeControl: js.UndefOr[AudioLanguageCodeControl] = js.undefined
    /**
         * Advanced audio remixing settings.
         */
    var RemixSettings: js.UndefOr[RemixSettings] = js.undefined
    /**
         * Used for MS Smooth and Apple HLS outputs. Indicates the name displayed by the player (eg. English, or Director Commentary). Alphanumeric characters, spaces, and underscore are legal.
         */
    var StreamName: js.UndefOr[__stringPatternWS] = js.undefined
  }
  
  
  trait AudioNormalizationSettings extends js.Object {
    var Algorithm: js.UndefOr[AudioNormalizationAlgorithm] = js.undefined
    var AlgorithmControl: js.UndefOr[AudioNormalizationAlgorithmControl] = js.undefined
    /**
         * Content measuring above this level will be corrected to the target level. Content measuring below this level will not be corrected. Gating only applies when not using real_time_correction.
         */
    var CorrectionGateLevel: js.UndefOr[__integerMinNegative70Max0] = js.undefined
    var LoudnessLogging: js.UndefOr[AudioNormalizationLoudnessLogging] = js.undefined
    var PeakCalculation: js.UndefOr[AudioNormalizationPeakCalculation] = js.undefined
    /**
         * Target LKFS(loudness) to adjust volume to. If no value is entered, a default value will be used according to the chosen algorithm. The CALM Act (1770-1) recommends a target of -24 LKFS. The EBU R-128 specification (1770-2) recommends a target of -23 LKFS.
         */
    var TargetLkfs: js.UndefOr[__doubleMinNegative59Max0] = js.undefined
  }
  
  
  trait AudioSelector extends js.Object {
    /**
         * Selects a specific language code from within an audio source, using the ISO 639-2 or ISO 639-3 three-letter language code
         */
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined
    var DefaultSelection: js.UndefOr[AudioDefaultSelection] = js.undefined
    /**
         * Specifies audio data from an external file source.
         */
    var ExternalAudioFileInput: js.UndefOr[
        __stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE
      ] = js.undefined
    /**
         * Selects a specific language code from within an audio source.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * Specifies a time delta in milliseconds to offset the audio from the input video.
         */
    var Offset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    /**
         * Selects a specific PID from within an audio source (e.g. 257 selects PID 0x101).
         */
    var Pids: js.UndefOr[__listOf__integerMin1Max2147483647] = js.undefined
    /**
         * Use this setting for input streams that contain Dolby E, to have the service extract specific program data from the track. To select multiple programs, create multiple selectors with the same Track and different Program numbers. In the console, this setting is visible when you set Selector type to Track. Choose the program number from the dropdown list. If you are sending a JSON file, provide the program ID, which is part of the audio metadata. If your input file has incorrect metadata, you can choose All channels instead of a program number to have the service ignore the program IDs and include all the programs in the track.
         */
    var ProgramSelection: js.UndefOr[__integerMin0Max8] = js.undefined
    /**
         * Use these settings to reorder the audio channels of one input to match those of another input. This allows you to combine the two files into a single output, one after the other.
         */
    var RemixSettings: js.UndefOr[RemixSettings] = js.undefined
    var SelectorType: js.UndefOr[AudioSelectorType] = js.undefined
    /**
         * Identify a track from the input audio to include in this selector by entering the track index number. To include several tracks in a single audio selector, specify multiple tracks as follows. Using the console, enter a comma-separated list. For examle, type "1,2,3" to include tracks 1 through 3. Specifying directly in your JSON job file, provide the track numbers in an array. For example, "tracks": [1,2,3].
         */
    var Tracks: js.UndefOr[__listOf__integerMin1Max2147483647] = js.undefined
  }
  
  
  trait AudioSelectorGroup extends js.Object {
    /**
         * Name of an Audio Selector within the same input to include in the group.  Audio selector names are standardized, based on their order within the input (e.g., "Audio Selector 1"). The audio selector name parameter can be repeated to add any number of audio selectors to the group.
         */
    var AudioSelectorNames: js.UndefOr[__listOf__stringMin1] = js.undefined
  }
  
  
  trait AvailBlanking extends js.Object {
    /**
         * Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
         */
    var AvailBlankingImage: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNG] = js.undefined
  }
  
  
  trait BurninDestinationSettings extends js.Object {
    var Alignment: js.UndefOr[BurninSubtitleAlignment] = js.undefined
    var BackgroundColor: js.UndefOr[BurninSubtitleBackgroundColor] = js.undefined
    /**
         * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
         */
    var BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
    var FontColor: js.UndefOr[BurninSubtitleFontColor] = js.undefined
    /**
         * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent.
    All burn-in and DVB-Sub font settings must match.
         */
    var FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
         * Font resolution in DPI (dots per inch); default is 96 dpi.
    All burn-in and DVB-Sub font settings must match.
         */
    var FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined
    /**
         * A positive integer indicates the exact font size in points. Set to 0 for automatic font size selection. All burn-in and DVB-Sub font settings must match.
         */
    var FontSize: js.UndefOr[__integerMin0Max96] = js.undefined
    var OutlineColor: js.UndefOr[BurninSubtitleOutlineColor] = js.undefined
    /**
         * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
         */
    var OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined
    var ShadowColor: js.UndefOr[BurninSubtitleShadowColor] = js.undefined
    /**
         * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
         */
    var ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
         * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels to the left. All burn-in and DVB-Sub font settings must match.
         */
    var ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    /**
         * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels above the text. All burn-in and DVB-Sub font settings must match.
         */
    var ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    var TeletextSpacing: js.UndefOr[BurninSubtitleTeletextSpacing] = js.undefined
    /**
         * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit x_position is provided, the horizontal caption position will be determined by the alignment parameter. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
         */
    var XPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    /**
         * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is provided, the caption will be positioned towards the bottom of the output. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
         */
    var YPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  }
  
  
  trait CancelJobRequest extends js.Object {
    /**
         * The Job ID of the job to be cancelled.
         */
    var Id: __string
  }
  
  
  trait CancelJobResponse extends js.Object
  
  
  trait CaptionDescription extends js.Object {
    /**
         * Specifies which "Caption Selector":#inputs-caption_selector to use from each input when generating captions. The name should be of the format "Caption Selector ", which denotes that the Nth Caption Selector will be used from each input.
         */
    var CaptionSelectorName: js.UndefOr[__stringMin1] = js.undefined
    /**
         * Indicates the language of the caption output track, using the ISO 639-2 or ISO 639-3 three-letter language code
         */
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined
    var DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined
    /**
         * Indicates the language of the caption output track.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * Human readable information to indicate captions available for players (eg. English, or Spanish). Alphanumeric characters, spaces, and underscore are legal.
         */
    var LanguageDescription: js.UndefOr[__string] = js.undefined
  }
  
  
  trait CaptionDescriptionPreset extends js.Object {
    /**
         * Indicates the language of the caption output track, using the ISO 639-2 or ISO 639-3 three-letter language code
         */
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined
    var DestinationSettings: js.UndefOr[CaptionDestinationSettings] = js.undefined
    /**
         * Indicates the language of the caption output track.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * Human readable information to indicate captions available for players (eg. English, or Spanish). Alphanumeric characters, spaces, and underscore are legal.
         */
    var LanguageDescription: js.UndefOr[__string] = js.undefined
  }
  
  
  trait CaptionDestinationSettings extends js.Object {
    var BurninDestinationSettings: js.UndefOr[BurninDestinationSettings] = js.undefined
    var DestinationType: js.UndefOr[CaptionDestinationType] = js.undefined
    var DvbSubDestinationSettings: js.UndefOr[DvbSubDestinationSettings] = js.undefined
    var SccDestinationSettings: js.UndefOr[SccDestinationSettings] = js.undefined
    var TeletextDestinationSettings: js.UndefOr[TeletextDestinationSettings] = js.undefined
    var TtmlDestinationSettings: js.UndefOr[TtmlDestinationSettings] = js.undefined
  }
  
  
  trait CaptionSelector extends js.Object {
    /**
         * The specific language to extract from source, using the ISO 639-2 or ISO 639-3 three-letter language code. If input is SCTE-27, complete this field and/or PID to select the caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or PID to select the caption language to extract. If input is DVB-Sub that is being passed through, omit this field (and PID field); there is no way to extract a specific language with pass-through captions.
         */
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined
    /**
         * The specific language to extract from source. If input is SCTE-27, complete this field and/or PID to select the caption language to extract. If input is DVB-Sub and output is Burn-in or SMPTE-TT, complete this field and/or PID to select the caption language to extract. If input is DVB-Sub that is being passed through, omit this field (and PID field); there is no way to extract a specific language with pass-through captions.
         */
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    var SourceSettings: js.UndefOr[CaptionSourceSettings] = js.undefined
  }
  
  
  trait CaptionSourceSettings extends js.Object {
    var AncillarySourceSettings: js.UndefOr[AncillarySourceSettings] = js.undefined
    var DvbSubSourceSettings: js.UndefOr[DvbSubSourceSettings] = js.undefined
    var EmbeddedSourceSettings: js.UndefOr[EmbeddedSourceSettings] = js.undefined
    var FileSourceSettings: js.UndefOr[FileSourceSettings] = js.undefined
    var SourceType: js.UndefOr[CaptionSourceType] = js.undefined
    var TeletextSourceSettings: js.UndefOr[TeletextSourceSettings] = js.undefined
  }
  
  
  trait ChannelMapping extends js.Object {
    /**
         * List of output channels
         */
    var OutputChannels: js.UndefOr[__listOfOutputChannelMapping] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CmafEncryptionSettings extends js.Object {
    /**
         * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then the Initialization Vector will follow the segment number by default.
         */
    var ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32] = js.undefined
    var EncryptionMethod: js.UndefOr[CmafEncryptionType] = js.undefined
    var InitializationVectorInManifest: js.UndefOr[CmafInitializationVectorInManifest] = js.undefined
    var StaticKeyProvider: js.UndefOr[StaticKeyProvider] = js.undefined
    var Type: js.UndefOr[CmafKeyProviderType] = js.undefined
  }
  
  
  trait CmafGroupSettings extends js.Object {
    /**
         * A partial URI prefix that will be put in the manifest file at the top level BaseURL element. Can be used if streams are delivered from a different URL than the manifest file.
         */
    var BaseUrl: js.UndefOr[__string] = js.undefined
    var ClientCache: js.UndefOr[CmafClientCache] = js.undefined
    var CodecSpecification: js.UndefOr[CmafCodecSpecification] = js.undefined
    /**
         * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
         */
    var Destination: js.UndefOr[__stringPatternS3] = js.undefined
    /**
         * DRM settings.
         */
    var Encryption: js.UndefOr[CmafEncryptionSettings] = js.undefined
    /**
         * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate. Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
         */
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    var ManifestCompression: js.UndefOr[CmafManifestCompression] = js.undefined
    var ManifestDurationFormat: js.UndefOr[CmafManifestDurationFormat] = js.undefined
    /**
         * Minimum time of initially buffered media that is needed to ensure smooth playout.
         */
    var MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    /**
         * Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices play back the end of your video asset. If you know that player devices are hanging on the final segment of your video because the length of your final segment is too short, use this setting to specify a minimum final segment length, in seconds. Choose a value that is greater than or equal to 1 and less than your segment length. When you specify a value for this setting, the encoder will combine any final segment that is shorter than the length that you specify with the previous segment. For example, your segment length is 3 seconds and your final segment is .5 seconds without a minimum final segment length; when you set the minimum final segment length to 1, your final segment is 3.5 seconds.
         */
    var MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647] = js.undefined
    var SegmentControl: js.UndefOr[CmafSegmentControl] = js.undefined
    /**
         * Use this setting to specify the length, in seconds, of each individual CMAF segment. This value applies to the whole package; that is, to every output in the output group. Note that segments end on the first keyframe after this number of seconds, so the actual segment length might be slightly longer. If you set Segment control (CmafSegmentControl) to single file, the service puts the content of each output in a single file that has metadata that marks these segments. If you set it to segmented files, the service creates multiple files for each output, each with the content of one segment.
         */
    var SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    var StreamInfResolution: js.UndefOr[CmafStreamInfResolution] = js.undefined
    var WriteDashManifest: js.UndefOr[CmafWriteDASHManifest] = js.undefined
    var WriteHlsManifest: js.UndefOr[CmafWriteHLSManifest] = js.undefined
  }
  
  
  trait ColorCorrector extends js.Object {
    /**
         * Brightness level.
         */
    var Brightness: js.UndefOr[__integerMin1Max100] = js.undefined
    var ColorSpaceConversion: js.UndefOr[ColorSpaceConversion] = js.undefined
    /**
         * Contrast level.
         */
    var Contrast: js.UndefOr[__integerMin1Max100] = js.undefined
    var Hdr10Metadata: js.UndefOr[Hdr10Metadata] = js.undefined
    /**
         * Hue in degrees.
         */
    var Hue: js.UndefOr[__integerMinNegative180Max180] = js.undefined
    /**
         * Saturation level.
         */
    var Saturation: js.UndefOr[__integerMin1Max100] = js.undefined
  }
  
  
  trait ContainerSettings extends js.Object {
    var Container: js.UndefOr[ContainerType] = js.undefined
    var F4vSettings: js.UndefOr[F4vSettings] = js.undefined
    var M2tsSettings: js.UndefOr[M2tsSettings] = js.undefined
    var M3u8Settings: js.UndefOr[M3u8Settings] = js.undefined
    var MovSettings: js.UndefOr[MovSettings] = js.undefined
    var Mp4Settings: js.UndefOr[Mp4Settings] = js.undefined
  }
  
  
  trait CreateJobRequest extends js.Object {
    var BillingTagsSource: js.UndefOr[BillingTagsSource] = js.undefined
    /**
         * Idempotency token for CreateJob operation.
         */
    var ClientRequestToken: js.UndefOr[__string] = js.undefined
    /**
         * When you create a job, you can either specify a job template or specify the transcoding settings individually
         */
    var JobTemplate: js.UndefOr[__string] = js.undefined
    /**
         * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the default queue. For more about queues, see the User Guide topic at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html.
         */
    var Queue: js.UndefOr[__string] = js.undefined
    /**
         * Required. The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html.
         */
    var Role: __string
    var Settings: JobSettings
    /**
         * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value pairs.
         */
    var UserMetadata: js.UndefOr[__mapOf__string] = js.undefined
  }
  
  
  trait CreateJobResponse extends js.Object {
    var Job: js.UndefOr[Job] = js.undefined
  }
  
  
  trait CreateJobTemplateRequest extends js.Object {
    /**
         * Optional. A category for the job template you are creating
         */
    var Category: js.UndefOr[__string] = js.undefined
    /**
         * Optional. A description of the job template you are creating.
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * The name of the job template you are creating.
         */
    var Name: __string
    /**
         * Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs will go to the default queue.
         */
    var Queue: js.UndefOr[__string] = js.undefined
    var Settings: JobTemplateSettings
    /**
         * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
         */
    var Tags: js.UndefOr[__mapOf__string] = js.undefined
  }
  
  
  trait CreateJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate] = js.undefined
  }
  
  
  trait CreatePresetRequest extends js.Object {
    /**
         * Optional. A category for the preset you are creating.
         */
    var Category: js.UndefOr[__string] = js.undefined
    /**
         * Optional. A description of the preset you are creating.
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * The name of the preset you are creating.
         */
    var Name: __string
    var Settings: PresetSettings
    /**
         * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
         */
    var Tags: js.UndefOr[__mapOf__string] = js.undefined
  }
  
  
  trait CreatePresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset] = js.undefined
  }
  
  
  trait CreateQueueRequest extends js.Object {
    /**
         * Optional. A description of the queue that you are creating.
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * The name of the queue that you are creating.
         */
    var Name: __string
    /**
         * Optional; default is on-demand. Specifies whether the pricing plan for the queue is on-demand or reserved. The pricing plan for the queue determines whether you pay on-demand or reserved pricing for the transcoding jobs you run through the queue. For reserved queue pricing, you must set up a contract. You can create a reserved queue contract through the AWS Elemental MediaConvert console.
         */
    var PricingPlan: js.UndefOr[PricingPlan] = js.undefined
    /**
         * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
         */
    var ReservationPlanSettings: js.UndefOr[ReservationPlanSettings] = js.undefined
    /**
         * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
         */
    var Tags: js.UndefOr[__mapOf__string] = js.undefined
  }
  
  
  trait CreateQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue] = js.undefined
  }
  
  
  trait DashIsoEncryptionSettings extends js.Object {
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined
  }
  
  
  trait DashIsoGroupSettings extends js.Object {
    /**
         * A partial URI prefix that will be put in the manifest (.mpd) file at the top level BaseURL element. Can be used if streams are delivered from a different URL than the manifest file.
         */
    var BaseUrl: js.UndefOr[__string] = js.undefined
    /**
         * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
         */
    var Destination: js.UndefOr[__stringPatternS3] = js.undefined
    /**
         * DRM settings.
         */
    var Encryption: js.UndefOr[DashIsoEncryptionSettings] = js.undefined
    /**
         * Length of fragments to generate (in seconds). Fragment length must be compatible with GOP size and Framerate. Note that fragments will end on the next keyframe after this number of seconds, so actual fragment length may be longer. When Emit Single File is checked, the fragmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
         */
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    var HbbtvCompliance: js.UndefOr[DashIsoHbbtvCompliance] = js.undefined
    /**
         * Minimum time of initially buffered media that is needed to ensure smooth playout.
         */
    var MinBufferTime: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    var SegmentControl: js.UndefOr[DashIsoSegmentControl] = js.undefined
    /**
         * Length of mpd segments to create (in seconds). Note that segments will end on the next keyframe after this number of seconds, so actual segment length may be longer. When Emit Single File is checked, the segmentation is internal to a single output file and it does not cause the creation of many output files as in other output types.
         */
    var SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    /**
         * When ENABLED, segment durations are indicated in the manifest using SegmentTimeline and SegmentTimeline will be promoted down into Representation from AdaptationSet.
         */
    var WriteSegmentTimelineInRepresentation: js.UndefOr[DashIsoWriteSegmentTimelineInRepresentation] = js.undefined
  }
  
  
  trait Deinterlacer extends js.Object {
    var Algorithm: js.UndefOr[DeinterlaceAlgorithm] = js.undefined
    var Control: js.UndefOr[DeinterlacerControl] = js.undefined
    var Mode: js.UndefOr[DeinterlacerMode] = js.undefined
  }
  
  
  trait DeleteJobTemplateRequest extends js.Object {
    /**
         * The name of the job template to be deleted.
         */
    var Name: __string
  }
  
  
  trait DeleteJobTemplateResponse extends js.Object
  
  
  trait DeletePresetRequest extends js.Object {
    /**
         * The name of the preset to be deleted.
         */
    var Name: __string
  }
  
  
  trait DeletePresetResponse extends js.Object
  
  
  trait DeleteQueueRequest extends js.Object {
    /**
         * The name of the queue to be deleted.
         */
    var Name: __string
  }
  
  
  trait DeleteQueueResponse extends js.Object
  
  
  trait DescribeEndpointsRequest extends js.Object {
    /**
         * Optional. Max number of endpoints, up to twenty, that will be returned at one time.
         */
    var MaxResults: js.UndefOr[__integer] = js.undefined
    var Mode: js.UndefOr[DescribeEndpointsMode] = js.undefined
    /**
         * Use this string, provided with the response to a previous request, to request the next batch of endpoints.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait DescribeEndpointsResponse extends js.Object {
    /**
         * List of endpoints
         */
    var Endpoints: js.UndefOr[__listOfEndpoint] = js.undefined
    /**
         * Use this string to request the next batch of endpoints.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait DvbNitSettings extends js.Object {
    /**
         * The numeric value placed in the Network Information Table (NIT).
         */
    var NetworkId: js.UndefOr[__integerMin0Max65535] = js.undefined
    /**
         * The network name text placed in the network_name_descriptor inside the Network Information Table. Maximum length is 256 characters.
         */
    var NetworkName: js.UndefOr[__stringMin1Max256] = js.undefined
    /**
         * The number of milliseconds between instances of this table in the output transport stream.
         */
    var NitInterval: js.UndefOr[__integerMin25Max10000] = js.undefined
  }
  
  
  trait DvbSdtSettings extends js.Object {
    var OutputSdt: js.UndefOr[OutputSdt] = js.undefined
    /**
         * The number of milliseconds between instances of this table in the output transport stream.
         */
    var SdtInterval: js.UndefOr[__integerMin25Max2000] = js.undefined
    /**
         * The service name placed in the service_descriptor in the Service Description Table. Maximum length is 256 characters.
         */
    var ServiceName: js.UndefOr[__stringMin1Max256] = js.undefined
    /**
         * The service provider name placed in the service_descriptor in the Service Description Table. Maximum length is 256 characters.
         */
    var ServiceProviderName: js.UndefOr[__stringMin1Max256] = js.undefined
  }
  
  
  trait DvbSubDestinationSettings extends js.Object {
    var Alignment: js.UndefOr[DvbSubtitleAlignment] = js.undefined
    var BackgroundColor: js.UndefOr[DvbSubtitleBackgroundColor] = js.undefined
    /**
         * Specifies the opacity of the background rectangle. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
         */
    var BackgroundOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
    var FontColor: js.UndefOr[DvbSubtitleFontColor] = js.undefined
    /**
         * Specifies the opacity of the burned-in captions. 255 is opaque; 0 is transparent.
    All burn-in and DVB-Sub font settings must match.
         */
    var FontOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
         * Font resolution in DPI (dots per inch); default is 96 dpi.
    All burn-in and DVB-Sub font settings must match.
         */
    var FontResolution: js.UndefOr[__integerMin96Max600] = js.undefined
    /**
         * A positive integer indicates the exact font size in points. Set to 0 for automatic font size selection. All burn-in and DVB-Sub font settings must match.
         */
    var FontSize: js.UndefOr[__integerMin0Max96] = js.undefined
    var OutlineColor: js.UndefOr[DvbSubtitleOutlineColor] = js.undefined
    /**
         * Specifies font outline size in pixels. This option is not valid for source captions that are either 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
         */
    var OutlineSize: js.UndefOr[__integerMin0Max10] = js.undefined
    var ShadowColor: js.UndefOr[DvbSubtitleShadowColor] = js.undefined
    /**
         * Specifies the opacity of the shadow. 255 is opaque; 0 is transparent. Leaving this parameter blank is equivalent to setting it to 0 (transparent). All burn-in and DVB-Sub font settings must match.
         */
    var ShadowOpacity: js.UndefOr[__integerMin0Max255] = js.undefined
    /**
         * Specifies the horizontal offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels to the left. All burn-in and DVB-Sub font settings must match.
         */
    var ShadowXOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    /**
         * Specifies the vertical offset of the shadow relative to the captions in pixels. A value of -2 would result in a shadow offset 2 pixels above the text. All burn-in and DVB-Sub font settings must match.
         */
    var ShadowYOffset: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    var TeletextSpacing: js.UndefOr[DvbSubtitleTeletextSpacing] = js.undefined
    /**
         * Specifies the horizontal position of the caption relative to the left side of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the left of the output. If no explicit x_position is provided, the horizontal caption position will be determined by the alignment parameter. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
         */
    var XPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    /**
         * Specifies the vertical position of the caption relative to the top of the output in pixels. A value of 10 would result in the captions starting 10 pixels from the top of the output. If no explicit y_position is provided, the caption will be positioned towards the bottom of the output. This option is not valid for source captions that are STL, 608/embedded or teletext. These source settings are already pre-defined by the caption stream. All burn-in and DVB-Sub font settings must match.
         */
    var YPosition: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  }
  
  
  trait DvbSubSourceSettings extends js.Object {
    /**
         * When using DVB-Sub with Burn-In or SMPTE-TT, use this PID for the source content. Unused for DVB-Sub passthrough. All DVB-Sub content is passed through, regardless of selectors.
         */
    var Pid: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  }
  
  
  trait DvbTdtSettings extends js.Object {
    /**
         * The number of milliseconds between instances of this table in the output transport stream.
         */
    var TdtInterval: js.UndefOr[__integerMin1000Max30000] = js.undefined
  }
  
  
  trait Eac3Settings extends js.Object {
    var AttenuationControl: js.UndefOr[Eac3AttenuationControl] = js.undefined
    /**
         * Average bitrate in bits/second. Valid bitrates depend on the coding mode.
         */
    var Bitrate: js.UndefOr[__integerMin64000Max640000] = js.undefined
    var BitstreamMode: js.UndefOr[Eac3BitstreamMode] = js.undefined
    var CodingMode: js.UndefOr[Eac3CodingMode] = js.undefined
    var DcFilter: js.UndefOr[Eac3DcFilter] = js.undefined
    /**
         * Sets the dialnorm for the output. If blank and input audio is Dolby Digital Plus, dialnorm will be passed through.
         */
    var Dialnorm: js.UndefOr[__integerMin1Max31] = js.undefined
    var DynamicRangeCompressionLine: js.UndefOr[Eac3DynamicRangeCompressionLine] = js.undefined
    var DynamicRangeCompressionRf: js.UndefOr[Eac3DynamicRangeCompressionRf] = js.undefined
    var LfeControl: js.UndefOr[Eac3LfeControl] = js.undefined
    var LfeFilter: js.UndefOr[Eac3LfeFilter] = js.undefined
    /**
         * Left only/Right only center mix level. Only used for 3/2 coding mode.
    Valid values: 3.0, 1.5, 0.0, -1.5 -3.0 -4.5 -6.0 -60
         */
    var LoRoCenterMixLevel: js.UndefOr[__doubleMinNegative60Max3] = js.undefined
    /**
         * Left only/Right only surround mix level. Only used for 3/2 coding mode.
    Valid values: -1.5 -3.0 -4.5 -6.0 -60
         */
    var LoRoSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined
    /**
         * Left total/Right total center mix level. Only used for 3/2 coding mode.
    Valid values: 3.0, 1.5, 0.0, -1.5 -3.0 -4.5 -6.0 -60
         */
    var LtRtCenterMixLevel: js.UndefOr[__doubleMinNegative60Max3] = js.undefined
    /**
         * Left total/Right total surround mix level. Only used for 3/2 coding mode.
    Valid values: -1.5 -3.0 -4.5 -6.0 -60
         */
    var LtRtSurroundMixLevel: js.UndefOr[__doubleMinNegative60MaxNegative1] = js.undefined
    var MetadataControl: js.UndefOr[Eac3MetadataControl] = js.undefined
    var PassthroughControl: js.UndefOr[Eac3PassthroughControl] = js.undefined
    var PhaseControl: js.UndefOr[Eac3PhaseControl] = js.undefined
    /**
         * Sample rate in hz. Sample rate is always 48000.
         */
    var SampleRate: js.UndefOr[__integerMin48000Max48000] = js.undefined
    var StereoDownmix: js.UndefOr[Eac3StereoDownmix] = js.undefined
    var SurroundExMode: js.UndefOr[Eac3SurroundExMode] = js.undefined
    var SurroundMode: js.UndefOr[Eac3SurroundMode] = js.undefined
  }
  
  
  trait EmbeddedSourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[EmbeddedConvert608To708] = js.undefined
    /**
         * Specifies the 608/708 channel number within the video track from which to extract captions. Unused for passthrough.
         */
    var Source608ChannelNumber: js.UndefOr[__integerMin1Max4] = js.undefined
    /**
         * Specifies the video track index used for extracting captions. The system only supports one input video track, so this should always be set to '1'.
         */
    var Source608TrackNumber: js.UndefOr[__integerMin1Max1] = js.undefined
  }
  
  
  trait Endpoint extends js.Object {
    /**
         * URL of endpoint
         */
    var Url: js.UndefOr[__string] = js.undefined
  }
  
  
  trait F4vSettings extends js.Object {
    var MoovPlacement: js.UndefOr[F4vMoovPlacement] = js.undefined
  }
  
  
  trait FileGroupSettings extends js.Object {
    /**
         * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
         */
    var Destination: js.UndefOr[__stringPatternS3] = js.undefined
  }
  
  
  trait FileSourceSettings extends js.Object {
    var Convert608To708: js.UndefOr[FileSourceConvert608To708] = js.undefined
    /**
         * External caption file used for loading captions. Accepted file extensions are 'scc', 'ttml', 'dfxp', 'stl', 'srt', and 'smi'.
         */
    var SourceFile: js.UndefOr[__stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTSmiSMI] = js.undefined
    /**
         * Specifies a time delta in seconds to offset the captions from the source file.
         */
    var TimeDelta: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
  }
  
  
  trait FrameCaptureSettings extends js.Object {
    /**
         * Frame capture will encode the first frame of the output stream, then one frame every framerateDenominator/framerateNumerator seconds. For example, settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate of 1/3 frame per second) will capture the first frame, then 1 frame every 3s. Files will be named as filename.n.jpg where n is the 0-based sequence number of each Capture.
         */
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    /**
         * Frame capture will encode the first frame of the output stream, then one frame every framerateDenominator/framerateNumerator seconds. For example, settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate of 1/3 frame per second) will capture the first frame, then 1 frame every 3s. Files will be named as filename.NNNNNNN.jpg where N is the 0-based frame sequence number zero padded to 7 decimal places.
         */
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    /**
         * Maximum number of captures (encoded jpg output files).
         */
    var MaxCaptures: js.UndefOr[__integerMin1Max10000000] = js.undefined
    /**
         * JPEG Quality - a higher value equals higher quality.
         */
    var Quality: js.UndefOr[__integerMin1Max100] = js.undefined
  }
  
  
  trait GetJobRequest extends js.Object {
    /**
         * the job ID of the job.
         */
    var Id: __string
  }
  
  
  trait GetJobResponse extends js.Object {
    var Job: js.UndefOr[Job] = js.undefined
  }
  
  
  trait GetJobTemplateRequest extends js.Object {
    /**
         * The name of the job template.
         */
    var Name: __string
  }
  
  
  trait GetJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate] = js.undefined
  }
  
  
  trait GetPresetRequest extends js.Object {
    /**
         * The name of the preset.
         */
    var Name: __string
  }
  
  
  trait GetPresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset] = js.undefined
  }
  
  
  trait GetQueueRequest extends js.Object {
    /**
         * The name of the queue that you want information about.
         */
    var Name: __string
  }
  
  
  trait GetQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue] = js.undefined
  }
  
  
  trait H264QvbrSettings extends js.Object {
    /**
         * Use this setting only when Rate control mode is QVBR and Quality tuning level is Multi-pass HQ. For Max average bitrate values suited to the complexity of your input video, the service limits the average bitrate of the video part of this output to the value you choose. That is, the total size of the video element is less than or equal to the value you set multiplied by the number of seconds of encoded output.
         */
    var MaxAverageBitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined
    /**
         * Required when you use QVBR rate control mode. That is, when you specify qvbrSettings within h264Settings. Specify the target quality level for this output, from 1 to 10. Use higher numbers for greater quality. Level 10 results in nearly lossless compression. The quality level for most broadcast-quality transcodes is between 6 and 9.
         */
    var QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined
  }
  
  
  trait H264Settings extends js.Object {
    var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization] = js.undefined
    /**
         * Average bitrate in bits/second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when rounded down to the nearest multiple of 1000.
         */
    var Bitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined
    var CodecLevel: js.UndefOr[H264CodecLevel] = js.undefined
    var CodecProfile: js.UndefOr[H264CodecProfile] = js.undefined
    /**
         * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
         */
    var DynamicSubGop: js.UndefOr[H264DynamicSubGop] = js.undefined
    var EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.undefined
    var FieldEncoding: js.UndefOr[H264FieldEncoding] = js.undefined
    var FlickerAdaptiveQuantization: js.UndefOr[H264FlickerAdaptiveQuantization] = js.undefined
    var FramerateControl: js.UndefOr[H264FramerateControl] = js.undefined
    var FramerateConversionAlgorithm: js.UndefOr[H264FramerateConversionAlgorithm] = js.undefined
    /**
         * When you use the API for transcode jobs that use framerate conversion, specify the framerate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use framerate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
         */
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    /**
         * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
         */
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    var GopBReference: js.UndefOr[H264GopBReference] = js.undefined
    /**
         * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
         */
    var GopClosedCadence: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    /**
         * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
         */
    var GopSize: js.UndefOr[__doubleMin0] = js.undefined
    var GopSizeUnits: js.UndefOr[H264GopSizeUnits] = js.undefined
    /**
         * Percentage of the buffer that should initially be filled (HRD buffer model).
         */
    var HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined
    /**
         * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
         */
    var HrdBufferSize: js.UndefOr[__integerMin0Max1152000000] = js.undefined
    var InterlaceMode: js.UndefOr[H264InterlaceMode] = js.undefined
    /**
         * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate control mode is QVBR.
         */
    var MaxBitrate: js.UndefOr[__integerMin1000Max1152000000] = js.undefined
    /**
         * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
         */
    var MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined
    /**
         * Number of B-frames between reference frames.
         */
    var NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7] = js.undefined
    /**
         * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced encoding.
         */
    var NumberReferenceFrames: js.UndefOr[__integerMin1Max6] = js.undefined
    var ParControl: js.UndefOr[H264ParControl] = js.undefined
    /**
         * Pixel Aspect Ratio denominator.
         */
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    /**
         * Pixel Aspect Ratio numerator.
         */
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    var QualityTuningLevel: js.UndefOr[H264QualityTuningLevel] = js.undefined
    /**
         * Settings for quality-defined variable bitrate encoding with the H.264 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
         */
    var QvbrSettings: js.UndefOr[H264QvbrSettings] = js.undefined
    var RateControlMode: js.UndefOr[H264RateControlMode] = js.undefined
    var RepeatPps: js.UndefOr[H264RepeatPps] = js.undefined
    var SceneChangeDetect: js.UndefOr[H264SceneChangeDetect] = js.undefined
    /**
         * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
         */
    var Slices: js.UndefOr[__integerMin1Max32] = js.undefined
    var SlowPal: js.UndefOr[H264SlowPal] = js.undefined
    /**
         * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
         */
    var Softness: js.UndefOr[__integerMin0Max128] = js.undefined
    var SpatialAdaptiveQuantization: js.UndefOr[H264SpatialAdaptiveQuantization] = js.undefined
    var Syntax: js.UndefOr[H264Syntax] = js.undefined
    var Telecine: js.UndefOr[H264Telecine] = js.undefined
    var TemporalAdaptiveQuantization: js.UndefOr[H264TemporalAdaptiveQuantization] = js.undefined
    var UnregisteredSeiTimecode: js.UndefOr[H264UnregisteredSeiTimecode] = js.undefined
  }
  
  
  trait H265QvbrSettings extends js.Object {
    /**
         * Use this setting only when Rate control mode is QVBR and Quality tuning level is Multi-pass HQ. For Max average bitrate values suited to the complexity of your input video, the service limits the average bitrate of the video part of this output to the value you choose. That is, the total size of the video element is less than or equal to the value you set multiplied by the number of seconds of encoded output.
         */
    var MaxAverageBitrate: js.UndefOr[__integerMin1000Max1466400000] = js.undefined
    /**
         * Required when you use QVBR rate control mode. That is, when you specify qvbrSettings within h265Settings. Specify the target quality level for this output, from 1 to 10. Use higher numbers for greater quality. Level 10 results in nearly lossless compression. The quality level for most broadcast-quality transcodes is between 6 and 9.
         */
    var QvbrQualityLevel: js.UndefOr[__integerMin1Max10] = js.undefined
  }
  
  
  trait H265Settings extends js.Object {
    var AdaptiveQuantization: js.UndefOr[H265AdaptiveQuantization] = js.undefined
    var AlternateTransferFunctionSei: js.UndefOr[H265AlternateTransferFunctionSei] = js.undefined
    /**
         * Average bitrate in bits/second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when rounded down to the nearest multiple of 1000.
         */
    var Bitrate: js.UndefOr[__integerMin1000Max1466400000] = js.undefined
    var CodecLevel: js.UndefOr[H265CodecLevel] = js.undefined
    var CodecProfile: js.UndefOr[H265CodecProfile] = js.undefined
    /**
         * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
         */
    var DynamicSubGop: js.UndefOr[H265DynamicSubGop] = js.undefined
    var FlickerAdaptiveQuantization: js.UndefOr[H265FlickerAdaptiveQuantization] = js.undefined
    var FramerateControl: js.UndefOr[H265FramerateControl] = js.undefined
    var FramerateConversionAlgorithm: js.UndefOr[H265FramerateConversionAlgorithm] = js.undefined
    /**
         * Framerate denominator.
         */
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    /**
         * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
         */
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    var GopBReference: js.UndefOr[H265GopBReference] = js.undefined
    /**
         * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
         */
    var GopClosedCadence: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    /**
         * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
         */
    var GopSize: js.UndefOr[__doubleMin0] = js.undefined
    var GopSizeUnits: js.UndefOr[H265GopSizeUnits] = js.undefined
    /**
         * Percentage of the buffer that should initially be filled (HRD buffer model).
         */
    var HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined
    /**
         * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
         */
    var HrdBufferSize: js.UndefOr[__integerMin0Max1466400000] = js.undefined
    var InterlaceMode: js.UndefOr[H265InterlaceMode] = js.undefined
    /**
         * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate control mode is QVBR.
         */
    var MaxBitrate: js.UndefOr[__integerMin1000Max1466400000] = js.undefined
    /**
         * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
         */
    var MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined
    /**
         * Number of B-frames between reference frames.
         */
    var NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7] = js.undefined
    /**
         * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced encoding.
         */
    var NumberReferenceFrames: js.UndefOr[__integerMin1Max6] = js.undefined
    var ParControl: js.UndefOr[H265ParControl] = js.undefined
    /**
         * Pixel Aspect Ratio denominator.
         */
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    /**
         * Pixel Aspect Ratio numerator.
         */
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    var QualityTuningLevel: js.UndefOr[H265QualityTuningLevel] = js.undefined
    /**
         * Settings for quality-defined variable bitrate encoding with the H.265 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
         */
    var QvbrSettings: js.UndefOr[H265QvbrSettings] = js.undefined
    var RateControlMode: js.UndefOr[H265RateControlMode] = js.undefined
    var SampleAdaptiveOffsetFilterMode: js.UndefOr[H265SampleAdaptiveOffsetFilterMode] = js.undefined
    var SceneChangeDetect: js.UndefOr[H265SceneChangeDetect] = js.undefined
    /**
         * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
         */
    var Slices: js.UndefOr[__integerMin1Max32] = js.undefined
    var SlowPal: js.UndefOr[H265SlowPal] = js.undefined
    var SpatialAdaptiveQuantization: js.UndefOr[H265SpatialAdaptiveQuantization] = js.undefined
    var Telecine: js.UndefOr[H265Telecine] = js.undefined
    var TemporalAdaptiveQuantization: js.UndefOr[H265TemporalAdaptiveQuantization] = js.undefined
    var TemporalIds: js.UndefOr[H265TemporalIds] = js.undefined
    var Tiles: js.UndefOr[H265Tiles] = js.undefined
    var UnregisteredSeiTimecode: js.UndefOr[H265UnregisteredSeiTimecode] = js.undefined
    var WriteMp4PackagingType: js.UndefOr[H265WriteMp4PackagingType] = js.undefined
  }
  
  
  trait Hdr10Metadata extends js.Object {
    /**
         * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
         */
    var BluePrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined
    /**
         * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
         */
    var BluePrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined
    /**
         * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
         */
    var GreenPrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined
    /**
         * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
         */
    var GreenPrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined
    /**
         * Maximum light level among all samples in the coded video sequence, in units of candelas per square meter.
         */
    var MaxContentLightLevel: js.UndefOr[__integerMin0Max65535] = js.undefined
    /**
         * Maximum average light level of any frame in the coded video sequence, in units of candelas per square meter.
         */
    var MaxFrameAverageLightLevel: js.UndefOr[__integerMin0Max65535] = js.undefined
    /**
         * Nominal maximum mastering display luminance in units of of 0.0001 candelas per square meter.
         */
    var MaxLuminance: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    /**
         * Nominal minimum mastering display luminance in units of of 0.0001 candelas per square meter
         */
    var MinLuminance: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    /**
         * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
         */
    var RedPrimaryX: js.UndefOr[__integerMin0Max50000] = js.undefined
    /**
         * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
         */
    var RedPrimaryY: js.UndefOr[__integerMin0Max50000] = js.undefined
    /**
         * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
         */
    var WhitePointX: js.UndefOr[__integerMin0Max50000] = js.undefined
    /**
         * HDR Master Display Information must be provided by a color grader, using color grading tools. Range is 0 to 50,000, each increment represents 0.00002 in CIE1931 color coordinate. Note that this setting is not for color correction.
         */
    var WhitePointY: js.UndefOr[__integerMin0Max50000] = js.undefined
  }
  
  
  trait HlsCaptionLanguageMapping extends js.Object {
    /**
         * Caption channel.
         */
    var CaptionChannel: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    /**
         * Specify the language for this caption channel, using the ISO 639-2 or ISO 639-3 three-letter language code
         */
    var CustomLanguageCode: js.UndefOr[__stringMin3Max3PatternAZaZ3] = js.undefined
    var LanguageCode: js.UndefOr[LanguageCode] = js.undefined
    /**
         * Caption language description.
         */
    var LanguageDescription: js.UndefOr[__string] = js.undefined
  }
  
  
  trait HlsEncryptionSettings extends js.Object {
    /**
         * This is a 128-bit, 16-byte hex value represented by a 32-character text string. If this parameter is not set then the Initialization Vector will follow the segment number by default.
         */
    var ConstantInitializationVector: js.UndefOr[__stringMin32Max32Pattern09aFAF32] = js.undefined
    var EncryptionMethod: js.UndefOr[HlsEncryptionType] = js.undefined
    var InitializationVectorInManifest: js.UndefOr[HlsInitializationVectorInManifest] = js.undefined
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined
    var StaticKeyProvider: js.UndefOr[StaticKeyProvider] = js.undefined
    var Type: js.UndefOr[HlsKeyProviderType] = js.undefined
  }
  
  
  trait HlsGroupSettings extends js.Object {
    /**
         * Choose one or more ad marker types to pass SCTE35 signals through to this group of Apple HLS outputs.
         */
    var AdMarkers: js.UndefOr[__listOfHlsAdMarkers] = js.undefined
    /**
         * A partial URI prefix that will be prepended to each output in the media .m3u8 file. Can be used if base manifest is delivered from a different URL than the main .m3u8 file.
         */
    var BaseUrl: js.UndefOr[__string] = js.undefined
    /**
         * Language to be used on Caption outputs
         */
    var CaptionLanguageMappings: js.UndefOr[__listOfHlsCaptionLanguageMapping] = js.undefined
    var CaptionLanguageSetting: js.UndefOr[HlsCaptionLanguageSetting] = js.undefined
    var ClientCache: js.UndefOr[HlsClientCache] = js.undefined
    var CodecSpecification: js.UndefOr[HlsCodecSpecification] = js.undefined
    /**
         * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
         */
    var Destination: js.UndefOr[__stringPatternS3] = js.undefined
    var DirectoryStructure: js.UndefOr[HlsDirectoryStructure] = js.undefined
    /**
         * DRM settings.
         */
    var Encryption: js.UndefOr[HlsEncryptionSettings] = js.undefined
    var ManifestCompression: js.UndefOr[HlsManifestCompression] = js.undefined
    var ManifestDurationFormat: js.UndefOr[HlsManifestDurationFormat] = js.undefined
    /**
         * Keep this setting at the default value of 0, unless you are troubleshooting a problem with how devices play back the end of your video asset. If you know that player devices are hanging on the final segment of your video because the length of your final segment is too short, use this setting to specify a minimum final segment length, in seconds. Choose a value that is greater than or equal to 1 and less than your segment length. When you specify a value for this setting, the encoder will combine any final segment that is shorter than the length that you specify with the previous segment. For example, your segment length is 3 seconds and your final segment is .5 seconds without a minimum final segment length; when you set the minimum final segment length to 1, your final segment is 3.5 seconds.
         */
    var MinFinalSegmentLength: js.UndefOr[__doubleMin0Max2147483647] = js.undefined
    /**
         * When set, Minimum Segment Size is enforced by looking ahead and back within the specified range for a nearby avail and extending the segment size if needed.
         */
    var MinSegmentLength: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    var OutputSelection: js.UndefOr[HlsOutputSelection] = js.undefined
    var ProgramDateTime: js.UndefOr[HlsProgramDateTime] = js.undefined
    /**
         * Period of insertion of EXT-X-PROGRAM-DATE-TIME entry, in seconds.
         */
    var ProgramDateTimePeriod: js.UndefOr[__integerMin0Max3600] = js.undefined
    var SegmentControl: js.UndefOr[HlsSegmentControl] = js.undefined
    /**
         * Length of MPEG-2 Transport Stream segments to create (in seconds). Note that segments will end on the next keyframe after this number of seconds, so actual segment length may be longer.
         */
    var SegmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    /**
         * Number of segments to write to a subdirectory before starting a new one. directoryStructure must be SINGLE_DIRECTORY for this setting to have an effect.
         */
    var SegmentsPerSubdirectory: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    var StreamInfResolution: js.UndefOr[HlsStreamInfResolution] = js.undefined
    var TimedMetadataId3Frame: js.UndefOr[HlsTimedMetadataId3Frame] = js.undefined
    /**
         * Timed Metadata interval in seconds.
         */
    var TimedMetadataId3Period: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    /**
         * Provides an extra millisecond delta offset to fine tune the timestamps.
         */
    var TimestampDeltaMilliseconds: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
  }
  
  
  trait HlsSettings extends js.Object {
    /**
         * Specifies the group to which the audio Rendition belongs.
         */
    var AudioGroupId: js.UndefOr[__string] = js.undefined
    /**
         * List all the audio groups that are used with the video output stream. Input all the audio GROUP-IDs that are associated to the video, separate by ','.
         */
    var AudioRenditionSets: js.UndefOr[__string] = js.undefined
    var AudioTrackType: js.UndefOr[HlsAudioTrackType] = js.undefined
    var IFrameOnlyManifest: js.UndefOr[HlsIFrameOnlyManifest] = js.undefined
    /**
         * String concatenated to end of segment filenames. Accepts "Format Identifiers":#format_identifier_parameters.
         */
    var SegmentModifier: js.UndefOr[__string] = js.undefined
  }
  
  
  trait Id3Insertion extends js.Object {
    /**
         * Use ID3 tag (Id3) to provide a tag value in base64-encode format.
         */
    var Id3: js.UndefOr[__stringPatternAZaZ0902] = js.undefined
    /**
         * Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format.
         */
    var Timecode: js.UndefOr[__stringPattern010920405090509092] = js.undefined
  }
  
  
  trait ImageInserter extends js.Object {
    /**
         * Image to insert. Must be 32 bit windows BMP, PNG, or TGA file. Must not be  larger than the output frames.
         */
    var InsertableImages: js.UndefOr[__listOfInsertableImage] = js.undefined
  }
  
  
  trait Input extends js.Object {
    /**
         * Specifies set of audio selectors within an input to combine. An input may have multiple audio selector groups. See "Audio Selector Group":#inputs-audio_selector_group for more information.
         */
    var AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup] = js.undefined
    /**
         * Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your outputs. You can use mutiple Audio selectors per input.
         */
    var AudioSelectors: js.UndefOr[__mapOfAudioSelector] = js.undefined
    /**
         * Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in your outputs. You can use mutiple captions selectors per input.
         */
    var CaptionSelectors: js.UndefOr[__mapOfCaptionSelector] = js.undefined
    var DeblockFilter: js.UndefOr[InputDeblockFilter] = js.undefined
    var DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.undefined
    /**
         * Use Input (fileInput) to define the source file used in the transcode job. There can be multiple inputs in a job. These inputs are concantenated, in the order they are specified in the job, to create the output.
         */
    var FileInput: js.UndefOr[
        __stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MM
      ] = js.undefined
    var FilterEnable: js.UndefOr[InputFilterEnable] = js.undefined
    /**
         * Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and Denoise). The range is -5 to 5. Default is 0.
         */
    var FilterStrength: js.UndefOr[__integerMinNegative5Max5] = js.undefined
    /**
         * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If you provide only an end time, it will be the entire input up to that point. When you specify more than one input clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify them.
         */
    var InputClippings: js.UndefOr[__listOfInputClipping] = js.undefined
    /**
         * Use Program (programNumber) to select a specific program from within a multi-program transport stream. Note that Quad 4K is not currently supported. Default is the first program within the transport stream. If the program you specify doesn't exist, the transcoding service will use this default.
         */
    var ProgramNumber: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    var PsiControl: js.UndefOr[InputPsiControl] = js.undefined
    var TimecodeSource: js.UndefOr[InputTimecodeSource] = js.undefined
    var VideoSelector: js.UndefOr[VideoSelector] = js.undefined
  }
  
  
  trait InputClipping extends js.Object {
    /**
         * Set End timecode (EndTimecode) to the end of the portion of the input you are clipping. The frame corresponding to the End timecode value is included in the clip. Start timecode or End timecode may be left blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When choosing this value, take into account your setting for timecode source under input settings (InputTimecodeSource). For example, if you have embedded timecodes that start at 01:00:00:00 and you want your clip to end six minutes into the video, use 01:06:00:00.
         */
    var EndTimecode: js.UndefOr[__stringPattern010920405090509092] = js.undefined
    /**
         * Set Start timecode (StartTimecode) to the beginning of the portion of the input you are clipping. The frame corresponding to the Start timecode value is included in the clip. Start timecode or End timecode may be left blank, but not both. Use the format HH:MM:SS:FF or HH:MM:SS;FF, where HH is the hour, MM is the minute, SS is the second, and FF is the frame number. When choosing this value, take into account your setting for Input timecode source. For example, if you have embedded timecodes that start at 01:00:00:00 and you want your clip to begin five minutes into the video, use 01:05:00:00.
         */
    var StartTimecode: js.UndefOr[__stringPattern010920405090509092] = js.undefined
  }
  
  
  trait InputTemplate extends js.Object {
    /**
         * Specifies set of audio selectors within an input to combine. An input may have multiple audio selector groups. See "Audio Selector Group":#inputs-audio_selector_group for more information.
         */
    var AudioSelectorGroups: js.UndefOr[__mapOfAudioSelectorGroup] = js.undefined
    /**
         * Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your outputs. You can use mutiple Audio selectors per input.
         */
    var AudioSelectors: js.UndefOr[__mapOfAudioSelector] = js.undefined
    /**
         * Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in your outputs. You can use mutiple captions selectors per input.
         */
    var CaptionSelectors: js.UndefOr[__mapOfCaptionSelector] = js.undefined
    var DeblockFilter: js.UndefOr[InputDeblockFilter] = js.undefined
    var DenoiseFilter: js.UndefOr[InputDenoiseFilter] = js.undefined
    var FilterEnable: js.UndefOr[InputFilterEnable] = js.undefined
    /**
         * Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and Denoise). The range is -5 to 5. Default is 0.
         */
    var FilterStrength: js.UndefOr[__integerMinNegative5Max5] = js.undefined
    /**
         * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If you provide only an end time, it will be the entire input up to that point. When you specify more than one input clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify them.
         */
    var InputClippings: js.UndefOr[__listOfInputClipping] = js.undefined
    /**
         * Use Program (programNumber) to select a specific program from within a multi-program transport stream. Note that Quad 4K is not currently supported. Default is the first program within the transport stream. If the program you specify doesn't exist, the transcoding service will use this default.
         */
    var ProgramNumber: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    var PsiControl: js.UndefOr[InputPsiControl] = js.undefined
    var TimecodeSource: js.UndefOr[InputTimecodeSource] = js.undefined
    var VideoSelector: js.UndefOr[VideoSelector] = js.undefined
  }
  
  
  trait InsertableImage extends js.Object {
    /**
         * Use Duration (Duration) to set the time, in milliseconds, for the image to remain on the output video.
         */
    var Duration: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    /**
         * Use Fade in (FadeIut) to set the length, in milliseconds, of the inserted image fade in. If you don't specify a value for Fade in, the image will appear abruptly at the Start time.
         */
    var FadeIn: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    /**
         * Use Fade out (FadeOut) to set the length, in milliseconds, of the inserted image fade out. If you don't specify a value for Fade out, the image will disappear abruptly at the end of the inserted image duration.
         */
    var FadeOut: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    /**
         * Specify the Height (Height) of the inserted image. Use a value that is less than or equal to the video resolution height. Leave this setting blank to use the native height of the image.
         */
    var Height: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    /**
         * Use Image location (imageInserterInput) to specify the Amazon S3 location of the image to be inserted into the output. Use a 32 bit BMP, PNG, or TGA file that fits inside the video frame.
         */
    var ImageInserterInput: js.UndefOr[__stringMin14PatternS3BmpBMPPngPNGTgaTGA] = js.undefined
    /**
         * Use Left (ImageX) to set the distance, in pixels, between the inserted image and the left edge of the frame. Required for BMP, PNG and TGA input.
         */
    var ImageX: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    /**
         * Use Top (ImageY) to set the distance, in pixels, between the inserted image and the top edge of the video frame. Required for BMP, PNG and TGA input.
         */
    var ImageY: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
    /**
         * Use Layer (Layer) to specify how overlapping inserted images appear. Images with higher values of layer appear on top of images with lower values of layer.
         */
    var Layer: js.UndefOr[__integerMin0Max99] = js.undefined
    /**
         * Use Opacity (Opacity) to specify how much of the underlying video shows through the inserted image. 0 is transparent and 100 is fully opaque. Default is 50.
         */
    var Opacity: js.UndefOr[__integerMin0Max100] = js.undefined
    /**
         * Use Start time (StartTime) to specify the video timecode when the image is inserted in the output. This must be in timecode (HH:MM:SS:FF or HH:MM:SS;FF) format.
         */
    var StartTime: js.UndefOr[__stringPattern01D20305D205D] = js.undefined
    /**
         * Specify the Width (Width) of the inserted image. Use a value that is less than or equal to the video resolution width. Leave this setting blank to use the native width of the image.
         */
    var Width: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
  }
  
  
  trait Job extends js.Object {
    /**
         * An identifier for this resource that is unique within all of AWS.
         */
    var Arn: js.UndefOr[__string] = js.undefined
    var BillingTagsSource: js.UndefOr[BillingTagsSource] = js.undefined
    /**
         * The time, in Unix epoch format in seconds, when the job got created.
         */
    var CreatedAt: js.UndefOr[__timestampUnix] = js.undefined
    /**
         * Error code for the job
         */
    var ErrorCode: js.UndefOr[__integer] = js.undefined
    /**
         * Error message of Job
         */
    var ErrorMessage: js.UndefOr[__string] = js.undefined
    /**
         * A portion of the job's ARN, unique within your AWS Elemental MediaConvert resources
         */
    var Id: js.UndefOr[__string] = js.undefined
    /**
         * The job template that the job is created from, if it is created from a job template.
         */
    var JobTemplate: js.UndefOr[__string] = js.undefined
    /**
         * List of output group details
         */
    var OutputGroupDetails: js.UndefOr[__listOfOutputGroupDetail] = js.undefined
    /**
         * Optional. When you create a job, you can specify a queue to send it to. If you don't specify, the job will go to the default queue. For more about queues, see the User Guide topic at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
         */
    var Queue: js.UndefOr[__string] = js.undefined
    /**
         * The IAM role you use for creating this job. For details about permissions, see the User Guide topic at the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/iam-role.html
         */
    var Role: __string
    var Settings: JobSettings
    var Status: js.UndefOr[JobStatus] = js.undefined
    var Timing: js.UndefOr[Timing] = js.undefined
    /**
         * User-defined metadata that you want to associate with an MediaConvert job. You specify metadata in key/value pairs.
         */
    var UserMetadata: js.UndefOr[__mapOf__string] = js.undefined
  }
  
  
  trait JobSettings extends js.Object {
    /**
         * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
         */
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined
    /**
         * Settings for ad avail blanking.  Video can be blanked or overlaid with an image, and audio muted during SCTE-35 triggered ad avails.
         */
    var AvailBlanking: js.UndefOr[AvailBlanking] = js.undefined
    /**
         * Use Inputs (inputs) to define source file used in the transcode job. There can be multiple inputs add in a job. These inputs will be concantenated together to create the output.
         */
    var Inputs: js.UndefOr[__listOfInput] = js.undefined
    var NielsenConfiguration: js.UndefOr[NielsenConfiguration] = js.undefined
    /**
         * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
         */
    var OutputGroups: js.UndefOr[__listOfOutputGroup] = js.undefined
    /**
         * Contains settings used to acquire and adjust timecode information from inputs.
         */
    var TimecodeConfig: js.UndefOr[TimecodeConfig] = js.undefined
    var TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion] = js.undefined
  }
  
  
  trait JobTemplate extends js.Object {
    /**
         * An identifier for this resource that is unique within all of AWS.
         */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
         * An optional category you create to organize your job templates.
         */
    var Category: js.UndefOr[__string] = js.undefined
    /**
         * The timestamp in epoch seconds for Job template creation.
         */
    var CreatedAt: js.UndefOr[__timestampUnix] = js.undefined
    /**
         * An optional description you create for each job template.
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * The timestamp in epoch seconds when the Job template was last updated.
         */
    var LastUpdated: js.UndefOr[__timestampUnix] = js.undefined
    /**
         * A name you create for each job template. Each name must be unique within your account.
         */
    var Name: __string
    /**
         * Optional. The queue that jobs created from this template are assigned to. If you don't specify this, jobs will go to the default queue.
         */
    var Queue: js.UndefOr[__string] = js.undefined
    var Settings: JobTemplateSettings
    /**
         * A job template can be of two types: system or custom. System or built-in job templates can't be modified or deleted by the user.
         */
    var Type: js.UndefOr[Type] = js.undefined
  }
  
  
  trait JobTemplateSettings extends js.Object {
    /**
         * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time.
         */
    var AdAvailOffset: js.UndefOr[__integerMinNegative1000Max1000] = js.undefined
    /**
         * Settings for ad avail blanking.  Video can be blanked or overlaid with an image, and audio muted during SCTE-35 triggered ad avails.
         */
    var AvailBlanking: js.UndefOr[AvailBlanking] = js.undefined
    /**
         * Use Inputs (inputs) to define the source file used in the transcode job. There can only be one input in a job template.  Using the API, you can include multiple inputs when referencing a job template.
         */
    var Inputs: js.UndefOr[__listOfInputTemplate] = js.undefined
    var NielsenConfiguration: js.UndefOr[NielsenConfiguration] = js.undefined
    /**
         * (OutputGroups) contains one group of settings for each set of outputs that share a common package type. All unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped in a single output group as well. Required in (OutputGroups) is a group of settings that apply to the whole group. This required object depends on the value you set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS, HlsGroupSettings * DASH_ISO_GROUP_SETTINGS, DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
         */
    var OutputGroups: js.UndefOr[__listOfOutputGroup] = js.undefined
    /**
         * Contains settings used to acquire and adjust timecode information from inputs.
         */
    var TimecodeConfig: js.UndefOr[TimecodeConfig] = js.undefined
    var TimedMetadataInsertion: js.UndefOr[TimedMetadataInsertion] = js.undefined
  }
  
  
  trait ListJobTemplatesRequest extends js.Object {
    /**
         * Optionally, specify a job template category to limit responses to only job templates from that category.
         */
    var Category: js.UndefOr[__string] = js.undefined
    var ListBy: js.UndefOr[JobTemplateListBy] = js.undefined
    /**
         * Optional. Number of job templates, up to twenty, that will be returned at one time.
         */
    var MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined
    /**
         * Use this string, provided with the response to a previous request, to request the next batch of job templates.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
    var Order: js.UndefOr[Order] = js.undefined
  }
  
  
  trait ListJobTemplatesResponse extends js.Object {
    /**
         * List of Job templates.
         */
    var JobTemplates: js.UndefOr[__listOfJobTemplate] = js.undefined
    /**
         * Use this string to request the next batch of job templates.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListJobsRequest extends js.Object {
    /**
         * Optional. Number of jobs, up to twenty, that will be returned at one time.
         */
    var MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined
    /**
         * Use this string, provided with the response to a previous request, to request the next batch of jobs.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
    var Order: js.UndefOr[Order] = js.undefined
    /**
         * Provide a queue name to get back only jobs from that queue.
         */
    var Queue: js.UndefOr[__string] = js.undefined
    var Status: js.UndefOr[JobStatus] = js.undefined
  }
  
  
  trait ListJobsResponse extends js.Object {
    /**
         * List of jobs
         */
    var Jobs: js.UndefOr[__listOfJob] = js.undefined
    /**
         * Use this string to request the next batch of jobs.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListPresetsRequest extends js.Object {
    /**
         * Optionally, specify a preset category to limit responses to only presets from that category.
         */
    var Category: js.UndefOr[__string] = js.undefined
    var ListBy: js.UndefOr[PresetListBy] = js.undefined
    /**
         * Optional. Number of presets, up to twenty, that will be returned at one time
         */
    var MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined
    /**
         * Use this string, provided with the response to a previous request, to request the next batch of presets.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
    var Order: js.UndefOr[Order] = js.undefined
  }
  
  
  trait ListPresetsResponse extends js.Object {
    /**
         * Use this string to request the next batch of presets.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
         * List of presets
         */
    var Presets: js.UndefOr[__listOfPreset] = js.undefined
  }
  
  
  trait ListQueuesRequest extends js.Object {
    var ListBy: js.UndefOr[QueueListBy] = js.undefined
    /**
         * Optional. Number of queues, up to twenty, that will be returned at one time.
         */
    var MaxResults: js.UndefOr[__integerMin1Max20] = js.undefined
    /**
         * Use this string, provided with the response to a previous request, to request the next batch of queues.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
    var Order: js.UndefOr[Order] = js.undefined
  }
  
  
  trait ListQueuesResponse extends js.Object {
    /**
         * Use this string to request the next batch of queues.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
         * List of queues.
         */
    var Queues: js.UndefOr[__listOfQueue] = js.undefined
  }
  
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource that you want to list tags for. To get the ARN, send a GET request with the resource name.
         */
    var Arn: __string
  }
  
  
  trait ListTagsForResourceResponse extends js.Object {
    var ResourceTags: js.UndefOr[ResourceTags] = js.undefined
  }
  
  
  trait M2tsSettings extends js.Object {
    var AudioBufferModel: js.UndefOr[M2tsAudioBufferModel] = js.undefined
    /**
         * The number of audio frames to insert for each PES packet.
         */
    var AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    /**
         * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation.
         */
    var AudioPids: js.UndefOr[__listOf__integerMin32Max8182] = js.undefined
    /**
         * The output bitrate of the transport stream in bits per second. Setting to 0 lets the muxer automatically determine the appropriate bitrate. Other common values are 3750000, 7500000, and 15000000.
         */
    var Bitrate: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    var BufferModel: js.UndefOr[M2tsBufferModel] = js.undefined
    var DvbNitSettings: js.UndefOr[DvbNitSettings] = js.undefined
    var DvbSdtSettings: js.UndefOr[DvbSdtSettings] = js.undefined
    /**
         * Packet Identifier (PID) for input source DVB Subtitle data to this output. Multiple values are accepted, and can be entered in ranges and/or by comma separation.
         */
    var DvbSubPids: js.UndefOr[__listOf__integerMin32Max8182] = js.undefined
    var DvbTdtSettings: js.UndefOr[DvbTdtSettings] = js.undefined
    /**
         * Packet Identifier (PID) for input source DVB Teletext data to this output.
         */
    var DvbTeletextPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    var EbpAudioInterval: js.UndefOr[M2tsEbpAudioInterval] = js.undefined
    var EbpPlacement: js.UndefOr[M2tsEbpPlacement] = js.undefined
    var EsRateInPes: js.UndefOr[M2tsEsRateInPes] = js.undefined
    /**
         * The length in seconds of each fragment. Only used with EBP markers.
         */
    var FragmentTime: js.UndefOr[__doubleMin0] = js.undefined
    /**
         * Maximum time in milliseconds between Program Clock References (PCRs) inserted into the transport stream.
         */
    var MaxPcrInterval: js.UndefOr[__integerMin0Max500] = js.undefined
    /**
         * When set, enforces that Encoder Boundary Points do not come within the specified time interval of each other by looking ahead at input video. If another EBP is going to come in within the specified time interval, the current EBP is not emitted, and the segment is "stretched" to the next marker. The lookahead value does not add latency to the system. The Live Event must be configured elsewhere to create sufficient latency to make the lookahead accurate.
         */
    var MinEbpInterval: js.UndefOr[__integerMin0Max10000] = js.undefined
    var NielsenId3: js.UndefOr[M2tsNielsenId3] = js.undefined
    /**
         * Value in bits per second of extra null packets to insert into the transport stream. This can be used if a downstream encryption system requires periodic null packets.
         */
    var NullPacketBitrate: js.UndefOr[__doubleMin0] = js.undefined
    /**
         * The number of milliseconds between instances of this table in the output transport stream.
         */
    var PatInterval: js.UndefOr[__integerMin0Max1000] = js.undefined
    var PcrControl: js.UndefOr[M2tsPcrControl] = js.undefined
    /**
         * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID.
         */
    var PcrPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    /**
         * The number of milliseconds between instances of this table in the output transport stream.
         */
    var PmtInterval: js.UndefOr[__integerMin0Max1000] = js.undefined
    /**
         * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream.
         */
    var PmtPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    /**
         * Packet Identifier (PID) of the private metadata stream in the transport stream.
         */
    var PrivateMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    /**
         * The value of the program number field in the Program Map Table.
         */
    var ProgramNumber: js.UndefOr[__integerMin0Max65535] = js.undefined
    var RateMode: js.UndefOr[M2tsRateMode] = js.undefined
    /**
         * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
         */
    var Scte35Pid: js.UndefOr[__integerMin32Max8182] = js.undefined
    var Scte35Source: js.UndefOr[M2tsScte35Source] = js.undefined
    var SegmentationMarkers: js.UndefOr[M2tsSegmentationMarkers] = js.undefined
    var SegmentationStyle: js.UndefOr[M2tsSegmentationStyle] = js.undefined
    /**
         * The length in seconds of each segment. Required unless markers is set to _none_.
         */
    var SegmentationTime: js.UndefOr[__doubleMin0] = js.undefined
    /**
         * Packet Identifier (PID) of the timed metadata stream in the transport stream.
         */
    var TimedMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    /**
         * The value of the transport stream ID field in the Program Map Table.
         */
    var TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined
    /**
         * Packet Identifier (PID) of the elementary video stream in the transport stream.
         */
    var VideoPid: js.UndefOr[__integerMin32Max8182] = js.undefined
  }
  
  
  trait M3u8Settings extends js.Object {
    /**
         * The number of audio frames to insert for each PES packet.
         */
    var AudioFramesPerPes: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    /**
         * Packet Identifier (PID) of the elementary audio stream(s) in the transport stream. Multiple values are accepted, and can be entered in ranges and/or by comma separation.
         */
    var AudioPids: js.UndefOr[__listOf__integerMin32Max8182] = js.undefined
    var NielsenId3: js.UndefOr[M3u8NielsenId3] = js.undefined
    /**
         * The number of milliseconds between instances of this table in the output transport stream.
         */
    var PatInterval: js.UndefOr[__integerMin0Max1000] = js.undefined
    var PcrControl: js.UndefOr[M3u8PcrControl] = js.undefined
    /**
         * Packet Identifier (PID) of the Program Clock Reference (PCR) in the transport stream. When no value is given, the encoder will assign the same value as the Video PID.
         */
    var PcrPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    /**
         * The number of milliseconds between instances of this table in the output transport stream.
         */
    var PmtInterval: js.UndefOr[__integerMin0Max1000] = js.undefined
    /**
         * Packet Identifier (PID) for the Program Map Table (PMT) in the transport stream.
         */
    var PmtPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    /**
         * Packet Identifier (PID) of the private metadata stream in the transport stream.
         */
    var PrivateMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    /**
         * The value of the program number field in the Program Map Table.
         */
    var ProgramNumber: js.UndefOr[__integerMin0Max65535] = js.undefined
    /**
         * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
         */
    var Scte35Pid: js.UndefOr[__integerMin32Max8182] = js.undefined
    var Scte35Source: js.UndefOr[M3u8Scte35Source] = js.undefined
    var TimedMetadata: js.UndefOr[TimedMetadata] = js.undefined
    /**
         * Packet Identifier (PID) of the timed metadata stream in the transport stream.
         */
    var TimedMetadataPid: js.UndefOr[__integerMin32Max8182] = js.undefined
    /**
         * The value of the transport stream ID field in the Program Map Table.
         */
    var TransportStreamId: js.UndefOr[__integerMin0Max65535] = js.undefined
    /**
         * Packet Identifier (PID) of the elementary video stream in the transport stream.
         */
    var VideoPid: js.UndefOr[__integerMin32Max8182] = js.undefined
  }
  
  
  trait MovSettings extends js.Object {
    var ClapAtom: js.UndefOr[MovClapAtom] = js.undefined
    var CslgAtom: js.UndefOr[MovCslgAtom] = js.undefined
    var Mpeg2FourCCControl: js.UndefOr[MovMpeg2FourCCControl] = js.undefined
    var PaddingControl: js.UndefOr[MovPaddingControl] = js.undefined
    var Reference: js.UndefOr[MovReference] = js.undefined
  }
  
  
  trait Mp2Settings extends js.Object {
    /**
         * Average bitrate in bits/second.
         */
    var Bitrate: js.UndefOr[__integerMin32000Max384000] = js.undefined
    /**
         * Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console will give you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
         */
    var Channels: js.UndefOr[__integerMin1Max2] = js.undefined
    /**
         * Sample rate in hz.
         */
    var SampleRate: js.UndefOr[__integerMin32000Max48000] = js.undefined
  }
  
  
  trait Mp4Settings extends js.Object {
    var CslgAtom: js.UndefOr[Mp4CslgAtom] = js.undefined
    var FreeSpaceBox: js.UndefOr[Mp4FreeSpaceBox] = js.undefined
    var MoovPlacement: js.UndefOr[Mp4MoovPlacement] = js.undefined
    /**
         * Overrides the "Major Brand" field in the output file. Usually not necessary to specify.
         */
    var Mp4MajorBrand: js.UndefOr[__string] = js.undefined
  }
  
  
  trait Mpeg2Settings extends js.Object {
    var AdaptiveQuantization: js.UndefOr[Mpeg2AdaptiveQuantization] = js.undefined
    /**
         * Average bitrate in bits/second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when rounded down to the nearest multiple of 1000.
         */
    var Bitrate: js.UndefOr[__integerMin1000Max288000000] = js.undefined
    var CodecLevel: js.UndefOr[Mpeg2CodecLevel] = js.undefined
    var CodecProfile: js.UndefOr[Mpeg2CodecProfile] = js.undefined
    /**
         * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
         */
    var DynamicSubGop: js.UndefOr[Mpeg2DynamicSubGop] = js.undefined
    var FramerateControl: js.UndefOr[Mpeg2FramerateControl] = js.undefined
    var FramerateConversionAlgorithm: js.UndefOr[Mpeg2FramerateConversionAlgorithm] = js.undefined
    /**
         * Framerate denominator.
         */
    var FramerateDenominator: js.UndefOr[__integerMin1Max1001] = js.undefined
    /**
         * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
         */
    var FramerateNumerator: js.UndefOr[__integerMin24Max60000] = js.undefined
    /**
         * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
         */
    var GopClosedCadence: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    /**
         * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
         */
    var GopSize: js.UndefOr[__doubleMin0] = js.undefined
    var GopSizeUnits: js.UndefOr[Mpeg2GopSizeUnits] = js.undefined
    /**
         * Percentage of the buffer that should initially be filled (HRD buffer model).
         */
    var HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined
    /**
         * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
         */
    var HrdBufferSize: js.UndefOr[__integerMin0Max47185920] = js.undefined
    var InterlaceMode: js.UndefOr[Mpeg2InterlaceMode] = js.undefined
    var IntraDcPrecision: js.UndefOr[Mpeg2IntraDcPrecision] = js.undefined
    /**
         * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
         */
    var MaxBitrate: js.UndefOr[__integerMin1000Max300000000] = js.undefined
    /**
         * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
         */
    var MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined
    /**
         * Number of B-frames between reference frames.
         */
    var NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7] = js.undefined
    var ParControl: js.UndefOr[Mpeg2ParControl] = js.undefined
    /**
         * Pixel Aspect Ratio denominator.
         */
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    /**
         * Pixel Aspect Ratio numerator.
         */
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    var QualityTuningLevel: js.UndefOr[Mpeg2QualityTuningLevel] = js.undefined
    var RateControlMode: js.UndefOr[Mpeg2RateControlMode] = js.undefined
    var SceneChangeDetect: js.UndefOr[Mpeg2SceneChangeDetect] = js.undefined
    var SlowPal: js.UndefOr[Mpeg2SlowPal] = js.undefined
    /**
         * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
         */
    var Softness: js.UndefOr[__integerMin0Max128] = js.undefined
    var SpatialAdaptiveQuantization: js.UndefOr[Mpeg2SpatialAdaptiveQuantization] = js.undefined
    var Syntax: js.UndefOr[Mpeg2Syntax] = js.undefined
    var Telecine: js.UndefOr[Mpeg2Telecine] = js.undefined
    var TemporalAdaptiveQuantization: js.UndefOr[Mpeg2TemporalAdaptiveQuantization] = js.undefined
  }
  
  
  trait MsSmoothEncryptionSettings extends js.Object {
    var SpekeKeyProvider: js.UndefOr[SpekeKeyProvider] = js.undefined
  }
  
  
  trait MsSmoothGroupSettings extends js.Object {
    var AudioDeduplication: js.UndefOr[MsSmoothAudioDeduplication] = js.undefined
    /**
         * Use Destination (Destination) to specify the S3 output location and the output filename base. Destination accepts format identifiers. If you do not specify the base filename in the URI, the service will use the filename of the input file. If your job has multiple inputs, the service uses the filename of the first input file.
         */
    var Destination: js.UndefOr[__stringPatternS3] = js.undefined
    var Encryption: js.UndefOr[MsSmoothEncryptionSettings] = js.undefined
    /**
         * Use Fragment length (FragmentLength) to specify the mp4 fragment sizes in seconds. Fragment length must be compatible with GOP size and framerate.
         */
    var FragmentLength: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    var ManifestEncoding: js.UndefOr[MsSmoothManifestEncoding] = js.undefined
  }
  
  
  trait NielsenConfiguration extends js.Object {
    /**
         * Use Nielsen Configuration (NielsenConfiguration) to set the Nielsen measurement system breakout code. Supported values are 0, 3, 7, and 9.
         */
    var BreakoutCode: js.UndefOr[__integerMin0Max9] = js.undefined
    /**
         * Use Distributor ID (DistributorID) to specify the distributor ID that is assigned to your organization by Neilsen.
         */
    var DistributorId: js.UndefOr[__string] = js.undefined
  }
  
  
  trait NoiseReducer extends js.Object {
    var Filter: js.UndefOr[NoiseReducerFilter] = js.undefined
    var FilterSettings: js.UndefOr[NoiseReducerFilterSettings] = js.undefined
    var SpatialFilterSettings: js.UndefOr[NoiseReducerSpatialFilterSettings] = js.undefined
  }
  
  
  trait NoiseReducerFilterSettings extends js.Object {
    /**
         * Relative strength of noise reducing filter. Higher values produce stronger filtering.
         */
    var Strength: js.UndefOr[__integerMin0Max3] = js.undefined
  }
  
  
  trait NoiseReducerSpatialFilterSettings extends js.Object {
    /**
         * Specify strength of post noise reduction sharpening filter, with 0 disabling the filter and 3 enabling it at maximum strength.
         */
    var PostFilterSharpenStrength: js.UndefOr[__integerMin0Max3] = js.undefined
    /**
         * The speed of the filter, from -2 (lower speed) to 3 (higher speed), with 0 being the nominal value.
         */
    var Speed: js.UndefOr[__integerMinNegative2Max3] = js.undefined
    /**
         * Relative strength of noise reducing filter. Higher values produce stronger filtering.
         */
    var Strength: js.UndefOr[__integerMin0Max16] = js.undefined
  }
  
  
  trait Output extends js.Object {
    /**
         * (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one instance of (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding settings.
         */
    var AudioDescriptions: js.UndefOr[__listOfAudioDescription] = js.undefined
    /**
         * (CaptionDescriptions) contains groups of captions settings. For each output that has captions, include one instance of (CaptionDescriptions). (CaptionDescriptions) can contain multiple groups of captions settings.
         */
    var CaptionDescriptions: js.UndefOr[__listOfCaptionDescription] = js.undefined
    var ContainerSettings: js.UndefOr[ContainerSettings] = js.undefined
    /**
         * Use Extension (Extension) to specify the file extension for outputs in File output groups. If you do not specify a value, the service will use default extensions by container type as follows * MPEG-2 transport stream, m2ts * Quicktime, mov * MXF container, mxf * MPEG-4 container, mp4 * No Container, the service will use codec extensions (e.g. AAC, H265, H265, AC3)
         */
    var Extension: js.UndefOr[__string] = js.undefined
    /**
         * Use Name modifier (NameModifier) to have the service add a string to the end of each output filename. You specify the base filename as part of your destination URI. When you create multiple outputs in the same output group, Name modifier (NameModifier) is required. Name modifier also accepts format identifiers. For DASH ISO outputs, if you use the format identifiers $Number$ or $Time$ in one output, you must use them in the same way in all outputs of the output group.
         */
    var NameModifier: js.UndefOr[__stringMin1] = js.undefined
    var OutputSettings: js.UndefOr[OutputSettings] = js.undefined
    /**
         * Use Preset (Preset) to specifiy a preset for your transcoding settings. Provide the system or custom preset name. You can specify either Preset (Preset) or Container settings (ContainerSettings), but not both.
         */
    var Preset: js.UndefOr[__stringMin0] = js.undefined
    /**
         * (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the video codec you choose when you specify a value for Video codec (codec). Include one instance of (VideoDescription) per output.
         */
    var VideoDescription: js.UndefOr[VideoDescription] = js.undefined
  }
  
  
  trait OutputChannelMapping extends js.Object {
    /**
         * List of input channels
         */
    var InputChannels: js.UndefOr[__listOf__integerMinNegative60Max6] = js.undefined
  }
  
  
  trait OutputDetail extends js.Object {
    /**
         * Duration in milliseconds
         */
    var DurationInMs: js.UndefOr[__integer] = js.undefined
    var VideoDetails: js.UndefOr[VideoDetail] = js.undefined
  }
  
  
  trait OutputGroup extends js.Object {
    /**
         * Use Custom Group Name (CustomName) to specify a name for the output group. This value is displayed on the console and can make your job settings JSON more human-readable. It does not affect your outputs. Use up to twelve characters that are either letters, numbers, spaces, or underscores.
         */
    var CustomName: js.UndefOr[__string] = js.undefined
    /**
         * Name of the output group
         */
    var Name: js.UndefOr[__string] = js.undefined
    var OutputGroupSettings: js.UndefOr[OutputGroupSettings] = js.undefined
    /**
         * This object holds groups of encoding settings, one group of settings per output.
         */
    var Outputs: js.UndefOr[__listOfOutput] = js.undefined
  }
  
  
  trait OutputGroupDetail extends js.Object {
    /**
         * Details about the output
         */
    var OutputDetails: js.UndefOr[__listOfOutputDetail] = js.undefined
  }
  
  
  trait OutputGroupSettings extends js.Object {
    var CmafGroupSettings: js.UndefOr[CmafGroupSettings] = js.undefined
    var DashIsoGroupSettings: js.UndefOr[DashIsoGroupSettings] = js.undefined
    var FileGroupSettings: js.UndefOr[FileGroupSettings] = js.undefined
    var HlsGroupSettings: js.UndefOr[HlsGroupSettings] = js.undefined
    var MsSmoothGroupSettings: js.UndefOr[MsSmoothGroupSettings] = js.undefined
    var Type: js.UndefOr[OutputGroupType] = js.undefined
  }
  
  
  trait OutputSettings extends js.Object {
    var HlsSettings: js.UndefOr[HlsSettings] = js.undefined
  }
  
  
  trait Preset extends js.Object {
    /**
         * An identifier for this resource that is unique within all of AWS.
         */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
         * An optional category you create to organize your presets.
         */
    var Category: js.UndefOr[__string] = js.undefined
    /**
         * The timestamp in epoch seconds for preset creation.
         */
    var CreatedAt: js.UndefOr[__timestampUnix] = js.undefined
    /**
         * An optional description you create for each preset.
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * The timestamp in epoch seconds when the preset was last updated.
         */
    var LastUpdated: js.UndefOr[__timestampUnix] = js.undefined
    /**
         * A name you create for each preset. Each name must be unique within your account.
         */
    var Name: __string
    var Settings: PresetSettings
    /**
         * A preset can be of two types: system or custom. System or built-in preset can't be modified or deleted by the user.
         */
    var Type: js.UndefOr[Type] = js.undefined
  }
  
  
  trait PresetSettings extends js.Object {
    /**
         * (AudioDescriptions) contains groups of audio encoding settings organized by audio codec. Include one instance of (AudioDescriptions) per output. (AudioDescriptions) can contain multiple groups of encoding settings.
         */
    var AudioDescriptions: js.UndefOr[__listOfAudioDescription] = js.undefined
    /**
         * Caption settings for this preset. There can be multiple caption settings in a single output.
         */
    var CaptionDescriptions: js.UndefOr[__listOfCaptionDescriptionPreset] = js.undefined
    var ContainerSettings: js.UndefOr[ContainerSettings] = js.undefined
    /**
         * (VideoDescription) contains a group of video encoding settings. The specific video settings depend on the video codec you choose when you specify a value for Video codec (codec). Include one instance of (VideoDescription) per output.
         */
    var VideoDescription: js.UndefOr[VideoDescription] = js.undefined
  }
  
  
  trait ProresSettings extends js.Object {
    var CodecProfile: js.UndefOr[ProresCodecProfile] = js.undefined
    var FramerateControl: js.UndefOr[ProresFramerateControl] = js.undefined
    var FramerateConversionAlgorithm: js.UndefOr[ProresFramerateConversionAlgorithm] = js.undefined
    /**
         * Framerate denominator.
         */
    var FramerateDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    /**
         * When you use the API for transcode jobs that use framerate conversion, specify the framerate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this example, use 24000 for the value of FramerateNumerator.
         */
    var FramerateNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    var InterlaceMode: js.UndefOr[ProresInterlaceMode] = js.undefined
    var ParControl: js.UndefOr[ProresParControl] = js.undefined
    /**
         * Pixel Aspect Ratio denominator.
         */
    var ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    /**
         * Pixel Aspect Ratio numerator.
         */
    var ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    var SlowPal: js.UndefOr[ProresSlowPal] = js.undefined
    var Telecine: js.UndefOr[ProresTelecine] = js.undefined
  }
  
  
  trait Queue extends js.Object {
    /**
         * An identifier for this resource that is unique within all of AWS.
         */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
         * The time stamp in epoch seconds for queue creation.
         */
    var CreatedAt: js.UndefOr[__timestampUnix] = js.undefined
    /**
         * An optional description that you create for each queue.
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * The time stamp in epoch seconds when the queue was last updated.
         */
    var LastUpdated: js.UndefOr[__timestampUnix] = js.undefined
    /**
         * A name that you create for each queue. Each name must be unique within your account.
         */
    var Name: __string
    /**
         * Specifies whether the pricing plan for the queue is On-demand or Reserved. The pricing plan for the queue determines whether you pay On-demand or Reserved pricing for the transcoding jobs that you run through the queue. For Reserved queue pricing, you must set up a contract. You can create a Reserved queue contract through the AWS Elemental MediaConvert console.
         */
    var PricingPlan: js.UndefOr[PricingPlan] = js.undefined
    /**
         * The estimated number of jobs with a PROGRESSING status.
         */
    var ProgressingJobsCount: js.UndefOr[__integer] = js.undefined
    /**
         * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
         */
    var ReservationPlan: js.UndefOr[ReservationPlan] = js.undefined
    /**
         * Queues can be ACTIVE or PAUSED. If you pause a queue, the service won't begin processing jobs in that queue. Jobs that are running when you pause the queue continue to run until they finish or result in an error.
         */
    var Status: js.UndefOr[QueueStatus] = js.undefined
    /**
         * The estimated number of jobs with a SUBMITTED status.
         */
    var SubmittedJobsCount: js.UndefOr[__integer] = js.undefined
    /**
         * Specifies whether this queue is system or custom. System queues are built in. You can't modify or delete system queues. You can create and modify custom queues.
         */
    var Type: js.UndefOr[Type] = js.undefined
  }
  
  
  trait Rectangle extends js.Object {
    /**
         * Height of rectangle in pixels. Specify only even numbers.
         */
    var Height: js.UndefOr[__integerMin2Max2147483647] = js.undefined
    /**
         * Width of rectangle in pixels. Specify only even numbers.
         */
    var Width: js.UndefOr[__integerMin2Max2147483647] = js.undefined
    /**
         * The distance, in pixels, between the rectangle and the left edge of the video frame. Specify only even numbers.
         */
    var X: js.UndefOr[__integerMin0Max2147483647] = js.undefined
    /**
         * The distance, in pixels, between the rectangle and the top edge of the video frame. Specify only even numbers.
         */
    var Y: js.UndefOr[__integerMin0Max2147483647] = js.undefined
  }
  
  
  trait RemixSettings extends js.Object {
    var ChannelMapping: js.UndefOr[ChannelMapping] = js.undefined
    /**
         * Specify the number of audio channels from your input that you want to use in your output. With remixing, you might combine or split the data in these channels, so the number of channels in your final output might be different.
         */
    var ChannelsIn: js.UndefOr[__integerMin1Max16] = js.undefined
    /**
         * Specify the number of channels in this output after remixing. Valid values: 1, 2, 4, 6, 8
         */
    var ChannelsOut: js.UndefOr[__integerMin1Max8] = js.undefined
  }
  
  
  trait ReservationPlan extends js.Object {
    /**
         * The length of time that you commit to when you set up a pricing plan contract for a reserved queue.
         */
    var Commitment: js.UndefOr[Commitment] = js.undefined
    /**
         * The time stamp, in epoch seconds, for when the pricing plan for this reserved queue expires.
         */
    var ExpiresAt: js.UndefOr[__timestampUnix] = js.undefined
    /**
         * The time stamp in epoch seconds when the reserved queue's reservation plan was created.
         */
    var PurchasedAt: js.UndefOr[__timestampUnix] = js.undefined
    /**
         * Specifies whether the pricing plan contract for your reserved queue automatically renews (AUTO_RENEW) or expires (EXPIRE) at the end of the contract period.
         */
    var RenewalType: js.UndefOr[RenewalType] = js.undefined
    /**
         * Specifies the number of reserved transcode slots (RTSs) for this queue. The number of RTS determines how many jobs the queue can process in parallel; each RTS can process one job at a time. To increase this number, create a replacement contract through the AWS Elemental MediaConvert console.
         */
    var ReservedSlots: js.UndefOr[__integer] = js.undefined
    /**
         * Specifies whether the pricing plan for your reserved queue is ACTIVE or EXPIRED.
         */
    var Status: js.UndefOr[ReservationPlanStatus] = js.undefined
  }
  
  
  trait ReservationPlanSettings extends js.Object {
    /**
         * The length of time that you commit to when you set up a pricing plan contract for a reserved queue.
         */
    var Commitment: Commitment
    /**
         * Specifies whether the pricing plan contract for your reserved queue automatically renews (AUTO_RENEW) or expires (EXPIRE) at the end of the contract period.
         */
    var RenewalType: RenewalType
    /**
         * Specifies the number of reserved transcode slots (RTSs) for this queue. The number of RTS determines how many jobs the queue can process in parallel; each RTS can process one job at a time. To increase this number, create a replacement contract through the AWS Elemental MediaConvert console.
         */
    var ReservedSlots: __integer
  }
  
  
  trait ResourceTags extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource.
         */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
         * The tags for the resource.
         */
    var Tags: js.UndefOr[__mapOf__string] = js.undefined
  }
  
  
  trait SccDestinationSettings extends js.Object {
    var Framerate: js.UndefOr[SccDestinationFramerate] = js.undefined
  }
  
  
  trait SpekeKeyProvider extends js.Object {
    /**
         * The SPEKE-compliant server uses Resource ID (ResourceId) to identify content.
         */
    var ResourceId: js.UndefOr[__string] = js.undefined
    /**
         * Relates to SPEKE implementation. DRM system identifiers. DASH output groups support a max of two system ids. Other group types support one system id.
         */
    var SystemIds: js.UndefOr[__listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.undefined
    /**
         * Use URL (Url) to specify the SPEKE-compliant server that will provide keys for content.
         */
    var Url: js.UndefOr[__stringPatternHttps] = js.undefined
  }
  
  
  trait StaticKeyProvider extends js.Object {
    /**
         * Relates to DRM implementation. Sets the value of the KEYFORMAT attribute. Must be 'identity' or a reverse DNS string. May be omitted to indicate an implicit value of 'identity'.
         */
    var KeyFormat: js.UndefOr[__stringPatternIdentityAZaZ26AZaZ09163] = js.undefined
    /**
         * Relates to DRM implementation. Either a single positive integer version value or a slash delimited list of version values (1/2/3).
         */
    var KeyFormatVersions: js.UndefOr[__stringPatternDD] = js.undefined
    /**
         * Relates to DRM implementation. Use a 32-character hexidecimal string to specify Key Value (StaticKeyValue).
         */
    var StaticKeyValue: js.UndefOr[__stringPatternAZaZ0932] = js.undefined
    /**
         * Relates to DRM implementation. The location of the license server used for protecting content.
         */
    var Url: js.UndefOr[__string] = js.undefined
  }
  
  
  trait TagResourceRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource that you want to tag. To get the ARN, send a GET request with the resource name.
         */
    var Arn: __string
    /**
         * The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key.
         */
    var Tags: __mapOf__string
  }
  
  
  trait TagResourceResponse extends js.Object
  
  
  trait TeletextDestinationSettings extends js.Object {
    /**
         * Set pageNumber to the Teletext page number for the destination captions for this output. This value must be a three-digit hexadecimal string; strings ending in -FF are invalid. If you are passing through the entire set of Teletext data, do not use this field.
         */
    var PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE] = js.undefined
  }
  
  
  trait TeletextSourceSettings extends js.Object {
    /**
         * Use Page Number (PageNumber) to specify the three-digit hexadecimal page number that will be used for Teletext captions. Do not use this setting if you are passing through teletext from the input source to output.
         */
    var PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE] = js.undefined
  }
  
  
  trait TimecodeBurnin extends js.Object {
    /**
         * Use Font Size (FontSize) to set the font size of any burned-in timecode. Valid values are 10, 16, 32, 48.
         */
    var FontSize: js.UndefOr[__integerMin10Max48] = js.undefined
    var Position: js.UndefOr[TimecodeBurninPosition] = js.undefined
    /**
         * Use Prefix (Prefix) to place ASCII characters before any burned-in timecode. For example, a prefix of "EZ-" will result in the timecode "EZ-00:00:00:00". Provide either the characters themselves or the ASCII code equivalents. The supported range of characters is 0x20 through 0x7e. This includes letters, numbers, and all special characters represented on a standard English keyboard.
         */
    var Prefix: js.UndefOr[__stringPattern] = js.undefined
  }
  
  
  trait TimecodeConfig extends js.Object {
    /**
         * If you use an editing platform that relies on an anchor timecode, use Anchor Timecode (Anchor) to specify a timecode that will match the input video frame to the output video frame. Use 24-hour format with frame number, (HH:MM:SS:FF) or (HH:MM:SS;FF). This setting ignores framerate conversion. System behavior for Anchor Timecode varies depending on your setting for Source (TimecodeSource). * If Source (TimecodeSource) is set to Specified Start (SPECIFIEDSTART), the first input frame is the specified value in Start Timecode (Start). Anchor Timecode (Anchor) and Start Timecode (Start) are used calculate output timecode. * If Source (TimecodeSource) is set to Start at 0 (ZEROBASED)  the  first frame is 00:00:00:00. * If Source (TimecodeSource) is set to Embedded (EMBEDDED), the  first frame is the timecode value on the first input frame of the input.
         */
    var Anchor: js.UndefOr[__stringPattern010920405090509092] = js.undefined
    var Source: js.UndefOr[TimecodeSource] = js.undefined
    /**
         * Only use when you set Source (TimecodeSource) to Specified start (SPECIFIEDSTART). Use Start timecode (Start) to specify the timecode for the initial frame. Use 24-hour format with frame number, (HH:MM:SS:FF) or (HH:MM:SS;FF).
         */
    var Start: js.UndefOr[__stringPattern010920405090509092] = js.undefined
    /**
         * Only applies to outputs that support program-date-time stamp. Use Timestamp offset (TimestampOffset) to overwrite the timecode date without affecting the time and frame number. Provide the new date as a string in the format "yyyy-mm-dd".  To use Time stamp offset, you must also enable Insert program-date-time (InsertProgramDateTime) in the output settings. For example, if the date part of your timecodes is 2002-1-25 and you want to change it to one year later, set Timestamp offset (TimestampOffset) to 2003-1-25.
         */
    var TimestampOffset: js.UndefOr[__stringPattern0940191020191209301] = js.undefined
  }
  
  
  trait TimedMetadataInsertion extends js.Object {
    /**
         * Id3Insertions contains the array of Id3Insertion instances.
         */
    var Id3Insertions: js.UndefOr[__listOfId3Insertion] = js.undefined
  }
  
  
  trait Timing extends js.Object {
    /**
         * The time, in Unix epoch format, that the transcoding job finished
         */
    var FinishTime: js.UndefOr[__timestampUnix] = js.undefined
    /**
         * The time, in Unix epoch format, that transcoding for the job began.
         */
    var StartTime: js.UndefOr[__timestampUnix] = js.undefined
    /**
         * The time, in Unix epoch format, that you submitted the job.
         */
    var SubmitTime: js.UndefOr[__timestampUnix] = js.undefined
  }
  
  
  trait TtmlDestinationSettings extends js.Object {
    var StylePassthrough: js.UndefOr[TtmlStylePassthrough] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Permanently remove a job from a queue. Once you have canceled a job, you can't start it again. You can't delete a running job.
       */
    def cancelJob(): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently remove a job from a queue. Once you have canceled a job, you can't start it again. You can't delete a running job.
       */
    def cancelJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently remove a job from a queue. Once you have canceled a job, you can't start it again. You can't delete a running job.
       */
    def cancelJob(params: CancelJobRequest): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently remove a job from a queue. Once you have canceled a job, you can't start it again. You can't delete a running job.
       */
    def cancelJob(
      params: CancelJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new transcoding job. For information about jobs and job settings, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createJob(): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new transcoding job. For information about jobs and job settings, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new transcoding job. For information about jobs and job settings, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createJob(params: CreateJobRequest): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new transcoding job. For information about jobs and job settings, see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createJob(
      params: CreateJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new job template. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createJobTemplate(): awsDashSdkLib.libRequestMod.Request[CreateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new job template. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createJobTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateJobTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new job template. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createJobTemplate(params: CreateJobTemplateRequest): awsDashSdkLib.libRequestMod.Request[CreateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new job template. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createJobTemplate(
      params: CreateJobTemplateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateJobTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new preset. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createPreset(): awsDashSdkLib.libRequestMod.Request[CreatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new preset. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createPreset(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePresetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new preset. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createPreset(params: CreatePresetRequest): awsDashSdkLib.libRequestMod.Request[CreatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new preset. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createPreset(
      params: CreatePresetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreatePresetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new transcoding queue. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createQueue(): awsDashSdkLib.libRequestMod.Request[CreateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new transcoding queue. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createQueue(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateQueueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new transcoding queue. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createQueue(params: CreateQueueRequest): awsDashSdkLib.libRequestMod.Request[CreateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Create a new transcoding queue. For information about job templates see the User Guide at http://docs.aws.amazon.com/mediaconvert/latest/ug/what-is.html
       */
    def createQueue(
      params: CreateQueueRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateQueueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently delete a job template you have created.
       */
    def deleteJobTemplate(): awsDashSdkLib.libRequestMod.Request[DeleteJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently delete a job template you have created.
       */
    def deleteJobTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteJobTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently delete a job template you have created.
       */
    def deleteJobTemplate(params: DeleteJobTemplateRequest): awsDashSdkLib.libRequestMod.Request[DeleteJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently delete a job template you have created.
       */
    def deleteJobTemplate(
      params: DeleteJobTemplateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteJobTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently delete a preset you have created.
       */
    def deletePreset(): awsDashSdkLib.libRequestMod.Request[DeletePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently delete a preset you have created.
       */
    def deletePreset(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeletePresetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeletePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently delete a preset you have created.
       */
    def deletePreset(params: DeletePresetRequest): awsDashSdkLib.libRequestMod.Request[DeletePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently delete a preset you have created.
       */
    def deletePreset(
      params: DeletePresetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeletePresetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeletePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently delete a queue you have created.
       */
    def deleteQueue(): awsDashSdkLib.libRequestMod.Request[DeleteQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently delete a queue you have created.
       */
    def deleteQueue(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteQueueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently delete a queue you have created.
       */
    def deleteQueue(params: DeleteQueueRequest): awsDashSdkLib.libRequestMod.Request[DeleteQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Permanently delete a queue you have created.
       */
    def deleteQueue(
      params: DeleteQueueRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteQueueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Send an request with an empty body to the regional API endpoint to get your account API endpoint.
       */
    def describeEndpoints(): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Send an request with an empty body to the regional API endpoint to get your account API endpoint.
       */
    def describeEndpoints(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Send an request with an empty body to the regional API endpoint to get your account API endpoint.
       */
    def describeEndpoints(params: DescribeEndpointsRequest): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Send an request with an empty body to the regional API endpoint to get your account API endpoint.
       */
    def describeEndpoints(
      params: DescribeEndpointsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeEndpointsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific completed transcoding job.
       */
    def getJob(): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific completed transcoding job.
       */
    def getJob(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific completed transcoding job.
       */
    def getJob(params: GetJobRequest): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific completed transcoding job.
       */
    def getJob(
      params: GetJobRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific job template.
       */
    def getJobTemplate(): awsDashSdkLib.libRequestMod.Request[GetJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific job template.
       */
    def getJobTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific job template.
       */
    def getJobTemplate(params: GetJobTemplateRequest): awsDashSdkLib.libRequestMod.Request[GetJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific job template.
       */
    def getJobTemplate(
      params: GetJobTemplateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetJobTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific preset.
       */
    def getPreset(): awsDashSdkLib.libRequestMod.Request[GetPresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific preset.
       */
    def getPreset(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPresetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific preset.
       */
    def getPreset(params: GetPresetRequest): awsDashSdkLib.libRequestMod.Request[GetPresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific preset.
       */
    def getPreset(
      params: GetPresetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPresetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific queue.
       */
    def getQueue(): awsDashSdkLib.libRequestMod.Request[GetQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific queue.
       */
    def getQueue(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQueueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific queue.
       */
    def getQueue(params: GetQueueRequest): awsDashSdkLib.libRequestMod.Request[GetQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the JSON for a specific queue.
       */
    def getQueue(
      params: GetQueueRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetQueueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array
       */
    def listJobTemplates(): awsDashSdkLib.libRequestMod.Request[ListJobTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array
       */
    def listJobTemplates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListJobTemplatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListJobTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array
       */
    def listJobTemplates(params: ListJobTemplatesRequest): awsDashSdkLib.libRequestMod.Request[ListJobTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your job templates. This will return the templates themselves, not just a list of them. To retrieve the next twenty templates, use the nextToken string returned with the array
       */
    def listJobTemplates(
      params: ListJobTemplatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListJobTemplatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListJobTemplatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process, completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the twenty next most recent jobs, use the nextToken string returned with the array.
       */
    def listJobs(): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process, completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the twenty next most recent jobs, use the nextToken string returned with the array.
       */
    def listJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process, completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the twenty next most recent jobs, use the nextToken string returned with the array.
       */
    def listJobs(params: ListJobsRequest): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your most recently created jobs. This array includes in-process, completed, and errored jobs. This will return the jobs themselves, not just a list of the jobs. To retrieve the twenty next most recent jobs, use the nextToken string returned with the array.
       */
    def listJobs(
      params: ListJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list of them. To retrieve the next twenty presets, use the nextToken string returned with the array.
       */
    def listPresets(): awsDashSdkLib.libRequestMod.Request[ListPresetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list of them. To retrieve the next twenty presets, use the nextToken string returned with the array.
       */
    def listPresets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPresetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPresetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list of them. To retrieve the next twenty presets, use the nextToken string returned with the array.
       */
    def listPresets(params: ListPresetsRequest): awsDashSdkLib.libRequestMod.Request[ListPresetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your presets. This will return the presets themselves, not just a list of them. To retrieve the next twenty presets, use the nextToken string returned with the array.
       */
    def listPresets(
      params: ListPresetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPresetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPresetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of them. To retrieve the next twenty queues, use the nextToken string returned with the array.
       */
    def listQueues(): awsDashSdkLib.libRequestMod.Request[ListQueuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of them. To retrieve the next twenty queues, use the nextToken string returned with the array.
       */
    def listQueues(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListQueuesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListQueuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of them. To retrieve the next twenty queues, use the nextToken string returned with the array.
       */
    def listQueues(params: ListQueuesRequest): awsDashSdkLib.libRequestMod.Request[ListQueuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve a JSON array of up to twenty of your queues. This will return the queues themselves, not just a list of them. To retrieve the next twenty queues, use the nextToken string returned with the array.
       */
    def listQueues(
      params: ListQueuesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListQueuesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListQueuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the tags for a MediaConvert resource.
       */
    def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the tags for a MediaConvert resource.
       */
    def listTagsForResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the tags for a MediaConvert resource.
       */
    def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieve the tags for a MediaConvert resource.
       */
    def listTagsForResource(
      params: ListTagsForResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsForResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
       */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
       */
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
       */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Add tags to a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
       */
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
       */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
       */
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
       */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Remove tags from a MediaConvert queue, preset, or job template. For information about tagging, see the User Guide at https://docs.aws.amazon.com/mediaconvert/latest/ug/tagging-resources.html
       */
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify one of your existing job templates.
       */
    def updateJobTemplate(): awsDashSdkLib.libRequestMod.Request[UpdateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify one of your existing job templates.
       */
    def updateJobTemplate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateJobTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify one of your existing job templates.
       */
    def updateJobTemplate(params: UpdateJobTemplateRequest): awsDashSdkLib.libRequestMod.Request[UpdateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify one of your existing job templates.
       */
    def updateJobTemplate(
      params: UpdateJobTemplateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateJobTemplateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateJobTemplateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify one of your existing presets.
       */
    def updatePreset(): awsDashSdkLib.libRequestMod.Request[UpdatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify one of your existing presets.
       */
    def updatePreset(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePresetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify one of your existing presets.
       */
    def updatePreset(params: UpdatePresetRequest): awsDashSdkLib.libRequestMod.Request[UpdatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify one of your existing presets.
       */
    def updatePreset(
      params: UpdatePresetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdatePresetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdatePresetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify one of your existing queues.
       */
    def updateQueue(): awsDashSdkLib.libRequestMod.Request[UpdateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify one of your existing queues.
       */
    def updateQueue(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateQueueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify one of your existing queues.
       */
    def updateQueue(params: UpdateQueueRequest): awsDashSdkLib.libRequestMod.Request[UpdateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modify one of your existing queues.
       */
    def updateQueue(
      params: UpdateQueueRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateQueueResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateQueueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UntagResourceRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the resource that you want to remove tags from. To get the ARN, send a GET request with the resource name.
         */
    var Arn: __string
    /**
         * The keys of the tags that you want to remove from the resource.
         */
    var TagKeys: js.UndefOr[__listOf__string] = js.undefined
  }
  
  
  trait UntagResourceResponse extends js.Object
  
  
  trait UpdateJobTemplateRequest extends js.Object {
    /**
         * The new category for the job template, if you are changing it.
         */
    var Category: js.UndefOr[__string] = js.undefined
    /**
         * The new description for the job template, if you are changing it.
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * The name of the job template you are modifying
         */
    var Name: __string
    /**
         * The new queue for the job template, if you are changing it.
         */
    var Queue: js.UndefOr[__string] = js.undefined
    var Settings: js.UndefOr[JobTemplateSettings] = js.undefined
  }
  
  
  trait UpdateJobTemplateResponse extends js.Object {
    var JobTemplate: js.UndefOr[JobTemplate] = js.undefined
  }
  
  
  trait UpdatePresetRequest extends js.Object {
    /**
         * The new category for the preset, if you are changing it.
         */
    var Category: js.UndefOr[__string] = js.undefined
    /**
         * The new description for the preset, if you are changing it.
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * The name of the preset you are modifying.
         */
    var Name: __string
    var Settings: js.UndefOr[PresetSettings] = js.undefined
  }
  
  
  trait UpdatePresetResponse extends js.Object {
    var Preset: js.UndefOr[Preset] = js.undefined
  }
  
  
  trait UpdateQueueRequest extends js.Object {
    /**
         * The new description for the queue, if you are changing it.
         */
    var Description: js.UndefOr[__string] = js.undefined
    /**
         * The name of the queue that you are modifying.
         */
    var Name: __string
    /**
         * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to on-demand queues.
         */
    var ReservationPlanSettings: js.UndefOr[ReservationPlanSettings] = js.undefined
    /**
         * Pause or activate a queue by changing its status between ACTIVE and PAUSED. If you pause a queue, jobs in that queue won't begin. Jobs that are running when you pause the queue continue to run until they finish or result in an error.
         */
    var Status: js.UndefOr[QueueStatus] = js.undefined
  }
  
  
  trait UpdateQueueResponse extends js.Object {
    var Queue: js.UndefOr[Queue] = js.undefined
  }
  
  
  trait VideoCodecSettings extends js.Object {
    var Codec: js.UndefOr[VideoCodec] = js.undefined
    var FrameCaptureSettings: js.UndefOr[FrameCaptureSettings] = js.undefined
    var H264Settings: js.UndefOr[H264Settings] = js.undefined
    var H265Settings: js.UndefOr[H265Settings] = js.undefined
    var Mpeg2Settings: js.UndefOr[Mpeg2Settings] = js.undefined
    var ProresSettings: js.UndefOr[ProresSettings] = js.undefined
  }
  
  
  trait VideoDescription extends js.Object {
    var AfdSignaling: js.UndefOr[AfdSignaling] = js.undefined
    var AntiAlias: js.UndefOr[AntiAlias] = js.undefined
    var CodecSettings: js.UndefOr[VideoCodecSettings] = js.undefined
    var ColorMetadata: js.UndefOr[ColorMetadata] = js.undefined
    /**
         * Applies only if your input aspect ratio is different from your output aspect ratio. Use Input cropping rectangle (Crop) to specify the  video area the service will include in the output. This will crop the input source, causing video pixels to be removed on encode. Do not use this setting if you have enabled Stretch to output (stretchToOutput) in your output settings.
         */
    var Crop: js.UndefOr[Rectangle] = js.undefined
    var DropFrameTimecode: js.UndefOr[DropFrameTimecode] = js.undefined
    /**
         * Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use Fixed (FixedAfd) to specify a four-bit AFD value which the service will write on all  frames of this video output.
         */
    var FixedAfd: js.UndefOr[__integerMin0Max15] = js.undefined
    /**
         * Use the Height (Height) setting to define the video resolution height for this output. Specify in pixels. If you don't provide a value here, the service will use the input height.
         */
    var Height: js.UndefOr[__integerMin32Max2160] = js.undefined
    /**
         * Use Position (Position) to point to a rectangle object to define your position. This setting overrides any other aspect ratio.
         */
    var Position: js.UndefOr[Rectangle] = js.undefined
    var RespondToAfd: js.UndefOr[RespondToAfd] = js.undefined
    var ScalingBehavior: js.UndefOr[ScalingBehavior] = js.undefined
    /**
         * Use Sharpness (Sharpness)setting to specify the strength of anti-aliasing. This setting changes the width of the anti-alias filter kernel used for scaling. Sharpness only applies if your output resolution is different from your input resolution, and if you set Anti-alias (AntiAlias) to ENABLED. 0 is the softest setting, 100 the sharpest, and 50 recommended for most content.
         */
    var Sharpness: js.UndefOr[__integerMin0Max100] = js.undefined
    var TimecodeInsertion: js.UndefOr[VideoTimecodeInsertion] = js.undefined
    /**
         * Find additional transcoding features under Preprocessors (VideoPreprocessors). Enable the features at each output individually. These features are disabled by default.
         */
    var VideoPreprocessors: js.UndefOr[VideoPreprocessor] = js.undefined
    /**
         * Use Width (Width) to define the video resolution width, in pixels, for this output. If you don't provide a value here, the service will use the input width.
         */
    var Width: js.UndefOr[__integerMin32Max4096] = js.undefined
  }
  
  
  trait VideoDetail extends js.Object {
    /**
         * Height in pixels for the output
         */
    var HeightInPx: js.UndefOr[__integer] = js.undefined
    /**
         * Width in pixels for the output
         */
    var WidthInPx: js.UndefOr[__integer] = js.undefined
  }
  
  
  trait VideoPreprocessor extends js.Object {
    /**
         * Enable the Color corrector (ColorCorrector) feature if necessary. Enable or disable this feature for each output individually. This setting is disabled by default.
         */
    var ColorCorrector: js.UndefOr[ColorCorrector] = js.undefined
    /**
         * Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer picture.
         */
    var Deinterlacer: js.UndefOr[Deinterlacer] = js.undefined
    /**
         * Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or disable this feature for each output individually. This setting is disabled by default.
         */
    var ImageInserter: js.UndefOr[ImageInserter] = js.undefined
    /**
         * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or disable this feature for each output individually. This setting is disabled by default.
         */
    var NoiseReducer: js.UndefOr[NoiseReducer] = js.undefined
    /**
         * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
         */
    var TimecodeBurnin: js.UndefOr[TimecodeBurnin] = js.undefined
  }
  
  
  trait VideoSelector extends js.Object {
    var ColorSpace: js.UndefOr[ColorSpace] = js.undefined
    var ColorSpaceUsage: js.UndefOr[ColorSpaceUsage] = js.undefined
    var Hdr10Metadata: js.UndefOr[Hdr10Metadata] = js.undefined
    /**
         * Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the system automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or packet identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
         */
    var Pid: js.UndefOr[__integerMin1Max2147483647] = js.undefined
    /**
         * Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not currently supported.
         */
    var ProgramNumber: js.UndefOr[__integerMinNegative2147483648Max2147483647] = js.undefined
  }
  
  
  trait WavSettings extends js.Object {
    /**
         * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
         */
    var BitDepth: js.UndefOr[__integerMin16Max24] = js.undefined
    /**
         * Set Channels to specify the number of channels in this output audio track. With WAV, valid values 1, 2, 4, and 8. In the console, these values are Mono, Stereo, 4-Channel, and 8-Channel, respectively.
         */
    var Channels: js.UndefOr[__integerMin1Max8] = js.undefined
    var Format: js.UndefOr[WavFormat] = js.undefined
    /**
         * Sample rate in Hz.
         */
    var SampleRate: js.UndefOr[__integerMin8000Max192000] = js.undefined
  }
  
  
  trait __mapOfAudioSelector
    extends /* key */ ScalablyTyped.runtime.StringDictionary[AudioSelector]
  
  
  trait __mapOfAudioSelectorGroup
    extends /* key */ ScalablyTyped.runtime.StringDictionary[AudioSelectorGroup]
  
  
  trait __mapOfCaptionSelector
    extends /* key */ ScalablyTyped.runtime.StringDictionary[CaptionSelector]
  
  
  trait __mapOf__string
    extends /* key */ ScalablyTyped.runtime.StringDictionary[__string]
  
  val TypesNs: this.type = js.native
  type AacAudioDescriptionBroadcasterMix = awsDashSdkLib.awsDashSdkLibStrings.BROADCASTER_MIXED_AD | awsDashSdkLib.awsDashSdkLibStrings.NORMAL | java.lang.String
  type AacCodecProfile = awsDashSdkLib.awsDashSdkLibStrings.LC | awsDashSdkLib.awsDashSdkLibStrings.HEV1 | awsDashSdkLib.awsDashSdkLibStrings.HEV2 | java.lang.String
  type AacCodingMode = awsDashSdkLib.awsDashSdkLibStrings.AD_RECEIVER_MIX | awsDashSdkLib.awsDashSdkLibStrings.CODING_MODE_1_0 | awsDashSdkLib.awsDashSdkLibStrings.CODING_MODE_1_1 | awsDashSdkLib.awsDashSdkLibStrings.CODING_MODE_2_0 | awsDashSdkLib.awsDashSdkLibStrings.CODING_MODE_5_1 | java.lang.String
  type AacRateControlMode = awsDashSdkLib.awsDashSdkLibStrings.CBR | awsDashSdkLib.awsDashSdkLibStrings.VBR | java.lang.String
  type AacRawFormat = awsDashSdkLib.awsDashSdkLibStrings.LATM_LOAS | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type AacSpecification = awsDashSdkLib.awsDashSdkLibStrings.MPEG2 | awsDashSdkLib.awsDashSdkLibStrings.MPEG4 | java.lang.String
  type AacVbrQuality = awsDashSdkLib.awsDashSdkLibStrings.LOW | awsDashSdkLib.awsDashSdkLibStrings.MEDIUM_LOW | awsDashSdkLib.awsDashSdkLibStrings.MEDIUM_HIGH | awsDashSdkLib.awsDashSdkLibStrings.HIGH | java.lang.String
  type Ac3BitstreamMode = awsDashSdkLib.awsDashSdkLibStrings.COMPLETE_MAIN | awsDashSdkLib.awsDashSdkLibStrings.COMMENTARY | awsDashSdkLib.awsDashSdkLibStrings.DIALOGUE | awsDashSdkLib.awsDashSdkLibStrings.EMERGENCY | awsDashSdkLib.awsDashSdkLibStrings.HEARING_IMPAIRED | awsDashSdkLib.awsDashSdkLibStrings.MUSIC_AND_EFFECTS | awsDashSdkLib.awsDashSdkLibStrings.VISUALLY_IMPAIRED | awsDashSdkLib.awsDashSdkLibStrings.VOICE_OVER | java.lang.String
  type Ac3CodingMode = awsDashSdkLib.awsDashSdkLibStrings.CODING_MODE_1_0 | awsDashSdkLib.awsDashSdkLibStrings.CODING_MODE_1_1 | awsDashSdkLib.awsDashSdkLibStrings.CODING_MODE_2_0 | awsDashSdkLib.awsDashSdkLibStrings.CODING_MODE_3_2_LFE | java.lang.String
  type Ac3DynamicRangeCompressionProfile = awsDashSdkLib.awsDashSdkLibStrings.FILM_STANDARD | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type Ac3LfeFilter = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type Ac3MetadataControl = awsDashSdkLib.awsDashSdkLibStrings.FOLLOW_INPUT | awsDashSdkLib.awsDashSdkLibStrings.USE_CONFIGURED | java.lang.String
  type AfdSignaling = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.AUTO | awsDashSdkLib.awsDashSdkLibStrings.FIXED | java.lang.String
  type AntiAlias = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type AudioCodec = awsDashSdkLib.awsDashSdkLibStrings.AAC | awsDashSdkLib.awsDashSdkLibStrings.MP2 | awsDashSdkLib.awsDashSdkLibStrings.WAV | awsDashSdkLib.awsDashSdkLibStrings.AIFF | awsDashSdkLib.awsDashSdkLibStrings.AC3 | awsDashSdkLib.awsDashSdkLibStrings.EAC3 | awsDashSdkLib.awsDashSdkLibStrings.PASSTHROUGH | java.lang.String
  type AudioDefaultSelection = awsDashSdkLib.awsDashSdkLibStrings.DEFAULT | awsDashSdkLib.awsDashSdkLibStrings.NOT_DEFAULT | java.lang.String
  type AudioLanguageCodeControl = awsDashSdkLib.awsDashSdkLibStrings.FOLLOW_INPUT | awsDashSdkLib.awsDashSdkLibStrings.USE_CONFIGURED | java.lang.String
  type AudioNormalizationAlgorithm = awsDashSdkLib.awsDashSdkLibStrings.ITU_BS_1770_1 | awsDashSdkLib.awsDashSdkLibStrings.ITU_BS_1770_2 | java.lang.String
  type AudioNormalizationAlgorithmControl = awsDashSdkLib.awsDashSdkLibStrings.CORRECT_AUDIO | awsDashSdkLib.awsDashSdkLibStrings.MEASURE_ONLY | java.lang.String
  type AudioNormalizationLoudnessLogging = awsDashSdkLib.awsDashSdkLibStrings.LOG | awsDashSdkLib.awsDashSdkLibStrings.DONT_LOG | java.lang.String
  type AudioNormalizationPeakCalculation = awsDashSdkLib.awsDashSdkLibStrings.TRUE_PEAK | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type AudioSelectorType = awsDashSdkLib.awsDashSdkLibStrings.PID | awsDashSdkLib.awsDashSdkLibStrings.TRACK | awsDashSdkLib.awsDashSdkLibStrings.LANGUAGE_CODE | java.lang.String
  type AudioTypeControl = awsDashSdkLib.awsDashSdkLibStrings.FOLLOW_INPUT | awsDashSdkLib.awsDashSdkLibStrings.USE_CONFIGURED | java.lang.String
  type BillingTagsSource = awsDashSdkLib.awsDashSdkLibStrings.QUEUE | awsDashSdkLib.awsDashSdkLibStrings.PRESET | awsDashSdkLib.awsDashSdkLibStrings.JOB_TEMPLATE | java.lang.String
  type BurninSubtitleAlignment = awsDashSdkLib.awsDashSdkLibStrings.CENTERED | awsDashSdkLib.awsDashSdkLibStrings.LEFT | java.lang.String
  type BurninSubtitleBackgroundColor = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.BLACK | awsDashSdkLib.awsDashSdkLibStrings.WHITE | java.lang.String
  type BurninSubtitleFontColor = awsDashSdkLib.awsDashSdkLibStrings.WHITE | awsDashSdkLib.awsDashSdkLibStrings.BLACK | awsDashSdkLib.awsDashSdkLibStrings.YELLOW | awsDashSdkLib.awsDashSdkLibStrings.RED | awsDashSdkLib.awsDashSdkLibStrings.GREEN | awsDashSdkLib.awsDashSdkLibStrings.BLUE | java.lang.String
  type BurninSubtitleOutlineColor = awsDashSdkLib.awsDashSdkLibStrings.BLACK | awsDashSdkLib.awsDashSdkLibStrings.WHITE | awsDashSdkLib.awsDashSdkLibStrings.YELLOW | awsDashSdkLib.awsDashSdkLibStrings.RED | awsDashSdkLib.awsDashSdkLibStrings.GREEN | awsDashSdkLib.awsDashSdkLibStrings.BLUE | java.lang.String
  type BurninSubtitleShadowColor = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.BLACK | awsDashSdkLib.awsDashSdkLibStrings.WHITE | java.lang.String
  type BurninSubtitleTeletextSpacing = awsDashSdkLib.awsDashSdkLibStrings.FIXED_GRID | awsDashSdkLib.awsDashSdkLibStrings.PROPORTIONAL | java.lang.String
  type CaptionDestinationType = awsDashSdkLib.awsDashSdkLibStrings.BURN_IN | awsDashSdkLib.awsDashSdkLibStrings.DVB_SUB | awsDashSdkLib.awsDashSdkLibStrings.EMBEDDED | awsDashSdkLib.awsDashSdkLibStrings.SCC | awsDashSdkLib.awsDashSdkLibStrings.SRT | awsDashSdkLib.awsDashSdkLibStrings.TELETEXT | awsDashSdkLib.awsDashSdkLibStrings.TTML | awsDashSdkLib.awsDashSdkLibStrings.WEBVTT | java.lang.String
  type CaptionSourceType = awsDashSdkLib.awsDashSdkLibStrings.ANCILLARY | awsDashSdkLib.awsDashSdkLibStrings.DVB_SUB | awsDashSdkLib.awsDashSdkLibStrings.EMBEDDED | awsDashSdkLib.awsDashSdkLibStrings.SCC | awsDashSdkLib.awsDashSdkLibStrings.TTML | awsDashSdkLib.awsDashSdkLibStrings.STL | awsDashSdkLib.awsDashSdkLibStrings.SRT | awsDashSdkLib.awsDashSdkLibStrings.TELETEXT | awsDashSdkLib.awsDashSdkLibStrings.NULL_SOURCE | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CmafClientCache = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type CmafCodecSpecification = awsDashSdkLib.awsDashSdkLibStrings.RFC_6381 | awsDashSdkLib.awsDashSdkLibStrings.RFC_4281 | java.lang.String
  type CmafEncryptionType = awsDashSdkLib.awsDashSdkLibStrings.SAMPLE_AES | java.lang.String
  type CmafInitializationVectorInManifest = awsDashSdkLib.awsDashSdkLibStrings.INCLUDE | awsDashSdkLib.awsDashSdkLibStrings.EXCLUDE | java.lang.String
  type CmafKeyProviderType = awsDashSdkLib.awsDashSdkLibStrings.STATIC_KEY | java.lang.String
  type CmafManifestCompression = awsDashSdkLib.awsDashSdkLibStrings.GZIP | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type CmafManifestDurationFormat = awsDashSdkLib.awsDashSdkLibStrings.FLOATING_POINT | awsDashSdkLib.awsDashSdkLibStrings.INTEGER | java.lang.String
  type CmafSegmentControl = awsDashSdkLib.awsDashSdkLibStrings.SINGLE_FILE | awsDashSdkLib.awsDashSdkLibStrings.SEGMENTED_FILES | java.lang.String
  type CmafStreamInfResolution = awsDashSdkLib.awsDashSdkLibStrings.INCLUDE | awsDashSdkLib.awsDashSdkLibStrings.EXCLUDE | java.lang.String
  type CmafWriteDASHManifest = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type CmafWriteHLSManifest = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type ColorMetadata = awsDashSdkLib.awsDashSdkLibStrings.IGNORE | awsDashSdkLib.awsDashSdkLibStrings.INSERT | java.lang.String
  type ColorSpace = awsDashSdkLib.awsDashSdkLibStrings.FOLLOW | awsDashSdkLib.awsDashSdkLibStrings.REC_601 | awsDashSdkLib.awsDashSdkLibStrings.REC_709 | awsDashSdkLib.awsDashSdkLibStrings.HDR10 | awsDashSdkLib.awsDashSdkLibStrings.HLG_2020 | java.lang.String
  type ColorSpaceConversion = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.FORCE_601 | awsDashSdkLib.awsDashSdkLibStrings.FORCE_709 | awsDashSdkLib.awsDashSdkLibStrings.FORCE_HDR10 | awsDashSdkLib.awsDashSdkLibStrings.FORCE_HLG_2020 | java.lang.String
  type ColorSpaceUsage = awsDashSdkLib.awsDashSdkLibStrings.FORCE | awsDashSdkLib.awsDashSdkLibStrings.FALLBACK | java.lang.String
  type Commitment = awsDashSdkLib.awsDashSdkLibStrings.ONE_YEAR | java.lang.String
  type ContainerType = awsDashSdkLib.awsDashSdkLibStrings.F4V | awsDashSdkLib.awsDashSdkLibStrings.ISMV | awsDashSdkLib.awsDashSdkLibStrings.M2TS | awsDashSdkLib.awsDashSdkLibStrings.M3U8 | awsDashSdkLib.awsDashSdkLibStrings.CMFC | awsDashSdkLib.awsDashSdkLibStrings.MOV | awsDashSdkLib.awsDashSdkLibStrings.MP4 | awsDashSdkLib.awsDashSdkLibStrings.MPD | awsDashSdkLib.awsDashSdkLibStrings.MXF | awsDashSdkLib.awsDashSdkLibStrings.RAW | java.lang.String
  type DashIsoHbbtvCompliance = awsDashSdkLib.awsDashSdkLibStrings.HBBTV_1_5 | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type DashIsoSegmentControl = awsDashSdkLib.awsDashSdkLibStrings.SINGLE_FILE | awsDashSdkLib.awsDashSdkLibStrings.SEGMENTED_FILES | java.lang.String
  type DashIsoWriteSegmentTimelineInRepresentation = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type DeinterlaceAlgorithm = awsDashSdkLib.awsDashSdkLibStrings.INTERPOLATE | awsDashSdkLib.awsDashSdkLibStrings.INTERPOLATE_TICKER | awsDashSdkLib.awsDashSdkLibStrings.BLEND | awsDashSdkLib.awsDashSdkLibStrings.BLEND_TICKER | java.lang.String
  type DeinterlacerControl = awsDashSdkLib.awsDashSdkLibStrings.FORCE_ALL_FRAMES | awsDashSdkLib.awsDashSdkLibStrings.NORMAL | java.lang.String
  type DeinterlacerMode = awsDashSdkLib.awsDashSdkLibStrings.DEINTERLACE | awsDashSdkLib.awsDashSdkLibStrings.INVERSE_TELECINE | awsDashSdkLib.awsDashSdkLibStrings.ADAPTIVE | java.lang.String
  type DescribeEndpointsMode = awsDashSdkLib.awsDashSdkLibStrings.DEFAULT | awsDashSdkLib.awsDashSdkLibStrings.GET_ONLY | java.lang.String
  type DropFrameTimecode = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type DvbSubtitleAlignment = awsDashSdkLib.awsDashSdkLibStrings.CENTERED | awsDashSdkLib.awsDashSdkLibStrings.LEFT | java.lang.String
  type DvbSubtitleBackgroundColor = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.BLACK | awsDashSdkLib.awsDashSdkLibStrings.WHITE | java.lang.String
  type DvbSubtitleFontColor = awsDashSdkLib.awsDashSdkLibStrings.WHITE | awsDashSdkLib.awsDashSdkLibStrings.BLACK | awsDashSdkLib.awsDashSdkLibStrings.YELLOW | awsDashSdkLib.awsDashSdkLibStrings.RED | awsDashSdkLib.awsDashSdkLibStrings.GREEN | awsDashSdkLib.awsDashSdkLibStrings.BLUE | java.lang.String
  type DvbSubtitleOutlineColor = awsDashSdkLib.awsDashSdkLibStrings.BLACK | awsDashSdkLib.awsDashSdkLibStrings.WHITE | awsDashSdkLib.awsDashSdkLibStrings.YELLOW | awsDashSdkLib.awsDashSdkLibStrings.RED | awsDashSdkLib.awsDashSdkLibStrings.GREEN | awsDashSdkLib.awsDashSdkLibStrings.BLUE | java.lang.String
  type DvbSubtitleShadowColor = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.BLACK | awsDashSdkLib.awsDashSdkLibStrings.WHITE | java.lang.String
  type DvbSubtitleTeletextSpacing = awsDashSdkLib.awsDashSdkLibStrings.FIXED_GRID | awsDashSdkLib.awsDashSdkLibStrings.PROPORTIONAL | java.lang.String
  type Eac3AttenuationControl = awsDashSdkLib.awsDashSdkLibStrings.ATTENUATE_3_DB | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type Eac3BitstreamMode = awsDashSdkLib.awsDashSdkLibStrings.COMPLETE_MAIN | awsDashSdkLib.awsDashSdkLibStrings.COMMENTARY | awsDashSdkLib.awsDashSdkLibStrings.EMERGENCY | awsDashSdkLib.awsDashSdkLibStrings.HEARING_IMPAIRED | awsDashSdkLib.awsDashSdkLibStrings.VISUALLY_IMPAIRED | java.lang.String
  type Eac3CodingMode = awsDashSdkLib.awsDashSdkLibStrings.CODING_MODE_1_0 | awsDashSdkLib.awsDashSdkLibStrings.CODING_MODE_2_0 | awsDashSdkLib.awsDashSdkLibStrings.CODING_MODE_3_2 | java.lang.String
  type Eac3DcFilter = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type Eac3DynamicRangeCompressionLine = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.FILM_STANDARD | awsDashSdkLib.awsDashSdkLibStrings.FILM_LIGHT | awsDashSdkLib.awsDashSdkLibStrings.MUSIC_STANDARD | awsDashSdkLib.awsDashSdkLibStrings.MUSIC_LIGHT | awsDashSdkLib.awsDashSdkLibStrings.SPEECH | java.lang.String
  type Eac3DynamicRangeCompressionRf = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.FILM_STANDARD | awsDashSdkLib.awsDashSdkLibStrings.FILM_LIGHT | awsDashSdkLib.awsDashSdkLibStrings.MUSIC_STANDARD | awsDashSdkLib.awsDashSdkLibStrings.MUSIC_LIGHT | awsDashSdkLib.awsDashSdkLibStrings.SPEECH | java.lang.String
  type Eac3LfeControl = awsDashSdkLib.awsDashSdkLibStrings.LFE | awsDashSdkLib.awsDashSdkLibStrings.NO_LFE | java.lang.String
  type Eac3LfeFilter = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type Eac3MetadataControl = awsDashSdkLib.awsDashSdkLibStrings.FOLLOW_INPUT | awsDashSdkLib.awsDashSdkLibStrings.USE_CONFIGURED | java.lang.String
  type Eac3PassthroughControl = awsDashSdkLib.awsDashSdkLibStrings.WHEN_POSSIBLE | awsDashSdkLib.awsDashSdkLibStrings.NO_PASSTHROUGH | java.lang.String
  type Eac3PhaseControl = awsDashSdkLib.awsDashSdkLibStrings.SHIFT_90_DEGREES | awsDashSdkLib.awsDashSdkLibStrings.NO_SHIFT | java.lang.String
  type Eac3StereoDownmix = awsDashSdkLib.awsDashSdkLibStrings.NOT_INDICATED | awsDashSdkLib.awsDashSdkLibStrings.LO_RO | awsDashSdkLib.awsDashSdkLibStrings.LT_RT | awsDashSdkLib.awsDashSdkLibStrings.DPL2 | java.lang.String
  type Eac3SurroundExMode = awsDashSdkLib.awsDashSdkLibStrings.NOT_INDICATED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type Eac3SurroundMode = awsDashSdkLib.awsDashSdkLibStrings.NOT_INDICATED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type EmbeddedConvert608To708 = awsDashSdkLib.awsDashSdkLibStrings.UPCONVERT | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type F4vMoovPlacement = awsDashSdkLib.awsDashSdkLibStrings.PROGRESSIVE_DOWNLOAD | awsDashSdkLib.awsDashSdkLibStrings.NORMAL | java.lang.String
  type FileSourceConvert608To708 = awsDashSdkLib.awsDashSdkLibStrings.UPCONVERT | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type H264AdaptiveQuantization = awsDashSdkLib.awsDashSdkLibStrings.OFF | awsDashSdkLib.awsDashSdkLibStrings.LOW | awsDashSdkLib.awsDashSdkLibStrings.MEDIUM | awsDashSdkLib.awsDashSdkLibStrings.HIGH | awsDashSdkLib.awsDashSdkLibStrings.HIGHER | awsDashSdkLib.awsDashSdkLibStrings.MAX | java.lang.String
  type H264CodecLevel = awsDashSdkLib.awsDashSdkLibStrings.AUTO | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_1 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_1_1 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_1_2 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_1_3 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_2 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_2_1 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_2_2 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_3 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_3_1 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_3_2 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_4 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_4_1 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_4_2 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_5 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_5_1 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_5_2 | java.lang.String
  type H264CodecProfile = awsDashSdkLib.awsDashSdkLibStrings.BASELINE | awsDashSdkLib.awsDashSdkLibStrings.HIGH | awsDashSdkLib.awsDashSdkLibStrings.HIGH_10BIT | awsDashSdkLib.awsDashSdkLibStrings.HIGH_422 | awsDashSdkLib.awsDashSdkLibStrings.HIGH_422_10BIT | awsDashSdkLib.awsDashSdkLibStrings.MAIN | java.lang.String
  type H264DynamicSubGop = awsDashSdkLib.awsDashSdkLibStrings.ADAPTIVE | awsDashSdkLib.awsDashSdkLibStrings.STATIC | java.lang.String
  type H264EntropyEncoding = awsDashSdkLib.awsDashSdkLibStrings.CABAC | awsDashSdkLib.awsDashSdkLibStrings.CAVLC | java.lang.String
  type H264FieldEncoding = awsDashSdkLib.awsDashSdkLibStrings.PAFF | awsDashSdkLib.awsDashSdkLibStrings.FORCE_FIELD | java.lang.String
  type H264FlickerAdaptiveQuantization = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H264FramerateControl = awsDashSdkLib.awsDashSdkLibStrings.INITIALIZE_FROM_SOURCE | awsDashSdkLib.awsDashSdkLibStrings.SPECIFIED | java.lang.String
  type H264FramerateConversionAlgorithm = awsDashSdkLib.awsDashSdkLibStrings.DUPLICATE_DROP | awsDashSdkLib.awsDashSdkLibStrings.INTERPOLATE | java.lang.String
  type H264GopBReference = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H264GopSizeUnits = awsDashSdkLib.awsDashSdkLibStrings.FRAMES | awsDashSdkLib.awsDashSdkLibStrings.SECONDS | java.lang.String
  type H264InterlaceMode = awsDashSdkLib.awsDashSdkLibStrings.PROGRESSIVE | awsDashSdkLib.awsDashSdkLibStrings.TOP_FIELD | awsDashSdkLib.awsDashSdkLibStrings.BOTTOM_FIELD | awsDashSdkLib.awsDashSdkLibStrings.FOLLOW_TOP_FIELD | awsDashSdkLib.awsDashSdkLibStrings.FOLLOW_BOTTOM_FIELD | java.lang.String
  type H264ParControl = awsDashSdkLib.awsDashSdkLibStrings.INITIALIZE_FROM_SOURCE | awsDashSdkLib.awsDashSdkLibStrings.SPECIFIED | java.lang.String
  type H264QualityTuningLevel = awsDashSdkLib.awsDashSdkLibStrings.SINGLE_PASS | awsDashSdkLib.awsDashSdkLibStrings.SINGLE_PASS_HQ | awsDashSdkLib.awsDashSdkLibStrings.MULTI_PASS_HQ | java.lang.String
  type H264RateControlMode = awsDashSdkLib.awsDashSdkLibStrings.VBR | awsDashSdkLib.awsDashSdkLibStrings.CBR | awsDashSdkLib.awsDashSdkLibStrings.QVBR | java.lang.String
  type H264RepeatPps = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H264SceneChangeDetect = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H264SlowPal = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H264SpatialAdaptiveQuantization = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H264Syntax = awsDashSdkLib.awsDashSdkLibStrings.DEFAULT | awsDashSdkLib.awsDashSdkLibStrings.RP2027 | java.lang.String
  type H264Telecine = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.SOFT | awsDashSdkLib.awsDashSdkLibStrings.HARD | java.lang.String
  type H264TemporalAdaptiveQuantization = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H264UnregisteredSeiTimecode = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H265AdaptiveQuantization = awsDashSdkLib.awsDashSdkLibStrings.OFF | awsDashSdkLib.awsDashSdkLibStrings.LOW | awsDashSdkLib.awsDashSdkLibStrings.MEDIUM | awsDashSdkLib.awsDashSdkLibStrings.HIGH | awsDashSdkLib.awsDashSdkLibStrings.HIGHER | awsDashSdkLib.awsDashSdkLibStrings.MAX | java.lang.String
  type H265AlternateTransferFunctionSei = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H265CodecLevel = awsDashSdkLib.awsDashSdkLibStrings.AUTO | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_1 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_2 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_2_1 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_3 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_3_1 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_4 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_4_1 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_5 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_5_1 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_5_2 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_6 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_6_1 | awsDashSdkLib.awsDashSdkLibStrings.LEVEL_6_2 | java.lang.String
  type H265CodecProfile = awsDashSdkLib.awsDashSdkLibStrings.MAIN_MAIN | awsDashSdkLib.awsDashSdkLibStrings.MAIN_HIGH | awsDashSdkLib.awsDashSdkLibStrings.MAIN10_MAIN | awsDashSdkLib.awsDashSdkLibStrings.MAIN10_HIGH | awsDashSdkLib.awsDashSdkLibStrings.MAIN_422_8BIT_MAIN | awsDashSdkLib.awsDashSdkLibStrings.MAIN_422_8BIT_HIGH | awsDashSdkLib.awsDashSdkLibStrings.MAIN_422_10BIT_MAIN | awsDashSdkLib.awsDashSdkLibStrings.MAIN_422_10BIT_HIGH | java.lang.String
  type H265DynamicSubGop = awsDashSdkLib.awsDashSdkLibStrings.ADAPTIVE | awsDashSdkLib.awsDashSdkLibStrings.STATIC | java.lang.String
  type H265FlickerAdaptiveQuantization = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H265FramerateControl = awsDashSdkLib.awsDashSdkLibStrings.INITIALIZE_FROM_SOURCE | awsDashSdkLib.awsDashSdkLibStrings.SPECIFIED | java.lang.String
  type H265FramerateConversionAlgorithm = awsDashSdkLib.awsDashSdkLibStrings.DUPLICATE_DROP | awsDashSdkLib.awsDashSdkLibStrings.INTERPOLATE | java.lang.String
  type H265GopBReference = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H265GopSizeUnits = awsDashSdkLib.awsDashSdkLibStrings.FRAMES | awsDashSdkLib.awsDashSdkLibStrings.SECONDS | java.lang.String
  type H265InterlaceMode = awsDashSdkLib.awsDashSdkLibStrings.PROGRESSIVE | awsDashSdkLib.awsDashSdkLibStrings.TOP_FIELD | awsDashSdkLib.awsDashSdkLibStrings.BOTTOM_FIELD | awsDashSdkLib.awsDashSdkLibStrings.FOLLOW_TOP_FIELD | awsDashSdkLib.awsDashSdkLibStrings.FOLLOW_BOTTOM_FIELD | java.lang.String
  type H265ParControl = awsDashSdkLib.awsDashSdkLibStrings.INITIALIZE_FROM_SOURCE | awsDashSdkLib.awsDashSdkLibStrings.SPECIFIED | java.lang.String
  type H265QualityTuningLevel = awsDashSdkLib.awsDashSdkLibStrings.SINGLE_PASS | awsDashSdkLib.awsDashSdkLibStrings.SINGLE_PASS_HQ | awsDashSdkLib.awsDashSdkLibStrings.MULTI_PASS_HQ | java.lang.String
  type H265RateControlMode = awsDashSdkLib.awsDashSdkLibStrings.VBR | awsDashSdkLib.awsDashSdkLibStrings.CBR | awsDashSdkLib.awsDashSdkLibStrings.QVBR | java.lang.String
  type H265SampleAdaptiveOffsetFilterMode = awsDashSdkLib.awsDashSdkLibStrings.DEFAULT | awsDashSdkLib.awsDashSdkLibStrings.ADAPTIVE | awsDashSdkLib.awsDashSdkLibStrings.OFF | java.lang.String
  type H265SceneChangeDetect = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H265SlowPal = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H265SpatialAdaptiveQuantization = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H265Telecine = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.SOFT | awsDashSdkLib.awsDashSdkLibStrings.HARD | java.lang.String
  type H265TemporalAdaptiveQuantization = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H265TemporalIds = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H265Tiles = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H265UnregisteredSeiTimecode = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type H265WriteMp4PackagingType = awsDashSdkLib.awsDashSdkLibStrings.HVC1 | awsDashSdkLib.awsDashSdkLibStrings.HEV1 | java.lang.String
  type HlsAdMarkers = awsDashSdkLib.awsDashSdkLibStrings.ELEMENTAL | awsDashSdkLib.awsDashSdkLibStrings.ELEMENTAL_SCTE35 | java.lang.String
  type HlsAudioTrackType = awsDashSdkLib.awsDashSdkLibStrings.ALTERNATE_AUDIO_AUTO_SELECT_DEFAULT | awsDashSdkLib.awsDashSdkLibStrings.ALTERNATE_AUDIO_AUTO_SELECT | awsDashSdkLib.awsDashSdkLibStrings.ALTERNATE_AUDIO_NOT_AUTO_SELECT | awsDashSdkLib.awsDashSdkLibStrings.AUDIO_ONLY_VARIANT_STREAM | java.lang.String
  type HlsCaptionLanguageSetting = awsDashSdkLib.awsDashSdkLibStrings.INSERT | awsDashSdkLib.awsDashSdkLibStrings.OMIT | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type HlsClientCache = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type HlsCodecSpecification = awsDashSdkLib.awsDashSdkLibStrings.RFC_6381 | awsDashSdkLib.awsDashSdkLibStrings.RFC_4281 | java.lang.String
  type HlsDirectoryStructure = awsDashSdkLib.awsDashSdkLibStrings.SINGLE_DIRECTORY | awsDashSdkLib.awsDashSdkLibStrings.SUBDIRECTORY_PER_STREAM | java.lang.String
  type HlsEncryptionType = awsDashSdkLib.awsDashSdkLibStrings.AES128 | awsDashSdkLib.awsDashSdkLibStrings.SAMPLE_AES | java.lang.String
  type HlsIFrameOnlyManifest = awsDashSdkLib.awsDashSdkLibStrings.INCLUDE | awsDashSdkLib.awsDashSdkLibStrings.EXCLUDE | java.lang.String
  type HlsInitializationVectorInManifest = awsDashSdkLib.awsDashSdkLibStrings.INCLUDE | awsDashSdkLib.awsDashSdkLibStrings.EXCLUDE | java.lang.String
  type HlsKeyProviderType = awsDashSdkLib.awsDashSdkLibStrings.SPEKE | awsDashSdkLib.awsDashSdkLibStrings.STATIC_KEY | java.lang.String
  type HlsManifestCompression = awsDashSdkLib.awsDashSdkLibStrings.GZIP | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type HlsManifestDurationFormat = awsDashSdkLib.awsDashSdkLibStrings.FLOATING_POINT | awsDashSdkLib.awsDashSdkLibStrings.INTEGER | java.lang.String
  type HlsOutputSelection = awsDashSdkLib.awsDashSdkLibStrings.MANIFESTS_AND_SEGMENTS | awsDashSdkLib.awsDashSdkLibStrings.SEGMENTS_ONLY | java.lang.String
  type HlsProgramDateTime = awsDashSdkLib.awsDashSdkLibStrings.INCLUDE | awsDashSdkLib.awsDashSdkLibStrings.EXCLUDE | java.lang.String
  type HlsSegmentControl = awsDashSdkLib.awsDashSdkLibStrings.SINGLE_FILE | awsDashSdkLib.awsDashSdkLibStrings.SEGMENTED_FILES | java.lang.String
  type HlsStreamInfResolution = awsDashSdkLib.awsDashSdkLibStrings.INCLUDE | awsDashSdkLib.awsDashSdkLibStrings.EXCLUDE | java.lang.String
  type HlsTimedMetadataId3Frame = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.PRIV | awsDashSdkLib.awsDashSdkLibStrings.TDRL | java.lang.String
  type InputDeblockFilter = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type InputDenoiseFilter = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type InputFilterEnable = awsDashSdkLib.awsDashSdkLibStrings.AUTO | awsDashSdkLib.awsDashSdkLibStrings.DISABLE | awsDashSdkLib.awsDashSdkLibStrings.FORCE | java.lang.String
  type InputPsiControl = awsDashSdkLib.awsDashSdkLibStrings.IGNORE_PSI | awsDashSdkLib.awsDashSdkLibStrings.USE_PSI | java.lang.String
  type InputTimecodeSource = awsDashSdkLib.awsDashSdkLibStrings.EMBEDDED | awsDashSdkLib.awsDashSdkLibStrings.ZEROBASED | awsDashSdkLib.awsDashSdkLibStrings.SPECIFIEDSTART | java.lang.String
  type JobStatus = awsDashSdkLib.awsDashSdkLibStrings.SUBMITTED | awsDashSdkLib.awsDashSdkLibStrings.PROGRESSING | awsDashSdkLib.awsDashSdkLibStrings.COMPLETE | awsDashSdkLib.awsDashSdkLibStrings.CANCELED | awsDashSdkLib.awsDashSdkLibStrings.ERROR | java.lang.String
  type JobTemplateListBy = awsDashSdkLib.awsDashSdkLibStrings.NAME | awsDashSdkLib.awsDashSdkLibStrings.CREATION_DATE | awsDashSdkLib.awsDashSdkLibStrings.SYSTEM | java.lang.String
  type LanguageCode = /* LimitUnionLength: was union type with length 192 */js.Any
  type M2tsAudioBufferModel = awsDashSdkLib.awsDashSdkLibStrings.DVB | awsDashSdkLib.awsDashSdkLibStrings.ATSC | java.lang.String
  type M2tsBufferModel = awsDashSdkLib.awsDashSdkLibStrings.MULTIPLEX | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type M2tsEbpAudioInterval = awsDashSdkLib.awsDashSdkLibStrings.VIDEO_AND_FIXED_INTERVALS | awsDashSdkLib.awsDashSdkLibStrings.VIDEO_INTERVAL | java.lang.String
  type M2tsEbpPlacement = awsDashSdkLib.awsDashSdkLibStrings.VIDEO_AND_AUDIO_PIDS | awsDashSdkLib.awsDashSdkLibStrings.VIDEO_PID | java.lang.String
  type M2tsEsRateInPes = awsDashSdkLib.awsDashSdkLibStrings.INCLUDE | awsDashSdkLib.awsDashSdkLibStrings.EXCLUDE | java.lang.String
  type M2tsNielsenId3 = awsDashSdkLib.awsDashSdkLibStrings.INSERT | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type M2tsPcrControl = awsDashSdkLib.awsDashSdkLibStrings.PCR_EVERY_PES_PACKET | awsDashSdkLib.awsDashSdkLibStrings.CONFIGURED_PCR_PERIOD | java.lang.String
  type M2tsRateMode = awsDashSdkLib.awsDashSdkLibStrings.VBR | awsDashSdkLib.awsDashSdkLibStrings.CBR | java.lang.String
  type M2tsScte35Source = awsDashSdkLib.awsDashSdkLibStrings.PASSTHROUGH | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type M2tsSegmentationMarkers = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.RAI_SEGSTART | awsDashSdkLib.awsDashSdkLibStrings.RAI_ADAPT | awsDashSdkLib.awsDashSdkLibStrings.PSI_SEGSTART | awsDashSdkLib.awsDashSdkLibStrings.EBP | awsDashSdkLib.awsDashSdkLibStrings.EBP_LEGACY | java.lang.String
  type M2tsSegmentationStyle = awsDashSdkLib.awsDashSdkLibStrings.MAINTAIN_CADENCE | awsDashSdkLib.awsDashSdkLibStrings.RESET_CADENCE | java.lang.String
  type M3u8NielsenId3 = awsDashSdkLib.awsDashSdkLibStrings.INSERT | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type M3u8PcrControl = awsDashSdkLib.awsDashSdkLibStrings.PCR_EVERY_PES_PACKET | awsDashSdkLib.awsDashSdkLibStrings.CONFIGURED_PCR_PERIOD | java.lang.String
  type M3u8Scte35Source = awsDashSdkLib.awsDashSdkLibStrings.PASSTHROUGH | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type MovClapAtom = awsDashSdkLib.awsDashSdkLibStrings.INCLUDE | awsDashSdkLib.awsDashSdkLibStrings.EXCLUDE | java.lang.String
  type MovCslgAtom = awsDashSdkLib.awsDashSdkLibStrings.INCLUDE | awsDashSdkLib.awsDashSdkLibStrings.EXCLUDE | java.lang.String
  type MovMpeg2FourCCControl = awsDashSdkLib.awsDashSdkLibStrings.XDCAM | awsDashSdkLib.awsDashSdkLibStrings.MPEG | java.lang.String
  type MovPaddingControl = awsDashSdkLib.awsDashSdkLibStrings.OMNEON | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type MovReference = awsDashSdkLib.awsDashSdkLibStrings.SELF_CONTAINED | awsDashSdkLib.awsDashSdkLibStrings.EXTERNAL | java.lang.String
  type Mp4CslgAtom = awsDashSdkLib.awsDashSdkLibStrings.INCLUDE | awsDashSdkLib.awsDashSdkLibStrings.EXCLUDE | java.lang.String
  type Mp4FreeSpaceBox = awsDashSdkLib.awsDashSdkLibStrings.INCLUDE | awsDashSdkLib.awsDashSdkLibStrings.EXCLUDE | java.lang.String
  type Mp4MoovPlacement = awsDashSdkLib.awsDashSdkLibStrings.PROGRESSIVE_DOWNLOAD | awsDashSdkLib.awsDashSdkLibStrings.NORMAL | java.lang.String
  type Mpeg2AdaptiveQuantization = awsDashSdkLib.awsDashSdkLibStrings.OFF | awsDashSdkLib.awsDashSdkLibStrings.LOW | awsDashSdkLib.awsDashSdkLibStrings.MEDIUM | awsDashSdkLib.awsDashSdkLibStrings.HIGH | java.lang.String
  type Mpeg2CodecLevel = awsDashSdkLib.awsDashSdkLibStrings.AUTO | awsDashSdkLib.awsDashSdkLibStrings.LOW | awsDashSdkLib.awsDashSdkLibStrings.MAIN | awsDashSdkLib.awsDashSdkLibStrings.HIGH1440 | awsDashSdkLib.awsDashSdkLibStrings.HIGH | java.lang.String
  type Mpeg2CodecProfile = awsDashSdkLib.awsDashSdkLibStrings.MAIN | awsDashSdkLib.awsDashSdkLibStrings.PROFILE_422 | java.lang.String
  type Mpeg2DynamicSubGop = awsDashSdkLib.awsDashSdkLibStrings.ADAPTIVE | awsDashSdkLib.awsDashSdkLibStrings.STATIC | java.lang.String
  type Mpeg2FramerateControl = awsDashSdkLib.awsDashSdkLibStrings.INITIALIZE_FROM_SOURCE | awsDashSdkLib.awsDashSdkLibStrings.SPECIFIED | java.lang.String
  type Mpeg2FramerateConversionAlgorithm = awsDashSdkLib.awsDashSdkLibStrings.DUPLICATE_DROP | awsDashSdkLib.awsDashSdkLibStrings.INTERPOLATE | java.lang.String
  type Mpeg2GopSizeUnits = awsDashSdkLib.awsDashSdkLibStrings.FRAMES | awsDashSdkLib.awsDashSdkLibStrings.SECONDS | java.lang.String
  type Mpeg2InterlaceMode = awsDashSdkLib.awsDashSdkLibStrings.PROGRESSIVE | awsDashSdkLib.awsDashSdkLibStrings.TOP_FIELD | awsDashSdkLib.awsDashSdkLibStrings.BOTTOM_FIELD | awsDashSdkLib.awsDashSdkLibStrings.FOLLOW_TOP_FIELD | awsDashSdkLib.awsDashSdkLibStrings.FOLLOW_BOTTOM_FIELD | java.lang.String
  type Mpeg2IntraDcPrecision = awsDashSdkLib.awsDashSdkLibStrings.AUTO | awsDashSdkLib.awsDashSdkLibStrings.INTRA_DC_PRECISION_8 | awsDashSdkLib.awsDashSdkLibStrings.INTRA_DC_PRECISION_9 | awsDashSdkLib.awsDashSdkLibStrings.INTRA_DC_PRECISION_10 | awsDashSdkLib.awsDashSdkLibStrings.INTRA_DC_PRECISION_11 | java.lang.String
  type Mpeg2ParControl = awsDashSdkLib.awsDashSdkLibStrings.INITIALIZE_FROM_SOURCE | awsDashSdkLib.awsDashSdkLibStrings.SPECIFIED | java.lang.String
  type Mpeg2QualityTuningLevel = awsDashSdkLib.awsDashSdkLibStrings.SINGLE_PASS | awsDashSdkLib.awsDashSdkLibStrings.MULTI_PASS | java.lang.String
  type Mpeg2RateControlMode = awsDashSdkLib.awsDashSdkLibStrings.VBR | awsDashSdkLib.awsDashSdkLibStrings.CBR | java.lang.String
  type Mpeg2SceneChangeDetect = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type Mpeg2SlowPal = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type Mpeg2SpatialAdaptiveQuantization = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type Mpeg2Syntax = awsDashSdkLib.awsDashSdkLibStrings.DEFAULT | awsDashSdkLib.awsDashSdkLibStrings.D_10 | java.lang.String
  type Mpeg2Telecine = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.SOFT | awsDashSdkLib.awsDashSdkLibStrings.HARD | java.lang.String
  type Mpeg2TemporalAdaptiveQuantization = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type MsSmoothAudioDeduplication = awsDashSdkLib.awsDashSdkLibStrings.COMBINE_DUPLICATE_STREAMS | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type MsSmoothManifestEncoding = awsDashSdkLib.awsDashSdkLibStrings.UTF8 | awsDashSdkLib.awsDashSdkLibStrings.UTF16 | java.lang.String
  type NoiseReducerFilter = awsDashSdkLib.awsDashSdkLibStrings.BILATERAL | awsDashSdkLib.awsDashSdkLibStrings.MEAN | awsDashSdkLib.awsDashSdkLibStrings.GAUSSIAN | awsDashSdkLib.awsDashSdkLibStrings.LANCZOS | awsDashSdkLib.awsDashSdkLibStrings.SHARPEN | awsDashSdkLib.awsDashSdkLibStrings.CONSERVE | awsDashSdkLib.awsDashSdkLibStrings.SPATIAL | java.lang.String
  type Order = awsDashSdkLib.awsDashSdkLibStrings.ASCENDING | awsDashSdkLib.awsDashSdkLibStrings.DESCENDING | java.lang.String
  type OutputGroupType = awsDashSdkLib.awsDashSdkLibStrings.HLS_GROUP_SETTINGS | awsDashSdkLib.awsDashSdkLibStrings.DASH_ISO_GROUP_SETTINGS | awsDashSdkLib.awsDashSdkLibStrings.FILE_GROUP_SETTINGS | awsDashSdkLib.awsDashSdkLibStrings.MS_SMOOTH_GROUP_SETTINGS | awsDashSdkLib.awsDashSdkLibStrings.CMAF_GROUP_SETTINGS | java.lang.String
  type OutputSdt = awsDashSdkLib.awsDashSdkLibStrings.SDT_FOLLOW | awsDashSdkLib.awsDashSdkLibStrings.SDT_FOLLOW_IF_PRESENT | awsDashSdkLib.awsDashSdkLibStrings.SDT_MANUAL | awsDashSdkLib.awsDashSdkLibStrings.SDT_NONE | java.lang.String
  type PresetListBy = awsDashSdkLib.awsDashSdkLibStrings.NAME | awsDashSdkLib.awsDashSdkLibStrings.CREATION_DATE | awsDashSdkLib.awsDashSdkLibStrings.SYSTEM | java.lang.String
  type PricingPlan = awsDashSdkLib.awsDashSdkLibStrings.ON_DEMAND | awsDashSdkLib.awsDashSdkLibStrings.RESERVED | java.lang.String
  type ProresCodecProfile = awsDashSdkLib.awsDashSdkLibStrings.APPLE_PRORES_422 | awsDashSdkLib.awsDashSdkLibStrings.APPLE_PRORES_422_HQ | awsDashSdkLib.awsDashSdkLibStrings.APPLE_PRORES_422_LT | awsDashSdkLib.awsDashSdkLibStrings.APPLE_PRORES_422_PROXY | java.lang.String
  type ProresFramerateControl = awsDashSdkLib.awsDashSdkLibStrings.INITIALIZE_FROM_SOURCE | awsDashSdkLib.awsDashSdkLibStrings.SPECIFIED | java.lang.String
  type ProresFramerateConversionAlgorithm = awsDashSdkLib.awsDashSdkLibStrings.DUPLICATE_DROP | awsDashSdkLib.awsDashSdkLibStrings.INTERPOLATE | java.lang.String
  type ProresInterlaceMode = awsDashSdkLib.awsDashSdkLibStrings.PROGRESSIVE | awsDashSdkLib.awsDashSdkLibStrings.TOP_FIELD | awsDashSdkLib.awsDashSdkLibStrings.BOTTOM_FIELD | awsDashSdkLib.awsDashSdkLibStrings.FOLLOW_TOP_FIELD | awsDashSdkLib.awsDashSdkLibStrings.FOLLOW_BOTTOM_FIELD | java.lang.String
  type ProresParControl = awsDashSdkLib.awsDashSdkLibStrings.INITIALIZE_FROM_SOURCE | awsDashSdkLib.awsDashSdkLibStrings.SPECIFIED | java.lang.String
  type ProresSlowPal = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.ENABLED | java.lang.String
  type ProresTelecine = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.HARD | java.lang.String
  type QueueListBy = awsDashSdkLib.awsDashSdkLibStrings.NAME | awsDashSdkLib.awsDashSdkLibStrings.CREATION_DATE | java.lang.String
  type QueueStatus = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.PAUSED | java.lang.String
  type RenewalType = awsDashSdkLib.awsDashSdkLibStrings.AUTO_RENEW | awsDashSdkLib.awsDashSdkLibStrings.EXPIRE | java.lang.String
  type ReservationPlanStatus = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.EXPIRED | java.lang.String
  type RespondToAfd = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.RESPOND | awsDashSdkLib.awsDashSdkLibStrings.PASSTHROUGH | java.lang.String
  type ScalingBehavior = awsDashSdkLib.awsDashSdkLibStrings.DEFAULT | awsDashSdkLib.awsDashSdkLibStrings.STRETCH_TO_OUTPUT | java.lang.String
  type SccDestinationFramerate = awsDashSdkLib.awsDashSdkLibStrings.FRAMERATE_23_97 | awsDashSdkLib.awsDashSdkLibStrings.FRAMERATE_24 | awsDashSdkLib.awsDashSdkLibStrings.FRAMERATE_29_97_DROPFRAME | awsDashSdkLib.awsDashSdkLibStrings.FRAMERATE_29_97_NON_DROPFRAME | java.lang.String
  type TimecodeBurninPosition = awsDashSdkLib.awsDashSdkLibStrings.TOP_CENTER | awsDashSdkLib.awsDashSdkLibStrings.TOP_LEFT | awsDashSdkLib.awsDashSdkLibStrings.TOP_RIGHT | awsDashSdkLib.awsDashSdkLibStrings.MIDDLE_LEFT | awsDashSdkLib.awsDashSdkLibStrings.MIDDLE_CENTER | awsDashSdkLib.awsDashSdkLibStrings.MIDDLE_RIGHT | awsDashSdkLib.awsDashSdkLibStrings.BOTTOM_LEFT | awsDashSdkLib.awsDashSdkLibStrings.BOTTOM_CENTER | awsDashSdkLib.awsDashSdkLibStrings.BOTTOM_RIGHT | java.lang.String
  type TimecodeSource = awsDashSdkLib.awsDashSdkLibStrings.EMBEDDED | awsDashSdkLib.awsDashSdkLibStrings.ZEROBASED | awsDashSdkLib.awsDashSdkLibStrings.SPECIFIEDSTART | java.lang.String
  type TimedMetadata = awsDashSdkLib.awsDashSdkLibStrings.PASSTHROUGH | awsDashSdkLib.awsDashSdkLibStrings.NONE | java.lang.String
  type TtmlStylePassthrough = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type Type = awsDashSdkLib.awsDashSdkLibStrings.SYSTEM | awsDashSdkLib.awsDashSdkLibStrings.CUSTOM | java.lang.String
  type VideoCodec = awsDashSdkLib.awsDashSdkLibStrings.FRAME_CAPTURE | awsDashSdkLib.awsDashSdkLibStrings.H_264 | awsDashSdkLib.awsDashSdkLibStrings.H_265 | awsDashSdkLib.awsDashSdkLibStrings.MPEG2 | awsDashSdkLib.awsDashSdkLibStrings.PRORES | java.lang.String
  type VideoTimecodeInsertion = awsDashSdkLib.awsDashSdkLibStrings.DISABLED | awsDashSdkLib.awsDashSdkLibStrings.PIC_TIMING_SEI | java.lang.String
  type WavFormat = awsDashSdkLib.awsDashSdkLibStrings.RIFF | awsDashSdkLib.awsDashSdkLibStrings.RF64 | java.lang.String
  type __doubleMin0 = scala.Double
  type __doubleMin0Max2147483647 = scala.Double
  type __doubleMinNegative59Max0 = scala.Double
  type __doubleMinNegative60Max3 = scala.Double
  type __doubleMinNegative60MaxNegative1 = scala.Double
  type __integer = scala.Double
  type __integerMin0Max10 = scala.Double
  type __integerMin0Max100 = scala.Double
  type __integerMin0Max1000 = scala.Double
  type __integerMin0Max10000 = scala.Double
  type __integerMin0Max1152000000 = scala.Double
  type __integerMin0Max128 = scala.Double
  type __integerMin0Max1466400000 = scala.Double
  type __integerMin0Max15 = scala.Double
  type __integerMin0Max16 = scala.Double
  type __integerMin0Max2147483647 = scala.Double
  type __integerMin0Max255 = scala.Double
  type __integerMin0Max3 = scala.Double
  type __integerMin0Max30 = scala.Double
  type __integerMin0Max3600 = scala.Double
  type __integerMin0Max47185920 = scala.Double
  type __integerMin0Max500 = scala.Double
  type __integerMin0Max50000 = scala.Double
  type __integerMin0Max65535 = scala.Double
  type __integerMin0Max7 = scala.Double
  type __integerMin0Max8 = scala.Double
  type __integerMin0Max9 = scala.Double
  type __integerMin0Max96 = scala.Double
  type __integerMin0Max99 = scala.Double
  type __integerMin1000Max1152000000 = scala.Double
  type __integerMin1000Max1466400000 = scala.Double
  type __integerMin1000Max288000000 = scala.Double
  type __integerMin1000Max30000 = scala.Double
  type __integerMin1000Max300000000 = scala.Double
  type __integerMin10Max48 = scala.Double
  type __integerMin16Max24 = scala.Double
  type __integerMin1Max1 = scala.Double
  type __integerMin1Max10 = scala.Double
  type __integerMin1Max100 = scala.Double
  type __integerMin1Max10000000 = scala.Double
  type __integerMin1Max1001 = scala.Double
  type __integerMin1Max16 = scala.Double
  type __integerMin1Max2 = scala.Double
  type __integerMin1Max20 = scala.Double
  type __integerMin1Max2147483647 = scala.Double
  type __integerMin1Max31 = scala.Double
  type __integerMin1Max32 = scala.Double
  type __integerMin1Max4 = scala.Double
  type __integerMin1Max6 = scala.Double
  type __integerMin1Max8 = scala.Double
  type __integerMin24Max60000 = scala.Double
  type __integerMin25Max10000 = scala.Double
  type __integerMin25Max2000 = scala.Double
  type __integerMin2Max2147483647 = scala.Double
  type __integerMin32000Max384000 = scala.Double
  type __integerMin32000Max48000 = scala.Double
  type __integerMin32Max2160 = scala.Double
  type __integerMin32Max4096 = scala.Double
  type __integerMin32Max8182 = scala.Double
  type __integerMin48000Max48000 = scala.Double
  type __integerMin6000Max1024000 = scala.Double
  type __integerMin64000Max640000 = scala.Double
  type __integerMin8000Max192000 = scala.Double
  type __integerMin8000Max96000 = scala.Double
  type __integerMin96Max600 = scala.Double
  type __integerMinNegative1000Max1000 = scala.Double
  type __integerMinNegative180Max180 = scala.Double
  type __integerMinNegative2147483648Max2147483647 = scala.Double
  type __integerMinNegative2Max3 = scala.Double
  type __integerMinNegative5Max5 = scala.Double
  type __integerMinNegative60Max6 = scala.Double
  type __integerMinNegative70Max0 = scala.Double
  type __listOfAudioDescription = js.Array[AudioDescription]
  type __listOfCaptionDescription = js.Array[CaptionDescription]
  type __listOfCaptionDescriptionPreset = js.Array[CaptionDescriptionPreset]
  type __listOfEndpoint = js.Array[Endpoint]
  type __listOfHlsAdMarkers = js.Array[HlsAdMarkers]
  type __listOfHlsCaptionLanguageMapping = js.Array[HlsCaptionLanguageMapping]
  type __listOfId3Insertion = js.Array[Id3Insertion]
  type __listOfInput = js.Array[Input]
  type __listOfInputClipping = js.Array[InputClipping]
  type __listOfInputTemplate = js.Array[InputTemplate]
  type __listOfInsertableImage = js.Array[InsertableImage]
  type __listOfJob = js.Array[Job]
  type __listOfJobTemplate = js.Array[JobTemplate]
  type __listOfOutput = js.Array[Output]
  type __listOfOutputChannelMapping = js.Array[OutputChannelMapping]
  type __listOfOutputDetail = js.Array[OutputDetail]
  type __listOfOutputGroup = js.Array[OutputGroup]
  type __listOfOutputGroupDetail = js.Array[OutputGroupDetail]
  type __listOfPreset = js.Array[Preset]
  type __listOfQueue = js.Array[Queue]
  type __listOf__integerMin1Max2147483647 = js.Array[__integerMin1Max2147483647]
  type __listOf__integerMin32Max8182 = js.Array[__integerMin32Max8182]
  type __listOf__integerMinNegative60Max6 = js.Array[__integerMinNegative60Max6]
  type __listOf__string = js.Array[__string]
  type __listOf__stringMin1 = js.Array[__stringMin1]
  type __listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = js.Array[__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12]
  type __string = java.lang.String
  type __stringMin0 = java.lang.String
  type __stringMin1 = java.lang.String
  type __stringMin14PatternS3BmpBMPPngPNG = java.lang.String
  type __stringMin14PatternS3BmpBMPPngPNGTgaTGA = java.lang.String
  type __stringMin14PatternS3SccSCCTtmlTTMLDfxpDFXPStlSTLSrtSRTSmiSMI = java.lang.String
  type __stringMin1Max256 = java.lang.String
  type __stringMin32Max32Pattern09aFAF32 = java.lang.String
  type __stringMin3Max3Pattern1809aFAF09aEAE = java.lang.String
  type __stringMin3Max3PatternAZaZ3 = java.lang.String
  type __stringPattern = java.lang.String
  type __stringPattern010920405090509092 = java.lang.String
  type __stringPattern01D20305D205D = java.lang.String
  type __stringPattern0940191020191209301 = java.lang.String
  type __stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = java.lang.String
  type __stringPatternAZaZ0902 = java.lang.String
  type __stringPatternAZaZ0932 = java.lang.String
  type __stringPatternDD = java.lang.String
  type __stringPatternHttps = java.lang.String
  type __stringPatternIdentityAZaZ26AZaZ09163 = java.lang.String
  type __stringPatternS3 = java.lang.String
  type __stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MM = java.lang.String
  type __stringPatternS3MM2VVMMPPEEGGAAVVIIMMPP4FFLLVVMMPPTTMMPPGGMM4VVTTRRPPFF4VVMM2TTSSTTSS264HH264MMKKVVMMOOVVMMTTSSMM2TTWWMMVVAASSFFVVOOBB3GGPP3GGPPPPMMXXFFDDIIVVXXXXVVIIDDRRAAWWDDVVGGXXFFMM1VV3GG2VVMMFFMM3UU8LLCCHHGGXXFFMMPPEEGG2MMXXFFMMPPEEGG2MMXXFFHHDDWWAAVVYY4MMAAAACCAAIIFFFFMMPP2AACC3EECC3DDTTSSEE = java.lang.String
  type __stringPatternWS = java.lang.String
  type __timestampUnix = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-08-29` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}
