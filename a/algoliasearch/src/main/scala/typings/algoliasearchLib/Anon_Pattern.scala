package typings
package algoliasearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Pattern extends js.Object {
  /**
         * Whether the pattern must match the beginning or the end of the query string, or both, or none.
         */
  var anchoring: algoliasearchLib.algoliasearchLibStrings.is | algoliasearchLib.algoliasearchLibStrings.startsWith | algoliasearchLib.algoliasearchLibStrings.endsWith | algoliasearchLib.algoliasearchLibStrings.contains
  /**
         * Rule context (format: [A-Za-z0-9_-]+).
         * When specified, the rule is contextual and applies only when the same context is specified
         * at query time (using the ruleContexts parameter).
         * When absent, the rule is generic and always applies
         * (provided that its other conditions are met, of course).
         */
  var context: js.UndefOr[java.lang.String] = js.undefined
  /**
         * Query pattern
         * syntax: https://www.algolia.com/doc/rest-api/query-rules/?language=php#query-pattern-syntax
         */
  var pattern: java.lang.String
}
