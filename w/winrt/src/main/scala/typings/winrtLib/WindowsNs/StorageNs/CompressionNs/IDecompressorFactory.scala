package typings
package winrtLib.WindowsNs.StorageNs.CompressionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDecompressorFactory extends js.Object {
  def createDecompressor(underlyingStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream): Decompressor
}

object IDecompressorFactory {
  @scala.inline
  def apply(createDecompressor: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream => Decompressor): IDecompressorFactory = {
    val __obj = js.Dynamic.literal(createDecompressor = js.Any.fromFunction1(createDecompressor))
  
    __obj.asInstanceOf[IDecompressorFactory]
  }
}

