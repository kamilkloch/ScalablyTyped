package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
   * section querycursor.js
   * http://mongoosejs.com/docs/api.html#querycursor-js
   *
   * Callback signatures are from: http://mongodb.github.io/node-mongodb-native/2.1/api/Cursor.html#close
   * QueryCursor can only be accessed by query#cursor(), we only
   *   expose its interface to enable type-checking.
   */
@js.native
trait QueryCursor[T /* <: Document */]
  extends nodeLib.streamMod.Readable {
  /** Marks this cursor as closed. Will stop streaming and subsequent calls to next() will error. */
  def close(): stdLib.Promise[_] = js.native
  /** Marks this cursor as closed. Will stop streaming and subsequent calls to next() will error. */
  def close(callback: js.Function2[/* error */ js.Any, /* result */ js.Any, scala.Unit]): stdLib.Promise[_] = js.native
  /**
       * Execute fn for every document in the cursor. If fn returns a promise,
       * will wait for the promise to resolve before iterating on to the next one.
       * Returns a promise that resolves when done.
       * @param fn Function to be executed for every document in the cursor
       * @param callback Executed when all docs have been processed
       */
  def eachAsync(fn: js.Function1[/* doc */ T, _]): stdLib.Promise[T] = js.native
  /**
       * Execute fn for every document in the cursor. If fn returns a promise,
       * will wait for the promise to resolve before iterating on to the next one.
       * Returns a promise that resolves when done.
       * @param fn Function to be executed for every document in the cursor
       * @param callback Executed when all docs have been processed
       */
  def eachAsync(fn: js.Function1[/* doc */ T, _], callback: js.Function1[/* err */ js.Any, scala.Unit]): stdLib.Promise[T] = js.native
  /**
       * Execute fn for every document in the cursor. If fn returns a promise,
       * will wait for the promise to resolve before iterating on to the next one.
       * Returns a promise that resolves when done.
       * @param fn Function to be executed for every document in the cursor
       * @param options Async options (e. g. parallel function execution)
       * @param callback Executed when all docs have been processed
       */
  def eachAsync(fn: js.Function1[/* doc */ T, _], options: EachAsyncOptions): stdLib.Promise[T] = js.native
  /**
       * Execute fn for every document in the cursor. If fn returns a promise,
       * will wait for the promise to resolve before iterating on to the next one.
       * Returns a promise that resolves when done.
       * @param fn Function to be executed for every document in the cursor
       * @param options Async options (e. g. parallel function execution)
       * @param callback Executed when all docs have been processed
       */
  def eachAsync(
    fn: js.Function1[/* doc */ T, _],
    options: EachAsyncOptions,
    callback: js.Function1[/* err */ js.Any, scala.Unit]
  ): stdLib.Promise[T] = js.native
  /**
       * Registers a transform function which subsequently maps documents retrieved
       * via the streams interface or .next()
       */
  def map(fn: js.Function1[/* doc */ T, T]): this.type = js.native
  /**
       * Get the next document from this cursor. Will return null when there are
       * no documents left.
       */
  def next(): stdLib.Promise[_] = js.native
  /**
       * Get the next document from this cursor. Will return null when there are
       * no documents left.
       */
  def next(callback: js.Function2[/* err */ js.Any, /* doc */ js.UndefOr[T], scala.Unit]): stdLib.Promise[_] = js.native
}
