package typings
package officeDashJsLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the Excel RowColumnPivotHierarchy.
     *
     * [Api set: ExcelApi 1.8]
     */
@JSGlobal("Excel.RowColumnPivotHierarchy")
@js.native
class RowColumnPivotHierarchy ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Returns the PivotFields associated with the RowColumnPivotHierarchy.
           *
           * [Api set: ExcelApi 1.8]
           */
  val fields: PivotFieldCollection = js.native
  /**
           *
           * Id of the RowColumnPivotHierarchy.
           *
           * [Api set: ExcelApi 1.8]
           */
  val id: java.lang.String = js.native
  /**
           *
           * Name of the RowColumnPivotHierarchy.
           *
           * [Api set: ExcelApi 1.8]
           */
  var name: java.lang.String = js.native
  /**
           *
           * Position of the RowColumnPivotHierarchy.
           *
           * [Api set: ExcelApi 1.8]
           */
  var position: scala.Double = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.RowColumnPivotHierarchy` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.RowColumnPivotHierarchy` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RowColumnPivotHierarchy` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): RowColumnPivotHierarchy = js.native
  def load(option: java.lang.String): RowColumnPivotHierarchy = js.native
  def load(option: js.Array[java.lang.String]): RowColumnPivotHierarchy = js.native
  def load(option: officeDashJsLib.Anon_Select): RowColumnPivotHierarchy = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Excel.RowColumnPivotHierarchy` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Excel.RowColumnPivotHierarchy` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Excel.RowColumnPivotHierarchy` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.ExcelNs.InterfacesNs.RowColumnPivotHierarchyLoadOptions): RowColumnPivotHierarchy = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.RowColumnPivotHierarchy): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.ExcelNs.InterfacesNs.RowColumnPivotHierarchyUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Excel.RowColumnPivotHierarchy): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.ExcelNs.InterfacesNs.RowColumnPivotHierarchyUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: RowColumnPivotHierarchy): scala.Unit = js.native
  /**
           *
           * Reset the RowColumnPivotHierarchy back to its default values.
           *
           * [Api set: ExcelApi 1.8]
           */
  def setToDefault(): scala.Unit = js.native
  def toJSON(): officeDashJsLib.ExcelNs.InterfacesNs.RowColumnPivotHierarchyData = js.native
}
