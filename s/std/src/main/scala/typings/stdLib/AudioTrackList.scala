package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AudioTrackList
  extends EventTarget
     with /* index */ ScalablyTyped.runtime.NumberDictionary[AudioTrack] {
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[AudioTrack]] = js.native
  val length: scala.Double = js.native
  var onaddtrack: (js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]) | scala.Null = js.native
  var onchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onremovetrack: (js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]) | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: stdLib.stdLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: stdLib.stdLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_addtrack(
    `type`: stdLib.stdLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: stdLib.stdLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: stdLib.stdLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_removetrack(
    `type`: stdLib.stdLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def getTrackById(id: java.lang.String): AudioTrack | scala.Null = js.native
  def item(index: scala.Double): AudioTrack = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: stdLib.stdLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: stdLib.stdLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_addtrack(
    `type`: stdLib.stdLibStrings.addtrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_change(
    `type`: stdLib.stdLibStrings.change,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: stdLib.stdLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: stdLib.stdLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_removetrack(
    `type`: stdLib.stdLibStrings.removetrack,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ TrackEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
}

@JSGlobal("AudioTrackList")
@js.native
object AudioTrackList
  extends ScalablyTyped.runtime.Instantiable0[AudioTrackList]
