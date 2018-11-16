package typings
package reactDashLoadableLib.LoadableExportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OptionsWithMap[Props, Exports /* <: ScalablyTyped.runtime.StringDictionary[js.Any] */] extends CommonOptions {
  /**
           * An object containing functions which return promises, which resolve to an object to be passed to `render` on success.
           */
  var loader: reactDashLoadableLib.reactDashLoadableLibStrings.OptionsWithMap with Exports
  /**
           * If you want to customize what gets rendered from your loader you can also pass `render`.
           *
           * Note: If you want to load multiple resources at once, you can also use `Loadable.Map`.
           *
           * ```ts
           * Loadable({
           *     // ...
           *     render(loaded, props) {
           *         const Component = loaded.default;
           *         return <Component {...props} />
           *     }
           * });
           * ```
           */
  def render(loaded: Exports, props: Props): reactLib.reactMod.ReactNs.ReactNode
}
