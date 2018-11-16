package typings
package getDashValueLib.getDashValueMod.getNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * The default value to return when get-value cannot result a value from the given object.
           *
           * default: `undefined`
           */
  var default: js.UndefOr[js.Any] = js.undefined
  /**
           * If defined, this function is called on each resolved value.
           * Useful if you want to do `.hasOwnProperty` or `Object.prototype.propertyIsEnumerable`.
           */
  var isValid: js.UndefOr[
    js.Function2[
      /* key */ java.lang.String, 
      /* object */ stdLib.Record[java.lang.String, _], 
      scala.Boolean
    ]
  ] = js.undefined
  /**
           * Customize how the object path is created when iterating over path segments.
           *
           * default: `Array.join`
           */
  var join: js.UndefOr[js.Function1[/* segs */ js.Array[java.lang.String], java.lang.String]] = js.undefined
  /**
           * The character to use when re-joining the string to check for keys
           * with dots in them (this is probably not needed when `options.join` is used).
           * This can be a different value than the separator, since the separator can be a string or regex.
           *
           * default: `"."`
           */
  var joinChar: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The separator to use for spliting the string.
           * (this is probably not needed when `options.split` is used).
           *
           *  default: `"."`
           */
  var separator: js.UndefOr[java.lang.String | stdLib.RegExp] = js.undefined
  /**
           * Custom function to use for splitting the string into object path segments.
           *
           * default: `String.split`
           */
  var split: js.UndefOr[js.Function1[/* s */ java.lang.String, js.Array[java.lang.String]]] = js.undefined
}
