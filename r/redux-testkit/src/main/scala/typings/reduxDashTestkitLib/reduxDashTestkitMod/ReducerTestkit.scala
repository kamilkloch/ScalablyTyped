package typings
package reduxDashTestkitLib.reduxDashTestkitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReducerTestkit extends js.Object {
  def execute(action: reduxLib.reduxMod.Action[_]): js.Any
  def expect(action: reduxLib.reduxMod.Action[_]): reduxDashTestkitLib.Anon_Expected
}

object ReducerTestkit {
  @scala.inline
  def apply(
    execute: reduxLib.reduxMod.Action[_] => js.Any,
    expect: reduxLib.reduxMod.Action[_] => reduxDashTestkitLib.Anon_Expected
  ): ReducerTestkit = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction1(execute), expect = js.Any.fromFunction1(expect))
  
    __obj.asInstanceOf[ReducerTestkit]
  }
}

