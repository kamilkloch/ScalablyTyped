package typings
package gapiDotClientDotToolresultsLib.gapiNs.clientNs.toolresultsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListPerfSamplesResponse extends js.Object {
  /**
               * Optional, returned if result size exceeds the page size specified in the request (or the default page size, 500, if unspecified). It indicates the last
               * sample timestamp to be used as page_token in subsequent request
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var perfSamples: js.UndefOr[js.Array[PerfSample]] = js.undefined
}
