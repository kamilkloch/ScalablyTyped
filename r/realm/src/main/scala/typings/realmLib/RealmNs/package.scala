package typings
package realmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object RealmNs {
  type CollectionChangeCallback[T] = js.Function2[/* collection */ Collection[T], /* change */ CollectionChangeSet, scala.Unit]
  /**
    * A function which can be called to migrate a Realm from one version of the schema to another.
    */
  type MigrationCallback = js.Function2[/* oldRealm */ realmLib.Realm, /* newRealm */ realmLib.Realm, scala.Unit]
  type ObjectChangeCallback = js.Function2[/* object */ Object, /* changes */ ObjectChangeSet, scala.Unit]
  // object props type
  type ObjectPropsType = org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * realm configuration used for overriding default configuration values.
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~Configuration }
    */
  type PartialConfiguration = stdLib.Partial[Configuration]
  // properties types
  type PropertiesTypes = org.scalablytyped.runtime.StringDictionary[PropertyType | ObjectSchemaProperty]
  /**
    * PropertyType
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~PropertyType }
    */
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - realmLib.realmLibStrings.bool
    - realmLib.realmLibStrings.int
    - realmLib.realmLibStrings.float
    - realmLib.realmLibStrings.double
    - realmLib.realmLibStrings.string
    - realmLib.realmLibStrings.data
    - realmLib.realmLibStrings.date
    - realmLib.realmLibStrings.list
    - realmLib.realmLibStrings.linkingObjects
  */
  type PropertyType = _PropertyType | java.lang.String
  /**
    * SortDescriptor
    * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Collection.html#~SortDescriptor }
    */
  type SortDescriptor = js.Array[java.lang.String] | (js.Tuple2[java.lang.String, scala.Boolean])
}
