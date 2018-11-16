package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comprehend
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Comprehend: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsComprehendMod.ComprehendNs.ClientConfiguration = js.native
  /**
     * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
     */
  def batchDetectDominantLanguage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
     */
  def batchDetectDominantLanguage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
     */
  def batchDetectDominantLanguage(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Determines the dominant language of the input text for a batch of documents. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
     */
  def batchDetectDominantLanguage(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects the text of a batch of documents for named entities and returns information about them. For more information about named entities, see how-entities 
     */
  def batchDetectEntities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects the text of a batch of documents for named entities and returns information about them. For more information about named entities, see how-entities 
     */
  def batchDetectEntities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects the text of a batch of documents for named entities and returns information about them. For more information about named entities, see how-entities 
     */
  def batchDetectEntities(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects the text of a batch of documents for named entities and returns information about them. For more information about named entities, see how-entities 
     */
  def batchDetectEntities(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detects the key noun phrases found in a batch of documents.
     */
  def batchDetectKeyPhrases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detects the key noun phrases found in a batch of documents.
     */
  def batchDetectKeyPhrases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detects the key noun phrases found in a batch of documents.
     */
  def batchDetectKeyPhrases(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detects the key noun phrases found in a batch of documents.
     */
  def batchDetectKeyPhrases(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE, NEUTRAL, MIXED, or NEGATIVE, in each one.
     */
  def batchDetectSentiment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE, NEUTRAL, MIXED, or NEGATIVE, in each one.
     */
  def batchDetectSentiment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE, NEUTRAL, MIXED, or NEGATIVE, in each one.
     */
  def batchDetectSentiment(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects a batch of documents and returns an inference of the prevailing sentiment, POSITIVE, NEUTRAL, MIXED, or NEGATIVE, in each one.
     */
  def batchDetectSentiment(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and returns information about them. For more information, see how-syntax.
     */
  def batchDetectSyntax(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and returns information about them. For more information, see how-syntax.
     */
  def batchDetectSyntax(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and returns information about them. For more information, see how-syntax.
     */
  def batchDetectSyntax(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects the text of a batch of documents for the syntax and part of speech of the words in the document and returns information about them. For more information, see how-syntax.
     */
  def batchDetectSyntax(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.BatchDetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a detection job.
     */
  def describeDominantLanguageDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a detection job.
     */
  def describeDominantLanguageDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a detection job.
     */
  def describeDominantLanguageDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a dominant language detection job. Use this operation to get the status of a detection job.
     */
  def describeDominantLanguageDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with an entities detection job. Use this operation to get the status of a detection job.
     */
  def describeEntitiesDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with an entities detection job. Use this operation to get the status of a detection job.
     */
  def describeEntitiesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with an entities detection job. Use this operation to get the status of a detection job.
     */
  def describeEntitiesDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with an entities detection job. Use this operation to get the status of a detection job.
     */
  def describeEntitiesDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a detection job.
     */
  def describeKeyPhrasesDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a detection job.
     */
  def describeKeyPhrasesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a detection job.
     */
  def describeKeyPhrasesDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a key phrases detection job. Use this operation to get the status of a detection job.
     */
  def describeKeyPhrasesDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a detection job.
     */
  def describeSentimentDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a detection job.
     */
  def describeSentimentDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a detection job.
     */
  def describeSentimentDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a sentiment detection job. Use this operation to get the status of a detection job.
     */
  def describeSentimentDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection job.
     */
  def describeTopicsDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection job.
     */
  def describeTopicsDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection job.
     */
  def describeTopicsDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the properties associated with a topic detection job. Use this operation to get the status of a detection job.
     */
  def describeTopicsDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DescribeTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
     */
  def detectDominantLanguage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
     */
  def detectDominantLanguage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
     */
  def detectDominantLanguage(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Determines the dominant language of the input text. For a list of languages that Amazon Comprehend can detect, see Amazon Comprehend Supported Languages. 
     */
  def detectDominantLanguage(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectDominantLanguageResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects text for named entities, and returns information about them. For more information, about named entities, see how-entities. 
     */
  def detectEntities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects text for named entities, and returns information about them. For more information, about named entities, see how-entities. 
     */
  def detectEntities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects text for named entities, and returns information about them. For more information, about named entities, see how-entities. 
     */
  def detectEntities(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects text for named entities, and returns information about them. For more information, about named entities, see how-entities. 
     */
  def detectEntities(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detects the key noun phrases found in the text. 
     */
  def detectKeyPhrases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detects the key noun phrases found in the text. 
     */
  def detectKeyPhrases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detects the key noun phrases found in the text. 
     */
  def detectKeyPhrases(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detects the key noun phrases found in the text. 
     */
  def detectKeyPhrases(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectKeyPhrasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL, MIXED, or NEGATIVE). 
     */
  def detectSentiment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL, MIXED, or NEGATIVE). 
     */
  def detectSentiment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL, MIXED, or NEGATIVE). 
     */
  def detectSentiment(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects text and returns an inference of the prevailing sentiment (POSITIVE, NEUTRAL, MIXED, or NEGATIVE). 
     */
  def detectSentiment(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSentimentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects text for syntax and the part of speech of words in the document. For more information, how-syntax.
     */
  def detectSyntax(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects text for syntax and the part of speech of words in the document. For more information, how-syntax.
     */
  def detectSyntax(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects text for syntax and the part of speech of words in the document. For more information, how-syntax.
     */
  def detectSyntax(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Inspects text for syntax and the part of speech of words in the document. For more information, how-syntax.
     */
  def detectSyntax(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.DetectSyntaxResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the dominant language detection jobs that you have submitted.
     */
  def listDominantLanguageDetectionJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the dominant language detection jobs that you have submitted.
     */
  def listDominantLanguageDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the dominant language detection jobs that you have submitted.
     */
  def listDominantLanguageDetectionJobs(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the dominant language detection jobs that you have submitted.
     */
  def listDominantLanguageDetectionJobs(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListDominantLanguageDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the entity detection jobs that you have submitted.
     */
  def listEntitiesDetectionJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the entity detection jobs that you have submitted.
     */
  def listEntitiesDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the entity detection jobs that you have submitted.
     */
  def listEntitiesDetectionJobs(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the entity detection jobs that you have submitted.
     */
  def listEntitiesDetectionJobs(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListEntitiesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get a list of key phrase detection jobs that you have submitted.
     */
  def listKeyPhrasesDetectionJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get a list of key phrase detection jobs that you have submitted.
     */
  def listKeyPhrasesDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get a list of key phrase detection jobs that you have submitted.
     */
  def listKeyPhrasesDetectionJobs(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Get a list of key phrase detection jobs that you have submitted.
     */
  def listKeyPhrasesDetectionJobs(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListKeyPhrasesDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of sentiment detection jobs that you have submitted.
     */
  def listSentimentDetectionJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of sentiment detection jobs that you have submitted.
     */
  def listSentimentDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of sentiment detection jobs that you have submitted.
     */
  def listSentimentDetectionJobs(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of sentiment detection jobs that you have submitted.
     */
  def listSentimentDetectionJobs(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListSentimentDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the topic detection jobs that you have submitted.
     */
  def listTopicsDetectionJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the topic detection jobs that you have submitted.
     */
  def listTopicsDetectionJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the topic detection jobs that you have submitted.
     */
  def listTopicsDetectionJobs(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a list of the topic detection jobs that you have submitted.
     */
  def listTopicsDetectionJobs(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.ListTopicsDetectionJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track the status of a job.
     */
  def startDominantLanguageDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track the status of a job.
     */
  def startDominantLanguageDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track the status of a job.
     */
  def startDominantLanguageDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous dominant language detection job for a collection of documents. Use the operation to track the status of a job.
     */
  def startDominantLanguageDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status of a job.
     */
  def startEntitiesDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status of a job.
     */
  def startEntitiesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status of a job.
     */
  def startEntitiesDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous entity detection job for a collection of documents. Use the operation to track the status of a job.
     */
  def startEntitiesDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the status of a job.
     */
  def startKeyPhrasesDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the status of a job.
     */
  def startKeyPhrasesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the status of a job.
     */
  def startKeyPhrasesDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous key phrase detection job for a collection of documents. Use the operation to track the status of a job.
     */
  def startKeyPhrasesDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the status of a job.
     */
  def startSentimentDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the status of a job.
     */
  def startSentimentDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the status of a job.
     */
  def startSentimentDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous sentiment detection job for a collection of documents. use the operation to track the status of a job.
     */
  def startSentimentDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the status of a job.
     */
  def startTopicsDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the status of a job.
     */
  def startTopicsDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the status of a job.
     */
  def startTopicsDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Starts an asynchronous topic detection job. Use the DescribeTopicDetectionJob operation to track the status of a job.
     */
  def startTopicsDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StartTopicsDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops a dominant language detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopDominantLanguageDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops a dominant language detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopDominantLanguageDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops a dominant language detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopDominantLanguageDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops a dominant language detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopDominantLanguageDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopDominantLanguageDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops an entities detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopEntitiesDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops an entities detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopEntitiesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops an entities detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopEntitiesDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops an entities detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopEntitiesDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopEntitiesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops a key phrases detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopKeyPhrasesDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops a key phrases detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopKeyPhrasesDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops a key phrases detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopKeyPhrasesDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops a key phrases detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopKeyPhrasesDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopKeyPhrasesDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops a sentiment detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopSentimentDetectionJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops a sentiment detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopSentimentDetectionJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops a sentiment detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopSentimentDetectionJob(params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops a sentiment detection job in progress. If the job state is IN_PROGRESS the job is marked for termination and put into the STOP_REQUESTED state. If the job completes before it can be stopped, it is put into the COMPLETED state; otherwise the job is be stopped and put into the STOPPED state. If the job is in the COMPLETED or FAILED state when you call the StopDominantLanguageDetectionJob operation, the operation returns a 400 Internal Request Exception.  When a job is stopped, any documents already processed are written to the output location.
     */
  def stopSentimentDetectionJob(
    params: awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendMod.ComprehendNs.StopSentimentDetectionJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}
