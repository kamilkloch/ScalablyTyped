package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Sequelize methods available only for the static class ( basically this is the constructor and some extends )
     */
@js.native
trait SequelizeStatic
  extends SequelizeStaticAndInstance
     with DataTypes
     with /**
         * Instantiate sequelize with name of database, username and password
         *
         * #### Example usage
         *
         * ```javascript
         * // without password and options
         * var sequelize = new Sequelize('database', 'username')
         *
         * // without options
         * var sequelize = new Sequelize('database', 'username', 'password')
         *
         * // without password / with blank password
         * var sequelize = new Sequelize('database', 'username', null, {})
         *
         * // with password and options
         * var sequelize = new Sequelize('my_database', 'john', 'doe', {})
         *
         * // with uri (see below)
         * var sequelize = new Sequelize('mysql://localhost:3306/database', {})
         * ```
         *
         * @param database The name of the database
         * @param username The username which is used to authenticate against the
         *     database.
         * @param password The password which is used to authenticate against the
         *     database.
         * @param options An object with options.
         */
ScalablyTyped.runtime.Instantiable4[
      /* database */ java.lang.String, 
      /* username */ java.lang.String, 
      /* password */ java.lang.String, 
      /* options */ Options, 
      Sequelize
    ]
     with /**
         * Instantiate sequelize with an URI
         * @name Sequelize
         * @constructor
         *
         * @param uri A full database URI
         * @param options See above for possible options
         */
/**
         * Instantiate sequelize with an options object which containing username, password, database
         * @name Sequelize
         * @constructor
         *
         * @param options An object with options. See above for possible options
         */
ScalablyTyped.runtime.Instantiable1[(/* uri */ java.lang.String) | (/* options */ Options), Sequelize]
     with /**
         * Instantiate sequelize with an URI
         * @name Sequelize
         * @constructor
         *
         * @param uri A full database URI
         * @param options See above for possible options
         */
ScalablyTyped.runtime.Instantiable2[
      /* database */ java.lang.String, 
      (/* username */ java.lang.String) | (/* options */ Options), 
      Sequelize
    ]
     with /**
         * Instantiate sequelize with name of database, username and password
         *
         * #### Example usage
         *
         * ```javascript
         * // without password and options
         * var sequelize = new Sequelize('database', 'username')
         *
         * // without options
         * var sequelize = new Sequelize('database', 'username', 'password')
         *
         * // without password / with blank password
         * var sequelize = new Sequelize('database', 'username', null, {})
         *
         * // with password and options
         * var sequelize = new Sequelize('my_database', 'john', 'doe', {})
         *
         * // with uri (see below)
         * var sequelize = new Sequelize('mysql://localhost:3306/database', {})
         * ```
         *
         * @param database The name of the database
         * @param username The username which is used to authenticate against the
         *     database.
         * @param password The password which is used to authenticate against the
         *     database.
         * @param options An object with options.
         */
ScalablyTyped.runtime.Instantiable3[
      /* database */ java.lang.String, 
      /* username */ java.lang.String, 
      (/* password */ java.lang.String) | (/* options */ Options), 
      Sequelize
    ] {
  /**
           * Provide access to continuation-local-storage (http://docs.sequelizejs.com/en/latest/api/sequelize/#transactionoptions-promise)
           */
  var cls: js.Any = js.native
  def useCLS(namespace: continuationDashLocalDashStorageLib.continuationDashLocalDashStorageMod.Namespace): Sequelize = js.native
}
