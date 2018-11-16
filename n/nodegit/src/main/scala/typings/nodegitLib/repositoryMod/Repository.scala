package typings
package nodegitLib.repositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/repository", "Repository")
@js.native
class Repository () extends js.Object {
  /**
       * This will set the HEAD to point to the local branch and then attempt to update the index and working tree to match the content of the latest commit on that branch
       */
  def checkoutBranch(branch: java.lang.String): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * This will set the HEAD to point to the local branch and then attempt to update the index and working tree to match the content of the latest commit on that branch
       */
  def checkoutBranch(branch: java.lang.String, opts: nodegitLib.checkoutDashOptionsMod.CheckoutOptions): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * This will set the HEAD to point to the local branch and then attempt to update the index and working tree to match the content of the latest commit on that branch
       */
  def checkoutBranch(branch: nodegitLib.referenceMod.Reference): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * This will set the HEAD to point to the local branch and then attempt to update the index and working tree to match the content of the latest commit on that branch
       */
  def checkoutBranch(branch: nodegitLib.referenceMod.Reference, opts: nodegitLib.checkoutDashOptionsMod.CheckoutOptions): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * This will set the HEAD to point to the reference and then attempt to update the index and working tree to match the content of the latest commit on that reference
       */
  def checkoutRef(reference: nodegitLib.referenceMod.Reference): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * This will set the HEAD to point to the reference and then attempt to update the index and working tree to match the content of the latest commit on that reference
       */
  def checkoutRef(
    reference: nodegitLib.referenceMod.Reference,
    opts: nodegitLib.checkoutDashOptionsMod.CheckoutOptions
  ): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def cleanup(): scala.Unit = js.native
  def config(): stdLib.Promise[nodegitLib.configMod.Config] = js.native
  def configSnapshot(): stdLib.Promise[nodegitLib.configMod.Config] = js.native
  def continueRebase(signature: nodegitLib.signatureMod.Signature, beforeNextFn: js.Function): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  /**
       * Create a blob from a buffer
       */
  def createBlobFromBuffer(buffer: nodeLib.Buffer): nodegitLib.oidMod.Oid = js.native
  /**
       * Creates a branch with the passed in name pointing to the commit
       */
  def createBranch(name: java.lang.String, commit: java.lang.String): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * Creates a branch with the passed in name pointing to the commit
       */
  def createBranch(name: java.lang.String, commit: java.lang.String, force: scala.Boolean): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * Creates a branch with the passed in name pointing to the commit
       */
  def createBranch(name: java.lang.String, commit: nodegitLib.commitMod.Commit): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * Creates a branch with the passed in name pointing to the commit
       */
  def createBranch(name: java.lang.String, commit: nodegitLib.commitMod.Commit, force: scala.Boolean): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * Creates a branch with the passed in name pointing to the commit
       */
  def createBranch(name: java.lang.String, commit: nodegitLib.oidMod.Oid): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * Creates a branch with the passed in name pointing to the commit
       */
  def createBranch(name: java.lang.String, commit: nodegitLib.oidMod.Oid, force: scala.Boolean): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def createCommit(
    updateRef: java.lang.String,
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    message: java.lang.String,
    Tree: java.lang.String,
    parents: js.Array[java.lang.String | nodegitLib.commitMod.Commit | nodegitLib.oidMod.Oid]
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def createCommit(
    updateRef: java.lang.String,
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    message: java.lang.String,
    Tree: java.lang.String,
    parents: js.Array[java.lang.String | nodegitLib.commitMod.Commit | nodegitLib.oidMod.Oid],
    callback: js.Function
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def createCommit(
    updateRef: java.lang.String,
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    message: java.lang.String,
    Tree: nodegitLib.oidMod.Oid,
    parents: js.Array[java.lang.String | nodegitLib.commitMod.Commit | nodegitLib.oidMod.Oid]
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def createCommit(
    updateRef: java.lang.String,
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    message: java.lang.String,
    Tree: nodegitLib.oidMod.Oid,
    parents: js.Array[java.lang.String | nodegitLib.commitMod.Commit | nodegitLib.oidMod.Oid],
    callback: js.Function
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def createCommit(
    updateRef: java.lang.String,
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    message: java.lang.String,
    Tree: nodegitLib.treeMod.Tree,
    parents: js.Array[java.lang.String | nodegitLib.commitMod.Commit | nodegitLib.oidMod.Oid]
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def createCommit(
    updateRef: java.lang.String,
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    message: java.lang.String,
    Tree: nodegitLib.treeMod.Tree,
    parents: js.Array[java.lang.String | nodegitLib.commitMod.Commit | nodegitLib.oidMod.Oid],
    callback: js.Function
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  /**
       * Creates a new commit on HEAD from the list of passed in files
       */
  def createCommitOnHead(
    filesToAdd: js.Array[java.lang.String],
    author: nodegitLib.signatureMod.Signature,
    committer: nodegitLib.signatureMod.Signature,
    message: java.lang.String
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  /**
       * Creates a new lightweight tag
       */
  def createLightweightTag(string: java.lang.String, name: java.lang.String): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * Creates a new lightweight tag
       */
  def createLightweightTag(string: nodegitLib.oidMod.Oid, name: java.lang.String): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * Instantiate a new revision walker for browsing the Repository"s history. See also Commit.prototype.history()
       */
  def createRevWalk(): nodegitLib.revDashWalkMod.Revwalk = js.native
  def createTag(string: java.lang.String, name: java.lang.String, message: java.lang.String): stdLib.Promise[nodegitLib.tagMod.Tag] = js.native
  def createTag(string: nodegitLib.oidMod.Oid, name: java.lang.String, message: java.lang.String): stdLib.Promise[nodegitLib.tagMod.Tag] = js.native
  /**
       * Gets the default signature for the default user and now timestamp
       */
  def defaultSignature(): nodegitLib.signatureMod.Signature = js.native
  /**
       * Deletes a tag from a repository by the tag name.
       */
  def deleteTagByName(Short: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def detachHead(): scala.Double = js.native
  /**
       * Discard line selection of a specified file. Assumes selected lines are unstaged.
       */
  def discardLines(filePath: java.lang.String, selectedLines: js.Array[nodegitLib.diffDashLineMod.DiffLine]): stdLib.Promise[scala.Double] = js.native
  /**
       * Fetches from a remote
       */
  def fetch(remote: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
       * Fetches from a remote
       */
  def fetch(remote: java.lang.String, fetchOptions: nodegitLib.fetchDashOptionsMod.FetchOptions): stdLib.Promise[scala.Unit] = js.native
  /**
       * Fetches from a remote
       */
  def fetch(remote: nodegitLib.remoteMod.Remote): stdLib.Promise[scala.Unit] = js.native
  /**
       * Fetches from a remote
       */
  def fetch(remote: nodegitLib.remoteMod.Remote, fetchOptions: nodegitLib.fetchDashOptionsMod.FetchOptions): stdLib.Promise[scala.Unit] = js.native
  /**
       * Fetches from all remotes. This is done in series due to deadlocking issues with fetching from many remotes that can happen.
       */
  def fetchAll(): stdLib.Promise[scala.Unit] = js.native
  /**
       * Fetches from all remotes. This is done in series due to deadlocking issues with fetching from many remotes that can happen.
       */
  def fetchAll(fetchOptions: nodegitLib.fetchDashOptionsMod.FetchOptions): stdLib.Promise[scala.Unit] = js.native
  /**
       * Fetches from all remotes. This is done in series due to deadlocking issues with fetching from many remotes that can happen.
       */
  def fetchAll(fetchOptions: nodegitLib.fetchDashOptionsMod.FetchOptions, callback: js.Function): stdLib.Promise[scala.Unit] = js.native
  def fetchheadForeach(): stdLib.Promise[_] = js.native
  def fetchheadForeach(callback: js.Function): stdLib.Promise[_] = js.native
  def free(): scala.Unit = js.native
  /**
       * Retrieve the blob represented by the oid.
       */
  def getBlob(string: java.lang.String): stdLib.Promise[nodegitLib.blobMod.Blob] = js.native
  /**
       * Retrieve the blob represented by the oid.
       */
  def getBlob(string: nodegitLib.oidMod.Oid): stdLib.Promise[nodegitLib.blobMod.Blob] = js.native
  /**
       * Look up a branch. Alias for getReference
       */
  def getBranch(name: java.lang.String): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * Look up a branch. Alias for getReference
       */
  def getBranch(name: nodegitLib.referenceMod.Reference): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * Look up a branch's most recent commit. Alias to getReferenceCommit
       */
  def getBranchCommit(name: java.lang.String): stdLib.Promise[nodegitLib.commitMod.Commit] = js.native
  /**
       * Look up a branch's most recent commit. Alias to getReferenceCommit
       */
  def getBranchCommit(name: nodegitLib.referenceMod.Reference): stdLib.Promise[nodegitLib.commitMod.Commit] = js.native
  def getCommit(string: java.lang.String): stdLib.Promise[nodegitLib.commitMod.Commit] = js.native
  def getCommit(string: nodegitLib.commitMod.Commit): stdLib.Promise[nodegitLib.commitMod.Commit] = js.native
  def getCommit(string: nodegitLib.oidMod.Oid): stdLib.Promise[nodegitLib.commitMod.Commit] = js.native
  /**
       * Gets the branch that HEAD currently points to Is an alias to head()
       */
  def getCurrentBranch(): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * Retrieve the commit that HEAD is currently pointing to
       */
  def getHeadCommit(): stdLib.Promise[nodegitLib.commitMod.Commit] = js.native
  /**
       * Retrieve the master branch commit.
       */
  def getMasterCommit(): stdLib.Promise[nodegitLib.commitMod.Commit] = js.native
  def getNamespace(): java.lang.String = js.native
  /**
       * Lookup the reference with the given name.
       */
  def getReference(name: java.lang.String): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * Lookup the reference with the given name.
       */
  def getReference(name: nodegitLib.referenceMod.Reference): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  /**
       * Look up a refs's commit.
       */
  def getReferenceCommit(name: java.lang.String): stdLib.Promise[nodegitLib.commitMod.Commit] = js.native
  /**
       * Look up a refs's commit.
       */
  def getReferenceCommit(name: nodegitLib.referenceMod.Reference): stdLib.Promise[nodegitLib.commitMod.Commit] = js.native
  /**
       * Lookup reference names for a repository.
       */
  def getReferenceNames(`type`: nodegitLib.referenceMod.ReferenceNs.TYPE): stdLib.Promise[js.Array[java.lang.String]] = js.native
  /**
       * Lookup references for a repository.
       */
  def getReferences(`type`: nodegitLib.referenceMod.ReferenceNs.TYPE): stdLib.Promise[js.Array[nodegitLib.referenceMod.Reference]] = js.native
  /**
       * Gets a remote from the repo
       */
  def getRemote(remote: java.lang.String): stdLib.Promise[nodegitLib.remoteMod.Remote] = js.native
  /**
       * Gets a remote from the repo
       */
  def getRemote(remote: java.lang.String, callback: js.Function): stdLib.Promise[nodegitLib.remoteMod.Remote] = js.native
  /**
       * Gets a remote from the repo
       */
  def getRemote(remote: nodegitLib.remoteMod.Remote): stdLib.Promise[nodegitLib.remoteMod.Remote] = js.native
  /**
       * Gets a remote from the repo
       */
  def getRemote(remote: nodegitLib.remoteMod.Remote, callback: js.Function): stdLib.Promise[nodegitLib.remoteMod.Remote] = js.native
  /**
       * Lists out the remotes in the given repository.
       */
  def getRemotes(): stdLib.Promise[js.Array[nodegitLib.remoteMod.Remote]] = js.native
  /**
       * Lists out the remotes in the given repository.
       */
  def getRemotes(callback: js.Function): stdLib.Promise[js.Array[nodegitLib.remoteMod.Remote]] = js.native
  /**
       * Get the status of a repo to it's working directory
       */
  def getStatus(): stdLib.Promise[js.Array[nodegitLib.statusDashFileMod.StatusFile]] = js.native
  /**
       * Get the status of a repo to it's working directory
       */
  def getStatus(opts: nodegitLib.statusDashOptionsMod.StatusOptions): stdLib.Promise[js.Array[nodegitLib.statusDashFileMod.StatusFile]] = js.native
  /**
       * Get extended statuses of a repo to it's working directory. Status entries have status, headToIndex delta, and indexToWorkdir deltas
       */
  def getStatusExt(): stdLib.Promise[js.Array[nodegitLib.statusDashFileMod.StatusFile]] = js.native
  /**
       * Get extended statuses of a repo to it's working directory. Status entries have status, headToIndex delta, and indexToWorkdir deltas
       */
  def getStatusExt(opts: nodegitLib.statusDashOptionsMod.StatusOptions): stdLib.Promise[js.Array[nodegitLib.statusDashFileMod.StatusFile]] = js.native
  /**
       * Get the names of the submodules in the repository.
       */
  def getSubmoduleNames(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  /**
       * Retrieve the tag represented by the oid.
       */
  def getTag(string: java.lang.String): stdLib.Promise[nodegitLib.tagMod.Tag] = js.native
  /**
       * Retrieve the tag represented by the oid.
       */
  def getTag(string: nodegitLib.oidMod.Oid): stdLib.Promise[nodegitLib.tagMod.Tag] = js.native
  /**
       * Retrieve the tag represented by the tag name.
       */
  def getTagByName(Short: java.lang.String): stdLib.Promise[nodegitLib.tagMod.Tag] = js.native
  /**
       * Retrieve the tree represented by the oid.
       */
  def getTree(string: java.lang.String): stdLib.Promise[nodegitLib.treeMod.Tree] = js.native
  /**
       * Retrieve the tree represented by the oid.
       */
  def getTree(string: nodegitLib.oidMod.Oid): stdLib.Promise[nodegitLib.treeMod.Tree] = js.native
  def head(): stdLib.Promise[nodegitLib.referenceMod.Reference] = js.native
  def headDetached(): scala.Double = js.native
  def headUnborn(): scala.Double = js.native
  def index(): stdLib.Promise[nodegitLib.indexUnderscoreMod.Index] = js.native
  /**
       * Returns true if the repository is in the APPLY_MAILBOX or APPLY_MAILBOX_OR_REBASE state.
       */
  def isApplyingMailbox(): scala.Boolean = js.native
  def isBare(): scala.Double = js.native
  /**
       * Returns true if the repository is in the BISECT state.
       */
  def isBisecting(): scala.Boolean = js.native
  /**
       * Returns true if the repository is in the CHERRYPICK state.
       */
  def isCherrypicking(): scala.Boolean = js.native
  /**
       * Returns true if the repository is in the default NONE state.
       */
  def isDefaultState(): scala.Boolean = js.native
  def isEmpty(): scala.Double = js.native
  /**
       * Returns true if the repository is in the MERGE state.
       */
  def isMerging(): scala.Boolean = js.native
  /**
       * Returns true if the repository is in the REBASE, REBASE_INTERACTIVE, or REBASE_MERGE state.
       */
  def isRebasing(): scala.Boolean = js.native
  /**
       * Returns true if the repository is in the REVERT state.
       */
  def isReverting(): scala.Boolean = js.native
  def isShallow(): scala.Double = js.native
  def mergeBranches(to: java.lang.String, from: java.lang.String): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(to: java.lang.String, from: java.lang.String, signature: nodegitLib.signatureMod.Signature): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(
    to: java.lang.String,
    from: java.lang.String,
    signature: nodegitLib.signatureMod.Signature,
    mergePreference: nodegitLib.mergeMod.MergeNs.PREFERENCE
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(
    to: java.lang.String,
    from: java.lang.String,
    signature: nodegitLib.signatureMod.Signature,
    mergePreference: nodegitLib.mergeMod.MergeNs.PREFERENCE,
    mergeOptions: nodegitLib.mergeDashOptionsMod.MergeOptions
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(to: java.lang.String, from: nodegitLib.referenceMod.Reference): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(
    to: java.lang.String,
    from: nodegitLib.referenceMod.Reference,
    signature: nodegitLib.signatureMod.Signature
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(
    to: java.lang.String,
    from: nodegitLib.referenceMod.Reference,
    signature: nodegitLib.signatureMod.Signature,
    mergePreference: nodegitLib.mergeMod.MergeNs.PREFERENCE
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(
    to: java.lang.String,
    from: nodegitLib.referenceMod.Reference,
    signature: nodegitLib.signatureMod.Signature,
    mergePreference: nodegitLib.mergeMod.MergeNs.PREFERENCE,
    mergeOptions: nodegitLib.mergeDashOptionsMod.MergeOptions
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(to: nodegitLib.referenceMod.Reference, from: java.lang.String): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(
    to: nodegitLib.referenceMod.Reference,
    from: java.lang.String,
    signature: nodegitLib.signatureMod.Signature
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(
    to: nodegitLib.referenceMod.Reference,
    from: java.lang.String,
    signature: nodegitLib.signatureMod.Signature,
    mergePreference: nodegitLib.mergeMod.MergeNs.PREFERENCE
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(
    to: nodegitLib.referenceMod.Reference,
    from: java.lang.String,
    signature: nodegitLib.signatureMod.Signature,
    mergePreference: nodegitLib.mergeMod.MergeNs.PREFERENCE,
    mergeOptions: nodegitLib.mergeDashOptionsMod.MergeOptions
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(to: nodegitLib.referenceMod.Reference, from: nodegitLib.referenceMod.Reference): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(
    to: nodegitLib.referenceMod.Reference,
    from: nodegitLib.referenceMod.Reference,
    signature: nodegitLib.signatureMod.Signature
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(
    to: nodegitLib.referenceMod.Reference,
    from: nodegitLib.referenceMod.Reference,
    signature: nodegitLib.signatureMod.Signature,
    mergePreference: nodegitLib.mergeMod.MergeNs.PREFERENCE
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeBranches(
    to: nodegitLib.referenceMod.Reference,
    from: nodegitLib.referenceMod.Reference,
    signature: nodegitLib.signatureMod.Signature,
    mergePreference: nodegitLib.mergeMod.MergeNs.PREFERENCE,
    mergeOptions: nodegitLib.mergeDashOptionsMod.MergeOptions
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def mergeheadForeach(): stdLib.Promise[_] = js.native
  def mergeheadForeach(callback: js.Function): stdLib.Promise[_] = js.native
  def messageRemove(): scala.Double = js.native
  def odb(): stdLib.Promise[nodegitLib.odbMod.Odb] = js.native
  def path(): java.lang.String = js.native
  /**
       * Rebases a branch onto another branch
       */
  def rebaseBranches(
    branch: java.lang.String,
    upstream: java.lang.String,
    onto: java.lang.String,
    signature: nodegitLib.signatureMod.Signature,
    beforeNextFn: js.Function
  ): stdLib.Promise[nodegitLib.oidMod.Oid] = js.native
  def refdb(): stdLib.Promise[nodegitLib.refDashDbMod.Refdb] = js.native
  /**
       * Grabs a fresh copy of the index from the repository. Invalidates all previously grabbed indexes
       */
  def refreshIndex(): stdLib.Promise[nodegitLib.indexUnderscoreMod.Index] = js.native
  def setHead(refname: java.lang.String): stdLib.Promise[scala.Double] = js.native
  def setHeadDetached(commitish: nodegitLib.oidMod.Oid): scala.Double = js.native
  def setHeadDetachedFromAnnotated(commitish: nodegitLib.annotatedDashCommitMod.AnnotatedCommit): scala.Double = js.native
  def setIdent(name: java.lang.String, email: java.lang.String): scala.Double = js.native
  def setNamespace(nmspace: java.lang.String): scala.Double = js.native
  def setWorkdir(workdir: java.lang.String, updateGitLink: scala.Double): scala.Double = js.native
  /**
       * Stages or unstages line selection of a specified file
       */
  def stageFilemode(filePath: java.lang.String, stageNew: scala.Boolean): stdLib.Promise[scala.Double] = js.native
  /**
       * Stages or unstages line selection of a specified file
       */
  def stageFilemode(filePath: js.Array[java.lang.String], stageNew: scala.Boolean): stdLib.Promise[scala.Double] = js.native
  /**
       * Stages or unstages line selection of a specified file
       */
  def stageLines(
    filePath: java.lang.String,
    newLines: js.Array[nodegitLib.diffDashLineMod.DiffLine],
    isStaged: scala.Boolean
  ): stdLib.Promise[scala.Double] = js.native
  def state(): scala.Double = js.native
  def stateCleanup(): scala.Double = js.native
  def treeBuilder(tree: nodegitLib.treeMod.Tree): stdLib.Promise[nodegitLib.treeDashBuilderMod.Treebuilder] = js.native
  def workdir(): java.lang.String = js.native
}

@JSImport("nodegit/repository", "Repository")
@js.native
object Repository extends js.Object {
  /**
       * Creates a branch with the passed in name pointing to the commit
       */
  def discover(startPath: java.lang.String, acrossFs: scala.Double, ceilingDirs: java.lang.String): stdLib.Promise[nodegitLib.bufMod.Buf] = js.native
  def init(path: java.lang.String, isBare: scala.Double): stdLib.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def initExt(repoPath: java.lang.String): stdLib.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def initExt(repoPath: java.lang.String, options: nodegitLib.repositoryMod.RepositoryInitOptions): stdLib.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def open(path: java.lang.String): stdLib.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def openBare(barePath: java.lang.String): stdLib.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def openExt(path: java.lang.String): stdLib.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def openExt(path: java.lang.String, flags: scala.Double): stdLib.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def openExt(path: java.lang.String, flags: scala.Double, ceilingDirs: java.lang.String): stdLib.Promise[nodegitLib.repositoryMod.Repository] = js.native
  def wrapOdb(odb: nodegitLib.odbMod.Odb): stdLib.Promise[nodegitLib.repositoryMod.Repository] = js.native
}
