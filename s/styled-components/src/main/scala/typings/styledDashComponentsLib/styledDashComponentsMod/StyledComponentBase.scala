package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent styled-components.ForwardRefExoticBase<styled-components.styled-components.StyledComponentProps<C, T, O, A>> */
@js.native
trait StyledComponentBase[C /* <: java.lang.String */, T /* <: js.Object */, O /* <: js.Object */, A /* <: java.lang.String */] extends js.Object {
  @JSName("$$typeof")
  var $$typeof: js.Symbol = js.native
  var defaultProps: js.UndefOr[
    stdLib.Partial[
      StyledComponentProps[C, reactLib.reactMod.ForwardRefExoticComponent[StyledComponentProps[C, T, O, A]], O, A]
    ]
  ] = js.native
  var displayName: js.UndefOr[java.lang.String] = js.native
  // add our own fake call signature to implement the polymorphic 'as' prop
  // NOTE: TS <3.2 will refuse to infer the generic and this component becomes impossible to use in JSX
  // just the presence of the overload is enough to break JSX
  //
  // TODO (TypeScript 3.2): actually makes the 'as' prop polymorphic
  // (
  //     props: StyledComponentProps<C, T, O, A> & { as?: never }
  //   ): React.ReactElement<StyledComponentProps<C, T, O, A>>
  // <AsC extends keyof JSX.IntrinsicElements | React.ComponentType<any> = C>(
  //   props: StyledComponentPropsWithAs<AsC, T, O, A>
  // ): React.ReactElement<StyledComponentPropsWithAs<AsC, T, O, A>>
  // TODO (TypeScript 3.2): delete this overload
  def apply(props: (StyledComponentProps[C, T, O, A]) with styledDashComponentsLib.Anon_As): reactLib.reactMod.ReactElement[StyledComponentProps[C, T, O, A]] = js.native
  def withComponent[WithC /* <: java.lang.String */](component: WithC): StyledComponent[WithC, T, O, A] = js.native
  @JSName("withComponent")
  def withComponent_WithCAnyStyledComponent[WithC /* <: AnyStyledComponent */](component: WithC): StyledComponent[
    StyledComponentInnerComponent[WithC], 
    T, 
    O with StyledComponentInnerOtherProps[WithC], 
    A | StyledComponentInnerAttrs[WithC]
  ] = js.native
}

