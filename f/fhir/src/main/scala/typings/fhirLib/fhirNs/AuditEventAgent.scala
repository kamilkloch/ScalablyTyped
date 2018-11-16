package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Actor involved in the event
     */

trait AuditEventAgent extends BackboneElement {
  /**
           * Contains extended information for property 'altId'.
           */
  var _altId: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'policy'.
           */
  var _policy: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'requestor'.
           */
  var _requestor: js.UndefOr[Element] = js.undefined
  /**
           * Alternative User id e.g. authentication
           */
  var altId: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Where
           */
  var location: js.UndefOr[Reference] = js.undefined
  /**
           * Type of media
           */
  var media: js.UndefOr[Coding] = js.undefined
  /**
           * Human-meaningful name for the agent
           */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Logical network location for application activity
           */
  var network: js.UndefOr[AuditEventAgentNetwork] = js.undefined
  /**
           * Policy that authorized event
           */
  var policy: js.UndefOr[js.Array[uri]] = js.undefined
  /**
           * Reason given for this user
           */
  var purposeOfUse: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Direct reference to resource
           */
  var reference: js.UndefOr[Reference] = js.undefined
  /**
           * Whether user is initiator
           */
  var requestor: scala.Boolean
  /**
           * Agent role in the event
           */
  var role: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  /**
           * Unique identifier for the user
           */
  var userId: js.UndefOr[Identifier] = js.undefined
}
