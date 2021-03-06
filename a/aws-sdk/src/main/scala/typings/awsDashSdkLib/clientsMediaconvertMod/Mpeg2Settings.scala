package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mpeg2Settings extends js.Object {
  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[Mpeg2AdaptiveQuantization] = js.undefined
  /**
    * Average bitrate in bits/second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[__integerMin1000Max288000000] = js.undefined
  /**
    * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
    */
  var CodecLevel: js.UndefOr[Mpeg2CodecLevel] = js.undefined
  /**
    * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
    */
  var CodecProfile: js.UndefOr[Mpeg2CodecProfile] = js.undefined
  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  var DynamicSubGop: js.UndefOr[Mpeg2DynamicSubGop] = js.undefined
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[Mpeg2FramerateControl] = js.undefined
  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  var FramerateConversionAlgorithm: js.UndefOr[Mpeg2FramerateConversionAlgorithm] = js.undefined
  /**
    * Frame rate denominator.
    */
  var FramerateDenominator: js.UndefOr[__integerMin1Max1001] = js.undefined
  /**
    * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
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
  /**
    * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[Mpeg2GopSizeUnits] = js.undefined
  /**
    * Percentage of the buffer that should initially be filled (HRD buffer model).
    */
  var HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined
  /**
    * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
    */
  var HrdBufferSize: js.UndefOr[__integerMin0Max47185920] = js.undefined
  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type.
    - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  var InterlaceMode: js.UndefOr[Mpeg2InterlaceMode] = js.undefined
  /**
    * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If you choose the value auto, the service will automatically select the precision based on the per-frame compression ratio.
    */
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
  /**
    * Using the API, enable ParFollowSource if you want the service to use the pixel aspect ratio from the input. Using the console, do this by choosing Follow source for Pixel aspect ratio.
    */
  var ParControl: js.UndefOr[Mpeg2ParControl] = js.undefined
  /**
    * Pixel Aspect Ratio denominator.
    */
  var ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Pixel Aspect Ratio numerator.
    */
  var ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined
  /**
    * Use Quality tuning level (Mpeg2QualityTuningLevel) to specifiy whether to use single-pass or multipass video encoding.
    */
  var QualityTuningLevel: js.UndefOr[Mpeg2QualityTuningLevel] = js.undefined
  /**
    * Use Rate control mode (Mpeg2RateControlMode) to specifiy whether the bitrate is variable (vbr) or constant (cbr).
    */
  var RateControlMode: js.UndefOr[Mpeg2RateControlMode] = js.undefined
  /**
    * Scene change detection (inserts I-frames on scene changes).
    */
  var SceneChangeDetect: js.UndefOr[Mpeg2SceneChangeDetect] = js.undefined
  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  var SlowPal: js.UndefOr[Mpeg2SlowPal] = js.undefined
  /**
    * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
    */
  var Softness: js.UndefOr[__integerMin0Max128] = js.undefined
  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  var SpatialAdaptiveQuantization: js.UndefOr[Mpeg2SpatialAdaptiveQuantization] = js.undefined
  /**
    * Produces a Type D-10 compatible bitstream (SMPTE 356M-2001).
    */
  var Syntax: js.UndefOr[Mpeg2Syntax] = js.undefined
  /**
    * Only use Telecine (Mpeg2Telecine) when you set Framerate (Framerate) to 29.970. Set Telecine (Mpeg2Telecine) to Hard (hard) to produce a 29.97i output from a 23.976 input. Set it to Soft (soft) to produce 23.976 output and leave converstion to the player.
    */
  var Telecine: js.UndefOr[Mpeg2Telecine] = js.undefined
  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  var TemporalAdaptiveQuantization: js.UndefOr[Mpeg2TemporalAdaptiveQuantization] = js.undefined
}

object Mpeg2Settings {
  @scala.inline
  def apply(
    AdaptiveQuantization: Mpeg2AdaptiveQuantization = null,
    Bitrate: js.UndefOr[__integerMin1000Max288000000] = js.undefined,
    CodecLevel: Mpeg2CodecLevel = null,
    CodecProfile: Mpeg2CodecProfile = null,
    DynamicSubGop: Mpeg2DynamicSubGop = null,
    FramerateControl: Mpeg2FramerateControl = null,
    FramerateConversionAlgorithm: Mpeg2FramerateConversionAlgorithm = null,
    FramerateDenominator: js.UndefOr[__integerMin1Max1001] = js.undefined,
    FramerateNumerator: js.UndefOr[__integerMin24Max60000] = js.undefined,
    GopClosedCadence: js.UndefOr[__integerMin0Max2147483647] = js.undefined,
    GopSize: js.UndefOr[__doubleMin0] = js.undefined,
    GopSizeUnits: Mpeg2GopSizeUnits = null,
    HrdBufferInitialFillPercentage: js.UndefOr[__integerMin0Max100] = js.undefined,
    HrdBufferSize: js.UndefOr[__integerMin0Max47185920] = js.undefined,
    InterlaceMode: Mpeg2InterlaceMode = null,
    IntraDcPrecision: Mpeg2IntraDcPrecision = null,
    MaxBitrate: js.UndefOr[__integerMin1000Max300000000] = js.undefined,
    MinIInterval: js.UndefOr[__integerMin0Max30] = js.undefined,
    NumberBFramesBetweenReferenceFrames: js.UndefOr[__integerMin0Max7] = js.undefined,
    ParControl: Mpeg2ParControl = null,
    ParDenominator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    ParNumerator: js.UndefOr[__integerMin1Max2147483647] = js.undefined,
    QualityTuningLevel: Mpeg2QualityTuningLevel = null,
    RateControlMode: Mpeg2RateControlMode = null,
    SceneChangeDetect: Mpeg2SceneChangeDetect = null,
    SlowPal: Mpeg2SlowPal = null,
    Softness: js.UndefOr[__integerMin0Max128] = js.undefined,
    SpatialAdaptiveQuantization: Mpeg2SpatialAdaptiveQuantization = null,
    Syntax: Mpeg2Syntax = null,
    Telecine: Mpeg2Telecine = null,
    TemporalAdaptiveQuantization: Mpeg2TemporalAdaptiveQuantization = null
  ): Mpeg2Settings = {
    val __obj = js.Dynamic.literal()
    if (AdaptiveQuantization != null) __obj.updateDynamic("AdaptiveQuantization")(AdaptiveQuantization.asInstanceOf[js.Any])
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate)
    if (CodecLevel != null) __obj.updateDynamic("CodecLevel")(CodecLevel.asInstanceOf[js.Any])
    if (CodecProfile != null) __obj.updateDynamic("CodecProfile")(CodecProfile.asInstanceOf[js.Any])
    if (DynamicSubGop != null) __obj.updateDynamic("DynamicSubGop")(DynamicSubGop.asInstanceOf[js.Any])
    if (FramerateControl != null) __obj.updateDynamic("FramerateControl")(FramerateControl.asInstanceOf[js.Any])
    if (FramerateConversionAlgorithm != null) __obj.updateDynamic("FramerateConversionAlgorithm")(FramerateConversionAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(FramerateDenominator)) __obj.updateDynamic("FramerateDenominator")(FramerateDenominator)
    if (!js.isUndefined(FramerateNumerator)) __obj.updateDynamic("FramerateNumerator")(FramerateNumerator)
    if (!js.isUndefined(GopClosedCadence)) __obj.updateDynamic("GopClosedCadence")(GopClosedCadence)
    if (!js.isUndefined(GopSize)) __obj.updateDynamic("GopSize")(GopSize)
    if (GopSizeUnits != null) __obj.updateDynamic("GopSizeUnits")(GopSizeUnits.asInstanceOf[js.Any])
    if (!js.isUndefined(HrdBufferInitialFillPercentage)) __obj.updateDynamic("HrdBufferInitialFillPercentage")(HrdBufferInitialFillPercentage)
    if (!js.isUndefined(HrdBufferSize)) __obj.updateDynamic("HrdBufferSize")(HrdBufferSize)
    if (InterlaceMode != null) __obj.updateDynamic("InterlaceMode")(InterlaceMode.asInstanceOf[js.Any])
    if (IntraDcPrecision != null) __obj.updateDynamic("IntraDcPrecision")(IntraDcPrecision.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxBitrate)) __obj.updateDynamic("MaxBitrate")(MaxBitrate)
    if (!js.isUndefined(MinIInterval)) __obj.updateDynamic("MinIInterval")(MinIInterval)
    if (!js.isUndefined(NumberBFramesBetweenReferenceFrames)) __obj.updateDynamic("NumberBFramesBetweenReferenceFrames")(NumberBFramesBetweenReferenceFrames)
    if (ParControl != null) __obj.updateDynamic("ParControl")(ParControl.asInstanceOf[js.Any])
    if (!js.isUndefined(ParDenominator)) __obj.updateDynamic("ParDenominator")(ParDenominator)
    if (!js.isUndefined(ParNumerator)) __obj.updateDynamic("ParNumerator")(ParNumerator)
    if (QualityTuningLevel != null) __obj.updateDynamic("QualityTuningLevel")(QualityTuningLevel.asInstanceOf[js.Any])
    if (RateControlMode != null) __obj.updateDynamic("RateControlMode")(RateControlMode.asInstanceOf[js.Any])
    if (SceneChangeDetect != null) __obj.updateDynamic("SceneChangeDetect")(SceneChangeDetect.asInstanceOf[js.Any])
    if (SlowPal != null) __obj.updateDynamic("SlowPal")(SlowPal.asInstanceOf[js.Any])
    if (!js.isUndefined(Softness)) __obj.updateDynamic("Softness")(Softness)
    if (SpatialAdaptiveQuantization != null) __obj.updateDynamic("SpatialAdaptiveQuantization")(SpatialAdaptiveQuantization.asInstanceOf[js.Any])
    if (Syntax != null) __obj.updateDynamic("Syntax")(Syntax.asInstanceOf[js.Any])
    if (Telecine != null) __obj.updateDynamic("Telecine")(Telecine.asInstanceOf[js.Any])
    if (TemporalAdaptiveQuantization != null) __obj.updateDynamic("TemporalAdaptiveQuantization")(TemporalAdaptiveQuantization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mpeg2Settings]
  }
}

