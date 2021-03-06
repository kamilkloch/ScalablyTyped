package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a source of log messages. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingChannel")
@js.native
class LoggingChannel protected () extends js.Object {
  /**
    * This constructor creates a LoggingChannel in Windows 8.1 compatibility mode.
    * @param name The name of the logging channel.
    */
  def this(name: java.lang.String) = this()
  /**
    * Initializes a new instance of the LoggingChannel class with the specified options.
    * @param name The name of the logging channel.
    * @param options The channel options. Pass null to specify the default options.
    */
  def this(name: java.lang.String, options: LoggingChannelOptions) = this()
  /**
    * Initializes a new instance of the LoggingChannel class with the specified options and channel ID.
    * @param name The name of the logging channel.
    * @param options The channel options. Pass null to specify the default options.
    * @param id The channel identifier to use instead of the automatically generated identifier.
    */
  def this(name: java.lang.String, options: LoggingChannelOptions, id: java.lang.String) = this()
  /** Gets a value that indicates whether at least one session is logging events from this channel. */
  var enabled: scala.Boolean = js.native
  /** Returns the provider identifier for this channel. */
  var id: java.lang.String = js.native
  /** Gets the minimum level at which any session is listening to events from this channel. */
  var level: LoggingLevel = js.native
  /** Gets the name of the current LoggingChannel . */
  var name: java.lang.String = js.native
  /** Raised when the logging channel is attached to a LoggingSession or other event tracing and debugging tools. */
  @JSName("onloggingenabled")
  var onloggingenabled_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ILoggingChannel, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loggingenabled(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.loggingenabled,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ILoggingChannel, _]
  ): scala.Unit = js.native
  /** Ends logging on the current logging channel. */
  def close(): scala.Unit = js.native
  /**
    * Indicates whether at least one session is listening for events from the channel.
    * @return Returns true if at least one session is listening for events from the channel, and otherwise false.
    */
  def isEnabled(): scala.Boolean = js.native
  /**
    * Indicates whether at least one session is listening for events with the specified event severity level from the channel.
    * @param level The event severity level.
    * @return Returns true if at least one session is listening for events with the specified level from the channel, and otherwise false.
    */
  def isEnabled(level: LoggingLevel): scala.Boolean = js.native
  /**
    * Indicates whether at least one session is listening for events with the specified level and keywords from this channel.
    * @param level The event severity level.
    * @param keywords The keywords. Each bit of the keywords value represents an event category.
    * @return Returns true if at least one session is listening for events with the specified level and keywords from the channel, and otherwise false.
    */
  def isEnabled(level: LoggingLevel, keywords: scala.Double): scala.Boolean = js.native
  /**
    * Logs an event with the specified name.
    * @param eventName The name for this event.
    */
  def logEvent(eventName: java.lang.String): scala.Unit = js.native
  /**
    * Logs an event with the specified name and fields.
    * @param eventName The name for this event.
    * @param fields The fields for this event. May be null.
    */
  def logEvent(eventName: java.lang.String, fields: LoggingFields): scala.Unit = js.native
  /**
    * Logs an event with the specified name, fields, and level.
    * @param eventName The name for this event.
    * @param fields The fields for this event. May be null.
    * @param level The level of detail for this event.
    */
  def logEvent(eventName: java.lang.String, fields: LoggingFields, level: LoggingLevel): scala.Unit = js.native
  /**
    * Logs an event with the specified name, fields, level, and options.
    * @param eventName The name for this event.
    * @param fields The fields for this event. May be null.
    * @param level The level of detail for this event.
    * @param options The options for this event. Pass null to use the default options. The options are for advanced scenarios. The default values are designed to work well for most events.
    */
  def logEvent(eventName: java.lang.String, fields: LoggingFields, level: LoggingLevel, options: LoggingOptions): scala.Unit = js.native
  /**
    * Logs a message to the current LoggingChannel .
    * @param eventString The message to log.
    */
  def logMessage(eventString: java.lang.String): scala.Unit = js.native
  /**
    * Logs a message to the current LoggingChannel with the specified LoggingLevel .
    * @param eventString The message to log.
    * @param level The logging level.
    */
  def logMessage(eventString: java.lang.String, level: LoggingLevel): scala.Unit = js.native
  /**
    * Logs data to the current LoggingChannel .
    * @param value1 The string to associate with value2.
    * @param value2 The value to associate with value1.
    */
  def logValuePair(value1: java.lang.String, value2: scala.Double): scala.Unit = js.native
  /**
    * Logs data to the current LoggingChannel with the specified LoggingLevel .
    * @param value1 The string to associate with value2.
    * @param value2 The value to associate with value1.
    * @param level The logging level.
    */
  def logValuePair(value1: java.lang.String, value2: scala.Double, level: LoggingLevel): scala.Unit = js.native
  /** Raised when the logging channel is attached to a LoggingSession or other event tracing and debugging tools. */
  def onloggingenabled(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[ILoggingChannel]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_loggingenabled(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.loggingenabled,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[ILoggingChannel, _]
  ): scala.Unit = js.native
  /**
    * Writes an activity start event and creates a LoggingActivity object.
    * @param startEventName The name for this event.
    * @return Returns an object that represents the new activity.
    */
  def startActivity(startEventName: java.lang.String): LoggingActivity = js.native
  /**
    * Writes an activity start event with the specified fields and creates a LoggingActivity object.
    * @param startEventName The name for this event.
    * @param fields The fields for this event.
    * @return Returns an object that represents the new activity.
    */
  def startActivity(startEventName: java.lang.String, fields: LoggingFields): LoggingActivity = js.native
  /**
    * Writes an activity start event with the specified fields and level, and creates a LoggingActivity object.
    * @param startEventName The name for this event.
    * @param fields The fields for this event. May be null .
    * @param level The level of detail for this event.
    * @return Returns an object that represents the new activity.
    */
  def startActivity(startEventName: java.lang.String, fields: LoggingFields, level: LoggingLevel): LoggingActivity = js.native
  /**
    * Writes an activity start event with the specified fields, level, and options, and creates a LoggingActivity object.
    * @param startEventName The name for this event.
    * @param fields The fields for this event. May be null.
    * @param level The level of detail for this event.
    * @param options The options for this event. Pass null to use the default options. The options are for advanced scenarios. The default values are designed to work well for most events.
    * @return Returns an object that represents the new activity.
    */
  def startActivity(
    startEventName: java.lang.String,
    fields: LoggingFields,
    level: LoggingLevel,
    options: LoggingOptions
  ): LoggingActivity = js.native
}

