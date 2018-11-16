package typings
package restfulDotJsLib.restfulDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionEndpoint extends Endpoint[CollectionEndpoint] {
  /**
       * Delete a member in a collection. Returns a promise with the response.
       * @param id
       * @param data
       * @param headers
       */
  def delete[T](id: js.Any): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Delete a member in a collection. Returns a promise with the response.
       * @param id
       * @param data
       * @param headers
       */
  def delete[T](id: js.Any, data: js.Any): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Delete a member in a collection. Returns a promise with the response.
       * @param id
       * @param data
       * @param headers
       */
  def delete[T](id: js.Any, data: js.Any, headers: Headers): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Get a member in a collection. Returns a promise with an entity.
       * @param id
       */
  def get[T](id: js.Any): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Get a member in a collection. Returns a promise with an entity.
       * @param id
       */
  def get[T](id: js.Any, params: js.Any): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Get a member in a collection. Returns a promise with an entity.
       * @param id
       */
  def get[T](id: js.Any, params: js.Any, headers: Headers): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Get a full collection. Returns a promise with an array of entities.
       */
  def getAll[T](): stdLib.Promise[CollectionResponse[T]] = js.native
  /**
       * Get a full collection. Returns a promise with an array of entities.
       */
  def getAll[T](params: js.Any): stdLib.Promise[CollectionResponse[T]] = js.native
  /**
       * Get a full collection. Returns a promise with an array of entities.
       */
  def getAll[T](params: js.Any, headers: Headers): stdLib.Promise[CollectionResponse[T]] = js.native
  /**
       * Perform a HEAD request on a member in a collection. Returns a promise with the response.
       * @param id
       * @param headers
       */
  def head[T](id: js.Any): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Perform a HEAD request on a member in a collection. Returns a promise with the response.
       * @param id
       * @param headers
       */
  def head[T](id: js.Any, headers: Headers): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Patch a member in a collection. Returns a promise with the response.
       * @param id
       * @param data
       * @param headers
       */
  def patch[T](id: js.Any, data: js.Any): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Patch a member in a collection. Returns a promise with the response.
       * @param id
       * @param data
       * @param headers
       */
  def patch[T](id: js.Any, data: js.Any, headers: Headers): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Create a member in a collection. Returns a promise with the response.
       */
  def post[T](data: js.Any): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Create a member in a collection. Returns a promise with the response.
       */
  def post[T](data: js.Any, headers: Headers): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Update a member in a collection. Returns a promise with the response.
       * @param id
       * @param data
       * @param headers
       */
  def put[T](id: js.Any, data: js.Any): stdLib.Promise[MemberResponse[T]] = js.native
  /**
       * Update a member in a collection. Returns a promise with the response.
       * @param id
       * @param data
       * @param headers
       */
  def put[T](id: js.Any, data: js.Any, headers: Headers): stdLib.Promise[MemberResponse[T]] = js.native
}
