package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains initialization settings for the MediaCapture object which are passed to the MediaCapture.InitializeAsync method. */
@JSGlobal("Windows.Media.Capture.MediaCaptureInitializationSettings")
@js.native
class MediaCaptureInitializationSettings () extends js.Object {
  /** Gets the DeviceInformation.Id of the microphone. */
  var audioDeviceId: java.lang.String = js.native
  /** Gets or sets a value that specifies the audio processing mode. */
  var audioProcessing: winrtDashUwpLib.WindowsNs.MediaNs.AudioProcessing = js.native
  /** Gets or sets the audio source for the capture operation. */
  var audioSource: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.IMediaSource = js.native
  /** Gets or set the media category. */
  var mediaCategory: MediaCategory = js.native
  /** Gets or sets the stream that is used for photo capture. */
  var photoCaptureSource: PhotoCaptureSource = js.native
  /** Gets or sets the media description for photo capture. */
  var photoMediaDescription: MediaCaptureVideoProfileMediaDescription = js.native
  /** Gets or sets the media description for preview video. */
  var previewMediaDescription: MediaCaptureVideoProfileMediaDescription = js.native
  /** Gets or sets the media description for video recording. */
  var recordMediaDescription: MediaCaptureVideoProfileMediaDescription = js.native
  /** Gets or sets the streaming mode. */
  var streamingCaptureMode: StreamingCaptureMode = js.native
  /** Gets the DeviceInformation.Id of the video camera. */
  var videoDeviceId: java.lang.String = js.native
  /** Gets or sets the video profile which provides hints to the driver to allow it to optimize for different capture scenarios. */
  var videoProfile: MediaCaptureVideoProfile = js.native
  /** Gets or sets the video source for the capture operation. */
  var videoSource: winrtDashUwpLib.WindowsNs.MediaNs.CoreNs.IMediaSource = js.native
}
