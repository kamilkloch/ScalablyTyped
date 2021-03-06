package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ProjectProjectFields extends js.Object

/**
  * Specifies the project fields that are available as a parameter for the {@link Office.Document | Document}.getProjectFieldAsync method.
  *
  * @remarks
  * 
  * A ProjectProjectFields constant can be used as a parameter of the {@link Office.Document | Document}.getProjectFieldAsync method.
  */
@JSGlobal("Office.ProjectProjectFields")
@js.native
object ProjectProjectFields extends js.Object {
  /**
    * The number of digits after the decimal for the currency.
    */
  @js.native
  sealed trait CurrencyDigits
    extends officeDashJsLib.OfficeNs.ProjectProjectFields
  
  /**
    * The currency symbol.
    */
  @js.native
  sealed trait CurrencySymbol
    extends officeDashJsLib.OfficeNs.ProjectProjectFields
  
  /**
    * The placement of the currency symbol: Not specified = -1; Before the value with no space ($0) = 0; After the value with no space (0$) = 1; 
    * Before the value with a space ($ 0) = 2; After the value with a space (0 $) = 3.
    */
  @js.native
  sealed trait CurrencySymbolPosition
    extends officeDashJsLib.OfficeNs.ProjectProjectFields
  
  @js.native
  sealed trait DurationUnits
    extends officeDashJsLib.OfficeNs.ProjectProjectFields
  
  /**
    * The project finish date.
    */
  @js.native
  sealed trait Finish
    extends officeDashJsLib.OfficeNs.ProjectProjectFields
  
  /**
    * The GUID of the project.
    */
  @js.native
  sealed trait GUID
    extends officeDashJsLib.OfficeNs.ProjectProjectFields
  
  /**
    * The Project Web App URL, for projects that are stored in Project Server.
    */
  @js.native
  sealed trait ProjectServerUrl
    extends officeDashJsLib.OfficeNs.ProjectProjectFields
  
  /**
    * Specifies whether the project is read-only.
    */
  @js.native
  sealed trait ReadOnly
    extends officeDashJsLib.OfficeNs.ProjectProjectFields
  
  /**
    * The project start date.
    */
  @js.native
  sealed trait Start
    extends officeDashJsLib.OfficeNs.ProjectProjectFields
  
  /**
    * The project version.
    */
  @js.native
  sealed trait VERSION
    extends officeDashJsLib.OfficeNs.ProjectProjectFields
  
  /**
    * The name of the SharePoint list, for projects that are synchronized with a tasks list.
    */
  @js.native
  sealed trait WSSList
    extends officeDashJsLib.OfficeNs.ProjectProjectFields
  
  /**
    * The SharePoint URL, for projects that are synchronized with a SharePoint list.
    */
  @js.native
  sealed trait WSSUrl
    extends officeDashJsLib.OfficeNs.ProjectProjectFields
  
  /**
    * The work units of the project, such as days or hours.
    */
  @js.native
  sealed trait WorkUnits
    extends officeDashJsLib.OfficeNs.ProjectProjectFields
  
  val CurrencyDigits: CurrencyDigits with java.lang.String = js.native
  val CurrencySymbol: CurrencySymbol with java.lang.String = js.native
  val CurrencySymbolPosition: CurrencySymbolPosition with java.lang.String = js.native
  val DurationUnits: DurationUnits with java.lang.String = js.native
  val Finish: Finish with java.lang.String = js.native
  val GUID: GUID with java.lang.String = js.native
  val ProjectServerUrl: ProjectServerUrl with java.lang.String = js.native
  val ReadOnly: ReadOnly with java.lang.String = js.native
  val Start: Start with java.lang.String = js.native
  val VERSION: VERSION with java.lang.String = js.native
  val WSSList: WSSList with java.lang.String = js.native
  val WSSUrl: WSSUrl with java.lang.String = js.native
  val WorkUnits: WorkUnits with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[officeDashJsLib.OfficeNs.ProjectProjectFields with java.lang.String] = js.native
}

