package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMapConsumerConstructor
  extends ScalablyTyped.runtime.Instantiable1[
      (/* rawSourceMap */ RawSourceMap) | (/* rawSourceMap */ RawIndexMap) | (/* rawSourceMap */ java.lang.String), 
      stdLib.Promise[BasicSourceMapConsumer] | stdLib.Promise[IndexedSourceMapConsumer] | (stdLib.Promise[BasicSourceMapConsumer | IndexedSourceMapConsumer])
    ]
     with ScalablyTyped.runtime.Instantiable2[
      (/* rawSourceMap */ RawSourceMap) | (/* rawSourceMap */ RawIndexMap) | (/* rawSourceMap */ java.lang.String), 
      /* sourceMapUrl */ SourceMapUrl, 
      stdLib.Promise[BasicSourceMapConsumer] | stdLib.Promise[IndexedSourceMapConsumer] | (stdLib.Promise[BasicSourceMapConsumer | IndexedSourceMapConsumer])
    ] {
  var GENERATED_ORDER: scala.Double = js.native
  var GREATEST_LOWER_BOUND: scala.Double = js.native
  var LEAST_UPPER_BOUND: scala.Double = js.native
  var ORIGINAL_ORDER: scala.Double = js.native
  /**
       * Create a BasicSourceMapConsumer from a SourceMapGenerator.
       *
       * @param sourceMap
       *        The source map that will be consumed.
       */
  def fromSourceMap(sourceMap: SourceMapGenerator): stdLib.Promise[BasicSourceMapConsumer] = js.native
  /**
       * Create a BasicSourceMapConsumer from a SourceMapGenerator.
       *
       * @param sourceMap
       *        The source map that will be consumed.
       */
  def fromSourceMap(sourceMap: SourceMapGenerator, sourceMapUrl: SourceMapUrl): stdLib.Promise[BasicSourceMapConsumer] = js.native
  /**
       * Construct a new `SourceMapConsumer` from `rawSourceMap` and `sourceMapUrl`
       * (see the `SourceMapConsumer` constructor for details. Then, invoke the `async
       * function f(SourceMapConsumer) -> T` with the newly constructed consumer, wait
       * for `f` to complete, call `destroy` on the consumer, and return `f`'s return
       * value.
       *
       * You must not use the consumer after `f` completes!
       *
       * By using `with`, you do not have to remember to manually call `destroy` on
       * the consumer, since it will be called automatically once `f` completes.
       *
       * ```js
       * const xSquared = await SourceMapConsumer.with(
       *   myRawSourceMap,
       *   null,
       *   async function (consumer) {
       *     // Use `consumer` inside here and don't worry about remembering
       *     // to call `destroy`.
       *
       *     const x = await whatever(consumer);
       *     return x * x;
       *   }
       * );
       *
       * // You may not use that `consumer` anymore out here; it has
       * // been destroyed. But you can use `xSquared`.
       * console.log(xSquared);
       * ```
       */
  def `with`[T](
    rawSourceMap: java.lang.String,
    sourceMapUrl: js.UndefOr[scala.Nothing],
    callback: js.Function1[
      /* consumer */ BasicSourceMapConsumer | IndexedSourceMapConsumer, 
      stdLib.Promise[T] | T
    ]
  ): stdLib.Promise[T] = js.native
  /**
       * Construct a new `SourceMapConsumer` from `rawSourceMap` and `sourceMapUrl`
       * (see the `SourceMapConsumer` constructor for details. Then, invoke the `async
       * function f(SourceMapConsumer) -> T` with the newly constructed consumer, wait
       * for `f` to complete, call `destroy` on the consumer, and return `f`'s return
       * value.
       *
       * You must not use the consumer after `f` completes!
       *
       * By using `with`, you do not have to remember to manually call `destroy` on
       * the consumer, since it will be called automatically once `f` completes.
       *
       * ```js
       * const xSquared = await SourceMapConsumer.with(
       *   myRawSourceMap,
       *   null,
       *   async function (consumer) {
       *     // Use `consumer` inside here and don't worry about remembering
       *     // to call `destroy`.
       *
       *     const x = await whatever(consumer);
       *     return x * x;
       *   }
       * );
       *
       * // You may not use that `consumer` anymore out here; it has
       * // been destroyed. But you can use `xSquared`.
       * console.log(xSquared);
       * ```
       */
  def `with`[T](
    rawSourceMap: java.lang.String,
    sourceMapUrl: scala.Null,
    callback: js.Function1[
      /* consumer */ BasicSourceMapConsumer | IndexedSourceMapConsumer, 
      stdLib.Promise[T] | T
    ]
  ): stdLib.Promise[T] = js.native
  /**
       * Construct a new `SourceMapConsumer` from `rawSourceMap` and `sourceMapUrl`
       * (see the `SourceMapConsumer` constructor for details. Then, invoke the `async
       * function f(SourceMapConsumer) -> T` with the newly constructed consumer, wait
       * for `f` to complete, call `destroy` on the consumer, and return `f`'s return
       * value.
       *
       * You must not use the consumer after `f` completes!
       *
       * By using `with`, you do not have to remember to manually call `destroy` on
       * the consumer, since it will be called automatically once `f` completes.
       *
       * ```js
       * const xSquared = await SourceMapConsumer.with(
       *   myRawSourceMap,
       *   null,
       *   async function (consumer) {
       *     // Use `consumer` inside here and don't worry about remembering
       *     // to call `destroy`.
       *
       *     const x = await whatever(consumer);
       *     return x * x;
       *   }
       * );
       *
       * // You may not use that `consumer` anymore out here; it has
       * // been destroyed. But you can use `xSquared`.
       * console.log(xSquared);
       * ```
       */
  def `with`[T](
    rawSourceMap: java.lang.String,
    sourceMapUrl: SourceMapUrl,
    callback: js.Function1[
      /* consumer */ BasicSourceMapConsumer | IndexedSourceMapConsumer, 
      stdLib.Promise[T] | T
    ]
  ): stdLib.Promise[T] = js.native
  /**
       * Construct a new `SourceMapConsumer` from `rawSourceMap` and `sourceMapUrl`
       * (see the `SourceMapConsumer` constructor for details. Then, invoke the `async
       * function f(SourceMapConsumer) -> T` with the newly constructed consumer, wait
       * for `f` to complete, call `destroy` on the consumer, and return `f`'s return
       * value.
       *
       * You must not use the consumer after `f` completes!
       *
       * By using `with`, you do not have to remember to manually call `destroy` on
       * the consumer, since it will be called automatically once `f` completes.
       *
       * ```js
       * const xSquared = await SourceMapConsumer.with(
       *   myRawSourceMap,
       *   null,
       *   async function (consumer) {
       *     // Use `consumer` inside here and don't worry about remembering
       *     // to call `destroy`.
       *
       *     const x = await whatever(consumer);
       *     return x * x;
       *   }
       * );
       *
       * // You may not use that `consumer` anymore out here; it has
       * // been destroyed. But you can use `xSquared`.
       * console.log(xSquared);
       * ```
       */
  def `with`[T](
    rawSourceMap: RawIndexMap,
    sourceMapUrl: js.UndefOr[scala.Nothing],
    callback: js.Function1[
      /* consumer */ BasicSourceMapConsumer | IndexedSourceMapConsumer, 
      stdLib.Promise[T] | T
    ]
  ): stdLib.Promise[T] = js.native
  /**
       * Construct a new `SourceMapConsumer` from `rawSourceMap` and `sourceMapUrl`
       * (see the `SourceMapConsumer` constructor for details. Then, invoke the `async
       * function f(SourceMapConsumer) -> T` with the newly constructed consumer, wait
       * for `f` to complete, call `destroy` on the consumer, and return `f`'s return
       * value.
       *
       * You must not use the consumer after `f` completes!
       *
       * By using `with`, you do not have to remember to manually call `destroy` on
       * the consumer, since it will be called automatically once `f` completes.
       *
       * ```js
       * const xSquared = await SourceMapConsumer.with(
       *   myRawSourceMap,
       *   null,
       *   async function (consumer) {
       *     // Use `consumer` inside here and don't worry about remembering
       *     // to call `destroy`.
       *
       *     const x = await whatever(consumer);
       *     return x * x;
       *   }
       * );
       *
       * // You may not use that `consumer` anymore out here; it has
       * // been destroyed. But you can use `xSquared`.
       * console.log(xSquared);
       * ```
       */
  def `with`[T](
    rawSourceMap: RawIndexMap,
    sourceMapUrl: scala.Null,
    callback: js.Function1[
      /* consumer */ BasicSourceMapConsumer | IndexedSourceMapConsumer, 
      stdLib.Promise[T] | T
    ]
  ): stdLib.Promise[T] = js.native
  /**
       * Construct a new `SourceMapConsumer` from `rawSourceMap` and `sourceMapUrl`
       * (see the `SourceMapConsumer` constructor for details. Then, invoke the `async
       * function f(SourceMapConsumer) -> T` with the newly constructed consumer, wait
       * for `f` to complete, call `destroy` on the consumer, and return `f`'s return
       * value.
       *
       * You must not use the consumer after `f` completes!
       *
       * By using `with`, you do not have to remember to manually call `destroy` on
       * the consumer, since it will be called automatically once `f` completes.
       *
       * ```js
       * const xSquared = await SourceMapConsumer.with(
       *   myRawSourceMap,
       *   null,
       *   async function (consumer) {
       *     // Use `consumer` inside here and don't worry about remembering
       *     // to call `destroy`.
       *
       *     const x = await whatever(consumer);
       *     return x * x;
       *   }
       * );
       *
       * // You may not use that `consumer` anymore out here; it has
       * // been destroyed. But you can use `xSquared`.
       * console.log(xSquared);
       * ```
       */
  def `with`[T](
    rawSourceMap: RawIndexMap,
    sourceMapUrl: SourceMapUrl,
    callback: js.Function1[
      /* consumer */ BasicSourceMapConsumer | IndexedSourceMapConsumer, 
      stdLib.Promise[T] | T
    ]
  ): stdLib.Promise[T] = js.native
  /**
       * Construct a new `SourceMapConsumer` from `rawSourceMap` and `sourceMapUrl`
       * (see the `SourceMapConsumer` constructor for details. Then, invoke the `async
       * function f(SourceMapConsumer) -> T` with the newly constructed consumer, wait
       * for `f` to complete, call `destroy` on the consumer, and return `f`'s return
       * value.
       *
       * You must not use the consumer after `f` completes!
       *
       * By using `with`, you do not have to remember to manually call `destroy` on
       * the consumer, since it will be called automatically once `f` completes.
       *
       * ```js
       * const xSquared = await SourceMapConsumer.with(
       *   myRawSourceMap,
       *   null,
       *   async function (consumer) {
       *     // Use `consumer` inside here and don't worry about remembering
       *     // to call `destroy`.
       *
       *     const x = await whatever(consumer);
       *     return x * x;
       *   }
       * );
       *
       * // You may not use that `consumer` anymore out here; it has
       * // been destroyed. But you can use `xSquared`.
       * console.log(xSquared);
       * ```
       */
  def `with`[T](
    rawSourceMap: RawSourceMap,
    sourceMapUrl: js.UndefOr[scala.Nothing],
    callback: js.Function1[
      /* consumer */ BasicSourceMapConsumer | IndexedSourceMapConsumer, 
      stdLib.Promise[T] | T
    ]
  ): stdLib.Promise[T] = js.native
  /**
       * Construct a new `SourceMapConsumer` from `rawSourceMap` and `sourceMapUrl`
       * (see the `SourceMapConsumer` constructor for details. Then, invoke the `async
       * function f(SourceMapConsumer) -> T` with the newly constructed consumer, wait
       * for `f` to complete, call `destroy` on the consumer, and return `f`'s return
       * value.
       *
       * You must not use the consumer after `f` completes!
       *
       * By using `with`, you do not have to remember to manually call `destroy` on
       * the consumer, since it will be called automatically once `f` completes.
       *
       * ```js
       * const xSquared = await SourceMapConsumer.with(
       *   myRawSourceMap,
       *   null,
       *   async function (consumer) {
       *     // Use `consumer` inside here and don't worry about remembering
       *     // to call `destroy`.
       *
       *     const x = await whatever(consumer);
       *     return x * x;
       *   }
       * );
       *
       * // You may not use that `consumer` anymore out here; it has
       * // been destroyed. But you can use `xSquared`.
       * console.log(xSquared);
       * ```
       */
  def `with`[T](
    rawSourceMap: RawSourceMap,
    sourceMapUrl: scala.Null,
    callback: js.Function1[
      /* consumer */ BasicSourceMapConsumer | IndexedSourceMapConsumer, 
      stdLib.Promise[T] | T
    ]
  ): stdLib.Promise[T] = js.native
  /**
       * Construct a new `SourceMapConsumer` from `rawSourceMap` and `sourceMapUrl`
       * (see the `SourceMapConsumer` constructor for details. Then, invoke the `async
       * function f(SourceMapConsumer) -> T` with the newly constructed consumer, wait
       * for `f` to complete, call `destroy` on the consumer, and return `f`'s return
       * value.
       *
       * You must not use the consumer after `f` completes!
       *
       * By using `with`, you do not have to remember to manually call `destroy` on
       * the consumer, since it will be called automatically once `f` completes.
       *
       * ```js
       * const xSquared = await SourceMapConsumer.with(
       *   myRawSourceMap,
       *   null,
       *   async function (consumer) {
       *     // Use `consumer` inside here and don't worry about remembering
       *     // to call `destroy`.
       *
       *     const x = await whatever(consumer);
       *     return x * x;
       *   }
       * );
       *
       * // You may not use that `consumer` anymore out here; it has
       * // been destroyed. But you can use `xSquared`.
       * console.log(xSquared);
       * ```
       */
  def `with`[T](
    rawSourceMap: RawSourceMap,
    sourceMapUrl: SourceMapUrl,
    callback: js.Function1[
      /* consumer */ BasicSourceMapConsumer | IndexedSourceMapConsumer, 
      stdLib.Promise[T] | T
    ]
  ): stdLib.Promise[T] = js.native
}
