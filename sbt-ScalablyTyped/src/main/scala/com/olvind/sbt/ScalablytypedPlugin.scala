
package org.scalablytyped.sbt

import sbt._
import sbt.Keys._

object ScalablyTypedPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def requires = sbt.plugins.JvmPlugin

  object autoImport {
    object ScalablyTyped {
      object A {
        val angular__common = "org.scalablytyped" % "angular__common_sjs0.6_2.12" % "7.2.14-b7b1e8"
        val angular__compiler = "org.scalablytyped" % "angular__compiler_sjs0.6_2.12" % "7.2.14-05a2da"
        val angular__core = "org.scalablytyped" % "angular__core_sjs0.6_2.12" % "7.2.14-289592"
        val angular__forms = "org.scalablytyped" % "angular__forms_sjs0.6_2.12" % "7.2.14-dd2cc6"
        val `angular__platform-browser` = "org.scalablytyped" % "angular__platform-browser_sjs0.6_2.12" % "7.2.14-7196ef"
        val `angular__platform-browser-dynamic` = "org.scalablytyped" % "angular__platform-browser-dynamic_sjs0.6_2.12" % "7.2.14-78ba51"
        val angular__router = "org.scalablytyped" % "angular__router_sjs0.6_2.12" % "7.2.14-12fc72"
        val axios = "org.scalablytyped" % "axios_sjs0.6_2.12" % "0.18.0-8d616f"
      }
      object B {
        val `body-parser` = "org.scalablytyped" % "body-parser_sjs0.6_2.12" % "1.17-dt-20180425Z-32e57d"
      }
      object C {
        val chart_dot_js = "org.scalablytyped" % "chart_dot_js_sjs0.6_2.12" % "2.7-dt-20190423Z-a3860e"
        val classnames = "org.scalablytyped" % "classnames_sjs0.6_2.12" % "2.2-dt-20190326Z-903cb4"
        val connect = "org.scalablytyped" % "connect_sjs0.6_2.12" % "v3.4.0-dt-20190322Z-565405"
        val `core-js` = "org.scalablytyped" % "core-js_sjs0.6_2.12" % "2.5-dt-20180921Z-ba4e8a"
        val csstype = "org.scalablytyped" % "csstype_sjs0.6_2.12" % "2.6.3-6a3c49"
      }
      object D {
        val d3 = "org.scalablytyped" % "d3_sjs0.6_2.12" % "5.7-dt-20190212Z-7891c7"
        val `d3-array` = "org.scalablytyped" % "d3-array_sjs0.6_2.12" % "2.0-dt-20190221Z-8136a9"
        val `d3-axis` = "org.scalablytyped" % "d3-axis_sjs0.6_2.12" % "1.0-dt-20190212Z-58cadd"
        val `d3-brush` = "org.scalablytyped" % "d3-brush_sjs0.6_2.12" % "1.0-dt-20190212Z-166597"
        val `d3-chord` = "org.scalablytyped" % "d3-chord_sjs0.6_2.12" % "1.0-dt-20190212Z-a290f8"
        val `d3-collection` = "org.scalablytyped" % "d3-collection_sjs0.6_2.12" % "1.0-dt-20190212Z-5e1a96"
        val `d3-color` = "org.scalablytyped" % "d3-color_sjs0.6_2.12" % "1.2-dt-20190212Z-1042c5"
        val `d3-contour` = "org.scalablytyped" % "d3-contour_sjs0.6_2.12" % "1.3-dt-20190205Z-758c60"
        val `d3-dispatch` = "org.scalablytyped" % "d3-dispatch_sjs0.6_2.12" % "1.0-dt-20190212Z-002f7a"
        val `d3-drag` = "org.scalablytyped" % "d3-drag_sjs0.6_2.12" % "1.2-dt-20190212Z-c04af0"
        val `d3-dsv` = "org.scalablytyped" % "d3-dsv_sjs0.6_2.12" % "1.0-dt-20190326Z-5d380f"
        val `d3-ease` = "org.scalablytyped" % "d3-ease_sjs0.6_2.12" % "1.0-dt-20190212Z-c9b6cd"
        val `d3-fetch` = "org.scalablytyped" % "d3-fetch_sjs0.6_2.12" % "1.1-dt-20181228Z-f1f574"
        val `d3-force` = "org.scalablytyped" % "d3-force_sjs0.6_2.12" % "1.2-dt-20190212Z-803952"
        val `d3-format` = "org.scalablytyped" % "d3-format_sjs0.6_2.12" % "1.3-dt-20190212Z-e80b9f"
        val `d3-geo` = "org.scalablytyped" % "d3-geo_sjs0.6_2.12" % "1.11-dt-20190212Z-f319d6"
        val `d3-hierarchy` = "org.scalablytyped" % "d3-hierarchy_sjs0.6_2.12" % "1.1-dt-20190212Z-7865e6"
        val `d3-interpolate` = "org.scalablytyped" % "d3-interpolate_sjs0.6_2.12" % "1.3-dt-20190212Z-0eff76"
        val `d3-path` = "org.scalablytyped" % "d3-path_sjs0.6_2.12" % "1.0-dt-20190212Z-da6196"
        val `d3-polygon` = "org.scalablytyped" % "d3-polygon_sjs0.6_2.12" % "1.0-dt-20190212Z-43c122"
        val `d3-quadtree` = "org.scalablytyped" % "d3-quadtree_sjs0.6_2.12" % "1.0-dt-20190212Z-06605a"
        val `d3-random` = "org.scalablytyped" % "d3-random_sjs0.6_2.12" % "1.1-dt-20190212Z-b5fdd6"
        val `d3-scale` = "org.scalablytyped" % "d3-scale_sjs0.6_2.12" % "2.1-dt-20190212Z-293a1d"
        val `d3-scale-chromatic` = "org.scalablytyped" % "d3-scale-chromatic_sjs0.6_2.12" % "1.3-dt-20190212Z-5818ab"
        val `d3-selection` = "org.scalablytyped" % "d3-selection_sjs0.6_2.12" % "1.4-dt-20190212Z-2d560d"
        val `d3-shape` = "org.scalablytyped" % "d3-shape_sjs0.6_2.12" % "1.3-dt-20190212Z-4c5acf"
        val `d3-time` = "org.scalablytyped" % "d3-time_sjs0.6_2.12" % "1.0-dt-20190212Z-e9be3d"
        val `d3-time-format` = "org.scalablytyped" % "d3-time-format_sjs0.6_2.12" % "2.1-dt-20190212Z-5c871a"
        val `d3-timer` = "org.scalablytyped" % "d3-timer_sjs0.6_2.12" % "1.0-dt-20190212Z-b7698f"
        val `d3-transition` = "org.scalablytyped" % "d3-transition_sjs0.6_2.12" % "1.1-dt-20190212Z-332ea4"
        val `d3-voronoi` = "org.scalablytyped" % "d3-voronoi_sjs0.6_2.12" % "1.1-dt-20190212Z-719a87"
        val `d3-zoom` = "org.scalablytyped" % "d3-zoom_sjs0.6_2.12" % "1.7-dt-20190212Z-e84473"
      }
      object E {
        val electron = "org.scalablytyped" % "electron_sjs0.6_2.12" % "4.1.5-e3098c"
        val exenv = "org.scalablytyped" % "exenv_sjs0.6_2.12" % "1.2-dt-20180321Z-00e83f"
        val express = "org.scalablytyped" % "express_sjs0.6_2.12" % "4.16-dt-20190122Z-c9c559"
        val `express-serve-static-core` = "org.scalablytyped" % "express-serve-static-core_sjs0.6_2.12" % "4.16-dt-20190423Z-de8f34"
        val `extract-zip` = "org.scalablytyped" % "extract-zip_sjs0.6_2.12" % "1.6-dt-20180214Z-591b96"
      }
      object G {
        val gatsby = "org.scalablytyped" % "gatsby_sjs0.6_2.12" % "2.3.30-3eea18"
        val `gatsby-link` = "org.scalablytyped" % "gatsby-link_sjs0.6_2.12" % "2.0.16-6b6547"
        val geojson = "org.scalablytyped" % "geojson_sjs0.6_2.12" % "7946.0-dt-20190319Z-3471f3"
        val googlemaps = "org.scalablytyped" % "googlemaps_sjs0.6_2.12" % "3.30-dt-20190322Z-5e5f92"
      }
      object H {
        val highlight_dot_js = "org.scalablytyped" % "highlight_dot_js_sjs0.6_2.12" % "v9.12-dt-20190322Z-ce2523"
        val history = "org.scalablytyped" % "history_sjs0.6_2.12" % "4.7.2-dt-20190322Z-5266c4"
        val `hoist-non-react-statics` = "org.scalablytyped" % "hoist-non-react-statics_sjs0.6_2.12" % "3.3-dt-20190402Z-5ba316"
      }
      object I {
        val `indefinite-observable` = "org.scalablytyped" % "indefinite-observable_sjs0.6_2.12" % "2.0.1-564613"
        val `is-buffer` = "org.scalablytyped" % "is-buffer_sjs0.6_2.12" % "2.0-dt-20181210Z-014c08"
      }
      object J {
        val jquery = "org.scalablytyped" % "jquery_sjs0.6_2.12" % "3.3-dt-20190108Z-42fc15"
        val jqueryui = "org.scalablytyped" % "jqueryui_sjs0.6_2.12" % "1.12-dt-20190322Z-cf794d"
        val jss = "org.scalablytyped" % "jss_sjs0.6_2.12" % "9.5-dt-20190227Z-9aa05a"
      }
      object L {
        val leaflet = "org.scalablytyped" % "leaflet_sjs0.6_2.12" % "1.4-dt-20190417Z-3d5488"
        val lodash = "org.scalablytyped" % "lodash_sjs0.6_2.12" % "4.14-dt-20190402Z-3d1413"
      }
      object M {
        val `material-ui` = "org.scalablytyped" % "material-ui_sjs0.6_2.12" % "0.21-dt-20190225Z-9d0062"
        val `material-ui__core` = "org.scalablytyped" % "material-ui__core_sjs0.6_2.12" % "3.9.3-bb728a"
        val mime = "org.scalablytyped" % "mime_sjs0.6_2.12" % "2.0-dt-20190205Z-84f722"
        val mobx = "org.scalablytyped" % "mobx_sjs0.6_2.12" % "5.9.4-03f692"
        val `mobx-react` = "org.scalablytyped" % "mobx-react_sjs0.6_2.12" % "5.4.3-cf0270"
        val moment = "org.scalablytyped" % "moment_sjs0.6_2.12" % "2.24.0-34c3f2"
      }
      object N {
        val node = "org.scalablytyped" % "node_sjs0.6_2.12" % "11.13-dt-20190422Z-80e7e1"
      }
      object P {
        val p5 = "org.scalablytyped" % "p5_sjs0.6_2.12" % "0.7-dt-20190124Z-ab3e47"
        val popper_dot_js = "org.scalablytyped" % "popper_dot_js_sjs0.6_2.12" % "1.15.0-cd973b"
        val `prop-types` = "org.scalablytyped" % "prop-types_sjs0.6_2.12" % "15.7-dt-20190417Z-39ba6e"
      }
      object R {
        val `range-parser` = "org.scalablytyped" % "range-parser_sjs0.6_2.12" % "1.2-dt-20181016Z-b4ef5a"
        val reach__router = "org.scalablytyped" % "reach__router_sjs0.6_2.12" % "1.2-dt-20190404Z-6f9c96"
        val react = "org.scalablytyped" % "react_sjs0.6_2.12" % "16.8-dt-20190419Z-289e02"
        val `react-addons-linked-state-mixin` = "org.scalablytyped" % "react-addons-linked-state-mixin_sjs0.6_2.12" % "0.14-dt-20190322Z-7e01ae"
        val `react-big-calendar` = "org.scalablytyped" % "react-big-calendar_sjs0.6_2.12" % "0.20-dt-20190423Z-c15827"
        val `react-dom` = "org.scalablytyped" % "react-dom_sjs0.6_2.12" % "16.8-dt-20190411Z-7909ba"
        val `react-facade` = "org.scalablytyped" % "react-facade_sjs0.6_2.12" % "201904211043-c6a0b9"
        val `react-is` = "org.scalablytyped" % "react-is_sjs0.6_2.12" % "16.7-dt-20190212Z-a7df9e"
        val `react-japgolly-facade` = "org.scalablytyped" % "react-japgolly-facade_sjs0.6_2.12" % "201904211043-9e8038"
        val `react-lifecycles-compat` = "org.scalablytyped" % "react-lifecycles-compat_sjs0.6_2.12" % "3.0-dt-20190116Z-a977aa"
        val `react-native` = "org.scalablytyped" % "react-native_sjs0.6_2.12" % "0.57-dt-20190424Z-255853"
        val `react-native-vector-icons` = "org.scalablytyped" % "react-native-vector-icons_sjs0.6_2.12" % "6.4-dt-20190401Z-614887"
        val `react-navigation` = "org.scalablytyped" % "react-navigation_sjs0.6_2.12" % "3.0-dt-20190328Z-b47851"
        val `react-redux` = "org.scalablytyped" % "react-redux_sjs0.6_2.12" % "7.0-dt-20190419Z-0c84ef"
        val `react-redux-facade` = "org.scalablytyped" % "react-redux-facade_sjs0.6_2.12" % "201904211043-c1d18b"
        val `react-slick` = "org.scalablytyped" % "react-slick_sjs0.6_2.12" % "0.23-dt-20190126Z-6016f7"
        val `react-transition-group` = "org.scalablytyped" % "react-transition-group_sjs0.6_2.12" % "2.9-dt-20190409Z-028a8d"
        val redux = "org.scalablytyped" % "redux_sjs0.6_2.12" % "4.0.1-0d7c9d"
        val `redux-devtools-extension` = "org.scalablytyped" % "redux-devtools-extension_sjs0.6_2.12" % "2.13.8-6b4bd9"
        val reveal = "org.scalablytyped" % "reveal_sjs0.6_2.12" % "3.3.0-dt-20190322Z-7f934c"
        val rxjs = "org.scalablytyped" % "rxjs_sjs0.6_2.12" % "6.5.1-4c687f"
      }
      object S {
        val `semantic-ui-react` = "org.scalablytyped" % "semantic-ui-react_sjs0.6_2.12" % "0.86.0-7755ad"
        val `semantic-ui-react__event-stack` = "org.scalablytyped" % "semantic-ui-react__event-stack_sjs0.6_2.12" % "3.1.0-80b8e4"
        val `serve-static` = "org.scalablytyped" % "serve-static_sjs0.6_2.12" % "1.13-dt-20190322Z-015958"
        val shallowequal = "org.scalablytyped" % "shallowequal_sjs0.6_2.12" % "1.1-dt-20190202Z-0e691d"
        val sizzle = "org.scalablytyped" % "sizzle_sjs0.6_2.12" % "2.3-dt-20181006Z-53379e"
        val std = "org.scalablytyped" % "std_sjs0.6_2.12" % "3.4-d6b295"
        val `std-facade` = "org.scalablytyped" % "std-facade_sjs0.6_2.12" % "201904211043-537db7"
        val storybook__react = "org.scalablytyped" % "storybook__react_sjs0.6_2.12" % "4.0-dt-20190213Z-df26a8"
        val `styled-components` = "org.scalablytyped" % "styled-components_sjs0.6_2.12" % "4.1-dt-20190408Z-4a911f"
        val `symbol-observable` = "org.scalablytyped" % "symbol-observable_sjs0.6_2.12" % "1.2.0-5f3b6c"
      }
      object T {
        val three = "org.scalablytyped" % "three_sjs0.6_2.12" % "0.103.0-edb723"
        val tslib = "org.scalablytyped" % "tslib_sjs0.6_2.12" % "1.9.3-fc3f0d"
        val typescript = "org.scalablytyped" % "typescript_sjs0.6_2.12" % "3.4.5-e840d7"
      }
      object V {
        val vue = "org.scalablytyped" % "vue_sjs0.6_2.12" % "2.6.10-dfd7b1"
      }
      object W {
        val `webpack-env` = "org.scalablytyped" % "webpack-env_sjs0.6_2.12" % "1.13-dt-20190322Z-91d218"
      }
      object Z {
        val zone_dot_js = "org.scalablytyped" % "zone_dot_js_sjs0.6_2.12" % "0.9.0-035967"
      }
    }
  }
}