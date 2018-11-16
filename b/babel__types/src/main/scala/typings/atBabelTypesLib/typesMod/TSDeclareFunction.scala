package typings
package atBabelTypesLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TSDeclareFunction extends BaseNode {
  var async: scala.Boolean
  var declare: scala.Boolean | scala.Null
  var generator: scala.Boolean
  var id: Identifier | scala.Null
  var params: js.Array[LVal]
  var returnType: TSTypeAnnotation | Noop | scala.Null
  var typeParameters: TSTypeParameterDeclaration | Noop | scala.Null
  @JSName("type")
  var type_TSDeclareFunction: atBabelTypesLib.atBabelTypesLibStrings.TSDeclareFunction
}
