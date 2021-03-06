package typings
package s3DashUploaderLib.s3DashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Upload extends js.Object {
  def upload(src: java.lang.String): scala.Unit = js.native
  def upload(src: java.lang.String, opts: S3UploaderOptions): scala.Unit = js.native
  def upload(
    src: java.lang.String,
    opts: S3UploaderOptions,
    cb: js.Function3[/* err */ java.lang.String, /* images */ js.Array[image], /* meta */ Meta, scala.Unit]
  ): scala.Unit = js.native
}

