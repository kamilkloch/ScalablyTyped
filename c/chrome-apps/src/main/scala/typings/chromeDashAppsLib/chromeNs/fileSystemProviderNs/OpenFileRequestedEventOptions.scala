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
      chromeDashAppsLib.chromeDashAppsLibStrings.READ | chromeDashAppsLib.chromeDashAppsLibStrings.WRITE
    ]
  ]
}

object OpenFileRequestedEventOptions {
  @scala.inline
  def apply(
    filePath: java.lang.String,
    fileSystemId: java.lang.String,
    mode: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_READ, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.READ | chromeDashAppsLib.chromeDashAppsLibStrings.WRITE
      ]
    ],
    requestId: chromeDashAppsLib.chromeNs.integer
  ): OpenFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath, fileSystemId = fileSystemId, mode = mode.asInstanceOf[js.Any], requestId = requestId)
  
    __obj.asInstanceOf[OpenFileRequestedEventOptions]
  }
}

