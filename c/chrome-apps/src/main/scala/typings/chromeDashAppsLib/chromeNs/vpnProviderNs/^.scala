package typings
package chromeDashAppsLib.chromeNs.vpnProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.vpnProvider")
@js.native
object ^ extends js.Object {
  /** Triggered when a configuration is created by the platform for the extension. */
  val onConfigCreated: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* id */ java.lang.String, 
      /* name */ java.lang.String, 
      /* data */ js.Object, 
      scala.Unit
    ]
  ] = js.native
  /** Triggered when a configuration created by the extension is removed by the platform. */
  val onConfigRemoved: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* id */ java.lang.String, scala.Unit]] = js.native
  /** Triggered when an IP packet is received via the tunnel for the VPN session owned by the extension. */
  val onPacketReceived: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* data */ stdLib.ArrayBuffer, scala.Unit]] = js.native
  /** Triggered when a message is received from the platform for a VPN configuration owned by the extension. */
  val onPlatformMessage: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* id */ java.lang.String, 
      /* message */ chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_CONNECTEDConnectedDISCONNECTED, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          chromeDashAppsLib.chromeDashAppsLibStrings.linkChanged | chromeDashAppsLib.chromeDashAppsLibStrings.linkUp | chromeDashAppsLib.chromeDashAppsLibStrings.suspend | chromeDashAppsLib.chromeDashAppsLibStrings.error | chromeDashAppsLib.chromeDashAppsLibStrings.connected | chromeDashAppsLib.chromeDashAppsLibStrings.resume | chromeDashAppsLib.chromeDashAppsLibStrings.disconnected | chromeDashAppsLib.chromeDashAppsLibStrings.linkDown
        ]
      ], 
      /* error */ java.lang.String, 
      scala.Unit
    ]
  ] = js.native
  /**
    * Triggered when there is a UI event for the extension.
    * UI events are signals from the platform that indicate to the app that a UI dialog needs to be shown to the user.
    */
  val onUIEvent: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* event */ chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_SHOWADDDIALOG, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          chromeDashAppsLib.chromeDashAppsLibStrings.showAddDialog | chromeDashAppsLib.chromeDashAppsLibStrings.showConfigureDialog
        ]
      ], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.native
  /**
    * Creates a new VPN configuration that persists across multiple login sessions of the user.
    * @param name The name of the VPN configuration.
    * @param callback Called when the configuration is created or if there is an error.
    * Parameter id: A unique ID for the created configuration, empty string on failure.
    */
  def createConfig(name: java.lang.String, callback: js.Function1[/* id */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Destroys a VPN configuration created by the extension.
    * @param id ID of the VPN configuration to destroy.
    * @param callback Called when the configuration is destroyed or if there is an error.
    */
  def destroyConfig(id: java.lang.String): scala.Unit = js.native
  def destroyConfig(id: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Notifies the VPN session state to the platform. This will succeed only when the VPN session is owned by the extension.
    * @param state The VPN session state of the VPN client.
    * connected: VPN connection was successful.
    * failure: VPN connection failed.
    * @see enum VpnConnectionState
    * @param callback Called when the notification is complete or if there is an error.
    */
  def notifyConnectionStateChanged(
    state: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_CONNECTEDConnected, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.connected | chromeDashAppsLib.chromeDashAppsLibStrings.failure
      ]
    ]
  ): scala.Unit = js.native
  def notifyConnectionStateChanged(
    state: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_CONNECTEDConnected, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.connected | chromeDashAppsLib.chromeDashAppsLibStrings.failure
      ]
    ],
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sends an IP packet through the tunnel created for the VPN session. This will succeed only when the VPN session is owned by the extension.
    * @param data The IP packet to be sent to the platform.
    * @param callback Called when the packet is sent or if there is an error.
    */
  def sendPacket(data: stdLib.ArrayBuffer): scala.Unit = js.native
  def sendPacket(data: stdLib.ArrayBuffer, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Sets the parameters for the VPN session. This should be called immediately after 'connected' is received from the platform. This will succeed only when the VPN session is owned by the extension.
    * @param parameters The parameters for the VPN session.
    * @param callback Called when the parameters are set or if there is an error.
    */
  def setParameters(parameters: VpnSessionParameters, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

