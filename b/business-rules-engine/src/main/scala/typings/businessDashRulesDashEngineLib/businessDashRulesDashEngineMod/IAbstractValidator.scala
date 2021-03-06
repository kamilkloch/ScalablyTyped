package typings
package businessDashRulesDashEngineLib.businessDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbstractValidator[T] extends js.Object {
  var ForList: scala.Boolean
  def CreateAbstractListRule(name: java.lang.String): IAbstractValidationRule[_]
  def CreateAbstractRule(name: java.lang.String): IAbstractValidationRule[_]
  def CreateRule(name: java.lang.String): IAbstractValidationRule[_]
  def RuleFor(prop: java.lang.String, validator: IPropertyValidator): js.Any
  def Validation(validatorFce: IValidatorFce): js.Any
  def ValidationFor(prop: java.lang.String, validatorFce: IValidatorFce): js.Any
  def ValidatorFor[K](prop: java.lang.String, validator: IAbstractValidator[K]): js.Any
}

object IAbstractValidator {
  @scala.inline
  def apply[T](
    CreateAbstractListRule: java.lang.String => IAbstractValidationRule[_],
    CreateAbstractRule: java.lang.String => IAbstractValidationRule[_],
    CreateRule: java.lang.String => IAbstractValidationRule[_],
    ForList: scala.Boolean,
    RuleFor: (java.lang.String, IPropertyValidator) => js.Any,
    Validation: IValidatorFce => js.Any,
    ValidationFor: (java.lang.String, IValidatorFce) => js.Any,
    ValidatorFor: (java.lang.String, IAbstractValidator[js.Any]) => js.Any
  ): IAbstractValidator[T] = {
    val __obj = js.Dynamic.literal(CreateAbstractListRule = js.Any.fromFunction1(CreateAbstractListRule), CreateAbstractRule = js.Any.fromFunction1(CreateAbstractRule), CreateRule = js.Any.fromFunction1(CreateRule), ForList = ForList, RuleFor = js.Any.fromFunction2(RuleFor), Validation = js.Any.fromFunction1(Validation), ValidationFor = js.Any.fromFunction2(ValidationFor), ValidatorFor = js.Any.fromFunction2(ValidatorFor))
  
    __obj.asInstanceOf[IAbstractValidator[T]]
  }
}

