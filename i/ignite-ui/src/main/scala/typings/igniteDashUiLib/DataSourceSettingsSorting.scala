package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSourceSettingsSorting
  extends /**
	 * Option for DataSourceSettingsSorting
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * If the sorting type is local and applyToAllData is true, sorting will be performed on the whole data source that's present locally, otherwise only on the current dataView. If sorting type is remote, this setting doesn't have any effect.
  	 *
  	 */
  var applyToAllData: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Specifies if sorting will be case sensitive or not. Works only for local sorting
  	 *
  	 */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Custom comparison sorting function. Accepts the following arguments: fields, schema, booleand value whether sorting is ascending , convert function(please check option for customConvertFunc) and returns a value 0 indicating that values are equal, 1 indicating that val1 > val2 and -1 indicating that val1 < val2
  	 *
  	 */
  var compareFunc: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Custom data value conversion function(called from sorting function). Accepts a value of the data cell and column key and should return the converted value
  	 *
  	 */
  var customConvertFunc: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Custom sorting function that can point to either a string or a function object. When the function is called, the following arguments are passed: data array, fields (array of field definitions) , direction ("asc" or "desc"). The function should return a sorted data array
  	 *
  	 */
  var customFunc: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Sorting direction
  	 *
  	 *
  	 * Valid values:
  	 * "none"
  	 * "asc"
  	 * "desc"
  	 */
  var defaultDirection: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * When defaultDirection is different than "none", and defaultFields is specified, data will be initially sorted accordingly, directly after dataBind()
  	 *
  	 */
  var defaultFields: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Takes precedence over experssions, an "SQL-like" encoded expressions string  : see sort(). Example col2 > 100 ORDER BY asc
  	 *
  	 */
  var exprString: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A list of sorting expressions , consisting of the following keys (and their respective values): fieldName, direction and compareFunc (optional)
  	 *
  	 */
  var expressions: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * URL param value for ascending type of sorting. Default is null and uses OData conventions
  	 *
  	 */
  var sortUrlAscValueKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * URL param value for descending type of sorting. Default is null and uses OData conventions
  	 *
  	 */
  var sortUrlDescValueKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * URL param name which specifies how sorting expressions will be encoded in the URL. Default is null and uses OData conventions
  	 *
  	 */
  var sortUrlKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies whether sorting will be applied locally or remotely (via a remote request)
  	 *
  	 *
  	 * Valid values:
  	 * "remote"
  	 * "local"
  	 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}
