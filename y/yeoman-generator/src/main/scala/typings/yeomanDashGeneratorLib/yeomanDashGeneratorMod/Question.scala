package typings
package yeomanDashGeneratorLib.yeomanDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Question
  extends inquirerLib.inquirerMod.Question[inquirerLib.inquirerMod.Answers] {
  /**
    * whether to store the user's previous answer
    */
  var store: js.UndefOr[scala.Boolean] = js.undefined
}

object Question {
  @scala.inline
  def apply(
    choices: js.Array[inquirerLib.inquirerMod.ChoiceType] | (js.Function1[inquirerLib.inquirerMod.Answers, js.Array[inquirerLib.inquirerMod.ChoiceType]]) | (js.Function1[
      inquirerLib.inquirerMod.Answers, 
      js.Promise[js.Array[inquirerLib.inquirerMod.ChoiceType]]
    ]) = null,
    default: js.Any | (js.Function1[inquirerLib.inquirerMod.Answers, _]) | (js.Function1[inquirerLib.inquirerMod.Answers, js.Promise[_]]) = null,
    filter: /* input */ java.lang.String => _ = null,
    mask: java.lang.String = null,
    message: java.lang.String | (js.Function1[inquirerLib.inquirerMod.Answers, java.lang.String]) = null,
    name: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    paginated: js.UndefOr[scala.Boolean] = js.undefined,
    prefix: java.lang.String = null,
    store: js.UndefOr[scala.Boolean] = js.undefined,
    suffix: java.lang.String = null,
    transformer: /* input */ java.lang.String => java.lang.String = null,
    `type`: java.lang.String = null,
    validate: (/* input */ js.Any, /* answers */ js.UndefOr[inquirerLib.inquirerMod.Answers]) => scala.Boolean | java.lang.String | (js.Promise[scala.Boolean | java.lang.String]) = null,
    when: scala.Boolean | (js.Function1[inquirerLib.inquirerMod.Answers, scala.Boolean]) | (js.Function1[inquirerLib.inquirerMod.Answers, js.Promise[scala.Boolean]]) = null
  ): Question = {
    val __obj = js.Dynamic.literal()
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (mask != null) __obj.updateDynamic("mask")(mask)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(paginated)) __obj.updateDynamic("paginated")(paginated)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(store)) __obj.updateDynamic("store")(store)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (transformer != null) __obj.updateDynamic("transformer")(js.Any.fromFunction1(transformer))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validate != null) __obj.updateDynamic("validate")(js.Any.fromFunction2(validate))
    if (when != null) __obj.updateDynamic("when")(when.asInstanceOf[js.Any])
    __obj.asInstanceOf[Question]
  }
}

