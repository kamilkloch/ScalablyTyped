package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Worksheet")
@js.native
class Worksheet () extends js.Object {
  /**
           * Applies a simple categorical filter (non-date).
           * See the filtering examples for more details on these functions.
           * Returns the fieldName that was filtered.
           */
  def applyFilterAsync(fieldName: java.lang.String, values: js.Array[js.Object], updateType: FilterUpdateType): stdLib.Promise[java.lang.String] = js.native
  /**
           * Applies a simple categorical filter (non-date).
           * See the filtering examples for more details on these functions.
           * Returns the fieldName that was filtered.
           */
  def applyFilterAsync(
    fieldName: java.lang.String,
    values: js.Array[js.Object],
    updateType: FilterUpdateType,
    options: FilterOptions
  ): stdLib.Promise[java.lang.String] = js.native
  /**
           * Applies a simple categorical filter (non-date).
           * See the filtering examples for more details on these functions.
           * Returns the fieldName that was filtered.
           */
  def applyFilterAsync(fieldName: java.lang.String, values: js.Object, updateType: FilterUpdateType): stdLib.Promise[java.lang.String] = js.native
  /**
           * Applies a simple categorical filter (non-date).
           * See the filtering examples for more details on these functions.
           * Returns the fieldName that was filtered.
           */
  def applyFilterAsync(
    fieldName: java.lang.String,
    values: js.Object,
    updateType: FilterUpdateType,
    options: FilterOptions
  ): stdLib.Promise[java.lang.String] = js.native
  /**
           * Applies a hierarchical filter.
           * The values parameter is either a single value, an array of values, or an object { levels: ["1", "2"] }.
           */
  def applyHierarchicalFilterAsync(fieldName: java.lang.String, values: js.Object, options: js.Any): stdLib.Promise[java.lang.String] = js.native
  /**
           * Applies a quantitative filter to a field or to a date.
           * If a range is specified that is outside of the domain min/max values, no error is raised and the command is allowed.
           * Subsequent calls to getFiltersAsync[] will return these values even if they are outside of the bounds of the domain.
           * This is equivalent to the behavior in Tableau Desktop.
           */
  def applyRangeFilterAsync(fieldName: java.lang.String, range: RangeFilterOptions): stdLib.Promise[java.lang.String] = js.native
  /** Applies a relative date filter. */
  def applyRelativeDateFilterAsync(fieldName: java.lang.String, options: RelativeDateFilterOptions): stdLib.Promise[java.lang.String] = js.native
  /**
           * Clears the filter, no matter what kind of filter it is.
           * Note that the filter is removed as long as no associated quick filter is showing for the field.
           * If there is a quick filter showing, then the filter is kept, but it’s reset to the “All” state (effectually canceling the filter).
           * For relative date filters, however, an error is returned since there is no “All” state for a relative date filter.
           * To clear a relative date filter with a quick filter showing, you can call applyRelativeDateFilter()
           * instead using a range that makes sense for the specific field.
           */
  def clearFilterAsync(fieldName: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  /** Clears the selection for this worksheet. */
  def clearSelectedMarksAsync(): stdLib.Promise[scala.Unit] = js.native
  /**
           * Gets the primary and all of the secondary data sources for this worksheet.
           * Note that by convention the primary data source should always be the first element.
           */
  def getDataSourcesAsync(): stdLib.Promise[js.Array[DataSource]] = js.native
  /** Fetches the collection of filters used on the sheet. */
  def getFiltersAsync(): stdLib.Promise[js.Array[Filter]] = js.native
  /** Returns the Dashboard object to which this Worksheet belongs (if it’s on a dashboard). Otherwise, it returns null. */
  def getParentDashboard(): Dashboard = js.native
  /**
           * Returns the StoryPoint object to which this Worksheet belongs (if it’s on a story sheet).
           * Otherwise, it returns null. If the Worksheet instance does not come from a call to StoryPoint.getContainedSheet(), it also returns null.
           */
  def getParentStoryPoint(): StoryPoint = js.native
  /** Gets the collection of marks that are currently selected. */
  def getSelectedMarksAsync(): stdLib.Promise[js.Array[Mark]] = js.native
  /**
           * Gets aggregated data for the fields used in the currently active sheet and returns it as an object.
           * You can specify options with an optional parameter. This can only be called on sheets of the WORKSHEET type.
           */
  def getSummaryDataAsync(options: getSummaryDataOptions): stdLib.Promise[DataTable] = js.native
  /**
           * Gets data for all fields in the data source used by the currently active sheet and returns it as an object.
           * You can specify options with an optional parameter. This can only be called on sheets of the WORKSHEET type.
           */
  def getUnderlyingDataAsync(options: getUnderlyingDataOptions): stdLib.Promise[DataTable] = js.native
  /** Selects the marks and returns them. */
  def selectMarksAsync(fieldName: java.lang.String, value: js.Array[js.Object], updateType: SelectionUpdateType): stdLib.Promise[scala.Unit] = js.native
  /** Selects the marks and returns them. */
  def selectMarksAsync(fieldName: java.lang.String, value: js.Object, updateType: SelectionUpdateType): stdLib.Promise[scala.Unit] = js.native
  /**
           * Allows selection based on this syntax for the first parameter:
           * {
           *   "Field1": value,
           *   "Field2": [1, 2, 3]
           * }
           */
  def selectMarksAsync(fieldValuesMap: js.Array[Mark], updateType: SelectionUpdateType): stdLib.Promise[scala.Unit] = js.native
  /**
           * Allows selection based on this syntax for the first parameter:
           * {
           *   "Field1": value,
           *   "Field2": [1, 2, 3]
           * }
           */
  def selectMarksAsync(fieldValuesMap: js.Object, updateType: SelectionUpdateType): stdLib.Promise[scala.Unit] = js.native
}
