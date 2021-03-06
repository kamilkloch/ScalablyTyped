package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMultipartUploadsOutput extends js.Object {
  /**
    * An opaque string that represents where to continue pagination of the results. You use the marker in a new List Multipart Uploads request to obtain more uploads in the list. If there are no more uploads, this value is null.
    */
  var Marker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of in-progress multipart uploads.
    */
  var UploadsList: js.UndefOr[UploadsList] = js.undefined
}

object ListMultipartUploadsOutput {
  @scala.inline
  def apply(Marker: java.lang.String = null, UploadsList: UploadsList = null): ListMultipartUploadsOutput = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (UploadsList != null) __obj.updateDynamic("UploadsList")(UploadsList)
    __obj.asInstanceOf[ListMultipartUploadsOutput]
  }
}

