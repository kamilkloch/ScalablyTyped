package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "interaction")
@js.native
object interactionNs extends js.Object {
  /**
    * @classdesc
    * Allows the user to zoom by double-clicking on the map.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom by double-clicking on the map.
    *
    * @param opt_options Options.
    * @api stable
    */
  class DoubleClickZoom () extends Interaction {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DoubleClickZoomOptions) = this()
  }
  
  /**
    * @classdesc
    * Handles input of vector data by drag and drop.
    *
    * @fires ol.interaction.DragAndDropEvent
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Handles input of vector data by drag and drop.
    *
    * @fires ol.interaction.DragAndDropEvent
    * @param opt_options Options.
    * @api stable
    */
  class DragAndDrop () extends Interaction {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DragAndDropOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when the shift or other key is held down. This is used, for example,
    * for zooming to a specific area of the map
    * (see {@link ol.interaction.DragZoom} and
    * {@link ol.interaction.DragRotateAndZoom}).
    *
    * This interaction is only supported for mouse devices.
    *
    * @fires ol.DragBoxEvent
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when the shift or other key is held down. This is used, for example,
    * for zooming to a specific area of the map
    * (see {@link ol.interaction.DragZoom} and
    * {@link ol.interaction.DragRotateAndZoom}).
    *
    * This interaction is only supported for mouse devices.
    *
    * @fires ol.DragBoxEvent
    * @param opt_options Options.
    * @api stable
    */
  class DragBox () extends Pointer {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DragBoxOptions) = this()
    /**
      * Returns geometry of last drawn box.
      * @return Geometry.
      * @api stable
      */
    def getGeometry(): openlayersLib.openlayersMod.geomNs.Polygon = js.native
  }
  
  /**
    * @classdesc
    * Allows the user to pan the map by dragging the map.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Allows the user to pan the map by dragging the map.
    *
    * @param opt_options Options.
    * @api stable
    */
  class DragPan () extends Pointer {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DragPanOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to rotate the map by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when the alt and shift keys are held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Allows the user to rotate the map by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when the alt and shift keys are held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * @param opt_options Options.
    * @api stable
    */
  class DragRotate () extends Pointer {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DragRotateOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to zoom and rotate the map by clicking and dragging
    * on the map.  By default, this interaction is limited to when the shift
    * key is held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * And this interaction is not included in the default interactions.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom and rotate the map by clicking and dragging
    * on the map.  By default, this interaction is limited to when the shift
    * key is held down.
    *
    * This interaction is only supported for mouse devices.
    *
    * And this interaction is not included in the default interactions.
    *
    * @param opt_options Options.
    * @api stable
    */
  class DragRotateAndZoom () extends Pointer {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DragRotateAndZoomOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to zoom the map by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when a key, shift by default, is held down.
    *
    * To change the style of the box, use CSS and the `.ol-dragzoom` selector, or
    * your custom one configured with `className`.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom the map by clicking and dragging on the map,
    * normally combined with an {@link ol.events.condition} that limits
    * it to when a key, shift by default, is held down.
    *
    * To change the style of the box, use CSS and the `.ol-dragzoom` selector, or
    * your custom one configured with `className`.
    *
    * @param opt_options Options.
    * @api stable
    */
  class DragZoom () extends DragBox {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DragZoomOptions) = this()
  }
  
  /**
    * @classdesc
    * Interaction for drawing feature geometries.
    *
    * @fires ol.interaction.DrawEvent
    * @param options Options.
    * @api stable
    */
  @js.native
  class Draw protected () extends Pointer {
    /**
      * @classdesc
      * Interaction for drawing feature geometries.
      *
      * @fires ol.interaction.DrawEvent
      * @param options Options.
      * @api stable
      */
    def this(options: openlayersLib.openlayersMod.olxNs.interactionNs.DrawOptions) = this()
    /**
      * Extend an existing geometry by adding additional points. This only works
      * on features with `LineString` geometries, where the interaction will
      * extend lines by adding points to the end of the coordinates array.
      * @param feature Feature to be extended.
      * @api
      */
    def extend(feature: openlayersLib.openlayersMod.Feature): scala.Unit = js.native
    /**
      * Stop drawing and add the sketch feature to the target layer.
      * The {@link ol.interaction.DrawEventType.DRAWEND} event is dispatched before
      * inserting the feature.
      * @api
      */
    def finishDrawing(): scala.Unit = js.native
    /**
      * Remove last point of the feature currently being drawn.
      * @api
      */
    def removeLastPoint(): scala.Unit = js.native
  }
  
  /**
    * @classdesc
    * Allows the user to draw a vector box by clicking and dragging on the map.
    * Once drawn, the vector box can be modified by dragging its vertices or edges.
    * This interaction is only supported for mouse devices.
    *
    * @fires ol.interaction.Extent.Event
    * @param options Options.
    * @api stable
    */
  @js.native
  class Extent protected () extends Pointer {
    /**
      * @fires ol.interaction.Extent.Event
      * @param options Options.
      * @api stable
      */
    def this(options: openlayersLib.openlayersMod.olxNs.interactionNs.ExtentOptions) = this()
    /**
      * Returns the current drawn extent in the view projection
      *
      * @return Drawn extent in the view projection.
      * @api
      */
    def getExtent(): openlayersLib.openlayersMod.Extent = js.native
    /**
      * Manually sets the drawn extent, using the view projection.
      *
      * @param extent Extent
      * @api
      */
    def setExtent(extent: openlayersLib.openlayersMod.Extent): scala.Unit = js.native
    /**
      * @inheritDoc
      */
    def setMap(map: openlayersLib.openlayersMod.Map): scala.Unit = js.native
  }
  
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * User actions that change the state of the map. Some are similar to controls,
    * but are not associated with a DOM element.
    * For example, {@link ol.interaction.KeyboardZoom} is functionally the same as
    * {@link ol.control.Zoom}, but triggered by a keyboard event not a button
    * element event.
    * Although interactions do not have a DOM element, some of them do render
    * vectors and so are visible on the screen.
    *
    * @param options Options.
    * @api
    */
  @js.native
  class Interaction protected ()
    extends openlayersLib.openlayersMod.Object {
    /**
      * @classdesc
      * Abstract base class; normally only used for creating subclasses and not
      * instantiated in apps.
      * User actions that change the state of the map. Some are similar to controls,
      * but are not associated with a DOM element.
      * For example, {@link ol.interaction.KeyboardZoom} is functionally the same as
      * {@link ol.control.Zoom}, but triggered by a keyboard event not a button
      * element event.
      * Although interactions do not have a DOM element, some of them do render
      * vectors and so are visible on the screen.
      *
      * @param options Options.
      * @api
      */
    def this(options: openlayersLib.openlayersMod.olxNs.interactionNs.InteractionOptions) = this()
    /**
      * Return whether the interaction is currently active.
      * @return `true` if the interaction is active, `false` otherwise.
      * @observable
      * @api
      */
    def getActive(): scala.Boolean = js.native
    /**
      * Get the map associated with this interaction.
      * @return Map.
      * @api
      */
    def getMap(): openlayersLib.openlayersMod.Map = js.native
    /**
      * Activate or deactivate the interaction.
      * @param active Active.
      * @observable
      * @api
      */
    def setActive(active: scala.Boolean): scala.Unit = js.native
  }
  
  /**
    * @classdesc
    * Allows the user to pan the map using keyboard arrows.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link ol.Map}. `document` never loses focus but, for any other element,
    * focus will have to be on, and returned to, this element if the keys are to
    * function.
    * See also {@link ol.interaction.KeyboardZoom}.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Allows the user to pan the map using keyboard arrows.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link ol.Map}. `document` never loses focus but, for any other element,
    * focus will have to be on, and returned to, this element if the keys are to
    * function.
    * See also {@link ol.interaction.KeyboardZoom}.
    *
    * @param opt_options Options.
    * @api stable
    */
  class KeyboardPan () extends Interaction {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.KeyboardPanOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to zoom the map using keyboard + and -.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link ol.Map}. `document` never loses focus but, for any other element,
    * focus will have to be on, and returned to, this element if the keys are to
    * function.
    * See also {@link ol.interaction.KeyboardPan}.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom the map using keyboard + and -.
    * Note that, although this interaction is by default included in maps,
    * the keys can only be used when browser focus is on the element to which
    * the keyboard events are attached. By default, this is the map div,
    * though you can change this with the `keyboardEventTarget` in
    * {@link ol.Map}. `document` never loses focus but, for any other element,
    * focus will have to be on, and returned to, this element if the keys are to
    * function.
    * See also {@link ol.interaction.KeyboardPan}.
    *
    * @param opt_options Options.
    * @api stable
    */
  class KeyboardZoom () extends Interaction {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.KeyboardZoomOptions) = this()
  }
  
  /**
    * @classdesc
    * Interaction for modifying feature geometries.
    *
    * @param options Options.
    * @fires ol.interaction.ModifyEvent
    * @api
    */
  @js.native
  class Modify protected () extends Pointer {
    /**
      * @classdesc
      * Interaction for modifying feature geometries.
      *
      * @param options Options.
      * @fires ol.interaction.ModifyEvent
      * @api
      */
    def this(options: openlayersLib.openlayersMod.olxNs.interactionNs.ModifyOptions) = this()
    /**
      * Removes the vertex currently being pointed.
      * @return True when a vertex was removed.
      * @api
      */
    def removePoint(): scala.Boolean = js.native
  }
  
  /**
    * @classdesc
    * Allows the user to zoom the map by scrolling the mouse wheel.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom the map by scrolling the mouse wheel.
    *
    * @param opt_options Options.
    * @api stable
    */
  class MouseWheelZoom () extends Interaction {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.MouseWheelZoomOptions) = this()
    /**
      * Enable or disable using the mouse's location as an anchor when zooming
      * @param useAnchor true to zoom to the mouse's location, false
      * to zoom to the center of the map
      * @api
      */
    def setMouseAnchor(useAnchor: scala.Boolean): scala.Unit = js.native
  }
  
  /**
    * @classdesc
    * Allows the user to rotate the map by twisting with two fingers
    * on a touch screen.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Allows the user to rotate the map by twisting with two fingers
    * on a touch screen.
    *
    * @param opt_options Options.
    * @api stable
    */
  class PinchRotate () extends Pointer {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.PinchRotateOptions) = this()
  }
  
  /**
    * @classdesc
    * Allows the user to zoom the map by pinching with two fingers
    * on a touch screen.
    *
    * @param opt_options Options.
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Allows the user to zoom the map by pinching with two fingers
    * on a touch screen.
    *
    * @param opt_options Options.
    * @api stable
    */
  class PinchZoom () extends Pointer {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.PinchZoomOptions) = this()
  }
  
  /**
    * @classdesc
    * Base class that calls user-defined functions on `down`, `move` and `up`
    * events. This class also manages "drag sequences".
    *
    * When the `handleDownEvent` user function returns `true` a drag sequence is
    * started. During a drag sequence the `handleDragEvent` user function is
    * called on `move` events. The drag sequence ends when the `handleUpEvent`
    * user function is called and returns `false`.
    *
    * @param opt_options Options.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Base class that calls user-defined functions on `down`, `move` and `up`
    * events. This class also manages "drag sequences".
    *
    * When the `handleDownEvent` user function returns `true` a drag sequence is
    * started. During a drag sequence the `handleDragEvent` user function is
    * called on `move` events. The drag sequence ends when the `handleUpEvent`
    * user function is called and returns `false`.
    *
    * @param opt_options Options.
    * @api
    */
  class Pointer () extends Interaction {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.PointerOptions) = this()
  }
  
  /**
    * @classdesc
    * Interaction for selecting vector features. By default, selected features are
    * styled differently, so this interaction can be used for visual highlighting,
    * as well as selecting features for other actions, such as modification or
    * output. There are three ways of controlling which features are selected:
    * using the browser event as defined by the `condition` and optionally the
    * `toggle`, `add`/`remove`, and `multi` options; a `layers` filter; and a
    * further feature filter using the `filter` option.
    *
    * Selected features are added to an internal unmanaged layer.
    *
    * @param opt_options Options.
    * @fires ol.interaction.SelectEvent
    * @api stable
    */
  @js.native
  /**
    * @classdesc
    * Interaction for selecting vector features. By default, selected features are
    * styled differently, so this interaction can be used for visual highlighting,
    * as well as selecting features for other actions, such as modification or
    * output. There are three ways of controlling which features are selected:
    * using the browser event as defined by the `condition` and optionally the
    * `toggle`, `add`/`remove`, and `multi` options; a `layers` filter; and a
    * further feature filter using the `filter` option.
    *
    * Selected features are added to an internal unmanaged layer.
    *
    * @param opt_options Options.
    * @fires ol.interaction.SelectEvent
    * @api stable
    */
  class Select () extends Interaction {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.SelectOptions) = this()
    /**
      * Get the selected features.
      * @return Features collection.
      * @api stable
      */
    def getFeatures(): openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature] = js.native
    /**
      * Returns the associated {@link ol.layer.Vector vectorlayer} of
      * the (last) selected feature. Note that this will not work with any
      * programmatic method like pushing features to
      * {@link ol.interaction.Select#getFeatures collection}.
      * @param feature Feature
      * @return Layer.
      * @api
      */
    def getLayer(feature: openlayersLib.openlayersMod.Feature): openlayersLib.openlayersMod.layerNs.Vector = js.native
    def getLayer(feature: openlayersLib.openlayersMod.renderNs.Feature): openlayersLib.openlayersMod.layerNs.Vector = js.native
    /**
      * Remove the interaction from its current map, if any,  and attach it to a new
      * map, if any. Pass `null` to just remove the interaction from the current map.
      * @param map Map.
      * @api stable
      */
    def setMap(map: openlayersLib.openlayersMod.Map): scala.Unit = js.native
  }
  
  /**
    * @classdesc
    * Handles snapping of vector features while modifying or drawing them.  The
    * features can come from a {@link ol.source.Vector} or {@link ol.Collection}
    * Any interaction object that allows the user to interact
    * with the features using the mouse can benefit from the snapping, as long
    * as it is added before.
    *
    * The snap interaction modifies map browser event `coordinate` and `pixel`
    * properties to force the snap to occur to any interaction that them.
    *
    * Example:
    *
    *     var snap = new ol.interaction.Snap({
    *       source: source
    *     });
    *
    * @param opt_options Options.
    * @api
    */
  @js.native
  /**
    * @classdesc
    * Handles snapping of vector features while modifying or drawing them.  The
    * features can come from a {@link ol.source.Vector} or {@link ol.Collection}
    * Any interaction object that allows the user to interact
    * with the features using the mouse can benefit from the snapping, as long
    * as it is added before.
    *
    * The snap interaction modifies map browser event `coordinate` and `pixel`
    * properties to force the snap to occur to any interaction that them.
    *
    * Example:
    *
    *     var snap = new ol.interaction.Snap({
    *       source: source
    *     });
    *
    * @param opt_options Options.
    * @api
    */
  class Snap () extends Pointer {
    def this(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.SnapOptions) = this()
    /**
      * Add a feature to the collection of features that we may snap to.
      * @param feature Feature.
      * @param opt_listen Whether to listen to the geometry change or not
      *     Defaults to `true`.
      * @api
      */
    def addFeature(feature: openlayersLib.openlayersMod.Feature): scala.Unit = js.native
    def addFeature(feature: openlayersLib.openlayersMod.Feature, opt_listen: scala.Boolean): scala.Unit = js.native
    /**
      * Remove a feature from the collection of features that we may snap to.
      * @param feature Feature
      * @param opt_unlisten Whether to unlisten to the geometry change
      *     or not. Defaults to `true`.
      * @api
      */
    def removeFeature(feature: openlayersLib.openlayersMod.Feature): scala.Unit = js.native
    def removeFeature(feature: openlayersLib.openlayersMod.Feature, opt_unlisten: scala.Boolean): scala.Unit = js.native
  }
  
  /**
    * @classdesc
    * Interaction for translating (moving) features.
    *
    * @fires ol.interaction.TranslateEvent
    * @param options Options.
    * @api
    */
  @js.native
  class Translate protected () extends Pointer {
    /**
      * @classdesc
      * Interaction for translating (moving) features.
      *
      * @fires ol.interaction.TranslateEvent
      * @param options Options.
      * @api
      */
    def this(options: openlayersLib.openlayersMod.olxNs.interactionNs.TranslateOptions) = this()
  }
  
  /**
    * Set of interactions included in maps by default. Specific interactions can be
    * excluded by setting the appropriate option to false in the constructor
    * options, but the order of the interactions is fixed.  If you want to specify
    * a different order for interactions, you will need to create your own
    * {@link ol.interaction.Interaction} instances and insert them into a
    * {@link ol.Collection} in the order you want before creating your
    * {@link ol.Map} instance. The default set of interactions, in sequence, is:
    * * {@link ol.interaction.DragRotate}
    * * {@link ol.interaction.DoubleClickZoom}
    * * {@link ol.interaction.DragPan}
    * * {@link ol.interaction.PinchRotate}
    * * {@link ol.interaction.PinchZoom}
    * * {@link ol.interaction.KeyboardPan}
    * * {@link ol.interaction.KeyboardZoom}
    * * {@link ol.interaction.MouseWheelZoom}
    * * {@link ol.interaction.DragZoom}
    *
    * @param opt_options Defaults options.
    * @return A collection of
    * interactions to be used with the ol.Map constructor's interactions option.
    * @api stable
    */
  def defaults(): openlayersLib.openlayersMod.Collection[Interaction] = js.native
  def defaults(opt_options: openlayersLib.openlayersMod.olxNs.interactionNs.DefaultsOptions): openlayersLib.openlayersMod.Collection[Interaction] = js.native
  /* static members */
  @js.native
  object DoubleClickZoom extends js.Object {
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} (if it was a
      * doubleclick) and eventually zooms the map.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DragAndDrop extends js.Object {
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} unconditionally and
      * neither prevents the browser default nor stops event propagation.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    var handleEvent: js.Any = js.native
  }
  
  @JSName("DragAndDrop")
  @js.native
  object DragAndDropNs extends js.Object {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.DragAndDrop} instances are instances
      * of this type.
      *
      * @param type Type.
      * @param file File.
      * @param opt_features Features.
      * @param opt_projection Projection.
      */
    @js.native
    class Event protected ()
      extends openlayersLib.openlayersMod.eventsNs.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.DragAndDrop} instances are instances
        * of this type.
        *
        * @param type Type.
        * @param file File.
        * @param opt_features Features.
        * @param opt_projection Projection.
        */
      def this(`type`: openlayersLib.openlayersMod.interactionNs.DragAndDropEventType, file: stdLib.File) = this()
      def this(`type`: openlayersLib.openlayersMod.interactionNs.DragAndDropEventType, file: stdLib.File, opt_features: js.Array[openlayersLib.openlayersMod.Feature]) = this()
      def this(`type`: openlayersLib.openlayersMod.interactionNs.DragAndDropEventType, file: stdLib.File, opt_features: js.Array[openlayersLib.openlayersMod.Feature], opt_projection: openlayersLib.openlayersMod.projNs.Projection) = this()
      /**
        * The features parsed from dropped data.
        * @api stable
        */
      var features: js.Array[openlayersLib.openlayersMod.Feature] = js.native
      /**
        * The dropped file.
        * @api stable
        */
      var file: stdLib.File = js.native
      /**
        * The feature projection.
        * @api
        */
      var projection: openlayersLib.openlayersMod.projNs.Projection = js.native
    }
    
  }
  
  @JSName("DragBox")
  @js.native
  object DragBoxNs extends js.Object {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.DragBox} instances are instances of
      * this type.
      *
      * @param type The event type.
      * @param coordinate The event coordinate.
      * @param mapBrowserEvent Originating event.
      */
    @js.native
    class Event protected ()
      extends openlayersLib.openlayersMod.eventsNs.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.DragBox} instances are instances of
        * this type.
        *
        * @param type The event type.
        * @param coordinate The event coordinate.
        * @param mapBrowserEvent Originating event.
        */
      def this(`type`: java.lang.String, coordinate: openlayersLib.openlayersMod.Coordinate, mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent) = this()
      /**
        * The coordinate of the drag event.
        * @const
        * @api stable
        */
      var coordinate: openlayersLib.openlayersMod.Coordinate = js.native
      /**
        * @const
        * @api
        */
      var mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object Draw extends js.Object {
    /**
      * Create a `geometryFunction` that will create a box-shaped polygon (aligned
      * with the coordinate system axes).  Use this with the draw interaction and
      * `type: 'Circle'` to return a box instead of a circle geometry.
      * @return Function that draws a box-shaped polygon.
      * @api
      */
    def createBox(): openlayersLib.openlayersMod.DrawGeometryFunctionType = js.native
    /**
      * Create a `geometryFunction` for `mode: 'Circle'` that will create a regular
      * polygon with a user specified number of sides and start angle instead of an
      * `ol.geom.Circle` geometry.
      * @param opt_sides Number of sides of the regular polygon. Default is
      *     32.
      * @param opt_angle Angle of the first point in radians. 0 means East.
      *     Default is the angle defined by the heading from the center of the
      *     regular polygon to the current pointer position.
      * @return Function that draws a
      *     polygon.
      * @api
      */
    def createRegularPolygon(): openlayersLib.openlayersMod.DrawGeometryFunctionType = js.native
    def createRegularPolygon(opt_sides: scala.Double): openlayersLib.openlayersMod.DrawGeometryFunctionType = js.native
    def createRegularPolygon(opt_sides: scala.Double, opt_angle: scala.Double): openlayersLib.openlayersMod.DrawGeometryFunctionType = js.native
  }
  
  @JSName("Draw")
  @js.native
  object DrawNs extends js.Object {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Draw} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param feature The feature drawn.
      */
    @js.native
    class Event protected ()
      extends openlayersLib.openlayersMod.eventsNs.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Draw} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param feature The feature drawn.
        */
      def this(`type`: openlayersLib.openlayersMod.interactionNs.DrawEventType, feature: openlayersLib.openlayersMod.Feature) = this()
      /**
        * The feature being drawn.
        * @api stable
        */
      var feature: openlayersLib.openlayersMod.Feature = js.native
    }
    
  }
  
  @JSName("Extent")
  @js.native
  object ExtentNs extends js.Object {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Extent} instances are instances of
      * this type.
      *
      * @param extent the new extent
      */
    @js.native
    class Event protected ()
      extends openlayersLib.openlayersMod.eventsNs.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Extent} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param feature The feature drawn.
        */
      def this(`type`: openlayersLib.openlayersMod.interactionNs.ExtentEventType, extent: openlayersLib.openlayersMod.Extent) = this()
      /**
        * The current extent.
        * @api stable
        */
      var extent: openlayersLib.openlayersMod.Extent = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object KeyboardPan extends js.Object {
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} if it was a
      * `KeyEvent`, and decides the direction to pan to (if an arrow key was
      * pressed).
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object KeyboardZoom extends js.Object {
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} if it was a
      * `KeyEvent`, and decides whether to zoom in or out (depending on whether the
      * key pressed was '+' or '-').
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
  }
  
  @JSName("Modify")
  @js.native
  object ModifyNs extends js.Object {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Modify} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param features The features modified.
      * @param mapBrowserPointerEvent Associated
      *     {@link ol.MapBrowserPointerEvent}.
      */
    @js.native
    class Event protected ()
      extends openlayersLib.openlayersMod.eventsNs.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Modify} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param features The features modified.
        * @param mapBrowserPointerEvent Associated
        *     {@link ol.MapBrowserPointerEvent}.
        */
      def this(`type`: openlayersLib.openlayersMod.ModifyEventType, features: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature], mapBrowserPointerEvent: openlayersLib.openlayersMod.MapBrowserPointerEvent) = this()
      /**
        * The features being modified.
        * @api
        */
      var features: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature] = js.native
      /**
        * Associated {@link ol.MapBrowserEvent}.
        * @api
        */
      var mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object MouseWheelZoom extends js.Object {
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} (if it was a
      * mousewheel-event) and eventually zooms the map.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Pointer extends js.Object {
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} and may call into
      * other functions, if event sequences like e.g. 'drag' or 'down-up' etc. are
      * detected.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Select extends js.Object {
    /**
      * Handles the {@link ol.MapBrowserEvent map browser event} and may change the
      * selected state of features.
      * @param mapBrowserEvent Map browser event.
      * @return `false` to stop event propagation.
      * @api
      */
    def handleEvent(mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent): scala.Boolean = js.native
  }
  
  @JSName("Select")
  @js.native
  object SelectNs extends js.Object {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Select} instances are instances of
      * this type.
      *
      * @param type The event type.
      * @param selected Selected features.
      * @param deselected Deselected features.
      * @param mapBrowserEvent Associated
      *     {@link ol.MapBrowserEvent}.
      */
    @js.native
    class Event protected ()
      extends openlayersLib.openlayersMod.eventsNs.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Select} instances are instances of
        * this type.
        *
        * @param type The event type.
        * @param selected Selected features.
        * @param deselected Deselected features.
        * @param mapBrowserEvent Associated
        *     {@link ol.MapBrowserEvent}.
        */
      def this(`type`: java.lang.String, selected: js.Array[openlayersLib.openlayersMod.Feature], deselected: js.Array[openlayersLib.openlayersMod.Feature], mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent) = this()
      /**
        * Deselected features array.
        * @api
        */
      var deselected: js.Array[openlayersLib.openlayersMod.Feature] = js.native
      /**
        * Associated {@link ol.MapBrowserEvent}.
        * @api
        */
      var mapBrowserEvent: openlayersLib.openlayersMod.MapBrowserEvent = js.native
      /**
        * Selected features array.
        * @api
        */
      var selected: js.Array[openlayersLib.openlayersMod.Feature] = js.native
    }
    
  }
  
  @JSName("Translate")
  @js.native
  object TranslateNs extends js.Object {
    /**
      * @classdesc
      * Events emitted by {@link ol.interaction.Translate} instances are instances of
      * this type.
      *
      * @param type Type.
      * @param features The features translated.
      * @param coordinate The event coordinate.
      */
    @js.native
    class Event protected ()
      extends openlayersLib.openlayersMod.eventsNs.Event {
      /**
        * @classdesc
        * Events emitted by {@link ol.interaction.Translate} instances are instances of
        * this type.
        *
        * @param type Type.
        * @param features The features translated.
        * @param coordinate The event coordinate.
        */
      def this(`type`: openlayersLib.openlayersMod.interactionNs.TranslateEventType, features: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature], coordinate: openlayersLib.openlayersMod.Coordinate) = this()
      /**
        * The coordinate of the drag event.
        * @const
        * @api
        */
      var coordinate: openlayersLib.openlayersMod.Coordinate = js.native
      /**
        * The features being translated.
        * @api
        */
      var features: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature] = js.native
    }
    
  }
  
  type DragAndDropEventType = java.lang.String
  type DragBoxEventType = java.lang.String
  type DrawEventType = java.lang.String
  type ExtentEventType = java.lang.String
  type TranslateEventType = java.lang.String
}

