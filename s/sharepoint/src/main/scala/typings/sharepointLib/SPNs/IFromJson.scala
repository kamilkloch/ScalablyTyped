package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
trait IFromJson extends js.Object {
  def customFromJson(initValue: js.Any): scala.Boolean
  def fromJson(initValue: js.Any): scala.Unit
}

object IFromJson {
  @scala.inline
  def apply(customFromJson: js.Any => scala.Boolean, fromJson: js.Any => scala.Unit): IFromJson = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), fromJson = js.Any.fromFunction1(fromJson))
  
    __obj.asInstanceOf[IFromJson]
  }
}

