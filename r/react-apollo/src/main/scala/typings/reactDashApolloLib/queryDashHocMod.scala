package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-apollo/query-hoc", JSImport.Namespace)
@js.native
object queryDashHocMod extends js.Object {
  def withQuery[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](document: graphqlLib.languageAstMod.DocumentNode): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[TProps with TChildProps], 
    reactLib.reactMod.ComponentClass[TProps, _]
  ] = js.native
  def withQuery[TProps /* <: TGraphQLVariables | js.Object */, TData, TGraphQLVariables, TChildProps](
    document: graphqlLib.languageAstMod.DocumentNode,
    operationOptions: reactDashApolloLib.typesMod.OperationOption[TProps, TData, TGraphQLVariables, TChildProps]
  ): js.Function1[
    /* WrappedComponent */ reactLib.reactMod.ComponentType[TProps with TChildProps], 
    reactLib.reactMod.ComponentClass[TProps, _]
  ] = js.native
}

