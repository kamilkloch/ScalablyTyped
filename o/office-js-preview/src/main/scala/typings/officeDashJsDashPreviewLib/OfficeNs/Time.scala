package typings
package officeDashJsDashPreviewLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Time object is returned as the start or end property of an appointment in compose mode.
  *
  * [Api set: Mailbox 1.1]
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
  */
@js.native
trait Time extends js.Object {
  /**
    * Gets the start or end time of an appointment.
    *
    * The date and time is provided as a Date object in the asyncResult.value property. The value is in Coordinated Universal Time (UTC). 
    * You can convert the UTC time to the local client time by using the convertToLocalClientTime method.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    *
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult.
    *                  The `value` property of the result is a Date object.
    */
  def getAsync(callback: js.Function1[/* asyncResult */ AsyncResult[stdLib.Date], scala.Unit]): scala.Unit = js.native
  /**
    * Gets the start or end time of an appointment.
    *
    * The date and time is provided as a Date object in the asyncResult.value property. The value is in Coordinated Universal Time (UTC). 
    * You can convert the UTC time to the local client time by using the convertToLocalClientTime method.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * @param options - An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - When the method completes, the function passed in the callback parameter is called with a single parameter of type Office.AsyncResult.
    *                  The `value` property of the result is a Date object.
    */
  def getAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[stdLib.Date], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Sets the start or end time of an appointment.
    *
    * If the setAsync method is called on the start property, the end property will be adjusted to maintain the duration of the appointment as 
    * previously set. If the setAsync method is called on the end property, the duration of the appointment will be extended to the new end time.
    *
    * The time must be in UTC; you can get the correct UTC time by using the convertToUtcClientTime method.
    *
    * [Api set: Mailbox 1.1]
    *
    * @remarks
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/understanding-outlook-add-in-permissions | Minimum permission level}**: ReadWriteItem
    * 
    * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose
    * 
    * **Errors**: 
    * 
    * - InvalidEndTime: The appointment end time is before the appointment start time.
    * 
    * @param dateTime - A date-time object in Coordinated Universal Time (UTC).
    * @param options - Optional. An object literal that contains one or more of the following properties.
    *        asyncContext: Developers can provide any object they wish to access in the callback method.
    * @param callback - Optional. When the method completes, the function passed in the callback parameter is called with a single parameter of 
    *                 type Office.AsyncResult. 
    *                 If setting the date and time fails, the asyncResult.error property will contain an error code.
    */
  def setAsync(dateTime: stdLib.Date): scala.Unit = js.native
  def setAsync(
    dateTime: stdLib.Date,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  def setAsync(dateTime: stdLib.Date, options: AsyncContextOptions): scala.Unit = js.native
  def setAsync(
    dateTime: stdLib.Date,
    options: AsyncContextOptions,
    callback: js.Function1[/* asyncResult */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}

