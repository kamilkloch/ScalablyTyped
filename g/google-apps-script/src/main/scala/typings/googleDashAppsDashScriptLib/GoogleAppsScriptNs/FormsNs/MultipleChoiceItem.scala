package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.FormsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleChoiceItem extends js.Object {
  def createChoice(value: java.lang.String): Choice = js.native
  def createChoice(value: java.lang.String, isCorrect: scala.Boolean): Choice = js.native
  def createChoice(value: java.lang.String, navigationItem: PageBreakItem): Choice = js.native
  def createChoice(value: java.lang.String, navigationType: PageNavigationType): Choice = js.native
  def createResponse(response: java.lang.String): ItemResponse = js.native
  def duplicate(): MultipleChoiceItem = js.native
  def getChoices(): js.Array[Choice] = js.native
  def getFeedbackForCorrect(): QuizFeedback = js.native
  def getFeedbackForIncorrect(): QuizFeedback = js.native
  def getHelpText(): java.lang.String = js.native
  def getId(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getPoints(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getTitle(): java.lang.String = js.native
  def getType(): ItemType = js.native
  def hasOtherOption(): scala.Boolean = js.native
  def isRequired(): scala.Boolean = js.native
  def setChoiceValues(values: js.Array[java.lang.String]): MultipleChoiceItem = js.native
  def setChoices(choices: js.Array[Choice]): MultipleChoiceItem = js.native
  def setFeedbackForCorrect(feedback: QuizFeedback): MultipleChoiceItem = js.native
  def setFeedbackForIncorrect(feedback: QuizFeedback): MultipleChoiceItem = js.native
  def setHelpText(text: java.lang.String): MultipleChoiceItem = js.native
  def setPoints(points: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): MultipleChoiceItem = js.native
  def setRequired(enabled: scala.Boolean): MultipleChoiceItem = js.native
  def setTitle(title: java.lang.String): MultipleChoiceItem = js.native
  def showOtherOption(enabled: scala.Boolean): MultipleChoiceItem = js.native
}

