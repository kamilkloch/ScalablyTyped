package typings
package awsDashSdkLib.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCertificatesResponse extends js.Object {
  /**
    * A list of ACM certificates.
    */
  var CertificateSummaryList: js.UndefOr[CertificateSummaryList] = js.undefined
  /**
    * When the list is truncated, this value is present and contains the value to use for the NextToken parameter in a subsequent pagination request.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListCertificatesResponse {
  @scala.inline
  def apply(CertificateSummaryList: CertificateSummaryList = null, NextToken: NextToken = null): ListCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    if (CertificateSummaryList != null) __obj.updateDynamic("CertificateSummaryList")(CertificateSummaryList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCertificatesResponse]
  }
}

