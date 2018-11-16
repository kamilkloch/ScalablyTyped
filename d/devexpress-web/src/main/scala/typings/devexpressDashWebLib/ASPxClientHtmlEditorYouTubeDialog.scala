package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides client functionality for the YouTube Video dialog within the ASPxHtmlEditor.
 */

trait ASPxClientHtmlEditorYouTubeDialog extends ASPxClientHtmlEditorEditElementDialog {
  /**
       * Provides access to the client object of the "Enable privacy-enhanced mode" check box in the Html Editor's YouTube Video dialog.
       */
  def GetConfidentModeCheckBox(): ASPxClientCheckBox
  /**
       * Provides access to the client object of the "Show player controls" check box in the Html Editor's YouTube Video dialog.
       */
  def GetShowPlayerControlsCheckBox(): ASPxClientCheckBox
  /**
       * Provides access to the client object of the "Show suggested videos when the video finishes" check box in the Html Editor's YouTube Video dialog.
       */
  def GetShowSameVideosCheckBox(): ASPxClientCheckBox
  /**
       * Provides access to the client object of the "Show video title and player actions" check box in the Html Editor's YouTube Video dialog.
       */
  def GetShowVideoNameCheckBox(): ASPxClientCheckBox
}
