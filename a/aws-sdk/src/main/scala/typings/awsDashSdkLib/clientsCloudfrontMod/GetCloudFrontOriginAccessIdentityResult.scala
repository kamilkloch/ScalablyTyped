package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCloudFrontOriginAccessIdentityResult extends js.Object {
  /**
    * The origin access identity's information.
    */
  var CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined
  /**
    * The current version of the origin access identity's information. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[java.lang.String] = js.undefined
}

object GetCloudFrontOriginAccessIdentityResult {
  @scala.inline
  def apply(
    CloudFrontOriginAccessIdentity: CloudFrontOriginAccessIdentity = null,
    ETag: java.lang.String = null
  ): GetCloudFrontOriginAccessIdentityResult = {
    val __obj = js.Dynamic.literal()
    if (CloudFrontOriginAccessIdentity != null) __obj.updateDynamic("CloudFrontOriginAccessIdentity")(CloudFrontOriginAccessIdentity)
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    __obj.asInstanceOf[GetCloudFrontOriginAccessIdentityResult]
  }
}

