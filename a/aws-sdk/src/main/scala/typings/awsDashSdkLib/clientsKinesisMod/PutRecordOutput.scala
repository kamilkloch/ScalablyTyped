package typings
package awsDashSdkLib.clientsKinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRecordOutput extends js.Object {
  /**
    * The encryption type to use on the record. This parameter can be one of the following values:    NONE: Do not encrypt the records in the stream.    KMS: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.  
    */
  var EncryptionType: js.UndefOr[EncryptionType] = js.undefined
  /**
    * The sequence number identifier that was assigned to the put data record. The sequence number for the record is unique across all records in the stream. A sequence number is the identifier associated with every record put into the stream.
    */
  var SequenceNumber: awsDashSdkLib.clientsKinesisMod.SequenceNumber
  /**
    * The shard ID of the shard where the data record was placed.
    */
  var ShardId: awsDashSdkLib.clientsKinesisMod.ShardId
}

object PutRecordOutput {
  @scala.inline
  def apply(SequenceNumber: SequenceNumber, ShardId: ShardId, EncryptionType: EncryptionType = null): PutRecordOutput = {
    val __obj = js.Dynamic.literal(SequenceNumber = SequenceNumber, ShardId = ShardId)
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordOutput]
  }
}

