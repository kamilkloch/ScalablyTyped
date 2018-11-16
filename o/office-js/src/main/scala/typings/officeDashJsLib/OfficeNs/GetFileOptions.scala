package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Provides options for setting the size of slices that the document will be divided into.
     */

trait GetFileOptions extends js.Object {
  /**
           * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
           */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  /**
           * The the size of the slices in bytes. The maximum (and the default) is 4194304 (4MB).
           */
  var sliceSize: js.UndefOr[scala.Double] = js.undefined
}
