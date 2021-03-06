package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Profile extends js.Object {
  /**
    * The address of a room profile.
    */
  var Address: js.UndefOr[Address] = js.undefined
  /**
    * The ARN of the address book.
    */
  var AddressBookArn: js.UndefOr[Arn] = js.undefined
  /**
    * The distance unit of a room profile.
    */
  var DistanceUnit: js.UndefOr[DistanceUnit] = js.undefined
  /**
    * Retrieves if the profile is default or not.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  /**
    * The max volume limit of a room profile.
    */
  var MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined
  /**
    * The PSTN setting of a room profile.
    */
  var PSTNEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The ARN of a room profile.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
  /**
    * The name of a room profile.
    */
  var ProfileName: js.UndefOr[ProfileName] = js.undefined
  /**
    * The setup mode of a room profile.
    */
  var SetupModeDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The temperature unit of a room profile.
    */
  var TemperatureUnit: js.UndefOr[TemperatureUnit] = js.undefined
  /**
    * The time zone of a room profile.
    */
  var Timezone: js.UndefOr[Timezone] = js.undefined
  /**
    * The wake word of a room profile.
    */
  var WakeWord: js.UndefOr[WakeWord] = js.undefined
}

object Profile {
  @scala.inline
  def apply(
    Address: Address = null,
    AddressBookArn: Arn = null,
    DistanceUnit: DistanceUnit = null,
    IsDefault: js.UndefOr[Boolean] = js.undefined,
    MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined,
    PSTNEnabled: js.UndefOr[Boolean] = js.undefined,
    ProfileArn: Arn = null,
    ProfileName: ProfileName = null,
    SetupModeDisabled: js.UndefOr[Boolean] = js.undefined,
    TemperatureUnit: TemperatureUnit = null,
    Timezone: Timezone = null,
    WakeWord: WakeWord = null
  ): Profile = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address)
    if (AddressBookArn != null) __obj.updateDynamic("AddressBookArn")(AddressBookArn)
    if (DistanceUnit != null) __obj.updateDynamic("DistanceUnit")(DistanceUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault)
    if (!js.isUndefined(MaxVolumeLimit)) __obj.updateDynamic("MaxVolumeLimit")(MaxVolumeLimit)
    if (!js.isUndefined(PSTNEnabled)) __obj.updateDynamic("PSTNEnabled")(PSTNEnabled)
    if (ProfileArn != null) __obj.updateDynamic("ProfileArn")(ProfileArn)
    if (ProfileName != null) __obj.updateDynamic("ProfileName")(ProfileName)
    if (!js.isUndefined(SetupModeDisabled)) __obj.updateDynamic("SetupModeDisabled")(SetupModeDisabled)
    if (TemperatureUnit != null) __obj.updateDynamic("TemperatureUnit")(TemperatureUnit.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    if (WakeWord != null) __obj.updateDynamic("WakeWord")(WakeWord.asInstanceOf[js.Any])
    __obj.asInstanceOf[Profile]
  }
}

