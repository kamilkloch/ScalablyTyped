package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AAAAAADDRCONFIG extends js.Object {
  // Supported getaddrinfo flags.
  val ADDRCONFIG: scala.Double = js.native
  val ADDRGETNETWORKPARAMS: java.lang.String = js.native
  val BADFAMILY: java.lang.String = js.native
  val BADFLAGS: java.lang.String = js.native
  val BADHINTS: java.lang.String = js.native
  val BADNAME: java.lang.String = js.native
  val BADQUERY: java.lang.String = js.native
  val BADRESP: java.lang.String = js.native
  val BADSTR: java.lang.String = js.native
  val CANCELLED: java.lang.String = js.native
  val CONNREFUSED: java.lang.String = js.native
  val DESTRUCTION: java.lang.String = js.native
  val EOF: java.lang.String = js.native
  val FILE: java.lang.String = js.native
  val FORMERR: java.lang.String = js.native
  val LOADIPHLPAPI: java.lang.String = js.native
  // Error codes
  val NODATA: java.lang.String = js.native
  val NOMEM: java.lang.String = js.native
  val NONAME: java.lang.String = js.native
  val NOTFOUND: java.lang.String = js.native
  val NOTIMP: java.lang.String = js.native
  val NOTINITIALIZED: java.lang.String = js.native
  val REFUSED: java.lang.String = js.native
  var Resolver: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.dnsNs.Resolver] = js.native
  val SERVFAIL: java.lang.String = js.native
  val TIMEOUT: java.lang.String = js.native
  val V4MAPPED: scala.Double = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val lookupNs: Anon_Hostname = js.native
  val lookupServiceNs: Anon_Address = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val resolve4Ns: Anon_HostnameOptions = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val resolve6Ns: Anon_HostnameOptions = js.native
  val resolveAnyNs: Anon_HostnamePromisifyAnyRecord = js.native
  val resolveCnameNs: Anon_HostnamePromisifyArrayPromiseString = js.native
  val resolveMxNs: Anon_HostnamePromisifyArray = js.native
  val resolveNaptrNs: Anon_HostnamePromisify = js.native
  // NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
  val resolveNs: Anon_AAAAA = js.native
  val resolveNsNs: Anon_HostnamePromisifyArrayPromiseString = js.native
  val resolvePtrNs: Anon_HostnamePromisifyArrayPromiseString = js.native
  val resolveSoaNs: Anon_HostnamePromisifyPromise = js.native
  val resolveSrvNs: Anon_HostnamePromisifyArrayPromiseSrvRecord = js.native
  val resolveTxtNs: Anon_HostnamePromisifyArrayPromise = js.native
  def getServers(): js.Array[java.lang.String] = js.native
  def lookup(
    hostname: java.lang.String,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookup(
    hostname: java.lang.String,
    family: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookup(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.LookupAllOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.LookupAddress], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookup(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.LookupOneOptions,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookup(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.LookupOptions,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* address */ java.lang.String | js.Array[nodeLib.dnsMod.LookupAddress], 
      /* family */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lookupService(
    address: java.lang.String,
    port: scala.Double,
    callback: js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* hostname */ java.lang.String, 
      /* service */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve(
    hostname: java.lang.String,
    rrtype: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String] | js.Array[nodeLib.dnsMod.MxRecord] | js.Array[nodeLib.dnsMod.NaptrRecord] | nodeLib.dnsMod.SoaRecord | js.Array[nodeLib.dnsMod.SrvRecord] | js.Array[js.Array[java.lang.String]] | js.Array[nodeLib.dnsMod.AnyRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve4(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve4(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.ResolveOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String] | js.Array[nodeLib.dnsMod.RecordWithTtl], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve4(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.ResolveWithTtlOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.RecordWithTtl], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve6(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve6(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.ResolveOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String] | js.Array[nodeLib.dnsMod.RecordWithTtl], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolve6(
    hostname: java.lang.String,
    options: nodeLib.dnsMod.ResolveWithTtlOptions,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.RecordWithTtl], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveAny(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.AnyRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveCname(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveMx(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.MxRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveNaptr(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.NaptrRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveNs(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolvePtr(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveSoa(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* address */ nodeLib.dnsMod.SoaRecord, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveSrv(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.SrvRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def resolveTxt(
    hostname: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[js.Array[java.lang.String]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_A(
    hostname: java.lang.String,
    rrtype: adoneLib.adoneLibStrings.A,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_AAAA(
    hostname: java.lang.String,
    rrtype: adoneLib.adoneLibStrings.AAAA,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_ANY(
    hostname: java.lang.String,
    rrtype: adoneLib.adoneLibStrings.ANY,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.AnyRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_CNAME(
    hostname: java.lang.String,
    rrtype: adoneLib.adoneLibStrings.CNAME,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_MX(
    hostname: java.lang.String,
    rrtype: adoneLib.adoneLibStrings.MX,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.MxRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_NAPTR(
    hostname: java.lang.String,
    rrtype: adoneLib.adoneLibStrings.NAPTR,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.NaptrRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_NS(
    hostname: java.lang.String,
    rrtype: adoneLib.adoneLibStrings.NS,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_PTR(
    hostname: java.lang.String,
    rrtype: adoneLib.adoneLibStrings.PTR,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_SOA(
    hostname: java.lang.String,
    rrtype: adoneLib.adoneLibStrings.SOA,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ nodeLib.dnsMod.SoaRecord, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_SRV(
    hostname: java.lang.String,
    rrtype: adoneLib.adoneLibStrings.SRV,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[nodeLib.dnsMod.SrvRecord], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("resolve")
  def resolve_TXT(
    hostname: java.lang.String,
    rrtype: adoneLib.adoneLibStrings.TXT,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* addresses */ js.Array[js.Array[java.lang.String]], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def reverse(
    ip: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* hostnames */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def setServers(servers: js.Array[java.lang.String]): scala.Unit = js.native
}

