package typings
package appDashBuilderDashLibLib.outWinPackagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/winPackager", "WinPackager")
@js.native
class WinPackager protected ()
  extends appDashBuilderDashLibLib.outPlatformPackagerMod.PlatformPackager[appDashBuilderDashLibLib.outOptionsWinOptionsMod.WindowsConfiguration] {
  def this(info: appDashBuilderDashLibLib.outPackagerMod.Packager) = this()
  var _iconPath: js.Any = js.native
  val computedPublisherName: lazyDashValLib.lazyDashValMod.Lazy[js.Array[java.lang.String] | scala.Null] = js.native
  val computedPublisherSubjectOnWindowsOnly: lazyDashValLib.lazyDashValMod.Lazy[java.lang.String | scala.Null] = js.native
  val cscInfo: lazyDashValLib.lazyDashValMod.Lazy[
    appDashBuilderDashLibLib.outWindowsCodeSignMod.FileCodeSigningInfo | appDashBuilderDashLibLib.outWindowsCodeSignMod.CertificateFromStoreInfo | scala.Null
  ] = js.native
  var doSign: js.Any = js.native
  val isForceCodeSigningVerification: scala.Boolean = js.native
  var isSignDlls: js.Any = js.native
  val vm: lazyDashValLib.lazyDashValMod.Lazy[appDashBuilderDashLibLib.outVmVmMod.VmManager] = js.native
  def sign(file: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def sign(file: java.lang.String, logMessagePrefix: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def signAndEditResources(file: java.lang.String, arch: builderDashUtilLib.outArchMod.Arch, outDir: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def signAndEditResources(
    file: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    outDir: java.lang.String,
    internalName: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def signAndEditResources(
    file: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    outDir: java.lang.String,
    internalName: java.lang.String,
    requestedExecutionLevel: appDashBuilderDashLibLib.outOptionsWinOptionsMod.RequestedExecutionLevel
  ): stdLib.Promise[scala.Unit] = js.native
  def signAndEditResources(
    file: java.lang.String,
    arch: builderDashUtilLib.outArchMod.Arch,
    outDir: java.lang.String,
    internalName: scala.Null,
    requestedExecutionLevel: appDashBuilderDashLibLib.outOptionsWinOptionsMod.RequestedExecutionLevel
  ): stdLib.Promise[scala.Unit] = js.native
}
