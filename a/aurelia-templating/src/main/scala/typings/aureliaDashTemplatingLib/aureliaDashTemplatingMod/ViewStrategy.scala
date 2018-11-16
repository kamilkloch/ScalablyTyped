package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewStrategy extends js.Object {
  /**
      * Loads a view factory.
      * @param viewEngine The view engine to use during the load process.
      * @param compileInstruction Additional instructions to use during compilation of the view.
      * @param loadContext The loading context used for loading all resources and dependencies.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise for the view factory that is produced by this strategy.
      */
  def loadViewFactory(viewEngine: ViewEngine, compileInstruction: ViewCompileInstruction): stdLib.Promise[ViewFactory] = js.native
  /**
      * Loads a view factory.
      * @param viewEngine The view engine to use during the load process.
      * @param compileInstruction Additional instructions to use during compilation of the view.
      * @param loadContext The loading context used for loading all resources and dependencies.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise for the view factory that is produced by this strategy.
      */
  def loadViewFactory(
    viewEngine: ViewEngine,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext
  ): stdLib.Promise[ViewFactory] = js.native
  /**
      * Loads a view factory.
      * @param viewEngine The view engine to use during the load process.
      * @param compileInstruction Additional instructions to use during compilation of the view.
      * @param loadContext The loading context used for loading all resources and dependencies.
      * @param target A class from which to extract metadata of additional resources to load.
      * @return A promise for the view factory that is produced by this strategy.
      */
  def loadViewFactory(
    viewEngine: ViewEngine,
    compileInstruction: ViewCompileInstruction,
    loadContext: ResourceLoadContext,
    target: js.Any
  ): stdLib.Promise[ViewFactory] = js.native
}
