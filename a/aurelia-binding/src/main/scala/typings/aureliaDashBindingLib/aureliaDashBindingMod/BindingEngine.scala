package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "BindingEngine")
@js.native
class BindingEngine () extends js.Object {
  /**
     * Gets an observer for collection mutation.
     */
  def collectionObserver(collection: js.Array[_]): CollectionObserver = js.native
  /**
     * Gets an observer for collection mutation.
     */
  def collectionObserver(collection: stdLib.Map[_, _]): CollectionObserver = js.native
  /**
     * Gets an observer for collection mutation.
     */
  def collectionObserver(collection: stdLib.Set[_]): CollectionObserver = js.native
  /**
     * Creates a binding expression for the specified target property and source expression.
     * @param targetProperty The target attribute, eg "value" / "checked" / "textcontent" / "data-foo".
     * @param sourceExpression A javascript expression accessing the source property.
     * @param mode The directionality of the binding.
     * @param lookupFunctions Lookup functions for value converter and binding behavior resources.
     */
  def createBindingExpression(targetProperty: java.lang.String, sourceExpression: java.lang.String): BindingExpression = js.native
  /**
     * Creates a binding expression for the specified target property and source expression.
     * @param targetProperty The target attribute, eg "value" / "checked" / "textcontent" / "data-foo".
     * @param sourceExpression A javascript expression accessing the source property.
     * @param mode The directionality of the binding.
     * @param lookupFunctions Lookup functions for value converter and binding behavior resources.
     */
  def createBindingExpression(targetProperty: java.lang.String, sourceExpression: java.lang.String, mode: bindingMode): BindingExpression = js.native
  /**
     * Creates a binding expression for the specified target property and source expression.
     * @param targetProperty The target attribute, eg "value" / "checked" / "textcontent" / "data-foo".
     * @param sourceExpression A javascript expression accessing the source property.
     * @param mode The directionality of the binding.
     * @param lookupFunctions Lookup functions for value converter and binding behavior resources.
     */
  def createBindingExpression(
    targetProperty: java.lang.String,
    sourceExpression: java.lang.String,
    mode: bindingMode,
    lookupFunctions: LookupFunctions
  ): BindingExpression = js.native
  /**
     * Gets an observer for a javascript expression that accesses a property on the binding context.
     * @param bindingContext The binding context (view-model)
     * @param expression A javascript expression accessing the source property.
     */
  def expressionObserver(bindingContext: js.Any, expression: java.lang.String): PropertyObserver = js.native
  /**
     * Parses a string containing a javascript expression and returns a data-binding specialized AST. Memoized.
     */
  def parseExpression(expression: java.lang.String): Expression = js.native
  /**
     * Gets an observer for property changes.
     */
  def propertyObserver(obj: js.Object, propertyName: java.lang.String): PropertyObserver = js.native
  /**
     * Registers an adapter that provides an efficient property observeration strategy for
     * properties that would otherwise require dirty-checking.
     */
  def registerAdapter(adapter: ObjectObservationAdapter): scala.Unit = js.native
}
