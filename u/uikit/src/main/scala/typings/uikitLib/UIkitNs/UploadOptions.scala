package typings
package uikitLib.UIkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadOptions extends js.Object {
  var abort: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Target url for the upload
    * @default ''
    * <h2>Possible value</h2>
    * string
    */
  var action: js.UndefOr[java.lang.String] = js.undefined
  var allcomplete: js.UndefOr[js.Function2[/* response */ js.Any, /* xhr */ stdLib.XMLHttpRequest, _]] = js.undefined
  /**
    * File filter
    * @default *.*
    * <h2>Possible value</h2>
    * string
    */
  var allow: js.UndefOr[java.lang.String] = js.undefined
  var before: js.UndefOr[
    js.Function2[
      /* settings */ this.type, 
      /* files */ java.lang.String | js.Array[java.lang.String], 
      _
    ]
  ] = js.undefined
  var beforeAll: js.UndefOr[js.Function1[/* files */ java.lang.String | js.Array[java.lang.String], _]] = js.undefined
  var beforeSend: js.UndefOr[js.Function1[/* xhr */ stdLib.XMLHttpRequest, _]] = js.undefined
  var complete: js.UndefOr[js.Function2[/* response */ js.Any, /* xhr */ stdLib.XMLHttpRequest, _]] = js.undefined
  var error: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Limit the number of files to upload
    * @default false
    * <h2>Possible value</h2>
    * integer
    */
  var filelimit: js.UndefOr[scala.Double] = js.undefined
  var load: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  var loadend: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  var loadstart: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  var notallowed: js.UndefOr[
    js.Function2[
      /* file */ java.lang.String | js.Array[java.lang.String], 
      /* settings */ this.type, 
      _
    ]
  ] = js.undefined
  /**
    * Post query name
    * @default files[]
    * <h2>Possible value</h2>
    * string
    */
  var param: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Additional request parameters
    * @default {}
    * <h2>Possible value</h2>
    * JSON Object
    */
  var params: js.UndefOr[js.Object] = js.undefined
  var progress: js.UndefOr[js.Function1[/* percent */ scala.Double, _]] = js.undefined
  var readystatechange: js.UndefOr[js.Function1[/* event */ js.Any, _]] = js.undefined
  /**
    * Send each file one by one
    * @default true
    * <h2>Possible value</h2>
    * boolean
    */
  var single: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Response type from server
    * @default text
    * <h2>Possible Value</h2>
    * (text|json)
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object UploadOptions {
  @scala.inline
  def apply(
    abort: /* event */ js.Any => _ = null,
    action: java.lang.String = null,
    allcomplete: (/* response */ js.Any, /* xhr */ stdLib.XMLHttpRequest) => _ = null,
    allow: java.lang.String = null,
    before: (UploadOptions, /* files */ java.lang.String | js.Array[java.lang.String]) => _ = null,
    beforeAll: /* files */ java.lang.String | js.Array[java.lang.String] => _ = null,
    beforeSend: /* xhr */ stdLib.XMLHttpRequest => _ = null,
    complete: (/* response */ js.Any, /* xhr */ stdLib.XMLHttpRequest) => _ = null,
    error: /* event */ js.Any => _ = null,
    filelimit: scala.Int | scala.Double = null,
    load: /* event */ js.Any => _ = null,
    loadend: /* event */ js.Any => _ = null,
    loadstart: /* event */ js.Any => _ = null,
    notallowed: (/* file */ java.lang.String | js.Array[java.lang.String], UploadOptions) => _ = null,
    param: java.lang.String = null,
    params: js.Object = null,
    progress: /* percent */ scala.Double => _ = null,
    readystatechange: /* event */ js.Any => _ = null,
    single: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): UploadOptions = {
    val __obj = js.Dynamic.literal()
    if (abort != null) __obj.updateDynamic("abort")(js.Any.fromFunction1(abort))
    if (action != null) __obj.updateDynamic("action")(action)
    if (allcomplete != null) __obj.updateDynamic("allcomplete")(js.Any.fromFunction2(allcomplete))
    if (allow != null) __obj.updateDynamic("allow")(allow)
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction2(before))
    if (beforeAll != null) __obj.updateDynamic("beforeAll")(js.Any.fromFunction1(beforeAll))
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction2(complete))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (filelimit != null) __obj.updateDynamic("filelimit")(filelimit.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loadend != null) __obj.updateDynamic("loadend")(js.Any.fromFunction1(loadend))
    if (loadstart != null) __obj.updateDynamic("loadstart")(js.Any.fromFunction1(loadstart))
    if (notallowed != null) __obj.updateDynamic("notallowed")(js.Any.fromFunction2(notallowed))
    if (param != null) __obj.updateDynamic("param")(param)
    if (params != null) __obj.updateDynamic("params")(params)
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction1(progress))
    if (readystatechange != null) __obj.updateDynamic("readystatechange")(js.Any.fromFunction1(readystatechange))
    if (!js.isUndefined(single)) __obj.updateDynamic("single")(single)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UploadOptions]
  }
}

