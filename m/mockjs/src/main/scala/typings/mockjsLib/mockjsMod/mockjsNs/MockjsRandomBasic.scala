package typings
package mockjsLib.mockjsMod.mockjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Basic
// see https://github.com/nuysoft/Mock/wiki/Basic
@js.native
trait MockjsRandomBasic extends js.Object {
  def boolean(): B = js.native
  // Random.boolean
  def boolean(min: N, max: N, current: B): B = js.native
  def character(): S = js.native
  def character(pool: S): S = js.native
  // Random.character
  @JSName("character")
  def character_lower(pool: mockjsLib.mockjsLibStrings.lower): S = js.native
  // Random.character
  @JSName("character")
  def character_number(pool: mockjsLib.mockjsLibStrings.number): S = js.native
  // Random.character
  @JSName("character")
  def character_symbol(pool: mockjsLib.mockjsLibStrings.symbol): S = js.native
  // Random.character
  @JSName("character")
  def character_upper(pool: mockjsLib.mockjsLibStrings.upper): S = js.native
  // Random.float
  def float(): N = js.native
  // Random.float
  def float(min: N): N = js.native
  // Random.float
  def float(min: N, max: N): N = js.native
  // Random.float
  def float(min: N, max: N, dmin: N): N = js.native
  // Random.float
  def float(min: N, max: N, dmin: N, dmax: N): N = js.native
  // Random.integer
  def integer(): N = js.native
  // Random.integer
  def integer(min: N): N = js.native
  // Random.integer
  def integer(min: N, max: N): N = js.native
  // Random.natural
  def natural(): N = js.native
  // Random.natural
  def natural(min: N): N = js.native
  // Random.natural
  def natural(min: N, max: N): N = js.native
  // Random.range
  def range(): N = js.native
  // Random.range
  def range(start: N): N = js.native
  // Random.range
  def range(start: N, stop: N): N = js.native
  // Random.range
  def range(start: N, stop: N, step: N): N = js.native
  // Random.string
  def string(): S = js.native
  // Random.string
  def string(pool: N): S = js.native
  // Random.string
  def string(pool: N, min: N): S = js.native
  // Random.string
  def string(pool: N, min: N, max: N): S = js.native
  // Random.string
  def string(pool: S): S = js.native
  // Random.string
  def string(pool: S, min: N): S = js.native
  // Random.string
  def string(pool: S, min: N, max: N): S = js.native
}
