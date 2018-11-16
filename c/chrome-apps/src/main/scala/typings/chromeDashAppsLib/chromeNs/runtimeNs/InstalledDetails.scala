package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InstalledDetails extends js.Object {
  /**
               * Optional.
               * Indicates the ID of the imported shared module extension which updated. This is present only if 'reason' is 'shared_module_update'.
               * @since Chrome 29.
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional.
               * Indicates the previous version of the extension, which has just been updated. This is present only if 'reason' is 'update'.
               */
  var previousVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The reason that this event is being dispatched.
               * @see enum OnInstalledReason
               */
  var reason: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_CHROMEUPDATE, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_CHROMEUPDATE))),List()),Left(TsIdentSimple(K))) */js.Any
    ]
  ]
}
