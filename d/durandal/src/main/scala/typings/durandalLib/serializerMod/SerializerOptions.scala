package typings
package durandalLib.serializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SerializerOptions extends js.Object {
  /**
           * The default replacer function used during serialization. By default properties starting with '_' or '$' are removed from the serialized object.
           * @param {string} key The object key to check.
           * @param {object} value The object value to check.
           * @returns {object} The value to serialize.
          */
  var replacer: js.UndefOr[js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]] = js.undefined
  /**
           * The amount of space to use for indentation when writing out JSON.
           * @default undefined
          */
  var space: js.Any
}
