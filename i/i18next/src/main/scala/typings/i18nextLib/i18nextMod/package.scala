package typings
package i18nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object i18nextMod {
  type Callback = js.Function2[
    /* error */ js.Any, 
    /* t */ TranslationFunction[js.Any, js.Object, java.lang.String], 
    scala.Unit
  ]
  type FallbackLng = java.lang.String | js.Array[java.lang.String] | FallbackLngObjList
  type FallbackLngObjList = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type FormatFunction = js.Function3[
    /* value */ js.Any, 
    /* format */ js.UndefOr[java.lang.String], 
    /* lng */ js.UndefOr[java.lang.String], 
    java.lang.String
  ]
  type Resource = org.scalablytyped.runtime.StringDictionary[ResourceLanguage]
  type ResourceKey = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ResourceLanguage = org.scalablytyped.runtime.StringDictionary[ResourceKey]
  type TranslationFunction[TResult, TValues /* <: js.Object */, TKeys /* <: java.lang.String */] = js.Function2[
    /* key */ TKeys | js.Array[TKeys], 
    /* options */ js.UndefOr[TranslationOptions[TValues]], 
    TResult
  ]
  // Add an indexer to assure that interpolation arguments can be passed
  type TranslationOptions[TCustomOptions /* <: js.Object */] = TranslationOptionsBase with TCustomOptions with org.scalablytyped.runtime.StringDictionary[js.Any]
}
