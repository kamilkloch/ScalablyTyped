package typings
package xrmLib.XrmNs.ProcessFlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Interface for CRM Business Process Flow stages.
         */

trait Stage extends js.Object {
  /**
               * Returns an object with a getValue method which will return the integer value of the business process flow
               * category.
               * @returns The stage category.
               */
  def getCategory(): xrmLib.Anon_GetValue
  /**
               * Returns the logical name of the entity associated with the stage.
               * @returns The entity name.
               */
  def getEntityName(): java.lang.String
  /**
               * Returns the unique identifier of the stage.
               * @returns The identifier of the Stage, in GUID format.
               * @example Example: "{825CB223-A651-DF11-AA8B-00155DBA3804}".
               */
  def getId(): java.lang.String
  /**
               * Returns the name of the stage.
               * @returns The name.
               */
  def getName(): java.lang.String
  /**
               * Returns the status of the stage.
               * @returns The status, either "active" or "inactive".
               */
  def getStatus(): StageStatus
  /**
               * Returns a collection of steps in the stage.
               * @returns An array of Step.
               */
  def getSteps(): js.Array[Step]
}
