package typings
package atAngularCoreLib.srcMetadataDiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentChildDecorator
  extends org.scalablytyped.runtime.Instantiable2[
      (/* selector */ js.Function) | (/* selector */ java.lang.String) | (/* selector */ atAngularCoreLib.srcTypeMod.Type[js.Any]), 
      /* opts */ atAngularCoreLib.Anon_Read, 
      ContentChild
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* selector */ js.Function) | (/* selector */ java.lang.String) | (/* selector */ atAngularCoreLib.srcTypeMod.Type[js.Any]), 
      ContentChild
    ] {
  /**
    * Configures a content query.
    *
    * You can use ContentChild to get the first element or the directive matching the selector from
    * the content DOM. If the content DOM changes, and a new child matches the selector,
    * the property will be updated.
    *
    * Content queries are set before the `ngAfterContentInit` callback is called.
    *
    * **Metadata Properties**:
    *
    * * **selector** - the directive type or the name used for querying.
    * * **read** - read a different token from the queried element.
    *
    * @usageNotes
    * ### Example
    *
    * {@example core/di/ts/contentChild/content_child_howto.ts region='HowTo'}
    *
    * ### Example
    *
    * {@example core/di/ts/contentChild/content_child_example.ts region='Component'}
    *
    * @Annotation
    */
  def apply(selector: atAngularCoreLib.srcTypeMod.Type[_]): js.Any = js.native
  def apply(selector: atAngularCoreLib.srcTypeMod.Type[_], opts: atAngularCoreLib.Anon_Read): js.Any = js.native
  def apply(selector: java.lang.String): js.Any = js.native
  def apply(selector: java.lang.String, opts: atAngularCoreLib.Anon_Read): js.Any = js.native
  def apply(selector: js.Function): js.Any = js.native
  def apply(selector: js.Function, opts: atAngularCoreLib.Anon_Read): js.Any = js.native
}

