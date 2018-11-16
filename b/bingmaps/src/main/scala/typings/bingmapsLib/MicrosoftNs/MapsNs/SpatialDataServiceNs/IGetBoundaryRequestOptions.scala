package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IGetBoundaryRequestOptions extends js.Object {
  /**
          * Specifies the preferred language to use for any metadata text about the entity or polygons. Defaults to the culture used by the map control, which
          * usually automatically detected based on user's browser settings. Setting this property will override the default value.
          */
  var culture: js.UndefOr[java.lang.String] = js.undefined
  /**
          * The entity type to return. Default: CountryRegion
          * Supported entity types:
          * AdminDivision1, AdminDivision2, CountryRegion, eighborhood, PopulatedPlace, Postcode1, Postcode2, Postcode3, Postcode4
          * Note: Not all entity types are available in all areas.
          */
  var entityType: js.UndefOr[java.lang.String] = js.undefined
  /**
          * Specifies whether the response should include all of the boundary polygons for the requested entity or just return a single polygon that represents
          * the main outline of the entity. Default: false
          */
  var getAllPolygons: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * Specifies whether the response should include metadata about the entity, such as AreaSqKm and others. Default: false
          */
  var getEntityMetadata: js.UndefOr[scala.Boolean] = js.undefined
  /**
          * The level of detail for the boundary polygons returned. An integer between 0 and 3, where 0 specifies the coarsest level of boundary detail and 3
          * specifies the best. Default: 0
          */
  var lod: js.UndefOr[scala.Double] = js.undefined
  /**
          * Specifies the user’s home country or region.Defaults to the region setting of the user who loads the map.
          * Warning: Setting this property will override the default value, which is the region the user is actually in, and will allow the user to see boundaries
          * which may not align with the views of their region.This could result in geopolitically sensitive borders being returned.
          */
  var userRegion: js.UndefOr[java.lang.String] = js.undefined
}
