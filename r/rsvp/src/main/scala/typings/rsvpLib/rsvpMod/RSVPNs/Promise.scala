package typings
package rsvpLib.rsvpMod.RSVPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[T]
  extends stdLib.PromiseLike[T] {
  @JSName(ScalablyTyped.runtime.Symbol.toStringTag)
  val toStringTag: rsvpLib.rsvpLibStrings.Promise = js.native
  def `catch`[TResult](): Promise[T | TResult] = js.native
  def `catch`[TResult](onRejected: js.Function1[/* reason */ js.Any, TResult | stdLib.PromiseLike[TResult]]): Promise[T | TResult] = js.native
  def `catch`[TResult](
    onRejected: js.Function1[/* reason */ js.Any, TResult | stdLib.PromiseLike[TResult]],
    label: java.lang.String
  ): Promise[T | TResult] = js.native
  def `catch`[TResult](onRejected: js.UndefOr[scala.Nothing], label: java.lang.String): Promise[T | TResult] = js.native
  def `catch`[TResult](onRejected: scala.Null, label: java.lang.String): Promise[T | TResult] = js.native
  def `finally`[U](): Promise[T] = js.native
  def `finally`[U](onFinally: U): Promise[T] = js.native
  def `finally`[U](onFinally: stdLib.PromiseLike[U]): Promise[T] = js.native
  def `then`[TResult1, TResult2](
    onFulfilled: js.Function1[/* value */ T, TResult1 | stdLib.PromiseLike[TResult1]],
    onRejected: js.Function1[/* reason */ js.Any, TResult2 | stdLib.PromiseLike[TResult2]],
    label: java.lang.String
  ): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onFulfilled: js.Function1[/* value */ T, TResult1 | stdLib.PromiseLike[TResult1]],
    onRejected: js.UndefOr[scala.Nothing],
    label: java.lang.String
  ): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onFulfilled: js.Function1[/* value */ T, TResult1 | stdLib.PromiseLike[TResult1]],
    onRejected: scala.Null,
    label: java.lang.String
  ): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onFulfilled: js.UndefOr[scala.Nothing],
    onRejected: js.Function1[/* reason */ js.Any, TResult2 | stdLib.PromiseLike[TResult2]],
    label: java.lang.String
  ): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onFulfilled: js.UndefOr[scala.Nothing],
    onRejected: js.UndefOr[scala.Nothing],
    label: java.lang.String
  ): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onFulfilled: js.UndefOr[scala.Nothing], onRejected: scala.Null, label: java.lang.String): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onFulfilled: scala.Null,
    onRejected: js.Function1[/* reason */ js.Any, TResult2 | stdLib.PromiseLike[TResult2]],
    label: java.lang.String
  ): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onFulfilled: scala.Null, onRejected: js.UndefOr[scala.Nothing], label: java.lang.String): Promise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onFulfilled: scala.Null, onRejected: scala.Null, label: java.lang.String): Promise[TResult1 | TResult2] = js.native
}
