package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// this list is "complete" in that it contains every SVG attribute
// that React supports, but the types can be improved.
// Full list here: https://facebook.github.io/react/docs/dom-elements.html
//
// The three broad type categories are (in order of restrictiveness):
//   - "number | string"
//   - "string"
//   - union of string literals

trait SVGAttributes[T] extends DOMAttributes[T] {
  // SVG Specific attributes
  var accentHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var accumulate: js.UndefOr[reactLib.reactLibStrings.none | reactLib.reactLibStrings.sum] = js.undefined
  var additive: js.UndefOr[reactLib.reactLibStrings.replace | reactLib.reactLibStrings.sum] = js.undefined
  var alignmentBaseline: js.UndefOr[
    reactLib.reactLibStrings.auto | reactLib.reactLibStrings.baseline | reactLib.reactLibStrings.`before-edge` | reactLib.reactLibStrings.`text-before-edge` | reactLib.reactLibStrings.middle | reactLib.reactLibStrings.central | reactLib.reactLibStrings.`after-edge` | reactLib.reactLibStrings.`text-after-edge` | reactLib.reactLibStrings.ideographic | reactLib.reactLibStrings.alphabetic | reactLib.reactLibStrings.hanging | reactLib.reactLibStrings.mathematical | reactLib.reactLibStrings.inherit
  ] = js.undefined
  var allowReorder: js.UndefOr[reactLib.reactLibStrings.no | reactLib.reactLibStrings.yes] = js.undefined
  var alphabetic: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var amplitude: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var arabicForm: js.UndefOr[
    reactLib.reactLibStrings.initial | reactLib.reactLibStrings.medial | reactLib.reactLibStrings.terminal | reactLib.reactLibStrings.isolated
  ] = js.undefined
  var ascent: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var attributeName: js.UndefOr[java.lang.String] = js.undefined
  var attributeType: js.UndefOr[java.lang.String] = js.undefined
  var autoReverse: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var azimuth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var baseFrequency: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var baseProfile: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var baselineShift: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var bbox: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var begin: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var bias: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var by: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var calcMode: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var capHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  // Attributes which also defined in HTMLAttributes
  // See comment in SVGDOMPropertyConfig.js
  var className: js.UndefOr[java.lang.String] = js.undefined
  var clip: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var clipPath: js.UndefOr[java.lang.String] = js.undefined
  var clipPathUnits: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var clipRule: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var colorInterpolation: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var colorInterpolationFilters: js.UndefOr[
    reactLib.reactLibStrings.auto | reactLib.reactLibStrings.sRGB | reactLib.reactLibStrings.linearRGB | reactLib.reactLibStrings.inherit
  ] = js.undefined
  var colorProfile: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var colorRendering: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var contentScriptType: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var contentStyleType: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var cursor: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var cx: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var cy: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var d: js.UndefOr[java.lang.String] = js.undefined
  var decelerate: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var descent: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var diffuseConstant: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var direction: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var display: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var divisor: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var dominantBaseline: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var dur: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var dx: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var dy: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var edgeMode: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var elevation: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var enableBackground: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var end: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var exponent: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var externalResourcesRequired: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var fill: js.UndefOr[java.lang.String] = js.undefined
  var fillOpacity: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var fillRule: js.UndefOr[
    reactLib.reactLibStrings.nonzero | reactLib.reactLibStrings.evenodd | reactLib.reactLibStrings.inherit
  ] = js.undefined
  var filter: js.UndefOr[java.lang.String] = js.undefined
  var filterRes: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var filterUnits: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var floodColor: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var floodOpacity: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var focusable: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  var fontSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var fontSizeAdjust: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var fontStretch: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var fontStyle: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var fontVariant: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var fontWeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var format: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var from: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var fx: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var fy: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var g1: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var g2: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var glyphName: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var glyphOrientationHorizontal: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var glyphOrientationVertical: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var glyphRef: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var gradientTransform: js.UndefOr[java.lang.String] = js.undefined
  var gradientUnits: js.UndefOr[java.lang.String] = js.undefined
  var hanging: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var horizAdvX: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var horizOriginX: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var ideographic: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var imageRendering: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var in: js.UndefOr[java.lang.String] = js.undefined
  var in2: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var intercept: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var k: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var k1: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var k2: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var k3: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var k4: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var kernelMatrix: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var kernelUnitLength: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var kerning: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var keyPoints: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var keySplines: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var keyTimes: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var lengthAdjust: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var letterSpacing: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var lightingColor: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var limitingConeAngle: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var local: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var markerEnd: js.UndefOr[java.lang.String] = js.undefined
  var markerHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var markerMid: js.UndefOr[java.lang.String] = js.undefined
  var markerStart: js.UndefOr[java.lang.String] = js.undefined
  var markerUnits: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var markerWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var mask: js.UndefOr[java.lang.String] = js.undefined
  var maskContentUnits: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var maskUnits: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var mathematical: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var max: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var media: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var min: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var mode: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var numOctaves: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var offset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var opacity: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var operator: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var order: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var orient: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var orientation: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var origin: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var overflow: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var overlinePosition: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var overlineThickness: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var paintOrder: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var panose1: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var pathLength: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var patternContentUnits: js.UndefOr[java.lang.String] = js.undefined
  var patternTransform: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var patternUnits: js.UndefOr[java.lang.String] = js.undefined
  var pointerEvents: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var points: js.UndefOr[java.lang.String] = js.undefined
  var pointsAtX: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var pointsAtY: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var pointsAtZ: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var preserveAlpha: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var preserveAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var primitiveUnits: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var r: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var radius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var refX: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var refY: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var renderingIntent: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var repeatCount: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var repeatDur: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var requiredExtensions: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var requiredFeatures: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var restart: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var result: js.UndefOr[java.lang.String] = js.undefined
  // Other HTML properties supported by SVG elements in browsers
  var role: js.UndefOr[java.lang.String] = js.undefined
  var rotate: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var rx: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var ry: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var scale: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var seed: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var shapeRendering: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var slope: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var spacing: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var specularConstant: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var specularExponent: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var speed: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var spreadMethod: js.UndefOr[java.lang.String] = js.undefined
  var startOffset: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var stdDeviation: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var stemh: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var stemv: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var stitchTiles: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var stopColor: js.UndefOr[java.lang.String] = js.undefined
  var stopOpacity: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var strikethroughPosition: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var strikethroughThickness: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var string: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var stroke: js.UndefOr[java.lang.String] = js.undefined
  var strokeDasharray: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var strokeDashoffset: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var strokeLinecap: js.UndefOr[
    reactLib.reactLibStrings.butt | reactLib.reactLibStrings.round | reactLib.reactLibStrings.square | reactLib.reactLibStrings.inherit
  ] = js.undefined
  var strokeLinejoin: js.UndefOr[
    reactLib.reactLibStrings.miter | reactLib.reactLibStrings.round | reactLib.reactLibStrings.bevel | reactLib.reactLibStrings.inherit
  ] = js.undefined
  var strokeMiterlimit: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var strokeOpacity: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var strokeWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var surfaceScale: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var systemLanguage: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var tableValues: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var targetX: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var targetY: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var textAnchor: js.UndefOr[java.lang.String] = js.undefined
  var textDecoration: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var textLength: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var textRendering: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var to: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var transform: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var u1: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var u2: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var underlinePosition: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var underlineThickness: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var unicode: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var unicodeBidi: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var unicodeRange: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var unitsPerEm: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var vAlphabetic: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var vHanging: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var vIdeographic: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var vMathematical: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var values: js.UndefOr[java.lang.String] = js.undefined
  var vectorEffect: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var vertAdvY: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var vertOriginX: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var vertOriginY: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var viewBox: js.UndefOr[java.lang.String] = js.undefined
  var viewTarget: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var visibility: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var widths: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var wordSpacing: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var writingMode: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var x: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var x1: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var x2: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var xChannelSelector: js.UndefOr[java.lang.String] = js.undefined
  var xHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var xlinkActuate: js.UndefOr[java.lang.String] = js.undefined
  var xlinkArcrole: js.UndefOr[java.lang.String] = js.undefined
  var xlinkHref: js.UndefOr[java.lang.String] = js.undefined
  var xlinkRole: js.UndefOr[java.lang.String] = js.undefined
  var xlinkShow: js.UndefOr[java.lang.String] = js.undefined
  var xlinkTitle: js.UndefOr[java.lang.String] = js.undefined
  var xlinkType: js.UndefOr[java.lang.String] = js.undefined
  var xmlBase: js.UndefOr[java.lang.String] = js.undefined
  var xmlLang: js.UndefOr[java.lang.String] = js.undefined
  var xmlSpace: js.UndefOr[java.lang.String] = js.undefined
  var xmlns: js.UndefOr[java.lang.String] = js.undefined
  var xmlnsXlink: js.UndefOr[java.lang.String] = js.undefined
  var y: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var y1: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var y2: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var yChannelSelector: js.UndefOr[java.lang.String] = js.undefined
  var z: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var zoomAndPan: js.UndefOr[java.lang.String] = js.undefined
}
