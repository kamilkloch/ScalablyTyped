package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cssMod {
  type Length = java.lang.String | scala.Double
  type ObservableProperties[P] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof P ]: P[K] | indefinite-observable.indefinite-observable/dist/types.Observable<P[K]>}
    */ jssLib.jssLibStrings.ObservableProperties with js.Any
}
