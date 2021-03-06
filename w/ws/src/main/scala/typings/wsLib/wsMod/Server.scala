package typings
package wsLib.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// WebSocket Server
@JSImport("ws", "Server")
@js.native
class Server ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: ServerOptions) = this()
  def this(options: ServerOptions, callback: js.Function0[scala.Unit]) = this()
  var clients: stdLib.Set[WebSocket] = js.native
  var options: ServerOptions = js.native
  var path: java.lang.String = js.native
  @JSName("addListener")
  def addListener_connection(event: wsLib.wsLibStrings.connection, cb: js.Function1[/* client */ WebSocket, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: wsLib.wsLibStrings.error, cb: js.Function1[/* err */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_headers(
    event: wsLib.wsLibStrings.headers,
    cb: js.Function2[
      /* headers */ js.Array[java.lang.String], 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_listening(event: wsLib.wsLibStrings.listening, cb: js.Function0[scala.Unit]): this.type = js.native
  def address(): AddressInfo | java.lang.String = js.native
  def close(): scala.Unit = js.native
  def close(cb: js.Function1[/* err */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def handleUpgrade(
    request: nodeLib.httpMod.IncomingMessage,
    socket: nodeLib.netMod.Socket,
    upgradeHead: nodeLib.Buffer,
    callback: js.Function1[/* client */ WebSocket, scala.Unit]
  ): scala.Unit = js.native
  def on(
    event: java.lang.String,
    listener: js.ThisFunction1[/* this */ WebSocket, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  def on(
    event: js.Symbol,
    listener: js.ThisFunction1[/* this */ WebSocket, /* repeated */ js.Any, scala.Unit]
  ): this.type = js.native
  // Events
  @JSName("on")
  def on_connection(
    event: wsLib.wsLibStrings.connection,
    cb: js.ThisFunction2[
      /* this */ WebSocket, 
      /* socket */ WebSocket, 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: wsLib.wsLibStrings.error,
    cb: js.ThisFunction1[/* this */ WebSocket, /* error */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_headers(
    event: wsLib.wsLibStrings.headers,
    cb: js.ThisFunction2[
      /* this */ WebSocket, 
      /* headers */ js.Array[java.lang.String], 
      /* request */ nodeLib.httpMod.IncomingMessage, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_listening(event: wsLib.wsLibStrings.listening, cb: js.ThisFunction0[/* this */ WebSocket, scala.Unit]): this.type = js.native
  def shouldHandle(request: nodeLib.httpMod.IncomingMessage): scala.Boolean = js.native
}

