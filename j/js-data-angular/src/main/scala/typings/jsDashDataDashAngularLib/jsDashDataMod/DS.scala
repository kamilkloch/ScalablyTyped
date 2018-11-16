package typings
package jsDashDataDashAngularLib.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DS extends js.Object {
  def bindAll[T](
    resourceName: java.lang.String,
    params: js.Any,
    scope: angularLib.angularMod.angularNs.IScope,
    expr: java.lang.String
  ): js.Function = js.native
  def bindAll[T](
    resourceName: java.lang.String,
    params: js.Any,
    scope: angularLib.angularMod.angularNs.IScope,
    expr: java.lang.String,
    cb: js.Function2[/* err */ js.Any, /* items */ js.Array[T with js.Any], scala.Unit]
  ): js.Function = js.native
  def bindOne[T](
    resourceName: java.lang.String,
    id: java.lang.String,
    scope: angularLib.angularMod.angularNs.IScope,
    expr: java.lang.String
  ): js.Function = js.native
  def bindOne[T](
    resourceName: java.lang.String,
    id: java.lang.String,
    scope: angularLib.angularMod.angularNs.IScope,
    expr: java.lang.String,
    cb: js.Function2[/* err */ js.Any, /* item */ T with js.Any, scala.Unit]
  ): js.Function = js.native
  def bindOne[T](
    resourceName: java.lang.String,
    id: scala.Double,
    scope: angularLib.angularMod.angularNs.IScope,
    expr: java.lang.String
  ): js.Function = js.native
  def bindOne[T](
    resourceName: java.lang.String,
    id: scala.Double,
    scope: angularLib.angularMod.angularNs.IScope,
    expr: java.lang.String,
    cb: js.Function2[/* err */ js.Any, /* item */ T with js.Any, scala.Unit]
  ): js.Function = js.native
}
