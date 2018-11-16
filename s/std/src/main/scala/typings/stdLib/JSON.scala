package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSON extends js.Object {
  @JSName(ScalablyTyped.runtime.Symbol.toStringTag)
  val toStringTag: stdLib.stdLibStrings.JSON = js.native
  /**
        * Converts a JavaScript Object Notation (JSON) string into an object.
        * @param text A valid JSON string.
        * @param reviver A function that transforms the results. This function is called for each member of the object.
        * If a member contains nested objects, the nested objects are transformed before the parent object is.
        */
  def parse(text: java.lang.String): js.Any = js.native
  /**
        * Converts a JavaScript Object Notation (JSON) string into an object.
        * @param text A valid JSON string.
        * @param reviver A function that transforms the results. This function is called for each member of the object.
        * If a member contains nested objects, the nested objects are transformed before the parent object is.
        */
  def parse(text: java.lang.String, reviver: js.Function2[/* key */ js.Any, /* value */ js.Any, _]): js.Any = js.native
  /**
        * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
        * @param value A JavaScript value, usually an object or array, to be converted.
        * @param replacer A function that transforms the results.
        * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
        */
  def stringify(value: js.Any): java.lang.String = js.native
  /**
        * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
        * @param value A JavaScript value, usually an object or array, to be converted.
        * @param replacer An array of strings and numbers that acts as a approved list for selecting the object properties that will be stringified.
        * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
        */
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String]): java.lang.String = js.native
  /**
        * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
        * @param value A JavaScript value, usually an object or array, to be converted.
        * @param replacer An array of strings and numbers that acts as a approved list for selecting the object properties that will be stringified.
        * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
        */
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String], space: java.lang.String): java.lang.String = js.native
  /**
        * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
        * @param value A JavaScript value, usually an object or array, to be converted.
        * @param replacer An array of strings and numbers that acts as a approved list for selecting the object properties that will be stringified.
        * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
        */
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String], space: scala.Double): java.lang.String = js.native
  /**
        * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
        * @param value A JavaScript value, usually an object or array, to be converted.
        * @param replacer A function that transforms the results.
        * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
        */
  def stringify(value: js.Any, replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]): java.lang.String = js.native
  /**
        * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
        * @param value A JavaScript value, usually an object or array, to be converted.
        * @param replacer A function that transforms the results.
        * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
        */
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    space: java.lang.String
  ): java.lang.String = js.native
  /**
        * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
        * @param value A JavaScript value, usually an object or array, to be converted.
        * @param replacer A function that transforms the results.
        * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
        */
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    space: scala.Double
  ): java.lang.String = js.native
  /**
        * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
        * @param value A JavaScript value, usually an object or array, to be converted.
        * @param replacer An array of strings and numbers that acts as a approved list for selecting the object properties that will be stringified.
        * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
        */
  def stringify(value: js.Any, replacer: scala.Null, space: java.lang.String): java.lang.String = js.native
  /**
        * Converts a JavaScript value to a JavaScript Object Notation (JSON) string.
        * @param value A JavaScript value, usually an object or array, to be converted.
        * @param replacer An array of strings and numbers that acts as a approved list for selecting the object properties that will be stringified.
        * @param space Adds indentation, white space, and line break characters to the return-value JSON text to make it easier to read.
        */
  def stringify(value: js.Any, replacer: scala.Null, space: scala.Double): java.lang.String = js.native
}
