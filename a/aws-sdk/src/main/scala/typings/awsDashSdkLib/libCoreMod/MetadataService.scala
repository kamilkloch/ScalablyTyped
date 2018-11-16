package typings
package awsDashSdkLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/core", "MetadataService")
@js.native
class MetadataService ()
  extends awsDashSdkLib.libMetadataUnderscoreServiceMod.MetadataService {
  /**
       * Creates a new MetadataService object with a given set of options.
       */
  def this(options: awsDashSdkLib.libMetadataUnderscoreServiceMod.MetadataServiceOptions) = this()
}

@JSImport("aws-sdk/lib/core", "MetadataService")
@js.native
object MetadataService extends js.Object {
  /**
       * 169.254.169.254
       */
  var host: java.lang.String = js.native
}
