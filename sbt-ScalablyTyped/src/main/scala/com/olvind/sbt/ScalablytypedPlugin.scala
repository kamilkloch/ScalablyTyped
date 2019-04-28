
package org.scalablytyped.sbt

import sbt._
import sbt.Keys._

object ScalablyTypedPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def requires = sbt.plugins.JvmPlugin

  object autoImport {
    object ScalablyTyped {
      object A {
        val angular__common = "org.scalablytyped" % "angular__common_sjs0.6_2.12" % "7.2.14-4073b4"
        val angular__compiler = "org.scalablytyped" % "angular__compiler_sjs0.6_2.12" % "7.2.14-137d66"
        val angular__core = "org.scalablytyped" % "angular__core_sjs0.6_2.12" % "7.2.14-bdc9d4"
        val angular__forms = "org.scalablytyped" % "angular__forms_sjs0.6_2.12" % "7.2.14-bf2dc5"
        val `angular__platform-browser` = "org.scalablytyped" % "angular__platform-browser_sjs0.6_2.12" % "7.2.14-03b1ba"
        val `angular__platform-browser-dynamic` = "org.scalablytyped" % "angular__platform-browser-dynamic_sjs0.6_2.12" % "7.2.14-7b7907"
        val angular__router = "org.scalablytyped" % "angular__router_sjs0.6_2.12" % "7.2.14-353b74"
        val axios = "org.scalablytyped" % "axios_sjs0.6_2.12" % "0.18.0-25f628"
      }
      object B {
        val `body-parser` = "org.scalablytyped" % "body-parser_sjs0.6_2.12" % "1.17-dt-20180425Z-f1929d"
      }
      object C {
        val chart_dot_js = "org.scalablytyped" % "chart_dot_js_sjs0.6_2.12" % "2.7-dt-20190423Z-2c258d"
        val classnames = "org.scalablytyped" % "classnames_sjs0.6_2.12" % "2.2-dt-20190326Z-881384"
        val connect = "org.scalablytyped" % "connect_sjs0.6_2.12" % "v3.4.0-dt-20190322Z-e08638"
        val `core-js` = "org.scalablytyped" % "core-js_sjs0.6_2.12" % "2.5-dt-20180921Z-c3b8c6"
        val csstype = "org.scalablytyped" % "csstype_sjs0.6_2.12" % "2.6.3-61d3d0"
      }
      object D {
        val d3 = "org.scalablytyped" % "d3_sjs0.6_2.12" % "5.7-dt-20190212Z-809230"
        val `d3-array` = "org.scalablytyped" % "d3-array_sjs0.6_2.12" % "2.0-dt-20190221Z-c92ab3"
        val `d3-axis` = "org.scalablytyped" % "d3-axis_sjs0.6_2.12" % "1.0-dt-20190212Z-65de0d"
        val `d3-brush` = "org.scalablytyped" % "d3-brush_sjs0.6_2.12" % "1.0-dt-20190212Z-fe436a"
        val `d3-chord` = "org.scalablytyped" % "d3-chord_sjs0.6_2.12" % "1.0-dt-20190212Z-699394"
        val `d3-collection` = "org.scalablytyped" % "d3-collection_sjs0.6_2.12" % "1.0-dt-20190212Z-d4ed0a"
        val `d3-color` = "org.scalablytyped" % "d3-color_sjs0.6_2.12" % "1.2-dt-20190212Z-0e60cb"
        val `d3-contour` = "org.scalablytyped" % "d3-contour_sjs0.6_2.12" % "1.3-dt-20190205Z-1e443b"
        val `d3-dispatch` = "org.scalablytyped" % "d3-dispatch_sjs0.6_2.12" % "1.0-dt-20190212Z-d34671"
        val `d3-drag` = "org.scalablytyped" % "d3-drag_sjs0.6_2.12" % "1.2-dt-20190212Z-9acf46"
        val `d3-dsv` = "org.scalablytyped" % "d3-dsv_sjs0.6_2.12" % "1.0-dt-20190326Z-6958fe"
        val `d3-ease` = "org.scalablytyped" % "d3-ease_sjs0.6_2.12" % "1.0-dt-20190212Z-c9b6cd"
        val `d3-fetch` = "org.scalablytyped" % "d3-fetch_sjs0.6_2.12" % "1.1-dt-20181228Z-aaa795"
        val `d3-force` = "org.scalablytyped" % "d3-force_sjs0.6_2.12" % "1.2-dt-20190212Z-e4de32"
        val `d3-format` = "org.scalablytyped" % "d3-format_sjs0.6_2.12" % "1.3-dt-20190212Z-ec2ede"
        val `d3-geo` = "org.scalablytyped" % "d3-geo_sjs0.6_2.12" % "1.11-dt-20190212Z-1091ee"
        val `d3-hierarchy` = "org.scalablytyped" % "d3-hierarchy_sjs0.6_2.12" % "1.1-dt-20190212Z-e29191"
        val `d3-interpolate` = "org.scalablytyped" % "d3-interpolate_sjs0.6_2.12" % "1.3-dt-20190212Z-fb5dff"
        val `d3-path` = "org.scalablytyped" % "d3-path_sjs0.6_2.12" % "1.0-dt-20190212Z-da6196"
        val `d3-polygon` = "org.scalablytyped" % "d3-polygon_sjs0.6_2.12" % "1.0-dt-20190212Z-52e8ce"
        val `d3-quadtree` = "org.scalablytyped" % "d3-quadtree_sjs0.6_2.12" % "1.0-dt-20190212Z-80039b"
        val `d3-random` = "org.scalablytyped" % "d3-random_sjs0.6_2.12" % "1.1-dt-20190212Z-b5fdd6"
        val `d3-scale` = "org.scalablytyped" % "d3-scale_sjs0.6_2.12" % "2.1-dt-20190212Z-11bd50"
        val `d3-scale-chromatic` = "org.scalablytyped" % "d3-scale-chromatic_sjs0.6_2.12" % "1.3-dt-20190212Z-9783b0"
        val `d3-selection` = "org.scalablytyped" % "d3-selection_sjs0.6_2.12" % "1.4-dt-20190212Z-037d61"
        val `d3-shape` = "org.scalablytyped" % "d3-shape_sjs0.6_2.12" % "1.3-dt-20190212Z-7fa156"
        val `d3-time` = "org.scalablytyped" % "d3-time_sjs0.6_2.12" % "1.0-dt-20190212Z-4fd853"
        val `d3-time-format` = "org.scalablytyped" % "d3-time-format_sjs0.6_2.12" % "2.1-dt-20190212Z-80a352"
        val `d3-timer` = "org.scalablytyped" % "d3-timer_sjs0.6_2.12" % "1.0-dt-20190212Z-b7698f"
        val `d3-transition` = "org.scalablytyped" % "d3-transition_sjs0.6_2.12" % "1.1-dt-20190212Z-0cc4da"
        val `d3-voronoi` = "org.scalablytyped" % "d3-voronoi_sjs0.6_2.12" % "1.1-dt-20190212Z-2b9b0b"
        val `d3-zoom` = "org.scalablytyped" % "d3-zoom_sjs0.6_2.12" % "1.7-dt-20190212Z-60afad"
      }
      object E {
        val electron = "org.scalablytyped" % "electron_sjs0.6_2.12" % "4.1.5-f78f5b"
        val exenv = "org.scalablytyped" % "exenv_sjs0.6_2.12" % "1.2-dt-20180321Z-00e83f"
        val express = "org.scalablytyped" % "express_sjs0.6_2.12" % "4.16-dt-20190122Z-5204ce"
        val `express-serve-static-core` = "org.scalablytyped" % "express-serve-static-core_sjs0.6_2.12" % "4.16-dt-20190423Z-31fe94"
        val `extract-zip` = "org.scalablytyped" % "extract-zip_sjs0.6_2.12" % "1.6-dt-20180214Z-c8b33a"
      }
      object G {
        val gatsby = "org.scalablytyped" % "gatsby_sjs0.6_2.12" % "2.3.30-a8d5ca"
        val `gatsby-link` = "org.scalablytyped" % "gatsby-link_sjs0.6_2.12" % "2.0.16-75576f"
        val geojson = "org.scalablytyped" % "geojson_sjs0.6_2.12" % "7946.0-dt-20190319Z-72e3ef"
        val googlemaps = "org.scalablytyped" % "googlemaps_sjs0.6_2.12" % "3.30-dt-20190322Z-2026d4"
      }
      object H {
        val highlight_dot_js = "org.scalablytyped" % "highlight_dot_js_sjs0.6_2.12" % "v9.12-dt-20190322Z-aa5de4"
        val history = "org.scalablytyped" % "history_sjs0.6_2.12" % "4.7.2-dt-20190322Z-f279a5"
        val `hoist-non-react-statics` = "org.scalablytyped" % "hoist-non-react-statics_sjs0.6_2.12" % "3.3-dt-20190402Z-446320"
      }
      object I {
        val `indefinite-observable` = "org.scalablytyped" % "indefinite-observable_sjs0.6_2.12" % "2.0.1-564613"
        val `is-buffer` = "org.scalablytyped" % "is-buffer_sjs0.6_2.12" % "2.0-dt-20181210Z-30b385"
      }
      object J {
        val jquery = "org.scalablytyped" % "jquery_sjs0.6_2.12" % "3.3-dt-20190108Z-45cee7"
        val jqueryui = "org.scalablytyped" % "jqueryui_sjs0.6_2.12" % "1.12-dt-20190322Z-0be61f"
        val jss = "org.scalablytyped" % "jss_sjs0.6_2.12" % "9.5-dt-20190227Z-d393bc"
      }
      object L {
        val leaflet = "org.scalablytyped" % "leaflet_sjs0.6_2.12" % "1.4-dt-20190417Z-efad78"
        val lodash = "org.scalablytyped" % "lodash_sjs0.6_2.12" % "4.14-dt-20190402Z-ea402e"
      }
      object M {
        val `material-ui` = "org.scalablytyped" % "material-ui_sjs0.6_2.12" % "0.21-dt-20190225Z-d6daa6"
        val `material-ui__core` = "org.scalablytyped" % "material-ui__core_sjs0.6_2.12" % "3.9.3-40eb28"
        val mime = "org.scalablytyped" % "mime_sjs0.6_2.12" % "2.0-dt-20190205Z-b7b3da"
        val mobx = "org.scalablytyped" % "mobx_sjs0.6_2.12" % "5.9.4-09075d"
        val `mobx-react` = "org.scalablytyped" % "mobx-react_sjs0.6_2.12" % "5.4.3-599c57"
        val moment = "org.scalablytyped" % "moment_sjs0.6_2.12" % "2.24.0-06383d"
      }
      object N {
        val node = "org.scalablytyped" % "node_sjs0.6_2.12" % "11.13-dt-20190422Z-40afee"
      }
      object P {
        val p5 = "org.scalablytyped" % "p5_sjs0.6_2.12" % "0.7-dt-20190124Z-2e2868"
        val popper_dot_js = "org.scalablytyped" % "popper_dot_js_sjs0.6_2.12" % "1.15.0-c232b0"
        val `prop-types` = "org.scalablytyped" % "prop-types_sjs0.6_2.12" % "15.7-dt-20190417Z-7e744c"
      }
      object R {
        val `range-parser` = "org.scalablytyped" % "range-parser_sjs0.6_2.12" % "1.2-dt-20181016Z-c3b9c7"
        val reach__router = "org.scalablytyped" % "reach__router_sjs0.6_2.12" % "1.2-dt-20190404Z-c7deca"
        val react = "org.scalablytyped" % "react_sjs0.6_2.12" % "16.8-dt-20190419Z-caf3c8"
        val `react-addons-linked-state-mixin` = "org.scalablytyped" % "react-addons-linked-state-mixin_sjs0.6_2.12" % "0.14-dt-20190322Z-52f607"
        val `react-big-calendar` = "org.scalablytyped" % "react-big-calendar_sjs0.6_2.12" % "0.20-dt-20190423Z-6cda1d"
        val `react-dom` = "org.scalablytyped" % "react-dom_sjs0.6_2.12" % "16.8-dt-20190411Z-4cdecd"
        val `react-facade` = "org.scalablytyped" % "react-facade_sjs0.6_2.12" % "201904211043-b1ed31"
        val `react-is` = "org.scalablytyped" % "react-is_sjs0.6_2.12" % "16.7-dt-20190212Z-6ca70f"
        val `react-japgolly-facade` = "org.scalablytyped" % "react-japgolly-facade_sjs0.6_2.12" % "201904211043-f68a71"
        val `react-lifecycles-compat` = "org.scalablytyped" % "react-lifecycles-compat_sjs0.6_2.12" % "3.0-dt-20190116Z-1ee0b4"
        val `react-native` = "org.scalablytyped" % "react-native_sjs0.6_2.12" % "0.57-dt-20190424Z-aebd76"
        val `react-native-vector-icons` = "org.scalablytyped" % "react-native-vector-icons_sjs0.6_2.12" % "6.4-dt-20190401Z-2c007b"
        val `react-navigation` = "org.scalablytyped" % "react-navigation_sjs0.6_2.12" % "3.0-dt-20190328Z-7f2a82"
        val `react-redux` = "org.scalablytyped" % "react-redux_sjs0.6_2.12" % "7.0-dt-20190419Z-a840ac"
        val `react-redux-facade` = "org.scalablytyped" % "react-redux-facade_sjs0.6_2.12" % "201904211043-42f606"
        val `react-slick` = "org.scalablytyped" % "react-slick_sjs0.6_2.12" % "0.23-dt-20190126Z-765d97"
        val `react-transition-group` = "org.scalablytyped" % "react-transition-group_sjs0.6_2.12" % "2.9-dt-20190409Z-4f12fd"
        val redux = "org.scalablytyped" % "redux_sjs0.6_2.12" % "4.0.1-99337b"
        val `redux-devtools-extension` = "org.scalablytyped" % "redux-devtools-extension_sjs0.6_2.12" % "2.13.8-e1789c"
        val reveal = "org.scalablytyped" % "reveal_sjs0.6_2.12" % "3.3.0-dt-20190322Z-069b59"
        val rxjs = "org.scalablytyped" % "rxjs_sjs0.6_2.12" % "6.5.1-830250"
      }
      object S {
        val `semantic-ui-react` = "org.scalablytyped" % "semantic-ui-react_sjs0.6_2.12" % "0.86.0-d9debe"
        val `semantic-ui-react__event-stack` = "org.scalablytyped" % "semantic-ui-react__event-stack_sjs0.6_2.12" % "3.1.0-f92b74"
        val `serve-static` = "org.scalablytyped" % "serve-static_sjs0.6_2.12" % "1.13-dt-20190322Z-6713a7"
        val shallowequal = "org.scalablytyped" % "shallowequal_sjs0.6_2.12" % "1.1-dt-20190202Z-0e691d"
        val sizzle = "org.scalablytyped" % "sizzle_sjs0.6_2.12" % "2.3-dt-20181006Z-dae54d"
        val std = "org.scalablytyped" % "std_sjs0.6_2.12" % "3.4-6f75bc"
        val `std-facade` = "org.scalablytyped" % "std-facade_sjs0.6_2.12" % "201904211043-c45ed2"
        val storybook__react = "org.scalablytyped" % "storybook__react_sjs0.6_2.12" % "4.0-dt-20190213Z-f4bcd0"
        val `styled-components` = "org.scalablytyped" % "styled-components_sjs0.6_2.12" % "4.1-dt-20190408Z-b39421"
        val `symbol-observable` = "org.scalablytyped" % "symbol-observable_sjs0.6_2.12" % "1.2.0-5f3b6c"
      }
      object T {
        val three = "org.scalablytyped" % "three_sjs0.6_2.12" % "0.103.0-1079d6"
        val tslib = "org.scalablytyped" % "tslib_sjs0.6_2.12" % "1.9.3-1dff2d"
        val typescript = "org.scalablytyped" % "typescript_sjs0.6_2.12" % "3.4.5-71888e"
      }
      object V {
        val vue = "org.scalablytyped" % "vue_sjs0.6_2.12" % "2.6.10-781fcb"
      }
      object W {
        val `webpack-env` = "org.scalablytyped" % "webpack-env_sjs0.6_2.12" % "1.13-dt-20190322Z-6329b0"
      }
      object Z {
        val zone_dot_js = "org.scalablytyped" % "zone_dot_js_sjs0.6_2.12" % "0.9.0-ecd924"
      }
    }
  }
}