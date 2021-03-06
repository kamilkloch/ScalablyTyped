package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  *
  * <p>A AV.User object is a local representation of a user persisted to the
  * AV cloud. This class is a subclass of a AV.Object, and retains the
  * same functionality of a AV.Object, but also extends it with various
  * user specific methods, like authentication, signing up, and validation of
  * uniqueness.</p>
  */
@JSImport("avoscloud-sdk", "User")
@js.native
class User () extends Object {
  def authenticated(): scala.Boolean = js.native
  def fetch[T](options: SuccessFailureOptions): Promise[T] = js.native
  def getEmail(): java.lang.String = js.native
  def getSessionToken(): java.lang.String = js.native
  def getUsername(): java.lang.String = js.native
  def isCurrent(): scala.Boolean = js.native
  def logIn[T](): Promise[T] = js.native
  def logIn[T](options: SuccessFailureOptions): Promise[T] = js.native
  def save[T](arg1: js.Any): Promise[T] = js.native
  def save[T](arg1: js.Any, arg2: js.Any): Promise[T] = js.native
  def save[T](arg1: js.Any, arg2: js.Any, arg3: js.Any): Promise[T] = js.native
  def setEmail(email: java.lang.String, options: SuccessFailureOptions): scala.Boolean = js.native
  def setPassword(password: java.lang.String): scala.Boolean = js.native
  def setPassword(password: java.lang.String, options: SuccessFailureOptions): scala.Boolean = js.native
  def setUsername(username: java.lang.String): scala.Boolean = js.native
  def setUsername(username: java.lang.String, options: SuccessFailureOptions): scala.Boolean = js.native
  def signUp[T](attrs: js.Any): Promise[T] = js.native
  def signUp[T](attrs: js.Any, options: SuccessFailureOptions): Promise[T] = js.native
}

/* static members */
@JSImport("avoscloud-sdk", "User")
@js.native
object User extends js.Object {
  def allowCustomUserClass(isAllowed: scala.Boolean): scala.Unit = js.native
  def become[T](sessionToken: java.lang.String): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[T] = js.native
  def become[T](
    sessionToken: java.lang.String,
    options: avoscloudDashSdkLib.avoscloudDashSdkMod.SuccessFailureOptions
  ): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[T] = js.native
  def current(): avoscloudDashSdkLib.avoscloudDashSdkMod.User = js.native
  def logIn[T](username: java.lang.String, password: java.lang.String): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[T] = js.native
  def logIn[T](
    username: java.lang.String,
    password: java.lang.String,
    options: avoscloudDashSdkLib.avoscloudDashSdkMod.SuccessFailureOptions
  ): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[T] = js.native
  def logOut[T](): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[T] = js.native
  def requestPasswordReset[T](email: java.lang.String): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[T] = js.native
  def requestPasswordReset[T](email: java.lang.String, options: avoscloudDashSdkLib.avoscloudDashSdkMod.SuccessFailureOptions): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[T] = js.native
  def signUp[T](username: java.lang.String, password: java.lang.String, attrs: js.Any): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[T] = js.native
  def signUp[T](
    username: java.lang.String,
    password: java.lang.String,
    attrs: js.Any,
    options: avoscloudDashSdkLib.avoscloudDashSdkMod.SuccessFailureOptions
  ): avoscloudDashSdkLib.avoscloudDashSdkMod.Promise[T] = js.native
}

