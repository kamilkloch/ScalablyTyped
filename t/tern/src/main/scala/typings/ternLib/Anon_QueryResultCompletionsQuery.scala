package typings
package ternLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultCompletionsQuery extends js.Object {
  var query: ternLib.libTernMod.CompletionsQuery
  var result: ternLib.libTernMod.CompletionsQueryResult
}

object Anon_QueryResultCompletionsQuery {
  @scala.inline
  def apply(query: ternLib.libTernMod.CompletionsQuery, result: ternLib.libTernMod.CompletionsQueryResult): Anon_QueryResultCompletionsQuery = {
    val __obj = js.Dynamic.literal(query = query, result = result)
  
    __obj.asInstanceOf[Anon_QueryResultCompletionsQuery]
  }
}

