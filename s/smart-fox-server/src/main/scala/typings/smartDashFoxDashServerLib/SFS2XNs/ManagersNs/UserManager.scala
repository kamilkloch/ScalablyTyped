package typings
package smartDashFoxDashServerLib.SFS2XNs.ManagersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Managers.UserManager")
@js.native
class UserManager protected () extends js.Object {
  /**
    * Creates a new UserManager instance.
    * @param {SmartFox} sfs An instance of the SmartFoxServer 2X client API main SmartFox class.
    */
  def this(sfs: smartDashFoxDashServerLib.SFS2XNs.SmartFox) = this()
  /**
    * Indicates whether a user exists in the local users list or not.
    * @param  {Entities.SFSUser} user The SFSUser object representing the user whose presence in the users list is to be tested.
    * @return {boolean}               Returns: true if the passed user exists in the users list.
    */
  def containsUser(user: smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser): scala.Boolean = js.native
  /**
    * Indicates whether a user exists in the local users list or not from the id.
    * @param  {number}  userId The id of the user whose presence in the users list is to be tested.
    * @return {boolean}        Returns: true if the passed user exists in the users list.
    */
  def containsUserId(userId: scala.Double): scala.Boolean = js.native
  /**
    * Indicates whether a user exists in the local users list or not from the name.
    * @param  {string}  userName The name of the user whose presence in the users list is to be tested.
    * @return {boolean}          Returns: true if the passed user exists in the users list.
    */
  def containsUserName(userName: java.lang.String): scala.Boolean = js.native
  /**
    * Retrieves a SFSUser object from its id property.
    * @param  {number}           userId The id of the user to be found.
    * @return {Entities.SFSUser}        Returns: The SFSUser object representing the user, or null if no user with the passed id exists in the local users list.
    */
  def getUserById(userId: scala.Double): smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser = js.native
  /**
    * Retrieves a SFSUser object from its name property.
    * @param  {string}           userName The name of the user to be found.
    * @return {Entities.SFSUser}          Returns: The SFSUser object representing the user, or null if no user with the passed name exists in the local users list.
    */
  def getUserByName(userName: java.lang.String): smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser = js.native
  /**
    * Returns the total number of users in the local users list.
    * @return {number} Returns: The number of users in the local users list.
    */
  def getUserCount(): scala.Double = js.native
  /**
    * Get the whole list of users inside the Rooms joined by the client.
    * @return {Entities.SFSUser[]} Returns: The list of SFSUser objects representing the users in the local users list.
    */
  def getUserList(): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSUser] = js.native
}

