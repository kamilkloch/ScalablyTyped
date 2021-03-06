package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaEncryptedEvent extends Event {
  val initData: ArrayBuffer | scala.Null = js.native
  val initDataType: java.lang.String = js.native
}

@JSGlobal("MediaEncryptedEvent")
@js.native
class MediaEncryptedEventCls protected () extends MediaEncryptedEvent {
  def this(`type`: java.lang.String) = this()
  def this(`type`: java.lang.String, eventInitDict: MediaEncryptedEventInit) = this()
}

@JSGlobal("MediaEncryptedEvent")
@js.native
object MediaEncryptedEvent
  extends org.scalablytyped.runtime.Instantiable1[/* type */ java.lang.String, MediaEncryptedEvent]
     with org.scalablytyped.runtime.Instantiable2[
      /* type */ java.lang.String, 
      /* eventInitDict */ MediaEncryptedEventInit, 
      MediaEncryptedEvent
    ]

