package typings
package fpDashTsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fp-ts/lib/Set", JSImport.Namespace)
@js.native
object libSetMod extends js.Object {
  val chain: js.Function1[
    /* bset */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function2[
      /* x */ stdLib.Set[js.Any], 
      /* f */ js.Function1[/* x */ js.Any, stdLib.Set[js.Any]], 
      stdLib.Set[js.Any]
    ]
  ] = js.native
  val difference: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function2[/* x */ stdLib.Set[js.Any], /* y */ stdLib.Set[js.Any], stdLib.Set[js.Any]]
  ] = js.native
  val every: js.Function2[
    /* x */ stdLib.Set[js.Any], 
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    scala.Boolean
  ] = js.native
  val filter: js.Function2[
    /* x */ stdLib.Set[js.Any], 
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    stdLib.Set[js.Any]
  ] = js.native
  val fromArray: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function1[/* as */ fpDashTsLib.libArrayMod.Global.Array[js.Any], stdLib.Set[js.Any]]
  ] = js.native
  val getIntersectionSemigroup: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSemigroupMod.Semigroup[stdLib.Set[js.Any]]
  ] = js.native
  val getSetoid: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libSetoidMod.Setoid[stdLib.Set[js.Any]]
  ] = js.native
  val getUnionMonoid: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    fpDashTsLib.libMonoidMod.Monoid[stdLib.Set[js.Any]]
  ] = js.native
  val insert: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function2[/* a */ js.Any, /* x */ stdLib.Set[js.Any], stdLib.Set[js.Any]]
  ] = js.native
  val intersection: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function2[/* x */ stdLib.Set[js.Any], /* y */ stdLib.Set[js.Any], stdLib.Set[js.Any]]
  ] = js.native
  val map: js.Function1[
    /* bset */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function2[
      /* x */ stdLib.Set[js.Any], 
      /* f */ js.Function1[/* x */ js.Any, js.Any], 
      stdLib.Set[js.Any]
    ]
  ] = js.native
  val member: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function1[/* x */ stdLib.Set[js.Any], js.Function1[/* a */ js.Any, scala.Boolean]]
  ] = js.native
  val partition: js.Function2[
    /* x */ stdLib.Set[js.Any], 
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    fpDashTsLib.libCompactableMod.Separated[stdLib.Set[js.Any], stdLib.Set[js.Any]]
  ] = js.native
  val partitionMap: js.Function2[
    /* SL */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    /* SR */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function2[
      /* x */ stdLib.Set[js.Any], 
      /* f */ js.Function1[/* a */ js.Any, fpDashTsLib.libEitherMod.Either[js.Any, js.Any]], 
      fpDashTsLib.libCompactableMod.Separated[stdLib.Set[js.Any], stdLib.Set[js.Any]]
    ]
  ] = js.native
  val reduce: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    js.Function3[
      /* fa */ stdLib.Set[js.Any], 
      /* b */ js.Any, 
      /* f */ js.Function2[/* b */ js.Any, /* a */ js.Any, js.Any], 
      js.Any
    ]
  ] = js.native
  val remove: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function2[/* a */ js.Any, /* x */ stdLib.Set[js.Any], stdLib.Set[js.Any]]
  ] = js.native
  val singleton: js.Function1[/* a */ js.Any, stdLib.Set[js.Any]] = js.native
  val some: js.Function2[
    /* x */ stdLib.Set[js.Any], 
    /* predicate */ fpDashTsLib.libFunctionMod.Predicate[js.Any], 
    scala.Boolean
  ] = js.native
  val subset: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function2[/* x */ stdLib.Set[js.Any], /* y */ stdLib.Set[js.Any], scala.Boolean]
  ] = js.native
  val toArray: js.Function1[
    /* O */ fpDashTsLib.libOrdMod.Ord[js.Any], 
    js.Function1[/* x */ stdLib.Set[js.Any], fpDashTsLib.libArrayMod.Global.Array[js.Any]]
  ] = js.native
  val union: js.Function1[
    /* S */ fpDashTsLib.libSetoidMod.Setoid[js.Any], 
    js.Function2[/* x */ stdLib.Set[js.Any], /* y */ stdLib.Set[js.Any], stdLib.Set[js.Any]]
  ] = js.native
}
