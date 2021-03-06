package typings
package toughDashCookieDashFilestoreLib.toughDashCookieDashFilestoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tough-cookie-filestore", JSImport.Namespace)
@js.native
class ^ protected () extends FileCookieStore {
  def this(filePath: java.lang.String) = this()
  /* CompleteClass */
  override var filePath: java.lang.String = js.native
  /* CompleteClass */
  override var idx: org.scalablytyped.runtime.StringDictionary[
    org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[Cookie]]
  ] = js.native
  /* CompleteClass */
  override var synchronous: scala.Boolean = js.native
  /* CompleteClass */
  override def findCookie(
    domain: java.lang.String,
    path: java.lang.String,
    key: java.lang.String,
    cb: js.Function2[/* whatever */ scala.Null, /* cookie */ js.UndefOr[Cookie | scala.Null], scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def findCookies(
    domain: java.lang.String,
    path: java.lang.String,
    cb: js.Function2[/* whatever */ scala.Null, /* cookies */ js.Array[Cookie], scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def inspect(): java.lang.String = js.native
  /* CompleteClass */
  override def loadFromFile(filePath: java.lang.String, cb: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def putCookie(
    cookie: Cookie,
    path: java.lang.String,
    key: java.lang.String,
    cb: js.Function1[/* whatever */ scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def removeCookie(
    domain: java.lang.String,
    path: java.lang.String,
    key: java.lang.String,
    cb: js.Function1[/* whatever */ scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def removeCookies(
    domain: java.lang.String,
    path: java.lang.String,
    cb: js.Function1[/* whatever */ scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def saveToFile(filePath: java.lang.String, data: js.Any, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def updateCookie(oldCookie: Cookie, newCookie: Cookie, cb: js.Function1[/* whatever */ scala.Null, scala.Unit]): scala.Unit = js.native
}

