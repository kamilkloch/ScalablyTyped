package typings
package stackDashMapperLib.stackDashMapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stack-mapper", JSImport.Namespace)
@js.native
object stackDashMapperModMembers extends js.Object {
  /**
   * Returns a Stackmapper that will use the given source map to map error trace locations.
   *
   * @name stackMapper
   * @function
   * @param {Object} sourcemap source map for the generated file
   * @return {StackMapper} stack mapper for the particular source map
   */
  def apply(sourcemap: js.Any): stackDashMapperLib.stackDashMapperMod.stackMapperNs.StackMapper = js.native
}
