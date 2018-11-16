package typings
package browserDashSyncLib.browserDashSyncMod.browserSyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
           * The browser(s) to open
           * Default: default
           */
  var browser: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
           * ¯\_(ツ)_/¯
           * Best guess, when ghostMode (or SocketIO?) is setup the events
           * listed here will be emitted and able to hook into.
           */
  var clientEvents: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Send file-change events to the browser
           * Default: true
           */
  var codeSync: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Add HTTP access control (CORS) headers to assets served by Browsersync.
           * Default: false
           * Note: Requires at least version 2.16.0.
           */
  var cors: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * ¯\_(ツ)_/¯
           */
  var excludeFileTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Browsersync can watch your files as you work. Changes you make will either be injected into the page (CSS
           * & images) or will cause all browsers to do a full-page refresh. See anymatch for more information on glob
           * patterns.
           * Default: false
           */
  var files: js.UndefOr[java.lang.String | (js.Array[java.lang.String | FileCallback | js.Object])] = js.undefined
  /**
           * Clicks, Scrolls & Form inputs on any device will be mirrored to all others.
           * clicks - Default: true
           * scroll - Default: true
           * forms - Default: true
           */
  var ghostMode: js.UndefOr[GhostOptions | scala.Boolean] = js.undefined
  /**
           * Override host detection if you know the correct IP to use
           */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Override http module to allow using 3rd party server modules (such as http2).
           */
  var httpModule: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Enable https for localhost development.
           * Note: This may not be needed for proxy option as it will try to infer from your target url.
           * Note: If privacy error is encountered please see HttpsOptions below, setting those will resolve.
           * Note: Requires at least version 1.3.0.
           */
  var https: js.UndefOr[scala.Boolean | HttpsOptions] = js.undefined
  /**
           * Patterns for any watchers to ignore.
           * Anything provided here will end up inside 'watchOptions.ignored'.
           */
  var ignore: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Whether to inject changes (rather than a page refresh)
           * Default: true
           */
  var injectChanges: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * ¯\_(ツ)_/¯
           */
  var injectFileTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Support environments where dynamic hostnames are not required (ie: electron).
           */
  var localOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether or not to log connections
           * Default: false
           */
  var logConnections: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether or not to log information about changed files
           * Default: false
           */
  var logFileChanges: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Can be either "info", "debug", "warn", or "silent"
           * Default: info
           */
  var logLevel: js.UndefOr[LogLevel] = js.undefined
  /**
           * Change the console logging prefix. Useful if you're creating your own project based on Browsersync
           * Default: BS
           * Note: Requires at least version 1.5.1.
           */
  var logPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Log the snippet to the console when you're in snippet mode (no proxy/server)
           * Default: true
           * Note: Requires at least version 1.5.2.
           */
  var logSnippet: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Functions or actual plugins used as middleware.
           */
  var middleware: js.UndefOr[
    MiddlewareHandler | PerRouteMiddleware | (js.Array[MiddlewareHandler | PerRouteMiddleware])
  ] = js.undefined
  /**
           * Whether to minify the client script
           * Default: true
           */
  var minify: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The small pop-over notifications in the browser are not always needed/wanted.
           * Default: true
           */
  @JSName("notify")
  var notify_FOptions: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Some features of Browsersync (such as xip & tunnel) require an internet connection, but if you're
           * working offline, you can reduce start-up time by setting this option to false
           */
  var online: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Default: true
           * Decide which URL to open automatically when Browsersync starts. Defaults to "local" if none set.
           * Can be true, local, external, ui, ui-external, tunnel or false
           */
  var open: js.UndefOr[OpenOptions | scala.Boolean] = js.undefined
  /**
           * User provided plugins
           * Default: []
           * Note: Requires at least version 2.6.0.
           */
  var plugins: js.UndefOr[js.Array[_]] = js.undefined
  /**
           * Use a specific port (instead of the one auto-detected by Browsersync)
           * Default: 3000
           */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
           * Proxy an EXISTING vhost. Browsersync will wrap your vhost with a proxy URL to view your site.
           * Passing only a URL as a string equates to passing only target property of ProxyOptions type.
           * target - Default: undefined
           * ws - Default: undefined
           * middleware - Default: undefined
           * reqHeaders - Default: undefined
           * proxyRes - Default: undefined (http.ServerResponse if expecting single parameter)
           * proxyReq - Default: undefined
           */
  var proxy: js.UndefOr[java.lang.String | ProxyOptions] = js.undefined
  /**
           * Restrict the frequency in which browser:reload events can be emitted to connected clients
           * Default: 0
           * Note: Requires at least version 2.6.0.
           */
  var reloadDebounce: js.UndefOr[scala.Double] = js.undefined
  /**
           * Time, in milliseconds, to wait before instructing the browser to reload/inject following a file
           * change event
           * Default: 0
           */
  var reloadDelay: js.UndefOr[scala.Double] = js.undefined
  /**
           * Reload each browser when Browsersync is restarted.
           * Default: false
           */
  var reloadOnRestart: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Emit only the first event during sequential time windows of a specified duration.
           * Note: Requires at least version 2.13.0.
           */
  var reloadThrottle: js.UndefOr[scala.Double] = js.undefined
  /**
           * Add additional HTML rewriting rules.
           * Default: false
           * Note: Requires at least version 2.4.0.
           */
  var rewriteRules: js.UndefOr[scala.Boolean | js.Array[RewriteRules]] = js.undefined
  /**
           * Alter the script path for complete control over where the Browsersync Javascript is served
           * from. Whatever you return from this function will be used as the script path.
           * Note: Requires at least version 1.5.0.
           */
  var scriptPath: js.UndefOr[js.Function1[/* path */ java.lang.String, java.lang.String]] = js.undefined
  /**
           * Default: []
           * Note: Requires at least version 2.9.0.
           * Sync the scroll position of any element on the page - where any scrolled element will cause
           * all others to match scroll position. This is helpful when a breakpoint alters which element
           * is actually scrolling
           */
  var scrollElementMapping: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * Sync the scroll position of any element on the page. Add any amount of CSS selectors
           * Default: []
           * Note: Requires at least version 2.9.0.
           */
  var scrollElements: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
           * scrollProportionally: false // Sync viewports to TOP position
           * Default: true
           */
  var scrollProportionally: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Decide which technique should be used to restore scroll position following a reload.
           * Can be window.name or cookie
           * Default: 'window.name'
           */
  var scrollRestoreTechnique: js.UndefOr[java.lang.String] = js.undefined
  /**
           * How often to send scroll events
           * Default: 0
           */
  var scrollThrottle: js.UndefOr[scala.Double] = js.undefined
  /**
           * Add additional directories from which static files should be served.
           * Should only be used in proxy or snippet mode.
           * Default: []
           * Note: Requires at least version 2.8.0.
           */
  var serveStatic: js.UndefOr[js.Array[StaticOptions] | js.Array[java.lang.String]] = js.undefined
  /**
           * Options that are passed to the serve-static middleware when you use the
           * string[] syntax: eg: `serveStatic: ['./app']`.
           * Please see [serve-static](https://github.com/expressjs/serve-static) for details.
           */
  var serveStaticOptions: js.UndefOr[serveDashStaticLib.serveDashStaticMod.serveStaticNs.ServeStaticOptions] = js.undefined
  /**
           * Use the built-in static server for basic HTML/JS/CSS websites.
           * Default: false
           */
  var server: js.UndefOr[java.lang.String | scala.Boolean | js.Array[java.lang.String] | ServerOptions] = js.undefined
  /**
           * Serve an index.html file for all non-asset routes.
           * Useful when using client-routers.
           */
  var single: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * You can control how the snippet is injected onto each page via a custom regex + function.
           * You can also provide patterns for certain urls that should be ignored from the snippet injection.
           * Note: Requires at least version 2.0.0.
           */
  var snippetOptions: js.UndefOr[SnippetOptions] = js.undefined
  /**
           * Configure the Socket.IO path and namespace & domain to avoid collisions.
           * path - Default: "/browser-sync/socket.io"
           * clientPath - Default: "/browser-sync"
           * namespace - Default: "/browser-sync"
           * domain - Default: undefined
           * port - Default: undefined
           * clients.heartbeatTimeout - Default: 5000
           * Note: Requires at least version 1.6.2.
           */
  var socket: js.UndefOr[SocketOptions] = js.undefined
  /**
           * The initial path to load
           */
  var startPath: js.UndefOr[java.lang.String] = js.undefined
  /**
           * ¯\_(ツ)_/¯
           */
  var tagNames: js.UndefOr[TagNamesOptions] = js.undefined
  /**
           * Append timestamps to injected files
           * Default: true
           */
  var timestamps: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Tunnel the Browsersync server through a random Public URL
           * Default: null
           */
  var tunnel: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
           * Browsersync includes a user-interface that is accessed via a separate port. The UI allows to controls
           * all devices, push sync updates and much more.
           *
           * port - Default: 3001
           * weinre.port - Default: 8080
           * Note: Requires at least version 2.0.0.
           */
  var ui: js.UndefOr[UIOptions | scala.Boolean] = js.undefined
  /**
           * Watch files automatically.
           */
  var watch: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Specify which file events to respond to.
           * Available events: `add`, `change`, `unlink`, `addDir`, `unlinkDir`
           */
  var watchEvents: js.UndefOr[WatchEvents | js.Array[java.lang.String]] = js.undefined
  /**
           * File watching options that get passed along to Chokidar. Check their docs for available options
           * Default: undefined
           * Note: Requires at least version 2.6.0.
           */
  var watchOptions: js.UndefOr[chokidarLib.chokidarMod.WatchOptions] = js.undefined
  /**
           * Requires an internet connection - useful for services such as Typekit as it allows you to configure
           * domains such as *.xip.io in your kit settings
           * Default: false
           */
  var xip: js.UndefOr[scala.Boolean] = js.undefined
}
