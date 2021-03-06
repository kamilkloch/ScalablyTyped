package typings
package reactDashResolverLib.reactDashResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-resolver", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Resolver: reactDashResolverLib.reactDashResolverMod.Resolver = js.native
  def client(loadingComponent: reactLib.reactMod.ComponentType[_]): js.Function1[
    /* component */ reactLib.reactMod.ComponentType[_], 
    reactLib.reactMod.StatelessComponent[_]
  ] = js.native
  def context[K /* <: java.lang.String */](prop: K): js.Function1[
    /* component */ reactLib.reactMod.ComponentType[_], 
    reactLib.reactMod.StatelessComponent[js.Any with (stdLib.Record[K, _])]
  ] = js.native
  def resolve[OwnProps, ResolvableProps, MoreProps](
    resolversMap: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof ResolvableProps ]: react-resolver.react-resolver.ResolveFn<OwnProps & MoreProps, ResolvableProps[K]>}
    */ reactDashResolverLib.reactDashResolverLibStrings.resolve with ResolvableProps
  ): js.Function1[
    /* component */ reactLib.reactMod.ComponentType[
      OwnProps with reactDashResolverLib.reactDashResolverLibStrings.resolve with ResolvableProps
    ], 
    reactLib.reactMod.StatelessComponent[OwnProps with MoreProps]
  ] = js.native
  def resolve[OwnProps, K /* <: java.lang.String */, V, MoreProps](prop: K, resolveFn: ResolveFn[OwnProps with MoreProps, V]): js.Function1[
    /* component */ reactLib.reactMod.ComponentType[
      OwnProps with reactDashResolverLib.reactDashResolverLibStrings.resolve with js.Any
    ], 
    reactLib.reactMod.StatelessComponent[OwnProps with MoreProps]
  ] = js.native
}

