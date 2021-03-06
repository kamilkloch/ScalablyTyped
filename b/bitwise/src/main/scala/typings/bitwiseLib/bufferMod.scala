package typings
package bitwiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/buffer", JSImport.Namespace)
@js.native
object bufferMod extends js.Object {
  def and(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
  def and(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
  def create(
    bits: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
    ]
  ): nodeLib.Buffer = js.native
  def modify(
    buffer: nodeLib.Buffer,
    bits: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
    ]
  ): scala.Unit = js.native
  def modify(
    buffer: nodeLib.Buffer,
    bits: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
    ],
    offset: scala.Double
  ): scala.Unit = js.native
  def nand(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
  def nand(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
  def nor(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
  def nor(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
  def not(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def or(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
  def or(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
  def read(buffer: nodeLib.Buffer): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
  ] = js.native
  def read(buffer: nodeLib.Buffer, offset: scala.Double): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
  ] = js.native
  def read(buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
  ] = js.native
  def readInt(buffer: nodeLib.Buffer): scala.Double = js.native
  def readInt(buffer: nodeLib.Buffer, offset: scala.Double): scala.Double = js.native
  def readInt(buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def readUInt(buffer: nodeLib.Buffer): scala.Double = js.native
  def readUInt(buffer: nodeLib.Buffer, offset: scala.Double): scala.Double = js.native
  def readUInt(buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
  def xnor(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
  def xnor(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
  def xor(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
  def xor(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
  @js.native
  object default extends js.Object {
    def and(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
    def and(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
    def create(
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): nodeLib.Buffer = js.native
    def modify(
      buffer: nodeLib.Buffer,
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ]
    ): scala.Unit = js.native
    def modify(
      buffer: nodeLib.Buffer,
      bits: js.Array[
          /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
        ],
      offset: scala.Double
    ): scala.Unit = js.native
    def nand(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
    def nand(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
    def nor(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
    def nor(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
    def not(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
    def or(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
    def or(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
    def read(buffer: nodeLib.Buffer): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def read(buffer: nodeLib.Buffer, offset: scala.Double): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def read(buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): js.Array[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify imported_bitwise/types.Bit */ _
      ] = js.native
    def readInt(buffer: nodeLib.Buffer): scala.Double = js.native
    def readInt(buffer: nodeLib.Buffer, offset: scala.Double): scala.Double = js.native
    def readInt(buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
    def readUInt(buffer: nodeLib.Buffer): scala.Double = js.native
    def readUInt(buffer: nodeLib.Buffer, offset: scala.Double): scala.Double = js.native
    def readUInt(buffer: nodeLib.Buffer, offset: scala.Double, length: scala.Double): scala.Double = js.native
    def xnor(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
    def xnor(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
    def xor(a: nodeLib.Buffer, b: nodeLib.Buffer): nodeLib.Buffer = js.native
    def xor(a: nodeLib.Buffer, b: nodeLib.Buffer, isLooping: scala.Boolean): nodeLib.Buffer = js.native
  }
  
}

