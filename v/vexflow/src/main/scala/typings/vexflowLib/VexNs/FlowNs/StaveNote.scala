package typings
package vexflowLib.VexNs.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.StaveNote")
@js.native
class StaveNote protected () extends StemmableNote {
  def this(note_struct: vexflowLib.Anon_AutostemClef) = this()
  var x_shift: scala.Double = js.native
  def addAccidental(index: scala.Double, accidental: Accidental): StaveNote = js.native
  def addAnnotation(index: scala.Double, annotation: Annotation): StaveNote = js.native
  def addArticulation(index: scala.Double, articulation: Articulation): StaveNote = js.native
  def addDot(index: scala.Double): StaveNote = js.native
  def addDotToAll(): StaveNote = js.native
  //TODO: vexflow actualy managed to have Note use modifier, index and stavenote index,modifier. To use the function in
  // Typescript we need to allow both. The name is the correct type :(
  def addModifier(index: js.Any): Note = js.native
  def addModifier(index: js.Any, modifier: js.Any): Note = js.native
  def autoStem(): scala.Unit = js.native
   //inconsistent type: void -> StaveNote
  def buildNoteHeads(): scala.Unit = js.native
  @JSName("buildStem")
  def buildStem_Unit(): scala.Unit = js.native
  def calcExtraPx(): scala.Unit = js.native
  def calculateKeyProps(): scala.Unit = js.native
  def draw(): scala.Unit = js.native
  def drawFlag(): scala.Unit = js.native
  def drawLedgerLines(): scala.Unit = js.native
  def drawModifiers(): scala.Unit = js.native
  def drawNoteHeads(): scala.Unit = js.native
  def getAccidentals(): js.Array[Accidental] = js.native
  @JSName("getDots")
  def getDots_Double(): scala.Double = js.native
  def getKeyLine(index: scala.Double): scala.Double = js.native
  def getKeyProps(): js.Array[vexflowLib.Anon_Accidental] = js.native
  def getKeys(): js.Array[java.lang.String] = js.native
  def getModifierStartXY(position: vexflowLib.VexNs.FlowNs.ModifierNs.Position, index: scala.Double): vexflowLib.Anon_X = js.native
  def getNoteHeadBeginX(): scala.Double = js.native
  def getNoteHeadBounds(): vexflowLib.Anon_Highestline = js.native
  def getNoteHeadEndX(): scala.Double = js.native
  def getTieLeftX(): scala.Double = js.native
  def getTieRightX(): scala.Double = js.native
  def getVoiceShiftWidth(): scala.Double = js.native
  def isChord(): scala.Boolean = js.native
  def isDisplaced(): scala.Boolean = js.native
  def setKeyLine(index: scala.Double, line: scala.Double): StaveNote = js.native
  def setKeyStyle(index: scala.Double, style: vexflowLib.Anon_FillStyle): StaveNote = js.native
  def setNoteDisplaced(displaced: scala.Boolean): StaveNote = js.native
  @JSName("setStave")
  def setStave_StaveNote(stave: Stave): StaveNote = js.native
   // inconsistent type: void -> StaveNote
  def setStemStyle(style: vexflowLib.Anon_FillStyle): scala.Unit = js.native
  def setStyle(style: vexflowLib.Anon_FillStyle): scala.Unit = js.native
}

/* static members */
@JSGlobal("Vex.Flow.StaveNote")
@js.native
object StaveNote extends js.Object {
  var DEBUG: scala.Boolean = js.native
  def format(notes: js.Array[vexflowLib.VexNs.FlowNs.StaveNote], state: vexflowLib.Anon_Leftshift): scala.Boolean = js.native
  def formatByY(notes: js.Array[vexflowLib.VexNs.FlowNs.StaveNote], state: vexflowLib.Anon_Leftshift): scala.Unit = js.native
  def postFormat(notes: js.Array[vexflowLib.VexNs.FlowNs.StaveNote]): scala.Boolean = js.native
}

