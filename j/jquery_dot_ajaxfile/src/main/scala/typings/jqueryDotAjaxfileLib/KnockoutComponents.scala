package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComponents extends js.Object {
  var defaultLoader: jqueryDotAjaxfileLib.KnockoutComponentTypesNs.Loader = js.native
  var loaders: js.Array[jqueryDotAjaxfileLib.KnockoutComponentTypesNs.Loader] = js.native
  def clearCachedDefinition(componentName: java.lang.String): scala.Unit = js.native
  def get(
    componentName: java.lang.String,
    callback: js.Function1[
      /* definition */ jqueryDotAjaxfileLib.KnockoutComponentTypesNs.Definition, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getComponentNameForNode(node: stdLib.Node): java.lang.String = js.native
  def isRegistered(componentName: java.lang.String): scala.Boolean = js.native
  // overloads for register method:
  def register(componentName: java.lang.String, config: jqueryDotAjaxfileLib.KnockoutComponentTypesNs.Config): scala.Unit = js.native
  def register(componentName: java.lang.String, config: jqueryDotAjaxfileLib.KnockoutComponentTypesNs.EmptyConfig): scala.Unit = js.native
  def unregister(componentName: java.lang.String): scala.Unit = js.native
}

