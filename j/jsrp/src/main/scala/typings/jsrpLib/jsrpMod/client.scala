package typings
package jsrpLib.jsrpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsrp", "client")
@js.native
/** Client SRP constructor */
class client () extends js.Object {
  /**
    * Verifies the server's M2 proof against the client's. Only call after using {@link getProof}.
    * @param hexM2 - hex representation of M2
    * @returns true if it matches the client's proof, false if it doesn't
    */
  def checkServerProof(hexM2: java.lang.String): scala.Boolean = js.native
  /**
    * Generate the v and salt values from values passed into init().
    * @param callback - callback has an error as the first argument, or an object containing the verifier and salt as the second.
    */
  def createVerifier(callback: js.Function2[/* error */ js.Any, /* result */ Verifier, _]): scala.Unit = js.native
  /**
    * Returns the hex representation of the client's M1 proof
    * @returns hex representation of M1
    */
  def getProof(): java.lang.String = js.native
  /**
    * Returns the hex representation of the client's A value
    * @returns hex representation of A
    */
  def getPublicKey(): java.lang.String = js.native
  /**
    * Returns the hex representation of the salt
    * @returns hex representation of the salt
    */
  def getSalt(): java.lang.String = js.native
  /**
    * Returns the hex representation of the shared secret key, K
    * @returns hex representation of K
    */
  def getSharedKey(): java.lang.String = js.native
  /**
    * Initialise the client SRP and calculate needed SRP values
    * @param options - the client options including the username and password
    * @param callback - called when the client instance is ready to use
    */
  def init(options: ClientOptions, callback: js.Function0[_]): scala.Unit = js.native
  /**
    * Set the salt generated by the server for later computations
    * @param hexSalt - hex value of the salt
    */
  def setSalt(hexSalt: java.lang.String): scala.Unit = js.native
  /**
    * Sets the server's B value on the client and compute values to complete authentication
    * @param hexB - hex representation of B
    * @throws Will throw an error if the server provides an incorrect value
    */
  def setServerPublicKey(hexB: java.lang.String): scala.Unit = js.native
}

