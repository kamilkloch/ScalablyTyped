package typings
package hystrixjsLib.hystrixjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA3[R, T, U, V] extends js.Object {
  def build(): CommandA3[R, T, U, V]
  def circuitBreakerErrorThresholdPercentage(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def circuitBreakerForceClosed(value: scala.Boolean): CommandBuilderA3[R, T, U, V]
  def circuitBreakerForceOpened(value: scala.Boolean): CommandBuilderA3[R, T, U, V]
  def circuitBreakerRequestVolumeThreshold(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def circuitBreakerSleepWindowInMilliseconds(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def context(value: js.Any): CommandBuilderA3[R, T, U, V]
  def errorHandler(value: js.Function1[/* error */ js.Any, scala.Boolean]): CommandBuilderA3[R, T, U, V]
  def fallbackTo(value: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple3[T, U, V], js.Thenable[R]]): CommandBuilderA3[R, T, U, V]
  def percentileWindowLength(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def percentileWindowNumberOfBuckets(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def requestVolumeRejectionThreshold(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def run(value: js.Function3[/* t */ T, /* u */ U, /* v */ V, js.Thenable[R]]): CommandBuilderA3[R, T, U, V]
  def statisticalWindowLength(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def statisticalWindowNumberOfBuckets(value: scala.Double): CommandBuilderA3[R, T, U, V]
  def timeout(value: scala.Double): CommandBuilderA3[R, T, U, V]
}

object CommandBuilderA3 {
  @scala.inline
  def apply[R, T, U, V](
    build: () => CommandA3[R, T, U, V],
    circuitBreakerErrorThresholdPercentage: scala.Double => CommandBuilderA3[R, T, U, V],
    circuitBreakerForceClosed: scala.Boolean => CommandBuilderA3[R, T, U, V],
    circuitBreakerForceOpened: scala.Boolean => CommandBuilderA3[R, T, U, V],
    circuitBreakerRequestVolumeThreshold: scala.Double => CommandBuilderA3[R, T, U, V],
    circuitBreakerSleepWindowInMilliseconds: scala.Double => CommandBuilderA3[R, T, U, V],
    context: js.Any => CommandBuilderA3[R, T, U, V],
    errorHandler: js.Function1[/* error */ js.Any, scala.Boolean] => CommandBuilderA3[R, T, U, V],
    fallbackTo: js.Function2[/* error */ stdLib.Error, /* args */ js.Tuple3[T, U, V], js.Thenable[R]] => CommandBuilderA3[R, T, U, V],
    percentileWindowLength: scala.Double => CommandBuilderA3[R, T, U, V],
    percentileWindowNumberOfBuckets: scala.Double => CommandBuilderA3[R, T, U, V],
    requestVolumeRejectionThreshold: scala.Double => CommandBuilderA3[R, T, U, V],
    run: js.Function3[/* t */ T, /* u */ U, /* v */ V, js.Thenable[R]] => CommandBuilderA3[R, T, U, V],
    statisticalWindowLength: scala.Double => CommandBuilderA3[R, T, U, V],
    statisticalWindowNumberOfBuckets: scala.Double => CommandBuilderA3[R, T, U, V],
    timeout: scala.Double => CommandBuilderA3[R, T, U, V]
  ): CommandBuilderA3[R, T, U, V] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[CommandBuilderA3[R, T, U, V]]
  }
}

