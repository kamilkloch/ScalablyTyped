package typings
package rsvpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rsvpLibStrings {
  @js.native
  sealed trait Promise extends js.Object
  
  @js.native
  sealed trait chained extends js.Object
  
  @js.native
  sealed trait created extends js.Object
  
  @js.native
  sealed trait denodeify extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait fulfilled extends js.Object
  
  @js.native
  sealed trait hash extends js.Object
  
  @js.native
  sealed trait hashSettled extends js.Object
  
  @js.native
  sealed trait rejected extends js.Object
  
  def Promise: Promise = "Promise".asInstanceOf[Promise]
  def chained: chained = "chained".asInstanceOf[chained]
  def created: created = "created".asInstanceOf[created]
  def denodeify: denodeify = "denodeify".asInstanceOf[denodeify]
  def error: error = "error".asInstanceOf[error]
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  def hash: hash = "hash".asInstanceOf[hash]
  def hashSettled: hashSettled = "hashSettled".asInstanceOf[hashSettled]
  def rejected: rejected = "rejected".asInstanceOf[rejected]
}
