package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The ServiceWorkerContainer interface of the ServiceWorker API provides an object representing the service worker as an overall unit in the network ecosystem, including facilities to register, unregister and update service workers, and access the state of service workers and their registrations. */
@js.native
trait ServiceWorkerContainer extends EventTarget {
  val controller: ServiceWorker | scala.Null = js.native
  var oncontrollerchange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]) | scala.Null = js.native
  var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]) | scala.Null = js.native
  val ready: js.Promise[ServiceWorkerRegistration] = js.native
  @JSName("addEventListener")
  def addEventListener_controllerchange(
    `type`: stdLib.stdLibStrings.controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controllerchange(
    `type`: stdLib.stdLibStrings.controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controllerchange(
    `type`: stdLib.stdLibStrings.controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: stdLib.stdLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: stdLib.stdLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: stdLib.stdLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: stdLib.stdLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: stdLib.stdLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: stdLib.stdLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def getRegistration(): js.Promise[js.UndefOr[ServiceWorkerRegistration]] = js.native
  def getRegistration(clientURL: java.lang.String): js.Promise[js.UndefOr[ServiceWorkerRegistration]] = js.native
  def getRegistrations(): js.Promise[js.Array[ServiceWorkerRegistration]] = js.native
  def register(scriptURL: java.lang.String): js.Promise[ServiceWorkerRegistration] = js.native
  def register(scriptURL: java.lang.String, options: RegistrationOptions): js.Promise[ServiceWorkerRegistration] = js.native
  @JSName("removeEventListener")
  def removeEventListener_controllerchange(
    `type`: stdLib.stdLibStrings.controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controllerchange(
    `type`: stdLib.stdLibStrings.controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controllerchange(
    `type`: stdLib.stdLibStrings.controllerchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: stdLib.stdLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: stdLib.stdLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: stdLib.stdLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: stdLib.stdLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: stdLib.stdLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: stdLib.stdLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def startMessages(): scala.Unit = js.native
}

@JSGlobal("ServiceWorkerContainer")
@js.native
class ServiceWorkerContainerCls () extends ServiceWorkerContainer

@JSGlobal("ServiceWorkerContainer")
@js.native
object ServiceWorkerContainer
  extends org.scalablytyped.runtime.Instantiable0[ServiceWorkerContainer]

