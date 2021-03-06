package typings
package boxenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object boxenMod {
  /**
  	Characters used for custom border.
  	@example
  	```
  	// affffb
  	// e    e
  	// dffffc
  	const border: CustomBorderStyle = {
  		topLeft: 'a',
  		topRight: 'b',
  		bottomRight: 'c',
  		bottomLeft: 'd',
  		vertical: 'e',
  		horizontal: 'f'
  	};
  	```
  	*/
  type CustomBorderStyle = cliDashBoxesLib.cliDashBoxesMod.BoxStyle
}
