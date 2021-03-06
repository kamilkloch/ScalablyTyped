package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Privilege
  extends stdLib.Object {
  /**
    * The description of the privilege.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#Privilege)
    */
  var description: java.lang.String
  /**
    * The unique id for the privilege.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#Privilege)
    */
  var id: scala.Double
  /**
    * The name of the privilege.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#Privilege)
    */
  var name: java.lang.String
}

object Privilege {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    id: scala.Double,
    name: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): Privilege = {
    val __obj = js.Dynamic.literal(constructor = constructor, description = description, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[Privilege]
  }
}

