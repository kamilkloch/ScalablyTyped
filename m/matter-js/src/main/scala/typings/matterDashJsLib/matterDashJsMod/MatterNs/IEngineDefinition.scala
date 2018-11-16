package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IEngineDefinition extends js.Object {
  /**
           * An integer `Number` that specifies the number of constraint iterations to perform each update.
           * The higher the value, the higher quality the simulation will be at the expense of performance.
           * The default value of `2` is usually very adequate.
           *
          * @property constraintIterations
          * @type number
          * @default 2
          */
  var constraintIterations: js.UndefOr[scala.Double] = js.undefined
  /**
           * A flag that specifies whether the engine should allow sleeping via the `Matter.Sleeping` module.
           * Sleeping can improve stability and performance, but often at the expense of accuracy.
           *
          * @property enableSleeping
          * @type boolean
          * @default false
          */
  var enableSleeping: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * An instance of a broadphase controller. The default value is a `Matter.Grid` instance created by `Engine.create`.
           *
          * @property broadphase
          * @type grid
          * @default a Matter.Grid instance
          */
  var grid: js.UndefOr[Grid] = js.undefined
  /**
           * An integer `Number` that specifies the number of position iterations to perform each update.
           * The higher the value, the higher quality the simulation will be at the expense of performance.
           *
          * @property positionIterations
          * @type number
          * @default 6
          */
  var positionIterations: js.UndefOr[scala.Double] = js.undefined
  /**
           * An `Object` containing properties regarding the timing systems of the engine.
          *
          * @property timing
          * @type object
          */
  var timing: js.UndefOr[IEngineTimingOptions] = js.undefined
  /**
           * An integer `Number` that specifies the number of velocity iterations to perform each update.
           * The higher the value, the higher quality the simulation will be at the expense of performance.
           *
          * @property velocityIterations
          * @type number
          * @default 4
          */
  var velocityIterations: js.UndefOr[scala.Double] = js.undefined
  /**
           * A `World` composite object that will contain all simulated bodies and constraints.
           *
          * @property world
          * @type world
          * @default a Matter.World instance
          */
  var world: js.UndefOr[World] = js.undefined
}
