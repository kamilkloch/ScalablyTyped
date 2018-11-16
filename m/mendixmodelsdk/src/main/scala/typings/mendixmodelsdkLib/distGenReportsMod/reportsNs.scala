package typings
package mendixmodelsdkLib.distGenReportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/gen/reports", "reports")
@js.native
object reportsNs extends js.Object {
  @js.native
  class AggregateFunctionEnum ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class AspectRatio ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/report-grid relevant section in reference guide}
       */
  @js.native
  class BasicReport protected () extends ReportWidget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val aggregates: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[BasicReportAggregate] = js.native
    val columns: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[BasicReportColumn] = js.native
    var isPagingEnabled: scala.Boolean = js.native
    var pageSize: scala.Double = js.native
    var showExportButton: scala.Boolean = js.native
    var zoomInfo: ReportZoomInfo = js.native
  }
  
  @js.native
  class BasicReportAggregate protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var aggregateFunction: AggregateFunctionEnum = js.native
    val applicablePerColumn: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[scala.Boolean] = js.native
    var caption: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    val containerAsBasicReport: BasicReport = js.native
    @JSName("model")
    var model_BasicReportAggregate: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  @js.native
  class BasicReportColumn protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var alignment: mendixmodelsdkLib.distGenPagesMod.pagesNs.AlignmentEnum = js.native
    var caption: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    val containerAsBasicReport: BasicReport = js.native
    var dataSetColumnName: java.lang.String = js.native
    var format: ColumnFormat = js.native
    @JSName("model")
    var model_BasicReportColumn: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var width: scala.Double = js.native
  }
  
  @js.native
  class ChartType ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class ColumnFormat ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  @js.native
  class DateRangeFieldEnum ()
    extends mendixmodelsdkLib.distSdkInternalMod.AbstractEnum
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/report-button relevant section in reference guide}
       */
  @js.native
  class ReportButton protected ()
    extends mendixmodelsdkLib.distGenPagesMod.pagesNs.Widget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caption: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/report-chart relevant section in reference guide}
       */
  @js.native
  class ReportChart protected () extends ReportWidget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var aspectRatio: AspectRatio = js.native
    val seriess: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ReportChartSeries] = js.native
    var `type`: ChartType = js.native
    var xAxisCaption: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    var xAxisColumn: java.lang.String = js.native
    var xAxisFormat: ColumnFormat = js.native
    var yAxisCaption: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    var yAxisMaximum: scala.Double = js.native
    var yAxisMinimum: scala.Double = js.native
    var yAxisPrecision: scala.Double = js.native
    var yAxisUseMinMax: scala.Boolean = js.native
  }
  
  @js.native
  class ReportChartSeries protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caption: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    val containerAsReportChart: ReportChart = js.native
    var dataSetColumn: java.lang.String = js.native
    @JSName("model")
    var model_ReportChartSeries: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/date-range-field relevant section in reference guide}
       */
  @js.native
  class ReportDateRangeField protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var caption: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    val containerAsReportDateRangeSelector: ReportDateRangeSelector = js.native
    @JSName("model")
    var model_ReportDateRangeField: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var `type`: DateRangeFieldEnum = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/report-date-parameter relevant section in reference guide}
       */
  @js.native
  class ReportDateRangeSelector protected () extends ReportParameter {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val fields: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ReportDateRangeField] = js.native
    var fieldsPerRow: scala.Double = js.native
    var fromCaption: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
    var maxYear: scala.Double = js.native
    var minYear: scala.Double = js.native
    var showFromToRange: scala.Boolean = js.native
    var toCaption: mendixmodelsdkLib.distGenTextsMod.textsNs.Text = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/report-parameter relevant section in reference guide}
       */
  @js.native
  class ReportDropDown protected () extends ReportParameter {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var attribute: mendixmodelsdkLib.distGenDomainmodelsMod.domainmodelsNs.IAttribute | scala.Null = js.native
    val attributeQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/report-pane relevant section in reference guide}
       *
       * In version 6.10.0: deleted
       */
  @js.native
  class ReportPane protected ()
    extends mendixmodelsdkLib.distGenPagesMod.pagesNs.Widget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var generateOnLoad: scala.Boolean = js.native
    var parameterWidget: mendixmodelsdkLib.distGenPagesMod.pagesNs.Widget | scala.Null = js.native
    var reportWidget: mendixmodelsdkLib.distGenPagesMod.pagesNs.Widget | scala.Null = js.native
  }
  
  @js.native
  abstract class ReportParameter protected ()
    extends mendixmodelsdkLib.distGenPagesMod.pagesNs.Widget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    /**
             * In version 6.10.0: introduced
             */
    var parameter: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.IDataSetParameter | scala.Null = js.native
    /**
             * In version 6.10.0: deleted
             */
    var parameterName: java.lang.String = js.native
    val parameterQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  /**
       * Interfaces and instance classes for types from the Mendix sub meta model `Reports`.
       */
  /**
       * See: {@link https://docs.mendix.com/refguide7/report-widgets relevant section in reference guide}
       */
  @js.native
  abstract class ReportWidget protected ()
    extends mendixmodelsdkLib.distGenPagesMod.pagesNs.Widget {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    var dataSet: mendixmodelsdkLib.distGenDatasetsMod.datasetsNs.IDataSet | scala.Null = js.native
    val dataSetQualifiedName: java.lang.String | scala.Null = js.native
    /**
             * In version 6.10.0: introduced
             */
    var generateOnLoad: scala.Boolean = js.native
  }
  
  @js.native
  class ReportZoomInfo protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsBasicReport: BasicReport = js.native
    val mappings: mendixmodelsdkLib.distSdkInternalInstancesMod.IList[ReportZoomMapping] = js.native
    @JSName("model")
    var model_ReportZoomInfo: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var targetPage: mendixmodelsdkLib.distGenPagesMod.pagesNs.IPage | scala.Null = js.native
    val targetPageQualifiedName: java.lang.String | scala.Null = js.native
  }
  
  @js.native
  class ReportZoomMapping protected ()
    extends mendixmodelsdkLib.distSdkInternalMod.Element {
    def this(model: mendixmodelsdkLib.distSdkInternalMod.AbstractModel, structureTypeName: java.lang.String, id: java.lang.String, isPartial: scala.Boolean, unit: mendixmodelsdkLib.distSdkInternalMod.ModelUnit, container: mendixmodelsdkLib.distSdkInternalMod.AbstractElement) = this()
    val containerAsReportZoomInfo: ReportZoomInfo = js.native
    @JSName("model")
    var model_ReportZoomMapping: mendixmodelsdkLib.distGenBaseDashModelMod.IModel = js.native
    var sourceReportColumnName: java.lang.String = js.native
    var targetParameterName: java.lang.String = js.native
  }
  
  @js.native
  object AggregateFunctionEnum extends js.Object {
    var Average: mendixmodelsdkLib.distGenReportsMod.reportsNs.AggregateFunctionEnum = js.native
    var Count: mendixmodelsdkLib.distGenReportsMod.reportsNs.AggregateFunctionEnum = js.native
    var Maximum: mendixmodelsdkLib.distGenReportsMod.reportsNs.AggregateFunctionEnum = js.native
    var Minimum: mendixmodelsdkLib.distGenReportsMod.reportsNs.AggregateFunctionEnum = js.native
    var Sum: mendixmodelsdkLib.distGenReportsMod.reportsNs.AggregateFunctionEnum = js.native
  }
  
  @js.native
  object AspectRatio extends js.Object {
    var FourToThree: mendixmodelsdkLib.distGenReportsMod.reportsNs.AspectRatio = js.native
    var NineToSixteen: mendixmodelsdkLib.distGenReportsMod.reportsNs.AspectRatio = js.native
    var OneToOne: mendixmodelsdkLib.distGenReportsMod.reportsNs.AspectRatio = js.native
    var SixteenToNine: mendixmodelsdkLib.distGenReportsMod.reportsNs.AspectRatio = js.native
    var ThreeToFour: mendixmodelsdkLib.distGenReportsMod.reportsNs.AspectRatio = js.native
    var ThreeToTwo: mendixmodelsdkLib.distGenReportsMod.reportsNs.AspectRatio = js.native
    var TwoToThree: mendixmodelsdkLib.distGenReportsMod.reportsNs.AspectRatio = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/report-grid relevant section in reference guide}
       */
  @js.native
  object BasicReport extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenReportsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.BuildingBlock element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.7.0 to 7.14.0
             */
    def createInBuildingBlockUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.BuildingBlock): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.BuildingBlock element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInBuildingBlockUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.BuildingBlock): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'footerWidget' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.14.0
             */
    def createInDataViewUnderFooterWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'footerWidgets' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDataViewUnderFooterWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInDataViewUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDataViewUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.DivContainer element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInDivContainerUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DivContainer): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.DivContainer element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDivContainerUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DivContainer): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.GroupBox element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInGroupBoxUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GroupBox): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.GroupBox element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInGroupBoxUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GroupBox): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'leftWidget' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInHeaderUnderLeftWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'leftWidgets' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInHeaderUnderLeftWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'rightWidget' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInHeaderUnderRightWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'rightWidgets' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInHeaderUnderRightWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.LayoutCallArgument element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutCallArgumentUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutCallArgument): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.LayoutCallArgument element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutCallArgumentUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutCallArgument): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.LayoutGridColumn element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutGridColumnUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutGridColumn): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.LayoutGridColumn element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutGridColumnUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutGridColumn): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.Layout element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Layout): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.Layout element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Layout): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.ListViewTemplate element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInListViewTemplateUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListViewTemplate): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.ListViewTemplate element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInListViewTemplateUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListViewTemplate): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.ListView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInListViewUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListView): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.ListView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInListViewUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListView): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.MasterDetailRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.1.0 to 7.14.0
             */
    def createInMasterDetailRegionUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.MasterDetailRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.NavigationListItem element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInNavigationListItemUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.NavigationListItem): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.NavigationListItem element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInNavigationListItemUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.NavigationListItem): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'parameterWidget' property
             * of the parent ReportPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInReportPaneUnderParameterWidget(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'reportWidget' property
             * of the parent ReportPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInReportPaneUnderReportWidget(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.ScrollContainerRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInScrollContainerRegionUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ScrollContainerRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.ScrollContainerRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInScrollContainerRegionUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ScrollContainerRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.Snippet element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSnippetUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Snippet): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.Snippet element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSnippetUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Snippet): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'firstWidget' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSplitPaneUnderFirstWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'firstWidgets' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSplitPaneUnderFirstWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'secondWidget' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSplitPaneUnderSecondWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'secondWidgets' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSplitPaneUnderSecondWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.TabPage element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTabPageUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TabPage): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.TabPage element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTabPageUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TabPage): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.TableCell element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTableCellUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TableCell): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.TableCell element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTableCellUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TableCell): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widget' property
             * of the parent pages.TemplateGridContents element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTemplateGridContentsUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TemplateGridContents): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.TemplateGridContents element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTemplateGridContentsUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TemplateGridContents): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
    /**
             * Creates and returns a new BasicReport instance in the SDK and on the server.
             * The new BasicReport will be automatically stored in the 'widgets' property
             * of the parent pages.VerticalFlow element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInVerticalFlowUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.VerticalFlow): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport = js.native
  }
  
  @js.native
  object BasicReportAggregate extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenReportsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReportAggregate = js.native
    /**
             * Creates and returns a new BasicReportAggregate instance in the SDK and on the server.
             * The new BasicReportAggregate will be automatically stored in the 'aggregates' property
             * of the parent BasicReport element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReportAggregate = js.native
  }
  
  @js.native
  object BasicReportColumn extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenReportsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReportColumn = js.native
    /**
             * Creates and returns a new BasicReportColumn instance in the SDK and on the server.
             * The new BasicReportColumn will be automatically stored in the 'columns' property
             * of the parent BasicReport element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport): mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReportColumn = js.native
  }
  
  @js.native
  object ChartType extends js.Object {
    var Area: mendixmodelsdkLib.distGenReportsMod.reportsNs.ChartType = js.native
    var HorizontalBars: mendixmodelsdkLib.distGenReportsMod.reportsNs.ChartType = js.native
    var Lines: mendixmodelsdkLib.distGenReportsMod.reportsNs.ChartType = js.native
    var VerticalBars: mendixmodelsdkLib.distGenReportsMod.reportsNs.ChartType = js.native
    var VerticalBars3D: mendixmodelsdkLib.distGenReportsMod.reportsNs.ChartType = js.native
  }
  
  @js.native
  object ColumnFormat extends js.Object {
    var Default: mendixmodelsdkLib.distGenReportsMod.reportsNs.ColumnFormat = js.native
    var MonthName: mendixmodelsdkLib.distGenReportsMod.reportsNs.ColumnFormat = js.native
    var WeekdayName: mendixmodelsdkLib.distGenReportsMod.reportsNs.ColumnFormat = js.native
  }
  
  @js.native
  object DateRangeFieldEnum extends js.Object {
    var Month: mendixmodelsdkLib.distGenReportsMod.reportsNs.DateRangeFieldEnum = js.native
    var Period: mendixmodelsdkLib.distGenReportsMod.reportsNs.DateRangeFieldEnum = js.native
    var Quarter: mendixmodelsdkLib.distGenReportsMod.reportsNs.DateRangeFieldEnum = js.native
    var Week: mendixmodelsdkLib.distGenReportsMod.reportsNs.DateRangeFieldEnum = js.native
    var Year: mendixmodelsdkLib.distGenReportsMod.reportsNs.DateRangeFieldEnum = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/report-button relevant section in reference guide}
       */
  @js.native
  object ReportButton extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenReportsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.BuildingBlock element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.7.0 to 7.14.0
             */
    def createInBuildingBlockUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.BuildingBlock): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.BuildingBlock element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInBuildingBlockUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.BuildingBlock): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'footerWidget' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.14.0
             */
    def createInDataViewUnderFooterWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'footerWidgets' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDataViewUnderFooterWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInDataViewUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDataViewUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.DivContainer element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInDivContainerUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DivContainer): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.DivContainer element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDivContainerUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DivContainer): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.GroupBox element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInGroupBoxUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GroupBox): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.GroupBox element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInGroupBoxUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GroupBox): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'leftWidget' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInHeaderUnderLeftWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'leftWidgets' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInHeaderUnderLeftWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'rightWidget' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInHeaderUnderRightWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'rightWidgets' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInHeaderUnderRightWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.LayoutCallArgument element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutCallArgumentUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutCallArgument): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.LayoutCallArgument element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutCallArgumentUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutCallArgument): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.LayoutGridColumn element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutGridColumnUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutGridColumn): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.LayoutGridColumn element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutGridColumnUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutGridColumn): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.Layout element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Layout): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.Layout element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Layout): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.ListViewTemplate element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInListViewTemplateUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListViewTemplate): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.ListViewTemplate element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInListViewTemplateUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListViewTemplate): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.ListView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInListViewUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.ListView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInListViewUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.MasterDetailRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.1.0 to 7.14.0
             */
    def createInMasterDetailRegionUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.MasterDetailRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.NavigationListItem element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInNavigationListItemUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.NavigationListItem): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.NavigationListItem element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInNavigationListItemUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.NavigationListItem): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'parameterWidget' property
             * of the parent ReportPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInReportPaneUnderParameterWidget(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'reportWidget' property
             * of the parent ReportPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInReportPaneUnderReportWidget(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.ScrollContainerRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInScrollContainerRegionUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ScrollContainerRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.ScrollContainerRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInScrollContainerRegionUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ScrollContainerRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.Snippet element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSnippetUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Snippet): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.Snippet element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSnippetUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Snippet): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'firstWidget' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSplitPaneUnderFirstWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'firstWidgets' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSplitPaneUnderFirstWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'secondWidget' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSplitPaneUnderSecondWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'secondWidgets' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSplitPaneUnderSecondWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.TabPage element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTabPageUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TabPage): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.TabPage element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTabPageUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TabPage): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.TableCell element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTableCellUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TableCell): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.TableCell element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTableCellUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TableCell): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widget' property
             * of the parent pages.TemplateGridContents element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTemplateGridContentsUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TemplateGridContents): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.TemplateGridContents element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTemplateGridContentsUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TemplateGridContents): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
    /**
             * Creates and returns a new ReportButton instance in the SDK and on the server.
             * The new ReportButton will be automatically stored in the 'widgets' property
             * of the parent pages.VerticalFlow element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInVerticalFlowUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.VerticalFlow): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportButton = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/report-chart relevant section in reference guide}
       */
  @js.native
  object ReportChart extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenReportsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.BuildingBlock element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.7.0 to 7.14.0
             */
    def createInBuildingBlockUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.BuildingBlock): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.BuildingBlock element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInBuildingBlockUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.BuildingBlock): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'footerWidget' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.14.0
             */
    def createInDataViewUnderFooterWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'footerWidgets' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDataViewUnderFooterWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInDataViewUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDataViewUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.DivContainer element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInDivContainerUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DivContainer): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.DivContainer element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDivContainerUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DivContainer): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.GroupBox element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInGroupBoxUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GroupBox): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.GroupBox element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInGroupBoxUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GroupBox): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'leftWidget' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInHeaderUnderLeftWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'leftWidgets' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInHeaderUnderLeftWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'rightWidget' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInHeaderUnderRightWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'rightWidgets' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInHeaderUnderRightWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.LayoutCallArgument element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutCallArgumentUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutCallArgument): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.LayoutCallArgument element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutCallArgumentUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutCallArgument): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.LayoutGridColumn element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutGridColumnUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutGridColumn): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.LayoutGridColumn element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutGridColumnUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutGridColumn): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.Layout element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Layout): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.Layout element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Layout): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.ListViewTemplate element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInListViewTemplateUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListViewTemplate): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.ListViewTemplate element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInListViewTemplateUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListViewTemplate): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.ListView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInListViewUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.ListView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInListViewUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.MasterDetailRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.1.0 to 7.14.0
             */
    def createInMasterDetailRegionUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.MasterDetailRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.NavigationListItem element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInNavigationListItemUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.NavigationListItem): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.NavigationListItem element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInNavigationListItemUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.NavigationListItem): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'parameterWidget' property
             * of the parent ReportPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInReportPaneUnderParameterWidget(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'reportWidget' property
             * of the parent ReportPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInReportPaneUnderReportWidget(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.ScrollContainerRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInScrollContainerRegionUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ScrollContainerRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.ScrollContainerRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInScrollContainerRegionUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ScrollContainerRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.Snippet element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSnippetUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Snippet): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.Snippet element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSnippetUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Snippet): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'firstWidget' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSplitPaneUnderFirstWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'firstWidgets' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSplitPaneUnderFirstWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'secondWidget' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSplitPaneUnderSecondWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'secondWidgets' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSplitPaneUnderSecondWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.TabPage element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTabPageUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TabPage): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.TabPage element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTabPageUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TabPage): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.TableCell element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTableCellUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TableCell): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.TableCell element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTableCellUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TableCell): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widget' property
             * of the parent pages.TemplateGridContents element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTemplateGridContentsUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TemplateGridContents): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.TemplateGridContents element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTemplateGridContentsUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TemplateGridContents): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
    /**
             * Creates and returns a new ReportChart instance in the SDK and on the server.
             * The new ReportChart will be automatically stored in the 'widgets' property
             * of the parent pages.VerticalFlow element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInVerticalFlowUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.VerticalFlow): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart = js.native
  }
  
  @js.native
  object ReportChartSeries extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenReportsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChartSeries = js.native
    /**
             * Creates and returns a new ReportChartSeries instance in the SDK and on the server.
             * The new ReportChartSeries will be automatically stored in the 'seriess' property
             * of the parent ReportChart element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChart): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportChartSeries = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/date-range-field relevant section in reference guide}
       */
  @js.native
  object ReportDateRangeField extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenReportsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeField = js.native
    /**
             * Creates and returns a new ReportDateRangeField instance in the SDK and on the server.
             * The new ReportDateRangeField will be automatically stored in the 'fields' property
             * of the parent ReportDateRangeSelector element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeField = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/report-date-parameter relevant section in reference guide}
       */
  @js.native
  object ReportDateRangeSelector extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenReportsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.BuildingBlock element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.7.0 to 7.14.0
             */
    def createInBuildingBlockUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.BuildingBlock): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.BuildingBlock element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInBuildingBlockUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.BuildingBlock): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'footerWidget' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.14.0
             */
    def createInDataViewUnderFooterWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'footerWidgets' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDataViewUnderFooterWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInDataViewUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDataViewUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.DivContainer element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInDivContainerUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DivContainer): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.DivContainer element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDivContainerUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DivContainer): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.GroupBox element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInGroupBoxUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GroupBox): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.GroupBox element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInGroupBoxUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GroupBox): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'leftWidget' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInHeaderUnderLeftWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'leftWidgets' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInHeaderUnderLeftWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'rightWidget' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInHeaderUnderRightWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'rightWidgets' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInHeaderUnderRightWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.LayoutCallArgument element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutCallArgumentUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutCallArgument): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.LayoutCallArgument element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutCallArgumentUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutCallArgument): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.LayoutGridColumn element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutGridColumnUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutGridColumn): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.LayoutGridColumn element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutGridColumnUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutGridColumn): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.Layout element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Layout): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.Layout element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Layout): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.ListViewTemplate element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInListViewTemplateUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListViewTemplate): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.ListViewTemplate element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInListViewTemplateUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListViewTemplate): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.ListView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInListViewUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.ListView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInListViewUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.MasterDetailRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.1.0 to 7.14.0
             */
    def createInMasterDetailRegionUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.MasterDetailRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.NavigationListItem element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInNavigationListItemUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.NavigationListItem): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.NavigationListItem element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInNavigationListItemUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.NavigationListItem): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'parameterWidget' property
             * of the parent ReportPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInReportPaneUnderParameterWidget(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'reportWidget' property
             * of the parent ReportPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInReportPaneUnderReportWidget(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.ScrollContainerRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInScrollContainerRegionUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ScrollContainerRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.ScrollContainerRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInScrollContainerRegionUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ScrollContainerRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.Snippet element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSnippetUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Snippet): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.Snippet element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSnippetUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Snippet): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'firstWidget' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSplitPaneUnderFirstWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'firstWidgets' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSplitPaneUnderFirstWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'secondWidget' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSplitPaneUnderSecondWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'secondWidgets' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSplitPaneUnderSecondWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.TabPage element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTabPageUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TabPage): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.TabPage element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTabPageUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TabPage): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.TableCell element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTableCellUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TableCell): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.TableCell element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTableCellUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TableCell): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widget' property
             * of the parent pages.TemplateGridContents element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTemplateGridContentsUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TemplateGridContents): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.TemplateGridContents element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTemplateGridContentsUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TemplateGridContents): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
    /**
             * Creates and returns a new ReportDateRangeSelector instance in the SDK and on the server.
             * The new ReportDateRangeSelector will be automatically stored in the 'widgets' property
             * of the parent pages.VerticalFlow element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInVerticalFlowUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.VerticalFlow): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDateRangeSelector = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/report-parameter relevant section in reference guide}
       */
  @js.native
  object ReportDropDown extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenReportsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.BuildingBlock element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.7.0 to 7.14.0
             */
    def createInBuildingBlockUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.BuildingBlock): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.BuildingBlock element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInBuildingBlockUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.BuildingBlock): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'footerWidget' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 7.14.0
             */
    def createInDataViewUnderFooterWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'footerWidgets' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDataViewUnderFooterWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInDataViewUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDataViewUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.DivContainer element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInDivContainerUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DivContainer): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.DivContainer element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInDivContainerUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DivContainer): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.GroupBox element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInGroupBoxUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GroupBox): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.GroupBox element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInGroupBoxUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GroupBox): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'leftWidget' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInHeaderUnderLeftWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'leftWidgets' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInHeaderUnderLeftWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'rightWidget' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInHeaderUnderRightWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'rightWidgets' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInHeaderUnderRightWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.LayoutCallArgument element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutCallArgumentUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutCallArgument): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.LayoutCallArgument element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutCallArgumentUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutCallArgument): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.LayoutGridColumn element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutGridColumnUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutGridColumn): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.LayoutGridColumn element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutGridColumnUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutGridColumn): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.Layout element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInLayoutUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Layout): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.Layout element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInLayoutUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Layout): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.ListViewTemplate element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInListViewTemplateUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListViewTemplate): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.ListViewTemplate element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInListViewTemplateUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListViewTemplate): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.ListView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInListViewUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.ListView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInListViewUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.MasterDetailRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.1.0 to 7.14.0
             */
    def createInMasterDetailRegionUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.MasterDetailRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.NavigationListItem element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInNavigationListItemUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.NavigationListItem): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.NavigationListItem element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInNavigationListItemUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.NavigationListItem): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'parameterWidget' property
             * of the parent ReportPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInReportPaneUnderParameterWidget(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'reportWidget' property
             * of the parent ReportPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInReportPaneUnderReportWidget(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.ScrollContainerRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInScrollContainerRegionUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ScrollContainerRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.ScrollContainerRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInScrollContainerRegionUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ScrollContainerRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.Snippet element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSnippetUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Snippet): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.Snippet element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSnippetUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Snippet): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'firstWidget' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSplitPaneUnderFirstWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'firstWidgets' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSplitPaneUnderFirstWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'secondWidget' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInSplitPaneUnderSecondWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'secondWidgets' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInSplitPaneUnderSecondWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.TabPage element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTabPageUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TabPage): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.TabPage element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTabPageUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TabPage): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.TableCell element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTableCellUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TableCell): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.TableCell element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTableCellUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TableCell): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widget' property
             * of the parent pages.TemplateGridContents element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInTemplateGridContentsUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TemplateGridContents): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.TemplateGridContents element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  7.15.0 and higher
             */
    def createInTemplateGridContentsUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TemplateGridContents): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
    /**
             * Creates and returns a new ReportDropDown instance in the SDK and on the server.
             * The new ReportDropDown will be automatically stored in the 'widgets' property
             * of the parent pages.VerticalFlow element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 7.14.0
             */
    def createInVerticalFlowUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.VerticalFlow): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportDropDown = js.native
  }
  
  /**
       * See: {@link https://docs.mendix.com/refguide7/report-pane relevant section in reference guide}
       *
       * In version 6.10.0: deleted
       */
  @js.native
  object ReportPane extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenReportsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'footerWidget' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.7.0 to 6.9.0
             */
    def createInDataViewUnderFooterWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widget' property
             * of the parent pages.DataView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInDataViewUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DataView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widget' property
             * of the parent pages.DivContainer element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInDivContainerUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.DivContainer): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widget' property
             * of the parent pages.GroupBox element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInGroupBoxUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.GroupBox): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'leftWidget' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInHeaderUnderLeftWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'rightWidget' property
             * of the parent pages.Header element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInHeaderUnderRightWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Header): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widget' property
             * of the parent pages.LayoutCallArgument element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInLayoutCallArgumentUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutCallArgument): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widget' property
             * of the parent pages.LayoutGridColumn element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInLayoutGridColumnUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.LayoutGridColumn): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widget' property
             * of the parent pages.Layout element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInLayoutUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Layout): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widget' property
             * of the parent pages.ListViewTemplate element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInListViewTemplateUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListViewTemplate): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widget' property
             * of the parent pages.ListView element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInListViewUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ListView): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widget' property
             * of the parent pages.NavigationListItem element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInNavigationListItemUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.NavigationListItem): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'parameterWidget' property
             * of the parent ReportPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInReportPaneUnderParameterWidget(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'reportWidget' property
             * of the parent ReportPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInReportPaneUnderReportWidget(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widget' property
             * of the parent pages.ScrollContainerRegion element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInScrollContainerRegionUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.ScrollContainerRegion): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widget' property
             * of the parent pages.Snippet element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInSnippetUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.Snippet): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'firstWidget' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInSplitPaneUnderFirstWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'secondWidget' property
             * of the parent pages.SplitPane element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInSplitPaneUnderSecondWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.SplitPane): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widget' property
             * of the parent pages.TabPage element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInTabPageUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TabPage): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widget' property
             * of the parent pages.TableCell element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInTableCellUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TableCell): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widget' property
             * of the parent pages.TemplateGridContents element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInTemplateGridContentsUnderWidget(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.TemplateGridContents): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
    /**
             * Creates and returns a new ReportPane instance in the SDK and on the server.
             * The new ReportPane will be automatically stored in the 'widgets' property
             * of the parent pages.VerticalFlow element passed as argument.
             *
             * Warning! Can only be used on models with the following Mendix meta model versions:
             *  6.0.0 to 6.9.0
             */
    def createInVerticalFlowUnderWidgets(container: mendixmodelsdkLib.distGenPagesMod.pagesNs.VerticalFlow): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportPane = js.native
  }
  
  @js.native
  object ReportParameter extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenReportsMod.StructureVersionInfo = js.native
  }
  
  /**
       * Interfaces and instance classes for types from the Mendix sub meta model `Reports`.
       */
  /**
       * See: {@link https://docs.mendix.com/refguide7/report-widgets relevant section in reference guide}
       */
  @js.native
  object ReportWidget extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenReportsMod.StructureVersionInfo = js.native
  }
  
  @js.native
  object ReportZoomInfo extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenReportsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportZoomInfo = js.native
    /**
             * Creates and returns a new ReportZoomInfo instance in the SDK and on the server.
             * The new ReportZoomInfo will be automatically stored in the 'zoomInfo' property
             * of the parent BasicReport element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.BasicReport): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportZoomInfo = js.native
  }
  
  @js.native
  object ReportZoomMapping extends js.Object {
    var structureTypeName: java.lang.String = js.native
    var versionInfo: mendixmodelsdkLib.distGenReportsMod.StructureVersionInfo = js.native
    /**
             * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
             * Expects one argument: the IModel object the instance will "live on".
             * After creation, assign or add this instance to a property that accepts this kind of objects.
             */
    def create(model: mendixmodelsdkLib.distGenBaseDashModelMod.IModel): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportZoomMapping = js.native
    /**
             * Creates and returns a new ReportZoomMapping instance in the SDK and on the server.
             * The new ReportZoomMapping will be automatically stored in the 'mappings' property
             * of the parent ReportZoomInfo element passed as argument.
             */
    def createIn(container: mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportZoomInfo): mendixmodelsdkLib.distGenReportsMod.reportsNs.ReportZoomMapping = js.native
  }
  
}
