package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An association of a Patient with an Organization and  Healthcare Provider(s) for a period of time that the Organization assumes some level of responsibility
     */

trait EpisodeOfCare extends DomainResource {
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * The set of accounts that may be used for billing for this EpisodeOfCare
           */
  var account: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Care manager/care co-ordinator for the patient
           */
  var careManager: js.UndefOr[Reference] = js.undefined
  /**
           * The list of diagnosis relevant to this episode of care
           */
  var diagnosis: js.UndefOr[js.Array[EpisodeOfCareDiagnosis]] = js.undefined
  /**
           * Business Identifier(s) relevant for this EpisodeOfCare
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * Organization that assumes care
           */
  var managingOrganization: js.UndefOr[Reference] = js.undefined
  /**
           * The patient who is the focus of this episode of care
           */
  var patient: Reference
  /**
           * Interval during responsibility is assumed
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Originating Referral Request(s)
           */
  var referralRequest: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * planned | waitlist | active | onhold | finished | cancelled | entered-in-error
           */
  var status: code
  /**
           * Past list of status codes (the current status may be included to cover the start date of the status)
           */
  var statusHistory: js.UndefOr[js.Array[EpisodeOfCareStatusHistory]] = js.undefined
  /**
           * Other practitioners facilitating this episode of care
           */
  var team: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Type/class  - e.g. specialist referral, disease management
           */
  var `type`: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
