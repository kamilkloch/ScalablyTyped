package typings
package behavior3Lib.b3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * RepeatUntilSuccess is a decorator that repeats the tick signal until the
     * node child returns `SUCCESS`, `RUNNING` or `ERROR`. Optionally, a maximum
     * number of repetitions can be defined.
     *
     */
@JSGlobal("b3.RepeatUntilSuccess")
@js.native
class RepeatUntilSuccess () extends Decorator {
  /**
           * Creates an instance of RepeatUntilSuccess.
           *
           * - **maxLoop** (*Integer*) Maximum number of repetitions. Default to -1 (infinite).
           * - **child** (*BaseNode*) The child node.
           *
           */
  def this(hasMaxLoopChild: behavior3Lib.Anon_MaxLoop) = this()
}
