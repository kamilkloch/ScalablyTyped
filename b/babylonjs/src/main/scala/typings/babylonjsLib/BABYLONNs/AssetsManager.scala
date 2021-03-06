package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class can be used to easily import assets into a scene
  * @see http://doc.babylonjs.com/how_to/how_to_use_assetsmanager
  */
@JSGlobal("BABYLON.AssetsManager")
@js.native
class AssetsManager protected () extends js.Object {
  /**
    * Creates a new AssetsManager
    * @param scene defines the scene to work on
    */
  def this(scene: Scene) = this()
  var _decreaseWaitingTasksCount: js.Any = js.native
  var _isLoading: js.Any = js.native
  var _runTask: js.Any = js.native
  var _scene: js.Any = js.native
  var _tasks: js.Array[AbstractAssetTask] = js.native
  var _totalTasksCount: scala.Double = js.native
  var _waitingTasksCount: scala.Double = js.native
  /**
    * Observable called when a task is done (whatever the result is)
    */
  var onProgressObservable: Observable[IAssetsProgressEvent] = js.native
  /**
    * Observable called when a task had an error
    */
  var onTaskErrorObservable: Observable[AbstractAssetTask] = js.native
  /**
    * Observable called when all tasks are processed
    */
  var onTaskSuccessObservable: Observable[AbstractAssetTask] = js.native
  /**
    * Observable called when a task is successful
    */
  var onTasksDoneObservable: Observable[js.Array[AbstractAssetTask]] = js.native
  /**
    * Gets or sets a boolean defining if the AssetsManager should use the default loading screen
    * @see http://doc.babylonjs.com/how_to/creating_a_custom_loading_screen
    */
  var useDefaultLoadingScreen: scala.Boolean = js.native
  /**
    * Add a BinaryFileAssetTask to the list of active tasks
    * @param taskName defines the name of the new task
    * @param url defines the url of the file to load
    * @returns a new BinaryFileAssetTask object
    */
  def addBinaryFileTask(taskName: java.lang.String, url: java.lang.String): BinaryFileAssetTask = js.native
  /**
    * Add a CubeTextureAssetTask to the list of active tasks
    * @param taskName defines the name of the new task
    * @param url defines the url of the file to load
    * @param extensions defines the extension to use to load the cube map (can be null)
    * @param noMipmap defines if the texture must not receive mipmaps (false by default)
    * @param files defines the list of files to load (can be null)
    * @returns a new CubeTextureAssetTask object
    */
  def addCubeTextureTask(taskName: java.lang.String, url: java.lang.String): CubeTextureAssetTask = js.native
  def addCubeTextureTask(taskName: java.lang.String, url: java.lang.String, extensions: js.Array[java.lang.String]): CubeTextureAssetTask = js.native
  def addCubeTextureTask(
    taskName: java.lang.String,
    url: java.lang.String,
    extensions: js.Array[java.lang.String],
    noMipmap: scala.Boolean
  ): CubeTextureAssetTask = js.native
  def addCubeTextureTask(
    taskName: java.lang.String,
    url: java.lang.String,
    extensions: js.Array[java.lang.String],
    noMipmap: scala.Boolean,
    files: js.Array[java.lang.String]
  ): CubeTextureAssetTask = js.native
  /**
    *
    * Add a HDRCubeTextureAssetTask to the list of active tasks
    * @param taskName defines the name of the new task
    * @param url defines the url of the file to load
    * @param size defines the size you want for the cubemap (can be null)
    * @param noMipmap defines if the texture must not receive mipmaps (false by default)
    * @param generateHarmonics defines if you want to automatically generate (true by default)
    * @param gammaSpace specifies if the texture will be use in gamma or linear space (the PBR material requires those texture in linear space, but the standard material would require them in Gamma space) (default is false)
    * @param reserved Internal use only
    * @returns a new HDRCubeTextureAssetTask object
    */
  def addHDRCubeTextureTask(taskName: java.lang.String, url: java.lang.String, size: scala.Double): HDRCubeTextureAssetTask = js.native
  def addHDRCubeTextureTask(taskName: java.lang.String, url: java.lang.String, size: scala.Double, noMipmap: scala.Boolean): HDRCubeTextureAssetTask = js.native
  def addHDRCubeTextureTask(
    taskName: java.lang.String,
    url: java.lang.String,
    size: scala.Double,
    noMipmap: scala.Boolean,
    generateHarmonics: scala.Boolean
  ): HDRCubeTextureAssetTask = js.native
  def addHDRCubeTextureTask(
    taskName: java.lang.String,
    url: java.lang.String,
    size: scala.Double,
    noMipmap: scala.Boolean,
    generateHarmonics: scala.Boolean,
    gammaSpace: scala.Boolean
  ): HDRCubeTextureAssetTask = js.native
  def addHDRCubeTextureTask(
    taskName: java.lang.String,
    url: java.lang.String,
    size: scala.Double,
    noMipmap: scala.Boolean,
    generateHarmonics: scala.Boolean,
    gammaSpace: scala.Boolean,
    reserved: scala.Boolean
  ): HDRCubeTextureAssetTask = js.native
  /**
    * Add a ImageAssetTask to the list of active tasks
    * @param taskName defines the name of the new task
    * @param url defines the url of the file to load
    * @returns a new ImageAssetTask object
    */
  def addImageTask(taskName: java.lang.String, url: java.lang.String): ImageAssetTask = js.native
  /**
    * Add a MeshAssetTask to the list of active tasks
    * @param taskName defines the name of the new task
    * @param meshesNames defines the name of meshes to load
    * @param rootUrl defines the root url to use to locate files
    * @param sceneFilename defines the filename of the scene file
    * @returns a new MeshAssetTask object
    */
  def addMeshTask(
    taskName: java.lang.String,
    meshesNames: js.Any,
    rootUrl: java.lang.String,
    sceneFilename: java.lang.String
  ): MeshAssetTask = js.native
  /**
    * Add a TextFileAssetTask to the list of active tasks
    * @param taskName defines the name of the new task
    * @param url defines the url of the file to load
    * @returns a new TextFileAssetTask object
    */
  def addTextFileTask(taskName: java.lang.String, url: java.lang.String): TextFileAssetTask = js.native
  /**
    * Add a TextureAssetTask to the list of active tasks
    * @param taskName defines the name of the new task
    * @param url defines the url of the file to load
    * @param noMipmap defines if the texture must not receive mipmaps (false by default)
    * @param invertY defines if you want to invert Y axis of the loaded texture (false by default)
    * @param samplingMode defines the sampling mode to use (BABYLON.Texture.TRILINEAR_SAMPLINGMODE by default)
    * @returns a new TextureAssetTask object
    */
  def addTextureTask(taskName: java.lang.String, url: java.lang.String): TextureAssetTask = js.native
  def addTextureTask(taskName: java.lang.String, url: java.lang.String, noMipmap: scala.Boolean): TextureAssetTask = js.native
  def addTextureTask(taskName: java.lang.String, url: java.lang.String, noMipmap: scala.Boolean, invertY: scala.Boolean): TextureAssetTask = js.native
  def addTextureTask(
    taskName: java.lang.String,
    url: java.lang.String,
    noMipmap: scala.Boolean,
    invertY: scala.Boolean,
    samplingMode: scala.Double
  ): TextureAssetTask = js.native
  /**
    * Start the loading process
    * @return the current instance of the AssetsManager
    */
  def load(): AssetsManager = js.native
  /**
    * Callback called when all tasks are processed
    */
  def onFinish(tasks: js.Array[AbstractAssetTask]): scala.Unit = js.native
  /**
    * Callback called when a task is done (whatever the result is)
    */
  def onProgress(remainingCount: scala.Double, totalCount: scala.Double, task: AbstractAssetTask): scala.Unit = js.native
  /**
    * Callback called when a task had an error
    */
  def onTaskError(task: AbstractAssetTask): scala.Unit = js.native
  /**
    * Callback called when a task is successful
    */
  def onTaskSuccess(task: AbstractAssetTask): scala.Unit = js.native
  /**
    * Remove a task from the assets manager.
    * @param task the task to remove
    */
  def removeTask(task: AbstractAssetTask): scala.Unit = js.native
  /**
    * Reset the AssetsManager and remove all tasks
    * @return the current instance of the AssetsManager
    */
  def reset(): AssetsManager = js.native
}

