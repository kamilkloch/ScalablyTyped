package typings
package apolloDashLinkLib.libLinkUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-link/lib/linkUtils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createOperation(starting: js.Any, operation: apolloDashLinkLib.libTypesMod.GraphQLRequest): apolloDashLinkLib.libTypesMod.Operation = js.native
  def fromError[T](errorValue: js.Any): zenDashObservableDashTsLib.libZenObservableMod.Observable[T] = js.native
  def fromPromise[T](promise: js.Promise[T]): zenDashObservableDashTsLib.libZenObservableMod.Observable[T] = js.native
  def getKey(operation: apolloDashLinkLib.libTypesMod.GraphQLRequest): java.lang.String = js.native
  def getOperationName(doc: graphqlLib.languageAstMod.DocumentNode): java.lang.String | scala.Null = js.native
  def isTerminating(link: apolloDashLinkLib.libLinkMod.ApolloLink): scala.Boolean = js.native
  def toPromise[R](observable: zenDashObservableDashTsLib.libZenObservableMod.Observable[R]): js.Promise[R] = js.native
  def transformOperation(operation: apolloDashLinkLib.libTypesMod.GraphQLRequest): apolloDashLinkLib.libTypesMod.GraphQLRequest = js.native
  def validateOperation(operation: apolloDashLinkLib.libTypesMod.GraphQLRequest): apolloDashLinkLib.libTypesMod.GraphQLRequest = js.native
}

