package typings
package officeDashJsLib.OfficeNs.MailboxEnumsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentContentFormat extends js.Object

/**
  * Specifies the formatting that applies to an attachment's content.
  * 
  * [Api set: Mailbox Preview]
  * 
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/outlook/add-ins/#extension-points | Applicable Outlook mode}**: Compose or Read
  * 
  * @beta
  */
@JSGlobal("Office.MailboxEnums.AttachmentContentFormat")
@js.native
object AttachmentContentFormat extends js.Object {
  /**
    * The content of the attachment is returned as a base64-encoded string.
    */
  @js.native
  sealed trait Base64
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.AttachmentContentFormat
  
  /**
    * The content of the attachment is returned as a string representing an .eml formatted file.
    */
  @js.native
  sealed trait Eml
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.AttachmentContentFormat
  
  /**
    * The content of the attachment is returned as a string representing an .icalendar formatted file.
    */
  @js.native
  sealed trait ICalendar
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.AttachmentContentFormat
  
  /**
    * The content of the attachment is returned as a string representing a URL.
    */
  @js.native
  sealed trait Url
    extends officeDashJsLib.OfficeNs.MailboxEnumsNs.AttachmentContentFormat
  
  /* "base64" */ val Base64: Base64 with java.lang.String = js.native
  /* "eml" */ val Eml: Eml with java.lang.String = js.native
  /* "iCalendar" */ val ICalendar: ICalendar with java.lang.String = js.native
  /* "url" */ val Url: Url with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    officeDashJsLib.OfficeNs.MailboxEnumsNs.AttachmentContentFormat with java.lang.String
  ] = js.native
}

