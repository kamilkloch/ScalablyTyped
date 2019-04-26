package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var attachment: js.UndefOr[
    csstypeLib.csstypeMod.BackgroundAttachmentProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BackgroundAttachmentProperty]]
  ]
  var color: js.UndefOr[
    csstypeLib.csstypeMod.BackgroundColorProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty]]
  ]
  var image: js.UndefOr[
    csstypeLib.csstypeMod.BackgroundImageProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BackgroundImageProperty]]
  ]
  var position: (js.UndefOr[
    csstypeLib.csstypeMod.BackgroundPositionProperty[jssLib.cssMod.Length] | (indefiniteDashObservableLib.distTypesMod.Observable[
      js.UndefOr[csstypeLib.csstypeMod.BackgroundPositionProperty[jssLib.cssMod.Length]]
    ])
  ]) | (js.Tuple2[
    js.UndefOr[
      csstypeLib.csstypeMod.BackgroundPositionProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
    ], 
    js.UndefOr[
      csstypeLib.csstypeMod.BackgroundPositionProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
    ]
  ])
   // Can be written using array e.g. `[0 0]`
  var repeat: js.UndefOr[
    csstypeLib.csstypeMod.BackgroundRepeatProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BackgroundRepeatProperty]]
  ]
  var size: (js.UndefOr[
    csstypeLib.csstypeMod.BackgroundSizeProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BackgroundSizeProperty[jssLib.cssMod.Length]]]
  ]) | (js.Tuple2[
    js.UndefOr[
      csstypeLib.csstypeMod.BackgroundSizeProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
    ], 
    js.UndefOr[
      csstypeLib.csstypeMod.BackgroundSizeProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
    ]
  ])
}

object Anon_0 {
  @scala.inline
  def apply(
    position: (js.UndefOr[
      csstypeLib.csstypeMod.BackgroundPositionProperty[jssLib.cssMod.Length] | (indefiniteDashObservableLib.distTypesMod.Observable[
        js.UndefOr[csstypeLib.csstypeMod.BackgroundPositionProperty[jssLib.cssMod.Length]]
      ])
    ]) | (js.Tuple2[
      js.UndefOr[
        csstypeLib.csstypeMod.BackgroundPositionProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
      ], 
      js.UndefOr[
        csstypeLib.csstypeMod.BackgroundPositionProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
      ]
    ]),
    size: (js.UndefOr[
      csstypeLib.csstypeMod.BackgroundSizeProperty[jssLib.cssMod.Length] | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BackgroundSizeProperty[jssLib.cssMod.Length]]]
    ]) | (js.Tuple2[
      js.UndefOr[
        csstypeLib.csstypeMod.BackgroundSizeProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
      ], 
      js.UndefOr[
        csstypeLib.csstypeMod.BackgroundSizeProperty[java.lang.String | jssLib.jssLibNumbers.`0`]
      ]
    ]),
    attachment: csstypeLib.csstypeMod.BackgroundAttachmentProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BackgroundAttachmentProperty]] = null,
    color: csstypeLib.csstypeMod.BackgroundColorProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BackgroundColorProperty]] = null,
    image: csstypeLib.csstypeMod.BackgroundImageProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BackgroundImageProperty]] = null,
    repeat: csstypeLib.csstypeMod.BackgroundRepeatProperty | indefiniteDashObservableLib.distTypesMod.Observable[js.UndefOr[csstypeLib.csstypeMod.BackgroundRepeatProperty]] = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (attachment != null) __obj.updateDynamic("attachment")(attachment.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0]
  }
}

