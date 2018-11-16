package typings
package feedmeLib.feedmeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("feedme", JSImport.Namespace)
@js.native
class namespaced () extends FeedMe {
  /**
       * Creates a new instance of the FeedMe parser.
       *
       * @param buffer Can be true if you want the parser to buffer the entire feed document as a JSON object, letting you use the FeedMe#done() method.
       */
  def this(buffer: scala.Boolean) = this()
}
