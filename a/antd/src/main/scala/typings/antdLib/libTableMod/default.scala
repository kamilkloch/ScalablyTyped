package typings
package antdLib.libTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/table", JSImport.Default)
@js.native
class default[T] protected ()
  extends antdLib.libTableTableMod.default[T] {
  def this(props: antdLib.libTableInterfaceMod.TableProps[T]) = this()
}

@JSImport("antd/lib/table", JSImport.Default)
@js.native
object default extends js.Object {
  var Column: ScalablyTyped.runtime.Instantiable0[antdLib.libTableColumnMod.default[js.Object]] = js.native
  var ColumnGroup: ScalablyTyped.runtime.Instantiable0[antdLib.libTableColumnGroupMod.default] = js.native
  var defaultProps: antdLib.Anon_Bordered = js.native
  var propTypes: antdLib.Anon_BorderedSize = js.native
}
