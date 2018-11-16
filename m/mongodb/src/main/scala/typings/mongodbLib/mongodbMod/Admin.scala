package typings
package mongodbLib.mongodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Admin extends js.Object {
  def addUser(username: java.lang.String, password: java.lang.String): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#addUser */
  def addUser(username: java.lang.String, password: java.lang.String, callback: MongoCallback[_]): scala.Unit = js.native
  def addUser(username: java.lang.String, password: java.lang.String, options: AddUserOptions): stdLib.Promise[_] = js.native
  def addUser(
    username: java.lang.String,
    password: java.lang.String,
    options: AddUserOptions,
    callback: MongoCallback[_]
  ): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#buildInfo */
  def buildInfo(): stdLib.Promise[_] = js.native
  def buildInfo(callback: MongoCallback[_]): scala.Unit = js.native
  def command(command: js.Object): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#command */
  def command(command: js.Object, callback: MongoCallback[_]): scala.Unit = js.native
  def command(command: js.Object, options: mongodbLib.Anon_ReadPreference): stdLib.Promise[_] = js.native
  def command(command: js.Object, options: mongodbLib.Anon_ReadPreference, callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#listDatabases */
  def listDatabases(): stdLib.Promise[_] = js.native
  def listDatabases(callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#ping */
  def ping(): stdLib.Promise[_] = js.native
  def ping(callback: MongoCallback[_]): scala.Unit = js.native
  def removeUser(username: java.lang.String): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#removeUser */
  def removeUser(username: java.lang.String, callback: MongoCallback[_]): scala.Unit = js.native
  def removeUser(username: java.lang.String, options: FSyncOptions): stdLib.Promise[_] = js.native
  def removeUser(username: java.lang.String, options: FSyncOptions, callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#replSetGetStatus */
  def replSetGetStatus(): stdLib.Promise[_] = js.native
  def replSetGetStatus(callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#serverInfo */
  def serverInfo(): stdLib.Promise[_] = js.native
  def serverInfo(callback: MongoCallback[_]): scala.Unit = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#serverStatus */
  def serverStatus(): stdLib.Promise[_] = js.native
  def serverStatus(callback: MongoCallback[_]): scala.Unit = js.native
  def validateCollection(collectionNme: java.lang.String): stdLib.Promise[_] = js.native
  /** http://mongodb.github.io/node-mongodb-native/3.1/api/Admin.html#validateCollection */
  def validateCollection(collectionNme: java.lang.String, callback: MongoCallback[_]): scala.Unit = js.native
  def validateCollection(collectionNme: java.lang.String, options: js.Object): stdLib.Promise[_] = js.native
  def validateCollection(collectionNme: java.lang.String, options: js.Object, callback: MongoCallback[_]): scala.Unit = js.native
}
