package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Config extends js.Object {
  /** DO autosize once regardless of layout.autosize (use default width or height values otherwise) */
  var autosizable: scala.Boolean
  /** display the mode bar (true, false, or 'hover') */
  var displayModeBar: plotlyDotJsLib.plotlyDotJsLibStrings.hover | scala.Boolean
  /** add the plotly logo on the end of the mode bar */
  var displaylogo: scala.Boolean
  /** double click interaction (false, 'reset', 'autosize' or 'reset+autosize') */
  var doubleClick: plotlyDotJsLib.plotlyDotJsLibStrings.`reset+autosize` | plotlyDotJsLib.plotlyDotJsLibStrings.reset | plotlyDotJsLib.plotlyDotJsLibStrings.autosize | plotlyDotJsLib.plotlyDotJsLibNumbers.`false`
  /** we can edit titles, move annotations, etc */
  var editable: scala.Boolean
  var edits: stdLib.Partial[Edits]
  /** if we DO autosize, do we fill the container or the screen? */
  var fillFrame: scala.Boolean
  /** if we DO autosize, set the frame margins in percents of plot size */
  var frameMargins: scala.Double
  /** Set global transform to be applied to all traces with no specification needed */
  var globalTransforms: js.Array[_]
  /** text appearing in the sendData link */
  var linkText: java.lang.String
  /** Which localization should we use? Should be a string like 'en' or 'en-US' */
  var locale: java.lang.String
  /**
  	 * Turn all console logging on or off (errors will be thrown)
  	 * This should ONLY be set via Plotly.setPlotConfig
  	 */
  var logging: scala.Boolean | plotlyDotJsLib.plotlyDotJsLibNumbers.`0` | plotlyDotJsLib.plotlyDotJsLibNumbers.`1` | plotlyDotJsLib.plotlyDotJsLibNumbers.`2`
  /**
  	 * Mapbox access token (required to plot mapbox trace types)
  	 * If using an Mapbox Atlas server, set this option to '',
  	 * so that plotly.js won't attempt to authenticate to the public Mapbox server.
  	 */
  var mapboxAccessToken: java.lang.String
  /**
  	 * fully custom mode bar buttons as nested array, where the outer
  	 * arrays represents button groups, and the inner arrays have
  	 * buttons config objects or names of default buttons
  	 * (see ./components/modebar/buttons.js for more info)
  	 */
  var modeBarButtons: js.Array[js.Array[ModeBarDefaultButtons]] | js.Array[js.Array[ModeBarButton]] | plotlyDotJsLib.plotlyDotJsLibNumbers.`false`
  /** add mode bar button using config objects (see ./components/modebar/buttons.js for list of arguments) */
  var modeBarButtonsToAdd: js.Array[ModeBarDefaultButtons] | js.Array[ModeBarButton]
  /** remove mode bar button by name (see ./components/modebar/buttons.js for the list of names) */
  var modeBarButtonsToRemove: js.Array[ModeBarDefaultButtons]
  /** increase the pixel ratio for Gl plot images */
  var plotGlPixelRatio: scala.Double
  /** set the length of the undo/redo queue */
  var queueLength: scala.Double
  /** Make the chart responsive to window size */
  var responsive: scala.Boolean
  /** mousewheel or two-finger scroll zooms the plot */
  var scrollZoom: scala.Boolean
  /** if we show a link, does it contain data or just link to a plotly file? */
  var sendData: scala.Boolean
  /**
  	 * function to add the background color to a different container
  	 * or 'opaque' to ensure there's white behind it
  	 */
  var setBackground: java.lang.String | plotlyDotJsLib.plotlyDotJsLibStrings.opaque | plotlyDotJsLib.plotlyDotJsLibStrings.transparent
  /** enable axis pan/zoom drag handles */
  var showAxisDragHandles: scala.Boolean
  /** enable direct range entry at the pan/zoom drag points (drag handles must be enabled above) */
  var showAxisRangeEntryBoxes: scala.Boolean
  /** link to open this plot in plotly */
  var showLink: scala.Boolean
  /** false or function adding source(s) to linkText <text> */
  var showSources: scala.Boolean
  /** new users see some hints about interactivity */
  var showTips: scala.Boolean
  /** no interactivity, for export or image generation */
  var staticPlot: scala.Boolean
  /** URL to topojson files used in geo charts */
  var topojsonURL: java.lang.String
}
