package typings
package tslintLib.tslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "Linter")
@js.native
class Linter protected ()
  extends tslintLib.libLinterMod.Linter {
  def this(options: tslintLib.libMod.ILinterOptions) = this()
  def this(options: tslintLib.libMod.ILinterOptions, program: typescriptLib.typescriptMod.tsNs.Program) = this()
}

@JSImport("tslint", "Linter")
@js.native
object Linter extends js.Object {
  var VERSION: java.lang.String = js.native
  @JSName("findConfigurationPath")
  var findConfigurationPath_Original: js.Function2[
    /* suppliedConfigFilePath */ java.lang.String, 
    /* inputFilePath */ js.UndefOr[java.lang.String], 
    js.UndefOr[java.lang.String]
  ] = js.native
  @JSName("findConfiguration")
  var findConfiguration_Original: js.Function2[
    /* configFile */ java.lang.String, 
    /* inputFilePath */ js.UndefOr[java.lang.String], 
    tslintLib.libConfigurationMod.IConfigurationLoadResult
  ] = js.native
  @JSName("getRulesDirectories")
  var getRulesDirectories_Original: js.Function2[
    /* directories */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
    /* relativeTo */ js.UndefOr[java.lang.String], 
    js.Array[java.lang.String]
  ] = js.native
  @JSName("loadConfigurationFromPath")
  var loadConfigurationFromPath_Original: js.Function2[
    /* configFilePath */ js.UndefOr[java.lang.String], 
    /* _originalFilePath */ js.UndefOr[java.lang.String], 
    tslintLib.libConfigurationMod.IConfigurationFile
  ] = js.native
  /**
       * Creates a TypeScript program object from a tsconfig.json file path and optional project directory.
       */
  def createProgram(configFile: java.lang.String): typescriptLib.typescriptMod.tsNs.Program = js.native
  /**
       * Creates a TypeScript program object from a tsconfig.json file path and optional project directory.
       */
  def createProgram(configFile: java.lang.String, projectDirectory: java.lang.String): typescriptLib.typescriptMod.tsNs.Program = js.native
  def findConfiguration(configFile: java.lang.String): tslintLib.libConfigurationMod.IConfigurationLoadResult = js.native
  def findConfiguration(configFile: java.lang.String, inputFilePath: java.lang.String): tslintLib.libConfigurationMod.IConfigurationLoadResult = js.native
  def findConfigurationPath(suppliedConfigFilePath: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def findConfigurationPath(suppliedConfigFilePath: java.lang.String, inputFilePath: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
       * Returns a list of source file names from a TypeScript program. This includes all referenced
       * files and excludes declaration (".d.ts") files.
       */
  def getFileNames(program: typescriptLib.typescriptMod.tsNs.Program): js.Array[java.lang.String] = js.native
  def getRulesDirectories(): js.Array[java.lang.String] = js.native
  def getRulesDirectories(directories: java.lang.String): js.Array[java.lang.String] = js.native
  def getRulesDirectories(directories: java.lang.String, relativeTo: java.lang.String): js.Array[java.lang.String] = js.native
  def getRulesDirectories(directories: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def getRulesDirectories(directories: js.Array[java.lang.String], relativeTo: java.lang.String): js.Array[java.lang.String] = js.native
  def loadConfigurationFromPath(): tslintLib.libConfigurationMod.IConfigurationFile = js.native
  def loadConfigurationFromPath(configFilePath: java.lang.String): tslintLib.libConfigurationMod.IConfigurationFile = js.native
  def loadConfigurationFromPath(configFilePath: java.lang.String, _originalFilePath: java.lang.String): tslintLib.libConfigurationMod.IConfigurationFile = js.native
}
