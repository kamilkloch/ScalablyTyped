package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the basic interface for SAX error handlers.
  *
  * If a SAX application needs to implement customized error handling, it must implement this interface and then register an instance with the SAX parser
  * using the parser's XParser::setErrorhandler() method. The parser will then report all errors and warnings through this interface.
  *
  * This interface is a slight adaption of the Java interface `org.xml.sax.ErrorHandler` . In IDL, no exception can be passed as an argument, so an `any`
  * serves as the container. The type of the exception is {@link SAXParseException} or an instance of a derived class.
  */
trait XErrorHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** receives notification of a recoverable error. */
  def error(aSAXParseException: js.Any): scala.Unit
  /** receives notification of a non-recoverable error. */
  def fatalError(aSAXParseException: js.Any): scala.Unit
  /** receives notification of a warning. */
  def warning(aSAXParseException: js.Any): scala.Unit
}

object XErrorHandler {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    error: js.Any => scala.Unit,
    fatalError: js.Any => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    warning: js.Any => scala.Unit
  ): XErrorHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), error = js.Any.fromFunction1(error), fatalError = js.Any.fromFunction1(fatalError), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), warning = js.Any.fromFunction1(warning))
  
    __obj.asInstanceOf[XErrorHandler]
  }
}

