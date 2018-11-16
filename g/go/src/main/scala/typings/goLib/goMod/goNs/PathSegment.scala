package typings
package goLib.goMod.goNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
    * A PathSegment represents a straight line or curved segment of a path between
    * two or more points that are part of a PathFigure.
    * A PathSegment must not be modified once its containing PathFigure's
    * Geometry has been assigned to a Shape.
    */

trait PathSegment extends js.Object {
  /**Gets or sets the center X value of the Arc for a PathSegment of type .Arc.*/
  var centerX: scala.Double
  /**Gets or sets the center Y value of the Arc for a PathSegment of type .Arc.*/
  var centerY: scala.Double
  /**Gets or sets the X coordinate of the end point for all kinds of PathSegment.*/
  var endX: scala.Double
  /**Gets or sets the Y coordinate of the end point for all kinds of PathSegment.*/
  var endY: scala.Double
  /**Gets or sets the sweep-flag for a PathSegment of type .SvgArc.*/
  var isClockwiseArc: scala.Boolean
  /**Gets or sets whether the path is closed after this PathSegment.*/
  var isClosed: scala.Boolean
  /**Gets or sets the large-arc-flag for a PathSegment of type .SvgArc.*/
  var isLargeArc: scala.Boolean
  /**Gets or sets the X value of the first control point for a PathSegment of type .Bezier or .QuadraticBezier.*/
  var point1X: scala.Double
  /**Gets or sets the Y value of the first control point for a PathSegment of type .Bezier or .QuadraticBezier.*/
  var point1Y: scala.Double
  /**Gets or sets the X value of the second control point for a PathSegment of type cubic .Bezier.*/
  var point2X: scala.Double
  /**Gets or sets the Y value of the second control point for a PathSegment of type cubic .Bezier.*/
  var point2Y: scala.Double
  /**Gets or sets the X value of the radius for a PathSegment of type .Arc.*/
  var radiusX: scala.Double
  /**Gets or sets the Y value of the radius for a PathSegment of type .Arc.*/
  var radiusY: scala.Double
  /**Gets or sets the starting angle for a PathSegment of type .Arc.*/
  var startAngle: scala.Double
  /**Gets or sets the length of angle in degrees, or amount of arc to "sweep" for a PathSegment of type .Arc.*/
  var sweepAngle: scala.Double
  /**Gets or sets the type of the PathSegment.*/
  var `type`: EnumValue
  /**Gets or sets the X-axis rotation for a PathSegment of type .SvgArc.*/
  var xAxisRotation: scala.Double
  /**
          * Closes the path after this PathSegment.
          */
  def close(): PathSegment
  /**
          * Makes a copy of this PathSegment.
          */
  def copy(): PathSegment
  def equalsApprox(s: PathSegment): scala.Boolean
}
