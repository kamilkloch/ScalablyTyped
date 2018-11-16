package typings
package officeDashUiDashFabricDashReactLib.libComponentsCheckboxCheckboxDotBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Checkbox/Checkbox.base", "CheckboxBase")
@js.native
class CheckboxBase protected ()
  extends officeDashUiDashFabricDashReactLib.libUtilitiesMod.BaseComponent[
      officeDashUiDashFabricDashReactLib.libComponentsCheckboxCheckboxDotTypesMod.ICheckboxProps, 
      ICheckboxState
    ]
     with officeDashUiDashFabricDashReactLib.libComponentsCheckboxCheckboxDotTypesMod.ICheckbox {
  /**
       * Initialize a new instance of the TopHeaderV2
       * @param props - Props for the component
       * @param context - Context or initial state for the base component.
       */
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsCheckboxCheckboxDotTypesMod.ICheckboxProps) = this()
  /**
       * Initialize a new instance of the TopHeaderV2
       * @param props - Props for the component
       * @param context - Context or initial state for the base component.
       */
  def this(props: officeDashUiDashFabricDashReactLib.libComponentsCheckboxCheckboxDotTypesMod.ICheckboxProps, context: js.Any) = this()
  var _checkBox: js.Any = js.native
  var _classNames: js.Any = js.native
  var _id: js.Any = js.native
  var _onBlur: js.Any = js.native
  var _onClick: js.Any = js.native
  var _onFocus: js.Any = js.native
  var _onRenderLabel: js.Any = js.native
  /** Gets the current checked state. */
  /* CompleteClass */
  override var checked: scala.Boolean = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCheckboxBase(
    newProps: officeDashUiDashFabricDashReactLib.libComponentsCheckboxCheckboxDotTypesMod.ICheckboxProps
  ): scala.Unit = js.native
  /** Sets focus to the checkbox. */
  /* CompleteClass */
  override def focus(): scala.Unit = js.native
}

@JSImport("office-ui-fabric-react/lib/components/Checkbox/Checkbox.base", "CheckboxBase")
@js.native
object CheckboxBase extends js.Object {
  var defaultProps: officeDashUiDashFabricDashReactLib.libComponentsCheckboxCheckboxDotTypesMod.ICheckboxProps = js.native
}
