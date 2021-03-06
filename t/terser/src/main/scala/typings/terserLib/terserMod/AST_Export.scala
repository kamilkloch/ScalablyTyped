package typings
package terserLib.terserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AST_Export extends AST_Node {
  var exported_definition: AST_Definitions | AST_Lambda | AST_DefClass | scala.Null = js.native
  var exported_names: js.Array[AST_NameMapping] = js.native
  var exported_value: AST_Node | scala.Null = js.native
  var is_default: scala.Boolean = js.native
  var module_name: AST_String = js.native
}

