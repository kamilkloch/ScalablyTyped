package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends js.Object {
  /**
    * The position of the label instance on the image.
    */
  var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
  /**
    * The confidence that Amazon Rekognition has in the accuracy of the bounding box.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
}

object Instance {
  @scala.inline
  def apply(BoundingBox: BoundingBox = null, Confidence: js.UndefOr[Percent] = js.undefined): Instance = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox)
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence)
    __obj.asInstanceOf[Instance]
  }
}

