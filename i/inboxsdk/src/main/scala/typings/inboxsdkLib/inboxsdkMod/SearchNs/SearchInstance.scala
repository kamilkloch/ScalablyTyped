package typings
package inboxsdkLib.inboxsdkMod.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchInstance extends js.Object {
  def registerSearchQueryRewriter(rewriter: SearchQueryRewriter): scala.Unit
  def registerSearchSuggestionsProvider(
    handler: js.Function1[
      /* query */ java.lang.String, 
      js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
    ]
  ): scala.Unit
}

object SearchInstance {
  @scala.inline
  def apply(
    registerSearchQueryRewriter: SearchQueryRewriter => scala.Unit,
    registerSearchSuggestionsProvider: js.Function1[
      /* query */ java.lang.String, 
      js.Array[AutocompleteSearchResult] | js.Promise[js.Array[AutocompleteSearchResult]]
    ] => scala.Unit
  ): SearchInstance = {
    val __obj = js.Dynamic.literal(registerSearchQueryRewriter = js.Any.fromFunction1(registerSearchQueryRewriter), registerSearchSuggestionsProvider = js.Any.fromFunction1(registerSearchSuggestionsProvider))
  
    __obj.asInstanceOf[SearchInstance]
  }
}

