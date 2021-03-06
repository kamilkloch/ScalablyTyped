package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValuesWithIconClues extends js.Object {
  val IconClues: IPropertyValueIconClues
  val ObjVer: IObjVer
  val PropertyValues: IPropertyValues
  def Clone(): IPropertyValuesWithIconClues
}

object IPropertyValuesWithIconClues {
  @scala.inline
  def apply(
    Clone: () => IPropertyValuesWithIconClues,
    IconClues: IPropertyValueIconClues,
    ObjVer: IObjVer,
    PropertyValues: IPropertyValues
  ): IPropertyValuesWithIconClues = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), IconClues = IconClues, ObjVer = ObjVer, PropertyValues = PropertyValues)
  
    __obj.asInstanceOf[IPropertyValuesWithIconClues]
  }
}

