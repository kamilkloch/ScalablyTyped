package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specialized interface for bitmaps containing IEEE floats as their color components. In contrast to {@link XIeeeFloatBitmap} , this interface only
  * permits read-only access.
  *
  * Use this interface for e.g. bitmaps that are calculated on-the-fly, or that are pure functional, and thus cannot be modified.
  *
  * If you get passed an instance of {@link XHalfFloatReadOnlyBitmap} that also supports the {@link XVolatileBitmap} interface, things become a bit more
  * complicated. When reading data, one has to check for both {@link VolatileContentDestroyedException} and mismatching {@link FloatingPointBitmapLayout}
  * return values. If either of them occurs, the whole bitmap read operation should be repeated.
  */
trait XIeeeFloatReadOnlyBitmap extends XBitmap {
  /**
    * Query the memory layout for this bitmap.
    *
    * Please note that for volatile bitmaps, the memory layout might change between subsequent calls.
    */
  val MemoryLayout: FloatingPointBitmapLayout
  /**
    * Query the raw data of this bitmap.
    *
    * Query the raw data of this bitmap, in the format as defined by {@link getMemoryLayout()} . With the given rectangle, a subset of the whole bitmap can
    * be queried. When querying subsets of the bitmap, the same scanline padding takes place as when the whole bitmap is requested.
    *
    * Note that the bitmap memory layout might change for volatile bitmaps.
    * @param bitmapLayout The memory layout the returned data is in.
    * @param rect A rectangle, within the bounds of the bitmap, to retrieve the consent from.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if parts of the given rectangle are outside the permissible bitmap area.
    */
  def getData(
    bitmapLayout: js.Array[FloatingPointBitmapLayout],
    rect: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D
  ): stdLib.SafeArray[scala.Double]
  /**
    * Query the memory layout for this bitmap.
    *
    * Please note that for volatile bitmaps, the memory layout might change between subsequent calls.
    */
  def getMemoryLayout(): FloatingPointBitmapLayout
  /**
    * Get a single pixel of the bitmap, returning its color value.
    *
    * Note that the bitmap memory layout might change for volatile bitmaps.
    * @param bitmapLayout The memory layout the returned data is in.
    * @param pos A position, within the bounds of the bitmap, to retrieve the color from.
    * @throws VolatileContentDestroyedException if the bitmap is volatile, and the content has been destroyed by the system.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given position is outside the permissible bitmap area.
    */
  def getPixel(
    bitmapLayout: js.Array[FloatingPointBitmapLayout],
    pos: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerPoint2D
  ): stdLib.SafeArray[scala.Double]
}

object XIeeeFloatReadOnlyBitmap {
  @scala.inline
  def apply(
    MemoryLayout: FloatingPointBitmapLayout,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D,
    acquire: () => scala.Unit,
    getData: (js.Array[FloatingPointBitmapLayout], activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D) => stdLib.SafeArray[scala.Double],
    getMemoryLayout: () => FloatingPointBitmapLayout,
    getPixel: (js.Array[FloatingPointBitmapLayout], activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerPoint2D) => stdLib.SafeArray[scala.Double],
    getScaledBitmap: (activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D, scala.Boolean) => XBitmap,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D,
    hasAlpha: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XIeeeFloatReadOnlyBitmap = {
    val __obj = js.Dynamic.literal(MemoryLayout = MemoryLayout, Size = Size, acquire = js.Any.fromFunction0(acquire), getData = js.Any.fromFunction2(getData), getMemoryLayout = js.Any.fromFunction0(getMemoryLayout), getPixel = js.Any.fromFunction2(getPixel), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = js.Any.fromFunction0(getSize), hasAlpha = js.Any.fromFunction0(hasAlpha), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XIeeeFloatReadOnlyBitmap]
  }
}

