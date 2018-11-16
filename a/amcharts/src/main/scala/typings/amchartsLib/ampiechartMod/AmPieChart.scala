package typings
package amchartsLib.ampiechartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmPieChart
  extends amchartsLib.amchartMod.default {
  /**
       * Name of the field in chart's dataProvider which holds slice's alpha.
       */
  var alphaField: java.lang.String = js.native
  /**
       * Pie lean angle (for 3D effect). Valid range is 0 - 90.
       */
  var angle: scala.Double = js.native
  /**
       * Balloon text. The following tags can be used:
       * [[value]], [[title]], [[percents]], [[description]]. [[title]]: [[percents]]% ([[value]])\n[[description]]
       */
  var balloonText: java.lang.String = js.native
  /**
       * Read-only. Array of Slice objects.
       */
  var chartData: js.Array[_] = js.native
  /**
       * Name of the field in chart's dataProvider which holds slice's color.
       */
  var colorField: java.lang.String = js.native
  /**
       * Specifies the colors of the slices, if the slice color is not set.
       * If there are more slices than colors in this array, the chart picks random color.
       * [
       * "#FF0F00", "#FF6600", "#FF9E01", "#FCD202", "#F8FF01", "#B0DE09", "#04D215", "#0D8ECF",
       * "#0D52D1", "#2A0CD0", "#8A0CCF", "#CD0D74", "#754DEB", "#DDDDDD", "#999999", "#333333",
       * "#000000", "#57032A", "#CA9726", "#990000", "#4B0C25"
       * ]
       */
  var colors: js.Array[_] = js.native
  /**
       * Depth of the pie (for 3D effect).
       */
  var depth3D: scala.Double = js.native
  /**
       * Name of the field in chart's dataProvider which holds a string with description.
       */
  var descriptionField: java.lang.String = js.native
  /**
       * Example: [-0.2,0.2]. Will make slices to be filled with color gradients.
       */
  var gradientRatio: js.Array[scala.Double] = js.native
  /**
       * If there is more than one slice whose percentage of the pie is less than this number,
       * those slices will be grouped together into one slice.
       * This is the "other" slice. It will always be the last slice in a pie.
       */
  var groupPercent: scala.Double = js.native
  /**
       * Opacity of the group slice. Value range is 0 - 1.
       * @default 1
       */
  var groupedAlpha: scala.Double = js.native
  /**
       * Color of the group slice. The default value is not set -
       * this means the next available color from "colors" array will be used.
       */
  var groupedColor: java.lang.String = js.native
  /**
       * Description of the group slice.
       */
  var groupedDescription: java.lang.String = js.native
  /**
       * If this is set to true, the group slice will be pulled out when the chart loads.
       */
  var groupedPulled: scala.Boolean = js.native
  /**
       * Title of the group slice. Other
       */
  var groupedTitle: java.lang.String = js.native
  /**
       * Slices with percent less then hideLabelsPercent won't display labels.
       * This is useful to avoid cluttering up the chart, if you have a lot of small slices.
       * 0 means all labels will be shown.
       */
  var hideLabelsPercent: scala.Double = js.native
  /**
       * Opacity of a hovered slice. Value range is 0 - 1.
       * @default 1
       */
  var hoverAlpha: scala.Double = js.native
  /**
       * Inner radius of the pie, in pixels or percents.
       */
  var innerRadius: js.Any = js.native
  /**
       * The distance between the label and the slice, in pixels.
       * You can use negative values to put the label on the slice.
       * @default 30
       */
  var labelRadius: scala.Double = js.native
  /**
       * Name of the field in dataProvider which specifies the length of a tick.
       * Note, the chart will not try to arrange labels automatically if this property is set.
       */
  var labelRadiusField: java.lang.String = js.native
  /**
       * Label text. The following tags can be used:
       * [[value]], [[title]], [[percents]], [[description]]. [[title]]: [[percents]]%
       */
  var labelText: java.lang.String = js.native
  /**
       * Label tick opacity. Value range is 0 - 1. 0.2
       */
  var labelTickAlpha: scala.Double = js.native
  /**
       * Label tick color. #000000
       */
  var labelTickColor: java.lang.String = js.native
  /**
       * Specifies whether data labels are visible.
       * @default true
       */
  var labelsEnabled: scala.Boolean = js.native
  /**
       * Bottom margin of the chart.
       * @default 5
       */
  var marginBottom: scala.Double = js.native
  /**
       * Left margin of the chart.
       */
  var marginLeft: scala.Double = js.native
  /**
       * Right margin of the chart.
       */
  var marginRight: scala.Double = js.native
  /**
       * Top margin of the chart.
       * @default 5
       */
  var marginTop: scala.Double = js.native
  /**
       * Minimum radius of the pie, in pixels.
       * @default 10
       */
  var minRadius: scala.Double = js.native
  /**
       * Pie outline opacity. Value range is 0 - 1.
       */
  var outlineAlpha: scala.Double = js.native
  /**
       * Pie outline color. #FFFFFF
       */
  var outlineColor: java.lang.String = js.native
  /**
       * Pie outline thickness.
       * @default 1
       */
  var outlineThickness: scala.Double = js.native
  /**
       * Opacity of the slices. You can set the opacity of individual slice too.
       * @default 1
       */
  var pieAlpha: scala.Double = js.native
  /**
       * Color of the first slice. All the other will be colored with darker or brighter colors.
       */
  var pieBaseColor: java.lang.String = js.native
  /**
       * Lightness increase of each subsequent slice. This is only useful if pieBaseColor is set.
       * Use negative values for darker colors. Value range is from -255 to 255.
       * @default 30
       */
  var pieBrightnessStep: scala.Double = js.native
  /**
       * You can set fixed position of a pie center, in pixels or in percents.
       */
  var pieX: js.Any = js.native
  /**
       * You can set fixed position of a pie center, in pixels or in percents.
       */
  var pieY: js.Any = js.native
  /**
       * Pull out duration, in seconds.
       * @default 1
       */
  var pullOutDuration: scala.Double = js.native
  /**
       * Pull out effect. Possible values are ">", "<", elastic" and "bounce". bounce
       */
  var pullOutEffect: java.lang.String = js.native
  /**
       * If this is set to true, only one slice can be pulled out at a time.
       * If the viewer clicks on a slice, any other pulled-out slice will be pulled in.
       */
  var pullOutOnlyOne: scala.Boolean = js.native
  /**
       * Pull out radius, in pixels or percents 0.2
       */
  var pullOutRadius: js.Any = js.native
  /**
       * Name of the field in chart's dataProvider which holds a boolean value
       * telling the chart whether this slice must be pulled or not.
       */
  var pulledField: java.lang.String = js.native
  /**
       * Radius of a pie, in pixels or percents. By default, radius is calculated automatically.
       */
  var radius: js.Any = js.native
  /**
       * Specifies whether the animation should be sequenced or all slices should appear at once.
       */
  var sequencedAnimation: scala.Boolean = js.native
  /**
       * Initial opacity of all slices. If you set startDuration higher than 0, slices will fade in from startAlpha.
       * @default 1
       */
  var startAlpha: scala.Double = js.native
  /**
       * Angle of the first slice, in degrees. This will work properly only if "depth3D" is set to 0.
       * If "depth3D" is greater than 0, then there can be two angles only: 90 and 270. Value range is 0-360.
       * @default 90
       */
  var startAngle: scala.Double = js.native
  /**
       * Duration of the animation, in seconds.
       * @default 1
       */
  var startDuration: scala.Double = js.native
  /**
       * Animation effect. Possible values are ">", "<", "elastic" and "bounce". bounce
       */
  var startEffect: java.lang.String = js.native
  /**
       * Radius of the positions from which the slices will fly in.
       * @default 5
       */
  var startRadius: js.Any = js.native
  /**
       * Name of the field in chart's dataProvider which holds slice's title.
       */
  var titleField: java.lang.String = js.native
  /**
       * Name of the field in chart's dataProvider
       * which holds url which would be accessed if the user clicks on a slice.
       */
  var urlField: java.lang.String = js.native
  /**
       * If url is specified for a slice, it will be opened when user clicks on it.
       * urlTarget specifies target of this url. Use _blank if you want url to be opened in a new window. _self
       */
  var urlTarget: java.lang.String = js.native
  /**
       * Name of the field in chart's dataProvider which holds slice's value.
       */
  var valueField: java.lang.String = js.native
  /**
       * Name of the field in chart's dataProvider which holds boolean variable
       * defining whether this data item should have an entry in the legend.
       */
  var visibleInLegendField: java.lang.String = js.native
  /**
       * You can trigger the animation of the pie chart.
       */
  def animateAgain(): scala.Unit = js.native
  /**
       * You can trigger the click on a slice from outside. index - the number of a slice or Slice object.
       */
  def clickSlice(index: scala.Double): scala.Unit = js.native
  /**
       * Hides slice. index - the number of a slice or Slice object.
       */
  def hideSlice(index: scala.Double): scala.Unit = js.native
  /**
       * You can simulate roll-out of a slice from outside. index - the number of a slice or Slice object.
       */
  def rollOutSlice(index: scala.Double): scala.Unit = js.native
  /**
       * You can simulate roll-over a slice from outside. index - the number of a slice or Slice object.
       */
  def rollOverSlice(index: scala.Double): scala.Unit = js.native
  /**
       * Shows slice. index - the number of a slice or Slice object.
       */
  def showSlice(index: scala.Double): scala.Unit = js.native
}
