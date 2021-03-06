package typings
package snekfetchLib.snekfetchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Snekfetch
  extends nodeLib.streamMod.Readable {
  var data: js.Any = js.native
  var request: nodeLib.httpMod.ClientRequest = js.native
  val response: SnekfetchResponse | scala.Null = js.native
  def attach(name: java.lang.String, data: java.lang.String): Snekfetch = js.native
  def attach(name: java.lang.String, data: java.lang.String, filename: java.lang.String): Snekfetch = js.native
  def attach(name: java.lang.String, data: js.Object): Snekfetch = js.native
  def attach(name: java.lang.String, data: js.Object, filename: java.lang.String): Snekfetch = js.native
  def attach(name: java.lang.String, data: nodeLib.Buffer): Snekfetch = js.native
  def attach(name: java.lang.String, data: nodeLib.Buffer, filename: java.lang.String): Snekfetch = js.native
  def `catch`(rejector: js.Function1[/* err */ stdLib.Error, _]): js.Promise[SnekfetchResponse] = js.native
  def end(): js.Promise[SnekfetchResponse] = js.native
  def end[T](
    cb: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* res */ SnekfetchResponse | stdLib.Error | scala.Null, 
      T
    ]
  ): js.Promise[T] = js.native
  def query(name: java.lang.String): Snekfetch = js.native
  def query(name: java.lang.String, value: java.lang.String): Snekfetch = js.native
  def query(name: org.scalablytyped.runtime.StringDictionary[js.Any]): Snekfetch = js.native
  def query(name: org.scalablytyped.runtime.StringDictionary[js.Any], value: java.lang.String): Snekfetch = js.native
  def send(): Snekfetch = js.native
  def send(data: java.lang.String): Snekfetch = js.native
  def send(data: js.Object): Snekfetch = js.native
  def send(data: nodeLib.Buffer): Snekfetch = js.native
  def set(name: java.lang.String): Snekfetch = js.native
  def set(name: java.lang.String, value: java.lang.String): Snekfetch = js.native
  def set(name: org.scalablytyped.runtime.StringDictionary[js.Any]): Snekfetch = js.native
  def set(name: org.scalablytyped.runtime.StringDictionary[js.Any], value: java.lang.String): Snekfetch = js.native
  def `then`(): js.Promise[SnekfetchResponse] = js.native
  def `then`[T](resolver: js.Function1[/* res */ SnekfetchResponse, T]): js.Promise[T] = js.native
  def `then`[T](
    resolver: js.Function1[/* res */ SnekfetchResponse, T],
    rejector: js.Function1[/* err */ stdLib.Error, _]
  ): js.Promise[T] = js.native
}

