package typings
package awsDashSdkLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/core", "Config")
@js.native
/**
  * Creates a new configuration object.
  * This is the object that passes option data along to service requests, including credentials, security, region information, and some service specific settings.
  */
class Config ()
  extends awsDashSdkLib.libConfigMod.Config {
  def this(options: awsDashSdkLib.libConfigMod.ConfigurationOptions with awsDashSdkLib.libConfigUnderscoreServiceUnderscorePlaceholdersMod.ConfigurationServicePlaceholders with awsDashSdkLib.libConfigMod.APIVersions) = this()
}

