package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs.typeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.type.Guid")
@js.native
class Guid protected () extends ODataType {
  /**
    * Constructor for an OData primitive type <code>Edm.Guid</code>.
    * @param oFormatOptions format options as defined in the interface of {@link sap.ui.model.SimpleType};
    * this  type ignores them since it does not support any format options
    * @param oConstraints constraints; {@link #validateValue validateValue} throws an error if any
    * constraint is  violated
    */
  def this(oFormatOptions: js.Any) = this()
  def this(oFormatOptions: js.Any, oConstraints: js.Any) = this()
  /**
    * Formats the given value to the given target type.
    * @param sValue the value to be formatted
    * @param sTargetType the target type; may be "any" or "string".  See {@link sap.ui.model.odata.type}
    * for more information.
    * @returns the formatted output value in the target type; <code>undefined</code> or <code>null</code> 
    * are formatted to <code>null</code>
    */
  def formatValue(sValue: java.lang.String, sTargetType: java.lang.String): java.lang.String = js.native
  /**
    * Parses the given value to a GUID.
    * @param sValue the value to be parsed, maps <code>""</code> to <code>null</code>
    * @param sSourceType the source type (the expected type of <code>sValue</code>); must be "string". 
    * See {@link sap.ui.model.odata.type} for more information.
    * @returns the parsed value
    */
  def parseValue(sValue: java.lang.String, sSourceType: java.lang.String): java.lang.String = js.native
  /**
    * Validates whether the given value in model representation is valid and meets thegiven constraints.
    * @param sValue the value to be validated
    */
  def validateValue(sValue: java.lang.String): scala.Unit = js.native
}

