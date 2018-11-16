package typings
package codemirrorLib.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CodeMirrorNs {
  /**
       * A function that calls the updateLintingCallback with any errors found during the linting process.
       */
  type AsyncLinter = js.Function4[
    /* content */ java.lang.String, 
    /* updateLintingCallback */ UpdateLintingCallback, 
    /* options */ LintStateOptions, 
    /* codeMirror */ Editor, 
    scala.Unit
  ]
  type CoordsMode = codemirrorLib.codemirrorLibStrings.window | codemirrorLib.codemirrorLibStrings.page | codemirrorLib.codemirrorLibStrings.local
  type DOMEvent = codemirrorLib.codemirrorLibStrings.mousedown | codemirrorLib.codemirrorLibStrings.dblclick | codemirrorLib.codemirrorLibStrings.touchstart | codemirrorLib.codemirrorLibStrings.contextmenu | codemirrorLib.codemirrorLibStrings.keydown | codemirrorLib.codemirrorLibStrings.keypress | codemirrorLib.codemirrorLibStrings.keyup | codemirrorLib.codemirrorLibStrings.cut | codemirrorLib.codemirrorLibStrings.copy | codemirrorLib.codemirrorLibStrings.paste | codemirrorLib.codemirrorLibStrings.dragstart | codemirrorLib.codemirrorLibStrings.dragenter | codemirrorLib.codemirrorLibStrings.dragover | codemirrorLib.codemirrorLibStrings.dragleave | codemirrorLib.codemirrorLibStrings.drop
  type HintFunction = js.Function1[/* cm */ Editor, Hints]
  /**
       * A function that return errors found during the linting process.
       */
  type Linter = js.Function3[
    /* content */ java.lang.String, 
    /* options */ LintStateOptions, 
    /* codeMirror */ Editor, 
    js.Array[Annotation] | stdLib.PromiseLike[js.Array[Annotation]]
  ]
  /**
       * A function that, given a CodeMirror configuration object and an optional mode configuration object, returns a mode object.
       */
  type ModeFactory[T] = js.Function2[/* config */ EditorConfiguration, /* modeOptions */ js.UndefOr[js.Any], Mode[T]]
  /**
       * A function that, given an array of annotations, updates the CodeMirror linting GUI with those annotations
       */
  type UpdateLintingCallback = js.Function2[/* codeMirror */ Editor, /* annotations */ js.Array[Annotation], scala.Unit]
}