package typings
package reactDashMdlLib.reactDashMdlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarProps
  extends MDLHTMLAttributes
     with MDLDOMAttributes[TabBar] {
  var activeTab: js.UndefOr[scala.Double] = js.undefined
  var cssPrefix: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* tabId */ scala.Double, _]] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[TabBar]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object TabBarProps {
  @scala.inline
  def apply(
    cssPrefix: java.lang.String,
    about: java.lang.String = null,
    accept: java.lang.String = null,
    acceptCharset: java.lang.String = null,
    accessKey: java.lang.String = null,
    action: java.lang.String = null,
    activeTab: scala.Int | scala.Double = null,
    allowFullScreen: js.UndefOr[scala.Boolean] = js.undefined,
    allowTransparency: js.UndefOr[scala.Boolean] = js.undefined,
    alt: java.lang.String = null,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    autoCapitalize: java.lang.String = null,
    autoComplete: java.lang.String = null,
    autoCorrect: java.lang.String = null,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    autoPlay: js.UndefOr[scala.Boolean] = js.undefined,
    autoSave: java.lang.String = null,
    capture: js.UndefOr[scala.Boolean] = js.undefined,
    cellPadding: scala.Double | java.lang.String = null,
    cellSpacing: scala.Double | java.lang.String = null,
    challenge: java.lang.String = null,
    charSet: java.lang.String = null,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    classID: java.lang.String = null,
    className: java.lang.String = null,
    colSpan: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    cols: scala.Int | scala.Double = null,
    content: java.lang.String = null,
    contentEditable: js.UndefOr[scala.Boolean] = js.undefined,
    contextMenu: java.lang.String = null,
    controls: js.UndefOr[scala.Boolean] = js.undefined,
    coords: java.lang.String = null,
    crossOrigin: java.lang.String = null,
    dangerouslySetInnerHTML: reactDashMdlLib.Anon_Html = null,
    datatype: java.lang.String = null,
    dateTime: java.lang.String = null,
    default: js.UndefOr[scala.Boolean] = js.undefined,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: scala.Double | java.lang.String | js.Array[java.lang.String] = null,
    defer: js.UndefOr[scala.Boolean] = js.undefined,
    dir: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    download: js.Any = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    encType: java.lang.String = null,
    form: java.lang.String = null,
    formAction: java.lang.String = null,
    formEncType: java.lang.String = null,
    formMethod: java.lang.String = null,
    formNoValidate: js.UndefOr[scala.Boolean] = js.undefined,
    formTarget: java.lang.String = null,
    frameBorder: scala.Double | java.lang.String = null,
    headers: java.lang.String = null,
    height: scala.Double | java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    high: scala.Int | scala.Double = null,
    href: java.lang.String = null,
    hrefLang: java.lang.String = null,
    htmlFor: java.lang.String = null,
    httpEquiv: java.lang.String = null,
    id: java.lang.String = null,
    inlist: js.Any = null,
    inputMode: java.lang.String = null,
    integrity: java.lang.String = null,
    is: java.lang.String = null,
    itemID: java.lang.String = null,
    itemProp: java.lang.String = null,
    itemRef: java.lang.String = null,
    itemScope: js.UndefOr[scala.Boolean] = js.undefined,
    itemType: java.lang.String = null,
    keyParams: java.lang.String = null,
    keyType: java.lang.String = null,
    kind: java.lang.String = null,
    lang: java.lang.String = null,
    list: java.lang.String = null,
    loop: js.UndefOr[scala.Boolean] = js.undefined,
    low: scala.Int | scala.Double = null,
    manifest: java.lang.String = null,
    marginHeight: scala.Int | scala.Double = null,
    marginWidth: scala.Int | scala.Double = null,
    max: scala.Double | java.lang.String = null,
    maxLength: scala.Int | scala.Double = null,
    media: java.lang.String = null,
    mediaGroup: java.lang.String = null,
    method: java.lang.String = null,
    min: scala.Double | java.lang.String = null,
    minLength: scala.Int | scala.Double = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    muted: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    noValidate: js.UndefOr[scala.Boolean] = js.undefined,
    nonce: java.lang.String = null,
    onAbort: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onBlur: reactLib.reactMod.FocusEventHandler[TabBar] = null,
    onCanPlay: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onCanPlayThrough: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onChange: /* tabId */ scala.Double => _ = null,
    onClick: reactLib.reactMod.MouseEventHandler[TabBar] = null,
    onCompositionEnd: reactLib.reactMod.CompositionEventHandler[TabBar] = null,
    onCompositionStart: reactLib.reactMod.CompositionEventHandler[TabBar] = null,
    onCompositionUpdate: reactLib.reactMod.CompositionEventHandler[TabBar] = null,
    onContextMenu: reactLib.reactMod.MouseEventHandler[TabBar] = null,
    onCopy: reactLib.reactMod.ClipboardEventHandler[TabBar] = null,
    onCut: reactLib.reactMod.ClipboardEventHandler[TabBar] = null,
    onDoubleClick: reactLib.reactMod.MouseEventHandler[TabBar] = null,
    onDrag: reactLib.reactMod.DragEventHandler[TabBar] = null,
    onDragEnd: reactLib.reactMod.DragEventHandler[TabBar] = null,
    onDragEnter: reactLib.reactMod.DragEventHandler[TabBar] = null,
    onDragExit: reactLib.reactMod.DragEventHandler[TabBar] = null,
    onDragLeave: reactLib.reactMod.DragEventHandler[TabBar] = null,
    onDragOver: reactLib.reactMod.DragEventHandler[TabBar] = null,
    onDragStart: reactLib.reactMod.DragEventHandler[TabBar] = null,
    onDrop: reactLib.reactMod.DragEventHandler[TabBar] = null,
    onDurationChange: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onEmptied: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onEncrypted: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onEnded: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onError: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onFocus: reactLib.reactMod.FocusEventHandler[TabBar] = null,
    onInput: reactLib.reactMod.FormEventHandler[TabBar] = null,
    onKeyDown: reactLib.reactMod.KeyboardEventHandler[TabBar] = null,
    onKeyPress: reactLib.reactMod.KeyboardEventHandler[TabBar] = null,
    onKeyUp: reactLib.reactMod.KeyboardEventHandler[TabBar] = null,
    onLoad: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onLoadStart: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onLoadedData: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onLoadedMetadata: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onMouseDown: reactLib.reactMod.MouseEventHandler[TabBar] = null,
    onMouseEnter: reactLib.reactMod.MouseEventHandler[TabBar] = null,
    onMouseLeave: reactLib.reactMod.MouseEventHandler[TabBar] = null,
    onMouseMove: reactLib.reactMod.MouseEventHandler[TabBar] = null,
    onMouseOut: reactLib.reactMod.MouseEventHandler[TabBar] = null,
    onMouseOver: reactLib.reactMod.MouseEventHandler[TabBar] = null,
    onMouseUp: reactLib.reactMod.MouseEventHandler[TabBar] = null,
    onPaste: reactLib.reactMod.ClipboardEventHandler[TabBar] = null,
    onPause: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onPlay: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onPlaying: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onProgress: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onRateChange: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onScroll: reactLib.reactMod.UIEventHandler[TabBar] = null,
    onSeeked: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onSeeking: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onSelect: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onStalled: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onSubmit: reactLib.reactMod.FormEventHandler[TabBar] = null,
    onSuspend: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onTimeUpdate: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onTouchCancel: reactLib.reactMod.TouchEventHandler[TabBar] = null,
    onTouchEnd: reactLib.reactMod.TouchEventHandler[TabBar] = null,
    onTouchMove: reactLib.reactMod.TouchEventHandler[TabBar] = null,
    onTouchStart: reactLib.reactMod.TouchEventHandler[TabBar] = null,
    onVolumeChange: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onWaiting: reactLib.reactMod.ReactEventHandler[TabBar] = null,
    onWheel: reactLib.reactMod.WheelEventHandler[TabBar] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    optimum: scala.Int | scala.Double = null,
    pattern: java.lang.String = null,
    placeholder: java.lang.String = null,
    poster: java.lang.String = null,
    prefix: java.lang.String = null,
    preload: java.lang.String = null,
    property: java.lang.String = null,
    radioGroup: java.lang.String = null,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    rel: java.lang.String = null,
    required: js.UndefOr[scala.Boolean] = js.undefined,
    resource: java.lang.String = null,
    results: scala.Int | scala.Double = null,
    reversed: js.UndefOr[scala.Boolean] = js.undefined,
    role: java.lang.String = null,
    rowSpan: scala.Int | scala.Double = null,
    sandbox: java.lang.String = null,
    scope: java.lang.String = null,
    scoped: js.UndefOr[scala.Boolean] = js.undefined,
    scrolling: java.lang.String = null,
    seamless: js.UndefOr[scala.Boolean] = js.undefined,
    security: java.lang.String = null,
    selected: js.UndefOr[scala.Boolean] = js.undefined,
    shape: java.lang.String = null,
    sizes: java.lang.String = null,
    span: scala.Int | scala.Double = null,
    spellCheck: js.UndefOr[scala.Boolean] = js.undefined,
    src: java.lang.String = null,
    srcDoc: java.lang.String = null,
    srcLang: java.lang.String = null,
    srcSet: java.lang.String = null,
    start: scala.Int | scala.Double = null,
    step: scala.Double | java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    summary: java.lang.String = null,
    tabIndex: scala.Int | scala.Double = null,
    target: java.lang.String = null,
    title: java.lang.String = null,
    `type`: java.lang.String = null,
    typeof: java.lang.String = null,
    unselectable: js.UndefOr[scala.Boolean] = js.undefined,
    useMap: java.lang.String = null,
    vocab: java.lang.String = null,
    width: scala.Double | java.lang.String = null,
    wmode: java.lang.String = null,
    wrap: java.lang.String = null
  ): TabBarProps = {
    val __obj = js.Dynamic.literal(cssPrefix = cssPrefix)
    if (about != null) __obj.updateDynamic("about")(about)
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (acceptCharset != null) __obj.updateDynamic("acceptCharset")(acceptCharset)
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey)
    if (action != null) __obj.updateDynamic("action")(action)
    if (activeTab != null) __obj.updateDynamic("activeTab")(activeTab.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFullScreen)) __obj.updateDynamic("allowFullScreen")(allowFullScreen)
    if (!js.isUndefined(allowTransparency)) __obj.updateDynamic("allowTransparency")(allowTransparency)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (autoCapitalize != null) __obj.updateDynamic("autoCapitalize")(autoCapitalize)
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete)
    if (autoCorrect != null) __obj.updateDynamic("autoCorrect")(autoCorrect)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (!js.isUndefined(autoPlay)) __obj.updateDynamic("autoPlay")(autoPlay)
    if (autoSave != null) __obj.updateDynamic("autoSave")(autoSave)
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    if (cellPadding != null) __obj.updateDynamic("cellPadding")(cellPadding.asInstanceOf[js.Any])
    if (cellSpacing != null) __obj.updateDynamic("cellSpacing")(cellSpacing.asInstanceOf[js.Any])
    if (challenge != null) __obj.updateDynamic("challenge")(challenge)
    if (charSet != null) __obj.updateDynamic("charSet")(charSet)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (classID != null) __obj.updateDynamic("classID")(classID)
    if (className != null) __obj.updateDynamic("className")(className)
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(contentEditable)) __obj.updateDynamic("contentEditable")(contentEditable)
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu)
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls)
    if (coords != null) __obj.updateDynamic("coords")(coords)
    if (crossOrigin != null) __obj.updateDynamic("crossOrigin")(crossOrigin)
    if (dangerouslySetInnerHTML != null) __obj.updateDynamic("dangerouslySetInnerHTML")(dangerouslySetInnerHTML)
    if (datatype != null) __obj.updateDynamic("datatype")(datatype)
    if (dateTime != null) __obj.updateDynamic("dateTime")(dateTime)
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (download != null) __obj.updateDynamic("download")(download)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (encType != null) __obj.updateDynamic("encType")(encType)
    if (form != null) __obj.updateDynamic("form")(form)
    if (formAction != null) __obj.updateDynamic("formAction")(formAction)
    if (formEncType != null) __obj.updateDynamic("formEncType")(formEncType)
    if (formMethod != null) __obj.updateDynamic("formMethod")(formMethod)
    if (!js.isUndefined(formNoValidate)) __obj.updateDynamic("formNoValidate")(formNoValidate)
    if (formTarget != null) __obj.updateDynamic("formTarget")(formTarget)
    if (frameBorder != null) __obj.updateDynamic("frameBorder")(frameBorder.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href)
    if (hrefLang != null) __obj.updateDynamic("hrefLang")(hrefLang)
    if (htmlFor != null) __obj.updateDynamic("htmlFor")(htmlFor)
    if (httpEquiv != null) __obj.updateDynamic("httpEquiv")(httpEquiv)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inlist != null) __obj.updateDynamic("inlist")(inlist)
    if (inputMode != null) __obj.updateDynamic("inputMode")(inputMode)
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (is != null) __obj.updateDynamic("is")(is)
    if (itemID != null) __obj.updateDynamic("itemID")(itemID)
    if (itemProp != null) __obj.updateDynamic("itemProp")(itemProp)
    if (itemRef != null) __obj.updateDynamic("itemRef")(itemRef)
    if (!js.isUndefined(itemScope)) __obj.updateDynamic("itemScope")(itemScope)
    if (itemType != null) __obj.updateDynamic("itemType")(itemType)
    if (keyParams != null) __obj.updateDynamic("keyParams")(keyParams)
    if (keyType != null) __obj.updateDynamic("keyType")(keyType)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (list != null) __obj.updateDynamic("list")(list)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (manifest != null) __obj.updateDynamic("manifest")(manifest)
    if (marginHeight != null) __obj.updateDynamic("marginHeight")(marginHeight.asInstanceOf[js.Any])
    if (marginWidth != null) __obj.updateDynamic("marginWidth")(marginWidth.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (media != null) __obj.updateDynamic("media")(media)
    if (mediaGroup != null) __obj.updateDynamic("mediaGroup")(mediaGroup)
    if (method != null) __obj.updateDynamic("method")(method)
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (onAbort != null) __obj.updateDynamic("onAbort")(onAbort)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(onCanPlay)
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(onCanPlayThrough)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onCompositionEnd != null) __obj.updateDynamic("onCompositionEnd")(onCompositionEnd)
    if (onCompositionStart != null) __obj.updateDynamic("onCompositionStart")(onCompositionStart)
    if (onCompositionUpdate != null) __obj.updateDynamic("onCompositionUpdate")(onCompositionUpdate)
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(onContextMenu)
    if (onCopy != null) __obj.updateDynamic("onCopy")(onCopy)
    if (onCut != null) __obj.updateDynamic("onCut")(onCut)
    if (onDoubleClick != null) __obj.updateDynamic("onDoubleClick")(onDoubleClick)
    if (onDrag != null) __obj.updateDynamic("onDrag")(onDrag)
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(onDragEnd)
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(onDragEnter)
    if (onDragExit != null) __obj.updateDynamic("onDragExit")(onDragExit)
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(onDragLeave)
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(onDragOver)
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(onDragStart)
    if (onDrop != null) __obj.updateDynamic("onDrop")(onDrop)
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(onDurationChange)
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(onEmptied)
    if (onEncrypted != null) __obj.updateDynamic("onEncrypted")(onEncrypted)
    if (onEnded != null) __obj.updateDynamic("onEnded")(onEnded)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onInput != null) __obj.updateDynamic("onInput")(onInput)
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(onKeyDown)
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(onKeyPress)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(onLoadStart)
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(onLoadedData)
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(onLoadedMetadata)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onPaste != null) __obj.updateDynamic("onPaste")(onPaste)
    if (onPause != null) __obj.updateDynamic("onPause")(onPause)
    if (onPlay != null) __obj.updateDynamic("onPlay")(onPlay)
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(onPlaying)
    if (onProgress != null) __obj.updateDynamic("onProgress")(onProgress)
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(onRateChange)
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(onSeeked)
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(onSeeking)
    if (onSelect != null) __obj.updateDynamic("onSelect")(onSelect)
    if (onStalled != null) __obj.updateDynamic("onStalled")(onStalled)
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(onSubmit)
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(onSuspend)
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(onTimeUpdate)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(onVolumeChange)
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(onWaiting)
    if (onWheel != null) __obj.updateDynamic("onWheel")(onWheel)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (optimum != null) __obj.updateDynamic("optimum")(optimum.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (poster != null) __obj.updateDynamic("poster")(poster)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (preload != null) __obj.updateDynamic("preload")(preload)
    if (property != null) __obj.updateDynamic("property")(property)
    if (radioGroup != null) __obj.updateDynamic("radioGroup")(radioGroup)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed)
    if (role != null) __obj.updateDynamic("role")(role)
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (!js.isUndefined(scoped)) __obj.updateDynamic("scoped")(scoped)
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling)
    if (!js.isUndefined(seamless)) __obj.updateDynamic("seamless")(seamless)
    if (security != null) __obj.updateDynamic("security")(security)
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (sizes != null) __obj.updateDynamic("sizes")(sizes)
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(spellCheck)) __obj.updateDynamic("spellCheck")(spellCheck)
    if (src != null) __obj.updateDynamic("src")(src)
    if (srcDoc != null) __obj.updateDynamic("srcDoc")(srcDoc)
    if (srcLang != null) __obj.updateDynamic("srcLang")(srcLang)
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (typeof != null) __obj.updateDynamic("typeof")(typeof)
    if (!js.isUndefined(unselectable)) __obj.updateDynamic("unselectable")(unselectable)
    if (useMap != null) __obj.updateDynamic("useMap")(useMap)
    if (vocab != null) __obj.updateDynamic("vocab")(vocab)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wmode != null) __obj.updateDynamic("wmode")(wmode)
    if (wrap != null) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[TabBarProps]
  }
}

