package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryBuilder
  extends ChainableInterface
     with QueryInterface {
  var and: QueryBuilder = js.native
  var or: QueryBuilder = js.native
  //TODO: Promise?
  def columnInfo(): bluebirdLib.bluebirdMod.^[ColumnInfo] = js.native
  def columnInfo(column: java.lang.String): bluebirdLib.bluebirdMod.^[ColumnInfo] = js.native
  def forShare(tableNames: java.lang.String*): QueryBuilder = js.native
  def forShare(tableNames: js.Array[java.lang.String]): QueryBuilder = js.native
  def forUpdate(tableNames: java.lang.String*): QueryBuilder = js.native
  def forUpdate(tableNames: js.Array[java.lang.String]): QueryBuilder = js.native
  /**
    * See if the underlying promise was cancelled at the creation time of this inspection object.
    */
  /* InferMemberOverrides */
  override def isCancelled(): scala.Boolean = js.native
  /**
    * See if the underlying promise was fulfilled at the creation time of this inspection object.
    */
  /* InferMemberOverrides */
  override def isFulfilled(): scala.Boolean = js.native
  /**
    * See if the underlying promise was defer at the creation time of this inspection object.
    */
  /* InferMemberOverrides */
  override def isPending(): scala.Boolean = js.native
  /**
    * See if the underlying promise was rejected at the creation time of this inspection object.
    */
  /* InferMemberOverrides */
  override def isRejected(): scala.Boolean = js.native
  def on(event: java.lang.String, callback: js.Function): QueryBuilder = js.native
  def queryContext(context: js.Any): QueryBuilder = js.native
  /**
    * Get the rejection reason for the underlying promise. Throws if the promise wasn't rejected at the creation time of this inspection object.
    *
    * throws `TypeError`
    */
  /* InferMemberOverrides */
  override def reason(): js.Any = js.native
  def toSQL(): Sql = js.native
  /**
    * Get the fulfillment value of the underlying promise. Throws if the promise wasn't fulfilled at the creation time of this inspection object.
    *
    * throws `TypeError`
    */
  /* InferMemberOverrides */
  override def value(): js.Any = js.native
}

