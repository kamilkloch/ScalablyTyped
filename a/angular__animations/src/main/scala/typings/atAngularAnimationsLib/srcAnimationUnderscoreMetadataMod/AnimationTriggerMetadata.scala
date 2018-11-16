package typings
package atAngularAnimationsLib.srcAnimationUnderscoreMetadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AnimationTriggerMetadata extends AnimationMetadata {
  /**
       * An animation definition object, containing an array of state and transition declarations.
       */
  var definitions: js.Array[AnimationMetadata]
  /**
        * The trigger name, used to associate it with an element. Unique within the component.
        */
  var name: java.lang.String
  /**
       * An options object containing a delay and
       * developer-defined parameters that provide styling defaults and
       * can be overridden on invocation. Default delay is 0.
       */
  var options: atAngularAnimationsLib.Anon_ParamsName | scala.Null
}
