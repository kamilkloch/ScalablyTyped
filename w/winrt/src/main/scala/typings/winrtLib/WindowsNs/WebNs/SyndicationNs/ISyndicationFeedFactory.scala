package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISyndicationFeedFactory extends js.Object {
  def createSyndicationFeed(title: java.lang.String, subtitle: java.lang.String, uri: winrtLib.WindowsNs.FoundationNs.Uri): SyndicationFeed
}

object ISyndicationFeedFactory {
  @scala.inline
  def apply(
    createSyndicationFeed: (java.lang.String, java.lang.String, winrtLib.WindowsNs.FoundationNs.Uri) => SyndicationFeed
  ): ISyndicationFeedFactory = {
    val __obj = js.Dynamic.literal(createSyndicationFeed = js.Any.fromFunction3(createSyndicationFeed))
  
    __obj.asInstanceOf[ISyndicationFeedFactory]
  }
}

