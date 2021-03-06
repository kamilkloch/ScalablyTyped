package typings
package parcelDashBundlerLib.parcelDashBundlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParcelBundle extends js.Object {
  /**
    * A Set of all assets inside the bundle
    */
  var assets: stdLib.Set[_]
  /**
    * A Set of all child bundles
    */
  var childBundles: stdLib.Set[_]
  /**
    * The entryPoint of the bundle, used for generating the name and gathering assets.
    */
  var entryAsset: js.Any
  /**
    * The name of the bundle (generated using Asset.generateBundleName() of entryAsset)
    */
  var name: java.lang.String
  /**
    * A Map<Asset, number(line number inside the bundle)> of all the locations of the assets inside the bundle, used to generate accurate source maps
    */
  var offsets: stdLib.Map[ParcelAsset, scala.Double]
  /**
    * The parent bundle, is null in case of the entry bundleany
    */
  var parentBundle: js.UndefOr[js.Any] = js.undefined
  /**
    * A Set of all sibling bundles
    */
  var siblingBundles: stdLib.Set[_]
  /**
    * A Map<String(Type: js, css, map, ...), Bundle> of all sibling bundles
    */
  var siblingBundlesMap: stdLib.Map[java.lang.String, ParcelBundle]
  /**
    * The type of assets it contains (e.g. js, css, map, ...)
    */
  var `type`: java.lang.String
}

object ParcelBundle {
  @scala.inline
  def apply(
    assets: stdLib.Set[_],
    childBundles: stdLib.Set[_],
    entryAsset: js.Any,
    name: java.lang.String,
    offsets: stdLib.Map[ParcelAsset, scala.Double],
    siblingBundles: stdLib.Set[_],
    siblingBundlesMap: stdLib.Map[java.lang.String, ParcelBundle],
    `type`: java.lang.String,
    parentBundle: js.Any = null
  ): ParcelBundle = {
    val __obj = js.Dynamic.literal(assets = assets, childBundles = childBundles, entryAsset = entryAsset, name = name, offsets = offsets, siblingBundles = siblingBundles, siblingBundlesMap = siblingBundlesMap)
    __obj.updateDynamic("type")(`type`)
    if (parentBundle != null) __obj.updateDynamic("parentBundle")(parentBundle)
    __obj.asInstanceOf[ParcelBundle]
  }
}

