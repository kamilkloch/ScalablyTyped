package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandInvocation extends js.Object {
  /**
    * CloudWatch Logs information where you want Systems Manager to send the command output.
    */
  var CloudWatchOutputConfig: js.UndefOr[CloudWatchOutputConfig] = js.undefined
  /**
    * The command against which this invocation was requested.
    */
  var CommandId: js.UndefOr[CommandId] = js.undefined
  var CommandPlugins: js.UndefOr[CommandPluginList] = js.undefined
  /**
    * User-specified information about the command, such as a brief description of what the command should do.
    */
  var Comment: js.UndefOr[Comment] = js.undefined
  /**
    * The document name that was requested for execution.
    */
  var DocumentName: js.UndefOr[DocumentName] = js.undefined
  /**
    * The SSM document version.
    */
  var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
  /**
    * The instance ID in which this invocation was requested.
    */
  var InstanceId: js.UndefOr[InstanceId] = js.undefined
  /**
    * The name of the invocation target. For Amazon EC2 instances this is the value for the aws:Name tag. For on-premises instances, this is the name of the instance.
    */
  var InstanceName: js.UndefOr[InstanceTagName] = js.undefined
  /**
    * Configurations for sending notifications about command status changes on a per instance basis.
    */
  var NotificationConfig: js.UndefOr[NotificationConfig] = js.undefined
  /**
    * The time and date the request was sent to this instance.
    */
  var RequestedDateTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes on a per instance basis.
    */
  var ServiceRole: js.UndefOr[ServiceRole] = js.undefined
  /**
    * The URL to the plugin's StdErr file in Amazon S3, if the Amazon S3 bucket was defined for the parent command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the Amazon S3 bucket was defined for the command.
    */
  var StandardErrorUrl: js.UndefOr[Url] = js.undefined
  /**
    * The URL to the plugin's StdOut file in Amazon S3, if the Amazon S3 bucket was defined for the parent command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the Amazon S3 bucket was defined for the command.
    */
  var StandardOutputUrl: js.UndefOr[Url] = js.undefined
  /**
    * Whether or not the invocation succeeded, failed, or is pending.
    */
  var Status: js.UndefOr[CommandInvocationStatus] = js.undefined
  /**
    * A detailed status of the command execution for each invocation (each instance targeted by the command). StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding Command Statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to the instance.   In Progress: The command has been sent to the instance but has not reached a terminal state.   Success: The execution of the command or plugin was successfully completed. This is a terminal state.   Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
    */
  var StatusDetails: js.UndefOr[StatusDetails] = js.undefined
  /**
    *  Gets the trace output sent by the agent. 
    */
  var TraceOutput: js.UndefOr[InvocationTraceOutput] = js.undefined
}

object CommandInvocation {
  @scala.inline
  def apply(
    CloudWatchOutputConfig: CloudWatchOutputConfig = null,
    CommandId: CommandId = null,
    CommandPlugins: CommandPluginList = null,
    Comment: Comment = null,
    DocumentName: DocumentName = null,
    DocumentVersion: DocumentVersion = null,
    InstanceId: InstanceId = null,
    InstanceName: InstanceTagName = null,
    NotificationConfig: NotificationConfig = null,
    RequestedDateTime: DateTime = null,
    ServiceRole: ServiceRole = null,
    StandardErrorUrl: Url = null,
    StandardOutputUrl: Url = null,
    Status: CommandInvocationStatus = null,
    StatusDetails: StatusDetails = null,
    TraceOutput: InvocationTraceOutput = null
  ): CommandInvocation = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchOutputConfig != null) __obj.updateDynamic("CloudWatchOutputConfig")(CloudWatchOutputConfig)
    if (CommandId != null) __obj.updateDynamic("CommandId")(CommandId)
    if (CommandPlugins != null) __obj.updateDynamic("CommandPlugins")(CommandPlugins)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    if (DocumentName != null) __obj.updateDynamic("DocumentName")(DocumentName)
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (InstanceName != null) __obj.updateDynamic("InstanceName")(InstanceName)
    if (NotificationConfig != null) __obj.updateDynamic("NotificationConfig")(NotificationConfig)
    if (RequestedDateTime != null) __obj.updateDynamic("RequestedDateTime")(RequestedDateTime)
    if (ServiceRole != null) __obj.updateDynamic("ServiceRole")(ServiceRole)
    if (StandardErrorUrl != null) __obj.updateDynamic("StandardErrorUrl")(StandardErrorUrl)
    if (StandardOutputUrl != null) __obj.updateDynamic("StandardOutputUrl")(StandardOutputUrl)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails)
    if (TraceOutput != null) __obj.updateDynamic("TraceOutput")(TraceOutput)
    __obj.asInstanceOf[CommandInvocation]
  }
}

