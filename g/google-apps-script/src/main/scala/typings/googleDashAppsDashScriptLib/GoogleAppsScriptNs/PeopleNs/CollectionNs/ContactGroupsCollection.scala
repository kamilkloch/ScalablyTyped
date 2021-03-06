package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactGroupsCollection extends js.Object {
  var Members: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.CollectionNs.ContactGroupsNs.MembersCollection
  ] = js.native
  // Get a list of contact groups owned by the authenticated user by specifying
  // a list of contact group resource names.
  def batchGet(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.BatchGetContactGroupsResponse = js.native
  // Get a list of contact groups owned by the authenticated user by specifying
  // a list of contact group resource names.
  def batchGet(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.BatchGetContactGroupsResponse = js.native
  // Create a new contact group owned by the authenticated user.
  def create(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.CreateContactGroupRequest
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.ContactGroup = js.native
  // Get a specific contact group owned by the authenticated user by specifying
  // a contact group resource name.
  def get(resourceName: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.ContactGroup = js.native
  // Get a specific contact group owned by the authenticated user by specifying
  // a contact group resource name.
  def get(resourceName: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.ContactGroup = js.native
  // List all contact groups owned by the authenticated user. Members of the
  // contact groups are not populated.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.ListContactGroupsResponse = js.native
  // List all contact groups owned by the authenticated user. Members of the
  // contact groups are not populated.
  def list(optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.ListContactGroupsResponse = js.native
  // Delete an existing contact group owned by the authenticated user by
  // specifying a contact group resource name.
  def remove(resourceName: java.lang.String): scala.Unit = js.native
  // Delete an existing contact group owned by the authenticated user by
  // specifying a contact group resource name.
  def remove(resourceName: java.lang.String, optionalArgs: js.Object): scala.Unit = js.native
  // Update the name of an existing contact group owned by the authenticated
  // user.
  def update(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.UpdateContactGroupRequest,
    resourceName: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleNs.SchemaNs.ContactGroup = js.native
}

