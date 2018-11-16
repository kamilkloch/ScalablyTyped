package typings
package appframeworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait appFrameworkStatic extends js.Object {
  /* AJAX settings */
  var ajaxSettings: appFrameworkAjaxSettings = js.native
  var feat: Anon_CssTransformStart = js.native
  /**
       * Prototype for afm object.  Also extens $.fn
       */
  var fn: js.Object = js.native
  /**
       * Helper function to parse the user agent.  Sets the following
       * .os.webkit
       * .os.android
       * .os.ipad
       * .os.iphone
       * .os.webos
       * .os.touchpad
       * .os.blackberry
       * .os.opera
       * .os.fennec
       * .os.ie
       * .os.ieTouch
       * .os.supportsTouch
       * .os.playbook
       * .feat.nativetouchScroll
       * @api private
       */
  var os: Anon_Ios = js.native
  def apply(collection: appFrameworkCollection): appFrameworkCollection = js.native
  def apply(element: stdLib.HTMLElement): appFrameworkCollection = js.native
  def apply(`object`: js.Any): appFrameworkCollection = js.native
  /**
       * This is the internal appframework object that gets extended and added on to it
       * This is also the start of our query selector engine
       * @param {String|Element|Object|Array} selector
       * @param {String|Element|Object} [context]
       */
  def apply(selector: java.lang.String): appFrameworkCollection = js.native
  /**
       * This is the internal appframework object that gets extended and added on to it
       * This is also the start of our query selector engine
       * @param {String|Element|Object|Array} selector
       * @param {String|Element|Object} [context]
       */
  def apply(selector: java.lang.String, context: js.Any): appFrameworkCollection = js.native
  /**
       * Creates a custom event to be used internally.
       * @param {String} type
       * @param {Object} [properties]
       * @return {event} a custom event that can then be dispatched
       * @title $.Event(type,props);
       */
  def Event(`type`: java.lang.String, props: js.Any): js.Any = js.native
  /**
       * Execute an Ajax call with the given options
       * options.type - Type of request
       * options.beforeSend - function to execute before sending the request
       * options.success - success callback
       * options.error - error callback
       * options.complete - complete callback - callled with a success or error
       * options.timeout - timeout to wait for the request
       * options.url - URL to make request against
       * options.contentType - HTTP Request Content Type
       * options.headers - Object of headers to set
       * options.dataType - Data type of request
       * options.data - data to pass into request.  $.param is called on objects
       ```
       var opts={
              type:"GET",
              success:function(data){},
              url:"mypage.php",
              data:{bar:'bar'},
              }
       $.ajax(opts);
       ```
  
       * @param {Object} options
       * @title $.ajax(options)
       */
  def ajax(options: appFrameworkAjaxSettings): stdLib.XMLHttpRequest = js.native
  /**
       * This adds a command to execute in the JS stack, but is faster then setTimeout
       ```
       $.asap(function,context,args)
       ```
       * @param {Function} function
       * @param {Object} context
       * @param {Array} arguments
       */
  def asap(callback: js.Function): scala.Unit = js.native
  /**
       * This adds a command to execute in the JS stack, but is faster then setTimeout
       ```
       $.asap(function,context,args)
       ```
       * @param {Function} function
       * @param {Object} context
       * @param {Array} arguments
       */
  def asap(callback: js.Function, context: js.Any): scala.Unit = js.native
  /**
       * This adds a command to execute in the JS stack, but is faster then setTimeout
       ```
       $.asap(function,context,args)
       ```
       * @param {Function} function
       * @param {Object} context
       * @param {Array} arguments
       */
  def asap(callback: js.Function, context: js.Any, args: js.Array[_]): scala.Unit = js.native
  /* The following are for events on objects */
  /**
       * Bind an event to an object instead of a DOM Node
       ```
       $.bind(this,'event',function(){});
       ```
       * @param {Object} object
       * @param {String} event name
       * @param {Function} function to execute
       * @title $.bind(object,event,function);
       */
  def bind(`object`: js.Any, event: java.lang.String, fn: js.Function): scala.Unit = js.native
  /**
       * Function to clean up node content to prevent memory leaks
       ```
       $.cleanUpContent(node,itself,kill)
       ```
       * @param {HTMLNode} node
       * @param {Bool} kill itself
       * @param {bool} Kill nodes
       * @title $.cleanUpContent(node,itself,kill)
       */
  def cleanUpContent(node: stdLib.HTMLElement): scala.Unit = js.native
  /**
       * Function to clean up node content to prevent memory leaks
       ```
       $.cleanUpContent(node,itself,kill)
       ```
       * @param {HTMLNode} node
       * @param {Bool} kill itself
       * @param {bool} Kill nodes
       * @title $.cleanUpContent(node,itself,kill)
       */
  def cleanUpContent(node: stdLib.HTMLElement, itself: scala.Boolean): scala.Unit = js.native
  /**
       * Function to clean up node content to prevent memory leaks
       ```
       $.cleanUpContent(node,itself,kill)
       ```
       * @param {HTMLNode} node
       * @param {Bool} kill itself
       * @param {bool} Kill nodes
       * @title $.cleanUpContent(node,itself,kill)
       */
  def cleanUpContent(node: stdLib.HTMLElement, itself: scala.Boolean, kill: scala.Boolean): scala.Unit = js.native
  /**
       * $.create - a faster alertnative to $("<div id='main'>this is some text</div>");
       ```
       $.create("div",{id:'main',innerHTML:'this is some text'});
       $.create("<div id='main'>this is some text</div>");
       ```
       * @param {String} DOM Element type or html
       * @param [{Object}] properties to apply to the element
       * @return {Object} Returns an appframework object
       * @title $.create(type,[params])
       */
  def create(`type`: java.lang.String): appFrameworkCollection = js.native
  /**
       * $.create - a faster alertnative to $("<div id='main'>this is some text</div>");
       ```
       $.create("div",{id:'main',innerHTML:'this is some text'});
       $.create("<div id='main'>this is some text</div>");
       ```
       * @param {String} DOM Element type or html
       * @param [{Object}] properties to apply to the element
       * @return {Object} Returns an appframework object
       * @title $.create(type,[params])
       */
  def create(`type`: java.lang.String, params: js.Any): appFrameworkCollection = js.native
  def each(collection: js.Any, fn: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]): scala.Unit = js.native
  /**
       * Iterates through elements and executes a callback.  Returns if false
       ```
       $.each([1,2],function(ind){console.log(ind);});
       ```
  
       * @param {Array|Object} elements
       * @param {Function} callback
       * @return {Array} elements
       * @title $.each(elements,callback)
       */
  def each(collection: js.Array[_], fn: js.Function2[/* index */ scala.Double, /* item */ js.Any, _]): scala.Unit = js.native
  /**
       * Extends an object with additional arguments
       ```
       $.extend({foo:'bar'});
       $.extend(element,{foo:'bar'});
       ```
  
       * @param {Object} [target] element
       * @param any number of additional arguments
       * @return {Object} [target]
       * @title $.extend(target,{params})
       */
  def extend(target: js.Any, sources: js.Any*): js.Any = js.native
  /**
       * Shorthand call to an Ajax GET request
       ```
       $.get("mypage.php?foo=bar",function(data){});
       ```
  
       * @param {String} url to hit
       * @param {Function} success
       * @title $.get(url,success)
       */
  def get(
    url: java.lang.String,
    fn: js.Function3[
      /* data */ js.Any, 
      /* status */ js.UndefOr[java.lang.String], 
      /* xhr */ js.UndefOr[stdLib.XMLHttpRequest], 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def getCssMatrix(elem: appFrameworkCollection): appFrameworkCssMatrix = js.native
  /**
       * Gets the css matrix, or creates a fake one
       ```
       $.getCssMatrix(domElement)
       ```
       @returns matrix with postion
       */
  def getCssMatrix(node: stdLib.HTMLElement): appFrameworkCssMatrix = js.native
  def getJSON(
    url: java.lang.String,
    data: js.Any,
    fn: js.Function3[
      /* data */ js.Any, 
      /* status */ java.lang.String, 
      /* xhr */ stdLib.XMLHttpRequest, 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  /**
       * Shorthand call to an Ajax request that expects a JSON response
       ```
       $.getJSON("mypage.php",{bar:'bar'},function(data){});
       ```
  
       * @param {String} url to hit
       * @param {Object} [data]
       * @param {Function} [success]
       * @title $.getJSON(url,data,success)
       */
  def getJSON(
    url: java.lang.String,
    fn: js.Function3[
      /* data */ js.Any, 
      /* status */ js.UndefOr[java.lang.String], 
      /* xhr */ js.UndefOr[stdLib.XMLHttpRequest], 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  /**
       * Checks to see if the parameter is a $afm object
       ```
       var foo=$('#header');
       $.is$(foo);
       ```
  
       * @param {Object} element
       * @return {Boolean}
       * @title $.is$(param)
       */
  @JSName("is$")
  def is$(obj: js.Any): scala.Boolean = js.native
  /**
       * Checks to see if the parameter is an array
       ```
       var arr=[];
       $.isArray(arr);
       ```
  
       * @param {Object} element
       * @return {Boolean}
       * @example $.isArray([1]);
       * @title $.isArray(param)
       */
  def isArray(`object`: js.Any): scala.Boolean = js.native
  /**
       * Checks to see if the parameter is a function
       ```
       var func=function(){};
       $.isFunction(func);
       ```
  
       * @param {Object} element
       * @return {Boolean}
       * @title $.isFunction(param)
       */
  def isFunction(`object`: js.Any): scala.Boolean = js.native
  /**
       * Checks to see if the parameter is a object
       ```
       var foo={bar:'bar'};
       $.isObject(foo);
       ```
  
       * @param {Object} element
       * @return {Boolean}
       * @title $.isObject(param)
       */
  def isObject(`object`: js.Any): scala.Boolean = js.native
  /**
       * Execute a jsonP call, allowing cross domain scripting
       * options.url - URL to call
       * options.success - Success function to call
       * options.error - Error function to call
       ```
       $.jsonP({url:'mysite.php?callback=?&foo=bar',success:function(){},error:function(){}});
       ```
  
       * @param {Object} options
       * @title $.jsonP(options)
       */
  def jsonP(options: appFrameworkAjaxSettings): js.Object = js.native
  /**
       * Map takes in elements and executes a callback function on each and returns a collection
       ```
       $.map([1,2],function(ind){return ind+1});
       ```
  
       * @param {Array|Object} elements
       * @param {Function} callback
       * @return {Object} appframework object with elements in it
       * @title $.map(elements,callback)
       */
  def map(collection: js.Array[_], fn: js.Function2[/* item */ js.Any, /* index */ scala.Double, _]): js.Array[_] = js.native
  /**
       * Converts an object into a key/value par with an optional prefix.  Used for converting objects to a query string
       ```
       var obj={
              foo:'foo',
              bar:'bar'
              }
       var kvp=$.param(obj,'data');
       ```
  
       * @param {Object} object
       * @param {String} [prefix]
       * @return {String} Key/value pair representation
       * @title $.param(object,[prefix];
       */
  def param(`object`: js.Any): java.lang.String = js.native
  /**
       * Converts an object into a key/value par with an optional prefix.  Used for converting objects to a query string
       ```
       var obj={
              foo:'foo',
              bar:'bar'
              }
       var kvp=$.param(obj,'data');
       ```
  
       * @param {Object} object
       * @param {String} [prefix]
       * @return {String} Key/value pair representation
       * @title $.param(object,[prefix];
       */
  def param(`object`: js.Any, prefix: java.lang.String): java.lang.String = js.native
  /**
       * this function executes javascript in HTML.
       ```
       $.parseJS(content)
       ```
       * @param {String|DOM} content
       * @title $.parseJS(content);
       */
  def parseJS(content: java.lang.String): scala.Unit = js.native
  def parseJS(content: stdLib.HTMLElement): scala.Unit = js.native
  /**
       * Used for backwards compatibility.  Uses native JSON.parse function
       ```
       var obj=$.parseJSON("{\"bar\":\"bar\"}");
       ```
  
       * @params {String} string
       * @return {Object}
       * @title $.parseJSON(string)
       */
  def parseJSON(str: java.lang.String): js.Any = js.native
  /**
       * Helper function to convert XML into  the DOM node representation
       ```
       var xmlDoc=$.parseXML("<xml><foo>bar</foo></xml>");
       ```
  
       * @param {String} string
       * @return {Object} DOM nodes
       * @title $.parseXML(string)
       */
  def parseXML(str: java.lang.String): js.Any = js.native
  def post(
    url: java.lang.String,
    data: js.Any,
    fn: js.Function3[
      /* data */ js.Any, 
      /* status */ js.UndefOr[java.lang.String], 
      /* xhr */ js.UndefOr[stdLib.XMLHttpRequest], 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  def post(
    url: java.lang.String,
    data: js.Any,
    fn: js.Function3[
      /* data */ js.Any, 
      /* status */ js.UndefOr[java.lang.String], 
      /* xhr */ js.UndefOr[stdLib.XMLHttpRequest], 
      scala.Unit
    ],
    dataType: java.lang.String
  ): stdLib.XMLHttpRequest = js.native
  /**
       * Shorthand call to an Ajax POST request
       ```
       $.post("mypage.php",{bar:'bar'},function(data){});
       ```
  
       * @param {String} url to hit
       * @param {Object} [data] to pass in
       * @param {Function} success
       * @param {String} [dataType]
       * @title $.post(url,[data],success,[dataType])
       */
  def post(
    url: java.lang.String,
    fn: js.Function3[
      /* data */ js.Any, 
      /* status */ js.UndefOr[java.lang.String], 
      /* xhr */ js.UndefOr[stdLib.XMLHttpRequest], 
      scala.Unit
    ]
  ): stdLib.XMLHttpRequest = js.native
  /**
       * Shorthand call to an Ajax POST request
       ```
       $.post("mypage.php",{bar:'bar'},function(data){});
       ```
  
       * @param {String} url to hit
       * @param {Object} [data] to pass in
       * @param {Function} success
       * @param {String} [dataType]
       * @title $.post(url,[data],success,[dataType])
       */
  def post(
    url: java.lang.String,
    fn: js.Function3[
      /* data */ js.Any, 
      /* status */ js.UndefOr[java.lang.String], 
      /* xhr */ js.UndefOr[stdLib.XMLHttpRequest], 
      scala.Unit
    ],
    dataType: java.lang.String
  ): stdLib.XMLHttpRequest = js.native
  /**
       * Creates a proxy function so you can change the 'this' context in the function
       * Update: now also allows multiple argument call or for you to pass your own arguments
       ```
       var newObj={foo:bar}
       $("#main").bind("click",$.proxy(function(evt){console.log(this)},newObj);
  
       or
  
       ( $.proxy(function(foo, bar){console.log(this+foo+bar)}, newObj) )('foo', 'bar');
  
       or
  
       ( $.proxy(function(foo, bar){console.log(this+foo+bar)}, newObj, ['foo', 'bar']) )();
       ```
       * @param {Function} Callback
       * @param {Object} Context
       * @title $.proxy(callback,context);
       */
  def proxy(callback: js.Function, context: js.Any): scala.Unit = js.native
  /**
       * $.query  - a faster alertnative to $("div");
       ```
       $.query(".panel");
       ```
       * @param {String} selector
       * @param {Object} [context]
       * @return {Object} Returns an appframework object
       * @title $.query(selector,[context])
       */
  def query(selector: java.lang.String): appFrameworkCollection = js.native
  /**
       * $.query  - a faster alertnative to $("div");
       ```
       $.query(".panel");
       ```
       * @param {String} selector
       * @param {Object} [context]
       * @return {Object} Returns an appframework object
       * @title $.query(selector,[context])
       */
  def query(selector: java.lang.String, context: js.Any): appFrameworkCollection = js.native
  /**
       * Trigger an event to an object instead of a DOM Node
       ```
       $.trigger(this,'event',arguments);
       ```
       * @param {Object} object
       * @param {String} event name
       * @param {Array} arguments
       * @title $.trigger(object,event,argments);
       */
  def trigger(`object`: js.Any, event: java.lang.String): scala.Unit = js.native
  /**
       * Trigger an event to an object instead of a DOM Node
       ```
       $.trigger(this,'event',arguments);
       ```
       * @param {Object} object
       * @param {String} event name
       * @param {Array} arguments
       * @title $.trigger(object,event,argments);
       */
  def trigger(`object`: js.Any, event: java.lang.String, args: js.Array[_]): scala.Unit = js.native
  /**
       * Unbind an event to an object instead of a DOM Node
       ```
       $.unbind(this,'event',function(){});
       ```
       * @param {Object} object
       * @param {String} event name
       * @param {Function} function to execute
       * @title $.unbind(object,event,function);
       */
  def unbind(`object`: js.Any, event: java.lang.String, fn: js.Function): scala.Unit = js.native
  /**
       * Utility function to create a psuedo GUID
       ```
       var id= $.uuid();
       ```
       * @title $.uuid
       */
  def uuid(): java.lang.String = js.native
}
