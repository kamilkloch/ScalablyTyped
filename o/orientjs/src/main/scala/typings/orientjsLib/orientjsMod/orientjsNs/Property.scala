package typings
package orientjsLib.orientjsMod.orientjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Property extends js.Object {
  var `class`: js.UndefOr[Class] = js.native
  var collate: js.UndefOr[java.lang.String] = js.native
  var custom: js.UndefOr[orientjsLib.Anon_Fields] = js.native
  var linkedClass: js.UndefOr[java.lang.String] = js.native
  var linkedType: js.UndefOr[PropertyType] = js.native
  var mandatory: js.UndefOr[scala.Boolean] = js.native
  var max: js.UndefOr[scala.Double] = js.native
  var min: js.UndefOr[scala.Double] = js.native
  var name: js.UndefOr[java.lang.String] = js.native
  var notNull: js.UndefOr[scala.Boolean] = js.native
  var originalName: js.UndefOr[java.lang.String] = js.native
  var readonly: js.UndefOr[scala.Boolean] = js.native
  var regexp: js.UndefOr[stdLib.RegExp | java.lang.String] = js.native
  var `type`: js.UndefOr[PropertyType] = js.native
  def alter(name: java.lang.String): bluebirdLib.bluebirdMod.namespaced[Class] = js.native
  def alter(name: java.lang.String, setting: js.Any): bluebirdLib.bluebirdMod.namespaced[Class] = js.native
  def configure(): scala.Unit = js.native
  def configure(config: js.Any): scala.Unit = js.native
  /**
           * Create a new property.
           *
           * @param  config The property name or configuration.
           * @param   reload      Whether to reload the property, default to true.
           * @promise {Object}              The created property.
           */
  def create(): bluebirdLib.bluebirdMod.namespaced[Property] = js.native
  /**
           * Create a new property.
           *
           * @param  config The property name or configuration.
           * @param   reload      Whether to reload the property, default to true.
           * @promise {Object}              The created property.
           */
  def create(config: java.lang.String): bluebirdLib.bluebirdMod.namespaced[Property] = js.native
  /**
           * Create a new property.
           *
           * @param  config The property name or configuration.
           * @param   reload      Whether to reload the property, default to true.
           * @promise {Object}              The created property.
           */
  def create(config: java.lang.String, reload: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[Property] = js.native
  def create(config: js.Array[PropertyCreateConfig]): bluebirdLib.bluebirdMod.namespaced[js.Array[Property]] = js.native
  def create(config: js.Array[PropertyCreateConfig], reload: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[js.Array[Property]] = js.native
  /**
           * Create a new property.
           *
           * @param  config The property name or configuration.
           * @param   reload      Whether to reload the property, default to true.
           * @promise {Object}              The created property.
           */
  def create(config: PropertyCreateConfig): bluebirdLib.bluebirdMod.namespaced[Property] = js.native
  /**
           * Create a new property.
           *
           * @param  config The property name or configuration.
           * @param   reload      Whether to reload the property, default to true.
           * @promise {Object}              The created property.
           */
  def create(config: PropertyCreateConfig, reload: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[Property] = js.native
  def drop(name: java.lang.String): bluebirdLib.bluebirdMod.namespaced[Class] = js.native
  def drop(name: java.lang.String, config: orientjsLib.Anon_Ifexist): bluebirdLib.bluebirdMod.namespaced[Class] = js.native
  /**
           * Get the property with the given name.
           *
           * @param   name   The property to get.
           * @promise {Object|null}   The retrieved property.
           */
  def get(name: java.lang.String): bluebirdLib.bluebirdMod.namespaced[Property] = js.native
  def list(): bluebirdLib.bluebirdMod.namespaced[js.Array[Property]] = js.native
  def reload(): bluebirdLib.bluebirdMod.namespaced[Property] = js.native
  def rename(oldName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[Property] = js.native
  def rename(oldName: java.lang.String, newName: java.lang.String): bluebirdLib.bluebirdMod.namespaced[Property] = js.native
  /**
           * Update the given property.
           *
           * @param    property The property settings.
           * @param   reload   Whether to reload the property, default to true.
           * @promise {Object}           The updated property.
           */
  def update(config: PropertyUpdateConfig): bluebirdLib.bluebirdMod.namespaced[Property] = js.native
  /**
           * Update the given property.
           *
           * @param    property The property settings.
           * @param   reload   Whether to reload the property, default to true.
           * @promise {Object}           The updated property.
           */
  def update(config: PropertyUpdateConfig, reload: scala.Boolean): bluebirdLib.bluebirdMod.namespaced[Property] = js.native
}
