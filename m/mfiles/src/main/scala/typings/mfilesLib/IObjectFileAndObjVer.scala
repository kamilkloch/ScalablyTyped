package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFileAndObjVer extends js.Object {
  val ObjVer: IObjVer
  val ObjectFile: IObjectFile
  def Clone(): IObjectFileAndObjVer
  def ToJSON(): java.lang.String
}

object IObjectFileAndObjVer {
  @scala.inline
  def apply(
    Clone: () => IObjectFileAndObjVer,
    ObjVer: IObjVer,
    ObjectFile: IObjectFile,
    ToJSON: () => java.lang.String
  ): IObjectFileAndObjVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ObjVer = ObjVer, ObjectFile = ObjectFile, ToJSON = js.Any.fromFunction0(ToJSON))
  
    __obj.asInstanceOf[IObjectFileAndObjVer]
  }
}

