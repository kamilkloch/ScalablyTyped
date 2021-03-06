package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigatorLanguage extends js.Object {
  val language: java.lang.String
  val languages: js.Array[java.lang.String]
}

object NavigatorLanguage {
  @scala.inline
  def apply(language: java.lang.String, languages: js.Array[java.lang.String]): NavigatorLanguage = {
    val __obj = js.Dynamic.literal(language = language, languages = languages)
  
    __obj.asInstanceOf[NavigatorLanguage]
  }
}

