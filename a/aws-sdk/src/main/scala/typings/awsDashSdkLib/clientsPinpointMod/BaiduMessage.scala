package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaiduMessage extends js.Object {
  /**
    * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
    */
  var Action: js.UndefOr[Action] = js.undefined
  /**
    * The message body of the notification.
    */
  var Body: js.UndefOr[__string] = js.undefined
  /**
    * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
    */
  var Data: js.UndefOr[MapOf__string] = js.undefined
  /**
    * The icon image name of the asset saved in your application.
    */
  var IconReference: js.UndefOr[__string] = js.undefined
  /**
    * The URL that points to an image used as the large icon to the notification content view.
    */
  var ImageIconUrl: js.UndefOr[__string] = js.undefined
  /**
    * The URL that points to an image used in the push notification.
    */
  var ImageUrl: js.UndefOr[__string] = js.undefined
  /**
    * The Raw JSON formatted string to be used as the payload. This value overrides the message.
    */
  var RawContent: js.UndefOr[__string] = js.undefined
  /**
    * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration and Phone Home use cases.
    */
  var SilentPush: js.UndefOr[__boolean] = js.undefined
  /**
    * The URL that points to an image used as the small icon for the notification which will be used to represent the notification in the status bar and content view
    */
  var SmallImageIconUrl: js.UndefOr[__string] = js.undefined
  /**
    * Indicates a sound to play when the device receives the notification. Supports default, or the filename of a sound resource bundled in the app. Android sound files must reside in /res/raw/
    */
  var Sound: js.UndefOr[__string] = js.undefined
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[MapOfListOf__string] = js.undefined
  /**
    * This parameter specifies how long (in seconds) the message should be kept in Baidu storage if the device is offline. The and the default value and the maximum time to live supported is 7 days (604800 seconds)
    */
  var TimeToLive: js.UndefOr[__integer] = js.undefined
  /**
    * The message title that displays above the message on the user's device.
    */
  var Title: js.UndefOr[__string] = js.undefined
  /**
    * The URL to open in the user's mobile browser. Used if the value for Action is URL.
    */
  var Url: js.UndefOr[__string] = js.undefined
}

object BaiduMessage {
  @scala.inline
  def apply(
    Action: Action = null,
    Body: __string = null,
    Data: MapOf__string = null,
    IconReference: __string = null,
    ImageIconUrl: __string = null,
    ImageUrl: __string = null,
    RawContent: __string = null,
    SilentPush: js.UndefOr[__boolean] = js.undefined,
    SmallImageIconUrl: __string = null,
    Sound: __string = null,
    Substitutions: MapOfListOf__string = null,
    TimeToLive: js.UndefOr[__integer] = js.undefined,
    Title: __string = null,
    Url: __string = null
  ): BaiduMessage = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (IconReference != null) __obj.updateDynamic("IconReference")(IconReference)
    if (ImageIconUrl != null) __obj.updateDynamic("ImageIconUrl")(ImageIconUrl)
    if (ImageUrl != null) __obj.updateDynamic("ImageUrl")(ImageUrl)
    if (RawContent != null) __obj.updateDynamic("RawContent")(RawContent)
    if (!js.isUndefined(SilentPush)) __obj.updateDynamic("SilentPush")(SilentPush)
    if (SmallImageIconUrl != null) __obj.updateDynamic("SmallImageIconUrl")(SmallImageIconUrl)
    if (Sound != null) __obj.updateDynamic("Sound")(Sound)
    if (Substitutions != null) __obj.updateDynamic("Substitutions")(Substitutions)
    if (!js.isUndefined(TimeToLive)) __obj.updateDynamic("TimeToLive")(TimeToLive)
    if (Title != null) __obj.updateDynamic("Title")(Title)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[BaiduMessage]
  }
}

