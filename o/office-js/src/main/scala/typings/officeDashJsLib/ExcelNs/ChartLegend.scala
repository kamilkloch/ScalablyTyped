package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the legend in a chart.
     *
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.ChartLegend")
@js.native
class ChartLegend ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Represents the formatting of a chart legend, which includes fill and font formatting. Read-only.
           *
           * [Api set: ExcelApi 1.1]
           */
  val format: ChartLegendFormat = js.native
  /**
           *
           * Represents the height, in points, of the legend on the chart. Null if legend is not visible.
           *
           * [Api set: ExcelApi 1.7]
           */
  var height: scala.Double = js.native
  /**
           *
           * Represents the left, in points, of a chart legend. Null if legend is not visible.
           *
           * [Api set: ExcelApi 1.7]
           */
  var left: scala.Double = js.native
  /**
           *
           * Represents a collection of legendEntries in the legend. Read-only.
           *
           * [Api set: ExcelApi 1.7]
           */
  val legendEntries: ChartLegendEntryCollection = js.native
  /**
           *
           * Boolean value for whether the chart legend should overlap with the main body of the chart.
           *
           * [Api set: ExcelApi 1.1]
           */
  var overlay: scala.Boolean = js.native
  /**
           *
           * Represents the position of the legend on the chart. See Excel.ChartLegendPosition for details.
           *
           * [Api set: ExcelApi 1.1]
           */
  var position: ChartLegendPosition | officeDashJsLib.officeDashJsLibStrings.Invalid | officeDashJsLib.officeDashJsLibStrings.Top | officeDashJsLib.officeDashJsLibStrings.Bottom | officeDashJsLib.officeDashJsLibStrings.Left | officeDashJsLib.officeDashJsLibStrings.Right | officeDashJsLib.officeDashJsLibStrings.Corner | officeDashJsLib.officeDashJsLibStrings.Custom = js.native
  /**
           *
           * Represents if the legend has a shadow on the chart.
           *
           * [Api set: ExcelApi 1.7]
           */
  var showShadow: scala.Boolean = js.native
  /**
           *
           * Represents the top of a chart legend.
           *
           * [Api set: ExcelApi 1.7]
           */
  var top: scala.Double = js.native
  /**
           *
           * A boolean value the represents the visibility of a ChartLegend object.
           *
           * [Api set: ExcelApi 1.1]
           */
  var visible: scala.Boolean = js.native
  /**
           *
           * Represents the width, in points, of the legend on the chart. Null if legend is not visible.
           *
           * [Api set: ExcelApi 1.7]
           */
  var width: scala.Double = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartLegend` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartLegend` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartLegend` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): ChartLegend = js.native
  def load(option: java.lang.String): ChartLegend = js.native
  def load(option: js.Array[java.lang.String]): ChartLegend = js.native
  def load(option: officeDashJsLib.Anon_Select): ChartLegend = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.ChartLegend` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.ChartLegend` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.ChartLegend` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.ChartLegendLoadOptions): ChartLegend = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: ChartLegend): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ChartLegend): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartLegendUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.ChartLegend): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.ChartLegendUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ChartLegendData = js.native
}
