package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.DataProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataProtectionProvider extends js.Object {
  def protectAsync(data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer]
  def protectStreamAsync(
    src: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    dest: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction
  def unprotectAsync(data: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer]
  def unprotectStreamAsync(
    src: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    dest: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction
}

object IDataProtectionProvider {
  @scala.inline
  def apply(
    protectAsync: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer],
    protectStreamAsync: (winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream, winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream) => winrtLib.WindowsNs.FoundationNs.IAsyncAction,
    unprotectAsync: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer],
    unprotectStreamAsync: (winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream, winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream) => winrtLib.WindowsNs.FoundationNs.IAsyncAction
  ): IDataProtectionProvider = {
    val __obj = js.Dynamic.literal(protectAsync = js.Any.fromFunction1(protectAsync), protectStreamAsync = js.Any.fromFunction2(protectStreamAsync), unprotectAsync = js.Any.fromFunction1(unprotectAsync), unprotectStreamAsync = js.Any.fromFunction2(unprotectStreamAsync))
  
    __obj.asInstanceOf[IDataProtectionProvider]
  }
}

