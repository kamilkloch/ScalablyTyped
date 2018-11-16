package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the Excel application that manages the workbook.
     *
     * [Api set: ExcelApi 1.1]
     */
@JSGlobal("Excel.Application")
@js.native
class Application ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Returns the calculation mode used in the workbook, as defined by the constants in Excel.CalculationMode. Possible values are: `Automatic`, where Excel controls recalculation; `AutomaticExceptTables`, where Excel controls recalculation but ignores changes in tables; `Manual`, where calculation is done when the user requests it.
           *
           * [Api set: ExcelApi 1.1 for get, 1.8 for set]
           */
  var calculationMode: CalculationMode | officeDashJsLib.officeDashJsLibStrings.Automatic | officeDashJsLib.officeDashJsLibStrings.AutomaticExceptTables | officeDashJsLib.officeDashJsLibStrings.Manual = js.native
  /**
           *
           * Recalculate all currently opened workbooks in Excel.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param calculationType Specifies the calculation type to use. See Excel.CalculationType for details.
           */
  def calculate(calculationType: CalculationType): scala.Unit = js.native
  /**
           *
           * Recalculate all currently opened workbooks in Excel.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param calculationType Specifies the calculation type to use. See Excel.CalculationType for details.
           */
  @JSName("calculate")
  def calculate_Full(calculationType: officeDashJsLib.officeDashJsLibStrings.Full): scala.Unit = js.native
  /**
           *
           * Recalculate all currently opened workbooks in Excel.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param calculationType Specifies the calculation type to use. See Excel.CalculationType for details.
           */
  @JSName("calculate")
  def calculate_FullRebuild(calculationType: officeDashJsLib.officeDashJsLibStrings.FullRebuild): scala.Unit = js.native
  /**
           *
           * Recalculate all currently opened workbooks in Excel.
           *
           * [Api set: ExcelApi 1.1]
           *
           * @param calculationType Specifies the calculation type to use. See Excel.CalculationType for details.
           */
  @JSName("calculate")
  def calculate_Recalculate(calculationType: officeDashJsLib.officeDashJsLibStrings.Recalculate): scala.Unit = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.Application` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.Application` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Application` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): Application = js.native
  def load(option: java.lang.String): Application = js.native
  def load(option: js.Array[java.lang.String]): Application = js.native
  def load(option: officeDashJsLib.Anon_Select): Application = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.Application` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.Application` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.Application` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.ApplicationLoadOptions): Application = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Application): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.Application): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.ApplicationUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.Application): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.ApplicationUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /**
           *
           * Suspends calculation until the next "context.sync()" is called. Once set, it is the developer's responsibility to re-calc the workbook, to ensure that any dependencies are propagated.
           *
           * [Api set: ExcelApi 1.6]
           */
  def suspendApiCalculationUntilNextSync(): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.ApplicationData = js.native
}
