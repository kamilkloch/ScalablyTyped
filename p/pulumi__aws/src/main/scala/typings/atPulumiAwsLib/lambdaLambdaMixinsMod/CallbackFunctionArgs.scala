package typings
package atPulumiAwsLib.lambdaLambdaMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in @pulumi/aws.@pulumi/aws/utils.Diff<keyof @pulumi/aws.@pulumi/aws/lambda/function.FunctionArgs, keyof @pulumi/aws.Anon_Code> ]: @pulumi/aws.@pulumi/aws/lambda/function.FunctionArgs[P]} */ trait CallbackFunctionArgs[E, R]
  extends atPulumiAwsLib.Anon_Code {
  /**
    * The Javascript callback to use as the entrypoint for the AWS Lambda out of.  Either
    * [callback] or [callbackFactory] must be provided.
    */
  var callback: js.UndefOr[Callback[E, R]] = js.undefined
  /**
    * The Javascript function instance that will be called to produce the callback function that is
    * the entrypoint for the AWS Lambda. Either [callback] or [callbackFactory] must be
    * provided.
    *
    * This form is useful when there is expensive initialization work that should only be executed
    * once.  The factory-function will be invoked once when the final AWS Lambda module is loaded.
    * It can run whatever code it needs, and will end by returning the actual function that Lambda
    * will call into each time the Lambda is invoked.
    */
  var callbackFactory: js.UndefOr[CallbackFactory[E, R]] = js.undefined
}

object CallbackFunctionArgs {
  @scala.inline
  def apply[E, R](
    callback: Callback[E, R] = null,
    callbackFactory: CallbackFactory[E, R] = null,
    code: js.UndefOr[scala.Nothing] = js.undefined,
    codePathOptions: atPulumiPulumiLib.runtimeClosureCodePathsMod.CodePathOptions = null,
    handler: js.UndefOr[scala.Nothing] = js.undefined,
    policies: js.Array[atPulumiAwsLib.arnMod.ARN] = null,
    role: atPulumiAwsLib.iamMod.Role = null,
    runtime: atPulumiAwsLib.lambdaRuntimesMod.Runtime = null
  ): CallbackFunctionArgs[E, R] = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (callbackFactory != null) __obj.updateDynamic("callbackFactory")(callbackFactory)
    if (!js.isUndefined(code)) __obj.updateDynamic("code")(code)
    if (codePathOptions != null) __obj.updateDynamic("codePathOptions")(codePathOptions)
    if (!js.isUndefined(handler)) __obj.updateDynamic("handler")(handler)
    if (policies != null) __obj.updateDynamic("policies")(policies)
    if (role != null) __obj.updateDynamic("role")(role)
    if (runtime != null) __obj.updateDynamic("runtime")(runtime)
    __obj.asInstanceOf[CallbackFunctionArgs[E, R]]
  }
}

