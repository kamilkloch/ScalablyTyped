package typings
package snabbdomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hooksMod {
  type CreateHook = js.Function2[
    /* emptyVNode */ snabbdomLib.vnodeMod.VNode, 
    /* vNode */ snabbdomLib.vnodeMod.VNode, 
    js.Any
  ]
  type DestroyHook = js.Function1[/* vNode */ snabbdomLib.vnodeMod.VNode, js.Any]
  type InitHook = js.Function1[/* vNode */ snabbdomLib.vnodeMod.VNode, js.Any]
  type InsertHook = js.Function1[/* vNode */ snabbdomLib.vnodeMod.VNode, js.Any]
  type PostHook = js.Function0[js.Any]
  type PostPatchHook = js.Function2[
    /* oldVNode */ snabbdomLib.vnodeMod.VNode, 
    /* vNode */ snabbdomLib.vnodeMod.VNode, 
    js.Any
  ]
  type PreHook = js.Function0[js.Any]
  type PrePatchHook = js.Function2[
    /* oldVNode */ snabbdomLib.vnodeMod.VNode, 
    /* vNode */ snabbdomLib.vnodeMod.VNode, 
    js.Any
  ]
  type RemoveHook = js.Function2[
    /* vNode */ snabbdomLib.vnodeMod.VNode, 
    /* removeCallback */ js.Function0[scala.Unit], 
    js.Any
  ]
  type UpdateHook = js.Function2[
    /* oldVNode */ snabbdomLib.vnodeMod.VNode, 
    /* vNode */ snabbdomLib.vnodeMod.VNode, 
    js.Any
  ]
}
