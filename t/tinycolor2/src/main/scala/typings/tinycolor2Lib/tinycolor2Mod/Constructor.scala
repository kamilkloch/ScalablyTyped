package typings
package tinycolor2Lib.tinycolor2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends /**
  * Create a tinycolor instance of the color named.
  *
  * @param color - the color as one of the valid color input format.
  */
org.scalablytyped.runtime.Instantiable0[Instance]
     with org.scalablytyped.runtime.Instantiable1[/* color */ ColorInput, Instance]
     with org.scalablytyped.runtime.Instantiable2[/* color */ ColorInput, /* opts */ ConstructorOptions, Instance] {
  /**
    * key: hex value
    * value: string name ex. hexnames["f00"] --> "red"
    */
  var hexNames: tinycolor2Lib.Anon_000000080 = js.native
  /**
    * key: 'real' color name
    * value: hex value ex. names["red"] --> "f00"
    */
  var names: tinycolor2Lib.Anon_000 = js.native
  def apply(): Instance = js.native
  def apply(color: ColorInput): Instance = js.native
  def apply(color: ColorInput, opts: ConstructorOptions): Instance = js.native
  /**
    * Compares two colors. Each colors can be any color inputs.
    */
  def equals(): scala.Boolean = js.native
  def equals(color1: ColorInput): scala.Boolean = js.native
  def equals(color1: ColorInput, color2: ColorInput): scala.Boolean = js.native
  /**
    * Create a tinycolor instance based off the relative values.
    * Works with any color formats
    *
    * @param ratio - the relative color/hue values to apply to the new instance.
    */
  def fromRatio(): Instance = js.native
  def fromRatio(ratio: ColorInputWithoutInstance): Instance = js.native
  /**
    * Ensure that foreground and background color combinations meet WCAG2 guidelines.
    *
    * @param color1 - the fore color wanted.
    * @param color2 - the back color wanted.
    * @param wcag2 - WCAG option. If the entire object is absent, function use the default of {level:"AA",size:"small"}.
    * @param wcag2.level - The 'level' property states 'AA' or 'AAA'
    *     if missing or invalid, it defaults to 'AA'
    * @param wcag2.size - The 'size' property states 'large' or 'small'
    *     if missing or invalid, it defaults to 'small'.
    */
  def isReadable(color1: ColorInput, color2: ColorInput): scala.Boolean = js.native
  def isReadable(color1: ColorInput, color2: ColorInput, wcag2: WCAG2Options): scala.Boolean = js.native
  def mix(color1: ColorInput, color2: ColorInput): Instance = js.native
  def mix(color1: ColorInput, color2: ColorInput, amount: scala.Double): Instance = js.native
  /**
    * Given a base color and a list of possible foreground or background colors for that base,
    *  returns the most readable color. Optionally returns Black or White if the most readable color is unreadable.
    *
    * @param color - the base color.
    * @param colorsToCompare - array of colors to pick the most readable one from.
    * @param args - and object with extra arguments
    */
  def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput]): Instance = js.native
  def mostReadable(baseColor: ColorInput, colorList: js.Array[ColorInput], args: MostReadableArgs): Instance = js.native
  /**
    * Returns a random color
    */
  def random(): Instance = js.native
  /**
    * Compares the two colors and returns the constrast between two colors as a number.
    *
    * @param color1 - the first color to be used in the comparison.
    * @param color2 - the second color to be used in the comparison.
    */
  def readability(color1: ColorInput, color2: ColorInput): scala.Double = js.native
}

