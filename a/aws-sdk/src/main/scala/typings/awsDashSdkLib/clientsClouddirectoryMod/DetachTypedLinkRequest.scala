package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachTypedLinkRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the directory where you want to detach the typed link.
    */
  var DirectoryArn: Arn
  /**
    * Used to accept a typed link specifier as input.
    */
  var TypedLinkSpecifier: awsDashSdkLib.clientsClouddirectoryMod.TypedLinkSpecifier
}

object DetachTypedLinkRequest {
  @scala.inline
  def apply(DirectoryArn: Arn, TypedLinkSpecifier: TypedLinkSpecifier): DetachTypedLinkRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, TypedLinkSpecifier = TypedLinkSpecifier)
  
    __obj.asInstanceOf[DetachTypedLinkRequest]
  }
}

