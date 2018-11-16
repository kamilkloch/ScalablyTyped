package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Cached module resolutions per containing directory.
     * This assumes that any module id will have the same resolution for sibling files located in the same folder.
     */

trait ModuleResolutionCache extends NonRelativeModuleNameResolutionCache {
  def getOrCreateCacheForDirectory(directoryName: java.lang.String): Map[ResolvedModuleWithFailedLookupLocations]
}
