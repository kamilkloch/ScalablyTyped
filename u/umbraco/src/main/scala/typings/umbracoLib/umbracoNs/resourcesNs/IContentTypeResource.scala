package typings
package umbracoLib.umbracoNs.resourcesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.contentTypeResource
  * @description Loads in data for content types
  **/
trait IContentTypeResource extends js.Object {
  /**
    * @ngdoc method
    * @name umbraco.resources.contentTypeResource#getAllPropertyTypeAliases
    * @methodOf umbraco.resources.contentTypeResource
    *
    * @description
    * Returns a list of defined property type aliases
    *
    * @returns {Promise} resourcePromise object.
    *
    */
  def getAllPropertyTypeAliases(): angularLib.angularMod.IPromise[IResourcePromise]
  /**
    * @ngdoc method
    * @name umbraco.resources.contentTypeResource#getAllowedTypes
    * @methodOf umbraco.resources.contentTypeResource
    *
    * @description
    * Returns a list of allowed content types underneath a content item with a given ID
    *
    * ##usage
    * <pre>
    * contentTypeResource.getAllowedTypes(1234)
    *    .then(function(array) {
    *        $scope.type = type;
    *    });
    * </pre>
    * @param {Int} contentId id of the content item to retrive allowed child types for
    * @returns {Promise} resourcePromise object.
    *
    */
  def getAllowedTypes(contentId: scala.Double): angularLib.angularMod.IPromise[IResourcePromise]
}

object IContentTypeResource {
  @scala.inline
  def apply(
    getAllPropertyTypeAliases: () => angularLib.angularMod.IPromise[IResourcePromise],
    getAllowedTypes: scala.Double => angularLib.angularMod.IPromise[IResourcePromise]
  ): IContentTypeResource = {
    val __obj = js.Dynamic.literal(getAllPropertyTypeAliases = js.Any.fromFunction0(getAllPropertyTypeAliases), getAllowedTypes = js.Any.fromFunction1(getAllowedTypes))
  
    __obj.asInstanceOf[IContentTypeResource]
  }
}

