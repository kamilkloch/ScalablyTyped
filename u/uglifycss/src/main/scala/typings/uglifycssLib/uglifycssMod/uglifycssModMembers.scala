package typings
package uglifycssLib.uglifycssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uglifycss", JSImport.Namespace)
@js.native
object uglifycssModMembers extends js.Object {
  /**
           * Uglify one or more files
           */
  def processFiles(filenames: js.Array[java.lang.String]): java.lang.String = js.native
  /**
           * Uglify one or more files
           */
  def processFiles(
    filenames: js.Array[java.lang.String],
    options: uglifycssLib.uglifycssMod.UglifyCSSNs.UglifyCSSOptions
  ): java.lang.String = js.native
  /**
           * Uglify a string
           */
  def processString(content: java.lang.String): java.lang.String = js.native
  /**
           * Uglify a string
           */
  def processString(content: java.lang.String, options: uglifycssLib.uglifycssMod.UglifyCSSNs.UglifyCSSOptions): java.lang.String = js.native
}
