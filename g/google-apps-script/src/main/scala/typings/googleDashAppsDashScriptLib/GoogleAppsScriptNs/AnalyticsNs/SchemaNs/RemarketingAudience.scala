package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingAudience extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var audienceDefinition: js.UndefOr[RemarketingAudienceAudienceDefinition] = js.undefined
  var audienceType: js.UndefOr[java.lang.String] = js.undefined
  var created: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var linkedAdAccounts: js.UndefOr[js.Array[LinkedForeignAccount]] = js.undefined
  var linkedViews: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var stateBasedAudienceDefinition: js.UndefOr[RemarketingAudienceStateBasedAudienceDefinition] = js.undefined
  var updated: js.UndefOr[java.lang.String] = js.undefined
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

object RemarketingAudience {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    audienceDefinition: RemarketingAudienceAudienceDefinition = null,
    audienceType: java.lang.String = null,
    created: java.lang.String = null,
    description: java.lang.String = null,
    id: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    kind: java.lang.String = null,
    linkedAdAccounts: js.Array[LinkedForeignAccount] = null,
    linkedViews: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    stateBasedAudienceDefinition: RemarketingAudienceStateBasedAudienceDefinition = null,
    updated: java.lang.String = null,
    webPropertyId: java.lang.String = null
  ): RemarketingAudience = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (audienceDefinition != null) __obj.updateDynamic("audienceDefinition")(audienceDefinition)
    if (audienceType != null) __obj.updateDynamic("audienceType")(audienceType)
    if (created != null) __obj.updateDynamic("created")(created)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (linkedAdAccounts != null) __obj.updateDynamic("linkedAdAccounts")(linkedAdAccounts)
    if (linkedViews != null) __obj.updateDynamic("linkedViews")(linkedViews)
    if (name != null) __obj.updateDynamic("name")(name)
    if (stateBasedAudienceDefinition != null) __obj.updateDynamic("stateBasedAudienceDefinition")(stateBasedAudienceDefinition)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    __obj.asInstanceOf[RemarketingAudience]
  }
}

