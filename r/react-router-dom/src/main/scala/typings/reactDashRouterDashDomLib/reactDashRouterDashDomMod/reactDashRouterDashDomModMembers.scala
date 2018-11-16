package typings
package reactDashRouterDashDomLib.reactDashRouterDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-router-dom", JSImport.Namespace)
@js.native
object reactDashRouterDashDomModMembers extends js.Object {
  def generatePath(pattern: java.lang.String): java.lang.String = js.native
  def generatePath(
    pattern: java.lang.String,
    params: ScalablyTyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean]
  ): java.lang.String = js.native
  def matchPath[Params /* <: reactDashRouterDashDomLib.reactDashRouterDashDomLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: java.lang.String): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: reactDashRouterDashDomLib.reactDashRouterDashDomLibStrings.matchPath with js.Any */](
    pathname: java.lang.String,
    props: java.lang.String,
    parent: reactDashRouterLib.reactDashRouterMod.`match`[Params]
  ): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: reactDashRouterDashDomLib.reactDashRouterDashDomLibStrings.matchPath with js.Any */](pathname: java.lang.String, props: reactDashRouterLib.reactDashRouterMod.RouteProps): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def matchPath[Params /* <: reactDashRouterDashDomLib.reactDashRouterDashDomLibStrings.matchPath with js.Any */](
    pathname: java.lang.String,
    props: reactDashRouterLib.reactDashRouterMod.RouteProps,
    parent: reactDashRouterLib.reactDashRouterMod.`match`[Params]
  ): reactDashRouterLib.reactDashRouterMod.`match`[Params] | scala.Null = js.native
  def withRouter[P /* <: reactDashRouterLib.reactDashRouterMod.RouteComponentProps[
    _, 
    reactDashRouterLib.reactDashRouterMod.StaticContext, 
    historyLib.historyMod.LocationState
  ] */](component: reactLib.reactMod.ReactNs.ComponentType[P]): reactLib.reactMod.ReactNs.ComponentClass[
    reactDashRouterLib.reactDashRouterMod.Omit[reactDashRouterLib.reactDashRouterMod.Omit[P, java.lang.String], java.lang.String], 
    reactLib.reactMod.ReactNs.ComponentState
  ] = js.native
}
