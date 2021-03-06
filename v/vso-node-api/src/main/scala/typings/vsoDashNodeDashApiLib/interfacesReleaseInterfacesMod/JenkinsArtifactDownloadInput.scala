package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsArtifactDownloadInput extends ArtifactDownloadInputBase {
  var artifactItems: js.Array[java.lang.String]
}

object JenkinsArtifactDownloadInput {
  @scala.inline
  def apply(
    alias: java.lang.String,
    artifactDownloadMode: java.lang.String,
    artifactItems: js.Array[java.lang.String],
    artifactType: java.lang.String
  ): JenkinsArtifactDownloadInput = {
    val __obj = js.Dynamic.literal(alias = alias, artifactDownloadMode = artifactDownloadMode, artifactItems = artifactItems, artifactType = artifactType)
  
    __obj.asInstanceOf[JenkinsArtifactDownloadInput]
  }
}

