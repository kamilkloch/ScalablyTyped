package typings
package jsforceLib.apiAnalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/analytics", "Dashboard")
@js.native
class Dashboard () extends js.Object {
  def clone(name: java.lang.String, folderid: java.lang.String): stdLib.Promise[_] = js.native
  def clone(
    name: java.lang.String,
    folderid: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Object]
  ): stdLib.Promise[_] = js.native
  def clone(name: js.Object, folderid: java.lang.String): stdLib.Promise[_] = js.native
  def clone(
    name: js.Object,
    folderid: java.lang.String,
    callback: jsforceLib.connectionMod.Callback[js.Object]
  ): stdLib.Promise[_] = js.native
  def components(componentIds: js.Function0[_ | js.Array[java.lang.String] | java.lang.String]): stdLib.Promise[_] = js.native
  def components(
    componentIds: js.Function0[_ | js.Array[java.lang.String] | java.lang.String],
    callback: jsforceLib.connectionMod.Callback[js.Object]
  ): stdLib.Promise[_] = js.native
  def del(): stdLib.Promise[_] = js.native
  def del(callback: jsforceLib.connectionMod.Callback[js.Object]): stdLib.Promise[_] = js.native
  def delete(): stdLib.Promise[_] = js.native
  def delete(callback: jsforceLib.connectionMod.Callback[js.Object]): stdLib.Promise[_] = js.native
  def describe(): stdLib.Promise[_] = js.native
  def describe(callback: jsforceLib.connectionMod.Callback[js.Object]): stdLib.Promise[_] = js.native
  def destory(): stdLib.Promise[_] = js.native
  def destory(callback: jsforceLib.connectionMod.Callback[js.Object]): stdLib.Promise[_] = js.native
  def refresh(): stdLib.Promise[_] = js.native
  def refresh(callback: jsforceLib.connectionMod.Callback[js.Object]): stdLib.Promise[_] = js.native
  def status(): stdLib.Promise[_] = js.native
  def status(callback: jsforceLib.connectionMod.Callback[js.Object]): stdLib.Promise[_] = js.native
}
