package typings
package nukaDashCarouselLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nukaDashCarouselMod {
  type CSSProperties = csstypeLib.csstypeMod.Properties[java.lang.String | scala.Double]
  type Carousel = reactLib.reactMod.Component[CarouselProps, CarouselState, js.Any]
  type CarouselRenderControl = js.Function1[/* props */ CarouselSlideRenderControlProps, reactLib.reactMod.ReactNode]
  type CarouselSlideWidthProp = java.lang.String | scala.Double
  type CarouselSlidesToScrollProp = scala.Double | nukaDashCarouselLib.nukaDashCarouselLibStrings.auto
}
