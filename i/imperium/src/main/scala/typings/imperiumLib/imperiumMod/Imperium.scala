package typings
package imperiumLib.imperiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "Imperium")
@js.native
class Imperium () extends js.Object {
  var context: js.Array[java.lang.String] = js.native
  var roles: Roles = js.native
  /* private */ def addRole(roleName: java.lang.String, getAcl: GetAcl): scala.Unit = js.native
  def can(actionS: Action): js.Promise[expressLib.expressMod.RequestHandler] = js.native
  // Check if current user can do action(s)
  def can(actionS: java.lang.String): js.Promise[expressLib.expressMod.RequestHandler] = js.native
  def can(actionS: js.Array[Action | java.lang.String]): js.Promise[expressLib.expressMod.RequestHandler] = js.native
  def evaluateRouteAction(
    req: expressLib.expressMod.Request,
    expr: java.lang.String,
    key: java.lang.String,
    context: Context
  ): java.lang.String = js.native
  def evaluateRouteActions(req: expressLib.expressMod.Request, action: js.Array[Action], context: Context): Actions = js.native
  def evaluateUserAction(
    action: RoleParams,
    context: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  ): org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = js.native
  def evaluateUserActions(req: expressLib.expressMod.Request, roles: js.Array[Role]): js.Promise[js.Array[Action]] = js.native
  // Check if user has role(s) act like as an OR
  def is(roleNames: java.lang.String): js.Promise[expressLib.expressMod.RequestHandler] = js.native
  def is(roleNames: js.Array[java.lang.String]): js.Promise[expressLib.expressMod.RequestHandler] = js.native
  // Add new role with specific ImperiumGetAcl
  def role(roleName: java.lang.String): Role = js.native
  def role(roleName: java.lang.String, getAcl: GetAcl): Role = js.native
}

