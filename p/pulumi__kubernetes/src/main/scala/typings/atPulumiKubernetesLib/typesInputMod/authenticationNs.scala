package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "authentication")
@js.native
object authenticationNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
             * TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may
             * be cached by the webhook token authenticator plugin in the kube-apiserver.
             */
    
    trait TokenReview extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec holds information about the request being evaluated
                   */
      var spec: atPulumiPulumiLib.resourceMod.Input[TokenReviewSpec]
      /**
                   * Status is filled in by the server and indicates whether the request can be authenticated.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[TokenReviewStatus]] = js.undefined
    }
    
    /**
             * TokenReviewSpec is a description of the token authentication request.
             */
    
    trait TokenReviewSpec extends js.Object {
      /**
                   * Token is the opaque bearer token.
                   */
      var token: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * TokenReviewStatus is the result of the token authentication request.
             */
    
    trait TokenReviewStatus extends js.Object {
      /**
                   * Authenticated indicates that the token was associated with a known user.
                   */
      var authenticated: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Error indicates that the token couldn't be checked
                   */
      var error: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * User is the UserInfo associated with the provided token.
                   */
      var user: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[UserInfo]] = js.undefined
    }
    
    /**
             * UserInfo holds the information about the user needed to implement the user.Info interface.
             */
    
    trait UserInfo extends js.Object {
      /**
                   * Any additional information provided by the authenticator.
                   */
      var extra: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * The names of groups this user is a part of.
                   */
      var groups: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * A unique value that identifies this user across time. If this user is deleted and another
                   * user by the same name is added, they will have different UIDs.
                   */
      var uid: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The name that uniquely identifies this user among all active users.
                   */
      var username: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isTokenReview(o: js.Any): /* is TokenReview */scala.Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
             * TokenReview attempts to authenticate a token to a known user. Note: TokenReview requests may
             * be cached by the webhook token authenticator plugin in the kube-apiserver.
             */
    
    trait TokenReview extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec holds information about the request being evaluated
                   */
      var spec: atPulumiPulumiLib.resourceMod.Input[TokenReviewSpec]
      /**
                   * Status is filled in by the server and indicates whether the request can be authenticated.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[TokenReviewStatus]] = js.undefined
    }
    
    /**
             * TokenReviewSpec is a description of the token authentication request.
             */
    
    trait TokenReviewSpec extends js.Object {
      /**
                   * Token is the opaque bearer token.
                   */
      var token: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
             * TokenReviewStatus is the result of the token authentication request.
             */
    
    trait TokenReviewStatus extends js.Object {
      /**
                   * Authenticated indicates that the token was associated with a known user.
                   */
      var authenticated: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      /**
                   * Error indicates that the token couldn't be checked
                   */
      var error: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * User is the UserInfo associated with the provided token.
                   */
      var user: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[UserInfo]] = js.undefined
    }
    
    /**
             * UserInfo holds the information about the user needed to implement the user.Info interface.
             */
    
    trait UserInfo extends js.Object {
      /**
                   * Any additional information provided by the authenticator.
                   */
      var extra: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      /**
                   * The names of groups this user is a part of.
                   */
      var groups: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      /**
                   * A unique value that identifies this user across time. If this user is deleted and another
                   * user by the same name is added, they will have different UIDs.
                   */
      var uid: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * The name that uniquely identifies this user among all active users.
                   */
      var username: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isTokenReview(o: js.Any): /* is TokenReview */scala.Boolean = js.native
  }
  
}
