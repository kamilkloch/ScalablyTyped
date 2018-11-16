package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "FileSystem")
@js.native
object FileSystemNs extends js.Object {
  
  trait DownloadOptions extends js.Object {
    var headers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
    var md5: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  
  trait DownloadProgressData extends js.Object {
    var totalBytesExpectedToWrite: scala.Double
    var totalBytesWritten: scala.Double
  }
  
  
  trait DownloadResult extends js.Object {
    var headers: ScalablyTyped.runtime.StringDictionary[java.lang.String]
    var md5: js.UndefOr[expoLib.expoMod.Md5] = js.undefined
    var status: scala.Double
    var uri: java.lang.String
  }
  
  @js.native
  class DownloadResumable protected () extends js.Object {
    def this(url: java.lang.String, fileUri: java.lang.String, options: DownloadOptions) = this()
    def this(url: java.lang.String, fileUri: java.lang.String, options: DownloadOptions, callback: DownloadProgressCallback) = this()
    def this(url: java.lang.String, fileUri: java.lang.String, options: DownloadOptions, callback: DownloadProgressCallback, resumeData: java.lang.String) = this()
    def downloadAsync(): stdLib.Promise[DownloadResult] = js.native
    def pauseAsync(): stdLib.Promise[PauseResult] = js.native
    def resumeAsync(): stdLib.Promise[DownloadResult] = js.native
    def savable(): PauseResult = js.native
  }
  
  
  trait PauseResult extends js.Object {
    var fileUri: java.lang.String
    var options: expoLib.Anon_Md5Boolean
    var resumeData: java.lang.String
    var url: java.lang.String
  }
  
  val cacheDirectory: java.lang.String = js.native
  val documentDirectory: java.lang.String = js.native
  def copyAsync(options: expoLib.Anon_From): stdLib.Promise[scala.Unit] = js.native
  def createDownloadResumable(uri: java.lang.String, fileUri: java.lang.String): DownloadResumable = js.native
  def createDownloadResumable(uri: java.lang.String, fileUri: java.lang.String, options: DownloadOptions): DownloadResumable = js.native
  def createDownloadResumable(
    uri: java.lang.String,
    fileUri: java.lang.String,
    options: DownloadOptions,
    callback: js.Function2[
      /* totalBytesWritten */ scala.Double, 
      /* totalBytesExpectedToWrite */ scala.Double, 
      scala.Unit
    ]
  ): DownloadResumable = js.native
  def createDownloadResumable(
    uri: java.lang.String,
    fileUri: java.lang.String,
    options: DownloadOptions,
    callback: js.Function2[
      /* totalBytesWritten */ scala.Double, 
      /* totalBytesExpectedToWrite */ scala.Double, 
      scala.Unit
    ],
    resumeData: java.lang.String
  ): DownloadResumable = js.native
  def deleteAsync(fileUri: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deleteAsync(fileUri: java.lang.String, options: expoLib.Anon_Idempotent): stdLib.Promise[scala.Unit] = js.native
  def downloadAsync(uri: java.lang.String, fileUri: java.lang.String): stdLib.Promise[DownloadResult] = js.native
  def downloadAsync(uri: java.lang.String, fileUri: java.lang.String, options: expoLib.Anon_Md5): stdLib.Promise[DownloadResult] = js.native
  def getInfoAsync(fileUri: java.lang.String): stdLib.Promise[FileInfo] = js.native
  def getInfoAsync(fileUri: java.lang.String, options: expoLib.Anon_Size): stdLib.Promise[FileInfo] = js.native
  def makeDirectoryAsync(dirUri: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def makeDirectoryAsync(dirUri: java.lang.String, options: expoLib.Anon_Intermediates): stdLib.Promise[scala.Unit] = js.native
  def moveAsync(options: expoLib.Anon_From): stdLib.Promise[scala.Unit] = js.native
  def readAsStringAsync(fileUri: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def readDirectoryAsync(dirUri: java.lang.String): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def writeAsStringAsync(fileUri: java.lang.String, contents: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  type DownloadProgressCallback = js.Function1[/* data */ DownloadProgressData, scala.Unit]
  type FileInfo = expoLib.Anon_SizeModificationTime | expoLib.Anon_IsDirectory
}
