package typings
package mimosLib.mimosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MimosOptions extends js.Object {
  /**
       * an object hash that is merged into the built in mime information specified here {@link https://github.com/jshttp/mime-db}. Each key value pair represents a single mime object. Each override value should follow this schema:
       *  * the key is the lower-cased correct mime-type. (Ex. "application/javascript").
       *  * the value should an object @see MimosOptionsValue
       */
  var `override`: ScalablyTyped.runtime.StringDictionary[MimosOptionsValue]
}
