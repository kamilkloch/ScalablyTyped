package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hooks are function that are called before and after  (bulk-) creation/updating/deletion and validation.
  * Hooks can be added to you models in three ways:
  *
  * 1. By specifying them as options in `sequelize.define`
  * 2. By calling `hook()` with a string and your hook handler function
  * 3. By calling the function with the same name as the hook you want
  *
  * ```js
  * // Method 1
  * sequelize.define(name, { attributes }, {
  *   hooks: {
  *     beforeBulkCreate: function () {
  *       // can be a single function
  *     },
  *     beforeValidate: [
  *       function () {},
  *       function() {} // Or an array of several
  *     ]
  *   }
  * })
  *
  * // Method 2
  * Model.hook('afterDestroy', function () {})
  *
  * // Method 3
  * Model.afterBulkUpdate(function () {})
  * ```
  *
  * @see Sequelize.define
  */
@js.native
trait Hooks[TInstance] extends js.Object {
  def addHook(hookType: java.lang.String, fn: js.Function): Hooks[TInstance] = js.native
  /**
    * Add a hook to the model
    *
    * @param hookType
    * @param name Provide a name for the hook function. It can be used to remove the hook later or to order
    *     hooks based on some sort of priority system in the future.
    * @param fn The hook function
    *
    * @alias hook
    */
  def addHook(hookType: java.lang.String, name: java.lang.String, fn: js.Function): Hooks[TInstance] = js.native
  def afterBulkCreate(
    fn: js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * A hook that is run after creating instances in bulk
    *
    * @param name
    * @param fn A callback function that is called with instances, options
    * @name afterBulkCreate
    */
  def afterBulkCreate(
    name: java.lang.String,
    fn: js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def afterBulkDelete(fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]): scala.Unit = js.native
  def afterBulkDelete(
    name: java.lang.String,
    fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]
  ): scala.Unit = js.native
  def afterBulkDestroy(fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run after destroying instances in bulk
    *
    * @param name
    * @param fn   A callback function that is called with options
    *
    * @alias afterBulkDelete
    */
  def afterBulkDestroy(
    name: java.lang.String,
    fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]
  ): scala.Unit = js.native
  def afterBulkSync(fn: js.Function1[/* options */ SyncOptions, scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run after sequelize.sync call
    *
    * @param name
    * @param fn   A callback function that is called with options passed to sequelize.sync
    */
  def afterBulkSync(name: java.lang.String, fn: js.Function1[/* options */ SyncOptions, scala.Unit]): scala.Unit = js.native
  def afterBulkUpdate(fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run after updating instances in bulk
    *
    * @param name
    * @param fn   A callback function that is called with options
    */
  def afterBulkUpdate(
    name: java.lang.String,
    fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]
  ): scala.Unit = js.native
  def afterCreate(
    fn: js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * A hook that is run after creating a single instance
    *
    * @param name
    * @param fn A callback function that is called with attributes, options
    */
  def afterCreate(
    name: java.lang.String,
    fn: js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def afterDefine(fn: js.Function1[/* model */ Model[TInstance, _, _], scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run after a define call
    *
    * @param name
    * @param fn   A callback function that is called with factory
    */
  def afterDefine(name: java.lang.String, fn: js.Function1[/* model */ Model[TInstance, _, _], scala.Unit]): scala.Unit = js.native
  def afterDelete(
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def afterDelete(
    name: java.lang.String,
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def afterDestroy(
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * A hook that is run after destroying a single instance
    *
    * @param name
    * @param fn A callback function that is called with instance, options
    * @alias afterDelete
    */
  def afterDestroy(
    name: java.lang.String,
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def afterFind(
    fn: js.Function3[
      /* instancesOrInstance */ js.Array[TInstance] | TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * A hook that is run after a find (select) query
    *
    * @param name
    * @param fn   A callback function that is called with instance(s), options
    */
  def afterFind(
    name: java.lang.String,
    fn: js.Function3[
      /* instancesOrInstance */ js.Array[TInstance] | TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def afterInit(fn: js.Function1[/* sequelize */ Sequelize, scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run after Sequelize() call
    *
    * @param name
    * @param fn   A callback function that is called with sequelize
    */
  def afterInit(name: java.lang.String, fn: js.Function1[/* sequelize */ Sequelize, scala.Unit]): scala.Unit = js.native
  def afterSync(fn: js.Function1[/* options */ SyncOptions, scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run after Model.sync call
    *
    * @param name
    * @param fn   	A callback function that is called with options passed to Model.sync
    */
  def afterSync(name: java.lang.String, fn: js.Function1[/* options */ SyncOptions, scala.Unit]): scala.Unit = js.native
  def afterUpdate(
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * A hook that is run after updating a single instance
    *
    * @param name
    * @param fn A callback function that is called with instance, options
    */
  def afterUpdate(
    name: java.lang.String,
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def afterValidate(
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * A hook that is run after validation
    *
    * @param name
    * @param fn A callback function that is called with instance, options
    */
  def afterValidate(
    name: java.lang.String,
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def beforeBulkCreate(
    fn: js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * A hook that is run before creating instances in bulk
    *
    * @param name
    * @param fn A callback function that is called with instances, options
    */
  def beforeBulkCreate(
    name: java.lang.String,
    fn: js.Function3[
      /* instances */ js.Array[TInstance], 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def beforeBulkDelete(fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]): scala.Unit = js.native
  def beforeBulkDelete(
    name: java.lang.String,
    fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]
  ): scala.Unit = js.native
  def beforeBulkDestroy(fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run before destroying instances in bulk
    *
    * @param name
    * @param fn   A callback function that is called with options
    *
    * @alias beforeBulkDelete
    */
  def beforeBulkDestroy(
    name: java.lang.String,
    fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]
  ): scala.Unit = js.native
  def beforeBulkSync(fn: js.Function1[/* options */ SyncOptions, scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run before sequelize.sync call
    *
    * @param name
    * @param fn    A callback function that is called with options passed to sequelize.sync
    */
  def beforeBulkSync(name: java.lang.String, fn: js.Function1[/* options */ SyncOptions, scala.Unit]): scala.Unit = js.native
  def beforeBulkUpdate(fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run after updating instances in bulk
    *
    * @param name
    * @param fn   A callback function that is called with options
    */
  def beforeBulkUpdate(
    name: java.lang.String,
    fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]
  ): scala.Unit = js.native
  def beforeCreate(
    fn: js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * A hook that is run before creating a single instance
    *
    * @param name
    * @param fn A callback function that is called with attributes, options
    */
  def beforeCreate(
    name: java.lang.String,
    fn: js.Function3[
      /* attributes */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def beforeDefine(fn: js.Function2[/* attributes */ DefineAttributes, /* options */ js.Object, scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run before a define call
    *
    * @param name
    * @param fn   A callback function that is called with attributes, options
    */
  def beforeDefine(
    name: java.lang.String,
    fn: js.Function2[/* attributes */ DefineAttributes, /* options */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def beforeDelete(
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def beforeDelete(
    name: java.lang.String,
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def beforeDestroy(
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * A hook that is run before destroying a single instance
    *
    * @param name
    * @param fn A callback function that is called with instance, options
    * @alias beforeDelete
    */
  def beforeDestroy(
    name: java.lang.String,
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def beforeFind(fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run before a find (select) query
    *
    * @param name
    * @param fn   A callback function that is called with options
    */
  def beforeFind(
    name: java.lang.String,
    fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]
  ): scala.Unit = js.native
  def beforeFindAfterExpandIncludeAll(fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run before a find (select) query, after any { include: {all: ...} } options are expanded
    *
    * @param name
    * @param fn   A callback function that is called with options
    */
  def beforeFindAfterExpandIncludeAll(
    name: java.lang.String,
    fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]
  ): scala.Unit = js.native
  def beforeFindAfterOptions(fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run before a find (select) query, after all option parsing is complete
    *
    * @param name
    * @param fn   A callback function that is called with options
    */
  def beforeFindAfterOptions(
    name: java.lang.String,
    fn: js.Function2[/* options */ js.Object, /* fn */ js.UndefOr[js.Function], scala.Unit]
  ): scala.Unit = js.native
  def beforeInit(fn: js.Function2[/* config */ js.Object, /* options */ js.Object, scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run before Sequelize() call
    *
    * @param name
    * @param fn   A callback function that is called with config, options
    */
  def beforeInit(
    name: java.lang.String,
    fn: js.Function2[/* config */ js.Object, /* options */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  def beforeSync(fn: js.Function1[/* options */ SyncOptions, scala.Unit]): scala.Unit = js.native
  /**
    * A hook that is run before Model.sync call
    *
    * @param name
    * @param fn   	A callback function that is called with options passed to Model.sync
    */
  def beforeSync(name: java.lang.String, fn: js.Function1[/* options */ SyncOptions, scala.Unit]): scala.Unit = js.native
  def beforeUpdate(
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * A hook that is run before updating a single instance
    *
    * @param name
    * @param fn A callback function that is called with instance, options
    */
  def beforeUpdate(
    name: java.lang.String,
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def beforeValidate(
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * A hook that is run before validation
    *
    * @param name
    * @param fn A callback function that is called with instance, options
    */
  def beforeValidate(
    name: java.lang.String,
    fn: js.Function3[
      /* instance */ TInstance, 
      /* options */ js.Object, 
      /* fn */ js.UndefOr[js.Function], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Check whether the mode has any hooks of this type
    *
    * @param hookType
    *
    * @alias hasHooks
    */
  def hasHook(hookType: java.lang.String): scala.Boolean = js.native
  def hasHooks(hookType: java.lang.String): scala.Boolean = js.native
  def hook(hookType: java.lang.String, fn: js.Function): Hooks[TInstance] = js.native
  def hook(hookType: java.lang.String, name: java.lang.String, fn: js.Function): Hooks[TInstance] = js.native
  /**
    * Remove hook from the model
    *
    * @param hookType
    * @param name
    */
  def removeHook(hookType: java.lang.String, name: java.lang.String): Hooks[TInstance] = js.native
}

