package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCloudFrontOriginAccessIdentityResult extends js.Object {
  /**
    * The origin access identity's information.
    */
  var CloudFrontOriginAccessIdentity: js.UndefOr[CloudFrontOriginAccessIdentity] = js.undefined
  /**
    * The current version of the origin access identity created.
    */
  var ETag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The fully qualified URI of the new origin access identity just created. For example: https://cloudfront.amazonaws.com/2010-11-01/origin-access-identity/cloudfront/E74FTE3AJFJ256A.
    */
  var Location: js.UndefOr[java.lang.String] = js.undefined
}

object CreateCloudFrontOriginAccessIdentityResult {
  @scala.inline
  def apply(
    CloudFrontOriginAccessIdentity: CloudFrontOriginAccessIdentity = null,
    ETag: java.lang.String = null,
    Location: java.lang.String = null
  ): CreateCloudFrontOriginAccessIdentityResult = {
    val __obj = js.Dynamic.literal()
    if (CloudFrontOriginAccessIdentity != null) __obj.updateDynamic("CloudFrontOriginAccessIdentity")(CloudFrontOriginAccessIdentity)
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    __obj.asInstanceOf[CreateCloudFrontOriginAccessIdentityResult]
  }
}

