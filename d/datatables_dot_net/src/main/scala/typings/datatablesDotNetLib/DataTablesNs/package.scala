package typings
package datatablesDotNetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DataTablesNs {
  //#endregion "language-settings"
  //#endregion "Settings"
  //#region "SettingsLegacy"
  type ArrayStringNode = org.scalablytyped.runtime.StringDictionary[stdLib.Node]
  type CookieCallbackLegacy = js.Function5[
    /* name */ java.lang.String, 
    /* data */ js.Any, 
    /* expires */ java.lang.String, 
    /* path */ java.lang.String, 
    /* cookie */ java.lang.String, 
    scala.Unit
  ]
  type FunctionAjax = js.Function3[
    /* data */ js.Object, 
    /* callback */ js.Function1[/* data */ js.Any, scala.Unit], 
    /* settings */ SettingsLegacy, 
    scala.Unit
  ]
  type FunctionAjaxData = js.Function2[/* data */ js.Object, /* settings */ Settings, java.lang.String | js.Object]
  type FunctionColumnCreatedCell = js.Function5[
    /* cell */ stdLib.Node, 
    /* cellData */ js.Any, 
    /* rowData */ js.Any, 
    /* row */ scala.Double, 
    /* col */ scala.Double, 
    scala.Unit
  ]
  type FunctionColumnRender = js.Function4[
    /* data */ js.Any, 
    /* type */ js.Any, 
    /* row */ js.Any, 
    /* meta */ CellMetaSettings, 
    js.Any
  ]
  //#endregion "other-settings"
  //#region "callback-functions"
  type FunctionCreateRow = js.Function3[
    /* row */ stdLib.Node, 
    /* data */ js.Array[js.Any] | js.Object, 
    /* dataIndex */ scala.Double, 
    scala.Unit
  ]
  type FunctionDrawCallback = js.Function1[/* settings */ SettingsLegacy, scala.Unit]
  /**
    * @param data Data from the column cell to be analysed.
    * @param DataTables settings object.
    */
  type FunctionExtTypeSettingsDetect = js.Function2[/* data */ js.Any, /* settings */ Settings, java.lang.String | scala.Null]
  type FunctionFooterCallback = js.Function5[
    /* tfoot */ stdLib.Node, 
    /* data */ js.Array[js.Any], 
    /* start */ scala.Double, 
    /* end */ scala.Double, 
    /* display */ js.Array[js.Any], 
    scala.Unit
  ]
  type FunctionFormatNumber = js.Function1[/* formatNumber */ scala.Double, scala.Unit]
  type FunctionHeaderCallback = js.Function5[
    /* thead */ stdLib.Node, 
    /* data */ js.Array[js.Any], 
    /* start */ scala.Double, 
    /* end */ scala.Double, 
    /* display */ js.Array[js.Any], 
    scala.Unit
  ]
  type FunctionInfoCallback = js.Function6[
    /* settings */ SettingsLegacy, 
    /* start */ scala.Double, 
    /* end */ scala.Double, 
    /* mnax */ scala.Double, 
    /* total */ scala.Double, 
    /* pre */ java.lang.String, 
    scala.Unit
  ]
  type FunctionInitComplete = js.Function2[/* settings */ SettingsLegacy, /* json */ js.Object, scala.Unit]
  type FunctionPreDrawCallback = js.Function1[/* settings */ SettingsLegacy, scala.Unit]
  type FunctionRowCallback = js.Function3[
    /* row */ stdLib.Node, 
    /* data */ js.Array[js.Any] | js.Object, 
    /* index */ scala.Double, 
    scala.Unit
  ]
  type FunctionStateLoadCallback = js.Function1[/* settings */ SettingsLegacy, scala.Unit]
  type FunctionStateLoadParams = js.Function2[/* settings */ SettingsLegacy, /* data */ js.Object, scala.Unit]
  type FunctionStateLoaded = js.Function2[/* settings */ SettingsLegacy, /* data */ js.Object, scala.Unit]
  type FunctionStateSaveCallback = js.Function2[/* settings */ SettingsLegacy, /* data */ js.Object, scala.Unit]
  type FunctionStateSaveParams = js.Function2[/* settings */ SettingsLegacy, /* data */ js.Object, scala.Unit]
  type FunctionThrottle = js.Function1[/* data */ js.Any, scala.Unit]
}
