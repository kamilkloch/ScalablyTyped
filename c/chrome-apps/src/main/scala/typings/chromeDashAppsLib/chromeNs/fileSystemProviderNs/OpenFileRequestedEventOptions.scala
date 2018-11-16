package typings
package chromeDashAppsLib.chromeNs.fileSystemProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OpenFileRequestedEventOptions
  extends chromeDashAppsLib.chromeNs.fileSystemProviderNs.underscoreInternalUnderscoreNs.FilePathRequestedEventOptions {
  /**
               * Whether the file will be used for reading or writing.
               * @see ChangeType
               */
  var mode: chromeDashAppsLib.chromeNs.ToStringLiteral[
    chromeDashAppsLib.Anon_READ, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(chrome-apps), TsIdentSimple(Anon_READ))),List()),Left(TsIdentSimple(K))) */js.Any
    ]
  ]
}
