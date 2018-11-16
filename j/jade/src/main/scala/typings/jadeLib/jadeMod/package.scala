package typings
package jadeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jadeMod {
  type JadeCustomFilterFunction = js.Function2[
    /* text */ java.lang.String, 
    /* options */ ScalablyTyped.runtime.StringDictionary[scala.Boolean], 
    java.lang.String
  ]
  type JadeGenerationFunction = js.Function1[/* locals */ js.UndefOr[TemplateLocals], java.lang.String]
}