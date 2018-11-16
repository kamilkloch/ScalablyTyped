package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ChatStoreChangedEventKind extends js.Object

/** Specifies the type of change that occurred for a ChatMessageStoreChanged event. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatStoreChangedEventKind")
@js.native
object ChatStoreChangedEventKind extends js.Object {
  /** A chat conversation has been deleted */
  @js.native
  sealed trait conversationDeleted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /** A chat conversation has been modified */
  @js.native
  sealed trait conversationModified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /** A chat conversation has been deleted of all messages from a transport. */
  @js.native
  sealed trait conversationTransportDeleted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /** A chat message has been created */
  @js.native
  sealed trait messageCreated
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /** A chat message has been deleted */
  @js.native
  sealed trait messageDeleted
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /** A chat message has been changed */
  @js.native
  sealed trait messageModified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /** Notifications have been missed */
  @js.native
  sealed trait notificationsMissed
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  /** The chat store has been modified */
  @js.native
  sealed trait storeModified
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind
  
  val conversationDeleted: conversationDeleted with java.lang.String = js.native
  val conversationModified: conversationModified with java.lang.String = js.native
  val conversationTransportDeleted: conversationTransportDeleted with java.lang.String = js.native
  val messageCreated: messageCreated with java.lang.String = js.native
  val messageDeleted: messageDeleted with java.lang.String = js.native
  val messageModified: messageModified with java.lang.String = js.native
  val notificationsMissed: notificationsMissed with java.lang.String = js.native
  val storeModified: storeModified with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs.ChatStoreChangedEventKind with java.lang.String
  ] = js.native
}
