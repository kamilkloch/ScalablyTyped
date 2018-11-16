package typings
package catboxLib.catboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClientApi[T] extends js.Object {
  /**
       * drop(key) - remove an item from cache where:
       *  * key - a cache key object (see [ICacheKey]).
       */
  def drop(key: CacheKey): stdLib.Promise[scala.Unit]
  /**
       * get(key, callback) - retrieve an item from the cache engine if found where:
       *  * key - a cache key object (see [ICacheKey]).
       */
  def get(key: CacheKey): stdLib.Promise[scala.Null | CachedObject[T]]
  /** isReady() - returns true if cache engine determines itself as ready, false if it is not ready. */
  def isReady(): scala.Boolean
  /**
       * set(key, value, ttl) - store an item in the cache for a specified length of time, where:
       *  * key - a cache key object (see [ICacheKey]).
       *  * value - the string or object value to be stored.
       *  * ttl - a time-to-live value in milliseconds after which the item is automatically removed from the cache (or is marked invalid).
       */
  def set(key: CacheKey, value: T, ttl: scala.Double): stdLib.Promise[scala.Unit]
  /** start() - creates a connection to the cache server. Must be called before any other method is available. */
  def start(): stdLib.Promise[scala.Unit]
  /** stop() - terminates the connection to the cache server. */
  def stop(): scala.Unit
  /** validateSegmentName(segment) - returns null if the segment name is valid (see below), otherwise should return an instance of Error with an appropriate message. */
  def validateSegmentName(segment: java.lang.String): scala.Null | stdLib.Error
}
