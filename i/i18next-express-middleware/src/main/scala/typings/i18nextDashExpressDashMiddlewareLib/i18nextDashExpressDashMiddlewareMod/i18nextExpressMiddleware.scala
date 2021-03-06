package typings
package i18nextDashExpressDashMiddlewareLib.i18nextDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait i18nextExpressMiddleware extends js.Object {
  def LanguageDetector(): expressLib.expressMod.Handler
  def missingKeyHandler(): expressLib.expressMod.Handler
}

object i18nextExpressMiddleware {
  @scala.inline
  def apply(
    LanguageDetector: () => expressLib.expressMod.Handler,
    missingKeyHandler: () => expressLib.expressMod.Handler
  ): i18nextExpressMiddleware = {
    val __obj = js.Dynamic.literal(LanguageDetector = js.Any.fromFunction0(LanguageDetector), missingKeyHandler = js.Any.fromFunction0(missingKeyHandler))
  
    __obj.asInstanceOf[i18nextExpressMiddleware]
  }
}

