package typings
package officeDashJsLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         *
         * Represents a collection of worksheet objects that are part of the workbook.
         *
         * [Api set: ExcelApi 1.1]
         */

trait WorksheetCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Returns collection of charts that are part of the worksheet.
              *
              * [Api set: ExcelApi 1.1]
              */
  var charts: js.UndefOr[ChartCollectionLoadOptions] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Returns a value that uniquely identifies the worksheet in a given workbook. The value of the identifier remains the same even when the worksheet is renamed or moved. Read-only.
               *
               * [Api set: ExcelApi 1.1]
               */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: The display name of the worksheet.
               *
               * [Api set: ExcelApi 1.1]
               */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: The zero-based position of the worksheet within the workbook.
               *
               * [Api set: ExcelApi 1.1]
               */
  var position: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Returns sheet protection object for a worksheet.
              *
              * [Api set: ExcelApi 1.2]
              */
  var protection: js.UndefOr[WorksheetProtectionLoadOptions] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets or sets the worksheet's gridlines flag.
              This flag determines whether gridlines are visible to the user.
               *
               * [Api set: ExcelApi 1.8]
               */
  var showGridlines: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets or sets the worksheet's headings flag.
              This flag determines whether headings are visible to the user.
               *
               * [Api set: ExcelApi 1.8]
               */
  var showHeadings: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Returns the standard (default) height of all the rows in the worksheet, in points. Read-only.
               *
               * [Api set: ExcelApi 1.7]
               */
  var standardHeight: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Returns or sets the standard (default) width of all the columns in the worksheet.
              One unit of column width is equal to the width of one character in the Normal style. For proportional fonts, the width of the character 0 (zero) is used.
               *
               * [Api set: ExcelApi 1.7]
               */
  var standardWidth: js.UndefOr[scala.Boolean] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: Gets or sets the worksheet tab color.
              When retrieving the tab color, if the worksheet is invisible, the value will be null. If the worksheet is visible but the tab color is set to auto, an empty string will be returned. Otherwise, the property will be set to a color, in the form "#123456"
              When setting the color, use an empty-string to set an "auto" color, or a real color otherwise.
               *
               * [Api set: ExcelApi 1.7]
               */
  var tabColor: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * For EACH ITEM in the collection: Collection of tables that are part of the worksheet.
              *
              * [Api set: ExcelApi 1.1]
              */
  var tables: js.UndefOr[TableCollectionLoadOptions] = js.undefined
  /**
               *
               * For EACH ITEM in the collection: The Visibility of the worksheet.
               *
               * [Api set: ExcelApi 1.1 for reading visibility; 1.2 for setting it.]
               */
  var visibility: js.UndefOr[scala.Boolean] = js.undefined
}
