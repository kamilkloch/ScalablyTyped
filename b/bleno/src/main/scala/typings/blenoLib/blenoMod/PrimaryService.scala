package typings
package blenoLib.blenoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryService extends js.Object {
  var characteristics: js.Array[Characteristic]
  var uuid: java.lang.String
}

object PrimaryService {
  @scala.inline
  def apply(
    characteristics: js.Array[Characteristic],
    toString: () => java.lang.String,
    uuid: java.lang.String
  ): PrimaryService = {
    val __obj = js.Dynamic.literal(characteristics = characteristics, toString = js.Any.fromFunction0(toString), uuid = uuid)
  
    __obj.asInstanceOf[PrimaryService]
  }
}

