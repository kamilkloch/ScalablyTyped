package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUserGroups extends js.Object {
  val Count: scala.Double
  def Item(Index: scala.Double): IUserGroup
}

object IUserGroups {
  @scala.inline
  def apply(Count: scala.Double, Item: scala.Double => IUserGroup): IUserGroups = {
    val __obj = js.Dynamic.literal(Count = Count, Item = js.Any.fromFunction1(Item))
  
    __obj.asInstanceOf[IUserGroups]
  }
}

