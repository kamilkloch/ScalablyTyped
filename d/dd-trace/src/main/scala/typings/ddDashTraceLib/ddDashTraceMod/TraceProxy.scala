package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceProxy
  extends opentracingLib.opentracingMod.Tracer {
  /**
       * Get the span from the current context.
       * @returns The current span or null if outside a trace context.
       */
  def currentSpan(): opentracingLib.opentracingMod.Span | scala.Null = js.native
  /**
       * Initializes the tracer. This should be called before importing other libraries.
       */
  def init(): this.type = js.native
  /**
       * Initializes the tracer. This should be called before importing other libraries.
       */
  def init(options: TracerOptions): this.type = js.native
  /**
       * Get the scope manager to manager context propagation for the tracer.
       */
  def scopeManager(): ScopeManager = js.native
  /**
       * Initiate a trace and creates a new span.
       * @param operationName The operation name to be used for this span.
       * @param options Configuration options. These will take precedence over environment variables.
       */
  def trace(operationName: java.lang.String, options: TraceOptions): stdLib.Promise[opentracingLib.opentracingMod.Span] = js.native
  /**
       * Initiate a trace and creates a new span.
       * @param operationName The operation name to be used for this span.
       * @param options Configuration options. These will take precedence over environment variables.
       */
  def trace(
    operationName: java.lang.String,
    options: TraceOptions,
    callback: js.Function1[/* span */ opentracingLib.opentracingMod.Span, scala.Unit]
  ): scala.Unit = js.native
  /**
       * Enable and optionally configure a plugin.
       * @param plugin The name of a built-in plugin.
       * @param config Configuration options.
       */
  def use[P /* <: ddDashTraceLib.Plugin */](plugin: P, config: js.Any): this.type = js.native
}
