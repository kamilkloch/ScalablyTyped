package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UiConfig extends js.Object {
  /**
    * The Amazon S3 bucket location of the UI template. For more information about the contents of a UI template, see  Creating Your Custom Labeling Task Template.
    */
  var UiTemplateS3Uri: S3Uri
}

object UiConfig {
  @scala.inline
  def apply(UiTemplateS3Uri: S3Uri): UiConfig = {
    val __obj = js.Dynamic.literal(UiTemplateS3Uri = UiTemplateS3Uri)
  
    __obj.asInstanceOf[UiConfig]
  }
}

