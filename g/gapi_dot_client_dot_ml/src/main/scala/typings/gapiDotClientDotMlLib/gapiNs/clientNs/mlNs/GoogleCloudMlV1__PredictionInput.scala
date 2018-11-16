package typings
package gapiDotClientDotMlLib.gapiNs.clientNs.mlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GoogleCloudMlV1__PredictionInput extends js.Object {
  /**
               * Optional. Number of records per batch, defaults to 64.
               * The service will buffer batch_size number of records in memory before
               * invoking one Tensorflow prediction call internally. So take the record
               * size and memory available into consideration when setting this parameter.
               */
  var batchSize: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The format of the input data files. */
  var dataFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Required. The Google Cloud Storage location of the input data files.
               * May contain wildcards.
               */
  var inputPaths: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Optional. The maximum number of workers to be used for parallel processing.
               * Defaults to 10 if not specified.
               */
  var maxWorkerCount: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Use this field if you want to use the default version for the specified
               * model. The string must use the following format:
               *
               * `"projects/<var>[YOUR_PROJECT]</var>/models/<var>[YOUR_MODEL]</var>"`
               */
  var modelName: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The output Google Cloud Storage location. */
  var outputPath: js.UndefOr[java.lang.String] = js.undefined
  /** Required. The Google Compute Engine region to run the prediction job in. */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Optional. The Google Cloud ML runtime version to use for this batch
               * prediction. If not set, Google Cloud ML will pick the runtime version used
               * during the CreateVersion request for this model version, or choose the
               * latest stable version when model version information is not available
               * such as when the model is specified by uri.
               */
  var runtimeVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Use this field if you want to specify a Google Cloud Storage path for
               * the model to use.
               */
  var uri: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Use this field if you want to specify a version of the model to use. The
               * string is formatted the same way as `model_version`, with the addition
               * of the version information:
               *
               * `"projects/<var>[YOUR_PROJECT]</var>/models/<var>YOUR_MODEL/versions/<var>[YOUR_VERSION]</var>"`
               */
  var versionName: js.UndefOr[java.lang.String] = js.undefined
}
