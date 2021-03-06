package typings
package eventsourceLib.libEventsourceDashPolyfillMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSource extends js.Object {
  val CLOSED: scala.Double = js.native
  val CONNECTING: scala.Double = js.native
  val OPEN: scala.Double = js.native
  val readyState: scala.Double = js.native
  val url: java.lang.String = js.native
  val withCredentials: scala.Boolean = js.native
  def addEventListener(`type`: java.lang.String, listener: stdLib.EventListener): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def dispatchEvent(evt: stdLib.Event): scala.Boolean = js.native
  def onerror(evt: stdLib.MessageEvent): js.Any = js.native
  def onmessage(evt: stdLib.MessageEvent): js.Any = js.native
  def onopen(evt: stdLib.MessageEvent): js.Any = js.native
  def removeEventListener(`type`: java.lang.String): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: stdLib.EventListener): scala.Unit = js.native
}

