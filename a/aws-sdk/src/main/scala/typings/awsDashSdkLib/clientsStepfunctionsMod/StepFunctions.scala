package typings
package awsDashSdkLib.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StepFunctions
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_StepFunctions: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ClientConfiguration = js.native
  /**
     * Creates an activity. An activity is a task which you write in any programming language and host on any machine which has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask API action and respond using SendTask* API actions. This function lets Step Functions know the existence of your activity and returns an identifier for use in a state machine and when polling from the activity.
     */
  def createActivity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateActivityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an activity. An activity is a task which you write in any programming language and host on any machine which has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask API action and respond using SendTask* API actions. This function lets Step Functions know the existence of your activity and returns an identifier for use in a state machine and when polling from the activity.
     */
  def createActivity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateActivityOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateActivityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an activity. An activity is a task which you write in any programming language and host on any machine which has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask API action and respond using SendTask* API actions. This function lets Step Functions know the existence of your activity and returns an identifier for use in a state machine and when polling from the activity.
     */
  def createActivity(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateActivityInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateActivityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an activity. An activity is a task which you write in any programming language and host on any machine which has access to AWS Step Functions. Activities must poll Step Functions using the GetActivityTask API action and respond using SendTask* API actions. This function lets Step Functions know the existence of your activity and returns an identifier for use in a state machine and when polling from the activity.
     */
  def createActivity(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateActivityInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateActivityOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateActivityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a state machine. A state machine consists of a collection of states that can do work (Task states), determine to which states to transition next (Choice states), stop an execution with an error (Fail states), and so on. State machines are specified using a JSON-based, structured language.
     */
  def createStateMachine(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a state machine. A state machine consists of a collection of states that can do work (Task states), determine to which states to transition next (Choice states), stop an execution with an error (Fail states), and so on. State machines are specified using a JSON-based, structured language.
     */
  def createStateMachine(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateStateMachineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a state machine. A state machine consists of a collection of states that can do work (Task states), determine to which states to transition next (Choice states), stop an execution with an error (Fail states), and so on. State machines are specified using a JSON-based, structured language.
     */
  def createStateMachine(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateStateMachineInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a state machine. A state machine consists of a collection of states that can do work (Task states), determine to which states to transition next (Choice states), stop an execution with an error (Fail states), and so on. State machines are specified using a JSON-based, structured language.
     */
  def createStateMachine(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateStateMachineInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateStateMachineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.CreateStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an activity.
     */
  def deleteActivity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteActivityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an activity.
     */
  def deleteActivity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteActivityOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteActivityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an activity.
     */
  def deleteActivity(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteActivityInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteActivityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an activity.
     */
  def deleteActivity(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteActivityInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteActivityOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteActivityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to DELETING and begins the deletion process. Each state machine execution is deleted the next time it makes a state transition.  The state machine itself is deleted after all executions are completed or deleted. 
     */
  def deleteStateMachine(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to DELETING and begins the deletion process. Each state machine execution is deleted the next time it makes a state transition.  The state machine itself is deleted after all executions are completed or deleted. 
     */
  def deleteStateMachine(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteStateMachineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to DELETING and begins the deletion process. Each state machine execution is deleted the next time it makes a state transition.  The state machine itself is deleted after all executions are completed or deleted. 
     */
  def deleteStateMachine(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteStateMachineInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a state machine. This is an asynchronous operation: It sets the state machine's status to DELETING and begins the deletion process. Each state machine execution is deleted the next time it makes a state transition.  The state machine itself is deleted after all executions are completed or deleted. 
     */
  def deleteStateMachine(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteStateMachineInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteStateMachineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DeleteStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an activity.
     */
  def describeActivity(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeActivityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an activity.
     */
  def describeActivity(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeActivityOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeActivityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an activity.
     */
  def describeActivity(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeActivityInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeActivityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an activity.
     */
  def describeActivity(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeActivityInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeActivityOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeActivityOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an execution.
     */
  def describeExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an execution.
     */
  def describeExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an execution.
     */
  def describeExecution(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeExecutionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an execution.
     */
  def describeExecution(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a state machine.
     */
  def describeStateMachine(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a state machine.
     */
  def describeStateMachine(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a state machine.
     */
  def describeStateMachine(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a state machine.
     */
  def describeStateMachine(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the state machine associated with a specific execution.
     */
  def describeStateMachineForExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineForExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the state machine associated with a specific execution.
     */
  def describeStateMachineForExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineForExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineForExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the state machine associated with a specific execution.
     */
  def describeStateMachineForExecution(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineForExecutionInput
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineForExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the state machine associated with a specific execution.
     */
  def describeStateMachineForExecution(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineForExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineForExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.DescribeStateMachineForExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns a taskToken with a null string.  Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum time the service may hold the poll request). 
     */
  def getActivityTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetActivityTaskOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns a taskToken with a null string.  Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum time the service may hold the poll request). 
     */
  def getActivityTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetActivityTaskOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetActivityTaskOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns a taskToken with a null string.  Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum time the service may hold the poll request). 
     */
  def getActivityTask(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetActivityTaskInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetActivityTaskOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to retrieve a task (with the specified activity ARN) which has been scheduled for execution by a running state machine. This initiates a long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available (i.e. an execution of a task of this type is needed.) The maximum time the service holds on to the request before responding is 60 seconds. If no task is available within 60 seconds, the poll returns a taskToken with a null string.  Workers should set their client side socket timeout to at least 65 seconds (5 seconds higher than the maximum time the service may hold the poll request). 
     */
  def getActivityTask(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetActivityTaskInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetActivityTaskOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetActivityTaskOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the history of the specified execution as a list of events. By default, the results are returned in ascending order of the timeStamp of the events. Use the reverseOrder parameter to get the latest events first. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def getExecutionHistory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetExecutionHistoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the history of the specified execution as a list of events. By default, the results are returned in ascending order of the timeStamp of the events. Use the reverseOrder parameter to get the latest events first. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def getExecutionHistory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetExecutionHistoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetExecutionHistoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the history of the specified execution as a list of events. By default, the results are returned in ascending order of the timeStamp of the events. Use the reverseOrder parameter to get the latest events first. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def getExecutionHistory(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetExecutionHistoryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetExecutionHistoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the history of the specified execution as a list of events. By default, the results are returned in ascending order of the timeStamp of the events. Use the reverseOrder parameter to get the latest events first. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def getExecutionHistory(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetExecutionHistoryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetExecutionHistoryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.GetExecutionHistoryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the existing activities. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def listActivities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListActivitiesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the existing activities. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def listActivities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListActivitiesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListActivitiesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the existing activities. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def listActivities(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListActivitiesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListActivitiesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the existing activities. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def listActivities(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListActivitiesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListActivitiesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListActivitiesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the executions of a state machine that meet the filtering criteria. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def listExecutions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListExecutionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the executions of a state machine that meet the filtering criteria. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def listExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListExecutionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListExecutionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the executions of a state machine that meet the filtering criteria. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def listExecutions(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListExecutionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListExecutionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the executions of a state machine that meet the filtering criteria. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def listExecutions(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListExecutionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListExecutionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListExecutionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the existing state machines. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def listStateMachines(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListStateMachinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the existing state machines. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def listStateMachines(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListStateMachinesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListStateMachinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the existing state machines. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def listStateMachines(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListStateMachinesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListStateMachinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the existing state machines. If a nextToken is returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextToken. Keep all other arguments unchanged.
     */
  def listStateMachines(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListStateMachinesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListStateMachinesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.ListStateMachinesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to report that the task identified by the taskToken failed.
     */
  def sendTaskFailure(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskFailureOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to report that the task identified by the taskToken failed.
     */
  def sendTaskFailure(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskFailureOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskFailureOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to report that the task identified by the taskToken failed.
     */
  def sendTaskFailure(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskFailureInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskFailureOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to report that the task identified by the taskToken failed.
     */
  def sendTaskFailure(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskFailureInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskFailureOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskFailureOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to report to the service that the task represented by the specified taskToken is still making progress. This action resets the Heartbeat clock. The Heartbeat threshold is specified in the state machine's Amazon States Language definition. This action does not in itself create an event in the execution history. However, if the task times out, the execution history contains an ActivityTimedOut event.  The Timeout of a task, defined in the state machine's Amazon States Language definition, is its maximum allowed duration, regardless of the number of SendTaskHeartbeat requests received.   This operation is only useful for long-lived tasks to report the liveliness of the task. 
     */
  def sendTaskHeartbeat(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskHeartbeatOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to report to the service that the task represented by the specified taskToken is still making progress. This action resets the Heartbeat clock. The Heartbeat threshold is specified in the state machine's Amazon States Language definition. This action does not in itself create an event in the execution history. However, if the task times out, the execution history contains an ActivityTimedOut event.  The Timeout of a task, defined in the state machine's Amazon States Language definition, is its maximum allowed duration, regardless of the number of SendTaskHeartbeat requests received.   This operation is only useful for long-lived tasks to report the liveliness of the task. 
     */
  def sendTaskHeartbeat(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskHeartbeatOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskHeartbeatOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to report to the service that the task represented by the specified taskToken is still making progress. This action resets the Heartbeat clock. The Heartbeat threshold is specified in the state machine's Amazon States Language definition. This action does not in itself create an event in the execution history. However, if the task times out, the execution history contains an ActivityTimedOut event.  The Timeout of a task, defined in the state machine's Amazon States Language definition, is its maximum allowed duration, regardless of the number of SendTaskHeartbeat requests received.   This operation is only useful for long-lived tasks to report the liveliness of the task. 
     */
  def sendTaskHeartbeat(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskHeartbeatInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskHeartbeatOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to report to the service that the task represented by the specified taskToken is still making progress. This action resets the Heartbeat clock. The Heartbeat threshold is specified in the state machine's Amazon States Language definition. This action does not in itself create an event in the execution history. However, if the task times out, the execution history contains an ActivityTimedOut event.  The Timeout of a task, defined in the state machine's Amazon States Language definition, is its maximum allowed duration, regardless of the number of SendTaskHeartbeat requests received.   This operation is only useful for long-lived tasks to report the liveliness of the task. 
     */
  def sendTaskHeartbeat(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskHeartbeatInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskHeartbeatOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskHeartbeatOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to report that the task identified by the taskToken completed successfully.
     */
  def sendTaskSuccess(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskSuccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to report that the task identified by the taskToken completed successfully.
     */
  def sendTaskSuccess(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskSuccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskSuccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to report that the task identified by the taskToken completed successfully.
     */
  def sendTaskSuccess(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskSuccessInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskSuccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Used by workers to report that the task identified by the taskToken completed successfully.
     */
  def sendTaskSuccess(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskSuccessInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskSuccessOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.SendTaskSuccessOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a state machine execution.
     */
  def startExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StartExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a state machine execution.
     */
  def startExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StartExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StartExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a state machine execution.
     */
  def startExecution(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StartExecutionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StartExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts a state machine execution.
     */
  def startExecution(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StartExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StartExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StartExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops an execution.
     */
  def stopExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StopExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops an execution.
     */
  def stopExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StopExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StopExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops an execution.
     */
  def stopExecution(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StopExecutionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StopExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops an execution.
     */
  def stopExecution(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StopExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StopExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.StopExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing state machine by modifying its definition and/or roleArn. Running executions will continue to use the previous definition and roleArn.  All StartExecution calls within a few seconds will use the updated definition and roleArn. Executions started immediately after calling UpdateStateMachine may use the previous state machine definition and roleArn. You must include at least one of definition or roleArn or you will receive a MissingRequiredParameter error. 
     */
  def updateStateMachine(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.UpdateStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing state machine by modifying its definition and/or roleArn. Running executions will continue to use the previous definition and roleArn.  All StartExecution calls within a few seconds will use the updated definition and roleArn. Executions started immediately after calling UpdateStateMachine may use the previous state machine definition and roleArn. You must include at least one of definition or roleArn or you will receive a MissingRequiredParameter error. 
     */
  def updateStateMachine(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.UpdateStateMachineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.UpdateStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing state machine by modifying its definition and/or roleArn. Running executions will continue to use the previous definition and roleArn.  All StartExecution calls within a few seconds will use the updated definition and roleArn. Executions started immediately after calling UpdateStateMachine may use the previous state machine definition and roleArn. You must include at least one of definition or roleArn or you will receive a MissingRequiredParameter error. 
     */
  def updateStateMachine(params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.UpdateStateMachineInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.UpdateStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing state machine by modifying its definition and/or roleArn. Running executions will continue to use the previous definition and roleArn.  All StartExecution calls within a few seconds will use the updated definition and roleArn. Executions started immediately after calling UpdateStateMachine may use the previous state machine definition and roleArn. You must include at least one of definition or roleArn or you will receive a MissingRequiredParameter error. 
     */
  def updateStateMachine(
    params: awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.UpdateStateMachineInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.UpdateStateMachineOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsStepfunctionsMod.StepFunctionsNs.UpdateStateMachineOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}
