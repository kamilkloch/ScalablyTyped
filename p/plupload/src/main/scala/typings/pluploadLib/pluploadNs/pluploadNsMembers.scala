package typings
package pluploadLib.pluploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("plupload")
@js.native
object pluploadNsMembers extends js.Object {
  val DONE: scala.Double = js.native
  val FAILED: scala.Double = js.native
  val FILE_DUPLICATE_ERROR: scala.Double = js.native
  val FILE_EXTENSION_ERROR: scala.Double = js.native
  val FILE_SIZE_ERROR: scala.Double = js.native
  val GENERIC_ERROR: scala.Double = js.native
  val HTTP_ERROR: scala.Double = js.native
  val IMAGE_DIMENSIONS_ERROR: scala.Double = js.native
  val IMAGE_FORMAT_ERROR: scala.Double = js.native
  val INIT_ERROR: scala.Double = js.native
  val IO_ERROR: scala.Double = js.native
  val MEMORY_ERROR: scala.Double = js.native
  val QUEUED: scala.Double = js.native
  val SECURITY_ERROR: scala.Double = js.native
  val STARTED: scala.Double = js.native
  val STOPPED: scala.Double = js.native
  val UPLOADING: scala.Double = js.native
  val VERSION: java.lang.String = js.native
  val mimeTypes: js.Any = js.native
  val ua: js.Any = js.native
  /**
       * Adds specified className to specified DOM element.
       *
       * @method addClass
       * @static
       * @param {Object} obj DOM element like object to add handler to.
       * @param {String} name Class name
       */
  def addClass(obj: js.Any, name: java.lang.String): js.Any = js.native
  /**
       * Adds an event handler to the specified object and store reference to the handler
       * in objects internal Plupload registry (@see removeEvent).
       *
       * @method addEvent
       * @static
       * @param {Object} obj DOM element like object to add handler to.
       * @param {String} name Name to add event listener to.
       * @param {Function} callback Function to call when event occurs.
       * @param {String} (optional) key that might be used to add specifity to the event record.
       */
  def addEvent(obj: js.Any, name: java.lang.String, callback: js.Function): js.Any = js.native
  /**
       * Adds an event handler to the specified object and store reference to the handler
       * in objects internal Plupload registry (@see removeEvent).
       *
       * @method addEvent
       * @static
       * @param {Object} obj DOM element like object to add handler to.
       * @param {String} name Name to add event listener to.
       * @param {Function} callback Function to call when event occurs.
       * @param {String} (optional) key that might be used to add specifity to the event record.
       */
  def addEvent(obj: js.Any, name: java.lang.String, callback: js.Function, key: java.lang.String): js.Any = js.native
  /**
       * Registers a filter that will be executed for each file added to the queue.
       * If callback returns false, file will not be added.
       *
       * Callback receives two arguments: a value for the filter as it was specified in settings.filters
       * and a file to be filtered. Callback is executed in the context of uploader instance.
       *
       * @method addFileFilter
       * @static
       * @param {String} name Name of the filter by which it can be referenced in settings.filters
       * @param {String} cb Callback - the actual routine that every added file must pass
       */
  def addFileFilter(name: java.lang.String, cb: js.Function): scala.Unit = js.native
  /**
       * Extends the language pack object with new items.
       *
       * @method addI18n
       * @static
       * @param {Object} pack Language pack items to add.
       * @return {Object} Extended language pack object.
       */
  def addI18n(pack: js.Any): js.Any = js.native
  /**
       * Builds a full url out of a base URL and an object with items to append as query string items.
       *
       * @method buildUrl
       * @static
       * @param {String} url Base URL to append query string items to.
       * @param {Object} items Name/value object to serialize as a querystring.
       * @return {String} String with url + serialized query string items.
       */
  def buildUrl(url: java.lang.String, items: js.Any): java.lang.String = js.native
  /**
       * Cleans the specified name from national characters (diacritics). The result will be a name with only a-z, 0-9 and _.
       *
       * @method cleanName
       * @static
       * @param {String} s String to clean up.
       * @return {String} Cleaned string.
       */
  def cleanName(name: java.lang.String): java.lang.String = js.native
  /** Utility methods **/
  
  /**
       * Executes the callback function for each item in array/object. If you return false in the
       * callback it will break the loop.
       *
       * @method each
       * @static
       * @param {Object} obj Object to iterate.
       * @param {function} callback Callback function to execute for each item.
       */
  def each(obj: js.Any, callback: js.Function): scala.Unit = js.native
  /**
       * Extends the specified object with another object.
       *
       * @method extend
       * @static
       * @param {Object} target Object to extend.
       * @param {Object..} obj Multiple objects to extend with.
       * @return {Object} Same as target, the extended object.
       */
  def extend(target: js.Any): js.Any = js.native
  /**
       * Formats the specified number as a size string for example 1024 becomes 1 KB.
       *
       * @method formatSize
       * @static
       * @param {Number} size Size to format as string.
       * @return {String} Formatted size string.
       */
  def formatSize(size: scala.Double): java.lang.String = js.native
  /**
       * Returns the absolute x, y position of an Element. The position will be returned in a object with x, y fields.
       *
       * @method getPos
       * @static
       * @param {Element} node HTML element or element id to get x, y position from.
       * @param {Element} root Optional root element to stop calculations at.
       * @return {object} Absolute position of the specified element object with x, y fields.
       */
  def getPos(node: stdLib.Element, root: stdLib.Element): js.Any = js.native
  /**
       * Returns the size of the specified node in pixels.
       *
       * @method getSize
       * @static
       * @param {Node} node Node to get the size of.
       * @return {Object} Object with a w and h property.
       */
  def getSize(node: stdLib.Node): js.Any = js.native
  /**
       * Returns a given computed style of a DOM element.
       *
       * @method getStyle
       * @static
       * @param {Object} obj DOM element like object.
       * @param {String} name Style you want to get from the DOM element
       */
  def getStyle(obj: js.Any, name: java.lang.String): js.Any = js.native
  /**
       * Generates an unique ID. This is 99.99% unique since it takes the current time and 5 random numbers.
       * The only way a user would be able to get the same ID is if the two persons at the same exact millisecond manages
       * to get 5 the same random numbers between 0-65535 it also uses a counter so each call will be guaranteed to be page unique.
       * It's more probable for the earth to be hit with an asteriod. You can also if you want to be 100% sure set the plupload.guidPrefix property
       * to an user unique key.
       *
       * @method guid
       * @static
       * @return {String} Virtually unique id.
       */
  def guid(guid: java.lang.String): java.lang.String = js.native
  /**
       * Checks if specified DOM element has specified class.
       *
       * @method hasClass
       * @static
       * @param {Object} obj DOM element like object to add handler to.
       * @param {String} name Class name
       */
  def hasClass(obj: js.Any, name: java.lang.String): js.Any = js.native
  /**
       * Find an element in array and return its index if present, otherwise return -1.
       *
       * @method inArray
       * @static
       * @param {mixed} needle Element to find
       * @param {Array} array
       * @return {Int} Index of the element, or -1 if not found
       */
  def inArray(needle: js.Any, array: js.Array[_]): scala.Double = js.native
  /**
      Recieve an array of functions (usually async) to call in sequence, each  function
      receives a callback as first argument that it should call, when it completes. Finally,
      after everything is complete, main callback is called. Passing truthy value to the
      callback as a first argument will interrupt the sequence and invoke main callback
      immediately.
      @method inSeries
      @static
      @param {Array} queue Array of functions to call in sequence
      @param {Function} cb Main callback that is called in the end, or in case of error
      */
  def inSeries(queue: js.Array[_], callback: js.Function): scala.Unit = js.native
  /**
       * Checks if object is empty.
       *
       * @method isEmptyObj
       * @static
       * @param {Object} obj Object to check.
       * @return {Boolean}
       */
  def isEmptyObj(obj: js.Any): scala.Boolean = js.native
  /**
       * Parses the specified size string into a byte value. For example 10kb becomes 10240.
       *
       * @method parseSize
       * @static
       * @param {String|Number} size String to parse or number to just pass through.
       * @return {Number} Size in bytes.
       */
  def parseSize(size: java.lang.String): scala.Double = js.native
  /**
       * Parses the specified size string into a byte value. For example 10kb becomes 10240.
       *
       * @method parseSize
       * @static
       * @param {String|Number} size String to parse or number to just pass through.
       * @return {Number} Size in bytes.
       */
  def parseSize(size: scala.Double): scala.Double = js.native
  /**
       * A way to predict what runtime will be choosen in the current environment with the
       * specified settings.
       *
       * @method predictRuntime
       * @static
       * @param {Object|String} config Plupload settings to check
       * @param {String} [runtimes] Comma-separated list of runtimes to check against
       * @return {String} Type of compatible runtime
       */
  def predictRuntime(config: js.Any, runtimes: java.lang.String): java.lang.String = js.native
  /**
       * Remove all kind of events from the specified object
       *
       * @method removeAllEvents
       * @static
       * @param {Object} obj DOM element to remove event listeners from.
       * @param {String} (optional) unique key to match, when removing events.
       */
  def removeAllEvents(obj: js.Any): js.Any = js.native
  /**
       * Remove all kind of events from the specified object
       *
       * @method removeAllEvents
       * @static
       * @param {Object} obj DOM element to remove event listeners from.
       * @param {String} (optional) unique key to match, when removing events.
       */
  def removeAllEvents(obj: js.Any, key: java.lang.String): js.Any = js.native
  /**
       * Removes specified className from specified DOM element.
       *
       * @method removeClass
       * @static
       * @param {Object} obj DOM element like object to add handler to.
       * @param {String} name Class name
       */
  def removeClass(obj: js.Any, name: java.lang.String): js.Any = js.native
  /**
       * Remove event handler from the specified object. If third argument (callback)
       * is not specified remove all events with the specified name.
       *
       * @method removeEvent
       * @static
       * @param {Object} obj DOM element to remove event listener(s) from.
       * @param {String} name Name of event listener to remove.
       * @param {Function|String} (optional) might be a callback or unique key to match.
       */
  def removeEvent(obj: js.Any, name: java.lang.String): js.Any = js.native
  /**
       * Remove event handler from the specified object. If third argument (callback)
       * is not specified remove all events with the specified name.
       *
       * @method removeEvent
       * @static
       * @param {Object} obj DOM element to remove event listener(s) from.
       * @param {String} name Name of event listener to remove.
       * @param {Function|String} (optional) might be a callback or unique key to match.
       */
  def removeEvent(obj: js.Any, name: java.lang.String, optional: java.lang.String): js.Any = js.native
  /**
       * Remove event handler from the specified object. If third argument (callback)
       * is not specified remove all events with the specified name.
       *
       * @method removeEvent
       * @static
       * @param {Object} obj DOM element to remove event listener(s) from.
       * @param {String} name Name of event listener to remove.
       * @param {Function|String} (optional) might be a callback or unique key to match.
       */
  def removeEvent(obj: js.Any, name: java.lang.String, optional: js.Function): js.Any = js.native
  /**
       * Pseudo sprintf implementation - simple way to replace tokens with specified values.
       *
       * @param {String} str String with tokens
       * @return {String} String with replaced tokens
       */
  def sprintf(str: java.lang.String): java.lang.String = js.native
  /**
       * Forces anything into an array.
       *
       * @method toArray
       * @static
       * @param {Object} obj Object with length field.
       * @return {Array} Array object containing all items.
       */
  def toArray(obj: js.Any): js.Array[_] = js.native
  /**
       * Translates the specified string by checking for the english string in the language pack lookup.
       *
       * @method translate
       * @static
       * @param {String} str String to look for.
       * @return {String} Translated string or the input string if it wasn't found.
       */
  def translate(str: java.lang.String): java.lang.String = js.native
  /**
       * Gets the true type of the built-in object (better version of typeof).
       * @credits Angus Croll (http://javascriptweblog.wordpress.com/)
       *
       * @method typeOf
       * @static
       * @param {Object} o Object to check.
       * @return {String} Object [[Class]]
       */
  def typeOf(o: js.Any): java.lang.String = js.native
  /**
       * Encodes the specified string.
       *
       * @method xmlEncode
       * @static
       * @param {String} s String to encode.
       * @return {String} Encoded string.
       */
  def xmlEncode(str: java.lang.String): java.lang.String = js.native
}
