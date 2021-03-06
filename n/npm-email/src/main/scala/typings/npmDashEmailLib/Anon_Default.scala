package typings
package npmDashEmailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Get the email of an npm user.
  	@param username - npm username to look up.
  	@returns The user's email address.
  	@example
  	```
  	import npmEmail = require('npm-email');
  	(async () => {
  		console.log(await npmEmail('sindresorhus'));
  		//=> 'sindresorhus@gmail.com'
  	})();
  	```
  	*/
  def apply(username: java.lang.String): js.Promise[java.lang.String] = js.native
}

