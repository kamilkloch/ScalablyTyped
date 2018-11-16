package typings
package graphqlDashExtensionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ParsedQuery[TContext] extends js.Object {
  var context: TContext
  var extensions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var operationName: js.UndefOr[java.lang.String] = js.undefined
  var parsedQuery: js.UndefOr[graphqlLib.languageAstMod.DocumentNode] = js.undefined
  var persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined
  var persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined
  var queryString: js.UndefOr[java.lang.String] = js.undefined
  var request: apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request
  var variables: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
}
