package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentTracing extends EventEmitter {
  // Docs: http://electronjs.org/docs/api/content-tracing
  /**
    * Get the current monitoring traced data. Child processes typically cache trace
    * data and only rarely flush and send trace data back to the main process. This is
    * because it may be an expensive operation to send the trace data over IPC and we
    * would like to avoid unneeded runtime overhead from tracing. So, to end tracing,
    * we must asynchronously ask all child processes to flush any pending trace data.
    * Once all child processes have acknowledged the captureMonitoringSnapshot request
    * the callback will be called with a file that contains the traced data.
    */
  def captureMonitoringSnapshot(
    resultFilePath: java.lang.String,
    callback: js.Function1[/* resultFilePath */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Get a set of category groups. The category groups can change as new code paths
    * are reached. Once all child processes have acknowledged the getCategories
    * request the callback is invoked with an array of category groups.
    */
  def getCategories(callback: js.Function1[/* categories */ js.Array[java.lang.String], scala.Unit]): scala.Unit = js.native
  /**
    * Get the maximum usage across processes of trace buffer as a percentage of the
    * full state. When the TraceBufferUsage value is determined the callback is
    * called.
    */
  def getTraceBufferUsage(callback: js.Function2[/* value */ scala.Double, /* percentage */ scala.Double, scala.Unit]): scala.Unit = js.native
  /**
    * Start monitoring on all processes. Monitoring begins immediately locally and
    * asynchronously on child processes as soon as they receive the startMonitoring
    * request. Once all child processes have acknowledged the startMonitoring request
    * the callback will be called.
    */
  def startMonitoring(options: StartMonitoringOptions, callback: js.Function): scala.Unit = js.native
  /**
    * Start recording on all processes. Recording begins immediately locally and
    * asynchronously on child processes as soon as they receive the EnableRecording
    * request. The callback will be called once all child processes have acknowledged
    * the startRecording request.
    */
  def startRecording(options: TraceCategoriesAndOptions, callback: js.Function): scala.Unit = js.native
  def startRecording(options: TraceConfig, callback: js.Function): scala.Unit = js.native
  /**
    * Stop monitoring on all processes. Once all child processes have acknowledged the
    * stopMonitoring request the callback is called.
    */
  def stopMonitoring(callback: js.Function): scala.Unit = js.native
  /**
    * Stop recording on all processes. Child processes typically cache trace data and
    * only rarely flush and send trace data back to the main process. This helps to
    * minimize the runtime overhead of tracing since sending trace data over IPC can
    * be an expensive operation. So, to end tracing, we must asynchronously ask all
    * child processes to flush any pending trace data. Once all child processes have
    * acknowledged the stopRecording request, callback will be called with a file that
    * contains the traced data. Trace data will be written into resultFilePath if it
    * is not empty or into a temporary file. The actual file path will be passed to
    * callback if it's not null.
    */
  def stopRecording(
    resultFilePath: java.lang.String,
    callback: js.Function1[/* resultFilePath */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

