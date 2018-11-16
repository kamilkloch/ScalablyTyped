package typings
package cordovaDashPluginDashDialogsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This plugin provides access to some native dialog UI elements. */
@js.native
trait Notification extends js.Object {
  /**
       * Shows a custom alert or dialog box. Most Cordova implementations use a native dialog box for this feature,
       * but some platforms use the browser's alert function, which is typically less customizable.
       * @param message       Dialog message.
       * @param alertCallback Callback to invoke when alert dialog is dismissed.
       * @param title         Dialog title, defaults to 'Alert'.
       * @param buttonName    Button name, defaults to OK.
       */
  def alert(message: java.lang.String, alertCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Shows a custom alert or dialog box. Most Cordova implementations use a native dialog box for this feature,
       * but some platforms use the browser's alert function, which is typically less customizable.
       * @param message       Dialog message.
       * @param alertCallback Callback to invoke when alert dialog is dismissed.
       * @param title         Dialog title, defaults to 'Alert'.
       * @param buttonName    Button name, defaults to OK.
       */
  def alert(message: java.lang.String, alertCallback: js.Function0[scala.Unit], title: java.lang.String): scala.Unit = js.native
  /**
       * Shows a custom alert or dialog box. Most Cordova implementations use a native dialog box for this feature,
       * but some platforms use the browser's alert function, which is typically less customizable.
       * @param message       Dialog message.
       * @param alertCallback Callback to invoke when alert dialog is dismissed.
       * @param title         Dialog title, defaults to 'Alert'.
       * @param buttonName    Button name, defaults to OK.
       */
  def alert(
    message: java.lang.String,
    alertCallback: js.Function0[scala.Unit],
    title: java.lang.String,
    buttonName: java.lang.String
  ): scala.Unit = js.native
  /**
       * The device plays a beep sound.
       * @param times The number of times to repeat the beep. 
       */
  def beep(times: scala.Double): scala.Unit = js.native
  /**
       * Displays a customizable confirmation dialog box.
       * @param message           Dialog message.
       * @param confirmCallback   Callback to invoke with index of button pressed (1, 2, or 3)
       *                                   or when the dialog is dismissed without a button press (0).
       * @param title             Dialog title, defaults to Confirm.
       * @param buttonLabels      Array of strings specifying button labels, defaults to [OK,Cancel].
       */
  def confirm(message: java.lang.String, confirmCallback: js.Function1[/* choice */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
       * Displays a customizable confirmation dialog box.
       * @param message           Dialog message.
       * @param confirmCallback   Callback to invoke with index of button pressed (1, 2, or 3)
       *                                   or when the dialog is dismissed without a button press (0).
       * @param title             Dialog title, defaults to Confirm.
       * @param buttonLabels      Array of strings specifying button labels, defaults to [OK,Cancel].
       */
  def confirm(
    message: java.lang.String,
    confirmCallback: js.Function1[/* choice */ scala.Double, scala.Unit],
    title: java.lang.String
  ): scala.Unit = js.native
  /**
       * Displays a customizable confirmation dialog box.
       * @param message           Dialog message.
       * @param confirmCallback   Callback to invoke with index of button pressed (1, 2, or 3)
       *                                   or when the dialog is dismissed without a button press (0).
       * @param title             Dialog title, defaults to Confirm.
       * @param buttonLabels      Array of strings specifying button labels, defaults to [OK,Cancel].
       */
  def confirm(
    message: java.lang.String,
    confirmCallback: js.Function1[/* choice */ scala.Double, scala.Unit],
    title: java.lang.String,
    buttonLabels: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
       * Displays a native dialog box that is more customizable than the browser's prompt function.
       * @param message           Dialog message.
       * @param promptCallback    Callback to invoke when a button is pressed.
       * @param title             Dialog title, defaults to "Prompt".
       * @param buttonLabels      Array of strings specifying button labels, defaults to ["OK","Cancel"].
       * @param defaultText       Default textbox input value, default: "".
       */
  def prompt(
    message: java.lang.String,
    promptCallback: js.Function1[/* result */ NotificationPromptResult, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Displays a native dialog box that is more customizable than the browser's prompt function.
       * @param message           Dialog message.
       * @param promptCallback    Callback to invoke when a button is pressed.
       * @param title             Dialog title, defaults to "Prompt".
       * @param buttonLabels      Array of strings specifying button labels, defaults to ["OK","Cancel"].
       * @param defaultText       Default textbox input value, default: "".
       */
  def prompt(
    message: java.lang.String,
    promptCallback: js.Function1[/* result */ NotificationPromptResult, scala.Unit],
    title: java.lang.String
  ): scala.Unit = js.native
  /**
       * Displays a native dialog box that is more customizable than the browser's prompt function.
       * @param message           Dialog message.
       * @param promptCallback    Callback to invoke when a button is pressed.
       * @param title             Dialog title, defaults to "Prompt".
       * @param buttonLabels      Array of strings specifying button labels, defaults to ["OK","Cancel"].
       * @param defaultText       Default textbox input value, default: "".
       */
  def prompt(
    message: java.lang.String,
    promptCallback: js.Function1[/* result */ NotificationPromptResult, scala.Unit],
    title: java.lang.String,
    buttonLabels: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
       * Displays a native dialog box that is more customizable than the browser's prompt function.
       * @param message           Dialog message.
       * @param promptCallback    Callback to invoke when a button is pressed.
       * @param title             Dialog title, defaults to "Prompt".
       * @param buttonLabels      Array of strings specifying button labels, defaults to ["OK","Cancel"].
       * @param defaultText       Default textbox input value, default: "".
       */
  def prompt(
    message: java.lang.String,
    promptCallback: js.Function1[/* result */ NotificationPromptResult, scala.Unit],
    title: java.lang.String,
    buttonLabels: js.Array[java.lang.String],
    defaultText: java.lang.String
  ): scala.Unit = js.native
}
