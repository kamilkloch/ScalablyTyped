package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketMetricsConfigurationRequest extends js.Object {
  /**
    * The name of the bucket containing the metrics configuration to retrieve.
    */
  var Bucket: BucketName
  /**
    * The ID used to identify the metrics configuration.
    */
  var Id: MetricsId
}

object GetBucketMetricsConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, Id: MetricsId): GetBucketMetricsConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Id = Id)
  
    __obj.asInstanceOf[GetBucketMetricsConfigurationRequest]
  }
}

