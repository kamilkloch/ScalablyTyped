package typings
package plottableLib.buildSrcPlotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots", "Bar")
@js.native
class Bar[X, Y] ()
  extends plottableLib.buildSrcPlotsBarPlotMod.Bar[X, Y] {
  /**
       * A Bar Plot draws bars growing out from a baseline to some value
       *
       * @constructor
       * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
       */
  def this(orientation: plottableLib.buildSrcPlotsBarPlotMod.BarOrientation) = this()
}

@JSImport("plottable/build/src/plots", "Bar")
@js.native
object Bar extends js.Object {
  var _BAR_AREA_CLASS: js.Any = js.native
  var _BAR_END_KEY: js.Any = js.native
  var _BAR_GAPLESS_THRESHOLD_PX: scala.Double = js.native
  var _BAR_THICKNESS_KEY: java.lang.String = js.native
  var _BAR_THICKNESS_RATIO: scala.Double = js.native
  var _LABEL_AREA_CLASS: java.lang.String = js.native
  /**
       * In the case of "start" or "end" LabelPositions, put the label this many px away
       * from the bar's length distance edge
       */
  var _LABEL_MARGIN_INSIDE_BAR: scala.Double = js.native
  var _SINGLE_BAR_DIMENSION_RATIO: scala.Double = js.native
}
