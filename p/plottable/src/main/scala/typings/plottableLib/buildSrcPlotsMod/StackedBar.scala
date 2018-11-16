package typings
package plottableLib.buildSrcPlotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots", "StackedBar")
@js.native
class StackedBar[X, Y] ()
  extends plottableLib.buildSrcPlotsStackedBarPlotMod.StackedBar[X, Y] {
  /**
       * A StackedBar Plot stacks bars across Datasets based on the primary value of the bars.
       *   On a vertical StackedBar Plot, the bars with the same X value are stacked.
       *   On a horizontal StackedBar Plot, the bars with the same Y value are stacked.
       *
       * @constructor
       * @param {Scale} xScale
       * @param {Scale} yScale
       * @param {string} [orientation="vertical"] One of "vertical"/"horizontal".
       */
  def this(orientation: plottableLib.buildSrcPlotsBarPlotMod.BarOrientation) = this()
}

@JSImport("plottable/build/src/plots", "StackedBar")
@js.native
object StackedBar extends js.Object {
  var _EXTREMA_LABEL_MARGIN_FROM_BAR: scala.Double = js.native
}
