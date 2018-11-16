package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateQuery[T] extends js.Object {
  @JSName("$addToSet")
  var $addToSet: js.UndefOr[stdLib.Partial[T] | ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  @JSName("$bit")
  var $bit: js.UndefOr[
    (mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | ScalablyTyped.runtime.StringDictionary[js.Any]
  ] = js.undefined
  @JSName("$currentDate")
  var $currentDate: js.UndefOr[
    (mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | (ScalablyTyped.runtime.StringDictionary[mongodbLib.mongodbLibNumbers.`true` | mongodbLib.Anon_Type])
  ] = js.undefined
  @JSName("$each")
  var $each: js.UndefOr[stdLib.Partial[T] | ScalablyTyped.runtime.StringDictionary[js.Array[_]]] = js.undefined
  @JSName("$inc")
  var $inc: js.UndefOr[
    (mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | ScalablyTyped.runtime.StringDictionary[scala.Double]
  ] = js.undefined
  @JSName("$max")
  var $max: js.UndefOr[
    (mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | ScalablyTyped.runtime.StringDictionary[scala.Double]
  ] = js.undefined
  @JSName("$min")
  var $min: js.UndefOr[
    (mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | ScalablyTyped.runtime.StringDictionary[scala.Double]
  ] = js.undefined
  @JSName("$mul")
  var $mul: js.UndefOr[
    (mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | ScalablyTyped.runtime.StringDictionary[scala.Double]
  ] = js.undefined
  @JSName("$pop")
  var $pop: js.UndefOr[
    (mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | (ScalablyTyped.runtime.StringDictionary[mongodbLib.mongodbLibNumbers.`-1` | mongodbLib.mongodbLibNumbers.`1`])
  ] = js.undefined
  @JSName("$pull")
  var $pull: js.UndefOr[
    stdLib.Partial[T] | (ScalablyTyped.runtime.StringDictionary[mongodbLib.Condition[T, java.lang.String]])
  ] = js.undefined
  @JSName("$push")
  var $push: js.UndefOr[stdLib.Partial[T] | ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  @JSName("$pushAll")
  var $pushAll: js.UndefOr[stdLib.Partial[T] | ScalablyTyped.runtime.StringDictionary[js.Array[_]]] = js.undefined
  @JSName("$rename")
  var $rename: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  @JSName("$set")
  var $set: js.UndefOr[stdLib.Partial[T] | ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  @JSName("$setOnInsert")
  var $setOnInsert: js.UndefOr[stdLib.Partial[T] | ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  @JSName("$unset")
  var $unset: js.UndefOr[
    (mongodbLib.mongodbLibStrings.UpdateQuery with js.Any) | ScalablyTyped.runtime.StringDictionary[mongodbLib.mongodbLibStrings.Empty]
  ] = js.undefined
}
