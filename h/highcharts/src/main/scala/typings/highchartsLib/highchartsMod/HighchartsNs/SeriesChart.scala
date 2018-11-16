package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * General options for all series types.
     */

trait SeriesChart extends js.Object {
  /**
           * Allow this series' points to be selected by clicking on the markers, bars or pie slices.
           * @default false
           * @since 1.2.0
           */
  var allowPointSelect: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Enable or disable the initial animation when a series is displayed. The animation can also be set as a
           * configuration object. Please note that this option only applies to the initial animation of the series itself.
           * For other animations, see chart.animation and the animation parameter under the API methods.
           * @default true
           */
  var animation: js.UndefOr[scala.Boolean | Animation] = js.undefined
  /**
           * A class name to apply to the series' graphical elements.
           * @since 5.0.0
           */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The main color or the series. In line type series it applies to the line and the point markers unless otherwise
           * specified. In bar type series it applies to the bars unless a color is specified per point. The default value is
           * pulled from the options.colors array.
           */
  var color: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
           * Polar charts only. Whether to connect the ends of a line series plot across the extremes.
           * @default true
           * @since 2.3.0
           */
  var connectEnds: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether to connect a graph line across null points.
           * @default false
           */
  var connectNulls: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When the series contains less points than the crop threshold, all points are drawn, event if the points fall
           * outside the visible plot area at the current zoom. The advantage of drawing all points (including markers and
           * columns), is that animation is performed on updates. On the other hand, when the series contains more points than
           * the crop threshold, the series data is cropped to only contain points that fall within the plot area. The
           * advantage of cropping away invisible points is to increase performance on large series.
           * @default 300
           * @since 2.2
           */
  var cropThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
           * You can set the cursor to 'pointer' if you have click events attached to the series, to signal to the user that
           * the points and lines can be clicked.
           */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /**
           * A name for the dash style to use for the graph. Applies only to series type having a graph, like line, spline,
           * area and scatter in case it has a lineWidth. The value for the dashStyle include:
           * - Solid
           * - ShortDash
           * - ShortDot
           * - ShortDashDot
           * - ShortDashDotDot
           * - Dot
           * - Dash
           * - LongDash
           * - DashDot
           * - LongDashDot
           * - LongDashDotDot
           * @default 'Solid'
           */
  var dashStyle: js.UndefOr[java.lang.String] = js.undefined
  var dataLabels: js.UndefOr[DataLabels] = js.undefined
  /**
           * Enable or disable the mouse tracking for a specific series. This includes point tooltips and click events on
           * graphs and points. For large datasets it improves performance.
           * @default true
           */
  var enableMouseTracking: js.UndefOr[scala.Boolean] = js.undefined
  var events: js.UndefOr[PlotEvents] = js.undefined
  /**
           * Determines whether the series should look for the nearest point in both dimensions or just the x-dimension when
           * hovering the series. Defaults to 'xy' for scatter series and 'x' for most other series. If the data has duplicate
           * x-values, it is recommended to set this to 'xy' to allow hovering over all points.
           *
           * Applies only to series types using nearest neighbor search (not direct hover) for tooltip.
           * @since 5.0.10
           */
  var findNearestPointBy: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Whether to use the Y extremes of the total chart width or only the zoomed area when zooming in on parts of the X
           * axis. By default, the Y axis adjusts to the min and max of the visible data. Cartesian series only.
           * @default false
           * @since 4.1.6
           */
  var getExtremesFromAll: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * An array specifying which option maps to which key in the data point array. This makes it convenient to work with
           * unstructured data arrays from different sources.
           * @since 4.1.6
           */
  var keys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Pixel with of the graph line.
           * @default 2
           */
  var lineWidth: js.UndefOr[scala.Double] = js.undefined
  /**
           * The line cap used for line ends and line joins on the graph.
           * @default 'round'
           */
  var linecap: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The id of another series to link to. Additionally, the value can be ':previous' to link to the previous series.
           * When two series are linked, only the first one appears in the legend. Toggling the visibility of this also
           * toggles the linked series.
           * @since 3.0
           */
  var linkedTo: js.UndefOr[java.lang.String] = js.undefined
  var marker: js.UndefOr[Marker] = js.undefined
  /**
           * The color for the parts of the graph or points that are below the threshold.
           * @default null.
           * @since 3.0
           */
  var negativeColor: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var point: js.UndefOr[highchartsLib.Anon_Events] = js.undefined
  /**
           * If no x values are given for the points in a series, pointInterval defines the interval of the x values. For
           * example, if a series contains one value every decade starting from year 0, set pointInterval to 10.
           *
           * Since Highcharts 4.1, it can be combined with pointIntervalUnit to draw irregular intervals.
           * @default 1
           */
  var pointInterval: js.UndefOr[scala.Double] = js.undefined
  /**
           * On datetime series, this allows for setting the pointInterval to the two irregular time units, month and year.
           * Combine it with pointInterval to draw quarters, 6 months, 10 years etc.
           * @since 4.1.0
           */
  var pointIntervalUnit: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Possible values: null, 'on', 'between'.
           *
           * In a column chart, when pointPlacement is 'on', the point will not create any padding of the X axis. In a polar
           * column chart this means that the first column points directly north. If the pointPlacement is 'between', the
           * columns will be laid out between ticks. This is useful for example for visualising an amount between two points
           * in time or in a certain sector of a polar chart.
           *
           * Since Highcharts 3.0.2, the point placement can also be numeric, where 0 is on the axis value, -0.5 is between
           * this value and the previous, and 0.5 is between this value and the next. Unlike the textual options, numeric
           * point placement options won't affect axis padding.
           *
           * Note that pointPlacement needs a pointRange to work. For column series this is computed, but for line-type series
           * it needs to be set.
           *
           * Defaults to null in cartesian charts, 'between' in polar charts.
           * @since 2.3.0
           */
  var pointPlacement: js.UndefOr[java.lang.String | scala.Double | scala.Null] = js.undefined
  /**
           * If no x values are given for the points in a series, pointStart defines on what value to start. For example, if a
           * series contains one yearly value starting from 1945, set pointStart to 1945.
           * @default 0
           */
  var pointStart: js.UndefOr[scala.Double] = js.undefined
  /**
           * Whether to select the series initially. If showCheckbox is true, the checkbox next to the series name will be
           * checked for a selected series.
           * @default false
           * @since 1.2.0
           */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow can be an object configuration containing
           * color, offsetX, offsetY, opacity and width.
           * @default false
           */
  var shadow: js.UndefOr[scala.Boolean | Shadow] = js.undefined
  /**
           * If true, a checkbox is displayed next to the legend item to allow selecting the series. The state of the checkbox
           * is determined by the selected option.
           * @default false
           * @since 1.2.0
           */
  var showCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether to display this particular series or series type in the legend. The default value is true for standalone
           * series, false for linked series. Defaults to true.
           */
  var showInLegend: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * When this is true, the series will not cause the Y axis to cross the zero plane (or threshold option) unless the
           * data actually crosses the plane.
           *
           * For example, if softThreshold is false, a series of 0, 1, 2, 3 will make the Y axis show negative values
           * according to the minPadding option. If softThreshold is true, the Y axis starts at 0.
           * @default true
           * @since 4.1.9
           */
  var softThreshold: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether to stack the values of each series on top of each other. Possible values are null to disable, 'normal' to
           * stack by value or 'percent'.
           */
  var stacking: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
           * A wrapper object for all the series options in specific states.
           */
  var states: js.UndefOr[highchartsLib.Anon_HoverLineStates] = js.undefined
  /**
           * Sticky tracking of mouse events. When true, the mouseOut event on a series isn't triggered until the mouse moves
           * over another series, or out of the plot area. When false, the mouseOut event on a series is triggered when the
           * mouse leaves the area around the series' graph or markers. This also implies the tooltip. When stickyTracking is
           * false and tooltip.shared is false, the tooltip will be hidden when moving the mouse between series. Defaults to
           * true for line and area type series, but to false for columns, pies etc.
           * @default true
           * @since 2.0
           */
  var stickyTracking: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The Y axis value to serve as the base for the area, for distinguishing between values above and below a
           * threshold. If null, the area behaves like a line series with fill between the graph and the Y axis minimum.
           * @default 0
           * @since 2.0
           */
  var threshold: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /**
           * A configuration object for the tooltip rendering of each single series. Properties are inherited from tooltip,
           * but only the following properties can be defined on a series level.
           * @since 2.3
           */
  var tooltip: js.UndefOr[SeriesTooltipOptions] = js.undefined
  /**
           * When a series contains a data array that is longer than this, only one dimensional arrays of numbers, or two
           * dimensional arrays with x and y values are allowed. Also, only the first point is tested, and the rest are
           * assumed to be the same format. This saves expensive data checking and indexing in long series. Set it to 0
           * disable.
           * @default 1000
           * @since 2.2
           */
  var turboThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
           * Set the initial visibility of the series.
           * @default true
           */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Defines the Axis on which the zones are applied.
           * @default 'y'
           * @since 4.1.0
           */
  var zoneAxis: js.UndefOr[java.lang.String] = js.undefined
  /**
           * An array defining zones within a series. Zones can be applied to the X axis, Y axis or Z axis for bubbles,
           * according to the zoneAxis option.
           */
  var zones: js.UndefOr[js.Array[AreaZone]] = js.undefined
}
