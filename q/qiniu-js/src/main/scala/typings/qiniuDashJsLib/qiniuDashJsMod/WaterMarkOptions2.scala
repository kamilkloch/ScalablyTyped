package typings
package qiniuDashJsLib.qiniuDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait WaterMarkOptions2 extends js.Object {
   // 水印文字，mode = 2 时 **必需**
  var dissolve: scala.Double
             // 水印文字字体
  var dx: scala.Double
                 // 横轴边距，单位:像素(px)
  var dy: scala.Double
                 // 纵轴边距，单位:像素(px)
  var fill: java.lang.String
           // 字体大小，单位: 缇
  var font: java.lang.String
   // 水印位置
  var fontsize: scala.Double
            // 透明度，取值范围1-100，非必需，下同
  var gravity: qiniuDashJsLib.qiniuDashJsLibStrings.NorthWest | qiniuDashJsLib.qiniuDashJsLibStrings.North | qiniuDashJsLib.qiniuDashJsLibStrings.NorthEast | qiniuDashJsLib.qiniuDashJsLibStrings.West | qiniuDashJsLib.qiniuDashJsLibStrings.Center | qiniuDashJsLib.qiniuDashJsLibStrings.East | qiniuDashJsLib.qiniuDashJsLibStrings.SouthWest | qiniuDashJsLib.qiniuDashJsLibStrings.South | qiniuDashJsLib.qiniuDashJsLibStrings.SouthEast
  var mode: qiniuDashJsLib.qiniuDashJsLibNumbers.`2`
    // 文字水印
  var text: java.lang.String
}
