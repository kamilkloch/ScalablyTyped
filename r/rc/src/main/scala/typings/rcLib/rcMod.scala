package typings
package rcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc", JSImport.Namespace)
@js.native
object rcMod extends js.Object {
  def apply(name: java.lang.String): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def apply(name: java.lang.String, defaults: org.scalablytyped.runtime.StringDictionary[js.Any]): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def apply(
    name: java.lang.String,
    defaults: org.scalablytyped.runtime.StringDictionary[js.Any],
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def apply(
    name: java.lang.String,
    defaults: org.scalablytyped.runtime.StringDictionary[js.Any],
    /**
    * Parsed argv object. For example, if args is `--foo bar`, then this value should be `{foo: 'bar'}`
    * If `argv` is `null` or `undefined`, then `rc`'s default parser will parse `process.argv`.
    */
  argv: org.scalablytyped.runtime.StringDictionary[js.Any],
    /**
    * Custom config file parser.
    * This function will be passed the string contents of each
    * discovered configuration file should return a parsed object dictionary.
    */
  parse: js.Function1[/* content */ java.lang.String, org.scalablytyped.runtime.StringDictionary[_]]
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

