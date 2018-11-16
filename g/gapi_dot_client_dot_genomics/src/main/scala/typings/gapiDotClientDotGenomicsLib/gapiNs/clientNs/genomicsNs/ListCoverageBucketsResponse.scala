package typings
package gapiDotClientDotGenomicsLib.gapiNs.clientNs.genomicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListCoverageBucketsResponse extends js.Object {
  /**
               * The length of each coverage bucket in base pairs. Note that buckets at the
               * end of a reference sequence may be shorter. This value is omitted if the
               * bucket width is infinity (the default behaviour, with no range or
               * `targetBucketWidth`).
               */
  var bucketWidth: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The coverage buckets. The list of buckets is sparse; a bucket with 0
               * overlapping reads is not returned. A bucket never crosses more than one
               * reference sequence. Each bucket has width `bucketWidth`, unless
               * its end is the end of the reference sequence.
               */
  var coverageBuckets: js.UndefOr[js.Array[CoverageBucket]] = js.undefined
  /**
               * The continuation token, which is used to page through large result sets.
               * Provide this value in a subsequent request to return the next page of
               * results. This field will be empty if there aren't any additional results.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}
