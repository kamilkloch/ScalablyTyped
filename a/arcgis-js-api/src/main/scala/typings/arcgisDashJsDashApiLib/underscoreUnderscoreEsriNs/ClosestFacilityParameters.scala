package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClosestFacilityParameters
  extends Accessor
     with JSONSupport {
  /**
    * The list of network attribute names to be accumulated with the analysis, i.e., which attributes should be returned as part of the response.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#accumulateAttributes)
    */
  var accumulateAttributes: js.Array[java.lang.String] = js.native
  /**
    * An array of attribute parameter values that determine which network elements can be used by a vehicle. View the object specifications below for properties of the individual objects in this array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#attributeParameterValues)
    */
  var attributeParameterValues: js.Array[ClosestFacilityParametersAttributeParameterValues] = js.native
  /**
    * The cutoff value used to determine when to stop traversing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#defaultCutoff)
    */
  var defaultCutoff: scala.Double = js.native
  /**
    * The number of facilities to find.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#defaultTargetFacilityCount)
    */
  var defaultTargetFacilityCount: scala.Double = js.native
  /**
    * The language used when generating driving directions. This parameter applies only when [returnDirections](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnDirections) parameter is set to `true`. If an unsupported language code is specified, the service returns the directions using the default language, English.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsLanguage)
    */
  var directionsLanguage: java.lang.String = js.native
  /**
    * The length units used when computing driving directions. This parameter applies only when [returnDirections](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnDirections) parameter is set to `true`. If not specified the task will use the value defined by the routing network layer is used.  **Possible Values:** centimeters | decimal-degrees | decimeters | feet | inches | kilometers | meters | miles | millimeters | nautical-miles | points | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsLengthUnits)
    */
  var directionsLengthUnits: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.centimeters | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`decimal-degrees` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.decimeters | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.feet | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.inches | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.kilometers | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.meters | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.miles | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.millimeters | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`nautical-miles` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.points | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.yards = js.native
  /**
    * Defines the amount of direction information returned. The default value is standard.  **Possible Values:** complete | complete-no-events | instructions-only | standard | summary-only
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsOutputType)
    */
  var directionsOutputType: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.complete | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`complete-no-events` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`instructions-only` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.standard | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`summary-only` = js.native
  /**
    * The style to be used when returning directions. The default will be as defined in the network layer. View the REST layer description for your network service to see a list of supported styles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsStyleName)
    */
  var directionsStyleName: java.lang.String = js.native
  /**
    * The name of the attribute field that contains the drive time values. If not specified, the task will use the attribute field defined by the routing network layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#directionsTimeAttribute)
    */
  var directionsTimeAttribute: java.lang.String = js.native
  /**
    * When `true`, restricted network elements should be considered when finding network locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#doNotLocateOnRestrictedElements)
    */
  var doNotLocateOnRestrictedElements: scala.Boolean = js.native
  /**
    * The set of facilities loaded as network locations during analysis. These can be specified as either a [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html).  At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url  property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#facilities)
    */
  var facilities: DataLayer | FeatureSet = js.native
  /**
    * The network attribute name used as the impedance attribute in analysis. The default is as defined in the routing network layer used in your [RouteTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-RouteTask.html). You can specify any attribute names listed in the Service Directory under `Network Dataset > Network Attributes` as `Usage Type: esriNAUTCost`. You can also specify a value of `none` to indicate that no network attributes should be used for impedance. If you specify an empty string, it will use the default of the service.  For example, set `impedanceAttribute = 'Time'` for quickest route and `impedanceAttribute = 'Length'` for shortest drive, assuming the service has those two esriNAUTCost attributes.  View the [Understanding the network attribute](http://desktop.arcgis.com/en/arcmap/latest/extensions/network-analyst/understanding-network-attributes.htm) ArcGIS desktop help topic for more details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#impedanceAttribute)
    */
  var impedanceAttribute: java.lang.String = js.native
  /**
    * The set of incidents loaded as network locations during analysis. Can be an instance of [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#incidents)
    */
  var incidents: DataLayer | FeatureSet = js.native
  /**
    * The well-known id of the spatial reference or the spatial reference object for the geometries returned with the analysis results. If `outSpatialReference` is not specified, the geometries are returned in the spatial reference of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference | java.lang.String = js.native
  /**
    * The output geometry precision. When `0`, no generalization of the output geometry is performed. Positive values represent the `MaximumAllowableOffset` parameter used by generalize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputGeometryPrecision)
    */
  var outputGeometryPrecision: scala.Double = js.native
  /**
    * The units of the output geometry precision.  **Possible Values:** centimeters | decimal-degrees | decimeters | feet | inches | kilometers | meters | miles | millimeters | nautical-miles | points | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputGeometryPrecisionUnits)
    */
  var outputGeometryPrecisionUnits: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.centimeters | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`decimal-degrees` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.decimeters | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.feet | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.inches | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.kilometers | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.meters | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.miles | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.millimeters | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`nautical-miles` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.points | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.yards = js.native
  /**
    * The type of output lines to be generated in the result. The default is defined in the specific routing network layer used in your RouteTask.
    *
    * Possible Value | Description
    * ---------------|------------
    * none | No lines are returned
    * straight | Only returns straight lines
    * true-shape | Return the true shape of the lines
    * true-shape-with-measure | Return the true shape of the lines with their measurements
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#outputLines)
    */
  var outputLines: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.none | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.straight | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`true-shape` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`true-shape-with-measure` = js.native
  /**
    * The set of point barriers loaded as network locations during analysis. Can be an instance of [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#pointBarriers)
    */
  var pointBarriers: DataLayer | FeatureSet = js.native
  /**
    * The set of polygon barriers loaded as network locations during analysis. Can be an instance of [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#polygonBarriers)
    */
  var polygonBarriers: DataLayer | FeatureSet = js.native
  /**
    * The set of polyline barriers loaded as network locations during analysis. Can be an instance of [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html) or [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). At ArcGIS Server 10.1 an optional `url` property was added. Use this property to specify a REST query request to a Feature, Map or GP Service that returns a JSON feature set. The url property can be specified using [DataFile](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html). Either the features or url property should be specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#polylineBarriers)
    */
  var polylineBarriers: DataLayer | FeatureSet = js.native
  /**
    * Specifies how U-Turns should be handled. The default is as defined in the specific routing network layer used in your module:"esri/tasks/ClosestFacilityTask".  **Possible Values:**  allow-backtrack | at-dead-ends-only | no-backtrack | at-dead-ends-and-intersections
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#restrictUTurns)
    */
  var restrictUTurns: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`allow-backtrack` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`at-dead-ends-only` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`no-backtrack` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`at-dead-ends-and-intersections` = js.native
  /**
    * The list of network attribute names to be used as restrictions with the analysis. The default is as defined in the specific routing network layer used in your RouteTask. Possible values are listed in the Service Directory under Network Dataset > Network Attributes. You can also specify a value of none to indicate that no network attributes should be used as restrictions. If you specify an empty array, it will default to the default of the service. Use `["none"]` to override the service defaults and specify that no restrictions should be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#restrictionAttributes)
    */
  var restrictionAttributes: js.Array[java.lang.String] = js.native
  /**
    * Indicates whether the service should generate driving directions for each route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnDirections)
    *
    * @default false
    */
  var returnDirections: scala.Boolean = js.native
  /**
    * If `true`, facilities will be returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnFacilities)
    *
    * @default false
    */
  var returnFacilities: scala.Boolean = js.native
  /**
    * If `true`, incidents will be returned with the analysis results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnIncidents)
    *
    * @default false
    */
  var returnIncidents: scala.Boolean = js.native
  /**
    * If `true`, point barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPointBarriers)
    *
    * @default false
    */
  var returnPointBarriers: scala.Boolean = js.native
  /**
    * If `true`, polygon barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPolygonBarriers)
    *
    * @default false
    */
  var returnPolygonBarriers: scala.Boolean = js.native
  /**
    * If `true`, polyline barriers will be returned in the barriers property of the [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnPolylineBarriers)
    *
    * @default false
    */
  var returnPolylineBarriers: scala.Boolean = js.native
  /**
    * When `true`, closest facility routes will be generated and returned in the route property of each [ClosestFacilitySolveResult](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#returnRoutes)
    */
  var returnRoutes: scala.Boolean = js.native
  /**
    * The arrival or departure date and time. For example, if the travelDirection is set to `to-facility` and `timeOfDayUsage` is set to `end` and `timeOfDay` is set to 8:00 a.m., the returned route(s) will be setup to arrive at the facility at 8:00 a.m. local time. *Requires ArcGIS Server service version 10.1 or greater.*
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#timeOfDay)
    */
  var timeOfDay: stdLib.Date = js.native
  /**
    * Defines the way the `timeOfDay` value is used. The default value is defined in the network layer. *Requires ArcGIS Server service version 10.1 or greater.*  **Possible Values:** start | end
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#timeOfDayUsage)
    */
  var timeOfDayUsage: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.start | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.end = js.native
  /**
    * Options for traveling to or from the facility. Default values are defined by the network layer.
    *
    * Possible Value | Description
    * ---------------|------------
    * from-facility | Sets travel direction from the facility
    * to-facility | Sets travel direction to the facility
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#travelDirection)
    */
  var travelDirection: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`from-facility` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`to-facility` = js.native
  /**
    * Travel modes define how a pedestrian, car, truck or other medium of transportation moves through the street network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#travelMode)
    */
  var travelMode: java.lang.String = js.native
  /**
    * If `true`, the hierarchy attribute for the network will be used in analysis. The default is defined in the routing network layer used by the [ClosestFacilityTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html#useHierarchy)
    *
    * @default false
    */
  var useHierarchy: scala.Boolean = js.native
}

@JSGlobal("__esri.ClosestFacilityParameters")
@js.native
/**
  * Input parameters for [ClosestFacilityTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ClosestFacilityTask.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilityParameters.html)
  */
class ClosestFacilityParametersCls () extends ClosestFacilityParameters {
  def this(properties: ClosestFacilityParametersProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

