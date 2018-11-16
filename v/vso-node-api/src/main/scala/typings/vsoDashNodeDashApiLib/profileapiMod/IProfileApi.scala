package typings
package vsoDashNodeDashApiLib.profileapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProfileApi
  extends vsoDashNodeDashApiLib.clientapibasesMod.ClientApiBase {
  def createProfile(createProfileContext: vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.CreateProfileContext): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Profile] = js.native
  def createProfile(
    createProfileContext: vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.CreateProfileContext,
    autoCreate: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Profile] = js.native
  def deleteProfileAttribute(id: java.lang.String, descriptor: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def getAvatar(id: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Avatar] = js.native
  def getAvatar(id: java.lang.String, size: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Avatar] = js.native
  def getAvatar(id: java.lang.String, size: java.lang.String, format: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Avatar] = js.native
  def getAvatarPreview(container: js.Any, id: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Avatar] = js.native
  def getAvatarPreview(container: js.Any, id: java.lang.String, size: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Avatar] = js.native
  def getAvatarPreview(container: js.Any, id: java.lang.String, size: java.lang.String, format: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Avatar] = js.native
  def getAvatarPreview(
    container: js.Any,
    id: java.lang.String,
    size: java.lang.String,
    format: java.lang.String,
    displayName: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Avatar] = js.native
  def getGeoRegion(ipaddress: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.GeoRegion] = js.native
  def getProfile(id: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Profile] = js.native
  def getProfile(id: java.lang.String, details: scala.Boolean): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Profile] = js.native
  def getProfile(id: java.lang.String, details: scala.Boolean, withAttributes: scala.Boolean): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Profile] = js.native
  def getProfile(
    id: java.lang.String,
    details: scala.Boolean,
    withAttributes: scala.Boolean,
    partition: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Profile] = js.native
  def getProfile(
    id: java.lang.String,
    details: scala.Boolean,
    withAttributes: scala.Boolean,
    partition: java.lang.String,
    coreAttributes: java.lang.String
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Profile] = js.native
  def getProfile(
    id: java.lang.String,
    details: scala.Boolean,
    withAttributes: scala.Boolean,
    partition: java.lang.String,
    coreAttributes: java.lang.String,
    forceRefresh: scala.Boolean
  ): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Profile] = js.native
  def getProfileAttribute(id: java.lang.String, descriptor: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.ProfileAttribute] = js.native
  def getProfileAttributes(id: java.lang.String, partition: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.ProfileAttribute]] = js.native
  def getProfileAttributes(id: java.lang.String, partition: java.lang.String, modifiedSince: java.lang.String): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.ProfileAttribute]] = js.native
  def getProfileAttributes(
    id: java.lang.String,
    partition: java.lang.String,
    modifiedSince: java.lang.String,
    modifiedAfterRevision: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.ProfileAttribute]] = js.native
  def getProfileAttributes(
    id: java.lang.String,
    partition: java.lang.String,
    modifiedSince: java.lang.String,
    modifiedAfterRevision: java.lang.String,
    withCoreAttributes: scala.Boolean
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.ProfileAttribute]] = js.native
  def getProfileAttributes(
    id: java.lang.String,
    partition: java.lang.String,
    modifiedSince: java.lang.String,
    modifiedAfterRevision: java.lang.String,
    withCoreAttributes: scala.Boolean,
    coreAttributes: java.lang.String
  ): stdLib.Promise[js.Array[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.ProfileAttribute]] = js.native
  def getRegions(): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.ProfileRegions] = js.native
  def getSupportedLcids(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def getUserDefaults(): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Profile] = js.native
  def getUserDefaults(includeAvatar: scala.Boolean): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Profile] = js.native
  def refreshUserDefaults(id: java.lang.String): stdLib.Promise[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Profile] = js.native
  def resetAvatar(id: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def setAvatar(container: js.Any, id: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def setProfileAttribute(container: js.Any, id: java.lang.String, descriptor: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def setProfileAttributes(
    attributesCollection: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.VssJsonCollectionWrapperV[
      js.Array[vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.ProfileAttributeBase[_]]
    ],
    id: java.lang.String
  ): stdLib.Promise[scala.Unit] = js.native
  def updateProfile(profile: vsoDashNodeDashApiLib.interfacesProfileInterfacesMod.Profile, id: java.lang.String): stdLib.Promise[scala.Unit] = js.native
}
