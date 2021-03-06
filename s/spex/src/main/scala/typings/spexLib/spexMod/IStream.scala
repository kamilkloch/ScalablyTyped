package typings
package spexLib.spexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// API: http://vitaly-t.github.io/spex/stream.html
@js.native
trait IStream extends js.Object {
  // API: http://vitaly-t.github.io/spex/stream.html#.read
  def read(
    stream: js.Any,
    receiver: js.Function3[/* index */ scala.Double, /* data */ js.Array[_], /* delay */ scala.Double, _]
  ): js.Promise[TStreamReadResult] = js.native
  def read(
    stream: js.Any,
    receiver: js.Function3[/* index */ scala.Double, /* data */ js.Array[_], /* delay */ scala.Double, _],
    options: TStreamReadOptions
  ): js.Promise[TStreamReadResult] = js.native
}

