package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IQueryStats extends js.Object {
  /** QueryStats perClientName */
  var perClientName: js.UndefOr[ScalablyTyped.runtime.StringDictionary[IClientNameStats] | scala.Null] = js.undefined
  /** QueryStats perType */
  var perType: js.UndefOr[js.Array[ITypeStat] | scala.Null] = js.undefined
  /** QueryStats perTypeStat */
  var perTypeStat: js.UndefOr[ScalablyTyped.runtime.StringDictionary[ITypeStat] | scala.Null] = js.undefined
}
