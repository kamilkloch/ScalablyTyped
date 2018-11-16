package typings
package x2jsLib.x2jsMod.X2JSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AttributeConverter extends js.Object {
  /**
           * Will be called for every attribute where test() returns true, replacing the original value of the attribute.
           * 
           * @param {string} name
           * @param {*} value
           * @returns {string}
           * 
           * @memberOf X2JS.AttributeConverter
           */
  def convert(name: java.lang.String, value: js.Any): java.lang.String
  /**
           * Indicates whether an attribute should be converted.
           * 
           * @param {string} name
           * @param {*} value
           * @returns {boolean}
           * 
           * @memberOf X2JS.AttributeConverter
           */
  def test(name: java.lang.String, value: js.Any): scala.Boolean
}
