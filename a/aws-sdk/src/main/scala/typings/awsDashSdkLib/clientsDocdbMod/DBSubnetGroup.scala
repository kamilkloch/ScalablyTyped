package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBSubnetGroup extends js.Object {
  /**
    * The Amazon Resource Identifier (ARN) for the DB subnet group.
    */
  var DBSubnetGroupArn: js.UndefOr[String] = js.undefined
  /**
    * Provides the description of the DB subnet group.
    */
  var DBSubnetGroupDescription: js.UndefOr[String] = js.undefined
  /**
    * The name of the DB subnet group.
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  /**
    * Provides the status of the DB subnet group.
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.undefined
  /**
    * Detailed information about one or more subnets within a DB subnet group.
    */
  var Subnets: js.UndefOr[SubnetList] = js.undefined
  /**
    * Provides the virtual private cloud (VPC) ID of the DB subnet group.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object DBSubnetGroup {
  @scala.inline
  def apply(
    DBSubnetGroupArn: String = null,
    DBSubnetGroupDescription: String = null,
    DBSubnetGroupName: String = null,
    SubnetGroupStatus: String = null,
    Subnets: SubnetList = null,
    VpcId: String = null
  ): DBSubnetGroup = {
    val __obj = js.Dynamic.literal()
    if (DBSubnetGroupArn != null) __obj.updateDynamic("DBSubnetGroupArn")(DBSubnetGroupArn)
    if (DBSubnetGroupDescription != null) __obj.updateDynamic("DBSubnetGroupDescription")(DBSubnetGroupDescription)
    if (DBSubnetGroupName != null) __obj.updateDynamic("DBSubnetGroupName")(DBSubnetGroupName)
    if (SubnetGroupStatus != null) __obj.updateDynamic("SubnetGroupStatus")(SubnetGroupStatus)
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[DBSubnetGroup]
  }
}

