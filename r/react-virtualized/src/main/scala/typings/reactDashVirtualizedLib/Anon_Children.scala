package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Children extends js.Object {
  @JSName("children")
  var children_Original: reactLib.reactMod.Validator[
    js.Function1[
      /* props */ reactDashVirtualizedLib.distEsColumnSizerMod.SizedColumnProps, 
      reactLib.reactMod.ReactNode
    ]
  ] = js.native
  @JSName("columnCount")
  var columnCount_Original: reactLib.reactMod.Validator[scala.Double] = js.native
  @JSName("columnMaxWidth")
  var columnMaxWidth_Original: reactLib.reactMod.Requireable[scala.Double] = js.native
  @JSName("columnMinWidth")
  var columnMinWidth_Original: reactLib.reactMod.Requireable[scala.Double] = js.native
  @JSName("width")
  var width_Original: reactLib.reactMod.Validator[scala.Double] = js.native
  def children(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def columnCount(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def columnMaxWidth(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def columnMinWidth(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def width(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

