package typings
package pDashWaterfallLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  def apply(tasks: stdLib.Iterable[pDashWaterfallLib.pDashWaterfallMod.Task[_, _]]): js.Promise[_] = js.native
  def apply(tasks: stdLib.Iterable[pDashWaterfallLib.pDashWaterfallMod.Task[_, _]], initialValue: js.Any): js.Promise[_] = js.native
  /**
  	Run promise-returning & async functions in series, each passing its result to the next.
  	@param tasks - Functions are expected to return a value. If a `Promise` is returned, it's awaited before continuing with the next task.
  	@param initialValue - Value to use as `previousValue` in the first task.
  	@returns Resolves when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is the value returned from the last task.
  	@example
  	```
  	import pWaterfall = require('p-waterfall');
  	(async () => {
  		const tasks = [
  			initialValue => getEmoji(initialValue),
  			previousValue => `I ❤️ ${previousValue}`
  		];
  		console.log(await pWaterfall(tasks, 'unicorn'));
  		//=> 'I ❤️ 🦄'
  	})();
  	```
  	*/
  def apply[ReturnType](tasks: js.Array[pDashWaterfallLib.pDashWaterfallMod.InitialTask[ReturnType]]): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ReturnType](
    tasks: js.Array[pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ReturnType]],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ReturnType](
    tasks: js.Tuple2[
      pDashWaterfallLib.pDashWaterfallMod.InitialTask[ValueType1], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ReturnType]
    ]
  ): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ValueType2, ReturnType](
    tasks: js.Tuple2[
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ValueType2], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType2, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ValueType2, ReturnType](
    tasks: js.Tuple3[
      pDashWaterfallLib.pDashWaterfallMod.InitialTask[ValueType1], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ValueType2], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType2, ReturnType]
    ]
  ): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ValueType2, ValueType3, ReturnType](
    tasks: js.Tuple3[
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ValueType2], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType2, ValueType3], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType3, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ValueType2, ValueType3, ReturnType](
    tasks: js.Tuple4[
      pDashWaterfallLib.pDashWaterfallMod.InitialTask[ValueType1], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ValueType2], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType2, ValueType3], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType3, ReturnType]
    ]
  ): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ValueType2, ValueType3, ValueType4, ReturnType](
    tasks: js.Tuple4[
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ValueType2], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType2, ValueType3], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType3, ValueType4], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType4, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ValueType2, ValueType3, ValueType4, ReturnType](
    tasks: js.Tuple5[
      pDashWaterfallLib.pDashWaterfallMod.InitialTask[ValueType1], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ValueType2], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType2, ValueType3], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType3, ValueType4], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType4, ReturnType]
    ]
  ): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ReturnType](
    tasks: js.Tuple5[
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ValueType2], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType2, ValueType3], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType3, ValueType4], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType4, ValueType5], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType5, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ReturnType](
    tasks: js.Tuple6[
      pDashWaterfallLib.pDashWaterfallMod.InitialTask[ValueType1], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ValueType2], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType2, ValueType3], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType3, ValueType4], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType4, ValueType5], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType5, ReturnType]
    ]
  ): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ReturnType](
    tasks: js.Tuple6[
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ValueType2], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType2, ValueType3], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType3, ValueType4], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType4, ValueType5], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType5, ValueType6], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType6, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ReturnType](
    tasks: js.Tuple7[
      pDashWaterfallLib.pDashWaterfallMod.InitialTask[ValueType1], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ValueType2], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType2, ValueType3], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType3, ValueType4], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType4, ValueType5], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType5, ValueType6], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType6, ReturnType]
    ]
  ): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ReturnType](
    tasks: js.Tuple7[
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ValueType2], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType2, ValueType3], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType3, ValueType4], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType4, ValueType5], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType5, ValueType6], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType6, ValueType7], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType7, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ReturnType](
    tasks: js.Tuple8[
      pDashWaterfallLib.pDashWaterfallMod.InitialTask[ValueType1], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ValueType2], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType2, ValueType3], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType3, ValueType4], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType4, ValueType5], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType5, ValueType6], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType6, ValueType7], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType7, ReturnType]
    ]
  ): js.Promise[ReturnType] = js.native
  def apply[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8, ReturnType](
    tasks: js.Tuple8[
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType1, ValueType2], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType2, ValueType3], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType3, ValueType4], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType4, ValueType5], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType5, ValueType6], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType6, ValueType7], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType7, ValueType8], 
      pDashWaterfallLib.pDashWaterfallMod.Task[ValueType8, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = js.native
}

