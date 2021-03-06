package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaStreamAudioDestinationNode extends AudioNode {
  val stream: MediaStream = js.native
}

@JSGlobal("MediaStreamAudioDestinationNode")
@js.native
class MediaStreamAudioDestinationNodeCls protected () extends MediaStreamAudioDestinationNode {
  def this(context: AudioContext) = this()
  def this(context: AudioContext, options: AudioNodeOptions) = this()
}

@JSGlobal("MediaStreamAudioDestinationNode")
@js.native
object MediaStreamAudioDestinationNode
  extends org.scalablytyped.runtime.Instantiable1[/* context */ AudioContext, MediaStreamAudioDestinationNode]
     with org.scalablytyped.runtime.Instantiable2[
      /* context */ AudioContext, 
      /* options */ AudioNodeOptions, 
      MediaStreamAudioDestinationNode
    ]

