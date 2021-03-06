package typings
package swaggerizeDashExpressLib.swaggerizeDashExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfig extends js.Object {
  var api: swaggerizeDashExpressLib.swaggerizeDashExpressMod.SwaggerNs.ApiDefinition
  var routes: js.Array[expressLib.expressMod.IRoute]
}

object IConfig {
  @scala.inline
  def apply(
    api: swaggerizeDashExpressLib.swaggerizeDashExpressMod.SwaggerNs.ApiDefinition,
    routes: js.Array[expressLib.expressMod.IRoute]
  ): IConfig = {
    val __obj = js.Dynamic.literal(api = api, routes = routes)
  
    __obj.asInstanceOf[IConfig]
  }
}

