package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email mailbox located on a remote email server. */
@JSGlobal("Windows.ApplicationModel.Email.EmailMailbox")
@js.native
abstract class EmailMailbox () extends js.Object {
  /** Gets the capabilities associated with the mailbox. */
  var capabilities: EmailMailboxCapabilities = js.native
  /** Gets the EmailMailboxChangeTracker for this mailbox. */
  var changeTracker: EmailMailboxChangeTracker = js.native
  /** Gets or sets the name for this mailbox that is suitable for displaying. */
  var displayName: java.lang.String = js.native
  /** Gets the ID for this mailbox. */
  var id: java.lang.String = js.native
  /** Gets a Boolean value that indicates if email data is encrypted when the device is locked. */
  var isDataEncryptedUnderLock: scala.Boolean = js.native
  /** Gets a Boolean value that indicates if this mailbox is owned by the current app. */
  var isOwnedByCurrentApp: scala.Boolean = js.native
  /** Gets the identifier for a mailbox linked to this one. */
  var linkedMailboxId: java.lang.String = js.native
  /** Gets or sets the email address for the mailbox. */
  var mailAddress: java.lang.String = js.native
  /** Gets the list of email aliases associated with this mailbox. */
  var mailAddressAliases: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets the identifier of the email mailbox account within its network. */
  var networkAccountId: java.lang.String = js.native
  /** Gets the identifier of the network associated with this email mailbox. */
  var networkId: java.lang.String = js.native
  /** Occurs when the mailbox has changed. */
  @JSName("onmailboxchanged")
  var onmailboxchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EmailMailbox, EmailMailboxChangedEventArgs] = js.native
  /** Gets or sets the read access level to this mailbox for other apps. */
  var otherAppReadAccess: EmailMailboxOtherAppReadAccess = js.native
  /** Gets or sets the write access level to this mailbox for other apps. */
  var otherAppWriteAccess: EmailMailboxOtherAppWriteAccess = js.native
  /** Gets the security policies for attachments in this mailbox. */
  var policies: EmailMailboxPolicies = js.native
  /** Gets the display name of the source mailbox. */
  var sourceDisplayName: java.lang.String = js.native
  /** Gets the sync manager for the mailbox. */
  var syncManager: EmailMailboxSyncManager = js.native
  /** Gets the ID of the user data account for the mailbox. */
  var userDataAccountId: java.lang.String = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mailboxchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mailboxchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EmailMailbox, EmailMailboxChangedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Asynchronously changes the flag state of an email message.
                   * @param messageId The ID of the email message to change.
                   * @param flagState The new email flag state.
                   * @return An async action indicating that the operation has completed.
                   */
  def changeMessageFlagStateAsync(messageId: java.lang.String, flagState: EmailFlagState): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Creates a new response email such as Reply, Reply All, Forward, and so on.
                   * @param messageId The ID of the message to which to respond.
                   * @param responseType The type of response such as Reply, Reply All, Forward, and so on.
                   * @param subject The subject for the response message.
                   * @param responseHeaderType The format of the email body such as plain text or HTML.
                   * @param responseHeader The header for the response message.
                   * @return The newly created response email message.
                   */
  def createResponseMessageAsync(
    messageId: java.lang.String,
    responseType: EmailMessageResponseKind,
    subject: java.lang.String,
    responseHeaderType: EmailMessageBodyKind,
    responseHeader: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[EmailMessage] = js.native
  /**
                   * Asynchronously deletes the mailbox.
                   * @return An async action indicating that the operation has completed.
                   */
  def deleteAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously deletes an email message from the mailbox.
                   * @param messageId The ID of the email message to delete.
                   * @return An async action indicating that the operation has completed.
                   */
  def deleteMessageAsync(messageId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously downloads an email attachment.
                   * @param attachmentId The ID of the attachment to download.
                   * @return An async action indicating that the operation has completed.
                   */
  def downloadAttachmentAsync(attachmentId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously downloads the specified email message.
                   * @param messageId The ID of the message to download.
                   * @return An async action indicating that the operation has completed.
                   */
  def downloadMessageAsync(messageId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously gets the specified email conversation.
                   * @param id The ID of the email conversation to retrieve.
                   * @return Returns the email conversation specified by the id parameter.
                   */
  def getConversationAsync(id: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[EmailConversation] = js.native
  /**
                   * Gets or creates an email conversation reader for this mailbox if one does not already exist.
                   * @return The email conversation reader.
                   */
  def getConversationReader(): EmailConversationReader = js.native
  /**
                   * Gets or creates an email conversation reader for this mailbox using the specified query options.
                   * @param options The email query options to use when creating the conversation reader.
                   * @return The new or existing conversation reader.
                   */
  def getConversationReader(options: EmailQueryOptions): EmailConversationReader = js.native
  /**
                   * Asynchronously gets the specified email folder.
                   * @param id The ID of the folder to retrieve.
                   * @return The email folder specified in the id parameter.
                   */
  def getFolderAsync(id: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[EmailFolder] = js.native
  /**
                   * Asynchronously gets the specified email message.
                   * @param id The ID of the message to retrieve.
                   * @return The email message specified in the id parameter.
                   */
  def getMessageAsync(id: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[EmailMessage] = js.native
  /**
                   * Gets or creates an email message reader for this mailbox if one does not already exist.
                   * @return The new or existing email message reader.
                   */
  def getMessageReader(): EmailMessageReader = js.native
  /**
                   * Gets or creates an email conversation reader for this mailbox using the specified query options.
                   * @param options The email query options to use when creating the message reader.
                   * @return The new or existing email message reader.
                   */
  def getMessageReader(options: EmailQueryOptions): EmailMessageReader = js.native
  /**
                   * Asynchronously get a special email folder such as Inbox, Outbox, Drafts and so on.
                   * @param folderType The type of folder to retrieve.
                   * @return The matching special email folder in this mailbox.
                   */
  def getSpecialFolderAsync(folderType: EmailSpecialFolderKind): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[EmailFolder] = js.native
  /**
                   * Asynchronously marks all the messages in a folder as seen.
                   * @param folderId The ID of the folder to mark as seen.
                   * @return An async action indicating that the operation has completed.
                   */
  def markFolderAsSeenAsync(folderId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously marks a folder as sync enabled or disabled.
                   * @param folderId The ID of the folder to mark.
                   * @param isSyncEnabled True to enable to syncing with the server, false to disable syncing.
                   * @return An async action indicating that the operation has completed.
                   */
  def markFolderSyncEnabledAsync(folderId: java.lang.String, isSyncEnabled: scala.Boolean): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously marks an email message as seen.
                   * @param messageId The ID of the message to mark as seen.
                   * @return An async action indicating that the operation has completed.
                   */
  def markMessageAsSeenAsync(messageId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously marks an email message as read or unread.
                   * @param messageId The ID of the message to mark.
                   * @param isRead True to mark the message as read, false to mark it as unread.
                   * @return An async action indicating that the operation has completed.
                   */
  def markMessageReadAsync(messageId: java.lang.String, isRead: scala.Boolean): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Occurs when the mailbox has changed. */
  def onmailboxchanged(ev: EmailMailboxChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[EmailMailbox]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mailboxchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.mailboxchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[EmailMailbox, EmailMailboxChangedEventArgs]
  ): scala.Unit = js.native
  /**
                   * Resolves a list of one or more email addresses.
                   * @param recipients The list of email addresses.
                   * @return A list of resolution results. The result list will be in the same order as the input list. See EmailRecipientResolutionResult for more information.
                   */
  def resolveRecipientsAsync(recipients: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
                   * Asynchronously saves the mailbox to the email store.
                   * @return An async action indicating that the operation has completed.
                   */
  def saveAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously saves a draft email message.
                   * @param message The draft email message to save.
                   * @return An async action indicating that the operation has completed.
                   */
  def saveDraftAsync(message: EmailMessage): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously sends the specified email message.
                   * @param message The email message to send.
                   * @return An async action indicating that the operation has completed.
                   */
  def sendMessageAsync(message: EmailMessage): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously sends the specified email message.
                   * @param message The email message to send.
                   * @param smartSend True to send only the updated text, false to include the full message thread.
                   * @return An async action indicating that the operation has completed.
                   */
  def sendMessageAsync(message: EmailMessage, smartSend: scala.Boolean): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
                   * Asynchronously attempts to create a new email folder.
                   * @param parentFolderId The Id of the parent email folder.
                   * @param name The name for the new folder.
                   * @return An async operation with an EmailMailboxCreateFolderResult containing the newly created folder and the status of the create operation.
                   */
  def tryCreateFolderAsync(parentFolderId: java.lang.String, name: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[EmailMailboxCreateFolderResult] = js.native
  /**
                   * Asynchronously attempts to delete an email folder.
                   * @param folderId The Id of the folder to delete.
                   * @return An async operation with an EmailMailboxDeleteFolderStatus value representing the status of the delete operation.
                   */
  def tryDeleteFolderAsync(folderId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[EmailMailboxDeleteFolderStatus] = js.native
  /**
                   * Asynchronously attempt to delete the contents of an email folder.
                   * @param folderId The Id of the folder to empty.
                   * @return An async operation with an EmailMailboxEmptyFolderStatus value representing the status of the delete operation.
                   */
  def tryEmptyFolderAsync(folderId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[EmailMailboxEmptyFolderStatus] = js.native
  /**
                   * Asynchronously attempts to forward a meeting request.
                   * @param meeting The meeting to forward.
                   * @param recipients The list of new recipients.
                   * @param subject The subject of the email.
                   * @param forwardHeaderType The email message format, HTML or plain text.
                   * @param forwardHeader The email forward header.
                   * @param comment The body of the message.
                   * @return A Boolean value indicating if the meeting was successfully forwarded.
                   */
  def tryForwardMeetingAsync(
    meeting: EmailMessage,
    recipients: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[EmailRecipient],
    subject: java.lang.String,
    forwardHeaderType: EmailMessageBodyKind,
    forwardHeader: java.lang.String,
    comment: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Asynchronously attempts to get the auto-reply settings for the mailbox.
                   * @param requestedFormat The requested text format of the auto-reply message, HTML or plain text.
                   * @return The auto-reply settings.
                   */
  def tryGetAutoReplySettingsAsync(requestedFormat: EmailMailboxAutoReplyMessageResponseKind): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[EmailMailboxAutoReplySettings] = js.native
  /**
                   * Asynchronously attempts to move the specified email folder.
                   * @param folderId The folder to move.
                   * @param newParentFolderId The new parent for the folder specified in the folderId parameter.
                   * @return A Boolean value indicating if the move was successful.
                   */
  def tryMoveFolderAsync(folderId: java.lang.String, newParentFolderId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Asynchronously attempts to move the specified email folder and rename it in the process.
                   * @param folderId The folder to move.
                   * @param newParentFolderId The new parent for the folder specified in the folderId parameter.
                   * @param newFolderName The name for the folder in the new location.
                   * @return A Boolean value indicating if the move was successful.
                   */
  def tryMoveFolderAsync(folderId: java.lang.String, newParentFolderId: java.lang.String, newFolderName: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Asynchronously attempts to move the specified email message.
                   * @param messageId The ID of the email message to move.
                   * @param newParentFolderId The ID of the new folder where the email message should reside.
                   * @return A Boolean value indicating if the move was successful.
                   */
  def tryMoveMessageAsync(messageId: java.lang.String, newParentFolderId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Asynchronously attempts to send a meeting request proposing a new time.
                   * @param meeting The meeting for which to propose a new time.
                   * @param newStartTime The proposed new time for the meeting to start.
                   * @param newDuration The proposed duration of the meeting.
                   * @param subject The subject of the meeting email.
                   * @param comment The body of the message.
                   * @return A Boolean value indicating if the proposed meeting message was successfully sent.
                   */
  def tryProposeNewTimeForMeetingAsync(
    meeting: EmailMessage,
    newStartTime: stdLib.Date,
    newDuration: scala.Double,
    subject: java.lang.String,
    comment: java.lang.String
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Asynchronously attempts to set the auto-reply settings for the mailbox.
                   * @param autoReplySettings The new auto-reply settings.
                   * @return A Boolean value indicating if the operation was successful.
                   */
  def trySetAutoReplySettingsAsync(autoReplySettings: EmailMailboxAutoReplySettings): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Asynchronously attempts to respond to a meeting request.
                   * @param meeting The meeting request.
                   * @param response The response to the meeting request, accept, decline, or tentative.
                   * @param subject The subject of the response email message.
                   * @param comment The body of the response email message.
                   * @param sendUpdate A Boolean indicating whether or not to send a response to the meeting originator.
                   * @return A Boolean value indicating if the response was sent successfully.
                   */
  def tryUpdateMeetingResponseAsync(
    meeting: EmailMessage,
    response: EmailMeetingResponseType,
    subject: java.lang.String,
    comment: java.lang.String,
    sendUpdate: scala.Boolean
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Validates the certificate against the sync provider service.
                   * @param certificates The certificate to validate.
                   * @return The confirmation that the certificate is valid.
                   */
  def validateCertificatesAsync(
    certificates: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.Certificate]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
}
