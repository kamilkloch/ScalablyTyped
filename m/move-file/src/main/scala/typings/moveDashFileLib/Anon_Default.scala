package typings
package moveDashFileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Move a file.
  	@param source - File you want to move.
  	@param destination - Where you want the file moved.
  	@returns A `Promise` that resolves when the file has been moved.
  	@example
  	```
  	import moveFile = require('move-file');
  	(async () => {
  		await moveFile('source/unicorn.png', 'destination/unicorn.png');
  		console.log('The file has been moved');
  	})();
  	```
  	*/
  def apply(source: java.lang.String, destination: java.lang.String): js.Promise[scala.Unit] = js.native
  def apply(
    source: java.lang.String,
    destination: java.lang.String,
    options: moveDashFileLib.moveDashFileMod.Options
  ): js.Promise[scala.Unit] = js.native
  /**
  	Move a file synchronously.
  	@param source - File you want to move.
  	@param destination - Where you want the file moved.
  	*/
  def sync(source: java.lang.String, destination: java.lang.String): scala.Unit = js.native
  def sync(
    source: java.lang.String,
    destination: java.lang.String,
    options: moveDashFileLib.moveDashFileMod.Options
  ): scala.Unit = js.native
}

