package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainingFileName extends js.Object {
  def resourceNameToFileName(resourceName: java.lang.String, containingFileName: java.lang.String): java.lang.String | scala.Null
}

object Anon_ContainingFileName {
  @scala.inline
  def apply(resourceNameToFileName: (java.lang.String, java.lang.String) => java.lang.String | scala.Null): Anon_ContainingFileName = {
    val __obj = js.Dynamic.literal(resourceNameToFileName = js.Any.fromFunction2(resourceNameToFileName))
  
    __obj.asInstanceOf[Anon_ContainingFileName]
  }
}

