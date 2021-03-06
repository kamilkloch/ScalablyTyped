package typings
package gapiDotClientDotGamesmanagementLib.gapiNs.clientNs.gamesmanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuestsResource extends js.Object {
  /**
    * Resets all player progress on the quest with the given ID for the currently authenticated player. This method is only accessible to whitelisted tester
    * accounts for your application.
    */
  def reset(request: gapiDotClientDotGamesmanagementLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
    * Resets all player progress on all quests for the currently authenticated player. This method is only accessible to whitelisted tester accounts for your
    * application.
    */
  def resetAll(request: gapiDotClientDotGamesmanagementLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Resets all draft quests for all players. This method is only available to user accounts for your developer console. */
  def resetAllForAllPlayers(request: gapiDotClientDotGamesmanagementLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
    * Resets all player progress on the quest with the given ID for all players. This method is only available to user accounts for your developer console.
    * Only draft quests can be reset.
    */
  def resetForAllPlayers(request: gapiDotClientDotGamesmanagementLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /**
    * Resets quests with the given IDs for all players. This method is only available to user accounts for your developer console. Only draft quests may be
    * reset.
    */
  def resetMultipleForAllPlayers(request: gapiDotClientDotGamesmanagementLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object QuestsResource {
  @scala.inline
  def apply(
    reset: gapiDotClientDotGamesmanagementLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    resetAll: gapiDotClientDotGamesmanagementLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    resetAllForAllPlayers: gapiDotClientDotGamesmanagementLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    resetForAllPlayers: gapiDotClientDotGamesmanagementLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    resetMultipleForAllPlayers: gapiDotClientDotGamesmanagementLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  ): QuestsResource = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction1(reset), resetAll = js.Any.fromFunction1(resetAll), resetAllForAllPlayers = js.Any.fromFunction1(resetAllForAllPlayers), resetForAllPlayers = js.Any.fromFunction1(resetForAllPlayers), resetMultipleForAllPlayers = js.Any.fromFunction1(resetMultipleForAllPlayers))
  
    __obj.asInstanceOf[QuestsResource]
  }
}

