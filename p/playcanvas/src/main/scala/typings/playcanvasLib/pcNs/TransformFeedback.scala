package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @name pc.TransformFeedback
  * @class Transform feedback helper object
  * @description This object allows you to configure and use the transform feedback feature (WebGL2 only).
  *  How to use:<br>
  *  <ol>
  *  <li>First, check that you're on WebGL2, by looking at the <code>app.graphicsDevice.webgl2</code> value.</li>
  *  <li>Define the outputs in your vertex shader. The syntax is <code>out vec3 out_vertex_position</code>, note that there must be out_ in the name. You can then simply assign values to these outputs in VS. The order and size of shader outputs must match the output buffer layout.</li>
  *  <li>Create the shader using <code>pc.TransformFeedback.createShader(device, vsCode, yourShaderName)</code>.</li>
  *  <li>Create/acquire the input vertex buffer. Can be any pc.VertexBuffer, either manually created, or from a pc.Mesh.</li>
  *  <li>Create the pc.TransformFeedback object: <code>var tf = new pc.TransformFeedback(inputBuffer)</code>. This object will internally create an output buffer.</li>
  *  <li>Run the shader: <code>tf.process(shader)</code>. Shader will take the input buffer, process it and write to the output buffer, then the input/output buffers will be automatically swapped, so you'll immediately see the result.</li>
  *  </ol>
  * @example
  * // *** shader asset ***
  * attribute vec3 vertex_position;
  * attribute vec3 vertex_normal;
  * attribute vec2 vertex_texCoord0;
  * attribute vec4 vertex_tangent;
  * out vec3 out_vertex_position;
  * out vec3 out_vertex_normal;
  * out vec2 out_vertex_texCoord0;
  * out vec4 out_vertex_tangent;
  * void main(void) {
  *     // read position and normal, write new position (push away)
  *     out_vertex_position = vertex_position + vertex_normal * 0.01;
  *     // pass other attributes unchanged
  *     out_vertex_normal = vertex_normal;
  *     out_vertex_texCoord0 = vertex_texCoord0;
  *     out_vertex_tangent = vertex_tangent;
  * }
  * @example
  * // *** script asset ***
  * var TransformExample = pc.createScript('transformExample');
  *
  * // attribute that references shader asset and material
  * TransformExample.attributes.add('shaderCode', { type: 'asset', assetType: 'shader' });
  * TransformExample.attributes.add('material', { type: 'asset', assetType: 'material' });
  *
  * TransformExample.prototype.initialize = function() {
  *     var device = this.app.graphicsDevice;
  *     var mesh = pc.createTorus(device, { tubeRadius: 0.01, ringRadius: 3 });
  *     var node = new pc.GraphNode();
  *     var meshInstance = new pc.MeshInstance(node, mesh, this.material.resource);
  *     var model = new pc.Model();
  *     model.graph = node;
  *     model.meshInstances = [ meshInstance ];
  *     this.app.scene.addModel(model);
  *
  *     // if webgl2 is not supported, TF is not available
  *     if (!device.webgl2) return;
  *     var inputBuffer = mesh.vertexBuffer;
  *     this.tf = new pc.TransformFeedback(inputBuffer);
  *     this.shader = pc.TransformFeedback.createShader(device, this.shaderCode.resource, "tfMoveUp");
  * };
  *
  * TransformExample.prototype.update = function(dt) {
  *     if (!this.app.graphicsDevice.webgl2) return;
  *     this.tf.process(this.shader);
  * };
  * @param {pc.VertexBuffer} inputBuffer The input vertex buffer
  * @param {Number} [usage] The optional usage type of the output vertex buffer (see pc.BUFFER_*). pc.BUFFER_GPUDYNAMIC is recommended for continuous update, and is the default value.
  */
@JSGlobal("pc.TransformFeedback")
@js.native
class TransformFeedback protected () extends js.Object {
  def this(inputBuffer: VertexBuffer) = this()
  def this(inputBuffer: VertexBuffer, usage: scala.Double) = this()
  /**
    * @readonly
    * @name pc.TransformFeedback#inputBuffer
    * @type pc.VertexBuffer
    * @description The current input buffer
    */
  val inputBuffer: VertexBuffer = js.native
  /**
    * @readonly
    * @name pc.TransformFeedback#outputBuffer
    * @type pc.VertexBuffer
    * @description The current output buffer
    */
  val outputBuffer: VertexBuffer = js.native
  /**
    * @function
    * @name pc.TransformFeedback#destroy
    * @description Destroys the transform feedback helper object
    */
  def destroy(): scala.Unit = js.native
  /**
    * @function
    * @name pc.TransformFeedback#process
    * @description Runs the specified shader on the input buffer, writes results into the new buffer, then optionally swaps input/output.
    * @param {pc.Shader} shader A vertex shader to run. Should be created with pc.TransformFeedback.createShader.
    * @param {Boolean} [swap] Swap input/output buffer data. Useful for continuous buffer processing. Default is true.
    */
  def process(shader: Shader): scala.Unit = js.native
  def process(shader: Shader, swap: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("pc.TransformFeedback")
@js.native
object TransformFeedback extends js.Object {
  /**
    * @function
    * @name pc.TransformFeedback#createShader
    * @description Creates a transform feedback ready vertex shader from code.
    * @param {pc.GraphicsDevice} graphicsDevice The graphics device used by the renderer.
    * @param {String} vsCode Vertex shader code. Should contain output variables starting with "out_".
    * @param {String} name Unique name for caching the shader.
    * @returns {pc.Shader} A shader to use in the process() function.
    */
  def createShader(device: playcanvasLib.pcNs.GraphicsDevice, vsCode: java.lang.String, name: java.lang.String): playcanvasLib.pcNs.Shader = js.native
}

