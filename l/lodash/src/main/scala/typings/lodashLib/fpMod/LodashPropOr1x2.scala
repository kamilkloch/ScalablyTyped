package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPropOr1x2[TObject, TKey /* <: java.lang.String */] extends js.Object {
  def apply(defaultValue: lodashLib.lodashMod.__): LodashPropOr1x6[TObject, TKey] = js.native
  def apply(defaultValue: lodashLib.lodashMod.__, `object`: TObject): LodashPropOr1x6[TObject, TKey] = js.native
  def apply[TDefault](defaultValue: TDefault): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
  def apply[TDefault](defaultValue: TDefault, `object`: TObject): (stdLib.Exclude[
    /* import warning: ImportType.apply Failed type conversion: TObject[TKey] */ js.Any, 
    js.UndefOr[scala.Nothing]
  ]) | TDefault = js.native
}

