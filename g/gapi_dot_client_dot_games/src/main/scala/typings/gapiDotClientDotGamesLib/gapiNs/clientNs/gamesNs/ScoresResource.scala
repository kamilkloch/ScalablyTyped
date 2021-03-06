package typings
package gapiDotClientDotGamesLib.gapiNs.clientNs.gamesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScoresResource extends js.Object {
  /**
    * Get high scores, and optionally ranks, in leaderboards for the currently authenticated player. For a specific time span, leaderboardId can be set to
    * ALL to retrieve data for all leaderboards in a given time span.
    * NOTE: You cannot ask for 'ALL' leaderboards and 'ALL' timeSpans in the same request; only one parameter may be set to 'ALL'.
    */
  def get(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsIncludeRankType): gapiDotClientLib.gapiNs.clientNs.Request[PlayerLeaderboardScoreListResponse]
  /** Lists the scores in a leaderboard, starting from the top. */
  def list(request: gapiDotClientDotGamesLib.Anon_AltCollectionConsistencyTokenFields): gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardScores]
  /** Lists the scores in a leaderboard around (and including) a player's score. */
  def listWindow(request: gapiDotClientDotGamesLib.Anon_AltCollectionConsistencyTokenFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardScores]
  /** Submits a score to the specified leaderboard. */
  def submit(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageLeaderboardId): gapiDotClientLib.gapiNs.clientNs.Request[PlayerScoreResponse]
  /** Submits multiple scores to leaderboards. */
  def submitMultiple(request: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[PlayerScoreListResponse]
}

object ScoresResource {
  @scala.inline
  def apply(
    get: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsIncludeRankType => gapiDotClientLib.gapiNs.clientNs.Request[PlayerLeaderboardScoreListResponse],
    list: gapiDotClientDotGamesLib.Anon_AltCollectionConsistencyTokenFields => gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardScores],
    listWindow: gapiDotClientDotGamesLib.Anon_AltCollectionConsistencyTokenFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[LeaderboardScores],
    submit: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKeyLanguageLeaderboardId => gapiDotClientLib.gapiNs.clientNs.Request[PlayerScoreResponse],
    submitMultiple: gapiDotClientDotGamesLib.Anon_AltConsistencyTokenFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[PlayerScoreListResponse]
  ): ScoresResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), listWindow = js.Any.fromFunction1(listWindow), submit = js.Any.fromFunction1(submit), submitMultiple = js.Any.fromFunction1(submitMultiple))
  
    __obj.asInstanceOf[ScoresResource]
  }
}

