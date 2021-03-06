package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminSetOffsetsOptions extends js.Object {
  var groupId: java.lang.String
  var partitions: js.Array[AdminSetOffsetsSeekEntry]
  var topic: java.lang.String
}

object AdminSetOffsetsOptions {
  @scala.inline
  def apply(groupId: java.lang.String, partitions: js.Array[AdminSetOffsetsSeekEntry], topic: java.lang.String): AdminSetOffsetsOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId, partitions = partitions, topic = topic)
  
    __obj.asInstanceOf[AdminSetOffsetsOptions]
  }
}

