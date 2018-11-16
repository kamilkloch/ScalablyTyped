package typings
package ngstorageLib.ngstorageMod.ngStorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageService
  extends /**
         * Access to the properties of the store.
         */
/* key */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  @JSName("$apply")
  def $apply(): scala.Unit = js.native
  /**
           * Adds default values to the store.
           * Copies all properties of the default items to the store.
           * If the store already has one of these properties it will skip it.
           *
           * @param items object holding the default values.
           * @return the modified storage service.
           */
  @JSName("$default")
  def $default[T](items: T): StorageService with T = js.native
  /**
           * Removes all properties from the store.
           *
           * @param items optional object holding the default values to initialize the store after reset.
           * @return the modified storage service.
           */
  @JSName("$reset")
  def $reset[T](): StorageService with T = js.native
  /**
           * Removes all properties from the store.
           *
           * @param items optional object holding the default values to initialize the store after reset.
           * @return the modified storage service.
           */
  @JSName("$reset")
  def $reset[T](items: T): StorageService with T = js.native
  /**
           * @return true if the storage service is supported by the browser.
           */
  @JSName("$supported")
  def $supported(): scala.Boolean = js.native
  @JSName("$sync")
  def $sync(): scala.Unit = js.native
}
