package typings
package officeDashJsLib.WordNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "document.toJSON()". */

trait DocumentData extends js.Object {
  /**
               *
               * Gets or sets a value that indicates that, when opening a new document, whether it is allowed to close this document even if this document is untitled. True to close, false otherwise.
               *
               * [Api set: WordApi]
               */
  var allowCloseOnUntitled: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Gets the body object of the document. The body is the text that excludes headers, footers, footnotes, textboxes, etc.. Read-only.
              *
              * [Api set: WordApi 1.1]
              */
  var body: js.UndefOr[BodyData] = js.undefined
  /**
              *
              * Gets the collection of content control objects in the document. This includes content controls in the body of the document, headers, footers, textboxes, etc.. Read-only.
              *
              * [Api set: WordApi 1.1]
              */
  var contentControls: js.UndefOr[js.Array[ContentControlData]] = js.undefined
  /**
              *
              * Gets the properties of the document. Read-only.
              *
              * [Api set: WordApi 1.3]
              */
  var properties: js.UndefOr[DocumentPropertiesData] = js.undefined
  /**
               *
               * Indicates whether the changes in the document have been saved. A value of true indicates that the document hasn't changed since it was saved. Read-only.
               *
               * [Api set: WordApi 1.1]
               */
  var saved: js.UndefOr[scala.Boolean] = js.undefined
  /**
              *
              * Gets the collection of section objects in the document. Read-only.
              *
              * [Api set: WordApi 1.1]
              */
  var sections: js.UndefOr[js.Array[SectionData]] = js.undefined
}
