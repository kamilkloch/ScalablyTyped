package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////////////
// WEB APIs & Warnings //
/////////////////////////
/**
  * Only warnings since:
  *  1. It's not possible as of now to override or remove something from *Window* or *Document*.
  *  2. It may also cause other unforseen consequences if it's removed (and if it was possible).
  * @see[Disallowed]
  */
/**
  * Chrome app - Web APIs
  * @see[Docs]{@link https://developer.chrome.com/apps/api_other}
  */
@js.native
trait ChromeWindow extends js.Object {
  ///
  /// Other APIs
  ///
  var AudioContext: Anon_ContextOptions = js.native
  /**
    * ❗ window.history is not available in packaged apps. ❗
    * Links open up with the system web browser.
    */
  val history: stdLib.History = js.native
  /**
    * ❗ window.localStorage is not available in packaged apps. Use chrome.storage.local instead. ❗
    */
  // localStorage: typeof localStorage;
  /**
    * ❗ window.location is not available in packaged apps. ❗
    * Links open up with the system web browser.
    */
  var location: stdLib.Location = js.native
  ///
  /// Disabled Web Features
  /// https://developer.chrome.com/apps/app_deprecated
  ///
  /**
    * ❗ alert is not available in packaged apps. ❗
    * Work-around: Use a custom lightbox / popup.
    */
  def alert(): scala.Unit = js.native
  def alert(message: js.Any): scala.Unit = js.native
  /**
    * ❗ confirm is not available in packaged apps. ❗
    * Work-around: Use a custom lightbox / popup.
    */
  def confirm(): scala.Boolean = js.native
  def confirm(message: java.lang.String): scala.Boolean = js.native
}

