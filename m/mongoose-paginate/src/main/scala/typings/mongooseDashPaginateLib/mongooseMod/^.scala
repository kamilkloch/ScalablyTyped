package typings
package mongooseDashPaginateLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongoose", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def model[T /* <: stdLib.Document */](name: java.lang.String): PaginateModel[T] = js.native
  def model[T /* <: stdLib.Document */](
    name: java.lang.String,
    schema: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any
  ): PaginateModel[T] = js.native
  def model[T /* <: stdLib.Document */](
    name: java.lang.String,
    schema: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: java.lang.String
  ): PaginateModel[T] = js.native
  def model[T /* <: stdLib.Document */](
    name: java.lang.String,
    schema: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: java.lang.String,
    skipInit: scala.Boolean
  ): PaginateModel[T] = js.native
  @JSName("model")
  def model_TDocumentUPaginateModelU[T /* <: stdLib.Document */, U /* <: PaginateModel[T] */](name: java.lang.String): U = js.native
  @JSName("model")
  def model_TDocumentUPaginateModelU[T /* <: stdLib.Document */, U /* <: PaginateModel[T] */](
    name: java.lang.String,
    schema: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any
  ): U = js.native
  @JSName("model")
  def model_TDocumentUPaginateModelU[T /* <: stdLib.Document */, U /* <: PaginateModel[T] */](
    name: java.lang.String,
    schema: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: java.lang.String
  ): U = js.native
  @JSName("model")
  def model_TDocumentUPaginateModelU[T /* <: stdLib.Document */, U /* <: PaginateModel[T] */](
    name: java.lang.String,
    schema: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Schema */ js.Any,
    collection: java.lang.String,
    skipInit: scala.Boolean
  ): U = js.native
}

