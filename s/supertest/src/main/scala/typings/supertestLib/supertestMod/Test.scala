package typings
package supertestLib.supertestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Test
  extends superagentLib.superagentMod.SuperAgentRequest {
  var app: js.UndefOr[js.Any] = js.native
  def expect(body: java.lang.String): this.type = js.native
  def expect(body: java.lang.String, callback: CallbackHandler): this.type = js.native
  def expect(body: js.Object): this.type = js.native
  def expect(body: js.Object, callback: CallbackHandler): this.type = js.native
  def expect(body: stdLib.RegExp): this.type = js.native
  def expect(body: stdLib.RegExp, callback: CallbackHandler): this.type = js.native
  def expect(checker: js.Function1[/* res */ Response, _]): this.type = js.native
  def expect(checker: js.Function1[/* res */ Response, _], callback: CallbackHandler): this.type = js.native
  def expect(field: java.lang.String, `val`: java.lang.String): this.type = js.native
  def expect(field: java.lang.String, `val`: java.lang.String, callback: CallbackHandler): this.type = js.native
  def expect(field: java.lang.String, `val`: stdLib.RegExp): this.type = js.native
  def expect(field: java.lang.String, `val`: stdLib.RegExp, callback: CallbackHandler): this.type = js.native
  def expect(status: scala.Double): this.type = js.native
  def expect(status: scala.Double, body: js.Any): this.type = js.native
  def expect(status: scala.Double, body: js.Any, callback: CallbackHandler): this.type = js.native
  def expect(status: scala.Double, callback: CallbackHandler): this.type = js.native
  def serverAddress(app: js.Any, path: java.lang.String): java.lang.String = js.native
}

