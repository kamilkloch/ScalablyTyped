package typings
package mailparserLib.mailparserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mailparser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def simpleParser(source: Source): js.Promise[ParsedMail] = js.native
  def simpleParser(source: Source, callback: js.Function2[/* err */ js.Any, /* mail */ ParsedMail, scala.Unit]): scala.Unit = js.native
  def simpleParser(source: Source, options: SimpleParserOptions): js.Promise[ParsedMail] = js.native
  def simpleParser(
    source: Source,
    options: SimpleParserOptions,
    callback: js.Function2[/* err */ js.Any, /* mail */ ParsedMail, scala.Unit]
  ): scala.Unit = js.native
}

