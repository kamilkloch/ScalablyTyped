package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resolveLib {
  /**
   * Callback invoked when checking if a file exists
   *
   * @param error
   * @param isFile If the given file exists
   */
  type isFileCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* isFile */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  /**
   * Callback invoked when reading a file
   *
   * @param error
   * @param isFile If the given file exists
   */
  type readFileCallback = js.Function2[
    /* err */ nodeLib.Error | scala.Null, 
    /* file */ js.UndefOr[nodeLib.Buffer], 
    scala.Unit
  ]
  /**
   * Callback invoked when resolving asynchronously
   *
   * @param error
   * @param resolved Absolute path to resolved identifier
   */
  type resolveCallback = js.Function3[
    /* err */ nodeLib.Error | scala.Null, 
    /* resolved */ js.UndefOr[java.lang.String], 
    /* pkg */ js.UndefOr[js.Any], 
    scala.Unit
  ]
}