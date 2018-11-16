package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * NxPivotPage...
     */

trait INxPivotPage extends js.Object {
  /**
           * Size and offset of the data in the matrix.
           */
  var qArea: IRect
  /**
           * Array of data.
           */
  var qData: js.Array[INxPivotValuePoint]
  /**
           * Information about the left dimension values of a pivot table.
           */
  var qLeft: js.Array[INxPivotDimensionCell]
  /**
           * Information about the top dimension values of a pivot table.
           * If there is no top dimension in the pivot table, information about the measures are given.
           */
  var qTop: js.Array[INxPivotDimensionCell]
}
