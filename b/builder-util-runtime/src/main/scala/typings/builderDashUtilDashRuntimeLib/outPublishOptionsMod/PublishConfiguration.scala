package typings
package builderDashUtilDashRuntimeLib.outPublishOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PublishConfiguration extends js.Object {
  /**
       * The provider.
       */
  val provider: PublishProvider
  /**
       * Whether to publish auto update info files.
       *
       * Auto update relies only on the first provider in the list (you can specify several publishers).
       * Thus, probably, there`s no need to upload the metadata files for the other configured providers. But by default will be uploaded.
       *
       * @default true
       */
  val publishAutoUpdate: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * @private
       */
  val publisherName: js.UndefOr[js.Array[java.lang.String] | scala.Null] = js.undefined
}
