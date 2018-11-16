package typings
package atMaterialTextfieldLib.textfieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/textfield", "MDCTextField")
@js.native
class MDCTextField ()
  extends atMaterialBaseLib.componentMod.default[
      atMaterialTextfieldLib.adapterMod.MDCTextFieldAdapter, 
      atMaterialTextfieldLib.foundationMod.default
    ] {
  var disabled: scala.Boolean = js.native
  var helperTextContent: java.lang.String = js.native
  var max: java.lang.String = js.native
  var maxLength: scala.Double = js.native
  var min: java.lang.String = js.native
  var minLength: scala.Double = js.native
  var pattern: java.lang.String = js.native
  var required: scala.Boolean = js.native
  var step: java.lang.String = js.native
  var valid: scala.Boolean = js.native
  var value: java.lang.String = js.native
  /**
       * Initiliazes the Text Field's internal state based on the environment's
       * state.
       */
  def initialSyncWithDom(): scala.Unit = js.native
  def initialize(
    rippleFactory: js.UndefOr[
      js.Function2[
        /* el */ stdLib.Element, 
        /* foundation */ atMaterialRippleLib.rippleMod.MDCRippleFoundation, 
        atMaterialRippleLib.rippleMod.MDCRipple
      ]
    ],
    lineRippleFactory: js.UndefOr[
      js.Function1[
        /* el */ stdLib.Element, 
        atMaterialLineDashRippleLib.lineDashRippleMod.MDCLineRipple
      ]
    ],
    helperTextFactory: js.UndefOr[
      js.Function1[
        /* el */ stdLib.Element, 
        atMaterialTextfieldLib.helperDashTextMod.MDCTextFieldHelperText
      ]
    ],
    iconFactory: js.UndefOr[
      js.Function1[/* el */ stdLib.Element, atMaterialTextfieldLib.iconMod.MDCTextFieldIcon]
    ],
    labelFactory: js.UndefOr[
      js.Function1[
        /* el */ stdLib.Element, 
        atMaterialFloatingDashLabelLib.floatingDashLabelMod.MDCFloatingLabel
      ]
    ],
    outlineFactory: js.UndefOr[
      js.Function1[
        /* el */ stdLib.Element, 
        atMaterialNotchedDashOutlineLib.notchedDashOutlineMod.MDCNotchedOutline
      ]
    ]
  ): scala.Unit = js.native
  /**
       * Recomputes the outline SVG path for the outline element.
       */
  def layout(): scala.Unit = js.native
}

@JSImport("@material/textfield", "MDCTextField")
@js.native
object MDCTextField extends js.Object {
  def attachTo(root: stdLib.Element): atMaterialTextfieldLib.textfieldMod.MDCTextField = js.native
}
