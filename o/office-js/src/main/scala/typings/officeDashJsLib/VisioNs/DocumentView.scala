package typings
package officeDashJsLib.VisioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     *
     * Represents the DocumentView class.
     *
     * [Api set:  1.1]
     */
@JSGlobal("Visio.DocumentView")
@js.native
class DocumentView ()
  extends officeDashJsLib.OfficeExtensionNs.ClientObject {
  /**
           *
           * Disable Hyperlinks.
           *
           * [Api set:  1.1]
           */
  var disableHyperlinks: scala.Boolean = js.native
  /**
           *
           * Disable Pan.
           *
           * [Api set:  1.1]
           */
  var disablePan: scala.Boolean = js.native
  /**
           *
           * Disable Zoom.
           *
           * [Api set:  1.1]
           */
  var disableZoom: scala.Boolean = js.native
  /**
           *
           * Hide Diagram Boundary.
           *
           * [Api set:  1.1]
           */
  var hideDiagramBoundary: scala.Boolean = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Visio.DocumentView` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Visio.DocumentView` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.DocumentView` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(): DocumentView = js.native
  def load(option: java.lang.String): DocumentView = js.native
  def load(option: js.Array[java.lang.String]): DocumentView = js.native
  def load(option: officeDashJsLib.Anon_Select): DocumentView = js.native
  /**
           * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
           *
           * @remarks
           *
           * In addition to this signature, this method has the following signatures:
           *
           * `load(option?: string | string[]): Visio.DocumentView` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
           *
           * `load(option?: { select?: string; expand?: string; }): Visio.DocumentView` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
           *
           * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Visio.DocumentView` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
           *
           * @param options Provides options for which properties of the object to load.
           */
  def load(option: officeDashJsLib.VisioNs.InterfacesNs.DocumentViewLoadOptions): DocumentView = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: DocumentView): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Visio.DocumentView): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(properties: officeDashJsLib.VisioNs.InterfacesNs.DocumentViewUpdateData): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
           *
           * @remarks
           *
           * This method has the following additional signature:
           *
           * `set(properties: Visio.DocumentView): void`
           *
           * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
           * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
           */
  def set(
    properties: officeDashJsLib.VisioNs.InterfacesNs.DocumentViewUpdateData,
    options: officeDashJsLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  def toJSON(): officeDashJsLib.VisioNs.InterfacesNs.DocumentViewData = js.native
}
