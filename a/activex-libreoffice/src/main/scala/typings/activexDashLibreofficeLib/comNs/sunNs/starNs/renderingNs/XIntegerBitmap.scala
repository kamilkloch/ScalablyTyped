package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a specialized interface for bitmaps having integer color channels.
  * @since OOo 2.0
  */
trait XIntegerBitmap extends XIntegerReadOnlyBitmap {
  /**
    * Set raw data of a bitmap.
    *
    * Set raw data of a bitmap, in the format as defined by {@link getMemoryLayout()} . With the given rectangle, a subset of the bitmap can be changed. If
    * the internal data format's pixel are not integer multiples of bytes (i.e. if one pixel occupies less than a byte), the leftover content of the bytes
    * at the right of each scanline is ignored and left unchanged in the bitmap. When setting subsets of the bitmap, the same scanline padding takes place
    * as when the whole bitmap is changed.
    *
    * When setting data on volatile bitmaps, always call isValid() before, and retrieve a new memory layout via {@link getMemoryLayout()} . At least under
    * Windows, the memory layout can change for the same bitmap, if the user e.g. switches the screen resolution. Thus, this method will throw an
    * IllegalArgumentException, if the memory layout changed between a call to {@link getMemoryLayout()} and {@link setData()} .
    * @param data Data to set
    * @param bitmapLayout Layout of the data to set. Must match this bitmap's current layout.
    * @param rect Destination rectangle, within the bounds of the bitmap, to set the data in.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if parts of the given rectangle are outside the permissible bitmap area.
    * @throws com::sun::star::lang::IllegalArgumentException if the given memory layout does not match this bitmap's layout, or if the given data sequence has
    */
  def setData(
    data: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    bitmapLayout: IntegerBitmapLayout,
    rect: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D
  ): scala.Unit
  /**
    * Set a single pixel of the bitmap with the given color value.
    *
    * If the internal data format's pixel are not integer multiples of bytes (i.e. if one pixel occupies less than a byte), the color value is expected in
    * the least significant bits of the single byte given as the color.
    *
    * When setting data on volatile bitmaps, always call isValid() before, and retrieve a new memory layout via {@link getMemoryLayout()} . At least under
    * Windows, the memory layout can change for the same bitmap, if the user e.g. switches the screen resolution. Thus, this method will throw an
    * IllegalArgumentException, if the memory layout changed between a call to {@link getMemoryLayout()} and {@link setPixel()} .
    * @param color The color value(s) to set
    * @param bitmapLayout Layout of the color elements to set. Must match this bitmap's current layout.
    * @param pos Pixel position with the bounds of the bitmap to set.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given point is outside the permissible bitmap area.
    * @throws com::sun::star::lang::IllegalArgumentException if the given memory layout does not match this bitmap's layout, or if the given data sequence has
    */
  def setPixel(
    color: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    bitmapLayout: IntegerBitmapLayout,
    pos: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerPoint2D
  ): scala.Unit
}

object XIntegerBitmap {
  @scala.inline
  def apply(
    MemoryLayout: IntegerBitmapLayout,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D,
    acquire: () => scala.Unit,
    getData: (js.Array[IntegerBitmapLayout], activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D) => stdLib.SafeArray[scala.Double],
    getMemoryLayout: () => IntegerBitmapLayout,
    getPixel: (js.Array[IntegerBitmapLayout], activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerPoint2D) => stdLib.SafeArray[scala.Double],
    getScaledBitmap: (activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D, scala.Boolean) => XBitmap,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D,
    hasAlpha: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setData: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], IntegerBitmapLayout, activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerRectangle2D) => scala.Unit,
    setPixel: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], IntegerBitmapLayout, activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerPoint2D) => scala.Unit
  ): XIntegerBitmap = {
    val __obj = js.Dynamic.literal(MemoryLayout = MemoryLayout, Size = Size, acquire = js.Any.fromFunction0(acquire), getData = js.Any.fromFunction2(getData), getMemoryLayout = js.Any.fromFunction0(getMemoryLayout), getPixel = js.Any.fromFunction2(getPixel), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = js.Any.fromFunction0(getSize), hasAlpha = js.Any.fromFunction0(hasAlpha), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setData = js.Any.fromFunction3(setData), setPixel = js.Any.fromFunction3(setPixel))
  
    __obj.asInstanceOf[XIntegerBitmap]
  }
}

