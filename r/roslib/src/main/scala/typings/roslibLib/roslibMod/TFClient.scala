package typings
package roslibLib.roslibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "TFClient")
@js.native
class TFClient protected () extends js.Object {
  /**
    * A TF Client that listens to TFs from tf2_web_republisher.
    *
    * @constructor
    * @param options - object with following keys:
    *   * ros - the ROSLIB.Ros connection handle
    *   * fixedFrame - the fixed frame, like /base_link
    *   * angularThres - the angular threshold for the TF republisher
    *   * transThres - the translation threshold for the TF republisher
    *   * rate - the rate for the TF republisher
    *   * updateDelay - the time (in ms) to wait after a new subscription to update the TF republisher's list of TFs
    *   * topicTimeout - the timeout parameter for the TF republisher
    *   * serverName (optional) - the name of the tf2_web_republisher server
    *   * repubServiceName (optional) - the name of the republish_tfs service (non groovy compatibility mode only) default: '/republish_tfs'
    */
  def this(options: roslibLib.Anon_AngularThres) = this()
  /**
    * Unsubscribe and unadvertise all topics associated with this TFClient.
    */
  def dispose(): scala.Unit = js.native
  /**
    * Process the service response and subscribe to the tf republisher topic.
    *
    * @param response - the service response containing the topic name
    */
  def processResponse(response: js.Any): scala.Unit = js.native
  /**
    * Process the incoming TF message and send them out using the callback functions
    * @param tf - the TF message from the server
    */
  def processTfArray(tf: js.Any): scala.Unit = js.native
  /**
    * Subscribe to the given TF frame.
    * @param frameId - the TF frame to subscribe to
    * @param callback - function with params:
    *  * transform - the transform data
    */
  def subscribe(frameId: java.lang.String, callback: js.Function1[/* transform */ Transform, scala.Unit]): scala.Unit = js.native
  /**
    * Unsubscribe from the given TF frame.
    *
    * @param frameId - the TF frame to unsubscribe from
    * @param callback - the callback function to remove
    */
  def unsubscribe(frameId: java.lang.String): scala.Unit = js.native
  def unsubscribe(frameId: java.lang.String, callback: js.Function1[/* transform */ Transform, scala.Unit]): scala.Unit = js.native
  /**
    * Create and send a new goal (or service request) to the tf2_web_republisher based on the current list of TFs.
    */
  def updateGoal(): scala.Unit = js.native
}

