package typings
package ternLib.libInferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  /** The primitive boolean type. */
  var bool: Type
  /** The primitive number type. */
  var num: Type
  var parent: js.UndefOr[ternLib.libTernMod.Server] = js.undefined
  /** The primitive string type. */
  var str: Type
  var topScope: Scope
}

@JSImport("tern/lib/infer", "Context")
@js.native
class ContextCls protected () extends Context {
  def this(defs: js.Array[_], parent: ternLib.libTernMod.Server) = this()
  /** The primitive boolean type. */
  /* CompleteClass */
  override var bool: Type = js.native
  /** The primitive number type. */
  /* CompleteClass */
  override var num: Type = js.native
  /** The primitive string type. */
  /* CompleteClass */
  override var str: Type = js.native
  /* CompleteClass */
  override var topScope: Scope = js.native
}

object Context {
  @scala.inline
  def apply(bool: Type, num: Type, str: Type, topScope: Scope, parent: ternLib.libTernMod.Server = null): Context = {
    val __obj = js.Dynamic.literal(bool = bool, num = num, str = str, topScope = topScope)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Context]
  }
}

