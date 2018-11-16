package typings
package inquirerLib.inquirerMod.inquirerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inquirer extends js.Object {
  var Separator: inquirerLib.inquirerMod.inquirerNs.objectsNs.SeparatorStatic = js.native
  var prompts: Prompts = js.native
  var ui: inquirerLib.Anon_BottomBar = js.native
  /**
           * Create a new self-contained prompt module.
           * @param opt Object specifying input and output streams for the prompt
           */
  def createPromptModule(): PromptModule = js.native
  /**
           * Create a new self-contained prompt module.
           * @param opt Object specifying input and output streams for the prompt
           */
  def createPromptModule(opt: StreamOptions): PromptModule = js.native
  def prompt[T](questions: Questions[T]): stdLib.Promise[T] = js.native
  /**
           * Public CLI helper interface
           * @param questions Questions settings array
           * @param cb Callback being passed the user answers
           * @return
           */
  def prompt[T](questions: Questions[T], cb: js.Function1[/* answers */ T, _]): inquirerLib.inquirerMod.inquirerNs.uiNs.Prompt = js.native
  /**
           * Expose helper functions on the top level for easiest usage by common users
           * @param name
           * @param prompt
           */
  def registerPrompt(name: java.lang.String, prompt: PromptModule): scala.Unit = js.native
  def restoreDefaultPrompts(): scala.Unit = js.native
}
