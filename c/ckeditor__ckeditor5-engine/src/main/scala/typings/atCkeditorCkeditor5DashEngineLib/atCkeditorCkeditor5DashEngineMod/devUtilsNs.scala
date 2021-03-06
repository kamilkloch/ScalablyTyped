package typings
package atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-engine", "devUtils")
@js.native
object devUtilsNs extends js.Object {
  // engine/dev-utils/enableenginedebug
  @js.native
  class DebugPlugin () extends js.Object
  
  // engine/dev-utils/operationreplayer
  @js.native
  class OperationReplayer () extends js.Object
  
  def disableEngineDebug(): scala.Unit = js.native
  def enableEngineDebug(_logger: atCkeditorCkeditor5DashEngineLib.Anon_Arg): DebugPlugin = js.native
  // engine/dev-utils/view
  def getData(view: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.View): java.lang.String = js.native
  def getData(
    view: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.View,
    options: atCkeditorCkeditor5DashEngineLib.Anon_RenderUIElements
  ): java.lang.String = js.native
  def parse(data: java.lang.String, options: atCkeditorCkeditor5DashEngineLib.Anon_LastRangeBackward): atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Text | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Element | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentFragment | js.Object = js.native
  def setData(
    view: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.View,
    data: java.lang.String,
    options: atCkeditorCkeditor5DashEngineLib.Anon_RootName
  ): scala.Unit = js.native
  def stringify(node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentFragment): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentFragment,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentSelection
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentFragment,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentSelection,
    options: atCkeditorCkeditor5DashEngineLib.Anon_IgnoreRoot
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentFragment,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Position
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentFragment,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Position,
    options: atCkeditorCkeditor5DashEngineLib.Anon_IgnoreRoot
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentFragment,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Range
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentFragment,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Range,
    options: atCkeditorCkeditor5DashEngineLib.Anon_IgnoreRoot
  ): java.lang.String = js.native
  def stringify(node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Element): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Element,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentSelection
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Element,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentSelection,
    options: atCkeditorCkeditor5DashEngineLib.Anon_IgnoreRoot
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Element,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Position
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Element,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Position,
    options: atCkeditorCkeditor5DashEngineLib.Anon_IgnoreRoot
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Element,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Range
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Element,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Range,
    options: atCkeditorCkeditor5DashEngineLib.Anon_IgnoreRoot
  ): java.lang.String = js.native
  def stringify(node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Text): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Text,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentSelection
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Text,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.DocumentSelection,
    options: atCkeditorCkeditor5DashEngineLib.Anon_IgnoreRoot
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Text,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Position
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Text,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Position,
    options: atCkeditorCkeditor5DashEngineLib.Anon_IgnoreRoot
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Text,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Range
  ): java.lang.String = js.native
  def stringify(
    node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Text,
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.viewNs.Range,
    options: atCkeditorCkeditor5DashEngineLib.Anon_IgnoreRoot
  ): java.lang.String = js.native
  // engine/dev-utils/model
  @JSName("devmodel")
  @js.native
  object devmodelNs extends js.Object {
    def getData(model: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Model): java.lang.String = js.native
    def getData(
      model: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Model,
      options: atCkeditorCkeditor5DashEngineLib.Anon_ConvertMarkers
    ): java.lang.String = js.native
    def parse(
      data: java.lang.String,
      schema: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Schema,
      batch: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Batch
    ): atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Element | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Text | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.DocumentFragment | js.Object = js.native
    def parse(
      data: java.lang.String,
      schema: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Schema,
      batch: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Batch,
      options: atCkeditorCkeditor5DashEngineLib.Anon_Context
    ): atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Element | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Text | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.DocumentFragment | js.Object = js.native
    def setData(model: java.lang.String, data: js.Object, options: atCkeditorCkeditor5DashEngineLib.Anon_BatchType): scala.Unit = js.native
    def stringify(
      node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.RootElement | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Element | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Text | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Selection | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Position | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Range
    ): java.lang.String = js.native
    def stringify(
      node: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.RootElement | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Element | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Text | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.DocumentFragment,
       // TODO optional
    selectionOrPositionOrRange: atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Selection | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Position | atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Range,
      markers: stdLib.Iterable[atCkeditorCkeditor5DashEngineLib.atCkeditorCkeditor5DashEngineMod.modelNs.Marker]
    ): java.lang.String = js.native
  }
  
}

