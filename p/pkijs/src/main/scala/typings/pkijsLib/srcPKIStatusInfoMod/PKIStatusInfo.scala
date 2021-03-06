package typings
package pkijsLib.srcPKIStatusInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PKIStatusInfo extends js.Object {
  var failInfo: js.UndefOr[asn1jsLib.asn1jsMod.BitString] = js.undefined
  var status: scala.Double
  var statusStrings: js.UndefOr[asn1jsLib.asn1jsMod.Utf8String] = js.undefined
  def fromSchema(schema: js.Any): scala.Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PKIStatusInfo {
  @scala.inline
  def apply(
    fromSchema: js.Any => scala.Unit,
    status: scala.Double,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    failInfo: asn1jsLib.asn1jsMod.BitString = null,
    statusStrings: asn1jsLib.asn1jsMod.Utf8String = null
  ): PKIStatusInfo = {
    val __obj = js.Dynamic.literal(fromSchema = js.Any.fromFunction1(fromSchema), status = status, toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    if (failInfo != null) __obj.updateDynamic("failInfo")(failInfo)
    if (statusStrings != null) __obj.updateDynamic("statusStrings")(statusStrings)
    __obj.asInstanceOf[PKIStatusInfo]
  }
}

