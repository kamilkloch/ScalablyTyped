package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRectReadOnly extends js.Object {
  val bottom: scala.Double
  val height: scala.Double
  val left: scala.Double
  val right: scala.Double
  val top: scala.Double
  val width: scala.Double
  val x: scala.Double
  val y: scala.Double
  def toJSON(): js.Any
}

@JSGlobal("DOMRectReadOnly")
@js.native
class DOMRectReadOnlyCls () extends DOMRectReadOnly {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double) = this()
  /* CompleteClass */
  override val bottom: scala.Double = js.native
  /* CompleteClass */
  override val height: scala.Double = js.native
  /* CompleteClass */
  override val left: scala.Double = js.native
  /* CompleteClass */
  override val right: scala.Double = js.native
  /* CompleteClass */
  override val top: scala.Double = js.native
  /* CompleteClass */
  override val width: scala.Double = js.native
  /* CompleteClass */
  override val x: scala.Double = js.native
  /* CompleteClass */
  override val y: scala.Double = js.native
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

@JSGlobal("DOMRectReadOnly")
@js.native
object DOMRectReadOnly
  extends org.scalablytyped.runtime.Instantiable0[DOMRectReadOnly]
     with org.scalablytyped.runtime.Instantiable1[/* x */ scala.Double, DOMRectReadOnly]
     with org.scalablytyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, DOMRectReadOnly]
     with org.scalablytyped.runtime.Instantiable3[/* x */ scala.Double, /* y */ scala.Double, /* width */ scala.Double, DOMRectReadOnly]
     with org.scalablytyped.runtime.Instantiable4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      DOMRectReadOnly
    ] {
  def fromRect(): stdLib.DOMRectReadOnly = js.native
  def fromRect(other: stdLib.DOMRectInit): stdLib.DOMRectReadOnly = js.native
}

