package typings
package fpDashTsLib.libFoldableWithIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldableWithIndexComposition22C[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS2 */, GI, LG]
  extends fpDashTsLib.libFoldable2vMod.Foldable2vComposition22C[F, G, LG] {
  def foldMapWithIndex[M](M: fpDashTsLib.libMonoidMod.Monoid[M]): js.Function2[
    /* fga */ fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type2[G, LG, _]], 
    /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, M], 
    M
  ]
  def foldrWithIndex[LF, A, B](
    fga: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, A]],
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* a */ A, /* b */ B, B]
  ): B
  def reduceWithIndex[LF, A, B](
    fga: fpDashTsLib.libHKTMod.Type2[F, LF, fpDashTsLib.libHKTMod.Type2[G, LG, A]],
    b: B,
    f: js.Function3[/* i */ js.Tuple2[FI, GI], /* b */ B, /* a */ A, B]
  ): B
}

object FoldableWithIndexComposition22C {
  @scala.inline
  def apply[F /* <: fpDashTsLib.libHKTMod.URIS2 */, FI, G /* <: fpDashTsLib.libHKTMod.URIS2 */, GI, LG](
    foldMap: fpDashTsLib.libMonoidMod.Monoid[js.Any] => js.Function2[
      /* fa */ fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type2[G, LG, _]], 
      /* f */ js.Function1[/* a */ js.Any, js.Any], 
      js.Any
    ],
    foldMapWithIndex: fpDashTsLib.libMonoidMod.Monoid[js.Any] => js.Function2[
      /* fga */ fpDashTsLib.libHKTMod.Type2[F, _, fpDashTsLib.libHKTMod.Type2[G, LG, _]], 
      /* f */ js.Function2[/* i */ js.Tuple2[FI, GI], /* a */ js.Any, js.Any], 
      js.Any
    ],
    foldr: (fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    foldrWithIndex: (fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]], js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any,
    reduce: (fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]], js.Any, js.Function2[js.Any, js.Any, js.Any]) => js.Any,
    reduceWithIndex: (fpDashTsLib.libHKTMod.Type2[F, js.Any, fpDashTsLib.libHKTMod.Type2[G, LG, js.Any]], js.Any, js.Function3[/* i */ js.Tuple2[FI, GI], js.Any, js.Any, js.Any]) => js.Any
  ): FoldableWithIndexComposition22C[F, FI, G, GI, LG] = {
    val __obj = js.Dynamic.literal(foldMap = js.Any.fromFunction1(foldMap), foldMapWithIndex = js.Any.fromFunction1(foldMapWithIndex), foldr = js.Any.fromFunction3(foldr), foldrWithIndex = js.Any.fromFunction3(foldrWithIndex), reduce = js.Any.fromFunction3(reduce), reduceWithIndex = js.Any.fromFunction3(reduceWithIndex))
  
    __obj.asInstanceOf[FoldableWithIndexComposition22C[F, FI, G, GI, LG]]
  }
}

