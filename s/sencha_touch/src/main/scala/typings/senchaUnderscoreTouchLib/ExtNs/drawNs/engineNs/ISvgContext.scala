package typings
package senchaUnderscoreTouchLib.ExtNs.drawNs.engineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISvgContext
  extends senchaUnderscoreTouchLib.ExtNs.IBase {
  /** [Method] Adds points to the subpath such that the arc described by the circumference of the circle described by the arguments
  		* @param x Number
  		* @param y Number
  		* @param radius Number
  		* @param startAngle Number
  		* @param endAngle Number
  		* @param anticlockwise Number
  		*/
  var arc: js.UndefOr[
    js.Function6[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* radius */ js.UndefOr[scala.Double], 
      /* startAngle */ js.UndefOr[scala.Double], 
      /* endAngle */ js.UndefOr[scala.Double], 
      /* anticlockwise */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Arc command using svg parameters
  		* @param r1 Number
  		* @param r2 Number
  		* @param rotation Number
  		* @param large Number
  		* @param swipe Number
  		* @param x2 Number
  		* @param y2 Number
  		*/
  var arcSvg: js.UndefOr[
    js.Function7[
      /* r1 */ js.UndefOr[scala.Double], 
      /* r2 */ js.UndefOr[scala.Double], 
      /* rotation */ js.UndefOr[scala.Double], 
      /* large */ js.UndefOr[scala.Double], 
      /* swipe */ js.UndefOr[scala.Double], 
      /* x2 */ js.UndefOr[scala.Double], 
      /* y2 */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Adds an arc with the given control points and radius to the current subpath connected to the previous point by a str
  		* @param x1 Number
  		* @param y1 Number
  		* @param x2 Number
  		* @param y2 Number
  		* @param radiusX Number
  		* @param radiusY Number
  		* @param rotation Number
  		*/
  var arcTo: js.UndefOr[
    js.Function7[
      /* x1 */ js.UndefOr[scala.Double], 
      /* y1 */ js.UndefOr[scala.Double], 
      /* x2 */ js.UndefOr[scala.Double], 
      /* y2 */ js.UndefOr[scala.Double], 
      /* radiusX */ js.UndefOr[scala.Double], 
      /* radiusY */ js.UndefOr[scala.Double], 
      /* rotation */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Resets the current default path  */
  var beginPath: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Adds the given point to the current subpath connected to the previous one by a cubic B zier curve with the given con
  		* @param x1 Number
  		* @param y1 Number
  		* @param x2 Number
  		* @param y2 Number
  		* @param x3 Number
  		* @param y3 Number
  		*/
  var bezierCurveTo: js.UndefOr[
    js.Function6[
      /* x1 */ js.UndefOr[scala.Double], 
      /* y1 */ js.UndefOr[scala.Double], 
      /* x2 */ js.UndefOr[scala.Double], 
      /* y2 */ js.UndefOr[scala.Double], 
      /* x3 */ js.UndefOr[scala.Double], 
      /* y3 */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Clears the context  */
  var clear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Marks the current subpath as closed and starts a new subpath with a point the same as the start and end of the newly  */
  var closePath: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Returns an object that represents a linear gradient that paints along the line given by the coordinates represented b
  		* @param x0 Number
  		* @param y0 Number
  		* @param x1 Number
  		* @param y1 Number
  		* @returns Ext.draw.engine.SvgContext.Gradient
  		*/
  var createLinearGradient: js.UndefOr[
    js.Function4[
      /* x0 */ js.UndefOr[scala.Double], 
      /* y0 */ js.UndefOr[scala.Double], 
      /* x1 */ js.UndefOr[scala.Double], 
      /* y1 */ js.UndefOr[scala.Double], 
      senchaUnderscoreTouchLib.ExtNs.drawNs.engineNs.svgcontextNs.IGradient
    ]
  ] = js.undefined
  /** [Method] Returns a CanvasGradient object that represents a radial gradient that paints along the cone given by the circles rep
  		* @param x0 Number
  		* @param y0 Number
  		* @param r0 Number
  		* @param x1 Number
  		* @param y1 Number
  		* @param r1 Number
  		* @returns Ext.draw.engine.SvgContext.Gradient
  		*/
  var createRadialGradient: js.UndefOr[
    js.Function6[
      /* x0 */ js.UndefOr[scala.Double], 
      /* y0 */ js.UndefOr[scala.Double], 
      /* r0 */ js.UndefOr[scala.Double], 
      /* x1 */ js.UndefOr[scala.Double], 
      /* y1 */ js.UndefOr[scala.Double], 
      /* r1 */ js.UndefOr[scala.Double], 
      senchaUnderscoreTouchLib.ExtNs.drawNs.engineNs.svgcontextNs.IGradient
    ]
  ] = js.undefined
  /** [Method] Draws the given image onto the canvas
  		* @param image HTMLElement
  		* @param sx Number
  		* @param sy Number
  		* @param sw Number
  		* @param sh Number
  		* @param dx Number
  		* @param dy Number
  		* @param dw Number
  		* @param dh Number
  		*/
  var drawImage: js.UndefOr[
    js.Function9[
      /* image */ js.UndefOr[stdLib.HTMLElement], 
      /* sx */ js.UndefOr[scala.Double], 
      /* sy */ js.UndefOr[scala.Double], 
      /* sw */ js.UndefOr[scala.Double], 
      /* sh */ js.UndefOr[scala.Double], 
      /* dx */ js.UndefOr[scala.Double], 
      /* dy */ js.UndefOr[scala.Double], 
      /* dw */ js.UndefOr[scala.Double], 
      /* dh */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Adds points to the subpath such that the arc described by the circumference of the ellipse described by the arguments
  		* @param x Number
  		* @param y Number
  		* @param radiusX Number
  		* @param radiusY Number
  		* @param rotation Number
  		* @param startAngle Number
  		* @param endAngle Number
  		* @param anticlockwise Number
  		*/
  var ellipse: js.UndefOr[
    js.Function8[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* radiusX */ js.UndefOr[scala.Double], 
      /* radiusY */ js.UndefOr[scala.Double], 
      /* rotation */ js.UndefOr[scala.Double], 
      /* startAngle */ js.UndefOr[scala.Double], 
      /* endAngle */ js.UndefOr[scala.Double], 
      /* anticlockwise */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Fills the subpaths of the current default path or the given path with the current fill style  */
  var fill: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Paints the given rectangle onto the canvas using the current fill style
  		* @param x Number
  		* @param y Number
  		* @param width Number
  		* @param height Number
  		*/
  var fillRect: js.UndefOr[
    js.Function4[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Note After the method guarantees the transform matrix will be inverted
  		* @param attr Object The attribute object
  		* @param transformFillStroke Boolean Indicate whether to transform fill and stroke. If this is not given, then uses attr.transformFillStroke instead.
  		*/
  var fillStroke: js.UndefOr[
    js.Function2[
      /* attr */ js.UndefOr[js.Any], 
      /* transformFillStroke */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Fills the given text at the given position
  		* @param text String
  		* @param x Number
  		* @param y Number
  		*/
  var fillText: js.UndefOr[
    js.Function3[
      /* text */ js.UndefOr[java.lang.String], 
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Adds the given point to the current subpath connected to the previous one by a straight line
  		* @param x Number
  		* @param y Number
  		*/
  var lineTo: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** [Method] Creates a new subpath with the given point
  		* @param x Number
  		* @param y Number
  		*/
  var moveTo: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** [Method] Adds a new closed subpath to the path representing the given rectangle
  		* @param x Number
  		* @param y Number
  		* @param width Number
  		* @param height Number
  		*/
  var rect: js.UndefOr[
    js.Function4[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Pops the state stack and restores the state  */
  var restore: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Pushes the context state to the state stack  */
  var save: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Changes the transformation matrix to the matrix given by the arguments as described below
  		* @param xx Number
  		* @param yx Number
  		* @param xy Number
  		* @param yy Number
  		* @param dx Number
  		* @param dy Number
  		*/
  var setTransform: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[scala.Double], 
      /* yx */ js.UndefOr[scala.Double], 
      /* xy */ js.UndefOr[scala.Double], 
      /* yy */ js.UndefOr[scala.Double], 
      /* dx */ js.UndefOr[scala.Double], 
      /* dy */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Strokes the subpaths of the current default path or the given path with the current stroke style  */
  var stroke: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Paints the box that outlines the given rectangle onto the canvas using the current stroke style
  		* @param x Number
  		* @param y Number
  		* @param width Number
  		* @param height Number
  		*/
  var strokeRect: js.UndefOr[
    js.Function4[
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Strokes the given text at the given position
  		* @param text String
  		* @param x Number
  		* @param y Number
  		*/
  var strokeText: js.UndefOr[
    js.Function3[
      /* text */ js.UndefOr[java.lang.String], 
      /* x */ js.UndefOr[scala.Double], 
      /* y */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Changes the transformation matrix to apply the matrix given by the arguments as described below
  		* @param xx Number
  		* @param yx Number
  		* @param xy Number
  		* @param yy Number
  		* @param dx Number
  		* @param dy Number
  		*/
  var transform: js.UndefOr[
    js.Function6[
      /* xx */ js.UndefOr[scala.Double], 
      /* yx */ js.UndefOr[scala.Double], 
      /* xy */ js.UndefOr[scala.Double], 
      /* yy */ js.UndefOr[scala.Double], 
      /* dx */ js.UndefOr[scala.Double], 
      /* dy */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
}

object ISvgContext {
  @scala.inline
  def apply(
    alias: senchaUnderscoreTouchLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    arc: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], /* radius */ js.UndefOr[scala.Double], /* startAngle */ js.UndefOr[scala.Double], /* endAngle */ js.UndefOr[scala.Double], /* anticlockwise */ js.UndefOr[scala.Double]) => scala.Unit = null,
    arcSvg: (/* r1 */ js.UndefOr[scala.Double], /* r2 */ js.UndefOr[scala.Double], /* rotation */ js.UndefOr[scala.Double], /* large */ js.UndefOr[scala.Double], /* swipe */ js.UndefOr[scala.Double], /* x2 */ js.UndefOr[scala.Double], /* y2 */ js.UndefOr[scala.Double]) => scala.Unit = null,
    arcTo: (/* x1 */ js.UndefOr[scala.Double], /* y1 */ js.UndefOr[scala.Double], /* x2 */ js.UndefOr[scala.Double], /* y2 */ js.UndefOr[scala.Double], /* radiusX */ js.UndefOr[scala.Double], /* radiusY */ js.UndefOr[scala.Double], /* rotation */ js.UndefOr[scala.Double]) => scala.Unit = null,
    beginPath: () => scala.Unit = null,
    bezierCurveTo: (/* x1 */ js.UndefOr[scala.Double], /* y1 */ js.UndefOr[scala.Double], /* x2 */ js.UndefOr[scala.Double], /* y2 */ js.UndefOr[scala.Double], /* x3 */ js.UndefOr[scala.Double], /* y3 */ js.UndefOr[scala.Double]) => scala.Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    clear: () => scala.Unit = null,
    closePath: () => scala.Unit = null,
    config: js.Any = null,
    createLinearGradient: (/* x0 */ js.UndefOr[scala.Double], /* y0 */ js.UndefOr[scala.Double], /* x1 */ js.UndefOr[scala.Double], /* y1 */ js.UndefOr[scala.Double]) => senchaUnderscoreTouchLib.ExtNs.drawNs.engineNs.svgcontextNs.IGradient = null,
    createRadialGradient: (/* x0 */ js.UndefOr[scala.Double], /* y0 */ js.UndefOr[scala.Double], /* r0 */ js.UndefOr[scala.Double], /* x1 */ js.UndefOr[scala.Double], /* y1 */ js.UndefOr[scala.Double], /* r1 */ js.UndefOr[scala.Double]) => senchaUnderscoreTouchLib.ExtNs.drawNs.engineNs.svgcontextNs.IGradient = null,
    destroy: () => scala.Unit = null,
    drawImage: (/* image */ js.UndefOr[stdLib.HTMLElement], /* sx */ js.UndefOr[scala.Double], /* sy */ js.UndefOr[scala.Double], /* sw */ js.UndefOr[scala.Double], /* sh */ js.UndefOr[scala.Double], /* dx */ js.UndefOr[scala.Double], /* dy */ js.UndefOr[scala.Double], /* dw */ js.UndefOr[scala.Double], /* dh */ js.UndefOr[scala.Double]) => scala.Unit = null,
    ellipse: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], /* radiusX */ js.UndefOr[scala.Double], /* radiusY */ js.UndefOr[scala.Double], /* rotation */ js.UndefOr[scala.Double], /* startAngle */ js.UndefOr[scala.Double], /* endAngle */ js.UndefOr[scala.Double], /* anticlockwise */ js.UndefOr[scala.Double]) => scala.Unit = null,
    extend: java.lang.String = null,
    fill: () => scala.Unit = null,
    fillRect: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], /* width */ js.UndefOr[scala.Double], /* height */ js.UndefOr[scala.Double]) => scala.Unit = null,
    fillStroke: (/* attr */ js.UndefOr[js.Any], /* transformFillStroke */ js.UndefOr[scala.Boolean]) => scala.Unit = null,
    fillText: (/* text */ js.UndefOr[java.lang.String], /* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double]) => scala.Unit = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* instanceConfig */ js.UndefOr[js.Any] => _ = null,
    lineTo: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double]) => scala.Unit = null,
    mixins: js.Any = null,
    moveTo: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double]) => scala.Unit = null,
    platformConfig: js.Any = null,
    rect: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], /* width */ js.UndefOr[scala.Double], /* height */ js.UndefOr[scala.Double]) => scala.Unit = null,
    restore: () => scala.Unit = null,
    save: () => scala.Unit = null,
    self: senchaUnderscoreTouchLib.ExtNs.IClass = null,
    setTransform: (/* xx */ js.UndefOr[scala.Double], /* yx */ js.UndefOr[scala.Double], /* xy */ js.UndefOr[scala.Double], /* yy */ js.UndefOr[scala.Double], /* dx */ js.UndefOr[scala.Double], /* dy */ js.UndefOr[scala.Double]) => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    stroke: () => scala.Unit = null,
    strokeRect: (/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], /* width */ js.UndefOr[scala.Double], /* height */ js.UndefOr[scala.Double]) => scala.Unit = null,
    strokeText: (/* text */ js.UndefOr[java.lang.String], /* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double]) => scala.Unit = null,
    transform: (/* xx */ js.UndefOr[scala.Double], /* yx */ js.UndefOr[scala.Double], /* xy */ js.UndefOr[scala.Double], /* yy */ js.UndefOr[scala.Double], /* dx */ js.UndefOr[scala.Double], /* dy */ js.UndefOr[scala.Double]) => scala.Unit = null,
    uses: senchaUnderscoreTouchLib.ExtNs.Array = null
  ): ISvgContext = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (arc != null) __obj.updateDynamic("arc")(js.Any.fromFunction6(arc))
    if (arcSvg != null) __obj.updateDynamic("arcSvg")(js.Any.fromFunction7(arcSvg))
    if (arcTo != null) __obj.updateDynamic("arcTo")(js.Any.fromFunction7(arcTo))
    if (beginPath != null) __obj.updateDynamic("beginPath")(js.Any.fromFunction0(beginPath))
    if (bezierCurveTo != null) __obj.updateDynamic("bezierCurveTo")(js.Any.fromFunction6(bezierCurveTo))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (closePath != null) __obj.updateDynamic("closePath")(js.Any.fromFunction0(closePath))
    if (config != null) __obj.updateDynamic("config")(config)
    if (createLinearGradient != null) __obj.updateDynamic("createLinearGradient")(js.Any.fromFunction4(createLinearGradient))
    if (createRadialGradient != null) __obj.updateDynamic("createRadialGradient")(js.Any.fromFunction6(createRadialGradient))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (drawImage != null) __obj.updateDynamic("drawImage")(js.Any.fromFunction9(drawImage))
    if (ellipse != null) __obj.updateDynamic("ellipse")(js.Any.fromFunction8(ellipse))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fill != null) __obj.updateDynamic("fill")(js.Any.fromFunction0(fill))
    if (fillRect != null) __obj.updateDynamic("fillRect")(js.Any.fromFunction4(fillRect))
    if (fillStroke != null) __obj.updateDynamic("fillStroke")(js.Any.fromFunction2(fillStroke))
    if (fillText != null) __obj.updateDynamic("fillText")(js.Any.fromFunction3(fillText))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (lineTo != null) __obj.updateDynamic("lineTo")(js.Any.fromFunction2(lineTo))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (moveTo != null) __obj.updateDynamic("moveTo")(js.Any.fromFunction2(moveTo))
    if (platformConfig != null) __obj.updateDynamic("platformConfig")(platformConfig)
    if (rect != null) __obj.updateDynamic("rect")(js.Any.fromFunction4(rect))
    if (restore != null) __obj.updateDynamic("restore")(js.Any.fromFunction0(restore))
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction0(save))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setTransform != null) __obj.updateDynamic("setTransform")(js.Any.fromFunction6(setTransform))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (stroke != null) __obj.updateDynamic("stroke")(js.Any.fromFunction0(stroke))
    if (strokeRect != null) __obj.updateDynamic("strokeRect")(js.Any.fromFunction4(strokeRect))
    if (strokeText != null) __obj.updateDynamic("strokeText")(js.Any.fromFunction3(strokeText))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction6(transform))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISvgContext]
  }
}

