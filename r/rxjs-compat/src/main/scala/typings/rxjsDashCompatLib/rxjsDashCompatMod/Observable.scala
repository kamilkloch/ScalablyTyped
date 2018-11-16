package typings
package rxjsDashCompatLib.rxjsDashCompatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs-compat", "Observable")
@js.native
class Observable[T] ()
  extends rxjsLib.rxjsMod.Observable[T] {
  /**
       * @constructor
       * @param {Function} subscribe the function that is called when the Observable is
       * initially subscribed to. This function is given a Subscriber, to which new values
       * can be `next`ed, or an `error` method can be called to raise an error, or
       * `complete` can be called to notify of a successful completion.
       */
  def this(subscribe: js.ThisFunction1[
      /* this */ rxjsLib.internalObservableMod.Observable[T], 
      /* subscriber */ rxjsLib.internalSubscriberMod.Subscriber[T], 
      rxjsLib.internalTypesMod.TeardownLogic
    ]) = this()
}

@JSImport("rxjs-compat", "Observable")
@js.native
object Observable extends js.Object {
  /**
       * Creates a new cold Observable by calling the Observable constructor
       * @static true
       * @owner Observable
       * @method create
       * @param {Function} subscribe? the subscriber function to be passed to the Observable constructor
       * @return {Observable} a new cold observable
       * @nocollapse
       */
  var create: js.Function = js.native
  /**
       * @nocollapse
       * @deprecated In favor of iif creation function: import { iif } from 'rxjs';
       */
  @JSName("if")
  var if_Original: js.Function3[
    /* condition */ js.Function0[scala.Boolean], 
    /* trueResult */ js.UndefOr[rxjsLib.internalTypesMod.SubscribableOrPromise[_]], 
    /* falseResult */ js.UndefOr[rxjsLib.internalTypesMod.SubscribableOrPromise[_]], 
    rxjsLib.internalObservableMod.Observable[_]
  ] = js.native
  /**
       * @nocollapse
       * @deprecated In favor of throwError creation function: import { throwError } from 'rxjs';
       */
  @JSName("throw")
  var throw_Original: js.Function2[
    /* error */ js.Any, 
    /* scheduler */ js.UndefOr[rxjsLib.internalTypesMod.SchedulerLike], 
    rxjsLib.internalObservableMod.Observable[scala.Nothing]
  ] = js.native
  /**
       * @nocollapse
       * @deprecated In favor of iif creation function: import { iif } from 'rxjs';
       */
  /* Expanded */def `if`[T, F](condition: js.Function0[scala.Boolean]): rxjsLib.internalObservableMod.Observable[T | F] = js.native
  /**
       * @nocollapse
       * @deprecated In favor of iif creation function: import { iif } from 'rxjs';
       */
  /* Expanded */def `if`[T, F](
    condition: js.Function0[scala.Boolean],
    trueResult: rxjsLib.internalTypesMod.SubscribableOrPromise[T]
  ): rxjsLib.internalObservableMod.Observable[T | F] = js.native
  /**
       * @nocollapse
       * @deprecated In favor of iif creation function: import { iif } from 'rxjs';
       */
  /* Expanded */def `if`[T, F](
    condition: js.Function0[scala.Boolean],
    trueResult: rxjsLib.internalTypesMod.SubscribableOrPromise[T],
    falseResult: rxjsLib.internalTypesMod.SubscribableOrPromise[F]
  ): rxjsLib.internalObservableMod.Observable[T | F] = js.native
  /**
       * @nocollapse
       * @deprecated In favor of throwError creation function: import { throwError } from 'rxjs';
       */
  /* Expanded */def `throw`(error: js.Any): rxjsLib.internalObservableMod.Observable[scala.Nothing] = js.native
  /**
       * @nocollapse
       * @deprecated In favor of throwError creation function: import { throwError } from 'rxjs';
       */
  /* Expanded */def `throw`(error: js.Any, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[scala.Nothing] = js.native
}
