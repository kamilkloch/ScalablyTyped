package typings
package atPulumiPulumiLib.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResourceProvider extends js.Object {
  /**
       * Check validates that the given property bag is valid for a resource of the given type.
       *
       * @param olds The old input properties to use for validation.
       * @param news The new input properties to use for validation.
       */
  var check: js.UndefOr[js.Function2[/* olds */ js.Any, /* news */ js.Any, stdLib.Promise[CheckResult]]] = js.undefined
  /**
       * Delete tears down an existing resource with the given ID.  If it fails, the resource is assumed to still exist.
       *
       * @param id The ID of the resource to delete.
       * @param props The current properties on the resource.
       */
  var delete: js.UndefOr[
    js.Function2[
      /* id */ atPulumiPulumiLib.resourceMod.ID, 
      /* props */ js.Any, 
      stdLib.Promise[scala.Unit]
    ]
  ] = js.undefined
  /**
       * Diff checks what impacts a hypothetical update will have on the resource's properties.
       *
       * @param id The ID of the resource to diff.
       * @param olds The old values of properties to diff.
       * @param news The new values of properties to diff.
       */
  var diff: js.UndefOr[
    js.Function3[
      /* id */ atPulumiPulumiLib.resourceMod.ID, 
      /* olds */ js.Any, 
      /* news */ js.Any, 
      stdLib.Promise[DiffResult]
    ]
  ] = js.undefined
  /**
       * Reads the current live state associated with a resource.  Enough state must be included in the inputs to uniquely
       * identify the resource; this is typically just the resource ID, but it may also include some properties.
       */
  var read: js.UndefOr[
    js.Function2[
      /* id */ atPulumiPulumiLib.resourceMod.ID, 
      /* props */ js.UndefOr[js.Any], 
      stdLib.Promise[ReadResult]
    ]
  ] = js.undefined
  /**
       * Update updates an existing resource with new values.
       *
       * @param id The ID of the resource to update.
       * @param olds The old values of properties to update.
       * @param news The new values of properties to update.
       */
  var update: js.UndefOr[
    js.Function3[
      /* id */ atPulumiPulumiLib.resourceMod.ID, 
      /* olds */ js.Any, 
      /* news */ js.Any, 
      stdLib.Promise[UpdateResult]
    ]
  ] = js.undefined
  /**
       * Create allocates a new instance of the provided resource and returns its unique ID afterwards.
       * If this call fails, the resource must not have been created (i.e., it is "transacational").
       *
       * @param inputs The properties to set during creation.
       */
  def create(inputs: js.Any): stdLib.Promise[CreateResult]
}
