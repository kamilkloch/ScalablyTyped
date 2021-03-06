package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderContext_FieldInForm extends RenderContext_Form {
  var CurrentFieldSchema: FieldSchema_InForm
  var CurrentFieldValue: js.Any
  var CurrentGroup: Group
  var CurrentGroupIdx: scala.Double
  var CurrentItems: js.Array[Item]
}

object RenderContext_FieldInForm {
  @scala.inline
  def apply(
    CurrentFieldSchema: FieldSchema_InForm,
    CurrentFieldValue: js.Any,
    CurrentGroup: Group,
    CurrentGroupIdx: scala.Double,
    CurrentItem: Item,
    CurrentItems: js.Array[Item],
    FieldControlModes: org.scalablytyped.runtime.StringDictionary[ClientControlMode],
    FormContext: ClientFormContext,
    FormUniqueId: java.lang.String,
    ListData: ListData_InForm,
    ListSchema: ListSchema_InForm,
    BaseViewID: scala.Int | scala.Double = null,
    CSRCustomLayout: js.UndefOr[scala.Boolean] = js.undefined,
    ControlMode: ClientControlMode = null,
    CurrentCultureName: java.lang.String = null,
    CurrentLanguage: scala.Int | scala.Double = null,
    CurrentSelectedItems: js.Any = null,
    CurrentUICultureName: java.lang.String = null,
    ListTemplateType: scala.Int | scala.Double = null,
    OnPostRender: RenderCallback | js.Array[RenderCallback] = null,
    OnPreRender: RenderCallback | js.Array[RenderCallback] = null,
    RenderBody: RenderContext_FieldInForm => java.lang.String = null,
    RenderFieldByName: (RenderContext_FieldInForm, /* fieldName */ java.lang.String) => java.lang.String = null,
    RenderFields: RenderContext_FieldInForm => java.lang.String = null,
    RenderFooter: RenderContext_FieldInForm => java.lang.String = null,
    RenderGroups: RenderContext_FieldInForm => java.lang.String = null,
    RenderHeader: RenderContext_FieldInForm => java.lang.String = null,
    RenderItems: RenderContext_FieldInForm => java.lang.String = null,
    RenderView: RenderContext_FieldInForm => java.lang.String = null,
    SiteClientTag: java.lang.String = null,
    Templates: Templates = null,
    onRefreshFailed: js.Any = null
  ): RenderContext_FieldInForm = {
    val __obj = js.Dynamic.literal(CurrentFieldSchema = CurrentFieldSchema, CurrentFieldValue = CurrentFieldValue, CurrentGroup = CurrentGroup, CurrentGroupIdx = CurrentGroupIdx, CurrentItem = CurrentItem, CurrentItems = CurrentItems, FieldControlModes = FieldControlModes, FormContext = FormContext, FormUniqueId = FormUniqueId, ListData = ListData, ListSchema = ListSchema)
    if (BaseViewID != null) __obj.updateDynamic("BaseViewID")(BaseViewID.asInstanceOf[js.Any])
    if (!js.isUndefined(CSRCustomLayout)) __obj.updateDynamic("CSRCustomLayout")(CSRCustomLayout)
    if (ControlMode != null) __obj.updateDynamic("ControlMode")(ControlMode)
    if (CurrentCultureName != null) __obj.updateDynamic("CurrentCultureName")(CurrentCultureName)
    if (CurrentLanguage != null) __obj.updateDynamic("CurrentLanguage")(CurrentLanguage.asInstanceOf[js.Any])
    if (CurrentSelectedItems != null) __obj.updateDynamic("CurrentSelectedItems")(CurrentSelectedItems)
    if (CurrentUICultureName != null) __obj.updateDynamic("CurrentUICultureName")(CurrentUICultureName)
    if (ListTemplateType != null) __obj.updateDynamic("ListTemplateType")(ListTemplateType.asInstanceOf[js.Any])
    if (OnPostRender != null) __obj.updateDynamic("OnPostRender")(OnPostRender.asInstanceOf[js.Any])
    if (OnPreRender != null) __obj.updateDynamic("OnPreRender")(OnPreRender.asInstanceOf[js.Any])
    if (RenderBody != null) __obj.updateDynamic("RenderBody")(js.Any.fromFunction1(RenderBody))
    if (RenderFieldByName != null) __obj.updateDynamic("RenderFieldByName")(js.Any.fromFunction2(RenderFieldByName))
    if (RenderFields != null) __obj.updateDynamic("RenderFields")(js.Any.fromFunction1(RenderFields))
    if (RenderFooter != null) __obj.updateDynamic("RenderFooter")(js.Any.fromFunction1(RenderFooter))
    if (RenderGroups != null) __obj.updateDynamic("RenderGroups")(js.Any.fromFunction1(RenderGroups))
    if (RenderHeader != null) __obj.updateDynamic("RenderHeader")(js.Any.fromFunction1(RenderHeader))
    if (RenderItems != null) __obj.updateDynamic("RenderItems")(js.Any.fromFunction1(RenderItems))
    if (RenderView != null) __obj.updateDynamic("RenderView")(js.Any.fromFunction1(RenderView))
    if (SiteClientTag != null) __obj.updateDynamic("SiteClientTag")(SiteClientTag)
    if (Templates != null) __obj.updateDynamic("Templates")(Templates)
    if (onRefreshFailed != null) __obj.updateDynamic("onRefreshFailed")(onRefreshFailed)
    __obj.asInstanceOf[RenderContext_FieldInForm]
  }
}

