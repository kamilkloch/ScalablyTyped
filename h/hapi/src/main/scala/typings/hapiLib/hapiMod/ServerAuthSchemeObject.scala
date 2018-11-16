package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerAuthSchemeObject extends js.Object {
  /**
       * optional object which is exposed via the [server.auth.api](https://github.com/hapijs/hapi/blob/master/API.md#server.auth.api) object.
       */
  var api: js.UndefOr[ServerAuthSchemeObjectApi] = js.undefined
  /**
       * An object with the following keys:
       * * payload
       */
  var options: js.UndefOr[hapiLib.Anon_Payload] = js.undefined
  /**
       * A lifecycle method to authenticate the request payload.
       * When the scheme payload() method returns an error with a message, it means payload validation failed due to bad
       * payload. If the error has no message but includes a scheme name (e.g. Boom.unauthorized(null, 'Custom')),
       * authentication may still be successful if the route auth.payload configuration is set to 'optional'.
       * @param request the request object.
       * @param h the ResponseToolkit
       * @return the Lifecycle.ReturnValue
       */
  var payload: js.UndefOr[
    js.Function2[
      /* request */ Request, 
      /* h */ ResponseToolkit, 
      hapiLib.hapiMod.LifecycleNs.ReturnValue
    ]
  ] = js.undefined
  /**
       * A lifecycle method to decorate the response with authentication headers before the response headers or payload is written.
       * @param request the request object.
       * @param h the ResponseToolkit
       * @return the Lifecycle.ReturnValue
       */
  var response: js.UndefOr[
    js.Function2[
      /* request */ Request, 
      /* h */ ResponseToolkit, 
      hapiLib.hapiMod.LifecycleNs.ReturnValue
    ]
  ] = js.undefined
  /**
       * A lifecycle method function called for each incoming request configured with the authentication scheme. The
       * method is provided with two special toolkit methods for returning an authenticated or an unauthenticate result:
       * * h.authenticated() - indicate request authenticated successfully.
       * * h.unauthenticated() - indicate request failed to authenticate.
       * @param request the request object.
       * @param h the ResponseToolkit
       * @return the Lifecycle.ReturnValue
       */
  def authenticate(request: Request, h: ResponseToolkit): hapiLib.hapiMod.LifecycleNs.ReturnValue
}
