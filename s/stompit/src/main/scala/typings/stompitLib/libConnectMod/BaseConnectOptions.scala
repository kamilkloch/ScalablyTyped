package typings
package stompitLib.libConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseConnectOptions
  extends stompitLib.libSocketMod.SocketOptions {
  var connect: js.UndefOr[
    js.Function2[
      /* options */ ConnectOptions, 
      /* connectionListener */ js.UndefOr[js.Function0[scala.Unit]], 
      nodeLib.netMod.Socket
    ]
  ] = js.undefined
  var connectHeaders: js.UndefOr[ConnectHeaders] = js.undefined
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
}

object BaseConnectOptions {
  @scala.inline
  def apply(
    commandHandlers: stompitLib.libSocketMod.CommandHandlers = null,
    connect: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[js.Function0[scala.Unit]]) => nodeLib.netMod.Socket = null,
    connectHeaders: ConnectHeaders = null,
    heartbeat: stompitLib.libSocketMod.Heartbeat = null,
    heartbeatDelayMargin: scala.Int | scala.Double = null,
    heartbeatOutputMargin: scala.Int | scala.Double = null,
    outgoingFrameStream: stompitLib.libOutgoingFrameStreamMod.^ = null,
    resetDisconnect: js.UndefOr[scala.Boolean] = js.undefined,
    ssl: js.UndefOr[scala.Boolean] = js.undefined,
    unknownCommand: () => scala.Unit = null
  ): BaseConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (commandHandlers != null) __obj.updateDynamic("commandHandlers")(commandHandlers)
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction2(connect))
    if (connectHeaders != null) __obj.updateDynamic("connectHeaders")(connectHeaders)
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat)
    if (heartbeatDelayMargin != null) __obj.updateDynamic("heartbeatDelayMargin")(heartbeatDelayMargin.asInstanceOf[js.Any])
    if (heartbeatOutputMargin != null) __obj.updateDynamic("heartbeatOutputMargin")(heartbeatOutputMargin.asInstanceOf[js.Any])
    if (outgoingFrameStream != null) __obj.updateDynamic("outgoingFrameStream")(outgoingFrameStream)
    if (!js.isUndefined(resetDisconnect)) __obj.updateDynamic("resetDisconnect")(resetDisconnect)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    if (unknownCommand != null) __obj.updateDynamic("unknownCommand")(js.Any.fromFunction0(unknownCommand))
    __obj.asInstanceOf[BaseConnectOptions]
  }
}

