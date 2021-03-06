package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bookmarks
  extends Widget
     with GoTo {
  /**
    * A collection of [Bookmark](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#bookmarks)
    */
  var bookmarks: Collection[Bookmark] = js.native
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#iconClass)
    */
  var iconClass: java.lang.String = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#view)
    */
  var view: MapView = js.native
  /**
    * The view model for this widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [BookmarksViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks-BookmarksViewModel.html) class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#viewModel)
    */
  var viewModel: BookmarksViewModel = js.native
  /**
    * Zoom to a specific bookmark.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#goTo)
    *
    * @param Bookmark The bookmark to zoom to.
    *
    */
  def goTo(Bookmark: Bookmark): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html#render)
    *
    *
    */
  def render(): js.Any = js.native
}

@JSGlobal("__esri.Bookmarks")
@js.native
/**
  * The Bookmarks widget allows end users to quickly navigate to a particular area of interest. It displays a list of [bookmarks](https://developers.arcgis.com/javascript/latest/api-reference/esri-webmap-Bookmark.html), which typically are defined inside the [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#bookmarks).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Bookmarks.html)
  */
class BookmarksCls () extends Bookmarks {
  def this(properties: BookmarksProperties) = this()
}

