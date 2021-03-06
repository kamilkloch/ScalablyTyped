package typings
package firefoxDashWebextDashBrowserLib.browserNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.dns")
@js.native
object ^ extends js.Object {
  /* dns functions */
  /** Resolves a hostname to a DNS record. */
  def resolve(hostname: java.lang.String): js.Promise[DNSRecord] = js.native
  def resolve(hostname: java.lang.String, flags: ResolveFlags): js.Promise[DNSRecord] = js.native
}

