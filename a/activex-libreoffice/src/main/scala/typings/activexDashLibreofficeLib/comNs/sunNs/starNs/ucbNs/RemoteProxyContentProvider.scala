package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A {@link ContentProvider} that wraps remote content providers that (potentially) have been distributed to a UCB.
  *
  * Before trying to pass a request to a "real", underlying content provider (which will most likely be a remote content provider distributed to this
  * UCB), this proxy first activates any remote content providers that have been distributed here, but are still inactive (see {@link
  * RemoteContentProviderAcceptor} and {@link XRemoteContentProviderActivator} for more information).
  *
  * The way this works might change, therefore this interface is marked as deprecated.
  * @deprecated Deprecated
  */
trait RemoteProxyContentProvider
  extends XContentProvider
     with XContentIdentifierFactory
     with XParameterizedContentProvider

object RemoteProxyContentProvider {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    compareContentIds: (XContentIdentifier, XContentIdentifier) => scala.Double,
    createContentIdentifier: java.lang.String => XContentIdentifier,
    deregisterInstance: (java.lang.String, java.lang.String) => XContentProvider,
    queryContent: XContentIdentifier => XContent,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerInstance: (java.lang.String, java.lang.String, scala.Boolean) => XContentProvider,
    release: () => scala.Unit
  ): RemoteProxyContentProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compareContentIds = js.Any.fromFunction2(compareContentIds), createContentIdentifier = js.Any.fromFunction1(createContentIdentifier), deregisterInstance = js.Any.fromFunction2(deregisterInstance), queryContent = js.Any.fromFunction1(queryContent), queryInterface = js.Any.fromFunction1(queryInterface), registerInstance = js.Any.fromFunction3(registerInstance), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[RemoteProxyContentProvider]
  }
}

