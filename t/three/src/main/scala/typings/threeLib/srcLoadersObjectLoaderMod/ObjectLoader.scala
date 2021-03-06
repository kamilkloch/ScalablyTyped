package typings
package threeLib.srcLoadersObjectLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/loaders/ObjectLoader", "ObjectLoader")
@js.native
class ObjectLoader () extends js.Object {
  def this(manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager) = this()
  var crossOrigin: java.lang.String = js.native
  var manager: threeLib.srcLoadersLoadingManagerMod.LoadingManager = js.native
  var texturePass: java.lang.String = js.native
  def load(url: java.lang.String): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* object */ threeLib.srcCoreObject3DMod.Object3D, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* object */ threeLib.srcCoreObject3DMod.Object3D, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit]
  ): scala.Unit = js.native
  def load(
    url: java.lang.String,
    onLoad: js.Function1[/* object */ threeLib.srcCoreObject3DMod.Object3D, scala.Unit],
    onProgress: js.Function1[/* event */ stdLib.ProgressEvent, scala.Unit],
    onError: js.Function1[/* event */ stdLib.Error | stdLib.ErrorEvent, scala.Unit]
  ): scala.Unit = js.native
  def parse[T /* <: threeLib.srcCoreObject3DMod.Object3D */](json: js.Any): T = js.native
  def parse[T /* <: threeLib.srcCoreObject3DMod.Object3D */](json: js.Any, onLoad: js.Function1[/* object */ threeLib.srcCoreObject3DMod.Object3D, scala.Unit]): T = js.native
   // Array of Classes that inherits from Matrial.
  def parseAnimations(json: js.Any): js.Array[threeLib.srcAnimationAnimationClipMod.AnimationClip] = js.native
  def parseGeometries(json: js.Any): js.Array[_] = js.native
  def parseImages(json: js.Any, onLoad: js.Function0[scala.Unit]): org.scalablytyped.runtime.StringDictionary[stdLib.HTMLImageElement] = js.native
   // Array of BufferGeometry or Geometry or Geometry2.
  def parseMaterials(json: js.Any, textures: js.Array[threeLib.srcTexturesTextureMod.Texture]): js.Array[threeLib.srcMaterialsMaterialMod.Material] = js.native
  def parseObject[T /* <: threeLib.srcCoreObject3DMod.Object3D */](
    data: js.Any,
    geometries: js.Array[_],
    materials: js.Array[threeLib.srcMaterialsMaterialMod.Material]
  ): T = js.native
  def parseTextures(json: js.Any, images: js.Any): js.Array[threeLib.srcTexturesTextureMod.Texture] = js.native
  def setCrossOrigin(crossOrigin: java.lang.String): scala.Unit = js.native
  def setTexturePath(value: java.lang.String): scala.Unit = js.native
}

