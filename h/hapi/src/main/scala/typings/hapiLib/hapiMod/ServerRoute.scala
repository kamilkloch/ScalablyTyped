package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ServerRoute extends js.Object {
  /**
       * (required when handler is not set) the route handler function called to generate the response after successful authentication and validation.
       */
  var handler: js.UndefOr[hapiLib.hapiMod.LifecycleNs.Method | HandlerDecorations] = js.undefined
  /**
       * (required) the HTTP method. Typically one of 'GET', 'POST', 'PUT', 'PATCH', 'DELETE', or 'OPTIONS'. Any HTTP method is allowed, except for 'HEAD'. Use '*' to match against any HTTP method
       * (only when an exact match was not found, and any match with a specific method will be given a higher priority over a wildcard match). Can be assigned an array of methods which has the same
       * result as adding the same route with different methods manually.
       */
  var method: hapiLib.hapiMod.UtilNs.HTTP_METHODS_PARTIAL | js.Array[hapiLib.hapiMod.UtilNs.HTTP_METHODS_PARTIAL] | java.lang.String | js.Array[java.lang.String]
  /**
       * additional route options. The options value can be an object or a function that returns an object using the signature function(server) where server is the server the route is being added to
       * and this is bound to the current realm's bind option.
       */
  var options: js.UndefOr[RouteOptions | (js.Function1[/* server */ Server, RouteOptions])] = js.undefined
  /**
       * (required) the absolute path used to match incoming requests (must begin with '/'). Incoming requests are compared to the configured paths based on the server's router configuration. The path
       * can include named parameters enclosed in {} which will be matched against literal values in the request as described in Path parameters. For context [See
       * docs](https://github.com/hapijs/hapi/blob/master/API.md#-serverrouteroute) For context [See docs](https://github.com/hapijs/hapi/blob/master/API.md#path-parameters)
       */
  var path: java.lang.String
  /**
       * route custom rules object. The object is passed to each rules processor registered with server.rules(). Cannot be used if route.options.rules is defined.
       */
  var rules: js.UndefOr[js.Object] = js.undefined
  /**
       * (optional) a domain string or an array of domain strings for limiting the route to only requests with a matching host header field. Matching is done against the hostname part of the header
       * only (excluding the port). Defaults to all hosts.
       */
  var vhost: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}
