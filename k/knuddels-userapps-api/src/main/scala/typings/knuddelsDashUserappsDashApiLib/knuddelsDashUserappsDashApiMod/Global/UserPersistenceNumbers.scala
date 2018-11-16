package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html
	 */
@JSGlobal("UserPersistenceNumbers")
@js.native
class UserPersistenceNumbers () extends js.Object

/**
	 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html
	 */
@JSGlobal("UserPersistenceNumbers")
@js.native
object UserPersistenceNumbers extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_addNumber
  		 */
  def addNumber(key: java.lang.String, value: scala.Double): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_addNumber
  		 */
  def addNumber(
    key: java.lang.String,
    value: scala.Double,
    parameters: knuddelsDashUserappsDashApiLib.Anon_TargetUsers
  ): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_deleteAll
  		 */
  def deleteAll(key: java.lang.String): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_each
  		 */
  def each(
    key: java.lang.String,
    callback: js.Function5[
      /* user */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.User, 
      /* value */ scala.Double, 
      /* index */ scala.Double, 
      /* totalCount */ scala.Double, 
      /* key */ java.lang.String, 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_each
  		 */
  def each(
    key: java.lang.String,
    callback: js.Function5[
      /* user */ knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.User, 
      /* value */ scala.Double, 
      /* index */ scala.Double, 
      /* totalCount */ scala.Double, 
      /* key */ java.lang.String, 
      scala.Boolean
    ],
    parameters: knuddelsDashUserappsDashApiLib.Anon_MinimumValue
  ): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getAllKeys
  		 * @since AppServer 82483
  		 */
  def getAllKeys(): js.Array[java.lang.String] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getAllKeys
  		 * @since AppServer 82483
  		 */
  def getAllKeys(filterKey: java.lang.String): js.Array[java.lang.String] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getCount
  		 */
  def getCount(key: java.lang.String): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getCount
  		 */
  def getCount(key: java.lang.String, parameters: knuddelsDashUserappsDashApiLib.Anon_MaximumValue): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getPosition
  		 */
  def getPosition(
    key: java.lang.String,
    user_or_userId: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.User
  ): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getPosition
  		 */
  def getPosition(
    key: java.lang.String,
    user_or_userId: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.User,
    parameters: knuddelsDashUserappsDashApiLib.Anon_Ascending
  ): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getPosition
  		 */
  def getPosition(key: java.lang.String, user_or_userId: scala.Double): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getPosition
  		 */
  def getPosition(
    key: java.lang.String,
    user_or_userId: scala.Double,
    parameters: knuddelsDashUserappsDashApiLib.Anon_Ascending
  ): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getRank
  		 */
  def getRank(
    key: java.lang.String,
    user_or_userId: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.User
  ): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getRank
  		 */
  def getRank(
    key: java.lang.String,
    user_or_userId: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.User,
    parameters: knuddelsDashUserappsDashApiLib.Anon_Ascending
  ): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getRank
  		 */
  def getRank(key: java.lang.String, user_or_userId: scala.Double): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getRank
  		 */
  def getRank(
    key: java.lang.String,
    user_or_userId: scala.Double,
    parameters: knuddelsDashUserappsDashApiLib.Anon_Ascending
  ): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSortedEntries
  		 */
  def getSortedEntries(key: java.lang.String): js.Array[
    knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.UserPersistenceNumberEntry
  ] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSortedEntries
  		 */
  def getSortedEntries(key: java.lang.String, parameters: knuddelsDashUserappsDashApiLib.Anon_Count): js.Array[
    knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.UserPersistenceNumberEntry
  ] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSortedEntriesAdjacent
  		 */
  def getSortedEntriesAdjacent(
    key: java.lang.String,
    user_or_userId: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.User
  ): js.Array[
    knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.UserPersistenceNumberEntry
  ] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSortedEntriesAdjacent
  		 */
  def getSortedEntriesAdjacent(
    key: java.lang.String,
    user_or_userId: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.User,
    parameters: knuddelsDashUserappsDashApiLib.Anon_CountAscending
  ): js.Array[
    knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.UserPersistenceNumberEntry
  ] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSortedEntriesAdjacent
  		 */
  def getSortedEntriesAdjacent(key: java.lang.String, user_or_userId: scala.Double): js.Array[
    knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.UserPersistenceNumberEntry
  ] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSortedEntriesAdjacent
  		 */
  def getSortedEntriesAdjacent(
    key: java.lang.String,
    user_or_userId: scala.Double,
    parameters: knuddelsDashUserappsDashApiLib.Anon_CountAscending
  ): js.Array[
    knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.UserPersistenceNumberEntry
  ] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_getSum
  		 */
  def getSum(key: java.lang.String): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_updateKey
  		 */
  def updateKey(oldKeyName: java.lang.String, newKeyName: java.lang.String): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/UserPersistenceNumbers.html#method_updateValue
  		 */
  def updateValue(key: java.lang.String, oldValue: scala.Double, newValue: scala.Double): scala.Double = js.native
}
