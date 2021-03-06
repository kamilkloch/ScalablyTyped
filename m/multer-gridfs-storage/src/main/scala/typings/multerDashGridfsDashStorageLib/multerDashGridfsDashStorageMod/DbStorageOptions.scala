package typings
package multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbStorageOptions extends MulterGfsOptions {
  var db: mongooseLib.mongooseMod.Mongoose | mongooseLib.mongooseMod.Connection | mongodbLib.mongodbMod.Db | mongodbLib.mongodbMod.MongoClient | (js.Promise[
    mongooseLib.mongooseMod.Mongoose | mongooseLib.mongooseMod.Connection | mongodbLib.mongodbMod.Db | mongodbLib.mongodbMod.MongoClient
  ])
}

object DbStorageOptions {
  @scala.inline
  def apply(
    db: mongooseLib.mongooseMod.Mongoose | mongooseLib.mongooseMod.Connection | mongodbLib.mongodbMod.Db | mongodbLib.mongodbMod.MongoClient | (js.Promise[
      mongooseLib.mongooseMod.Mongoose | mongooseLib.mongooseMod.Connection | mongodbLib.mongodbMod.Db | mongodbLib.mongodbMod.MongoClient
    ]),
    file: (/* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Global.ExpressNs.Request, /* file */ multerDashGridfsDashStorageLib.multerDashGridfsDashStorageMod.Global.ExpressNs.MulterNs.File) => _ = null
  ): DbStorageOptions = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(js.Any.fromFunction2(file))
    __obj.asInstanceOf[DbStorageOptions]
  }
}

