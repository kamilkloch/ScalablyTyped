package typings
package vuexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesHelpersMod {
  type ActionMethod = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
  type Computed = js.Function0[js.Any]
  type CustomVue = vueLib.typesVueMod.Vue with Dictionary[_]
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type FunctionMapper[F, R] = js.Function1[
    /* map */ Dictionary[
      js.ThisFunction2[/* this */ CustomVue, /* fn */ F, /* repeated */ js.Any, js.Any]
    ], 
    Dictionary[R]
  ]
  type FunctionMapperWithNamespace[F, R] = js.Function2[
    /* namespace */ java.lang.String, 
    /* map */ Dictionary[
      js.ThisFunction2[/* this */ CustomVue, /* fn */ F, /* repeated */ js.Any, js.Any]
    ], 
    Dictionary[R]
  ]
  type MapperForState = js.Function1[
    /* map */ Dictionary[
      js.ThisFunction2[/* this */ CustomVue, /* state */ js.Any, /* getters */ js.Any, js.Any]
    ], 
    Dictionary[Computed]
  ]
  type MapperForStateWithNamespace = js.Function2[
    /* namespace */ java.lang.String, 
    /* map */ Dictionary[
      js.ThisFunction2[/* this */ CustomVue, /* state */ js.Any, /* getters */ js.Any, js.Any]
    ], 
    Dictionary[Computed]
  ]
  type MutationMethod = js.Function1[/* repeated */ js.Any, scala.Unit]
}
