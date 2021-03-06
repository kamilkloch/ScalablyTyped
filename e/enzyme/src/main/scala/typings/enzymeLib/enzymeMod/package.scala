package typings
package enzymeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object enzymeMod {
  type ComponentType[Props] = ComponentClass[Props] | StatelessComponent[Props]
  type EnzymePropSelector = org.scalablytyped.runtime.StringDictionary[js.Any]
  type EnzymeSelector = java.lang.String | StatelessComponent[js.Any] | ComponentClass[js.Any] | EnzymePropSelector
  type HTMLAttributes = reactLib.reactMod.AllHTMLAttributes[js.Object] with reactLib.reactMod.SVGAttributes[js.Object]
  type Intercepter[T] = js.Function1[/* intercepter */ T, scala.Unit]
  type Parameters[T] = js.Any
  type StatelessComponent[Props] = js.Function2[
    /* props */ Props, 
    /* context */ js.UndefOr[js.Any], 
    reactLib.reactMod.Global.JSXNs.Element | scala.Null
  ]
}
