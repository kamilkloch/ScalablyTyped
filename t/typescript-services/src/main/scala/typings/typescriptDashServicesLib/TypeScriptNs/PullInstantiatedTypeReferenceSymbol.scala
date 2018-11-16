package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullInstantiatedTypeReferenceSymbol")
@js.native
class PullInstantiatedTypeReferenceSymbol protected () extends PullTypeReferenceSymbol {
  def this(referencedTypeSymbol: PullTypeSymbol, _typeParameterArgumentMap: TypeArgumentMap, isInstanceReferenceType: scala.Boolean) = this()
  var _allInstantiatedMemberNameCache: js.Any = js.native
  var _generativeTypeClassification: js.Any = js.native
  var _instantiatedAssociatedContainerType: js.Any = js.native
  var _instantiatedCallSignatures: js.Any = js.native
  var _instantiatedConstructSignatures: js.Any = js.native
  var _instantiatedConstructorMethod: js.Any = js.native
  var _instantiatedIndexSignatures: js.Any = js.native
  var _instantiatedMemberNameCache: js.Any = js.native
  var _instantiatedMembers: js.Any = js.native
  var _isArray: js.Any = js.native
  var _typeArgumentReferences: js.Any = js.native
  var _typeParameterArgumentMap: js.Any = js.native
  var isInstanceReferenceType: scala.Boolean = js.native
  /* private */ def populateInstantiatedMemberFromReferencedMember(referencedMember: js.Any): js.Any = js.native
}

@JSGlobal("TypeScript.PullInstantiatedTypeReferenceSymbol")
@js.native
object PullInstantiatedTypeReferenceSymbol extends js.Object {
  def create(
    resolver: typescriptDashServicesLib.TypeScriptNs.PullTypeResolver,
    `type`: typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol,
    typeParameterArgumentMap: typescriptDashServicesLib.TypeScriptNs.TypeArgumentMap
  ): typescriptDashServicesLib.TypeScriptNs.PullInstantiatedTypeReferenceSymbol = js.native
}
