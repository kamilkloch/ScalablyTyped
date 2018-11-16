package typings
package chromeDashAppsLib.chromeNs.usbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Since Chrome 29. */

trait EndpointDescriptor extends js.Object {
  /** Transfer type. */
  var address: chromeDashAppsLib.chromeNs.integer
  /**
               * Transfer direction.
               * @see Direction
               */
  var direction: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_IN, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_IN))),List()),Left(TsIdentSimple(K))) */js.Any
    ]
  ]
  /**
               * Extra descriptor data associated with this endpoint.
               * @since Chrome 39.
               */
  var extra_data: stdLib.ArrayBuffer
  /** Maximum packet size. */
  var maximumPacketSize: chromeDashAppsLib.chromeNs.integer
  /** Polling interval (interrupt and isochronous only). */
  var pollingInterval: js.UndefOr[chromeDashAppsLib.chromeNs.integer] = js.undefined
  /**
               * Transfer synchronization mode (isochronous only).
               * @see SynchronizationType
               */
  var synchronization: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ADAPTIVE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_ADAPTIVE))),List()),Left(TsIdentSimple(K))) */js.Any
      ]
    ]
  ] = js.undefined
  /**
               * Transfer type.
               * @see TransferType
               *
               */
  var `type`: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_ISOCHRONOUS, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_ISOCHRONOUS))),List()),Left(TsIdentSimple(K))) */js.Any
    ]
  ]
  /**
               * Endpoint usage hint
               * @see UsageType
               */
  var usage: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_PERIODIC, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_PERIODIC))),List()),Left(TsIdentSimple(K))) */js.Any
      ]
    ]
  ] = js.undefined
}
