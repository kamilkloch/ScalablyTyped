package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the form layer elements in a view
  * @since OOo 2.3
  */
trait XFormLayerAccess extends XControlAccess {
  /**
    * returns the {@link com.sun.star.form.FormController} instance which operates on a given form.
    *
    * A form controller is a component which controls the user interaction with the form layer, as long as the form is not in design mode.
    * @returns the requested form controller, or `NULL` if the view's form layer is currently in design mode. Note that the returned instance becomes non-functi
    * @see isDesignMode
    * @see setDesignMode
    * @see com.sun.star.form.runtime.FormController
    * @see com.sun.star.form.runtime.FormOperations
    */
  def getFormController(Form: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XForm): activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs.XFormController
  /**
    * determines whether the view's form layer is currently in design or alive mode
    *
    * **Note** : This is a convenience method. In the user interface, the design mode is coupled with the `.uno:SwitchControlDesignMode` feature (see {@link
    * com.sun.star.frame.XDispatchProvider} ), and asking for the current mode is the same as asking for the state of this feature.
    */
  def isFormDesignMode(): scala.Boolean
  /**
    * determines whether the view's form layer is currently in design or alive mode
    *
    * **Note** : This is a convenience method. In the user interface, the design mode is coupled with the `.uno:SwitchControlDesignMode` feature (see {@link
    * com.sun.star.frame.XDispatchProvider} ), and changing the current mode is the same as dispatching this feature URL.
    */
  def setFormDesignMode(DesignMode: scala.Boolean): scala.Unit
}

object XFormLayerAccess {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlModel => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl,
    getFormController: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XForm => activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs.XFormController,
    isFormDesignMode: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setFormDesignMode: scala.Boolean => scala.Unit
  ): XFormLayerAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getControl = js.Any.fromFunction1(getControl), getFormController = js.Any.fromFunction1(getFormController), isFormDesignMode = js.Any.fromFunction0(isFormDesignMode), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFormDesignMode = js.Any.fromFunction1(setFormDesignMode))
  
    __obj.asInstanceOf[XFormLayerAccess]
  }
}

