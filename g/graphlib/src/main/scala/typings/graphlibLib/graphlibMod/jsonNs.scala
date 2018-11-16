package typings
package graphlibLib.graphlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphlib", "json")
@js.native
object jsonNs extends js.Object {
  /**
  		 * Takes JSON as input and returns the graph representation.
  		 *
  		 * @example
  		 * var g2 = graphlib.json.read(JSON.parse(str));
  		 * g2.nodes();
  		 * // ['a', 'b']
  		 * g2.edges()
  		 * // [ { v: 'a', w: 'b' } ]
  		 * 
  		 * @argument json - JSON serializable graph representation
  		 * @returns graph constructed acccording to specified representation
  		 */
  def read(json: js.Object): graphlibLib.graphlibMod.Graph = js.native
  /**
  		 * Creates a JSON representation of the graph that can be serialized to a string with
  		 * JSON.stringify. The graph can later be restored using json.read.
  		 * 
  		 * @argument graph - target to create JSON representation of.
  		 * @returns JSON serializable graph representation
  		 */
  def write(graph: graphlibLib.graphlibMod.Graph): js.Object = js.native
}
