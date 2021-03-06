package typings
package gitLib.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "FileIndex")
@js.native
class FileIndex protected () extends js.Object {
  def this(repoPath: js.Any, callback: js.Function) = this()
  var all_files: js.Any = js.native
  var commit_index: js.Any = js.native
  var commit_order: js.Any = js.native
  var index_file: js.Any = js.native
  var repo_path: js.Any = js.native
  var sha_count: js.Any = js.native
  def commits_for(file: js.Any, callback: js.Function): scala.Unit = js.native
  def commits_from(commitSha: js.Any, callback: js.Function): scala.Unit = js.native
  def count(commitSha: js.Any, callback: js.Function): scala.Unit = js.native
  def count_all(callback: js.Function): scala.Unit = js.native
  def files(commitSha: js.Any, callback: js.Function): scala.Unit = js.native
  def last_commits(commitSha: js.Any, filesMatcher: js.Any, callback: js.Function): scala.Unit = js.native
  def sort_commits(shaArray: js.Array[_]): js.Array[_] = js.native
}

