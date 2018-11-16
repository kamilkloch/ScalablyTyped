package typings
package opticsDashAgentLib.opticsDashAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("optics-agent", "Agent")
@js.native
class Agent protected () extends js.Object {
  def this(options: Options) = this()
  def configureAgent(options: Options): Agent = js.native
  def context(req: expressLib.expressMod.eNs.Request): js.Any = js.native
  def instrumentHapiServer(server: hapiLib.hapiMod.Server): scala.Unit = js.native
  def instrumentSchema(schema: graphqlLib.graphqlMod.GraphQLSchema): scala.Unit = js.native
  def koaMiddleware(): js.Function2[
    /* context */ koaLib.koaMod.ApplicationNs.Context, 
    /* next */ js.Function0[stdLib.Promise[_]], 
    scala.Unit
  ] = js.native
  def middleware(): js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    /* next */ js.UndefOr[js.Any], 
    scala.Unit
  ] = js.native
}
