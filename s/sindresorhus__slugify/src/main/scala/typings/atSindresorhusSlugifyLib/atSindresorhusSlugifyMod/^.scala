package typings
package atSindresorhusSlugifyLib.atSindresorhusSlugifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@sindresorhus/slugify", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function slugify(
  // 	input: string,
  // 	options?: slugify.Options
  // ): string;
  // export = slugify;
  @JSName("default")
  var default_Original: atSindresorhusSlugifyLib.Anon_Default = js.native
  /**
  	Slugify a string.
  	@param input - The string to slugify.
  	@example
  	```
  	import slugify = require('@sindresorhus/slugify');
  	slugify('I ♥ Dogs');
  	//=> 'i-love-dogs'
  	slugify('  Déjà Vu!  ');
  	//=> 'deja-vu'
  	slugify('fooBar 123 $#%');
  	//=> 'foo-bar-123'
  	slugify('I ♥ 🦄 & 🐶', {
  		customReplacements: [
  			['🐶', 'dog']
  		]
  	});
  	//=> 'i-love-unicorn-and-dog'
  	```
  	*/
  def apply(input: java.lang.String): java.lang.String = js.native
  def apply(input: java.lang.String, options: Options): java.lang.String = js.native
  /**
  	Slugify a string.
  	@param input - The string to slugify.
  	@example
  	```
  	import slugify = require('@sindresorhus/slugify');
  	slugify('I ♥ Dogs');
  	//=> 'i-love-dogs'
  	slugify('  Déjà Vu!  ');
  	//=> 'deja-vu'
  	slugify('fooBar 123 $#%');
  	//=> 'foo-bar-123'
  	slugify('I ♥ 🦄 & 🐶', {
  		customReplacements: [
  			['🐶', 'dog']
  		]
  	});
  	//=> 'i-love-unicorn-and-dog'
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function slugify(
  // 	input: string,
  // 	options?: slugify.Options
  // ): string;
  // export = slugify;
  def default(input: java.lang.String): java.lang.String = js.native
  def default(input: java.lang.String, options: Options): java.lang.String = js.native
}

