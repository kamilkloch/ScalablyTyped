package typings
package mailgunDashJsLib.mailgunDashJsMod.MailgunNs.messagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SendData extends js.Object {
  var attachment: js.UndefOr[
    java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.ReadWriteStream | mailgunDashJsLib.mailgunDashJsMod.MailgunNs.Attachment
  ] = js.undefined
  var bcc: js.UndefOr[java.lang.String] = js.undefined
  var cc: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var html: js.UndefOr[java.lang.String] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var to: java.lang.String | js.Array[java.lang.String]
}
