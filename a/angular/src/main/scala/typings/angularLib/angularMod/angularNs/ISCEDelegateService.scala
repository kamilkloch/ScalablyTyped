package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// SCEDelegateService
// see http://docs.angularjs.org/api/ng.$sceDelegate
///////////////////////////////////////////////////////////////////////////

trait ISCEDelegateService extends js.Object {
  def getTrusted(`type`: java.lang.String, mayBeTrusted: js.Any): js.Any
  def trustAs(`type`: java.lang.String, value: js.Any): js.Any
  def valueOf(value: js.Any): js.Any
}
