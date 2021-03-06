package typings
package angularDashOdataDashResourcesLib.ODataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Instance calls always return the the promise of the request which retrieved the object
// https://github.com/angular/angular.js/blob/v1.2.0/src/ngResource/resource.js#L538-L546
@js.native
trait IResource[T] extends js.Object {
  /** the promise of the original server interaction that created this instance. **/
  @JSName("$promise")
  var $promise: angularLib.angularMod.IPromise[T] = js.native
  @JSName("$resolved")
  var $resolved: scala.Boolean = js.native
  @JSName("$delete")
  def $delete(): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.Object): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.Object, success: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(params: js.Object, success: js.Function, error: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(success: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$delete")
  def $delete(success: js.Function, error: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$get")
  def $get(): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.Object): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.Object, success: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$get")
  def $get(params: js.Object, success: js.Function, error: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$get")
  def $get(success: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$get")
  def $get(success: js.Function, error: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$query")
  def $query(): angularLib.angularMod.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.Object): angularLib.angularMod.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.Object, success: js.Function): angularLib.angularMod.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(params: js.Object, success: js.Function, error: js.Function): angularLib.angularMod.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(success: js.Function): angularLib.angularMod.IPromise[IResourceArray[T]] = js.native
  @JSName("$query")
  def $query(success: js.Function, error: js.Function): angularLib.angularMod.IPromise[IResourceArray[T]] = js.native
  @JSName("$remove")
  def $remove(): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.Object): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.Object, success: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(params: js.Object, success: js.Function, error: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(success: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$remove")
  def $remove(success: js.Function, error: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$save")
  def $save(): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.Object): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.Object, success: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$save")
  def $save(params: js.Object, success: js.Function, error: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$save")
  def $save(success: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$save")
  def $save(success: js.Function, error: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$update")
  def $update(): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$update")
  def $update(params: js.Object): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$update")
  def $update(params: js.Object, success: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$update")
  def $update(params: js.Object, success: js.Function, error: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$update")
  def $update(success: js.Function): angularLib.angularMod.IPromise[T] = js.native
  @JSName("$update")
  def $update(success: js.Function, error: js.Function): angularLib.angularMod.IPromise[T] = js.native
}

