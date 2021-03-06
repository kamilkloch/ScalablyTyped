package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainAliasesCollection extends js.Object {
  // Retrieves a domain alias of the customer.
  def get(customer: java.lang.String, domainAliasName: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.DomainAlias = js.native
  // Inserts a Domain alias of the customer.
  def insert(
    resource: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.DomainAlias,
    customer: java.lang.String
  ): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.DomainAlias = js.native
  // Lists the domain aliases of the customer.
  def list(customer: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.DomainAliases = js.native
  // Lists the domain aliases of the customer.
  def list(customer: java.lang.String, optionalArgs: js.Object): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.DomainAliases = js.native
  // Deletes a Domain Alias of the customer.
  def remove(customer: java.lang.String, domainAliasName: java.lang.String): scala.Unit = js.native
}

