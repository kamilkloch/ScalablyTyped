package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.PictureFormat")
@js.native
class PictureFormat protected () extends js.Object {
  val Application: js.Any = js.native
  var Brightness: scala.Double = js.native
  var ColorType: activexDashOfficeLib.OfficeNs.MsoPictureColorType = js.native
  var Contrast: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Crop: activexDashOfficeLib.OfficeNs.Crop = js.native
  var CropBottom: scala.Double = js.native
  var CropLeft: scala.Double = js.native
  var CropRight: scala.Double = js.native
  var CropTop: scala.Double = js.native
  var `Excel.PictureFormat_typekey`: PictureFormat = js.native
  val Parent: js.Any = js.native
  var TransparencyColor: activexDashOfficeLib.OfficeNs.MsoRGBType = js.native
  var TransparentBackground: activexDashOfficeLib.OfficeNs.MsoTriState = js.native
  def IncrementBrightness(Increment: scala.Double): scala.Unit = js.native
  def IncrementContrast(Increment: scala.Double): scala.Unit = js.native
}

