package typings
package nodemailerDashMailgunDashTransportLib.nodemailerDashMailgunDashTransportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer-mailgun-transport", "MailgunTransport")
@js.native
class MailgunTransport ()
  extends nodemailerLib.nodemailerMod.Transport {
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /* CompleteClass */
  override var version: java.lang.String = js.native
  /* CompleteClass */
  override def send(
    mail: nodemailerLib.libMailerMailDashMessageMod.^,
    callback: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* info */ nodemailerLib.nodemailerMod.SentMessageInfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

