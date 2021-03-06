package typings
package gitlabLib.distLatestTemplatesResourceVariablesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceVariables
  extends gitlabLib.distLatestInfrastructureMod.BaseService {
  var resourceType: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceType */ js.Any = js.native
  def all(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any
  ): js.Promise[_] = js.native
  def create(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def edit(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    keyId: java.lang.String,
    options: gitlabLib.distLatestInfrastructureRequestHelperMod.RequestOptions
  ): js.Promise[_] = js.native
  def remove(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    keyId: java.lang.String
  ): js.Promise[_] = js.native
  def show(
    resourceId: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResourceId */ js.Any,
    keyId: java.lang.String
  ): js.Promise[_] = js.native
}

