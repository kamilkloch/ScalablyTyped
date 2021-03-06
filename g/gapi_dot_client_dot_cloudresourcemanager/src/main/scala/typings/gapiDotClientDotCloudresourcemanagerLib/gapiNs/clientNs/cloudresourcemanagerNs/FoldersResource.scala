package typings
package gapiDotClientDotCloudresourcemanagerLib.gapiNs.clientNs.cloudresourcemanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldersResource extends js.Object {
  /** Clears a `Policy` from a resource. */
  def clearOrgPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Gets the effective `Policy` on a resource. This is the result of merging
    * `Policies` in the resource hierarchy. The returned `Policy` will not have
    * an `etag`set because it is a computed `Policy` across multiple resources.
    */
  def getEffectiveOrgPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
  /**
    * Gets a `Policy` on a resource.
    *
    * If no `Policy` is set on the resource, a `Policy` is returned with default
    * values including `POLICY_TYPE_NOT_SET` for the `policy_type oneof`. The
    * `etag` value can be used with `SetOrgPolicy()` to create or update a
    * `Policy` during read-modify-write.
    */
  def getOrgPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
  /** Lists `Constraints` that could be applied on the specified resource. */
  def listAvailableOrgPolicyConstraints(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListAvailableOrgPolicyConstraintsResponse]
  /** Lists all the `Policies` set for a particular resource. */
  def listOrgPolicies(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[ListOrgPoliciesResponse]
  /**
    * Updates the specified `Policy` on the resource. Creates a new `Policy` for
    * that `Constraint` on the resource if one does not exist.
    *
    * Not supplying an `etag` on the request `Policy` results in an unconditional
    * write of the `Policy`.
    */
  def setOrgPolicy(request: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
}

object FoldersResource {
  @scala.inline
  def apply(
    clearOrgPolicy: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[js.Object],
    getEffectiveOrgPolicy: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy],
    getOrgPolicy: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy],
    listAvailableOrgPolicyConstraints: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[ListAvailableOrgPolicyConstraintsResponse],
    listOrgPolicies: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[ListOrgPoliciesResponse],
    setOrgPolicy: gapiDotClientDotCloudresourcemanagerLib.Anon_Accesstoken => gapiDotClientLib.gapiNs.clientNs.Request[OrgPolicy]
  ): FoldersResource = {
    val __obj = js.Dynamic.literal(clearOrgPolicy = js.Any.fromFunction1(clearOrgPolicy), getEffectiveOrgPolicy = js.Any.fromFunction1(getEffectiveOrgPolicy), getOrgPolicy = js.Any.fromFunction1(getOrgPolicy), listAvailableOrgPolicyConstraints = js.Any.fromFunction1(listAvailableOrgPolicyConstraints), listOrgPolicies = js.Any.fromFunction1(listOrgPolicies), setOrgPolicy = js.Any.fromFunction1(setOrgPolicy))
  
    __obj.asInstanceOf[FoldersResource]
  }
}

