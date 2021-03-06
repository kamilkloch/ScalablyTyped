package typings
package ioredisLib.ioredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commander extends js.Object {
  def createBuiltinCommand(commandName: java.lang.String): js.Object
  def defineCommand(name: java.lang.String, definition: ioredisLib.Anon_Lua): js.Any
  def getBuiltinCommands(): js.Array[java.lang.String]
  def sendCommand(): scala.Unit
}

object Commander {
  @scala.inline
  def apply(
    createBuiltinCommand: java.lang.String => js.Object,
    defineCommand: (java.lang.String, ioredisLib.Anon_Lua) => js.Any,
    getBuiltinCommands: () => js.Array[java.lang.String],
    sendCommand: () => scala.Unit
  ): Commander = {
    val __obj = js.Dynamic.literal(createBuiltinCommand = js.Any.fromFunction1(createBuiltinCommand), defineCommand = js.Any.fromFunction2(defineCommand), getBuiltinCommands = js.Any.fromFunction0(getBuiltinCommands), sendCommand = js.Any.fromFunction0(sendCommand))
  
    __obj.asInstanceOf[Commander]
  }
}

