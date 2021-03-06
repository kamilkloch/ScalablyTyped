package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents an initiator side security context.
  *
  * This context may be used to initialize authentication tokens to send to an acceptor and to authenticate any token sent back in response.
  * @since OOo 1.1.2
  */
trait XSSOInitiatorContext extends XSSOContext {
  /**
    * initializes an SSO Token to send to the acceptor side and authenticates an SSO Token returned by the acceptor if the context supports mutual
    * authentication.
    *
    * init should be called only once for contexts which don't support mutual authentication and at most twice for contexts which do support mutual
    * authentication. Additional calls produce undefined results.
    * @param Token the SSO token received from the acceptor side in response to an authentication request. This token is ignored on the first call to init and
    * @returns the sequence of bytes to be sent to the acceptor side as part of an authentication request. This sequence will be non zero length for the first c
    */
  def init(Token: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): stdLib.SafeArray[scala.Double]
}

object XSSOInitiatorContext {
  @scala.inline
  def apply(
    Mechanism: java.lang.String,
    Mutual: scala.Boolean,
    Source: java.lang.String,
    Target: java.lang.String,
    acquire: () => scala.Unit,
    getMechanism: () => java.lang.String,
    getMutual: () => scala.Boolean,
    getSource: () => java.lang.String,
    getTarget: () => java.lang.String,
    init: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => stdLib.SafeArray[scala.Double],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSSOInitiatorContext = {
    val __obj = js.Dynamic.literal(Mechanism = Mechanism, Mutual = Mutual, Source = Source, Target = Target, acquire = js.Any.fromFunction0(acquire), getMechanism = js.Any.fromFunction0(getMechanism), getMutual = js.Any.fromFunction0(getMutual), getSource = js.Any.fromFunction0(getSource), getTarget = js.Any.fromFunction0(getTarget), init = js.Any.fromFunction1(init), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSSOInitiatorContext]
  }
}

