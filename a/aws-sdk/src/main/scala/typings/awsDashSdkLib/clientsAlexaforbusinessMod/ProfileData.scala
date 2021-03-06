package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileData extends js.Object {
  /**
    * The address of a room profile.
    */
  var Address: js.UndefOr[Address] = js.undefined
  /**
    * The distance unit of a room profile.
    */
  var DistanceUnit: js.UndefOr[DistanceUnit] = js.undefined
  /**
    * Retrieves if the profile data is default or not.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * The ARN of a room profile.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of a room profile.
    */
  var ProfileName: js.UndefOr[ProfileName] = js.undefined
  /**
    * The temperature unit of a room profile.
    */
  var TemperatureUnit: js.UndefOr[TemperatureUnit] = js.undefined
  /**
    * The timezone of a room profile.
    */
  var Timezone: js.UndefOr[Timezone] = js.undefined
  /**
    * The wake word of a room profile.
    */
  var WakeWord: js.UndefOr[WakeWord] = js.undefined
}

object ProfileData {
  @scala.inline
  def apply(
    Address: Address = null,
    DistanceUnit: DistanceUnit = null,
    IsDefault: js.UndefOr[Boolean] = js.undefined,
    ProfileArn: Arn = null,
    ProfileName: ProfileName = null,
    TemperatureUnit: TemperatureUnit = null,
    Timezone: Timezone = null,
    WakeWord: WakeWord = null
  ): ProfileData = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address)
    if (DistanceUnit != null) __obj.updateDynamic("DistanceUnit")(DistanceUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault)
    if (ProfileArn != null) __obj.updateDynamic("ProfileArn")(ProfileArn)
    if (ProfileName != null) __obj.updateDynamic("ProfileName")(ProfileName)
    if (TemperatureUnit != null) __obj.updateDynamic("TemperatureUnit")(TemperatureUnit.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    if (WakeWord != null) __obj.updateDynamic("WakeWord")(WakeWord.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileData]
  }
}

