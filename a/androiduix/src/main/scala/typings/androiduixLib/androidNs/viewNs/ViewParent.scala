package typings
package androiduixLib.androidNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ViewParent extends js.Object {
  def bringChildToFront(child: View): js.Any
  def childDrawableStateChanged(child: View): js.Any
  def childHasTransientStateChanged(child: View, hasTransientState: scala.Boolean): js.Any
  def clearChildFocus(child: View): js.Any
  def focusSearch(v: View, direction: scala.Double): View
  def focusableViewAvailable(v: View): js.Any
  def getChildVisibleRect(
    child: View,
    r: androiduixLib.androidNs.graphicsNs.Rect,
    offset: androiduixLib.androidNs.graphicsNs.Point
  ): scala.Boolean
  def getParent(): ViewParent
  def invalidateChild(child: View, r: androiduixLib.androidNs.graphicsNs.Rect): js.Any
  def invalidateChildInParent(location: js.Array[scala.Double], r: androiduixLib.androidNs.graphicsNs.Rect): ViewParent
  def isLayoutRequested(): scala.Boolean
  def requestChildFocus(child: View, focused: View): js.Any
  def requestChildRectangleOnScreen(child: View, rectangle: androiduixLib.androidNs.graphicsNs.Rect, immediate: scala.Boolean): scala.Boolean
  def requestDisallowInterceptTouchEvent(disallowIntercept: scala.Boolean): js.Any
  def requestLayout(): js.Any
}
