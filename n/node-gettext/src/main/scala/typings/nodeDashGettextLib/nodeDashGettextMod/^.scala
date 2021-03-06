package typings
package nodeDashGettextLib.nodeDashGettextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-gettext", JSImport.Namespace)
@js.native
class ^ () extends GetText {
  def this(options: nodeDashGettextLib.Anon_Debug) = this()
  /* CompleteClass */
  override def addTranslations(locale: java.lang.String, domain: java.lang.String, translations: js.Object): scala.Unit = js.native
  /* CompleteClass */
  override def dgettext(domain: java.lang.String, msgid: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def dngettext(
    domain: java.lang.String,
    msgid: java.lang.String,
    msgidPlural: java.lang.String,
    count: scala.Double
  ): java.lang.String = js.native
  /* CompleteClass */
  override def dnpgettext(
    domain: java.lang.String,
    msgctxt: java.lang.String,
    msgid: java.lang.String,
    msgidPlural: java.lang.String,
    count: scala.Double
  ): java.lang.String = js.native
  /* CompleteClass */
  override def dpgettext(domain: java.lang.String, msgctxt: java.lang.String, msgid: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def emit(eventName: java.lang.String, eventData: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def getComment(domain: java.lang.String, msgctxt: java.lang.String, msgid: java.lang.String): js.Object | scala.Boolean = js.native
  /* CompleteClass */
  override def gettext(msgid: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def ngettext(msgid: java.lang.String, msgidPlural: java.lang.String, count: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def npgettext(
    msgctxt: java.lang.String,
    msgid: java.lang.String,
    msgidPlural: java.lang.String,
    count: scala.Double
  ): java.lang.String = js.native
  /* CompleteClass */
  @JSName("off")
  override def off_error(
    eventName: nodeDashGettextLib.nodeDashGettextLibStrings.error,
    callback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  @JSName("on")
  override def on_error(
    eventName: nodeDashGettextLib.nodeDashGettextLibStrings.error,
    callback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def pgettext(msgctxt: java.lang.String, msgid: java.lang.String): java.lang.String = js.native
  /* CompleteClass */
  override def setLocale(locale: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def setTextDomain(domain: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def textdomain(domain: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def warn(message: java.lang.String): scala.Unit = js.native
}

@JSImport("node-gettext", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getLanguageCode(locale: java.lang.String): java.lang.String = js.native
}

