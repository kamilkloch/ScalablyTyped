package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamOutput extends js.Object {
  /**
    * The current status of the stream, the stream Amazon Resource Name (ARN), an array of shard objects that comprise the stream, and whether there are more shards available.
    */
  var StreamDescription: awsDashSdkLib.clientsKinesisMod.StreamDescription
}

object DescribeStreamOutput {
  @scala.inline
  def apply(StreamDescription: StreamDescription): DescribeStreamOutput = {
    val __obj = js.Dynamic.literal(StreamDescription = StreamDescription)
  
    __obj.asInstanceOf[DescribeStreamOutput]
  }
}

