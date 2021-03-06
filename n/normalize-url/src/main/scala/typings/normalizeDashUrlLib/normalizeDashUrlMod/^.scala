package typings
package normalizeDashUrlLib.normalizeDashUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("normalize-url", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function normalizeUrl(url: string, options?: normalizeUrl.Options): string;
  // export = normalizeUrl;
  @JSName("default")
  var default_Original: normalizeDashUrlLib.Anon_Default = js.native
  /**
  	[Normalize](https://en.wikipedia.org/wiki/URL_normalization) a URL.
  	@param url - URL to normalize.
  	@example
  	```
  	import normalizeUrl = require('normalize-url');
  	normalizeUrl('sindresorhus.com');
  	//=> 'http://sindresorhus.com'
  	normalizeUrl('HTTP://xn--xample-hva.com:80/?b=bar&a=foo');
  	//=> 'http://êxample.com/?a=foo&b=bar'
  	```
  	*/
  def apply(url: java.lang.String): java.lang.String = js.native
  def apply(url: java.lang.String, options: Options): java.lang.String = js.native
  /**
  	[Normalize](https://en.wikipedia.org/wiki/URL_normalization) a URL.
  	@param url - URL to normalize.
  	@example
  	```
  	import normalizeUrl = require('normalize-url');
  	normalizeUrl('sindresorhus.com');
  	//=> 'http://sindresorhus.com'
  	normalizeUrl('HTTP://xn--xample-hva.com:80/?b=bar&a=foo');
  	//=> 'http://êxample.com/?a=foo&b=bar'
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function normalizeUrl(url: string, options?: normalizeUrl.Options): string;
  // export = normalizeUrl;
  def default(url: java.lang.String): java.lang.String = js.native
  def default(url: java.lang.String, options: Options): java.lang.String = js.native
}

