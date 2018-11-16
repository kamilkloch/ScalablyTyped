package typings
package nodegitLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff", "Diff")
@js.native
class Diff () extends js.Object {
  def findSimilar(options: DiffFindOptions): stdLib.Promise[scala.Double] = js.native
  def getDelta(idx: scala.Double): nodegitLib.diffDashDeltaMod.DiffDelta = js.native
  def getPerfdata(): stdLib.Promise[nodegitLib.diffDashPerfDashDataMod.DiffPerfdata] = js.native
  def merge(from: Diff): stdLib.Promise[scala.Double] = js.native
  def numDeltas(): scala.Double = js.native
  /**
       * Retrieve patches in this difflist
       *
       *
       */
  def patches(): stdLib.Promise[js.Array[nodegitLib.convenientDashPatchMod.ConvenientPatch]] = js.native
  def toBuf(format: nodegitLib.diffMod.DiffNs.FORMAT): stdLib.Promise[nodegitLib.bufMod.Buf] = js.native
}

@JSImport("nodegit/diff", "Diff")
@js.native
object Diff extends js.Object {
  /**
       * Directly run a diff between a blob and a buffer.
       *
       *
       */
  def blobToBuffer(
    oldBlob: nodegitLib.blobMod.Blob,
    oldAsPath: java.lang.String,
    buffer: java.lang.String,
    bufferAsPath: java.lang.String,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions,
    fileCb: js.Function,
    binaryCb: js.Function,
    hunkCb: js.Function,
    lineCb: js.Function
  ): stdLib.Promise[_] = js.native
  def fromBuffer(content: java.lang.String, contentLen: scala.Double): stdLib.Promise[nodegitLib.diffMod.Diff] = js.native
  def indexToIndex(
    repo: nodegitLib.repositoryMod.Repository,
    oldIndex: nodegitLib.indexUnderscoreMod.Index,
    newIndex: nodegitLib.indexUnderscoreMod.Index
  ): stdLib.Promise[nodegitLib.diffMod.Diff] = js.native
  def indexToIndex(
    repo: nodegitLib.repositoryMod.Repository,
    oldIndex: nodegitLib.indexUnderscoreMod.Index,
    newIndex: nodegitLib.indexUnderscoreMod.Index,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): stdLib.Promise[nodegitLib.diffMod.Diff] = js.native
  def indexToWorkdir(repo: nodegitLib.repositoryMod.Repository, index: nodegitLib.indexUnderscoreMod.Index): stdLib.Promise[nodegitLib.diffMod.Diff] = js.native
  def indexToWorkdir(
    repo: nodegitLib.repositoryMod.Repository,
    index: nodegitLib.indexUnderscoreMod.Index,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): stdLib.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToIndex(
    repo: nodegitLib.repositoryMod.Repository,
    oldTree: nodegitLib.treeMod.Tree,
    index: nodegitLib.indexUnderscoreMod.Index
  ): stdLib.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToIndex(
    repo: nodegitLib.repositoryMod.Repository,
    oldTree: nodegitLib.treeMod.Tree,
    index: nodegitLib.indexUnderscoreMod.Index,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): stdLib.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToTree(
    repo: nodegitLib.repositoryMod.Repository,
    oldTree: nodegitLib.treeMod.Tree,
    new_tree: nodegitLib.treeMod.Tree
  ): stdLib.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToTree(
    repo: nodegitLib.repositoryMod.Repository,
    oldTree: nodegitLib.treeMod.Tree,
    new_tree: nodegitLib.treeMod.Tree,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): stdLib.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToWorkdir(repo: nodegitLib.repositoryMod.Repository, oldTree: nodegitLib.treeMod.Tree): stdLib.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToWorkdir(
    repo: nodegitLib.repositoryMod.Repository,
    oldTree: nodegitLib.treeMod.Tree,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): stdLib.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(repo: nodegitLib.repositoryMod.Repository, oldTree: nodegitLib.treeMod.Tree): stdLib.Promise[nodegitLib.diffMod.Diff] = js.native
  def treeToWorkdirWithIndex(
    repo: nodegitLib.repositoryMod.Repository,
    oldTree: nodegitLib.treeMod.Tree,
    opts: nodegitLib.diffDashOptionsMod.DiffOptions
  ): stdLib.Promise[nodegitLib.diffMod.Diff] = js.native
}
