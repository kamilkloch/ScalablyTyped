package typings
package fetchDotIoLib.fetchDotIoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fetch.io", "Request")
@js.native
class Request protected () extends js.Object {
  def this(method: TMethod, url: TUrl, options: Options) = this()
  /**
     * append formData
     */
  def append(key: java.lang.String, value: js.Any): this.type = js.native
  def append(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): this.type = js.native
  /**
     * Set Options
     */
  def config(key: java.lang.String, value: js.Any): this.type = js.native
  def config(opts: ScalablyTyped.runtime.StringDictionary[js.Any]): this.type = js.native
  /**
     * HTTP delete method
     */
  def delete(url: TUrl): this.type = js.native
  /**
     * HTTP get method
     */
  def get(url: TUrl): this.type = js.native
  /**
     * HTTP head method
     */
  def head(url: TUrl): this.type = js.native
  /**
     * Make Response to JSON
     */
  def json(): stdLib.Promise[_] = js.native
  /**
     * Make Response to JSON
     */
  def json(strict: scala.Boolean): stdLib.Promise[_] = js.native
  /**
     * HTTP options method
     */
  def options(url: TUrl): this.type = js.native
  /**
     * HTTP patch method
     */
  def patch(url: TUrl): this.type = js.native
  /**
     * HTTP post method
     */
  def post(url: TUrl): this.type = js.native
  /**
     * HTTP put method
     */
  def put(url: TUrl): this.type = js.native
  /**
     * Add query string
     */
  def query(`object`: ScalablyTyped.runtime.StringDictionary[js.Any]): this.type = js.native
  /**
     * Send data
     */
  def send(data: ScalablyTyped.runtime.StringDictionary[js.Any]): this.type = js.native
  /**
     * Set Header
     */
  def set(key: java.lang.String, value: js.Any): this.type = js.native
  def set(opts: ScalablyTyped.runtime.StringDictionary[js.Any]): this.type = js.native
  /**
     * Make Response to string
     */
  def text(): stdLib.Promise[java.lang.String] = js.native
  /**
     * Get Response directly
     */
  def `then`(resolve: js.Function1[/* value */ js.UndefOr[stdLib.Response], scala.Unit]): stdLib.Promise[_] = js.native
  /**
     * Get Response directly
     */
  def `then`(
    resolve: js.Function1[/* value */ js.UndefOr[stdLib.Response], scala.Unit],
    reject: js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit]
  ): stdLib.Promise[_] = js.native
  /**
     * Set Content-Type
     */
  @JSName("type")
  def type_form(`type`: fetchDotIoLib.fetchDotIoLibStrings.form): this.type = js.native
  /**
     * Set Content-Type
     */
  @JSName("type")
  def type_json(`type`: fetchDotIoLib.fetchDotIoLibStrings.json): this.type = js.native
  /**
     * Set Content-Type
     */
  @JSName("type")
  def type_urlencoded(`type`: fetchDotIoLib.fetchDotIoLibStrings.urlencoded): this.type = js.native
}
