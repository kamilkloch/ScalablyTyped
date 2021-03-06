package typings
package jsplumbLib.jsplumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Defaults extends js.Object {
  var Anchor: js.UndefOr[AnchorSpec] = js.undefined
  var Anchors: js.UndefOr[js.Tuple2[AnchorSpec, AnchorSpec]] = js.undefined
  var ConnectionOverlays: js.UndefOr[js.Array[OverlaySpec]] = js.undefined
  var ConnectionsDetachable: js.UndefOr[scala.Boolean] = js.undefined
  var Connector: js.UndefOr[ConnectorSpec] = js.undefined
  var Container: js.UndefOr[js.Any] = js.undefined
   // string(selector or id) or element
  var DragOptions: js.UndefOr[DragOptions] = js.undefined
  var Endpoint: js.UndefOr[EndpointSpec] = js.undefined
  var EndpointHoverStyle: js.UndefOr[PaintStyle] = js.undefined
  var EndpointStyle: js.UndefOr[PaintStyle] = js.undefined
  var Endpoints: js.UndefOr[js.Tuple2[EndpointSpec, EndpointSpec]] = js.undefined
  var HoverPaintStyle: js.UndefOr[PaintStyle] = js.undefined
  var PaintStyle: js.UndefOr[PaintStyle] = js.undefined
  var ReattachConnections: js.UndefOr[scala.Boolean] = js.undefined
}

object Defaults {
  @scala.inline
  def apply(
    Anchor: AnchorSpec = null,
    Anchors: js.Tuple2[AnchorSpec, AnchorSpec] = null,
    ConnectionOverlays: js.Array[OverlaySpec] = null,
    ConnectionsDetachable: js.UndefOr[scala.Boolean] = js.undefined,
    Connector: ConnectorSpec = null,
    Container: js.Any = null,
    DragOptions: DragOptions = null,
    Endpoint: EndpointSpec = null,
    EndpointHoverStyle: PaintStyle = null,
    EndpointStyle: PaintStyle = null,
    Endpoints: js.Tuple2[EndpointSpec, EndpointSpec] = null,
    HoverPaintStyle: PaintStyle = null,
    PaintStyle: PaintStyle = null,
    ReattachConnections: js.UndefOr[scala.Boolean] = js.undefined
  ): Defaults = {
    val __obj = js.Dynamic.literal()
    if (Anchor != null) __obj.updateDynamic("Anchor")(Anchor.asInstanceOf[js.Any])
    if (Anchors != null) __obj.updateDynamic("Anchors")(Anchors)
    if (ConnectionOverlays != null) __obj.updateDynamic("ConnectionOverlays")(ConnectionOverlays)
    if (!js.isUndefined(ConnectionsDetachable)) __obj.updateDynamic("ConnectionsDetachable")(ConnectionsDetachable)
    if (Connector != null) __obj.updateDynamic("Connector")(Connector.asInstanceOf[js.Any])
    if (Container != null) __obj.updateDynamic("Container")(Container)
    if (DragOptions != null) __obj.updateDynamic("DragOptions")(DragOptions)
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (EndpointHoverStyle != null) __obj.updateDynamic("EndpointHoverStyle")(EndpointHoverStyle)
    if (EndpointStyle != null) __obj.updateDynamic("EndpointStyle")(EndpointStyle)
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints)
    if (HoverPaintStyle != null) __obj.updateDynamic("HoverPaintStyle")(HoverPaintStyle)
    if (PaintStyle != null) __obj.updateDynamic("PaintStyle")(PaintStyle)
    if (!js.isUndefined(ReattachConnections)) __obj.updateDynamic("ReattachConnections")(ReattachConnections)
    __obj.asInstanceOf[Defaults]
  }
}

