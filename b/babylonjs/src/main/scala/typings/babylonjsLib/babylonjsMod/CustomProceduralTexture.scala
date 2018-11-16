package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
     * Custom Procedural textures are the easiest way to create your own procedural in your application.
     * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures#creating-custom-procedural-textures
     */
@JSImport("babylonjs", "CustomProceduralTexture")
@js.native
class CustomProceduralTexture protected ()
  extends babylonjsLib.BABYLONNs.CustomProceduralTexture {
  /**
           * Instantiates a new Custom Procedural Texture.
           * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
           * Custom Procedural textures are the easiest way to create your own procedural in your application.
           * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures#creating-custom-procedural-textures
           * @param name Define the name of the texture
           * @param texturePath Define the folder path containing all the cutom texture related files (config, shaders...)
           * @param size Define the size of the texture to create
           * @param scene Define the scene the texture belongs to
           * @param fallbackTexture Define a fallback texture in case there were issues to create the custom texture
           * @param generateMipMaps Define if the texture should creates mip maps or not
           */
  def this(name: java.lang.String, texturePath: java.lang.String, size: scala.Double, scene: babylonjsLib.BABYLONNs.Scene) = this()
  /**
           * Instantiates a new Custom Procedural Texture.
           * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
           * Custom Procedural textures are the easiest way to create your own procedural in your application.
           * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures#creating-custom-procedural-textures
           * @param name Define the name of the texture
           * @param texturePath Define the folder path containing all the cutom texture related files (config, shaders...)
           * @param size Define the size of the texture to create
           * @param scene Define the scene the texture belongs to
           * @param fallbackTexture Define a fallback texture in case there were issues to create the custom texture
           * @param generateMipMaps Define if the texture should creates mip maps or not
           */
  def this(name: java.lang.String, texturePath: java.lang.String, size: scala.Double, scene: babylonjsLib.BABYLONNs.Scene, fallbackTexture: babylonjsLib.BABYLONNs.Texture) = this()
  /**
           * Instantiates a new Custom Procedural Texture.
           * Procedural texturing is a way to programmatically create a texture. There are 2 types of procedural textures: code-only, and code that references some classic 2D images, sometimes called 'refMaps' or 'sampler' images.
           * Custom Procedural textures are the easiest way to create your own procedural in your application.
           * @see http://doc.babylonjs.com/how_to/how_to_use_procedural_textures#creating-custom-procedural-textures
           * @param name Define the name of the texture
           * @param texturePath Define the folder path containing all the cutom texture related files (config, shaders...)
           * @param size Define the size of the texture to create
           * @param scene Define the scene the texture belongs to
           * @param fallbackTexture Define a fallback texture in case there were issues to create the custom texture
           * @param generateMipMaps Define if the texture should creates mip maps or not
           */
  def this(name: java.lang.String, texturePath: java.lang.String, size: scala.Double, scene: babylonjsLib.BABYLONNs.Scene, fallbackTexture: babylonjsLib.BABYLONNs.Texture, generateMipMaps: scala.Boolean) = this()
}
