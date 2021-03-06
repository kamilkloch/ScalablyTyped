package typings
package tsutilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilUtilMod {
  type BooleanCompilerOptions = js.Any
  type ForEachCommentCallback = js.Function2[
    /* fullText */ java.lang.String, 
    /* comment */ typescriptLib.typescriptMod.CommentRange, 
    scala.Unit
  ]
  type ForEachTokenCallback = js.Function4[
    /* fullText */ java.lang.String, 
    /* kind */ typescriptLib.typescriptMod.SyntaxKind, 
    /* range */ typescriptLib.typescriptMod.TextRange, 
    /* parent */ typescriptLib.typescriptMod.Node, 
    scala.Unit
  ]
}
