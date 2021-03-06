package typings
package timeDashSpanLib.timeDashSpanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("time-span", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function timeSpan(): timeSpan.TimeEndFunction;
  // export = timeSpan;
  @JSName("default")
  var default_Original: timeDashSpanLib.Anon_Default = js.native
  /**
  	Simplified high resolution timing.
  	@returns A function that returns the time difference.
  	@example
  	```
  	import timeSpan = require('time-span');
  	const end = timeSpan();
  	timeConsumingFn();
  	console.log(end());
  	//=> 1745.3186
  	console.log(end.rounded());
  	//=> 1745
  	console.log(end.seconds());
  	//=> 1.7453186
  	```
  	*/
  def apply(): TimeEndFunction = js.native
  /**
  	Simplified high resolution timing.
  	@returns A function that returns the time difference.
  	@example
  	```
  	import timeSpan = require('time-span');
  	const end = timeSpan();
  	timeConsumingFn();
  	console.log(end());
  	//=> 1745.3186
  	console.log(end.rounded());
  	//=> 1745
  	console.log(end.seconds());
  	//=> 1.7453186
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function timeSpan(): timeSpan.TimeEndFunction;
  // export = timeSpan;
  def default(): TimeEndFunction = js.native
}

