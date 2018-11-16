package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the FilesUploaded event.
 */

trait ASPxClientFileManagerFilesUploadedEventArgs extends ASPxClientEventArgs {
  /**
       * Gets an array of uploaded file names.
       * Value: An array of string values that are the file names.
       */
  var fileNames: js.Array[java.lang.String]
  /**
       * Gets the path to the folder where files are uploaded.
       * Value: A string value specifying the uploaded files path.
       */
  var folder: java.lang.String
}
