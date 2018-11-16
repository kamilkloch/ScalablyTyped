package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BatchUpdateValuesRequest extends js.Object {
  /** The new values to apply to the spreadsheet. */
  var data: js.UndefOr[js.Array[ValueRange]] = js.undefined
  /**
               * Determines if the update response should include the values
               * of the cells that were updated. By default, responses
               * do not include the updated values. The `updatedData` field within
               * each of the BatchUpdateValuesResponse.responses will contain
               * the updated values. If the range to write was larger than than the range
               * actually written, the response will include all values in the requested
               * range (excluding trailing empty rows and columns).
               */
  var includeValuesInResponse: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Determines how dates, times, and durations in the response should be
               * rendered. This is ignored if response_value_render_option is
               * FORMATTED_VALUE.
               * The default dateTime render option is
               * DateTimeRenderOption.SERIAL_NUMBER.
               */
  var responseDateTimeRenderOption: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Determines how values in the response should be rendered.
               * The default render option is ValueRenderOption.FORMATTED_VALUE.
               */
  var responseValueRenderOption: js.UndefOr[java.lang.String] = js.undefined
  /** How the input data should be interpreted. */
  var valueInputOption: js.UndefOr[java.lang.String] = js.undefined
}
