package typings
package fluxLib.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents the most basic functionality for a FluxStore. Do not
  * extend this store directly; instead extend FluxReduceStore when creating a
  * new store.
  */
@JSImport("flux/utils", "Store")
@js.native
abstract class Store[TPayload] protected ()
  extends fluxLib.libFluxStoreMod.^[TPayload] {
  /**
    * Constructs and registers an instance of this store with the given dispatcher.
    */
  def this(dispatcher: fluxLib.libDispatcherMod.^[TPayload]) = this()
}

