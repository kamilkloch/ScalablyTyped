package typings
package readDashConfigDashFileLib.readDashConfigDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-config-file", JSImport.Namespace)
@js.native
object readDashConfigDashFileModMembers extends js.Object {
  def findAndReadConfig[T](request: ReadConfigRequest): stdLib.Promise[ReadConfigResult[T] | scala.Null] = js.native
  def getConfig[T](request: ReadConfigRequest): stdLib.Promise[ReadConfigResult[T] | scala.Null] = js.native
  def getConfig[T](request: ReadConfigRequest, configPath: java.lang.String): stdLib.Promise[ReadConfigResult[T] | scala.Null] = js.native
  def loadConfig[T](request: ReadConfigRequest): stdLib.Promise[ReadConfigResult[T] | scala.Null] = js.native
  def loadEnv(envFile: java.lang.String): stdLib.Promise[ScalablyTyped.runtime.StringDictionary[java.lang.String] | scala.Null] = js.native
  def loadParentConfig[T](request: ReadConfigRequest, spec: java.lang.String): stdLib.Promise[ReadConfigResult[T]] = js.native
  def orIfFileNotExist[T](promise: stdLib.Promise[T], fallbackValue: T): stdLib.Promise[T] = js.native
  def orNullIfFileNotExist[T](promise: stdLib.Promise[T]): stdLib.Promise[T | scala.Null] = js.native
  def readConfig[T](configFile: java.lang.String): stdLib.Promise[ReadConfigResult[T]] = js.native
  def validateConfig(
    config: js.Any,
    scheme: lazyDashValLib.lazyDashValMod.Lazy[_],
    errorMessage: js.Function2[
      /* error */ java.lang.String, 
      /* errors */ js.Array[ajvLib.ajvMod.ajvNs.ErrorObject], 
      java.lang.String
    ]
  ): stdLib.Promise[scala.Unit] = js.native
}
