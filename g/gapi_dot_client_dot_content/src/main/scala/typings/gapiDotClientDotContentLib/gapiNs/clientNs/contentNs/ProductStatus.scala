package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductStatus extends js.Object {
  /** Date on which the item has been created, in ISO 8601 format. */
  var creationDate: js.UndefOr[java.lang.String] = js.undefined
  /** A list of data quality issues associated with the product. */
  var dataQualityIssues: js.UndefOr[js.Array[ProductStatusDataQualityIssue]] = js.undefined
  /** The intended destinations for the product. */
  var destinationStatuses: js.UndefOr[js.Array[ProductStatusDestinationStatus]] = js.undefined
  /** Date on which the item expires in Google Shopping, in ISO 8601 format. */
  var googleExpirationDate: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#productStatus". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Date on which the item has been last updated, in ISO 8601 format. */
  var lastUpdateDate: js.UndefOr[java.lang.String] = js.undefined
  /** The link to the product. */
  var link: js.UndefOr[java.lang.String] = js.undefined
  /** Product data after applying all the join inputs. */
  var product: js.UndefOr[Product] = js.undefined
  /** The id of the product for which status is reported. */
  var productId: js.UndefOr[java.lang.String] = js.undefined
  /** The title of the product. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ProductStatus {
  @scala.inline
  def apply(
    creationDate: java.lang.String = null,
    dataQualityIssues: js.Array[ProductStatusDataQualityIssue] = null,
    destinationStatuses: js.Array[ProductStatusDestinationStatus] = null,
    googleExpirationDate: java.lang.String = null,
    kind: java.lang.String = null,
    lastUpdateDate: java.lang.String = null,
    link: java.lang.String = null,
    product: Product = null,
    productId: java.lang.String = null,
    title: java.lang.String = null
  ): ProductStatus = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (dataQualityIssues != null) __obj.updateDynamic("dataQualityIssues")(dataQualityIssues)
    if (destinationStatuses != null) __obj.updateDynamic("destinationStatuses")(destinationStatuses)
    if (googleExpirationDate != null) __obj.updateDynamic("googleExpirationDate")(googleExpirationDate)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lastUpdateDate != null) __obj.updateDynamic("lastUpdateDate")(lastUpdateDate)
    if (link != null) __obj.updateDynamic("link")(link)
    if (product != null) __obj.updateDynamic("product")(product)
    if (productId != null) __obj.updateDynamic("productId")(productId)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ProductStatus]
  }
}

