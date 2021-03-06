package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The hint control's options.
  */
@js.native
trait ASPxClientHintOptions extends js.Object {
  /**
    * Gets or sets a value that specifies whether to flip the hint to the opposite position relative to the target element.
    * Value: true, to flip the hint; otherwise, false.
    */
  var allowFlip: scala.Boolean = js.native
  /**
    * Gets or sets a value that specifies whether to shift a hint if its content and title are hidden outside of the client area.
    * Value: true, to shift the hint; otherwise, false.
    */
  var allowShift: scala.Boolean = js.native
  /**
    * Gets or sets whether it should use animation effects when a hint appears.
    * Value: true if animation is enabled; otherwise false.
    */
  var animation: js.Any = js.native
  /**
    * Gets or sets the delay in displaying the hint.
    * Value: An integer value that specifies the time interval, in milliseconds, after which a hint is displayed.
    */
  var appearAfter: scala.Double = js.native
  /**
    * Gets or sets a custom CSS class name that will be assigned to the root ASPxHint element.
    * Value: A string value that is the CSS class name.
    */
  var className: java.lang.String = js.native
  /**
    * Gets or sets a value that is the HTML DOM-element.
    * Value: A string that is the DOM-element.
    */
  var container: java.lang.String = js.native
  /**
    * Gets or sets the hint's content.
    * Value: A string value that is the hint's content.
    */
  var content: java.lang.String = js.native
  /**
    * Gets or sets the attribute name.
    * Value: A string value that is the attribute name.
    */
  var contentAttribute: java.lang.String = js.native
  /**
    * Gets or sets the duration after which a hint disappears when the mouse pointer is no longer positioned over the target element.
    * Value: The length of time (in milliseconds) a hint is displayed after the mouse pointer is no longer positioned over the target element.
    */
  var disappearAfter: scala.Double = js.native
  /**
    * Gets or sets a value that is the hint's height.
    * Value: A string value that is the hint's height.
    */
  var height: java.lang.String = js.native
  /**
    * Gets the offset of a hint.
    * Value: An integer value.
    */
  var offset: scala.Double = js.native
  /**
    * A handler for the Hiding event.
    * Value: An <see cref="ASPxClientHintHidingEventHandler" /> delegate method allowing you to implement custom processing.
    */
  @JSName("onHiding")
  var onHiding_Original: ASPxClientHintHidingEventHandler = js.native
  /**
    * A handler for the Showing event.
    * Value: An <see cref="ASPxClientHintShowingEventHandler" /> delegate method allowing you to implement custom processing.
    */
  @JSName("onShowing")
  var onShowing_Original: ASPxClientHintShowingEventHandler = js.native
  /**
    * Gets or sets where a hint should be positioned.
    * Value: A string value that specifies a hint position.
    */
  var position: java.lang.String = js.native
  /**
    * Gets or sets a value that specifies whether a hint is displayed in a callout box.
    * Value: true, to display a hint in a callout box; otherwise, false.
    */
  var showCallout: scala.Boolean = js.native
  /**
    * Gets or sets a value that specifies whether a hint's title is displayed.
    * Value: true, to display the hint's title; otherwise, false.
    */
  var showTitle: scala.Boolean = js.native
  /**
    * Gets or sets a value that is the hint's title.
    * Value: A string value that is the title text.
    */
  var title: java.lang.String = js.native
  /**
    * Gets or sets the attribute name.
    * Value: A string value that is the attribute name.
    */
  var titleAttribute: java.lang.String = js.native
  /**
    * Gets or sets which user action triggers a hint.
    * Value: A string value that is a user action.
    */
  var triggerAction: java.lang.String = js.native
  /**
    * Gets or sets a value that is the hint's width.
    * Value: A string value that is the hint's width.
    */
  var width: java.lang.String = js.native
  /**
    * Gets or sets the X coordinate.
    * Value: An integer value that is the X coordinate.
    */
  var x: scala.Double = js.native
  /**
    * Gets or sets the Y coordinate.
    * Value: An integer value that is the Y coordinate.
    */
  var y: scala.Double = js.native
  /**
    * A handler for the Hiding event.
    * Value: An <see cref="ASPxClientHintHidingEventHandler" /> delegate method allowing you to implement custom processing.
    */
  def onHiding(sender: ASPxClientHintWindow, e: ASPxClientHintHidingEventArgs): scala.Unit = js.native
  /**
    * A handler for the Showing event.
    * Value: An <see cref="ASPxClientHintShowingEventHandler" /> delegate method allowing you to implement custom processing.
    */
  def onShowing(sender: ASPxClientHintWindow, e: ASPxClientHintShowingEventArgs): scala.Unit = js.native
}

