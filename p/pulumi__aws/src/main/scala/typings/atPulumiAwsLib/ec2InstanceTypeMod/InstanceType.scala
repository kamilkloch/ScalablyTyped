package typings
package atPulumiAwsLib.ec2InstanceTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - atPulumiAwsLib.atPulumiAwsLibStrings.a1DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.a1DOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.a1DOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.a1DOTmedium
  - atPulumiAwsLib.atPulumiAwsLibStrings.a1DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c3DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c3DOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c3DOT8xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c3DOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c3DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c4DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c4DOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c4DOT8xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c4DOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c4DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5DOT18xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5DOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5DOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5DOT9xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5dDOT18xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5dDOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5dDOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5dDOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5dDOT9xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5nDOT18xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5dDOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5nDOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5nDOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5nDOT9xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5nDOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.c5nDOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.d2DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.d2DOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.d2DOT8xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.d2DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.f1DOT16xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.f1DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.g2DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.g2DOT8xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.g3DOT16xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.g3DOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.g3DOT8xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.g3sDOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.h1DOT16xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.h1DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.h1DOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.h1DOT8xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.hs1DOT8xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.i3DOT16xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.i3DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.i3DOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.i3DOT8xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.i3DOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.i3DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.i3DOTmetal
  - atPulumiAwsLib.atPulumiAwsLibStrings.m3DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m3DOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m3DOTmedium
  - atPulumiAwsLib.atPulumiAwsLibStrings.m3DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m4DOT10xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m4DOT16xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m4DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m4DOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m4DOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m4DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5DOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5DOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5DOT12xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5DOT24xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5dDOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5dDOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5dDOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5dDOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5dDOT12xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5dDOT24xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5aDOT12xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5aDOT24xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5aDOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5aDOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5aDOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.m5aDOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.p2DOT16xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.p2DOT8xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.p2DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.p3DOT16xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.p3DOT8xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.p3DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.p3dnDOT24xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r3DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r3DOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r3DOT8xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r3DOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r3DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r4DOT16xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r4DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r4DOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r4DOT8xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r4DOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r4DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5DOT12xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5DOT24xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5DOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5DOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5aDOT12xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5aDOT24xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5aDOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5aDOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5aDOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5aDOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5dDOT12xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5dDOT24xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5dDOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5dDOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5dDOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.r5dDOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.t2DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.t2DOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.t2DOTmedium
  - atPulumiAwsLib.atPulumiAwsLibStrings.t2DOTmicro
  - atPulumiAwsLib.atPulumiAwsLibStrings.t2DOTnano
  - atPulumiAwsLib.atPulumiAwsLibStrings.t2DOTsmall
  - atPulumiAwsLib.atPulumiAwsLibStrings.t2DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.t3DOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.t3DOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.t3DOTmedium
  - atPulumiAwsLib.atPulumiAwsLibStrings.t3DOTmicro
  - atPulumiAwsLib.atPulumiAwsLibStrings.t3DOTnano
  - atPulumiAwsLib.atPulumiAwsLibStrings.t3DOTsmall
  - atPulumiAwsLib.atPulumiAwsLibStrings.t3DOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.`u-12tb1DOTmetal`
  - atPulumiAwsLib.atPulumiAwsLibStrings.`u-6tb1DOTmetal`
  - atPulumiAwsLib.atPulumiAwsLibStrings.`u-9tb1DOTmetal`
  - atPulumiAwsLib.atPulumiAwsLibStrings.x1DOT16xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.x1DOT32xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.x1eDOT16xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.x1eDOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.x1eDOT32xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.x1eDOT4xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.x1eDOT8xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.x1eDOTxlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.z1dDOT12xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.z1dDOT2xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.z1dDOT3xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.z1dDOT6xlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.z1dDOTlarge
  - atPulumiAwsLib.atPulumiAwsLibStrings.z1dDOTxlarge
*/
trait InstanceType extends js.Object

