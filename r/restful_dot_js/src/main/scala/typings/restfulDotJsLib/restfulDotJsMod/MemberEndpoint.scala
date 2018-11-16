package typings
package restfulDotJsLib.restfulDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemberEndpoint extends Endpoint[MemberEndpoint] {
  /**
       * Target a child collection name.
       * @param name
       */
  def all(name: java.lang.String): CollectionEndpoint = js.native
  def allUrl(name: java.lang.String, url: java.lang.String): CollectionEndpoint = js.native
  def customUrl(): java.lang.String = js.native
  def customUrl(url: java.lang.String): MemberEndpoint = js.native
  /**
       * Delete a member. Returns a promise with the response.
       * @param data
       * @param headers
       */
  def delete[T](): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Delete a member. Returns a promise with the response.
       * @param data
       * @param headers
       */
  def delete[T](data: js.Any): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Delete a member. Returns a promise with the response.
       * @param data
       * @param headers
       */
  def delete[T](data: js.Any, headers: Headers): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Get a member. Returns a promise with an entity.
       * @param params
       * @param headers
       */
  def get[T](): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Get a member. Returns a promise with an entity.
       * @param params
       * @param headers
       */
  def get[T](params: js.Any): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Get a member. Returns a promise with an entity.
       * @param params
       * @param headers
       */
  def get[T](params: js.Any, headers: Headers): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Perform a HEAD request on a member. Returns a promise with the response.
       * @param headers
       */
  def head[T](): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Perform a HEAD request on a member. Returns a promise with the response.
       * @param headers
       */
  def head[T](headers: js.Any): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Target a child member in a collection name.
       * @param name
       * @param id
       */
  def one(name: java.lang.String, id: js.Any): MemberEndpoint = js.native
  def oneUrl(name: java.lang.String, url: java.lang.String): MemberEndpoint = js.native
  /**
       * Patch a member. Returns a promise with the response.
       * @param data
       * @param headers
       */
  def patch[T](data: js.Any): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Patch a member. Returns a promise with the response.
       * @param data
       * @param headers
       */
  def patch[T](data: js.Any, headers: Headers): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Update a member. Returns a promise with the response.
       * @param data
       * @param headers
       */
  def put[T](data: js.Any): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Update a member. Returns a promise with the response.
       * @param data
       * @param headers
       */
  def put[T](data: js.Any, headers: Headers): stdLib.Promise[MemberResponse[T]] = js.native
}
