package typings
package fetchDashMockLib.fetchDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fetchMockNs {
  type MockCall = js.Tuple2[java.lang.String, MockRequest]
  /**
       * Mock matcher. Can be one of following:
       * string: Either
       *   * an exact url to match e.g. 'http://www.site.com/page.html'
       *   * if the string begins with a `^`, the string following the `^` must
       *     begin the url e.g. '^http://www.site.com' would match
       *      'http://www.site.com' or 'http://www.site.com/page.html'
       *    * '*' to match any url
       * RegExp: A regular expression to test the url against
       * Function(url, opts): A function (returning a Boolean) that is passed the
       *  url and opts fetch() is called with (or, if fetch() was called with one,
       *  the Request instance)
       */
  type MockMatcher = java.lang.String | stdLib.RegExp | MockMatcherFunction
  /**
       * Mock matcher function
       */
  type MockMatcherFunction = js.Function2[/* url */ java.lang.String, /* opts */ MockRequest, scala.Boolean]
  type MockRequest = stdLib.Request | stdLib.RequestInit
  /**
       * Response: A Response instance - will be used unaltered
       * number: Creates a response with this status
       * string: Creates a 200 response with the string as the response body
       * object: As long as the object is not a MockResponseObject it is
       *  converted into a json string and returned as the body of a 200 response
       * If MockResponseObject was given then it's used to configure response
       * Function(url, opts): A function that is passed the url and opts fetch()
       *  is called with and that returns any of the responses listed above
       */
  type MockResponse = stdLib.Response | stdLib.Promise[stdLib.Response] | scala.Double | stdLib.Promise[scala.Double] | java.lang.String | stdLib.Promise[java.lang.String] | js.Object | stdLib.Promise[js.Object] | MockResponseObject | stdLib.Promise[MockResponseObject]
  /**
       * Mock response function
       */
  type MockResponseFunction = js.Function2[/* url */ java.lang.String, /* opts */ MockRequest, MockResponse]
}