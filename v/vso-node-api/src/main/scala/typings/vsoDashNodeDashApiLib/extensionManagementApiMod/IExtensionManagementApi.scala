package typings
package vsoDashNodeDashApiLib.extensionManagementApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExtensionManagementApi
  extends vsoDashNodeDashApiLib.clientApiBasesMod.ClientApiBase {
  def createDocumentByName(
    doc: js.Any,
    publisherName: java.lang.String,
    extensionName: java.lang.String,
    scopeType: java.lang.String,
    scopeValue: java.lang.String,
    collectionName: java.lang.String
  ): js.Promise[_] = js.native
  def deleteDocumentByName(
    publisherName: java.lang.String,
    extensionName: java.lang.String,
    scopeType: java.lang.String,
    scopeValue: java.lang.String,
    collectionName: java.lang.String,
    documentId: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def deleteRequest(publisherName: java.lang.String, extensionName: java.lang.String): js.Promise[scala.Unit] = js.native
  def getAcquisitionOptions(itemId: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.AcquisitionOptions
  ] = js.native
  def getAcquisitionOptions(itemId: java.lang.String, testCommerce: scala.Boolean): js.Promise[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.AcquisitionOptions
  ] = js.native
  def getAcquisitionOptions(itemId: java.lang.String, testCommerce: scala.Boolean, isFreeOrTrialInstall: scala.Boolean): js.Promise[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.AcquisitionOptions
  ] = js.native
  def getAcquisitionOptions(
    itemId: java.lang.String,
    testCommerce: scala.Boolean,
    isFreeOrTrialInstall: scala.Boolean,
    isAccountOwner: scala.Boolean
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.AcquisitionOptions
  ] = js.native
  def getDocumentByName(
    publisherName: java.lang.String,
    extensionName: java.lang.String,
    scopeType: java.lang.String,
    scopeValue: java.lang.String,
    collectionName: java.lang.String,
    documentId: java.lang.String
  ): js.Promise[_] = js.native
  def getDocumentsByName(
    publisherName: java.lang.String,
    extensionName: java.lang.String,
    scopeType: java.lang.String,
    scopeValue: java.lang.String,
    collectionName: java.lang.String
  ): js.Promise[js.Array[_]] = js.native
  def getInstalledExtensionByName(publisherName: java.lang.String, extensionName: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtension
  ] = js.native
  def getInstalledExtensionByName(
    publisherName: java.lang.String,
    extensionName: java.lang.String,
    assetTypes: js.Array[java.lang.String]
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtension
  ] = js.native
  def getInstalledExtensions(): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtension
    ]
  ] = js.native
  def getInstalledExtensions(includeDisabledExtensions: scala.Boolean): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtension
    ]
  ] = js.native
  def getInstalledExtensions(includeDisabledExtensions: scala.Boolean, includeErrors: scala.Boolean): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtension
    ]
  ] = js.native
  def getInstalledExtensions(
    includeDisabledExtensions: scala.Boolean,
    includeErrors: scala.Boolean,
    assetTypes: js.Array[java.lang.String]
  ): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtension
    ]
  ] = js.native
  def getInstalledExtensions(
    includeDisabledExtensions: scala.Boolean,
    includeErrors: scala.Boolean,
    assetTypes: js.Array[java.lang.String],
    includeInstallationIssues: scala.Boolean
  ): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtension
    ]
  ] = js.native
  def getPolicies(userId: java.lang.String): js.Promise[vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod.UserExtensionPolicy] = js.native
  def getRequests(): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.RequestedExtension
    ]
  ] = js.native
  def getStates(): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionState]
  ] = js.native
  def getStates(includeDisabled: scala.Boolean): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionState]
  ] = js.native
  def getStates(includeDisabled: scala.Boolean, includeErrors: scala.Boolean): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionState]
  ] = js.native
  def getStates(
    includeDisabled: scala.Boolean,
    includeErrors: scala.Boolean,
    includeInstallationIssues: scala.Boolean
  ): js.Promise[
    js.Array[vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionState]
  ] = js.native
  def getToken(): js.Promise[java.lang.String] = js.native
  def installExtensionByName(publisherName: java.lang.String, extensionName: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtension
  ] = js.native
  def installExtensionByName(publisherName: java.lang.String, extensionName: java.lang.String, version: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtension
  ] = js.native
  def queryCollectionsByName(
    collectionQuery: vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionDataCollectionQuery,
    publisherName: java.lang.String,
    extensionName: java.lang.String
  ): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionDataCollection
    ]
  ] = js.native
  def queryExtensions(query: vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtensionQuery): js.Promise[
    js.Array[
      vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtension
    ]
  ] = js.native
  def registerAuthorization(publisherName: java.lang.String, extensionName: java.lang.String, registrationId: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionAuthorization
  ] = js.native
  def requestAcquisition(
    acquisitionRequest: vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionAcquisitionRequest
  ): js.Promise[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionAcquisitionRequest
  ] = js.native
  def requestExtension(publisherName: java.lang.String, extensionName: java.lang.String, requestMessage: java.lang.String): js.Promise[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.RequestedExtension
  ] = js.native
  def resolveAllRequests(
    rejectMessage: java.lang.String,
    publisherName: java.lang.String,
    extensionName: java.lang.String,
    state: vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionRequestState
  ): js.Promise[scala.Double] = js.native
  def resolveRequest(
    rejectMessage: java.lang.String,
    publisherName: java.lang.String,
    extensionName: java.lang.String,
    requesterId: java.lang.String,
    state: vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.ExtensionRequestState
  ): js.Promise[scala.Double] = js.native
  def setDocumentByName(
    doc: js.Any,
    publisherName: java.lang.String,
    extensionName: java.lang.String,
    scopeType: java.lang.String,
    scopeValue: java.lang.String,
    collectionName: java.lang.String
  ): js.Promise[_] = js.native
  def uninstallExtensionByName(publisherName: java.lang.String, extensionName: java.lang.String): js.Promise[scala.Unit] = js.native
  def uninstallExtensionByName(publisherName: java.lang.String, extensionName: java.lang.String, reason: java.lang.String): js.Promise[scala.Unit] = js.native
  def uninstallExtensionByName(
    publisherName: java.lang.String,
    extensionName: java.lang.String,
    reason: java.lang.String,
    reasonCode: java.lang.String
  ): js.Promise[scala.Unit] = js.native
  def updateDocumentByName(
    doc: js.Any,
    publisherName: java.lang.String,
    extensionName: java.lang.String,
    scopeType: java.lang.String,
    scopeValue: java.lang.String,
    collectionName: java.lang.String
  ): js.Promise[_] = js.native
  def updateInstalledExtension(extension: vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtension): js.Promise[
    vsoDashNodeDashApiLib.interfacesExtensionManagementInterfacesMod.InstalledExtension
  ] = js.native
}

