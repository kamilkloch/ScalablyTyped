package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MutationConfig[T /* <: OperationBase */] extends js.Object {
  var configs: js.UndefOr[js.Array[RelayMutationConfig]] = js.undefined
  var mutation: GraphQLTaggedNode
  var onCompleted: js.UndefOr[
    js.Function2[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(response))) *//* response */ js.Any, 
      /* errors */ js.UndefOr[js.Array[PayloadError] | scala.Null], 
      scala.Unit
    ]
  ] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]] = js.undefined
  var optimisticResponse: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(response))) */js.UndefOr[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(response))) */js.Any
  ] = js.undefined
  var optimisticUpdater: js.UndefOr[
    SelectorStoreUpdater[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(response))) */js.Any
    ]
  ] = js.undefined
  var updater: js.UndefOr[
    SelectorStoreUpdater[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(response))) */js.Any
    ]
  ] = js.undefined
  var uploadables: js.UndefOr[UploadableMap] = js.undefined
  var variables: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(variables))) */js.Any
}
