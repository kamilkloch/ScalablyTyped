package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerNewProps extends NodeNewProps {
  /**
    * Contains the container's children.
    */
  var nodes: js.UndefOr[js.Array[ChildNode]] = js.undefined
  @JSName("raws")
  var raws_ContainerNewProps: js.UndefOr[ContainerRaws] = js.undefined
}

object ContainerNewProps {
  @scala.inline
  def apply(nodes: js.Array[ChildNode] = null, raws: ContainerRaws = null, source: NodeSource = null): ContainerNewProps = {
    val __obj = js.Dynamic.literal()
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (raws != null) __obj.updateDynamic("raws")(raws)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[ContainerNewProps]
  }
}

