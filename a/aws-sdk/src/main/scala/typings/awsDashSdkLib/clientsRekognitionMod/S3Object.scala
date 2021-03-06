package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Object extends js.Object {
  /**
    * Name of the S3 bucket.
    */
  var Bucket: js.UndefOr[S3Bucket] = js.undefined
  /**
    * S3 object key name.
    */
  var Name: js.UndefOr[S3ObjectName] = js.undefined
  /**
    * If the bucket is versioning enabled, you can specify the object version. 
    */
  var Version: js.UndefOr[S3ObjectVersion] = js.undefined
}

object S3Object {
  @scala.inline
  def apply(Bucket: S3Bucket = null, Name: S3ObjectName = null, Version: S3ObjectVersion = null): S3Object = {
    val __obj = js.Dynamic.literal()
    if (Bucket != null) __obj.updateDynamic("Bucket")(Bucket)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[S3Object]
  }
}

