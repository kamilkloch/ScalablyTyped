package typings
package rxDashLiteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ResolverResolvePromise[T, TPromise /* <: rxDashCoreLib.RxNs.IPromise[T] */]
  extends ScalablyTyped.runtime.Instantiable1[
      /* resolver */ js.Function2[
        /* resolvePromise */ js.Function1[/* value */ T, scala.Unit], 
        /* rejectPromise */ js.Function1[/* reason */ js.Any, scala.Unit], 
        scala.Unit
      ], 
      TPromise
    ]
