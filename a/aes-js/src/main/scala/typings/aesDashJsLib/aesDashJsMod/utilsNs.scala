package typings
package aesDashJsLib.aesDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aes-js", "utils")
@js.native
object utilsNs extends js.Object {
  @JSName("hex")
  @js.native
  object hexNs extends js.Object {
    /**
      * Convert an array-like object to a hexadecimal string.
      * @param data The input data.
      */
    def fromBytes(data: aesDashJsLib.aesDashJsMod.ByteSource): java.lang.String = js.native
    /**
      * Convert a hexadecimal string to a Uint8Array.
      * @param data The input string.
      */
    def toBytes(data: java.lang.String): stdLib.Uint8Array = js.native
  }
  
  @JSName("utf8")
  @js.native
  object utf8Ns extends js.Object {
    /**
      * Convert an array-like object containing UTF8 data to a string.
      * @param data The input data.
      */
    def fromBytes(data: aesDashJsLib.aesDashJsMod.ByteSource): java.lang.String = js.native
    /**
      * Convert a UTF8 encoded string to a Uint8Array.
      * @param data The input string.
      */
    def toBytes(data: java.lang.String): stdLib.Uint8Array = js.native
  }
  
}

