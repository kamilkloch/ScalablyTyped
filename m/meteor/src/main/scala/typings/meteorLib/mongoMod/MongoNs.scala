package typings
package meteorLib.mongoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/mongo", "Mongo")
@js.native
object MongoNs extends js.Object {
  
  trait AllowDenyOptions extends js.Object {
    var fetch: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var insert: js.UndefOr[js.Function2[/* userId */ java.lang.String, /* doc */ js.Any, scala.Boolean]] = js.undefined
    var remove: js.UndefOr[js.Function2[/* userId */ java.lang.String, /* doc */ js.Any, scala.Boolean]] = js.undefined
    var transform: js.UndefOr[js.Function] = js.undefined
    var update: js.UndefOr[
        js.Function4[
          /* userId */ java.lang.String, 
          /* doc */ js.Any, 
          /* fieldNames */ js.Array[java.lang.String], 
          /* modifier */ js.Any, 
          scala.Boolean
        ]
      ] = js.undefined
  }
  
  @js.native
  trait Collection[T] extends js.Object {
    def _dropIndex(keys: ScalablyTyped.runtime.StringDictionary[scala.Double | java.lang.String]): scala.Unit = js.native
    def _dropIndex(keys: java.lang.String): scala.Unit = js.native
    def _ensureIndex(keys: ScalablyTyped.runtime.StringDictionary[scala.Double | java.lang.String]): scala.Unit = js.native
    def _ensureIndex(
      keys: ScalablyTyped.runtime.StringDictionary[scala.Double | java.lang.String],
      options: ScalablyTyped.runtime.StringDictionary[js.Any]
    ): scala.Unit = js.native
    def _ensureIndex(keys: java.lang.String): scala.Unit = js.native
    def _ensureIndex(keys: java.lang.String, options: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
    def allow(options: meteorLib.Anon_Insert[T]): scala.Boolean = js.native
    def deny(options: meteorLib.Anon_Insert[T]): scala.Boolean = js.native
    def find(): Cursor[T] = js.native
    def find(selector: java.lang.String): Cursor[T] = js.native
    def find(selector: java.lang.String, options: meteorLib.Anon_ReactiveSkipFields): Cursor[T] = js.native
    def find(selector: ObjectID): Cursor[T] = js.native
    def find(selector: ObjectID, options: meteorLib.Anon_ReactiveSkipFields): Cursor[T] = js.native
    def find(selector: Selector[T]): Cursor[T] = js.native
    def find(selector: Selector[T], options: meteorLib.Anon_ReactiveSkipFields): Cursor[T] = js.native
    def findOne(): T = js.native
    def findOne(selector: java.lang.String): T = js.native
    def findOne(selector: java.lang.String, options: meteorLib.Anon_ReactiveSkipFieldsSort): T = js.native
    def findOne(selector: ObjectID): T = js.native
    def findOne(selector: ObjectID, options: meteorLib.Anon_ReactiveSkipFieldsSort): T = js.native
    def findOne(selector: Selector[T]): T = js.native
    def findOne(selector: Selector[T], options: meteorLib.Anon_ReactiveSkipFieldsSort): T = js.native
    def insert(doc: T): java.lang.String = js.native
    def insert(doc: T, callback: js.Function): java.lang.String = js.native
    def rawCollection(): js.Any = js.native
    def rawDatabase(): js.Any = js.native
    def remove(selector: java.lang.String): scala.Double = js.native
    def remove(selector: java.lang.String, callback: js.Function): scala.Double = js.native
    def remove(selector: ObjectID): scala.Double = js.native
    def remove(selector: ObjectID, callback: js.Function): scala.Double = js.native
    def remove(selector: Selector[T]): scala.Double = js.native
    def remove(selector: Selector[T], callback: js.Function): scala.Double = js.native
    def update(selector: java.lang.String, modifier: Modifier[T]): scala.Double = js.native
    def update(selector: java.lang.String, modifier: Modifier[T], options: meteorLib.Anon_Multi): scala.Double = js.native
    def update(
      selector: java.lang.String,
      modifier: Modifier[T],
      options: meteorLib.Anon_Multi,
      callback: js.Function
    ): scala.Double = js.native
    def update(selector: ObjectID, modifier: Modifier[T]): scala.Double = js.native
    def update(selector: ObjectID, modifier: Modifier[T], options: meteorLib.Anon_Multi): scala.Double = js.native
    def update(selector: ObjectID, modifier: Modifier[T], options: meteorLib.Anon_Multi, callback: js.Function): scala.Double = js.native
    def update(selector: Selector[T], modifier: Modifier[T]): scala.Double = js.native
    def update(selector: Selector[T], modifier: Modifier[T], options: meteorLib.Anon_Multi): scala.Double = js.native
    def update(selector: Selector[T], modifier: Modifier[T], options: meteorLib.Anon_Multi, callback: js.Function): scala.Double = js.native
    def upsert(selector: java.lang.String, modifier: Modifier[T]): meteorLib.Anon_NumberAffected = js.native
    def upsert(selector: java.lang.String, modifier: Modifier[T], options: meteorLib.Anon_MultiBoolean): meteorLib.Anon_NumberAffected = js.native
    def upsert(
      selector: java.lang.String,
      modifier: Modifier[T],
      options: meteorLib.Anon_MultiBoolean,
      callback: js.Function
    ): meteorLib.Anon_NumberAffected = js.native
    def upsert(selector: ObjectID, modifier: Modifier[T]): meteorLib.Anon_NumberAffected = js.native
    def upsert(selector: ObjectID, modifier: Modifier[T], options: meteorLib.Anon_MultiBoolean): meteorLib.Anon_NumberAffected = js.native
    def upsert(
      selector: ObjectID,
      modifier: Modifier[T],
      options: meteorLib.Anon_MultiBoolean,
      callback: js.Function
    ): meteorLib.Anon_NumberAffected = js.native
    def upsert(selector: Selector[T], modifier: Modifier[T]): meteorLib.Anon_NumberAffected = js.native
    def upsert(selector: Selector[T], modifier: Modifier[T], options: meteorLib.Anon_MultiBoolean): meteorLib.Anon_NumberAffected = js.native
    def upsert(
      selector: Selector[T],
      modifier: Modifier[T],
      options: meteorLib.Anon_MultiBoolean,
      callback: js.Function
    ): meteorLib.Anon_NumberAffected = js.native
  }
  
  @js.native
  trait CollectionStatic
    extends ScalablyTyped.runtime.Instantiable1[/* name */ java.lang.String, Collection[js.Object]]
       with ScalablyTyped.runtime.Instantiable2[
          /* name */ java.lang.String, 
          /* options */ meteorLib.Anon_Transform, 
          Collection[js.Object]
        ]
  
  @js.native
  trait Cursor[T] extends js.Object {
    def count(): scala.Double = js.native
    def count(applySkipLimit: scala.Boolean): scala.Double = js.native
    def fetch(): js.Array[T] = js.native
    def forEach(callback: js.Function3[/* doc */ T, /* index */ scala.Double, /* cursor */ Cursor[T], scala.Unit]): scala.Unit = js.native
    def forEach(
      callback: js.Function3[/* doc */ T, /* index */ scala.Double, /* cursor */ Cursor[T], scala.Unit],
      thisArg: js.Any
    ): scala.Unit = js.native
    def map[U](callback: js.Function3[/* doc */ T, /* index */ scala.Double, /* cursor */ Cursor[T], U]): js.Array[U] = js.native
    def map[U](
      callback: js.Function3[/* doc */ T, /* index */ scala.Double, /* cursor */ Cursor[T], U],
      thisArg: js.Any
    ): js.Array[U] = js.native
    def observe(callbacks: ObserveCallbacks): meteorLib.MeteorNs.LiveQueryHandle = js.native
    def observeChanges(callbacks: ObserveChangesCallbacks): meteorLib.MeteorNs.LiveQueryHandle = js.native
  }
  
  @js.native
  trait CursorStatic
    extends ScalablyTyped.runtime.Instantiable0[Cursor[js.Object]]
  
  
  trait Dictionary[T]
    extends /* key */ ScalablyTyped.runtime.StringDictionary[T]
  
  
  trait FieldExpression[T] extends js.Object {
    @JSName("$all")
    var $all: js.UndefOr[js.Array[T]] = js.undefined
    @JSName("$bitsAllClear")
    var $bitsAllClear: js.UndefOr[js.Any] = js.undefined
    @JSName("$bitsAllSet")
    var $bitsAllSet: js.UndefOr[js.Any] = js.undefined
    @JSName("$bitsAnyClear")
    var $bitsAnyClear: js.UndefOr[js.Any] = js.undefined
    @JSName("$bitsAnySet")
    var $bitsAnySet: js.UndefOr[js.Any] = js.undefined
    @JSName("$comment")
    var $comment: js.UndefOr[java.lang.String] = js.undefined
    @JSName("$elemMatch")
    var $elemMatch: js.UndefOr[Query[T]] = js.undefined
    @JSName("$eq")
    var $eq: js.UndefOr[T] = js.undefined
    @JSName("$exists")
    var $exists: js.UndefOr[scala.Boolean] = js.undefined
    @JSName("$expr")
    var $expr: js.UndefOr[js.Object] = js.undefined
    @JSName("$geoIntersects")
    var $geoIntersects: js.UndefOr[js.Any] = js.undefined
    @JSName("$geoWithin")
    var $geoWithin: js.UndefOr[js.Any] = js.undefined
    @JSName("$gt")
    var $gt: js.UndefOr[T] = js.undefined
    @JSName("$gte")
    var $gte: js.UndefOr[T] = js.undefined
    @JSName("$in")
    var $in: js.UndefOr[js.Array[T]] = js.undefined
    @JSName("$jsonSchema")
    var $jsonSchema: js.UndefOr[js.Any] = js.undefined
    @JSName("$lt")
    var $lt: js.UndefOr[T] = js.undefined
    @JSName("$lte")
    var $lte: js.UndefOr[T] = js.undefined
    @JSName("$mod")
    var $mod: js.UndefOr[js.Array[scala.Double]] = js.undefined
    @JSName("$ne")
    var $ne: js.UndefOr[T] = js.undefined
    @JSName("$near")
    var $near: js.UndefOr[js.Any] = js.undefined
    @JSName("$nearSphere")
    var $nearSphere: js.UndefOr[js.Any] = js.undefined
    @JSName("$nin")
    var $nin: js.UndefOr[js.Array[T]] = js.undefined
    @JSName("$not")
    var $not: js.UndefOr[js.Object] = js.undefined
    @JSName("$options")
    var $options: js.UndefOr[java.lang.String] = js.undefined
    @JSName("$regex")
    var $regex: js.UndefOr[stdLib.RegExp | java.lang.String] = js.undefined
    @JSName("$size")
    var $size: js.UndefOr[scala.Double] = js.undefined
    @JSName("$text")
    var $text: js.UndefOr[meteorLib.Anon_Search] = js.undefined
    @JSName("$type")
    var $type: js.UndefOr[js.Array[BsonType] | BsonType] = js.undefined
    @JSName("$where")
    var $where: js.UndefOr[java.lang.String | js.Function] = js.undefined
  }
  
  
  trait FieldSpecifier
    extends /* id */ ScalablyTyped.runtime.StringDictionary[stdLib.Number]
  
  
  trait ObjectID extends js.Object {
    def equals(otherID: ObjectID): scala.Boolean
    def toHexString(): java.lang.String
  }
  
  @js.native
  trait ObjectIDStatic
    extends ScalablyTyped.runtime.Instantiable0[ObjectID]
       with ScalablyTyped.runtime.Instantiable1[/* hexString */ java.lang.String, ObjectID]
  
  
  trait ObserveCallbacks extends js.Object {
    var added: js.UndefOr[js.Function1[/* document */ js.Object, scala.Unit]] = js.undefined
    var addedAt: js.UndefOr[
        js.Function3[
          /* document */ js.Object, 
          /* atIndex */ scala.Double, 
          /* before */ js.Object, 
          scala.Unit
        ]
      ] = js.undefined
    var changed: js.UndefOr[
        js.Function2[/* newDocument */ js.Object, /* oldDocument */ js.Object, scala.Unit]
      ] = js.undefined
    var changedAt: js.UndefOr[
        js.Function3[
          /* newDocument */ js.Object, 
          /* oldDocument */ js.Object, 
          /* indexAt */ scala.Double, 
          scala.Unit
        ]
      ] = js.undefined
    var movedTo: js.UndefOr[
        js.Function4[
          /* document */ js.Object, 
          /* fromIndex */ scala.Double, 
          /* toIndex */ scala.Double, 
          /* before */ js.Object, 
          scala.Unit
        ]
      ] = js.undefined
    var removed: js.UndefOr[js.Function1[/* oldDocument */ js.Object, scala.Unit]] = js.undefined
    var removedAt: js.UndefOr[
        js.Function2[/* oldDocument */ js.Object, /* atIndex */ scala.Double, scala.Unit]
      ] = js.undefined
  }
  
  
  trait ObserveChangesCallbacks extends js.Object {
    var added: js.UndefOr[js.Function2[/* id */ java.lang.String, /* fields */ js.Object, scala.Unit]] = js.undefined
    var addedBefore: js.UndefOr[
        js.Function3[/* id */ java.lang.String, /* fields */ js.Object, /* before */ js.Object, scala.Unit]
      ] = js.undefined
    var changed: js.UndefOr[js.Function2[/* id */ java.lang.String, /* fields */ js.Object, scala.Unit]] = js.undefined
    var movedBefore: js.UndefOr[js.Function2[/* id */ java.lang.String, /* before */ js.Object, scala.Unit]] = js.undefined
    var removed: js.UndefOr[js.Function1[/* id */ java.lang.String, scala.Unit]] = js.undefined
  }
  
  
  trait QueryWithModifiers[T] extends js.Object {
    @JSName("$comment")
    var $comment: js.UndefOr[java.lang.String] = js.undefined
    @JSName("$explain")
    var $explain: js.UndefOr[js.Any] = js.undefined
    @JSName("$hint")
    var $hint: js.UndefOr[js.Any] = js.undefined
    @JSName("$max")
    var $max: js.UndefOr[js.Any] = js.undefined
    @JSName("$maxScan")
    var $maxScan: js.UndefOr[js.Any] = js.undefined
    @JSName("$maxTimeMS")
    var $maxTimeMS: js.UndefOr[js.Any] = js.undefined
    @JSName("$min")
    var $min: js.UndefOr[js.Any] = js.undefined
    @JSName("$natural")
    var $natural: js.UndefOr[js.Any] = js.undefined
    @JSName("$orderby")
    var $orderby: js.UndefOr[js.Any] = js.undefined
    @JSName("$query")
    var $query: Query[T]
    @JSName("$returnKey")
    var $returnKey: js.UndefOr[js.Any] = js.undefined
    @JSName("$showDiskLoc")
    var $showDiskLoc: js.UndefOr[js.Any] = js.undefined
  }
  
  
  trait SortSpecifier extends js.Object
  
  var Collection: CollectionStatic = js.native
  var Cursor: CursorStatic = js.native
  var ObjectID: ObjectIDStatic = js.native
  def setConnectionOptions(options: js.Any): scala.Unit = js.native
  type ArraysOrEach[T] = meteorLib.meteorLibStrings.ArraysOrEach with T
  type BsonType = meteorLib.meteorLibNumbers.`1` | meteorLib.meteorLibStrings.double | meteorLib.meteorLibNumbers.`2` | meteorLib.meteorLibStrings.string | meteorLib.meteorLibNumbers.`3` | meteorLib.meteorLibStrings.`object` | meteorLib.meteorLibNumbers.`4` | meteorLib.meteorLibStrings.array | meteorLib.meteorLibNumbers.`5` | meteorLib.meteorLibStrings.binData | meteorLib.meteorLibNumbers.`6` | meteorLib.meteorLibStrings.undefined | meteorLib.meteorLibNumbers.`7` | meteorLib.meteorLibStrings.objectId | meteorLib.meteorLibNumbers.`8` | meteorLib.meteorLibStrings.bool | meteorLib.meteorLibNumbers.`9` | meteorLib.meteorLibStrings.date | meteorLib.meteorLibNumbers.`10` | meteorLib.meteorLibStrings.`null` | meteorLib.meteorLibNumbers.`11` | meteorLib.meteorLibStrings.regex | meteorLib.meteorLibNumbers.`12` | meteorLib.meteorLibStrings.dbPointer | meteorLib.meteorLibNumbers.`13` | meteorLib.meteorLibStrings.javascript | meteorLib.meteorLibNumbers.`14` | meteorLib.meteorLibStrings.symbol | meteorLib.meteorLibNumbers.`15` | meteorLib.meteorLibStrings.javascriptWithScope | meteorLib.meteorLibNumbers.`16` | meteorLib.meteorLibStrings.int | meteorLib.meteorLibNumbers.`17` | meteorLib.meteorLibStrings.timestamp | meteorLib.meteorLibNumbers.`18` | meteorLib.meteorLibStrings.long | meteorLib.meteorLibNumbers.`19` | meteorLib.meteorLibStrings.decimal | meteorLib.meteorLibNumbers.`-1` | meteorLib.meteorLibStrings.minKey | meteorLib.meteorLibNumbers.`127` | meteorLib.meteorLibStrings.maxKey | meteorLib.meteorLibStrings.number
  type CurrentDateModifier = meteorLib.Anon_Type | meteorLib.meteorLibNumbers.`true`
  type ElementsOf[T] = meteorLib.meteorLibStrings.ElementsOf with T
  type Flatten[T] = T | (/* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(0))) */js.Any)
  type Modifier[T] = T | meteorLib.Anon_MulCurrentDate[T]
  type OnlyArrays[T] = T
  type OnlyElementsOfArrays[T] = stdLib.Partial[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(0))) */js.Any
  ]
  type PartialMapTo[T, M] = stdLib.Partial[stdLib.Record[java.lang.String, M]]
  type PushModifier[T] = meteorLib.meteorLibStrings.PushModifier with T
  type Query[T] = meteorLib.meteorLibStrings.Query with T with meteorLib.Anon_Or with Dictionary[_]
  type Selector[T] = Query[T] | QueryWithModifiers[T]
}
