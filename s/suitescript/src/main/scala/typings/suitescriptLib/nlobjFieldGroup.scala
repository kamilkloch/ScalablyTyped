package typings
package suitescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Return a new instance of nlobjFieldGroup (currently only supported on nlobjAssistant pages)
 *
 * @classDescription object used for grouping fields on pages (currently only supported on assistant pages).
 * @return {nlobjFieldGroup}
 * @constructor
 *
 * @since 2009.2
 */
@js.native
trait nlobjFieldGroup
  extends /**
     *
     * @return
     */
ScalablyTyped.runtime.Instantiable0[js.Any] {
  /**
       * set collapsibility property for this field group.
       *
       * @param {boolean} collapsible if true then this field group is collapsible
       * @param {boolean} [defaultcollapsed] if true and the field group is collapsible, collapse this field group by default
       * @return {nlobjFieldGroup}
       *
       * @method
       * @memberOf nlobjFieldGroup
       *
       * @since 2009.2
       * @param collapsible
       * @param defaultcollapsed?
       * @return
       */
  def setCollapsible(collapsible: scala.Boolean): js.Function0[scala.Unit] = js.native
  /**
       * set collapsibility property for this field group.
       *
       * @param {boolean} collapsible if true then this field group is collapsible
       * @param {boolean} [defaultcollapsed] if true and the field group is collapsible, collapse this field group by default
       * @return {nlobjFieldGroup}
       *
       * @method
       * @memberOf nlobjFieldGroup
       *
       * @since 2009.2
       * @param collapsible
       * @param defaultcollapsed?
       * @return
       */
  def setCollapsible(collapsible: scala.Boolean, defaultcollapsed: scala.Boolean): js.Function0[scala.Unit] = js.native
  /**
       * set the label for this field group.
       * @param {string} label display label for field group
       * @return {nlobjFieldGroup}
       *
       * @method
       * @memberOf nlobjFieldGroup
       *
       * @since 2009.2
       * @param label
       * @return
       */
  def setLabel(label: java.lang.String): js.Function0[scala.Unit] = js.native
  /**
       * set showBorder property for this field group.
       *
       * @param {boolean} showBorder if true then this field group shows border including label of group
       * @return {nlobjFieldGroup}
       *
       * @method
       * @memberOf nlobjFieldGroup
       *
       * @since 2011.1
       * @param showBorder
       * @return
       */
  def setShowBorder(showBorder: scala.Boolean): js.Function0[scala.Unit] = js.native
  /**
       * set singleColumn property for this field group.
       *
       * @param {boolean} singleColumn if true then this field group is displayed in single column
       * @return {nlobjFieldGroup}
       *
       * @method
       * @memberOf nlobjFieldGroup
       *
       * @since 2011.1
       * @param singleColumn
       * @return
       */
  def setSingleColumn(singleColumn: scala.Boolean): js.Function0[scala.Unit] = js.native
}
