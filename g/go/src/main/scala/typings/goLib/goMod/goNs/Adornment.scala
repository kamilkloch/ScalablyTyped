package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * An adornment is a special kind of Part that is associated with another Part,
    * the Adornment.adornedPart.
    * Adornments are normally associated with a particular GraphObject in the adorned part --
    * that is the value of .adornedObject.
    * However, the .adornedObject may be null, in which case the .adornedPart will also be null.
    */
@js.native
trait Adornment extends Part {
  /**Gets or sets the GraphObject that is adorned.*/
  var adornedObject: GraphObject = js.native
  /**This read-only property returns the Part that contains the adorned object.*/
  var adornedPart: Part = js.native
  /**This read-only property returns a Placeholder that this Adornment may contain in its visual tree.*/
  var placeholder: Placeholder = js.native
}
