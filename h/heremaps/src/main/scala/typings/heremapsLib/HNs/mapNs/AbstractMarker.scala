package typings
package heremapsLib.HNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class represents marker, which offers a means of identifying a location on the map with an icon.
  */
@JSGlobal("H.map.AbstractMarker")
@js.native
class AbstractMarker protected () extends Object {
  /**
    * Constructor
    * @param position {H.geo.IPoint} - The location of this marker
    * @param opt_options {H.map.AbstractMarker.Options=} - The values to initialize this marker
    */
  def this(position: heremapsLib.HNs.geoNs.IPoint) = this()
  def this(position: heremapsLib.HNs.geoNs.IPoint, opt_options: heremapsLib.HNs.mapNs.AbstractMarkerNs.Options) = this()
  /**
    * @property draggable
    * @description This property ensure that the marker can receive drag events.
    */
  var draggable: js.UndefOr[scala.Boolean] = js.native
  /**
    * Returns this marker's current icon.
    * @returns {!(H.map.Icon | H.map.DomIcon)}
    */
  def getIcon(): Icon | DomIcon = js.native
  /**
    * This method returns this marker's current position.
    * @returns {H.geo.Point} - current marker geo position
    */
  def getPosition(): heremapsLib.HNs.geoNs.Point = js.native
  def setIcon(icon: DomIcon): AbstractMarker = js.native
  /**
    * Sets the marker's current icon.
    * @param icon {!(H.map.Icon | H.map.DomIcon)} - The new marker icon
    * @returns {H.map.AbstractMarker} - the marker itself
    */
  def setIcon(icon: Icon): AbstractMarker = js.native
  /**
    * This method sets the marker's current position.
    * @param position {H.geo.IPoint}
    * @returns {H.map.AbstractMarker} - the marker itself
    */
  def setPosition(position: heremapsLib.HNs.geoNs.IPoint): AbstractMarker = js.native
}

