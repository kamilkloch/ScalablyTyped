package typings
package easyDashXapiDashSupertestLib.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var NPNProtocols: js.UndefOr[js.Any] = js.undefined
  var SNICallback: js.UndefOr[js.Function1[/* servername */ java.lang.String, _]] = js.undefined
  var ca: js.UndefOr[js.Any] = js.undefined
  var cert: js.UndefOr[js.Any] = js.undefined
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  var crl: js.UndefOr[js.Any] = js.undefined
  var honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var pfx: js.UndefOr[js.Any] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var requestCert: js.UndefOr[scala.Boolean] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    NPNProtocols: js.Any = null,
    SNICallback: /* servername */ java.lang.String => _ = null,
    ca: js.Any = null,
    cert: js.Any = null,
    ciphers: java.lang.String = null,
    crl: js.Any = null,
    honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined,
    key: js.Any = null,
    passphrase: java.lang.String = null,
    pfx: js.Any = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    requestCert: js.UndefOr[scala.Boolean] = js.undefined
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (NPNProtocols != null) __obj.updateDynamic("NPNProtocols")(NPNProtocols)
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction1(SNICallback))
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (crl != null) __obj.updateDynamic("crl")(crl)
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (key != null) __obj.updateDynamic("key")(key)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    __obj.asInstanceOf[ServerOptions]
  }
}

