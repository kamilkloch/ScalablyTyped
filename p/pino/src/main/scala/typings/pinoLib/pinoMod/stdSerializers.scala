package typings
package pinoLib.pinoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functions for serializing objects common to many projects.
  */
@JSImport("pino", "stdSerializers")
@js.native
object stdSerializers extends js.Object {
  /**
    * Serializes an Error object.
    */
  def err(err: stdLib.Error): pinoLib.Anon_Key = js.native
  /**
    * Generates a JSONifiable object from the HTTP `request` object passed to the `createServer` callback of Node's HTTP server.
    */
  def req(req: nodeLib.httpMod.IncomingMessage): pinoLib.Anon_Headers = js.native
  /**
    * Generates a JSONifiable object from the HTTP `response` object passed to the `createServer` callback of Node's HTTP server.
    */
  def res(res: nodeLib.httpMod.ServerResponse): pinoLib.Anon_Header = js.native
}

