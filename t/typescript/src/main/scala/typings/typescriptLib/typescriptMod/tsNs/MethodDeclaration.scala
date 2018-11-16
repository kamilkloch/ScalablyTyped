package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typescriptLib.typescriptMod.tsNs.ObjectLiteralElement because Would inherit conflicting mutable fields List(pos, end, parent, flags, decorators, modifiers, kind, _declarationBrand, name), typescriptLib.typescriptMod.tsNs.ClassElement because Would inherit conflicting mutable fields List(pos, end, parent, flags, decorators, modifiers, kind, _declarationBrand, name))*/
@js.native
trait MethodDeclaration extends FunctionLikeDeclarationBase {
  @JSName("body")
  var body_MethodDeclaration: js.UndefOr[FunctionBody] = js.native
  @JSName("name")
  var name_MethodDeclaration: PropertyName = js.native
  @JSName("parent")
  var parent_MethodDeclaration: ClassLikeDeclaration | ObjectLiteralExpression = js.native
}
