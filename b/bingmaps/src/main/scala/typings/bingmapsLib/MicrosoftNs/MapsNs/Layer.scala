package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.Layer")
@js.native
/**
  * @constructor
  * @param id Unique string identifier for the layer.
  */
class Layer () extends IDataLayer {
  def this(id: java.lang.String) = this()
  /** Optional property to store any additional metadata for this layer. */
  var metadata: js.Any = js.native
  /**
    * Adds a shapes to the layer, at the specified index if specified.
    * @param primitive The shape(s) to be added to the layer.
    * @param index The index at which to insert the shape into the layer.
    */
  def add(primitive: IPrimitive): scala.Unit = js.native
  def add(primitive: IPrimitive, index: scala.Double): scala.Unit = js.native
  def add(primitive: js.Array[IPrimitive]): scala.Unit = js.native
  def add(primitive: js.Array[IPrimitive], index: scala.Double): scala.Unit = js.native
  /** Clears all data in the layer. */
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /**
    * Cleans up any resources this object is consuming
    */
  def dispose(): scala.Unit = js.native
  /**
    * Gets the id of the layer.
    * @returns The id assigned to the layer.
    */
  def getId(): java.lang.String = js.native
  /**
    * Gets an array of shapes that are in the layer. This can be used to iterate over the individual shapes.
    * @returns An array of shapes that are in the layer. 
    */
  def getPrimitives(): js.Array[IPrimitive] = js.native
  /**
    * Gets a value indicating whether the layer is visible or not.
    * @returns A boolean indicating if the layer is visible or not.
    */
  def getVisible(): scala.Boolean = js.native
  /**
    * Gets the zIndex of the layer.
    * @returns The zIndex of the layer.
    */
  def getZIndex(): scala.Double = js.native
  /**
    * Removes a primitive
    * @param primitive primitive that needs to be removed
    * @returns The primitive that needs to be removed
    */
  def remove(primitive: IPrimitive): IPrimitive = js.native
  /**
    * Removes a primitive at a specified index
    * @param index index of the primitive that needs to be removed
    * @returns The primitive that needs to be removed at this index
    */
  def removeAt(index: scala.Double): IPrimitive = js.native
  /**
    * Replaces all shapes in the layer with the new array of shapes that have been provided.
    * @param primitives The array of shapes to add to the layer.
    */
  def setPrimitives(primitives: js.Array[IPrimitive]): scala.Unit = js.native
  /**
    * Sets whether the layer is visible or not.
    * @param value A value indicating if the layer should be displayed or not.
    */
  def setVisible(value: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the zIndex of the layer.
    * @param zIndex The zIndex value to assign to the layer.
    */
  def setZIndex(zIndex: scala.Double): scala.Unit = js.native
}

