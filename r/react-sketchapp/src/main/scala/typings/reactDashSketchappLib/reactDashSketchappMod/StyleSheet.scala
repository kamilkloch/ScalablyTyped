package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp", "StyleSheet")
@js.native
object StyleSheet extends js.Object {
  var absoluteFill: reactDashSketchappLib.reactDashSketchappMod.StyleReference = js.native
  var hairlineWidth: reactDashSketchappLib.reactDashSketchappLibNumbers.`1` = js.native
  /**
    * Create an optimized `StyleSheet` reference from a style object.
    */
  def create[T /* <: org.scalablytyped.runtime.StringDictionary[
    reactDashSketchappLib.reactDashSketchappMod.Style | reactDashSketchappLib.reactDashSketchappMod.TextStyle
  ] */](t: T): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: react-sketchapp.react-sketchapp.StyleReference}
    */ reactDashSketchappLib.reactDashSketchappLibStrings.StyleSheet with js.Any = js.native
  def flatten(): reactDashSketchappLib.reactDashSketchappMod.Style | reactDashSketchappLib.reactDashSketchappMod.TextStyle = js.native
  /**
    * Flatten an array of style objects into one aggregated object, or look up the definition for a
    * registered stylesheet.
    */
  def flatten(
    input: js.Array[
      reactDashSketchappLib.reactDashSketchappMod.Style | reactDashSketchappLib.reactDashSketchappMod.TextStyle | reactDashSketchappLib.reactDashSketchappMod.StyleReference
    ]
  ): reactDashSketchappLib.reactDashSketchappMod.Style | reactDashSketchappLib.reactDashSketchappMod.TextStyle = js.native
  def flatten(input: reactDashSketchappLib.reactDashSketchappMod.Style): reactDashSketchappLib.reactDashSketchappMod.Style | reactDashSketchappLib.reactDashSketchappMod.TextStyle = js.native
  def flatten(input: reactDashSketchappLib.reactDashSketchappMod.StyleReference): reactDashSketchappLib.reactDashSketchappMod.Style | reactDashSketchappLib.reactDashSketchappMod.TextStyle = js.native
   // returns the expanded style or expanded style reference which conforms
  // to the `Style | TextStyle` interface
  /**
    * resolve one style
    */
  def resolve(style: reactDashSketchappLib.reactDashSketchappMod.Style): reactDashSketchappLib.Anon_Style = js.native
  def resolve(style: reactDashSketchappLib.reactDashSketchappMod.TextStyle): reactDashSketchappLib.Anon_Style = js.native
}

