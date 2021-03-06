package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Performs an asynchronous upload operation. For an overview of Background Transfer capabilities, see Transferring data in the background. Download the Background Transfer sample for examples in JavaScript, C#, and C++. */
@JSGlobal("Windows.Networking.BackgroundTransfer.UploadOperation")
@js.native
abstract class UploadOperation () extends js.Object {
  /** Gets and sets the cost policy for the upload. */
  var costPolicy: BackgroundTransferCostPolicy = js.native
  /** Gets a string value indicating the group the upload belongs to. */
  var group: java.lang.String = js.native
  /** This is a unique identifier for a specific upload operation. A GUID associated to a upload operation will not change for the duration of the upload. */
  var guid: java.lang.String = js.native
  /** Gets the method to use for the upload. */
  var method: java.lang.String = js.native
  /** Gets or sets the transfer priority of this upload operation when within a BackgroundTransferGroup . Possible values are defined by BackgroundTransferPriority . */
  var priority: BackgroundTransferPriority = js.native
  /** Gets the current progress of the upload operation. */
  var progress: BackgroundUploadProgress = js.native
  /** Gets the URI to upload from. */
  var requestedUri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri = js.native
  /** Specifies the IStorageFile to upload. */
  var sourceFile: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile = js.native
  /** Gets the group that this upload operation belongs to. */
  var transferGroup: BackgroundTransferGroup = js.native
  /**
    * Returns an asynchronous operation that can be used to monitor progress and completion of the attached upload. Calling this method allows an app to attach upload operations that were started in a previous app instance.
    * @return Upload operation with callback.
    */
  def attachAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[UploadOperation, UploadOperation] = js.native
  /**
    * Gets the response information.
    * @return Contains the data returned by a server response.
    */
  def getResponseInformation(): ResponseInformation = js.native
  /**
    * Gets the partially uploaded response at the specified location.
    * @param position The position at which to start reading.
    * @return The result stream.
    */
  def getResultStreamAt(position: scala.Double): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
  /**
    * Starts an asynchronous upload operation.
    * @return An asynchronous upload operation that includes progress updates.
    */
  def startAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperationWithProgress[UploadOperation, UploadOperation] = js.native
}

