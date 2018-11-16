package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mongodb", "Db")
@js.native
class Db protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(databaseName: java.lang.String, serverConfig: Mongos) = this()
  def this(databaseName: java.lang.String, serverConfig: ReplSet) = this()
  def this(databaseName: java.lang.String, serverConfig: Server) = this()
  def this(databaseName: java.lang.String, serverConfig: Mongos, options: DbCreateOptions) = this()
  def this(databaseName: java.lang.String, serverConfig: ReplSet, options: DbCreateOptions) = this()
  def this(databaseName: java.lang.String, serverConfig: Server, options: DbCreateOptions) = this()
  var bufferMaxEntries: scala.Double = js.native
  var databaseName: java.lang.String = js.native
  var native_parser: scala.Boolean = js.native
  var options: js.Any = js.native
  var serverConfig: Server | ReplSet | Mongos = js.native
  var slaveOk: scala.Boolean = js.native
  var writeConcern: js.Any = js.native
  def addUser(username: java.lang.String, password: java.lang.String): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#addUser */
  def addUser(username: java.lang.String, password: java.lang.String, callback: MongoCallback[_]): scala.Unit = js.native
  def addUser(username: java.lang.String, password: java.lang.String, options: DbAddUserOptions): stdLib.Promise[_] = js.native
  def addUser(
    username: java.lang.String,
    password: java.lang.String,
    options: DbAddUserOptions,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#admin */
  def admin(): Admin = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#collection */
  def collection[TSchema](name: java.lang.String): Collection[TSchema] = js.native
  def collection[TSchema](name: java.lang.String, callback: MongoCallback[Collection[TSchema]]): Collection[TSchema] = js.native
  def collection[TSchema](name: java.lang.String, options: DbCollectionOptions, callback: MongoCallback[Collection[TSchema]]): Collection[TSchema] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#collections */
  def collections(): stdLib.Promise[js.Array[Collection[mongodbLib.Default]]] = js.native
  def collections(callback: MongoCallback[js.Array[Collection[mongodbLib.Default]]]): scala.Unit = js.native
  def command(command: js.Object): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#command */
  def command(command: js.Object, callback: MongoCallback[_]): scala.Unit = js.native
  def command(command: js.Object, options: mongodbLib.Anon_ReadPreferenceString_114210322): stdLib.Promise[_] = js.native
  def command(
    command: js.Object,
    options: mongodbLib.Anon_ReadPreferenceString_114210322,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def createCollection[TSchema](name: java.lang.String): stdLib.Promise[Collection[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#createCollection */
  def createCollection[TSchema](name: java.lang.String, callback: MongoCallback[Collection[TSchema]]): scala.Unit = js.native
  def createCollection[TSchema](name: java.lang.String, options: CollectionCreateOptions): stdLib.Promise[Collection[TSchema]] = js.native
  def createCollection[TSchema](
    name: java.lang.String,
    options: CollectionCreateOptions,
    callback: MongoCallback[Collection[TSchema]]
  ): scala.Unit = js.native
  def createIndex(name: java.lang.String, fieldOrSpec: java.lang.String): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#createIndex */
  def createIndex(name: java.lang.String, fieldOrSpec: java.lang.String, callback: MongoCallback[_]): scala.Unit = js.native
  def createIndex(name: java.lang.String, fieldOrSpec: java.lang.String, options: IndexOptions): stdLib.Promise[_] = js.native
  def createIndex(
    name: java.lang.String,
    fieldOrSpec: java.lang.String,
    options: IndexOptions,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  def createIndex(name: java.lang.String, fieldOrSpec: js.Object): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#createIndex */
  def createIndex(name: java.lang.String, fieldOrSpec: js.Object, callback: MongoCallback[_]): scala.Unit = js.native
  def createIndex(name: java.lang.String, fieldOrSpec: js.Object, options: IndexOptions): stdLib.Promise[_] = js.native
  def createIndex(name: java.lang.String, fieldOrSpec: js.Object, options: IndexOptions, callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#dropCollection */
  def dropCollection(name: java.lang.String): stdLib.Promise[scala.Boolean] = js.native
  def dropCollection(name: java.lang.String, callback: MongoCallback[scala.Boolean]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#dropDatabase */
  def dropDatabase(): stdLib.Promise[_] = js.native
  def dropDatabase(callback: MongoCallback[_]): scala.Unit = js.native
  def executeDbAdminCommand(command: js.Object): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#executeDbAdminCommand */
  def executeDbAdminCommand(command: js.Object, callback: MongoCallback[_]): scala.Unit = js.native
  def executeDbAdminCommand(command: js.Object, options: mongodbLib.Anon_ReadPreference): stdLib.Promise[_] = js.native
  def executeDbAdminCommand(command: js.Object, options: mongodbLib.Anon_ReadPreference, callback: MongoCallback[_]): scala.Unit = js.native
  def indexInformation(name: java.lang.String): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#indexInformation */
  def indexInformation(name: java.lang.String, callback: MongoCallback[_]): scala.Unit = js.native
  def indexInformation(name: java.lang.String, options: mongodbLib.Anon_ReadPreferenceFull): stdLib.Promise[_] = js.native
  def indexInformation(name: java.lang.String, options: mongodbLib.Anon_ReadPreferenceFull, callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#listCollections */
  def listCollections(): CommandCursor = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#listCollections */
  def listCollections(filter: js.Object): CommandCursor = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#listCollections */
  def listCollections(filter: js.Object, options: mongodbLib.Anon_ReadPreferenceBatchSize): CommandCursor = js.native
  def profilingInfo(): stdLib.Promise[scala.Unit] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#profilingInfo */
  /** @deprecated Query the system.profile collection directly. */
  def profilingInfo(callback: MongoCallback[_]): scala.Unit = js.native
  def profilingInfo(options: mongodbLib.Anon_SessionClientSession_1575395223): stdLib.Promise[scala.Unit] = js.native
  def profilingInfo(options: mongodbLib.Anon_SessionClientSession_1575395223, callback: MongoCallback[scala.Unit]): scala.Unit = js.native
  def profilingLevel(): stdLib.Promise[ProfilingLevel] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#profilingLevel */
  def profilingLevel(callback: MongoCallback[ProfilingLevel]): scala.Unit = js.native
  def profilingLevel(options: mongodbLib.Anon_SessionClientSession_1575395223): stdLib.Promise[ProfilingLevel] = js.native
  def profilingLevel(options: mongodbLib.Anon_SessionClientSession_1575395223, callback: MongoCallback[ProfilingLevel]): scala.Unit = js.native
  def removeUser(username: java.lang.String): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#removeUser */
  def removeUser(username: java.lang.String, callback: MongoCallback[_]): scala.Unit = js.native
  def removeUser(username: java.lang.String, options: CommonOptions): stdLib.Promise[_] = js.native
  def removeUser(username: java.lang.String, options: CommonOptions, callback: MongoCallback[_]): scala.Unit = js.native
  def renameCollection[TSchema](fromCollection: java.lang.String, toCollection: java.lang.String): stdLib.Promise[Collection[TSchema]] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#renameCollection */
  def renameCollection[TSchema](
    fromCollection: java.lang.String,
    toCollection: java.lang.String,
    callback: MongoCallback[Collection[TSchema]]
  ): scala.Unit = js.native
  def renameCollection[TSchema](
    fromCollection: java.lang.String,
    toCollection: java.lang.String,
    options: mongodbLib.Anon_DropTargetBoolean
  ): stdLib.Promise[Collection[TSchema]] = js.native
  def renameCollection[TSchema](
    fromCollection: java.lang.String,
    toCollection: java.lang.String,
    options: mongodbLib.Anon_DropTargetBoolean,
    callback: MongoCallback[Collection[TSchema]]
  ): scala.Unit = js.native
  def setProfilingLevel(level: ProfilingLevel): stdLib.Promise[ProfilingLevel] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#setProfilingLevel */
  def setProfilingLevel(level: ProfilingLevel, callback: MongoCallback[ProfilingLevel]): scala.Unit = js.native
  def setProfilingLevel(level: ProfilingLevel, options: mongodbLib.Anon_SessionClientSession_1575395223): stdLib.Promise[ProfilingLevel] = js.native
  def setProfilingLevel(
    level: ProfilingLevel,
    options: mongodbLib.Anon_SessionClientSession_1575395223,
    callback: MongoCallback[ProfilingLevel]
  ): scala.Unit = js.native
  def stats(): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Db.html#stats */
  def stats(callback: MongoCallback[_]): scala.Unit = js.native
  def stats(options: mongodbLib.Anon_Scale): stdLib.Promise[_] = js.native
  def stats(options: mongodbLib.Anon_Scale, callback: MongoCallback[_]): scala.Unit = js.native
}
