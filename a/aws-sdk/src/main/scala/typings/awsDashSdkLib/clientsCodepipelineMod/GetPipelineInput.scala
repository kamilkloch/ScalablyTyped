package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPipelineInput extends js.Object {
  /**
    * The name of the pipeline for which you want to get information. Pipeline names must be unique under an Amazon Web Services (AWS) user account.
    */
  var name: PipelineName
  /**
    * The version number of the pipeline. If you do not specify a version, defaults to the most current version.
    */
  var version: js.UndefOr[PipelineVersion] = js.undefined
}

object GetPipelineInput {
  @scala.inline
  def apply(name: PipelineName, version: js.UndefOr[PipelineVersion] = js.undefined): GetPipelineInput = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[GetPipelineInput]
  }
}

