package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentScope[D] extends js.Object {
  var attachment: Attachment = js.native
  val config: ServerConfig = js.native
  var multipart: Multipart[D] = js.native
  var server: ServerScope = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid
  def atomic(designname: java.lang.String, updatename: java.lang.String, docname: java.lang.String): stdLib.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid
  def atomic(
    designname: java.lang.String,
    updatename: java.lang.String,
    docname: java.lang.String,
    body: js.Any
  ): stdLib.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid
  def atomic(
    designname: java.lang.String,
    updatename: java.lang.String,
    docname: java.lang.String,
    body: js.Any,
    callback: Callback[OkResponse]
  ): stdLib.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid
  def atomic(
    designname: java.lang.String,
    updatename: java.lang.String,
    docname: java.lang.String,
    callback: Callback[OkResponse]
  ): stdLib.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication
  def auth(username: java.lang.String, userpass: java.lang.String): stdLib.Promise[DatabaseAuthResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#cookie-authentication
  def auth(username: java.lang.String, userpass: java.lang.String, callback: Callback[DatabaseAuthResponse]): stdLib.Promise[DatabaseAuthResponse] = js.native
  def bulk(docs: BulkModifyDocsWrapper): stdLib.Promise[js.Array[DocumentInsertResponse]] = js.native
  def bulk(docs: BulkModifyDocsWrapper, callback: Callback[js.Array[DocumentInsertResponse]]): stdLib.Promise[js.Array[DocumentInsertResponse]] = js.native
  def bulk(docs: BulkModifyDocsWrapper, params: js.Any): stdLib.Promise[js.Array[DocumentInsertResponse]] = js.native
  def bulk(docs: BulkModifyDocsWrapper, params: js.Any, callback: Callback[js.Array[DocumentInsertResponse]]): stdLib.Promise[js.Array[DocumentInsertResponse]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
  def changes(): stdLib.Promise[DatabaseChangesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
  def changes(callback: Callback[DatabaseChangesResponse]): stdLib.Promise[DatabaseChangesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
  def changes(params: DatabaseChangesParams): stdLib.Promise[DatabaseChangesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
  def changes(params: DatabaseChangesParams, callback: Callback[DatabaseChangesResponse]): stdLib.Promise[DatabaseChangesResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/compact.html#post--db-_compact
  def compact(): stdLib.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/compact.html#post--db-_compact
  def compact(callback: Callback[OkResponse]): stdLib.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#copy--db-docid
  def copy(src_document: java.lang.String, dst_document: java.lang.String): stdLib.Promise[DocumentCopyResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#copy--db-docid
  def copy(
    src_document: java.lang.String,
    dst_document: java.lang.String,
    callback: Callback[DocumentCopyResponse]
  ): stdLib.Promise[DocumentCopyResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#copy--db-docid
  def copy(src_document: java.lang.String, dst_document: java.lang.String, options: DocumentCopyOptions): stdLib.Promise[DocumentCopyResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#copy--db-docid
  def copy(
    src_document: java.lang.String,
    dst_document: java.lang.String,
    options: DocumentCopyOptions,
    callback: Callback[DocumentCopyResponse]
  ): stdLib.Promise[DocumentCopyResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#delete--db-docid
  def destroy(docname: java.lang.String, rev: java.lang.String): stdLib.Promise[DocumentDestroyResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#delete--db-docid
  def destroy(docname: java.lang.String, rev: java.lang.String, callback: Callback[DocumentDestroyResponse]): stdLib.Promise[DocumentDestroyResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs
  def fetch(docnames: BulkFetchDocsWrapper): stdLib.Promise[DocumentFetchResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs
  def fetch(docnames: BulkFetchDocsWrapper, callback: Callback[DocumentFetchResponse[D]]): stdLib.Promise[DocumentFetchResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs
  def fetch(docnames: BulkFetchDocsWrapper, params: DocumentFetchParams): stdLib.Promise[DocumentFetchResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs
  def fetch(
    docnames: BulkFetchDocsWrapper,
    params: DocumentFetchParams,
    callback: Callback[DocumentFetchResponse[D]]
  ): stdLib.Promise[DocumentFetchResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs
  def fetchRevs(docnames: BulkFetchDocsWrapper): stdLib.Promise[DocumentFetchRevsResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs
  def fetchRevs(docnames: BulkFetchDocsWrapper, callback: Callback[DocumentFetchRevsResponse]): stdLib.Promise[DocumentFetchRevsResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs
  def fetchRevs(docnames: BulkFetchDocsWrapper, params: DocumentFetchParams): stdLib.Promise[DocumentFetchRevsResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs
  def fetchRevs(
    docnames: BulkFetchDocsWrapper,
    params: DocumentFetchParams,
    callback: Callback[DocumentFetchRevsResponse]
  ): stdLib.Promise[DocumentFetchRevsResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/find.html#db-find
  def find(query: MangoQuery): stdLib.Promise[MangoResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/find.html#db-find
  def find(query: MangoQuery, callback: Callback[MangoResponse[D]]): stdLib.Promise[MangoResponse[D]] = js.native
  def follow(): nodeLib.eventsMod.EventEmitter = js.native
  def follow(callback: Callback[_]): nodeLib.eventsMod.EventEmitter = js.native
  def follow(params: DocumentScopeFollowUpdatesParams): nodeLib.eventsMod.EventEmitter = js.native
  def follow(params: DocumentScopeFollowUpdatesParams, callback: Callback[_]): nodeLib.eventsMod.EventEmitter = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid
  def get(docname: java.lang.String): stdLib.Promise[DocumentGetResponse with D] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid
  def get(docname: java.lang.String, callback: Callback[DocumentGetResponse with D]): stdLib.Promise[DocumentGetResponse with D] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid
  def get(docname: java.lang.String, params: DocumentGetParams): stdLib.Promise[DocumentGetResponse with D] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#get--db-docid
  def get(
    docname: java.lang.String,
    params: DocumentGetParams,
    callback: Callback[DocumentGetResponse with D]
  ): stdLib.Promise[DocumentGetResponse with D] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#head--db-docid
  def head(docname: java.lang.String): stdLib.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/document/common.html#head--db-docid
  def head(docname: java.lang.String, callback: Callback[_]): stdLib.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#get--db
  def info(): stdLib.Promise[DatabaseGetResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#get--db
  def info(callback: Callback[DatabaseGetResponse]): stdLib.Promise[DatabaseGetResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#post--db
  // http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
  def insert(document: (ViewDocument[D] | D) with MaybeDocument): stdLib.Promise[DocumentInsertResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#post--db
  // http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
  def insert(document: (ViewDocument[D] | D) with MaybeDocument, callback: Callback[DocumentInsertResponse]): stdLib.Promise[DocumentInsertResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#post--db
  // http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
  def insert(document: (ViewDocument[D] | D) with MaybeDocument, params: java.lang.String): stdLib.Promise[DocumentInsertResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#post--db
  // http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
  def insert(
    document: (ViewDocument[D] | D) with MaybeDocument,
    params: java.lang.String,
    callback: Callback[DocumentInsertResponse]
  ): stdLib.Promise[DocumentInsertResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#post--db
  // http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
  def insert(document: (ViewDocument[D] | D) with MaybeDocument, params: DocumentInsertParams): stdLib.Promise[DocumentInsertResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#post--db
  // http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
  def insert(
    document: (ViewDocument[D] | D) with MaybeDocument,
    params: DocumentInsertParams,
    callback: Callback[DocumentInsertResponse]
  ): stdLib.Promise[DocumentInsertResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/common.html#post--db
  // http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
  def insert(
    document: (ViewDocument[D] | D) with MaybeDocument,
    params: scala.Null,
    callback: Callback[DocumentInsertResponse]
  ): stdLib.Promise[DocumentInsertResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
  def list(): stdLib.Promise[DocumentListResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
  def list(callback: Callback[DocumentListResponse[D]]): stdLib.Promise[DocumentListResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
  def list(params: DocumentListParams): stdLib.Promise[DocumentListResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
  def list(params: DocumentListParams, callback: Callback[DocumentListResponse[D]]): stdLib.Promise[DocumentListResponse[D]] = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
  def listAsStream(): requestLib.requestMod.requestNs.Request = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
  def listAsStream(callback: Callback[requestLib.requestMod.requestNs.Request]): requestLib.requestMod.requestNs.Request = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
  def listAsStream(params: DocumentListParams): requestLib.requestMod.requestNs.Request = js.native
  // http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
  def listAsStream(params: DocumentListParams, callback: Callback[requestLib.requestMod.requestNs.Request]): requestLib.requestMod.requestNs.Request = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
  def replicate(target: java.lang.String, options: js.Any): stdLib.Promise[DatabaseReplicateResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
  def replicate(target: java.lang.String, options: js.Any, callback: Callback[DatabaseReplicateResponse]): stdLib.Promise[DatabaseReplicateResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
  def replicate(target: DocumentScope[D], options: js.Any): stdLib.Promise[DatabaseReplicateResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
  def replicate(target: DocumentScope[D], options: js.Any, callback: Callback[DatabaseReplicateResponse]): stdLib.Promise[DatabaseReplicateResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
  def replicate[D](target: java.lang.String): stdLib.Promise[DatabaseReplicateResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
  def replicate[D](target: java.lang.String, callback: Callback[DatabaseReplicateResponse]): stdLib.Promise[DatabaseReplicateResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
  def replicate[D](target: DocumentScope[D]): stdLib.Promise[DatabaseReplicateResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
  def replicate[D](target: DocumentScope[D], callback: Callback[DatabaseReplicateResponse]): stdLib.Promise[DatabaseReplicateResponse] = js.native
  def search[V](designname: java.lang.String, searchname: java.lang.String, params: DocumentSearchParams): stdLib.Promise[DocumentSearchResponse[V]] = js.native
  def search[V](
    designname: java.lang.String,
    searchname: java.lang.String,
    params: DocumentSearchParams,
    callback: Callback[DocumentSearchResponse[V]]
  ): stdLib.Promise[DocumentSearchResponse[V]] = js.native
  def searchAsStream[V](designname: java.lang.String, searchname: java.lang.String, params: DocumentSearchParams): requestLib.requestMod.requestNs.Request = js.native
  def searchAsStream[V](
    designname: java.lang.String,
    searchname: java.lang.String,
    params: DocumentSearchParams,
    callback: Callback[DocumentSearchResponse[V]]
  ): requestLib.requestMod.requestNs.Request = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#get--_session
  def session(): stdLib.Promise[DatabaseSessionResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/server/authn.html#get--_session
  def session(callback: Callback[DatabaseSessionResponse]): stdLib.Promise[DatabaseSessionResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#get--db-_design-ddoc-_show-func
  def show(designname: java.lang.String, showname: java.lang.String, doc_id: java.lang.String): stdLib.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#get--db-_design-ddoc-_show-func
  def show(
    designname: java.lang.String,
    showname: java.lang.String,
    doc_id: java.lang.String,
    callback: Callback[_]
  ): stdLib.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#get--db-_design-ddoc-_show-func
  def show(designname: java.lang.String, showname: java.lang.String, doc_id: java.lang.String, params: js.Any): stdLib.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#get--db-_design-ddoc-_show-func
  def show(
    designname: java.lang.String,
    showname: java.lang.String,
    doc_id: java.lang.String,
    params: js.Any,
    callback: Callback[_]
  ): stdLib.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid
  def updateWithHandler(designname: java.lang.String, updatename: java.lang.String, docname: java.lang.String): stdLib.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid
  def updateWithHandler(
    designname: java.lang.String,
    updatename: java.lang.String,
    docname: java.lang.String,
    body: js.Any
  ): stdLib.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid
  def updateWithHandler(
    designname: java.lang.String,
    updatename: java.lang.String,
    docname: java.lang.String,
    body: js.Any,
    callback: Callback[OkResponse]
  ): stdLib.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#put--db-_design-ddoc-_update-func-docid
  def updateWithHandler(
    designname: java.lang.String,
    updatename: java.lang.String,
    docname: java.lang.String,
    callback: Callback[OkResponse]
  ): stdLib.Promise[OkResponse] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#post--db-_design-ddoc-_view-view
  def view[V](designname: java.lang.String, viewname: java.lang.String): stdLib.Promise[DocumentViewResponse[V, D]] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#post--db-_design-ddoc-_view-view
  def view[V](
    designname: java.lang.String,
    viewname: java.lang.String,
    callback: Callback[DocumentViewResponse[V, D]]
  ): stdLib.Promise[DocumentViewResponse[V, D]] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#post--db-_design-ddoc-_view-view
  def view[V](designname: java.lang.String, viewname: java.lang.String, params: DocumentViewParams): stdLib.Promise[DocumentViewResponse[V, D]] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#post--db-_design-ddoc-_view-view
  def view[V](
    designname: java.lang.String,
    viewname: java.lang.String,
    params: DocumentViewParams,
    callback: Callback[DocumentViewResponse[V, D]]
  ): stdLib.Promise[DocumentViewResponse[V, D]] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#post--db-_design-ddoc-_view-view
  def viewAsStream[V](designname: java.lang.String, viewname: java.lang.String): requestLib.requestMod.requestNs.Request = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#post--db-_design-ddoc-_view-view
  def viewAsStream[V](
    designname: java.lang.String,
    viewname: java.lang.String,
    callback: Callback[DocumentViewResponse[V, D]]
  ): requestLib.requestMod.requestNs.Request = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#post--db-_design-ddoc-_view-view
  def viewAsStream[V](designname: java.lang.String, viewname: java.lang.String, params: DocumentViewParams): requestLib.requestMod.requestNs.Request = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
  // http://docs.couchdb.org/en/latest/api/ddoc/views.html#post--db-_design-ddoc-_view-view
  def viewAsStream[V](
    designname: java.lang.String,
    viewname: java.lang.String,
    params: DocumentViewParams,
    callback: Callback[DocumentViewResponse[V, D]]
  ): requestLib.requestMod.requestNs.Request = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#db-design-design-doc-list-list-name-view-name
  def viewWithList(designname: java.lang.String, viewname: java.lang.String, listname: java.lang.String): stdLib.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#db-design-design-doc-list-list-name-view-name
  def viewWithList(
    designname: java.lang.String,
    viewname: java.lang.String,
    listname: java.lang.String,
    callback: Callback[_]
  ): stdLib.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#db-design-design-doc-list-list-name-view-name
  def viewWithList(
    designname: java.lang.String,
    viewname: java.lang.String,
    listname: java.lang.String,
    params: DocumentViewParams
  ): stdLib.Promise[_] = js.native
  // http://docs.couchdb.org/en/latest/api/ddoc/render.html#db-design-design-doc-list-list-name-view-name
  def viewWithList(
    designname: java.lang.String,
    viewname: java.lang.String,
    listname: java.lang.String,
    params: DocumentViewParams,
    callback: Callback[_]
  ): stdLib.Promise[_] = js.native
}
