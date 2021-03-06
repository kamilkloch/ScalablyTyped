package typings
package trashLib.trashMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("trash", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function trash(
  // 	input: string | string[],
  // 	options?: Options
  // ): Promise<void>;
  // export = trash;
  @JSName("default")
  var default_Original: trashLib.Anon_Default = js.native
  /**
  	Move files and folders to the trash.
  	@param input - Accepts paths and [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@example
  	```
  	import trash = require('trash');
  	(async () => {
  		await trash(['*.png', '!rainbow.png']);
  	})();
  	```
  	*/
  def apply(input: java.lang.String): js.Promise[scala.Unit] = js.native
  def apply(input: java.lang.String, options: Options): js.Promise[scala.Unit] = js.native
  def apply(input: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def apply(input: js.Array[java.lang.String], options: Options): js.Promise[scala.Unit] = js.native
  /**
  	Move files and folders to the trash.
  	@param input - Accepts paths and [glob patterns](https://github.com/sindresorhus/globby#globbing-patterns).
  	@example
  	```
  	import trash = require('trash');
  	(async () => {
  		await trash(['*.png', '!rainbow.png']);
  	})();
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function trash(
  // 	input: string | string[],
  // 	options?: Options
  // ): Promise<void>;
  // export = trash;
  def default(input: java.lang.String): js.Promise[scala.Unit] = js.native
  def default(input: java.lang.String, options: Options): js.Promise[scala.Unit] = js.native
  def default(input: js.Array[java.lang.String]): js.Promise[scala.Unit] = js.native
  def default(input: js.Array[java.lang.String], options: Options): js.Promise[scala.Unit] = js.native
}

