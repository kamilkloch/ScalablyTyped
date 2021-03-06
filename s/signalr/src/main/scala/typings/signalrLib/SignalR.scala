package typings
package signalrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalR extends js.Object {
  var ajaxDefaults: signalrLib.SignalRNs.AjaxDefaults = js.native
  var connectionState: signalrLib.SignalRNs.ConnectionStates = js.native
  var events: signalrLib.SignalRNs.AvailableEvents = js.native
  var hub: signalrLib.SignalRNs.HubNs.Connection = js.native
  @JSName("hubConnection")
  var hubConnection_Original: signalrLib.SignalRNs.HubNs.HubCreator = js.native
  var transports: signalrLib.SignalRNs.Transports = js.native
  /**
    *   Current SignalR version.
    */
  var version: java.lang.String = js.native
  /**
    * Creates a new SignalR connection for the given url
    *
    * @param url   The URL of the long polling endpoint
    * @param queryString   [Optional] Custom querystring parameters to add to the connection URL. If an object, every non-function member will be added to the querystring. If a string, it's added to the QS as specified.
    * @param logging [Optional] A flag indicating whether connection logging is enabled to the browser console/log. Defaults to false.
    */
  def apply(url: java.lang.String): signalrLib.SignalRNs.Connection = js.native
  def apply(url: java.lang.String, queryString: java.lang.String): signalrLib.SignalRNs.Connection = js.native
  def apply(url: java.lang.String, queryString: java.lang.String, logging: scala.Boolean): signalrLib.SignalRNs.Connection = js.native
  def apply(url: java.lang.String, queryString: js.Object): signalrLib.SignalRNs.Connection = js.native
  def apply(url: java.lang.String, queryString: js.Object, logging: scala.Boolean): signalrLib.SignalRNs.Connection = js.native
  def changeState(connection: signalrLib.SignalRNs.Connection, expectedState: scala.Double, newState: scala.Double): scala.Unit = js.native
  def hubConnection(): signalrLib.SignalRNs.HubNs.Connection = js.native
  def hubConnection(url: java.lang.String): signalrLib.SignalRNs.HubNs.Connection = js.native
  def hubConnection(url: java.lang.String, options: signalrLib.SignalRNs.HubNs.Options): signalrLib.SignalRNs.HubNs.Connection = js.native
  def isDisconnecting(connection: signalrLib.SignalRNs.Connection): scala.Boolean = js.native
  /**
    *   Reinstates the original value of $.connection and returns the signalR object for manual assignment.
    */
  def noConflict(): signalrLib.SignalRNs.Connection = js.native
}

