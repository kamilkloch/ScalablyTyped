package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcRender3InterfacesDefinitionMod {
  type ComponentDefFeature = js.Function1[/* componentDef */ ComponentDef[js.Any], scala.Unit]
  type ComponentDefWithMeta[T, Selector /* <: java.lang.String */, ExportAs /* <: java.lang.String */, InputMap /* <: ScalablyTyped.runtime.StringDictionary[java.lang.String] */, OutputMap /* <: ScalablyTyped.runtime.StringDictionary[java.lang.String] */, QueryFields /* <: js.Array[java.lang.String] */] = ComponentDef[T]
  type ComponentQuery[T] = ComponentTemplate[T]
  type DirectiveDefFeature = js.Function1[/* directiveDef */ DirectiveDef[js.Any], scala.Unit]
  type DirectiveDefList = js.Array[DirectiveDef[js.Any] | ComponentDef[js.Any]]
  type DirectiveDefListOrFactory = js.Function0[DirectiveDefList] | DirectiveDefList
  type DirectiveDefWithMeta[T, Selector /* <: java.lang.String */, ExportAs /* <: java.lang.String */, InputMap /* <: ScalablyTyped.runtime.StringDictionary[java.lang.String] */, OutputMap /* <: ScalablyTyped.runtime.StringDictionary[java.lang.String] */, QueryFields /* <: js.Array[java.lang.String] */] = DirectiveDef[T]
  type DirectiveTypeList = js.Array[
    DirectiveDef[js.Any] | ComponentDef[js.Any] | atAngularCoreLib.srcTypeMod.Type[js.Any]
  ]
  type DirectiveTypesOrFactory = js.Function0[DirectiveTypeList] | DirectiveTypeList
  type HostBindingsFunction = js.Function2[/* directiveIndex */ scala.Double, /* elementIndex */ scala.Double, scala.Unit]
  type PipeDefList = js.Array[PipeDef[js.Any]]
  type PipeDefListOrFactory = js.Function0[PipeDefList] | PipeDefList
  type PipeDefWithMeta[T, Name /* <: java.lang.String */] = PipeDef[T]
  type PipeTypeList = js.Array[PipeDef[js.Any] | atAngularCoreLib.srcTypeMod.Type[js.Any]]
  type PipeTypesOrFactory = js.Function0[DirectiveTypeList] | DirectiveTypeList
}