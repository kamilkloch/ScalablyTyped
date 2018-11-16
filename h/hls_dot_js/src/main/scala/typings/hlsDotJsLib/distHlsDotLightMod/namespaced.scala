package typings
package hlsDotJsLib.distHlsDotLightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hls.js/dist/hls.light", JSImport.Namespace)
@js.native
class namespaced ()
  extends hlsDotJsLib.hlsDotJsMod.namespaced {
  /**
       * Constructor. Can be provided an HlsConfig object as default properties and or overrides
       */
  def this(config: stdLib.Partial[hlsDotJsLib.hlsDotJsMod.HlsNs.Config]) = this()
}

@JSImport("hls.js/dist/hls.light", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
       * override Hls default configuration
       * this configuration will be applied by default to all instances
       */
  var DefaultConfig: hlsDotJsLib.hlsDotJsMod.HlsNs.Config = js.native
  /**
       * Hls error details
       */
  var ErrorDetails: hlsDotJsLib.Anon_AUDIOTRACKLOADTIMEOUT = js.native
  /**
       * Hls error types
       */
  var ErrorTypes: hlsDotJsLib.Anon_OTHERERROR = js.native
  /**
       * Hls events
       */
  var Events: hlsDotJsLib.Anon_FRAGDECRYPTED = js.native
  /**
       * returns hls.js dist version number
       */
  var version: java.lang.String = js.native
  /**
       * checks whether your browser is supporting MediaSource Extensions
       */
  def isSupported(): scala.Boolean = js.native
}
