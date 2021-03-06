package typings
package ractiveLib.RactiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultsOptions extends ExtendOptions {
  /**
    * @deprecated since 0.7.1
    */
  // Default false
  var debug: js.UndefOr[scala.Boolean] = js.undefined
}

object DefaultsOptions {
  @scala.inline
  def apply(
    adapt: js.Array[java.lang.String | AdaptorPlugin] = null,
    adaptors: AdaptorPlugins = null,
    append: scala.Boolean | js.Any = null,
    beforeInit: /* options */ ExtendOptions => scala.Unit = null,
    complete: js.Function = null,
    components: ComponentPlugins = null,
    computed: js.Object = null,
    css: java.lang.String = null,
    data: js.Object | js.Function = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    decorators: DecoratorPlugins = null,
    delimiters: js.Array[java.lang.String] = null,
    easing: java.lang.String | js.Function = null,
    el: java.lang.String | stdLib.HTMLElement | js.Any = null,
    events: EventPlugins = null,
    init: /* options */ ExtendOptions => scala.Unit = null,
    interpolators: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    isolated: js.UndefOr[scala.Boolean] = js.undefined,
    `lazy`: js.UndefOr[scala.Boolean] = js.undefined,
    magic: js.UndefOr[scala.Boolean] = js.undefined,
    modifyArrays: js.UndefOr[scala.Boolean] = js.undefined,
    noCSSTransform: js.UndefOr[scala.Boolean] = js.undefined,
    noIntro: js.UndefOr[scala.Boolean] = js.undefined,
    onchange: /* options */ NewOptions => scala.Unit = null,
    oncomplete: () => scala.Unit = null,
    onconfig: () => scala.Unit = null,
    onconstruct: /* options */ NewOptions => scala.Unit = null,
    ondetach: () => scala.Unit = null,
    oninit: () => scala.Unit = null,
    oninsert: () => scala.Unit = null,
    onrender: () => scala.Unit = null,
    onteardown: () => scala.Unit = null,
    onunrender: () => scala.Unit = null,
    onupdate: () => scala.Unit = null,
    partials: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    preserveWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    sanitize: scala.Boolean | SanitizeOptions = null,
    staticDelimiters: js.Array[java.lang.String] = null,
    staticTripleDelimiters: js.Array[java.lang.String] = null,
    stripComments: js.UndefOr[scala.Boolean] = js.undefined,
    template: js.Any = null,
    transitions: TransitionPlugins = null,
    transitionsEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    tripleDelimiters: js.Array[java.lang.String] = null,
    twoway: js.UndefOr[scala.Boolean] = js.undefined
  ): DefaultsOptions = {
    val __obj = js.Dynamic.literal()
    if (adapt != null) __obj.updateDynamic("adapt")(adapt)
    if (adaptors != null) __obj.updateDynamic("adaptors")(adaptors)
    if (append != null) __obj.updateDynamic("append")(append.asInstanceOf[js.Any])
    if (beforeInit != null) __obj.updateDynamic("beforeInit")(js.Any.fromFunction1(beforeInit))
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (components != null) __obj.updateDynamic("components")(components)
    if (computed != null) __obj.updateDynamic("computed")(computed)
    if (css != null) __obj.updateDynamic("css")(css)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (delimiters != null) __obj.updateDynamic("delimiters")(delimiters)
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events)
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction1(init))
    if (interpolators != null) __obj.updateDynamic("interpolators")(interpolators)
    if (!js.isUndefined(isolated)) __obj.updateDynamic("isolated")(isolated)
    if (!js.isUndefined(`lazy`)) __obj.updateDynamic("lazy")(`lazy`)
    if (!js.isUndefined(magic)) __obj.updateDynamic("magic")(magic)
    if (!js.isUndefined(modifyArrays)) __obj.updateDynamic("modifyArrays")(modifyArrays)
    if (!js.isUndefined(noCSSTransform)) __obj.updateDynamic("noCSSTransform")(noCSSTransform)
    if (!js.isUndefined(noIntro)) __obj.updateDynamic("noIntro")(noIntro)
    if (onchange != null) __obj.updateDynamic("onchange")(js.Any.fromFunction1(onchange))
    if (oncomplete != null) __obj.updateDynamic("oncomplete")(js.Any.fromFunction0(oncomplete))
    if (onconfig != null) __obj.updateDynamic("onconfig")(js.Any.fromFunction0(onconfig))
    if (onconstruct != null) __obj.updateDynamic("onconstruct")(js.Any.fromFunction1(onconstruct))
    if (ondetach != null) __obj.updateDynamic("ondetach")(js.Any.fromFunction0(ondetach))
    if (oninit != null) __obj.updateDynamic("oninit")(js.Any.fromFunction0(oninit))
    if (oninsert != null) __obj.updateDynamic("oninsert")(js.Any.fromFunction0(oninsert))
    if (onrender != null) __obj.updateDynamic("onrender")(js.Any.fromFunction0(onrender))
    if (onteardown != null) __obj.updateDynamic("onteardown")(js.Any.fromFunction0(onteardown))
    if (onunrender != null) __obj.updateDynamic("onunrender")(js.Any.fromFunction0(onunrender))
    if (onupdate != null) __obj.updateDynamic("onupdate")(js.Any.fromFunction0(onupdate))
    if (partials != null) __obj.updateDynamic("partials")(partials)
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace)
    if (sanitize != null) __obj.updateDynamic("sanitize")(sanitize.asInstanceOf[js.Any])
    if (staticDelimiters != null) __obj.updateDynamic("staticDelimiters")(staticDelimiters)
    if (staticTripleDelimiters != null) __obj.updateDynamic("staticTripleDelimiters")(staticTripleDelimiters)
    if (!js.isUndefined(stripComments)) __obj.updateDynamic("stripComments")(stripComments)
    if (template != null) __obj.updateDynamic("template")(template)
    if (transitions != null) __obj.updateDynamic("transitions")(transitions)
    if (!js.isUndefined(transitionsEnabled)) __obj.updateDynamic("transitionsEnabled")(transitionsEnabled)
    if (tripleDelimiters != null) __obj.updateDynamic("tripleDelimiters")(tripleDelimiters)
    if (!js.isUndefined(twoway)) __obj.updateDynamic("twoway")(twoway)
    __obj.asInstanceOf[DefaultsOptions]
  }
}

