package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides Text Conversion service.
  *
  * It is derived from {@link com.sun.star.i18n.XTextConversion} and provides a new conversion function containing position map (offset) between original
  * and converted string.
  * @since OOo 2.0
  */
trait XExtendedTextConversion extends XTextConversion {
  /**
    * The functionality of this method is same as {@link com.sun.star.i18n.XTextConversion.getConversion()} , except an additional output parameter rOffset.
    * @param aText See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param nStartPos See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param nLength See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param aLocale See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param nTextConversionType See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param nTextConversionOptions See {@link com.sun.star.i18n.XTextConversion.getConversion()}
    * @param rOffset To find the grapheme of input string corresponding to the grapheme of output string, rOffset provides the offset array whose index is the
    */
  def getConversionWithOffset(
    aText: java.lang.String,
    nStartPos: scala.Double,
    nLength: scala.Double,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nTextConversionType: scala.Double,
    nTextConversionOptions: scala.Double,
    rOffset: js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]]
  ): java.lang.String
}

object XExtendedTextConversion {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getConversion: (java.lang.String, scala.Double, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, scala.Double) => java.lang.String,
    getConversionWithOffset: (java.lang.String, scala.Double, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, scala.Double, js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]]) => java.lang.String,
    getConversions: (java.lang.String, scala.Double, scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, scala.Double) => TextConversionResult,
    interactiveConversion: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double, scala.Double) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XExtendedTextConversion = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getConversion = js.Any.fromFunction6(getConversion), getConversionWithOffset = js.Any.fromFunction7(getConversionWithOffset), getConversions = js.Any.fromFunction6(getConversions), interactiveConversion = js.Any.fromFunction3(interactiveConversion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XExtendedTextConversion]
  }
}

