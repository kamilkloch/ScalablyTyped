package typings
package reduxDashOrmLib.reduxDashOrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-orm", "ORM")
@js.native
class ORM[State /* <: ORMCommonState */] () extends js.Object {
  def this(opts: ORMOpts) = this()
  /* private */ def _attachQuerySetMethods(
    model: ScalablyTyped.runtime.Instantiable1[/* props */ ModelProps, Model[js.Object, js.Object, js.Object]]
  ): scala.Unit = js.native
  /* private */ def _setupModelPrototypes(
    models: js.Array[
      ScalablyTyped.runtime.Instantiable1[/* props */ ModelProps, Model[js.Object, js.Object, js.Object]]
    ]
  ): scala.Unit = js.native
  def generateSchemaSpec(): SchemaSpec = js.native
  def get(modelName: java.lang.String): ScalablyTyped.runtime.Instantiable1[/* props */ ModelProps, Model[js.Object, js.Object, js.Object]] = js.native
  def getDatabase(): DB = js.native
  def getEmptyState(): State = js.native
  def getModelClasses(): js.Array[
    ScalablyTyped.runtime.Instantiable1[/* props */ ModelProps, Model[js.Object, js.Object, js.Object]]
  ] = js.native
  def isFieldInstalled(modelName: java.lang.String, fieldName: java.lang.String): scala.Boolean = js.native
  def mutableSession(state: State): SessionWithModels[State] = js.native
  def register(
    model: (ScalablyTyped.runtime.Instantiable1[/* props */ ModelProps, Model[js.Object, js.Object, js.Object]])*
  ): scala.Unit = js.native
  def registerManyToManyModelsFor(
    model: ScalablyTyped.runtime.Instantiable1[/* props */ ModelProps, Model[js.Object, js.Object, js.Object]]
  ): scala.Unit = js.native
  @JSName("register")
  def register_M[M](
    model: (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(M))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentSimple(M))),List())))) */js.Any)*
  ): scala.Unit = js.native
  def session(state: State): SessionWithModels[State] = js.native
  def setFieldInstalled(modelName: java.lang.String, fieldName: java.lang.String): scala.Unit = js.native
}
