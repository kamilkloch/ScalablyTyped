package typings
package socketclusterDashServerLib.scserversocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCServerSocket
  extends componentDashEmitterLib.componentDashEmitterMod.Emitter {
  val AUTHENTICATED: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticated = js.native
  val CLOSED: socketclusterDashServerLib.socketclusterDashServerLibStrings.closed = js.native
  val CONNECTING: socketclusterDashServerLib.socketclusterDashServerLibStrings.connecting = js.native
  val OPEN: socketclusterDashServerLib.socketclusterDashServerLibStrings.open = js.native
  val UNAUTHENTICATED: socketclusterDashServerLib.socketclusterDashServerLibStrings.unauthenticated = js.native
  var authState: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticated | socketclusterDashServerLib.socketclusterDashServerLibStrings.unauthenticated = js.native
  var authToken: js.UndefOr[socketclusterDashServerLib.scserverMod.AuthToken] = js.native
  var exchange: scDashBrokerDashClusterLib.scDashBrokerDashClusterMod.SCExchange = js.native
  var id: java.lang.String = js.native
  var remoteAddress: java.lang.String = js.native
  var remoteFamily: java.lang.String = js.native
  var remotePort: scala.Double = js.native
  var request: nodeLib.httpMod.IncomingMessage = js.native
  var state: socketclusterDashServerLib.socketclusterDashServerLibStrings.connecting | socketclusterDashServerLib.socketclusterDashServerLibStrings.open | socketclusterDashServerLib.socketclusterDashServerLibStrings.closed = js.native
  def deauthenticate(): scala.Unit = js.native
  def deauthenticate(callback: EmitCallback): scala.Unit = js.native
  def deauthenticateSelf(): scala.Unit = js.native
  def decode(message: js.Any): js.Any = js.native
  def destroy(): scala.Unit = js.native
  def destroy(code: scala.Double): scala.Unit = js.native
  def destroy(code: scala.Double, data: js.Any): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(code: scala.Double): scala.Unit = js.native
  def disconnect(code: scala.Double, data: js.Any): scala.Unit = js.native
  def emit(event: java.lang.String, data: js.Any): scala.Unit = js.native
  def emit(event: java.lang.String, data: js.Any, callback: EmitCallback): scala.Unit = js.native
  def emit(event: java.lang.String, data: js.Any, callback: EmitCallback, options: EmitOptions): scala.Unit = js.native
  def encode(`object`: js.Any): js.Any = js.native
  def getAuthToken(): socketclusterDashServerLib.scserverMod.AuthToken = js.native
  def getBytesReceived(): scala.Double = js.native
  def getState(): socketclusterDashServerLib.socketclusterDashServerLibStrings.connecting | socketclusterDashServerLib.socketclusterDashServerLibStrings.open | socketclusterDashServerLib.socketclusterDashServerLibStrings.closed = js.native
  def isSubscribed(): scala.Boolean = js.native
  def isSubscribed(channel: java.lang.String): scala.Boolean = js.native
  def kickOut(): scala.Unit = js.native
  def kickOut(channel: java.lang.String): scala.Unit = js.native
  def kickOut(channel: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def kickOut(channel: java.lang.String, message: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def off(event: java.lang.String, listener: AnyFunction): this.type = js.native
  @JSName("off")
  def off_authStateChange(event: socketclusterDashServerLib.socketclusterDashServerLibStrings.authStateChange): this.type = js.native
  @JSName("off")
  def off_authStateChange(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.authStateChange,
    listener: js.Function1[/* stateChangeData */ StateChangeData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_authenticate(event: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticate): this.type = js.native
  @JSName("off")
  def off_authenticate(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticate,
    listener: js.Function1[
      /* authToken */ js.UndefOr[socketclusterDashServerLib.scserverMod.AuthToken], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_close(event: socketclusterDashServerLib.socketclusterDashServerLibStrings.close): this.type = js.native
  @JSName("off")
  def off_close(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* data */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_connectAbort(event: socketclusterDashServerLib.socketclusterDashServerLibStrings.connectAbort): this.type = js.native
  @JSName("off")
  def off_connectAbort(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.connectAbort,
    listener: js.Function2[/* code */ scala.Double, /* data */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_deauthenticate(event: socketclusterDashServerLib.socketclusterDashServerLibStrings.deauthenticate): this.type = js.native
  @JSName("off")
  def off_deauthenticate(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.deauthenticate,
    listener: js.Function1[
      /* oldToken */ js.UndefOr[socketclusterDashServerLib.scserverMod.AuthToken], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_disconnect(event: socketclusterDashServerLib.socketclusterDashServerLibStrings.disconnect): this.type = js.native
  @JSName("off")
  def off_disconnect(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.disconnect,
    listener: js.Function2[/* code */ scala.Double, /* data */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_error(event: socketclusterDashServerLib.socketclusterDashServerLibStrings.error): this.type = js.native
  @JSName("off")
  def off_error(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_message(event: socketclusterDashServerLib.socketclusterDashServerLibStrings.message): this.type = js.native
  @JSName("off")
  def off_message(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.message,
    listener: js.Function1[/* message */ wsLib.wsMod.Data, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_raw(event: socketclusterDashServerLib.socketclusterDashServerLibStrings.raw): this.type = js.native
  @JSName("off")
  def off_raw(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.raw,
    listener: js.Function1[/* message */ wsLib.wsMod.Data, scala.Unit]
  ): this.type = js.native
  def on(event: java.lang.String, listener: AnyFunction): this.type = js.native
  @JSName("on")
  def on_authStateChange(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.authStateChange,
    listener: js.Function1[/* stateChangeData */ StateChangeData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_authenticate(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticate,
    listener: js.Function1[
      /* authToken */ js.UndefOr[socketclusterDashServerLib.scserverMod.AuthToken], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_close(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* data */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connectAbort(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.connectAbort,
    listener: js.Function2[/* code */ scala.Double, /* data */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_deauthenticate(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.deauthenticate,
    listener: js.Function1[
      /* oldToken */ js.UndefOr[socketclusterDashServerLib.scserverMod.AuthToken], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_disconnect(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.disconnect,
    listener: js.Function2[/* code */ scala.Double, /* data */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.message,
    listener: js.Function1[/* message */ wsLib.wsMod.Data, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_raw(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.raw,
    listener: js.Function1[/* message */ wsLib.wsMod.Data, scala.Unit]
  ): this.type = js.native
  def once(event: java.lang.String, listener: AnyFunction): this.type = js.native
  @JSName("once")
  def once_authStateChange(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.authStateChange,
    listener: js.Function1[/* stateChangeData */ StateChangeData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_authenticate(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticate,
    listener: js.Function1[
      /* authToken */ js.UndefOr[socketclusterDashServerLib.scserverMod.AuthToken], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_close(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* data */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connectAbort(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.connectAbort,
    listener: js.Function2[/* code */ scala.Double, /* data */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_deauthenticate(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.deauthenticate,
    listener: js.Function1[
      /* oldToken */ js.UndefOr[socketclusterDashServerLib.scserverMod.AuthToken], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_disconnect(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.disconnect,
    listener: js.Function2[/* code */ scala.Double, /* data */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.error,
    listener: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_message(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.message,
    listener: js.Function1[/* message */ wsLib.wsMod.Data, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_raw(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.raw,
    listener: js.Function1[/* message */ wsLib.wsMod.Data, scala.Unit]
  ): this.type = js.native
  def send(data: js.Any, options: socketclusterDashServerLib.Anon_Binary): scala.Unit = js.native
  def sendObject(`object`: js.Any): scala.Unit = js.native
  def sendObject(`object`: js.Any, options: socketclusterDashServerLib.Anon_Batch): scala.Unit = js.native
  def sendObjectBatch(`object`: js.Any): scala.Unit = js.native
  def sendObjectSingle(`object`: js.Any): scala.Unit = js.native
  def setAuthToken(data: socketclusterDashServerLib.scserverMod.AuthToken): scala.Unit = js.native
  def setAuthToken(
    data: socketclusterDashServerLib.scserverMod.AuthToken,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions
  ): scala.Unit = js.native
  def setAuthToken(
    data: socketclusterDashServerLib.scserverMod.AuthToken,
    options: jsonwebtokenLib.jsonwebtokenMod.SignOptions,
    callback: EmitCallback
  ): scala.Unit = js.native
  def subscriptions(): js.Array[java.lang.String] = js.native
  def terminate(): scala.Unit = js.native
  @JSName("triggerAuthenticationEvents")
  def triggerAuthenticationEvents_authenticated(oldState: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticated): scala.Unit = js.native
  @JSName("triggerAuthenticationEvents")
  def triggerAuthenticationEvents_unauthenticated(oldState: socketclusterDashServerLib.socketclusterDashServerLibStrings.unauthenticated): scala.Unit = js.native
}

