package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  var displayNameLastFirst: js.UndefOr[java.lang.String] = js.undefined
  var familyName: js.UndefOr[java.lang.String] = js.undefined
  var givenName: js.UndefOr[java.lang.String] = js.undefined
  var honorificPrefix: js.UndefOr[java.lang.String] = js.undefined
  var honorificSuffix: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var middleName: js.UndefOr[java.lang.String] = js.undefined
  var phoneticFamilyName: js.UndefOr[java.lang.String] = js.undefined
  var phoneticFullName: js.UndefOr[java.lang.String] = js.undefined
  var phoneticGivenName: js.UndefOr[java.lang.String] = js.undefined
  var phoneticHonorificPrefix: js.UndefOr[java.lang.String] = js.undefined
  var phoneticHonorificSuffix: js.UndefOr[java.lang.String] = js.undefined
  var phoneticMiddleName: js.UndefOr[java.lang.String] = js.undefined
}

object Name {
  @scala.inline
  def apply(
    displayName: java.lang.String = null,
    displayNameLastFirst: java.lang.String = null,
    familyName: java.lang.String = null,
    givenName: java.lang.String = null,
    honorificPrefix: java.lang.String = null,
    honorificSuffix: java.lang.String = null,
    metadata: FieldMetadata = null,
    middleName: java.lang.String = null,
    phoneticFamilyName: java.lang.String = null,
    phoneticFullName: java.lang.String = null,
    phoneticGivenName: java.lang.String = null,
    phoneticHonorificPrefix: java.lang.String = null,
    phoneticHonorificSuffix: java.lang.String = null,
    phoneticMiddleName: java.lang.String = null
  ): Name = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (displayNameLastFirst != null) __obj.updateDynamic("displayNameLastFirst")(displayNameLastFirst)
    if (familyName != null) __obj.updateDynamic("familyName")(familyName)
    if (givenName != null) __obj.updateDynamic("givenName")(givenName)
    if (honorificPrefix != null) __obj.updateDynamic("honorificPrefix")(honorificPrefix)
    if (honorificSuffix != null) __obj.updateDynamic("honorificSuffix")(honorificSuffix)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (middleName != null) __obj.updateDynamic("middleName")(middleName)
    if (phoneticFamilyName != null) __obj.updateDynamic("phoneticFamilyName")(phoneticFamilyName)
    if (phoneticFullName != null) __obj.updateDynamic("phoneticFullName")(phoneticFullName)
    if (phoneticGivenName != null) __obj.updateDynamic("phoneticGivenName")(phoneticGivenName)
    if (phoneticHonorificPrefix != null) __obj.updateDynamic("phoneticHonorificPrefix")(phoneticHonorificPrefix)
    if (phoneticHonorificSuffix != null) __obj.updateDynamic("phoneticHonorificSuffix")(phoneticHonorificSuffix)
    if (phoneticMiddleName != null) __obj.updateDynamic("phoneticMiddleName")(phoneticMiddleName)
    __obj.asInstanceOf[Name]
  }
}

