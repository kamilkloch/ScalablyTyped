package typings
package awsDashSdkLib.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3SignedObject extends js.Object {
  /**
    * Name of the S3 bucket.
    */
  var bucketName: js.UndefOr[BucketName] = js.undefined
  /**
    * Key name that uniquely identifies a signed code image in your bucket.
    */
  var key: js.UndefOr[key] = js.undefined
}

object S3SignedObject {
  @scala.inline
  def apply(bucketName: BucketName = null, key: key = null): S3SignedObject = {
    val __obj = js.Dynamic.literal()
    if (bucketName != null) __obj.updateDynamic("bucketName")(bucketName)
    if (key != null) __obj.updateDynamic("key")(key)
    __obj.asInstanceOf[S3SignedObject]
  }
}

