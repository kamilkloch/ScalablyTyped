package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchDef extends js.Object {
  var Conditions: ISearchConditions
  var Levels: IExpressionExs
  var LookInAllVersions: scala.Boolean
  var ReturnLatestVisibleVersion: scala.Boolean
  var SearchFlags: mfilesLib.MFilesNs.MFSearchFlags
  def Clone(): ISearchDef
  def IsIndirectionUsed(): scala.Boolean
}

object ISearchDef {
  @scala.inline
  def apply(
    Clone: () => ISearchDef,
    Conditions: ISearchConditions,
    IsIndirectionUsed: () => scala.Boolean,
    Levels: IExpressionExs,
    LookInAllVersions: scala.Boolean,
    ReturnLatestVisibleVersion: scala.Boolean,
    SearchFlags: mfilesLib.MFilesNs.MFSearchFlags
  ): ISearchDef = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Conditions = Conditions, IsIndirectionUsed = js.Any.fromFunction0(IsIndirectionUsed), Levels = Levels, LookInAllVersions = LookInAllVersions, ReturnLatestVisibleVersion = ReturnLatestVisibleVersion, SearchFlags = SearchFlags)
  
    __obj.asInstanceOf[ISearchDef]
  }
}

