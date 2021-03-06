package typings
package atMaterialDashUiCoreLib.tablePaginationTablePaginationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/TablePagination/TablePagination.TablePaginationBaseProps, 'classes' | 'component'> ]: @material-ui/core.@material-ui/core/TablePagination/TablePagination.TablePaginationBaseProps[P]} */ @js.native
trait TablePaginationProps
  extends atMaterialDashUiCoreLib.stylesWithStylesMod.StyledComponentProps[TablePaginationClassKey]
     with atMaterialDashUiCoreLib.Anon_ClassName {
  var ActionsComponent: js.UndefOr[
    reactLib.reactMod.ReactType[
      atMaterialDashUiCoreLib.tablePaginationTablePaginationActionsMod.TablePaginationActionsProps
    ]
  ] = js.native
  var SelectProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.selectSelectMod.SelectProps]] = js.native
  var backIconButtonProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.iconButtonIconButtonMod.IconButtonProps]] = js.native
  var component: js.UndefOr[reactLib.reactMod.ReactType[TablePaginationBaseProps]] = js.native
  var count: scala.Double = js.native
  var labelDisplayedRows: js.UndefOr[
    js.Function1[/* paginationInfo */ LabelDisplayedRowsArgs, reactLib.reactMod.ReactNode]
  ] = js.native
  var labelRowsPerPage: js.UndefOr[reactLib.reactMod.ReactNode] = js.native
  var nextIconButtonProps: js.UndefOr[stdLib.Partial[atMaterialDashUiCoreLib.iconButtonIconButtonMod.IconButtonProps]] = js.native
  var onChangeRowsPerPage: js.UndefOr[
    reactLib.reactMod.ChangeEventHandler[stdLib.HTMLTextAreaElement | stdLib.HTMLInputElement]
  ] = js.native
  var page: scala.Double = js.native
  var rowsPerPage: scala.Double = js.native
  var rowsPerPageOptions: js.UndefOr[js.Array[scala.Double]] = js.native
  def onChangePage(
    event: reactLib.reactMod.MouseEvent[stdLib.HTMLButtonElement, reactLib.NativeMouseEvent],
    page: scala.Double
  ): scala.Unit = js.native
  def onChangePage(event: scala.Null, page: scala.Double): scala.Unit = js.native
}

