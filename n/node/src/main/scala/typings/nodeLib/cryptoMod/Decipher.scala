package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "Decipher")
@js.native
class Decipher protected ()
  extends nodeLib.streamMod.Duplex {
  def `final`(): nodeLib.Buffer = js.native
  def `final`(output_encoding: java.lang.String): java.lang.String = js.native
  def setAutoPadding(): this.type = js.native
  def setAutoPadding(auto_padding: scala.Boolean): this.type = js.native
  def update(
    data: java.lang.String,
    input_encoding: js.UndefOr[scala.Nothing],
    output_encoding: Utf8AsciiBinaryEncoding
  ): java.lang.String = js.native
  def update(data: java.lang.String, input_encoding: HexBase64BinaryEncoding): nodeLib.Buffer = js.native
  def update(
    data: java.lang.String,
    input_encoding: HexBase64BinaryEncoding,
    output_encoding: Utf8AsciiBinaryEncoding
  ): java.lang.String = js.native
  def update(data: Binary): nodeLib.Buffer = js.native
  def update(data: Binary, input_encoding: js.UndefOr[scala.Nothing], output_encoding: Utf8AsciiBinaryEncoding): java.lang.String = js.native
}

