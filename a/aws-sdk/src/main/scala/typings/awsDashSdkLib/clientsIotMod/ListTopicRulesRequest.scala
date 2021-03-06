package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTopicRulesRequest extends js.Object {
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[GEMaxResults] = js.undefined
  /**
    * A token used to retrieve the next value.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
  /**
    * The topic.
    */
  var topic: js.UndefOr[Topic] = js.undefined
}

object ListTopicRulesRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[GEMaxResults] = js.undefined,
    nextToken: NextToken = null,
    ruleDisabled: js.UndefOr[IsDisabled] = js.undefined,
    topic: Topic = null
  ): ListTopicRulesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (!js.isUndefined(ruleDisabled)) __obj.updateDynamic("ruleDisabled")(ruleDisabled)
    if (topic != null) __obj.updateDynamic("topic")(topic)
    __obj.asInstanceOf[ListTopicRulesRequest]
  }
}

