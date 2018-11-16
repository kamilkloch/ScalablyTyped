package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/xray", "XRay")
@js.native
object XRayNs extends js.Object {
  
  trait Alias extends js.Object {
    /**
         * The canonical name of the alias.
         */
    var Name: js.UndefOr[java.lang.String] = js.undefined
    /**
         * A list of names for the alias, including the canonical name.
         */
    var Names: js.UndefOr[AliasNames] = js.undefined
    /**
         * The type of the alias.
         */
    var Type: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait AnnotationValue extends js.Object {
    /**
         * Value for a Boolean annotation.
         */
    var BooleanValue: js.UndefOr[NullableBoolean] = js.undefined
    /**
         * Value for a Number annotation.
         */
    var NumberValue: js.UndefOr[NullableDouble] = js.undefined
    /**
         * Value for a String annotation.
         */
    var StringValue: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait Annotations
    extends /* key */ ScalablyTyped.runtime.StringDictionary[ValuesWithServiceIds]
  
  
  trait AttributeMap
    extends /* key */ ScalablyTyped.runtime.StringDictionary[AttributeValue]
  
  
  trait BackendConnectionErrors extends js.Object {
    /**
         * 
         */
    var ConnectionRefusedCount: js.UndefOr[NullableInteger] = js.undefined
    /**
         * 
         */
    var HTTPCode4XXCount: js.UndefOr[NullableInteger] = js.undefined
    /**
         * 
         */
    var HTTPCode5XXCount: js.UndefOr[NullableInteger] = js.undefined
    /**
         * 
         */
    var OtherCount: js.UndefOr[NullableInteger] = js.undefined
    /**
         * 
         */
    var TimeoutCount: js.UndefOr[NullableInteger] = js.undefined
    /**
         * 
         */
    var UnknownHostCount: js.UndefOr[NullableInteger] = js.undefined
  }
  
  
  trait BatchGetTracesRequest extends js.Object {
    /**
         * Pagination token. Not used.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Specify the trace IDs of requests for which to retrieve segments.
         */
    var TraceIds: TraceIdList
  }
  
  
  trait BatchGetTracesResult extends js.Object {
    /**
         * Pagination token. Not used.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Full traces for the specified requests.
         */
    var Traces: js.UndefOr[TraceList] = js.undefined
    /**
         * Trace IDs of requests that haven't been processed.
         */
    var UnprocessedTraceIds: js.UndefOr[UnprocessedTraceIdList] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CreateSamplingRuleRequest extends js.Object {
    /**
         * The rule definition.
         */
    var SamplingRule: SamplingRule
  }
  
  
  trait CreateSamplingRuleResult extends js.Object {
    /**
         * The saved rule definition and metadata.
         */
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined
  }
  
  
  trait DeleteSamplingRuleRequest extends js.Object {
    /**
         * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
         */
    var RuleARN: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
         */
    var RuleName: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait DeleteSamplingRuleResult extends js.Object {
    /**
         * The deleted rule definition and metadata.
         */
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined
  }
  
  
  trait Edge extends js.Object {
    /**
         * Aliases for the edge.
         */
    var Aliases: js.UndefOr[AliasList] = js.undefined
    /**
         * The end time of the last segment on the edge.
         */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Identifier of the edge. Unique within a service map.
         */
    var ReferenceId: js.UndefOr[NullableInteger] = js.undefined
    /**
         * A histogram that maps the spread of client response times on an edge.
         */
    var ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined
    /**
         * The start time of the first segment on the edge.
         */
    var StartTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Response statistics for segments on the edge.
         */
    var SummaryStatistics: js.UndefOr[EdgeStatistics] = js.undefined
  }
  
  
  trait EdgeStatistics extends js.Object {
    /**
         * Information about requests that failed with a 4xx Client Error status code.
         */
    var ErrorStatistics: js.UndefOr[ErrorStatistics] = js.undefined
    /**
         * Information about requests that failed with a 5xx Server Error status code.
         */
    var FaultStatistics: js.UndefOr[FaultStatistics] = js.undefined
    /**
         * The number of requests that completed with a 2xx Success status code.
         */
    var OkCount: js.UndefOr[NullableLong] = js.undefined
    /**
         * The total number of completed requests.
         */
    var TotalCount: js.UndefOr[NullableLong] = js.undefined
    /**
         * The aggregate response time of completed requests.
         */
    var TotalResponseTime: js.UndefOr[NullableDouble] = js.undefined
  }
  
  
  trait EncryptionConfig extends js.Object {
    /**
         * The ID of the customer master key (CMK) used for encryption, if applicable.
         */
    var KeyId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The encryption status. While the status is UPDATING, X-Ray may encrypt data with a combination of the new and old settings.
         */
    var Status: js.UndefOr[EncryptionStatus] = js.undefined
    /**
         * The type of encryption. Set to KMS for encryption with CMKs. Set to NONE for default encryption.
         */
    var Type: js.UndefOr[EncryptionType] = js.undefined
  }
  
  
  trait ErrorStatistics extends js.Object {
    /**
         * The number of requests that failed with untracked 4xx Client Error status codes.
         */
    var OtherCount: js.UndefOr[NullableLong] = js.undefined
    /**
         * The number of requests that failed with a 419 throttling status code.
         */
    var ThrottleCount: js.UndefOr[NullableLong] = js.undefined
    /**
         * The total number of requests that failed with a 4xx Client Error status code.
         */
    var TotalCount: js.UndefOr[NullableLong] = js.undefined
  }
  
  
  trait FaultStatistics extends js.Object {
    /**
         * The number of requests that failed with untracked 5xx Server Error status codes.
         */
    var OtherCount: js.UndefOr[NullableLong] = js.undefined
    /**
         * The total number of requests that failed with a 5xx Server Error status code.
         */
    var TotalCount: js.UndefOr[NullableLong] = js.undefined
  }
  
  
  trait GetEncryptionConfigRequest extends js.Object
  
  
  trait GetEncryptionConfigResult extends js.Object {
    /**
         * The encryption configuration document.
         */
    var EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
  }
  
  
  trait GetSamplingRulesRequest extends js.Object {
    /**
         * Pagination token. Not used.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait GetSamplingRulesResult extends js.Object {
    /**
         * Pagination token. Not used.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Rule definitions and metadata.
         */
    var SamplingRuleRecords: js.UndefOr[SamplingRuleRecordList] = js.undefined
  }
  
  
  trait GetSamplingStatisticSummariesRequest extends js.Object {
    /**
         * Pagination token. Not used.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait GetSamplingStatisticSummariesResult extends js.Object {
    /**
         * Pagination token. Not used.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Information about the number of requests instrumented for each sampling rule.
         */
    var SamplingStatisticSummaries: js.UndefOr[SamplingStatisticSummaryList] = js.undefined
  }
  
  
  trait GetSamplingTargetsRequest extends js.Object {
    /**
         * Information about rules that the service is using to sample requests.
         */
    var SamplingStatisticsDocuments: SamplingStatisticsDocumentList
  }
  
  
  trait GetSamplingTargetsResult extends js.Object {
    /**
         * The last time a user changed the sampling rule configuration. If the sampling rule configuration changed since the service last retrieved it, the service should call GetSamplingRules to get the latest version.
         */
    var LastRuleModification: js.UndefOr[Timestamp] = js.undefined
    /**
         * Updated rules that the service should use to sample requests.
         */
    var SamplingTargetDocuments: js.UndefOr[SamplingTargetDocumentList] = js.undefined
    /**
         * Information about SamplingStatisticsDocument that X-Ray could not process.
         */
    var UnprocessedStatistics: js.UndefOr[UnprocessedStatisticsList] = js.undefined
  }
  
  
  trait GetServiceGraphRequest extends js.Object {
    /**
         * The end of the time frame for which to generate a graph.
         */
    var EndTime: Timestamp
    /**
         * Pagination token. Not used.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The start of the time frame for which to generate a graph.
         */
    var StartTime: Timestamp
  }
  
  
  trait GetServiceGraphResult extends js.Object {
    /**
         * The end of the time frame for which the graph was generated.
         */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Pagination token. Not used.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The services that have processed a traced request during the specified time frame.
         */
    var Services: js.UndefOr[ServiceList] = js.undefined
    /**
         * The start of the time frame for which the graph was generated.
         */
    var StartTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait GetTraceGraphRequest extends js.Object {
    /**
         * Pagination token. Not used.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Trace IDs of requests for which to generate a service graph.
         */
    var TraceIds: TraceIdList
  }
  
  
  trait GetTraceGraphResult extends js.Object {
    /**
         * Pagination token. Not used.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The services that have processed one of the specified requests.
         */
    var Services: js.UndefOr[ServiceList] = js.undefined
  }
  
  
  trait GetTraceSummariesRequest extends js.Object {
    /**
         * The end of the time frame for which to retrieve traces.
         */
    var EndTime: Timestamp
    /**
         * Specify a filter expression to retrieve trace summaries for services or requests that meet certain requirements.
         */
    var FilterExpression: js.UndefOr[FilterExpression] = js.undefined
    /**
         * Specify the pagination token returned by a previous request to retrieve the next page of results.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Set to true to get summaries for only a subset of available traces.
         */
    var Sampling: js.UndefOr[NullableBoolean] = js.undefined
    /**
         * The start of the time frame for which to retrieve traces.
         */
    var StartTime: Timestamp
  }
  
  
  trait GetTraceSummariesResult extends js.Object {
    /**
         * The start time of this page of results.
         */
    var ApproximateTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * If the requested time frame contained more than one page of results, you can use this token to retrieve the next page. The first page contains the most most recent results, closest to the end of the time frame.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Trace IDs and metadata for traces that were found in the specified time frame.
         */
    var TraceSummaries: js.UndefOr[TraceSummaryList] = js.undefined
    /**
         * The total number of traces processed, including traces that did not match the specified filter expression.
         */
    var TracesProcessedCount: js.UndefOr[NullableLong] = js.undefined
  }
  
  
  trait HistogramEntry extends js.Object {
    /**
         * The prevalence of the entry.
         */
    var Count: js.UndefOr[Integer] = js.undefined
    /**
         * The value of the entry.
         */
    var Value: js.UndefOr[Double] = js.undefined
  }
  
  
  trait Http extends js.Object {
    /**
         * The IP address of the requestor.
         */
    var ClientIp: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The request method.
         */
    var HttpMethod: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The response status.
         */
    var HttpStatus: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The request URL.
         */
    var HttpURL: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The request's user agent string.
         */
    var UserAgent: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait PutEncryptionConfigRequest extends js.Object {
    /**
         * An AWS KMS customer master key (CMK) in one of the following formats:    Alias - The name of the key. For example, alias/MyKey.    Key ID - The KMS key ID of the key. For example, ae4aa6d49-a4d8-9df9-a475-4ff6d7898456.    ARN - The full Amazon Resource Name of the key ID or alias. For example, arn:aws:kms:us-east-2:123456789012:key/ae4aa6d49-a4d8-9df9-a475-4ff6d7898456. Use this format to specify a key in a different account.   Omit this key if you set Type to NONE.
         */
    var KeyId: js.UndefOr[EncryptionKeyId] = js.undefined
    /**
         * The type of encryption. Set to KMS to use your own key for encryption. Set to NONE for default encryption.
         */
    var Type: EncryptionType
  }
  
  
  trait PutEncryptionConfigResult extends js.Object {
    /**
         * The new encryption configuration.
         */
    var EncryptionConfig: js.UndefOr[EncryptionConfig] = js.undefined
  }
  
  
  trait PutTelemetryRecordsRequest extends js.Object {
    /**
         * 
         */
    var EC2InstanceId: js.UndefOr[EC2InstanceId] = js.undefined
    /**
         * 
         */
    var Hostname: js.UndefOr[Hostname] = js.undefined
    /**
         * 
         */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
         * 
         */
    var TelemetryRecords: TelemetryRecordList
  }
  
  
  trait PutTelemetryRecordsResult extends js.Object
  
  
  trait PutTraceSegmentsRequest extends js.Object {
    /**
         * A string containing a JSON document defining one or more segments or subsegments.
         */
    var TraceSegmentDocuments: TraceSegmentDocumentList
  }
  
  
  trait PutTraceSegmentsResult extends js.Object {
    /**
         * Segments that failed processing.
         */
    var UnprocessedTraceSegments: js.UndefOr[UnprocessedTraceSegmentList] = js.undefined
  }
  
  
  trait SamplingRule extends js.Object {
    /**
         * Matches attributes derived from the request.
         */
    var Attributes: js.UndefOr[AttributeMap] = js.undefined
    /**
         * The percentage of matching requests to instrument, after the reservoir is exhausted.
         */
    var FixedRate: FixedRate
    /**
         * Matches the HTTP method of a request.
         */
    var HTTPMethod: HTTPMethod
    /**
         * Matches the hostname from a request URL.
         */
    var Host: Host
    /**
         * The priority of the sampling rule.
         */
    var Priority: Priority
    /**
         * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
         */
    var ReservoirSize: ReservoirSize
    /**
         * Matches the ARN of the AWS resource on which the service runs.
         */
    var ResourceARN: ResourceARN
    /**
         * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
         */
    var RuleARN: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
         */
    var RuleName: js.UndefOr[RuleName] = js.undefined
    /**
         * Matches the name that the service uses to identify itself in segments.
         */
    var ServiceName: ServiceName
    /**
         * Matches the origin that the service uses to identify its type in segments.
         */
    var ServiceType: ServiceType
    /**
         * Matches the path from a request URL.
         */
    var URLPath: URLPath
    /**
         * The version of the sampling rule format (1).
         */
    var Version: Version
  }
  
  
  trait SamplingRuleRecord extends js.Object {
    /**
         * When the rule was created.
         */
    var CreatedAt: js.UndefOr[Timestamp] = js.undefined
    /**
         * When the rule was last modified.
         */
    var ModifiedAt: js.UndefOr[Timestamp] = js.undefined
    /**
         * The sampling rule.
         */
    var SamplingRule: js.UndefOr[SamplingRule] = js.undefined
  }
  
  
  trait SamplingRuleUpdate extends js.Object {
    /**
         * Matches attributes derived from the request.
         */
    var Attributes: js.UndefOr[AttributeMap] = js.undefined
    /**
         * The percentage of matching requests to instrument, after the reservoir is exhausted.
         */
    var FixedRate: js.UndefOr[NullableDouble] = js.undefined
    /**
         * Matches the HTTP method of a request.
         */
    var HTTPMethod: js.UndefOr[HTTPMethod] = js.undefined
    /**
         * Matches the hostname from a request URL.
         */
    var Host: js.UndefOr[Host] = js.undefined
    /**
         * The priority of the sampling rule.
         */
    var Priority: js.UndefOr[NullableInteger] = js.undefined
    /**
         * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
         */
    var ReservoirSize: js.UndefOr[NullableInteger] = js.undefined
    /**
         * Matches the ARN of the AWS resource on which the service runs.
         */
    var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
    /**
         * The ARN of the sampling rule. Specify a rule by either name or ARN, but not both.
         */
    var RuleARN: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The name of the sampling rule. Specify a rule by either name or ARN, but not both.
         */
    var RuleName: js.UndefOr[RuleName] = js.undefined
    /**
         * Matches the name that the service uses to identify itself in segments.
         */
    var ServiceName: js.UndefOr[ServiceName] = js.undefined
    /**
         * Matches the origin that the service uses to identify its type in segments.
         */
    var ServiceType: js.UndefOr[ServiceType] = js.undefined
    /**
         * Matches the path from a request URL.
         */
    var URLPath: js.UndefOr[URLPath] = js.undefined
  }
  
  
  trait SamplingStatisticSummary extends js.Object {
    /**
         * The number of requests recorded with borrowed reservoir quota.
         */
    var BorrowCount: js.UndefOr[Integer] = js.undefined
    /**
         * The number of requests that matched the rule.
         */
    var RequestCount: js.UndefOr[Integer] = js.undefined
    /**
         * The name of the sampling rule.
         */
    var RuleName: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The number of requests recorded.
         */
    var SampledCount: js.UndefOr[Integer] = js.undefined
    /**
         * The start time of the reporting window.
         */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait SamplingStatisticsDocument extends js.Object {
    /**
         * The number of requests recorded with borrowed reservoir quota.
         */
    var BorrowCount: js.UndefOr[BorrowCount] = js.undefined
    /**
         * A unique identifier for the service in hexadecimal.
         */
    var ClientID: ClientID
    /**
         * The number of requests that matched the rule.
         */
    var RequestCount: RequestCount
    /**
         * The name of the sampling rule.
         */
    var RuleName: RuleName
    /**
         * The number of requests recorded.
         */
    var SampledCount: SampledCount
    /**
         * The current time.
         */
    var Timestamp: Timestamp
  }
  
  
  trait SamplingTargetDocument extends js.Object {
    /**
         * The percentage of matching requests to instrument, after the reservoir is exhausted.
         */
    var FixedRate: js.UndefOr[Double] = js.undefined
    /**
         * The number of seconds for the service to wait before getting sampling targets again.
         */
    var Interval: js.UndefOr[NullableInteger] = js.undefined
    /**
         * The number of requests per second that X-Ray allocated this service.
         */
    var ReservoirQuota: js.UndefOr[NullableInteger] = js.undefined
    /**
         * When the reservoir quota expires.
         */
    var ReservoirQuotaTTL: js.UndefOr[Timestamp] = js.undefined
    /**
         * The name of the sampling rule.
         */
    var RuleName: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait Segment extends js.Object {
    /**
         * The segment document.
         */
    var Document: js.UndefOr[SegmentDocument] = js.undefined
    /**
         * The segment's ID.
         */
    var Id: js.UndefOr[SegmentId] = js.undefined
  }
  
  
  trait Service extends js.Object {
    /**
         * Identifier of the AWS account in which the service runs.
         */
    var AccountId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * A histogram that maps the spread of service durations.
         */
    var DurationHistogram: js.UndefOr[Histogram] = js.undefined
    /**
         * Connections to downstream services.
         */
    var Edges: js.UndefOr[EdgeList] = js.undefined
    /**
         * The end time of the last segment that the service generated.
         */
    var EndTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The canonical name of the service.
         */
    var Name: js.UndefOr[java.lang.String] = js.undefined
    /**
         * A list of names for the service, including the canonical name.
         */
    var Names: js.UndefOr[ServiceNames] = js.undefined
    /**
         * Identifier for the service. Unique within the service map.
         */
    var ReferenceId: js.UndefOr[NullableInteger] = js.undefined
    /**
         * A histogram that maps the spread of service response times.
         */
    var ResponseTimeHistogram: js.UndefOr[Histogram] = js.undefined
    /**
         * Indicates that the service was the first service to process a request.
         */
    var Root: js.UndefOr[NullableBoolean] = js.undefined
    /**
         * The start time of the first segment that the service generated.
         */
    var StartTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The service's state.
         */
    var State: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Aggregated statistics for the service.
         */
    var SummaryStatistics: js.UndefOr[ServiceStatistics] = js.undefined
    /**
         * The type of service.   AWS Resource - The type of an AWS resource. For example, AWS::EC2::Instance for a application running on Amazon EC2 or AWS::DynamoDB::Table for an Amazon DynamoDB table that the application used.   AWS Service - The type of an AWS service. For example, AWS::DynamoDB for downstream calls to Amazon DynamoDB that didn't target a specific table.    client - Represents the clients that sent requests to a root service.    remote - A downstream service of indeterminate type.  
         */
    var Type: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ServiceId extends js.Object {
    /**
         * 
         */
    var AccountId: js.UndefOr[java.lang.String] = js.undefined
    /**
         * 
         */
    var Name: js.UndefOr[java.lang.String] = js.undefined
    /**
         * 
         */
    var Names: js.UndefOr[ServiceNames] = js.undefined
    /**
         * 
         */
    var Type: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ServiceStatistics extends js.Object {
    /**
         * Information about requests that failed with a 4xx Client Error status code.
         */
    var ErrorStatistics: js.UndefOr[ErrorStatistics] = js.undefined
    /**
         * Information about requests that failed with a 5xx Server Error status code.
         */
    var FaultStatistics: js.UndefOr[FaultStatistics] = js.undefined
    /**
         * The number of requests that completed with a 2xx Success status code.
         */
    var OkCount: js.UndefOr[NullableLong] = js.undefined
    /**
         * The total number of completed requests.
         */
    var TotalCount: js.UndefOr[NullableLong] = js.undefined
    /**
         * The aggregate response time of completed requests.
         */
    var TotalResponseTime: js.UndefOr[NullableDouble] = js.undefined
  }
  
  
  trait TelemetryRecord extends js.Object {
    /**
         * 
         */
    var BackendConnectionErrors: js.UndefOr[BackendConnectionErrors] = js.undefined
    /**
         * 
         */
    var SegmentsReceivedCount: js.UndefOr[NullableInteger] = js.undefined
    /**
         * 
         */
    var SegmentsRejectedCount: js.UndefOr[NullableInteger] = js.undefined
    /**
         * 
         */
    var SegmentsSentCount: js.UndefOr[NullableInteger] = js.undefined
    /**
         * 
         */
    var SegmentsSpilloverCount: js.UndefOr[NullableInteger] = js.undefined
    /**
         * 
         */
    var Timestamp: Timestamp
  }
  
  
  trait Trace extends js.Object {
    /**
         * The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.
         */
    var Duration: js.UndefOr[NullableDouble] = js.undefined
    /**
         * The unique identifier for the request that generated the trace's segments and subsegments.
         */
    var Id: js.UndefOr[TraceId] = js.undefined
    /**
         * Segment documents for the segments and subsegments that comprise the trace.
         */
    var Segments: js.UndefOr[SegmentList] = js.undefined
  }
  
  
  trait TraceSummary extends js.Object {
    /**
         * Annotations from the trace's segment documents.
         */
    var Annotations: js.UndefOr[Annotations] = js.undefined
    /**
         * The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.
         */
    var Duration: js.UndefOr[NullableDouble] = js.undefined
    /**
         * One or more of the segment documents has a 400 series error.
         */
    var HasError: js.UndefOr[NullableBoolean] = js.undefined
    /**
         * One or more of the segment documents has a 500 series error.
         */
    var HasFault: js.UndefOr[NullableBoolean] = js.undefined
    /**
         * One or more of the segment documents has a 429 throttling error.
         */
    var HasThrottle: js.UndefOr[NullableBoolean] = js.undefined
    /**
         * Information about the HTTP request served by the trace.
         */
    var Http: js.UndefOr[Http] = js.undefined
    /**
         * The unique identifier for the request that generated the trace's segments and subsegments.
         */
    var Id: js.UndefOr[TraceId] = js.undefined
    /**
         * One or more of the segment documents is in progress.
         */
    var IsPartial: js.UndefOr[NullableBoolean] = js.undefined
    /**
         * The length of time in seconds between the start and end times of the root segment. If the service performs work asynchronously, the response time measures the time before the response is sent to the user, while the duration measures the amount of time before the last traced activity completes.
         */
    var ResponseTime: js.UndefOr[NullableDouble] = js.undefined
    /**
         * Service IDs from the trace's segment documents.
         */
    var ServiceIds: js.UndefOr[ServiceIds] = js.undefined
    /**
         * Users from the trace's segment documents.
         */
    var Users: js.UndefOr[TraceUsers] = js.undefined
  }
  
  
  trait TraceUser extends js.Object {
    /**
         * Services that the user's request hit.
         */
    var ServiceIds: js.UndefOr[ServiceIds] = js.undefined
    /**
         * The user's name.
         */
    var UserName: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from a single request. Use GetTraceSummaries to get a list of trace IDs.
       */
    def batchGetTraces(): awsDashSdkLib.libRequestMod.Request[BatchGetTracesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from a single request. Use GetTraceSummaries to get a list of trace IDs.
       */
    def batchGetTraces(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetTracesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetTracesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from a single request. Use GetTraceSummaries to get a list of trace IDs.
       */
    def batchGetTraces(params: BatchGetTracesRequest): awsDashSdkLib.libRequestMod.Request[BatchGetTracesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a list of traces specified by ID. Each trace is a collection of segment documents that originates from a single request. Use GetTraceSummaries to get a list of trace IDs.
       */
    def batchGetTraces(
      params: BatchGetTracesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetTracesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetTracesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of borrowing from the reservoir.
       */
    def createSamplingRule(): awsDashSdkLib.libRequestMod.Request[CreateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of borrowing from the reservoir.
       */
    def createSamplingRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSamplingRuleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of borrowing from the reservoir.
       */
    def createSamplingRule(params: CreateSamplingRuleRequest): awsDashSdkLib.libRequestMod.Request[CreateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a rule to control sampling behavior for instrumented applications. Services retrieve rules with GetSamplingRules, and evaluate each rule in ascending order of priority for each request. If a rule matches, the service records a trace, borrowing it from the reservoir size. After 10 seconds, the service reports back to X-Ray with GetSamplingTargets to get updated versions of each in-use rule. The updated rule contains a trace quota that the service can use instead of borrowing from the reservoir.
       */
    def createSamplingRule(
      params: CreateSamplingRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSamplingRuleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a sampling rule.
       */
    def deleteSamplingRule(): awsDashSdkLib.libRequestMod.Request[DeleteSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a sampling rule.
       */
    def deleteSamplingRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSamplingRuleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a sampling rule.
       */
    def deleteSamplingRule(params: DeleteSamplingRuleRequest): awsDashSdkLib.libRequestMod.Request[DeleteSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a sampling rule.
       */
    def deleteSamplingRule(
      params: DeleteSamplingRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSamplingRuleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the current encryption configuration for X-Ray data.
       */
    def getEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[GetEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the current encryption configuration for X-Ray data.
       */
    def getEncryptionConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEncryptionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the current encryption configuration for X-Ray data.
       */
    def getEncryptionConfig(params: GetEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[GetEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves the current encryption configuration for X-Ray data.
       */
    def getEncryptionConfig(
      params: GetEncryptionConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEncryptionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all sampling rules.
       */
    def getSamplingRules(): awsDashSdkLib.libRequestMod.Request[GetSamplingRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all sampling rules.
       */
    def getSamplingRules(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSamplingRulesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSamplingRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all sampling rules.
       */
    def getSamplingRules(params: GetSamplingRulesRequest): awsDashSdkLib.libRequestMod.Request[GetSamplingRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves all sampling rules.
       */
    def getSamplingRules(
      params: GetSamplingRulesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSamplingRulesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSamplingRulesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about recent sampling results for all sampling rules.
       */
    def getSamplingStatisticSummaries(): awsDashSdkLib.libRequestMod.Request[GetSamplingStatisticSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about recent sampling results for all sampling rules.
       */
    def getSamplingStatisticSummaries(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSamplingStatisticSummariesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSamplingStatisticSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about recent sampling results for all sampling rules.
       */
    def getSamplingStatisticSummaries(params: GetSamplingStatisticSummariesRequest): awsDashSdkLib.libRequestMod.Request[GetSamplingStatisticSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves information about recent sampling results for all sampling rules.
       */
    def getSamplingStatisticSummaries(
      params: GetSamplingStatisticSummariesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSamplingStatisticSummariesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSamplingStatisticSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Requests a sampling quota for rules that the service is using to sample requests. 
       */
    def getSamplingTargets(): awsDashSdkLib.libRequestMod.Request[GetSamplingTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Requests a sampling quota for rules that the service is using to sample requests. 
       */
    def getSamplingTargets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSamplingTargetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSamplingTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Requests a sampling quota for rules that the service is using to sample requests. 
       */
    def getSamplingTargets(params: GetSamplingTargetsRequest): awsDashSdkLib.libRequestMod.Request[GetSamplingTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Requests a sampling quota for rules that the service is using to sample requests. 
       */
    def getSamplingTargets(
      params: GetSamplingTargetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSamplingTargetsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSamplingTargetsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a document that describes services that process incoming requests, and downstream services that they call as a result. Root services process incoming requests and make calls to downstream services. Root services are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP web APIs, or SQL databases.
       */
    def getServiceGraph(): awsDashSdkLib.libRequestMod.Request[GetServiceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a document that describes services that process incoming requests, and downstream services that they call as a result. Root services process incoming requests and make calls to downstream services. Root services are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP web APIs, or SQL databases.
       */
    def getServiceGraph(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServiceGraphResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetServiceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a document that describes services that process incoming requests, and downstream services that they call as a result. Root services process incoming requests and make calls to downstream services. Root services are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP web APIs, or SQL databases.
       */
    def getServiceGraph(params: GetServiceGraphRequest): awsDashSdkLib.libRequestMod.Request[GetServiceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a document that describes services that process incoming requests, and downstream services that they call as a result. Root services process incoming requests and make calls to downstream services. Root services are applications that use the AWS X-Ray SDK. Downstream services can be other applications, AWS resources, HTTP web APIs, or SQL databases.
       */
    def getServiceGraph(
      params: GetServiceGraphRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetServiceGraphResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetServiceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a service graph for one or more specific trace IDs.
       */
    def getTraceGraph(): awsDashSdkLib.libRequestMod.Request[GetTraceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a service graph for one or more specific trace IDs.
       */
    def getTraceGraph(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTraceGraphResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTraceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a service graph for one or more specific trace IDs.
       */
    def getTraceGraph(params: GetTraceGraphRequest): awsDashSdkLib.libRequestMod.Request[GetTraceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves a service graph for one or more specific trace IDs.
       */
    def getTraceGraph(
      params: GetTraceGraphRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTraceGraphResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTraceGraphResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the full traces, pass the trace IDs to BatchGetTraces. A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come from a known user. For example, the following filter expression targets traces that pass through api.example.com:  service("api.example.com")  This filter expression finds traces that have an annotation named account with the value 12345:  annotation.account = "12345"  For a full list of indexed fields and keywords that you can use in filter expressions, see Using Filter Expressions in the AWS X-Ray Developer Guide.
       */
    def getTraceSummaries(): awsDashSdkLib.libRequestMod.Request[GetTraceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the full traces, pass the trace IDs to BatchGetTraces. A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come from a known user. For example, the following filter expression targets traces that pass through api.example.com:  service("api.example.com")  This filter expression finds traces that have an annotation named account with the value 12345:  annotation.account = "12345"  For a full list of indexed fields and keywords that you can use in filter expressions, see Using Filter Expressions in the AWS X-Ray Developer Guide.
       */
    def getTraceSummaries(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTraceSummariesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTraceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the full traces, pass the trace IDs to BatchGetTraces. A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come from a known user. For example, the following filter expression targets traces that pass through api.example.com:  service("api.example.com")  This filter expression finds traces that have an annotation named account with the value 12345:  annotation.account = "12345"  For a full list of indexed fields and keywords that you can use in filter expressions, see Using Filter Expressions in the AWS X-Ray Developer Guide.
       */
    def getTraceSummaries(params: GetTraceSummariesRequest): awsDashSdkLib.libRequestMod.Request[GetTraceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Retrieves IDs and metadata for traces available for a specified time frame using an optional filter. To get the full traces, pass the trace IDs to BatchGetTraces. A filter expression can target traced requests that hit specific service nodes or edges, have errors, or come from a known user. For example, the following filter expression targets traces that pass through api.example.com:  service("api.example.com")  This filter expression finds traces that have an annotation named account with the value 12345:  annotation.account = "12345"  For a full list of indexed fields and keywords that you can use in filter expressions, see Using Filter Expressions in the AWS X-Ray Developer Guide.
       */
    def getTraceSummaries(
      params: GetTraceSummariesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetTraceSummariesResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetTraceSummariesResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the encryption configuration for X-Ray data.
       */
    def putEncryptionConfig(): awsDashSdkLib.libRequestMod.Request[PutEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the encryption configuration for X-Ray data.
       */
    def putEncryptionConfig(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEncryptionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the encryption configuration for X-Ray data.
       */
    def putEncryptionConfig(params: PutEncryptionConfigRequest): awsDashSdkLib.libRequestMod.Request[PutEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the encryption configuration for X-Ray data.
       */
    def putEncryptionConfig(
      params: PutEncryptionConfigRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutEncryptionConfigResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutEncryptionConfigResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by the AWS X-Ray daemon to upload telemetry.
       */
    def putTelemetryRecords(): awsDashSdkLib.libRequestMod.Request[PutTelemetryRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by the AWS X-Ray daemon to upload telemetry.
       */
    def putTelemetryRecords(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutTelemetryRecordsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutTelemetryRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by the AWS X-Ray daemon to upload telemetry.
       */
    def putTelemetryRecords(params: PutTelemetryRecordsRequest): awsDashSdkLib.libRequestMod.Request[PutTelemetryRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Used by the AWS X-Ray daemon to upload telemetry.
       */
    def putTelemetryRecords(
      params: PutTelemetryRecordsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutTelemetryRecordsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutTelemetryRecordsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or an array of subsegments. Segments must include the following fields. For the full segment document schema, see AWS X-Ray Segment Documents in the AWS X-Ray Developer Guide.  Required Segment Document Fields     name - The name of the service that handled the request.    id - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal digits.    trace_id - A unique identifier that connects all segments and subsegments originating from a single client request.    start_time - Time the segment or subsegment was created, in floating point seconds in epoch time, accurate to milliseconds. For example, 1480615200.010 or 1.480615200010E9.    end_time - Time the segment or subsegment was closed. For example, 1480615200.090 or 1.480615200090E9. Specify either an end_time or in_progress.    in_progress - Set to true instead of specifying an end_time to record that a segment has been started, but is not complete. Send an in progress segment when your application receives a request that will take a long time to serve, to trace the fact that the request was received. When the response is sent, send the complete segment to overwrite the in-progress segment.   A trace_id consists of three numbers separated by hyphens. For example, 1-58406520-a006649127e371903a2de979. This includes:  Trace ID Format    The version number, i.e. 1.   The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd, 2016 PST in epoch time is 1480615200 seconds, or 58406520 in hexadecimal.   A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.  
       */
    def putTraceSegments(): awsDashSdkLib.libRequestMod.Request[PutTraceSegmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or an array of subsegments. Segments must include the following fields. For the full segment document schema, see AWS X-Ray Segment Documents in the AWS X-Ray Developer Guide.  Required Segment Document Fields     name - The name of the service that handled the request.    id - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal digits.    trace_id - A unique identifier that connects all segments and subsegments originating from a single client request.    start_time - Time the segment or subsegment was created, in floating point seconds in epoch time, accurate to milliseconds. For example, 1480615200.010 or 1.480615200010E9.    end_time - Time the segment or subsegment was closed. For example, 1480615200.090 or 1.480615200090E9. Specify either an end_time or in_progress.    in_progress - Set to true instead of specifying an end_time to record that a segment has been started, but is not complete. Send an in progress segment when your application receives a request that will take a long time to serve, to trace the fact that the request was received. When the response is sent, send the complete segment to overwrite the in-progress segment.   A trace_id consists of three numbers separated by hyphens. For example, 1-58406520-a006649127e371903a2de979. This includes:  Trace ID Format    The version number, i.e. 1.   The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd, 2016 PST in epoch time is 1480615200 seconds, or 58406520 in hexadecimal.   A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.  
       */
    def putTraceSegments(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutTraceSegmentsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutTraceSegmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or an array of subsegments. Segments must include the following fields. For the full segment document schema, see AWS X-Ray Segment Documents in the AWS X-Ray Developer Guide.  Required Segment Document Fields     name - The name of the service that handled the request.    id - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal digits.    trace_id - A unique identifier that connects all segments and subsegments originating from a single client request.    start_time - Time the segment or subsegment was created, in floating point seconds in epoch time, accurate to milliseconds. For example, 1480615200.010 or 1.480615200010E9.    end_time - Time the segment or subsegment was closed. For example, 1480615200.090 or 1.480615200090E9. Specify either an end_time or in_progress.    in_progress - Set to true instead of specifying an end_time to record that a segment has been started, but is not complete. Send an in progress segment when your application receives a request that will take a long time to serve, to trace the fact that the request was received. When the response is sent, send the complete segment to overwrite the in-progress segment.   A trace_id consists of three numbers separated by hyphens. For example, 1-58406520-a006649127e371903a2de979. This includes:  Trace ID Format    The version number, i.e. 1.   The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd, 2016 PST in epoch time is 1480615200 seconds, or 58406520 in hexadecimal.   A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.  
       */
    def putTraceSegments(params: PutTraceSegmentsRequest): awsDashSdkLib.libRequestMod.Request[PutTraceSegmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Uploads segment documents to AWS X-Ray. The X-Ray SDK generates segment documents and sends them to the X-Ray daemon, which uploads them in batches. A segment document can be a completed segment, an in-progress segment, or an array of subsegments. Segments must include the following fields. For the full segment document schema, see AWS X-Ray Segment Documents in the AWS X-Ray Developer Guide.  Required Segment Document Fields     name - The name of the service that handled the request.    id - A 64-bit identifier for the segment, unique among segments in the same trace, in 16 hexadecimal digits.    trace_id - A unique identifier that connects all segments and subsegments originating from a single client request.    start_time - Time the segment or subsegment was created, in floating point seconds in epoch time, accurate to milliseconds. For example, 1480615200.010 or 1.480615200010E9.    end_time - Time the segment or subsegment was closed. For example, 1480615200.090 or 1.480615200090E9. Specify either an end_time or in_progress.    in_progress - Set to true instead of specifying an end_time to record that a segment has been started, but is not complete. Send an in progress segment when your application receives a request that will take a long time to serve, to trace the fact that the request was received. When the response is sent, send the complete segment to overwrite the in-progress segment.   A trace_id consists of three numbers separated by hyphens. For example, 1-58406520-a006649127e371903a2de979. This includes:  Trace ID Format    The version number, i.e. 1.   The time of the original request, in Unix epoch time, in 8 hexadecimal digits. For example, 10:00AM December 2nd, 2016 PST in epoch time is 1480615200 seconds, or 58406520 in hexadecimal.   A 96-bit identifier for the trace, globally unique, in 24 hexadecimal digits.  
       */
    def putTraceSegments(
      params: PutTraceSegmentsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutTraceSegmentsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutTraceSegmentsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies a sampling rule's configuration.
       */
    def updateSamplingRule(): awsDashSdkLib.libRequestMod.Request[UpdateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies a sampling rule's configuration.
       */
    def updateSamplingRule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSamplingRuleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies a sampling rule's configuration.
       */
    def updateSamplingRule(params: UpdateSamplingRuleRequest): awsDashSdkLib.libRequestMod.Request[UpdateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Modifies a sampling rule's configuration.
       */
    def updateSamplingRule(
      params: UpdateSamplingRuleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSamplingRuleResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSamplingRuleResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UnprocessedStatistics extends js.Object {
    /**
         * The error code.
         */
    var ErrorCode: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The error message.
         */
    var Message: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The name of the sampling rule.
         */
    var RuleName: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait UnprocessedTraceSegment extends js.Object {
    /**
         * The error that caused processing to fail.
         */
    var ErrorCode: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The segment's ID.
         */
    var Id: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The error message.
         */
    var Message: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait UpdateSamplingRuleRequest extends js.Object {
    /**
         * The rule and fields to change.
         */
    var SamplingRuleUpdate: SamplingRuleUpdate
  }
  
  
  trait UpdateSamplingRuleResult extends js.Object {
    /**
         * The updated rule definition and metadata.
         */
    var SamplingRuleRecord: js.UndefOr[SamplingRuleRecord] = js.undefined
  }
  
  
  trait ValueWithServiceIds extends js.Object {
    /**
         * Values of the annotation.
         */
    var AnnotationValue: js.UndefOr[AnnotationValue] = js.undefined
    /**
         * Services to which the annotation applies.
         */
    var ServiceIds: js.UndefOr[ServiceIds] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AliasList = js.Array[Alias]
  type AliasNames = js.Array[java.lang.String]
  type AnnotationKey = java.lang.String
  type AttributeKey = java.lang.String
  type AttributeValue = java.lang.String
  type BorrowCount = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientID = java.lang.String
  type Double = scala.Double
  type EC2InstanceId = java.lang.String
  type EdgeList = js.Array[Edge]
  type EncryptionKeyId = java.lang.String
  type EncryptionStatus = awsDashSdkLib.awsDashSdkLibStrings.UPDATING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | java.lang.String
  type EncryptionType = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.KMS | java.lang.String
  type FilterExpression = java.lang.String
  type FixedRate = scala.Double
  type HTTPMethod = java.lang.String
  type Histogram = js.Array[HistogramEntry]
  type Host = java.lang.String
  type Hostname = java.lang.String
  type Integer = scala.Double
  type NullableBoolean = scala.Boolean
  type NullableDouble = scala.Double
  type NullableInteger = scala.Double
  type NullableLong = scala.Double
  type Priority = scala.Double
  type RequestCount = scala.Double
  type ReservoirSize = scala.Double
  type ResourceARN = java.lang.String
  type RuleName = java.lang.String
  type SampledCount = scala.Double
  type SamplingRuleRecordList = js.Array[SamplingRuleRecord]
  type SamplingStatisticSummaryList = js.Array[SamplingStatisticSummary]
  type SamplingStatisticsDocumentList = js.Array[SamplingStatisticsDocument]
  type SamplingTargetDocumentList = js.Array[SamplingTargetDocument]
  type SegmentDocument = java.lang.String
  type SegmentId = java.lang.String
  type SegmentList = js.Array[Segment]
  type ServiceIds = js.Array[ServiceId]
  type ServiceList = js.Array[Service]
  type ServiceName = java.lang.String
  type ServiceNames = js.Array[java.lang.String]
  type ServiceType = java.lang.String
  type String = java.lang.String
  type TelemetryRecordList = js.Array[TelemetryRecord]
  type Timestamp = stdLib.Date
  type TraceId = java.lang.String
  type TraceIdList = js.Array[TraceId]
  type TraceList = js.Array[Trace]
  type TraceSegmentDocument = java.lang.String
  type TraceSegmentDocumentList = js.Array[TraceSegmentDocument]
  type TraceSummaryList = js.Array[TraceSummary]
  type TraceUsers = js.Array[TraceUser]
  type URLPath = java.lang.String
  type UnprocessedStatisticsList = js.Array[UnprocessedStatistics]
  type UnprocessedTraceIdList = js.Array[TraceId]
  type UnprocessedTraceSegmentList = js.Array[UnprocessedTraceSegment]
  type ValuesWithServiceIds = js.Array[ValueWithServiceIds]
  type Version = scala.Double
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-04-12` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}
