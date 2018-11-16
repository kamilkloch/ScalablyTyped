package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * Describes the options used when generating new api keys
   */

trait SecuredApiOptions extends js.Object {
  /**
       * Filter the query with numeric, facet or/and tag filters
       * default: ""
       * https://github.com/algolia/algoliasearch-client-js#filters-1
       */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Restricts the key to a list of index names allowed for the secured API key
       * https://github.com/algolia/algoliasearch-client-js#index-restriction
       */
  var restrictIndices: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Allows you to restrict a single user to performing a maximum of N API calls per hour
       * https://github.com/algolia/algoliasearch-client-js#user-rate-limiting
       */
  var userToken: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Defines the expiration date of the API key
       * https://github.com/algolia/algoliasearch-client-js#valid-until
       */
  var validUntil: js.UndefOr[scala.Double] = js.undefined
}
