package typings
package globalizeLib.distGlobalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("globalize/dist/globalize", JSImport.Namespace)
@js.native
class Class protected () extends Globalize {
  /**
  		 * Create a Globalize instance.
  		 * @param cldr Cldr instance of the instance.
  		 * @returns {Globalize} A Globalize instance
  		 */
  def this(cldr: cldrjsLib.cldrjsMod.CldrStatic) = this()
  /**
  		 * Create a Globalize instance.
  		 * @param {string} Locale string of the instance.
  		 * @returns {Globalize} A Globalize instance
  		 */
  def this(locale: java.lang.String) = this()
}

