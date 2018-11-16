package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Event extends js.Object {
  /** Whether anyone can invite themselves to the event (currently works for Google+ events only). Optional. The default is False. */
  var anyoneCanAddSelf: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * File attachments for the event. Currently only Google Drive attachments are supported.
               * In order to modify attachments the supportsAttachments request parameter should be set to true.
               * There can be at most 25 attachments per event,
               */
  var attachments: js.UndefOr[js.Array[EventAttachment]] = js.undefined
  /** The attendees of the event. See the Events with attendees guide for more information on scheduling events with other calendar users. */
  var attendees: js.UndefOr[js.Array[EventAttendee]] = js.undefined
  /**
               * Whether attendees may have been omitted from the event's representation. When retrieving an event, this may be due to a restriction specified by the
               * maxAttendee query parameter. When updating an event, this can be used to only update the participant's response. Optional. The default is False.
               */
  var attendeesOmitted: js.UndefOr[scala.Boolean] = js.undefined
  /** The color of the event. This is an ID referring to an entry in the event section of the colors definition (see the  colors endpoint). Optional. */
  var colorId: js.UndefOr[java.lang.String] = js.undefined
  /** Creation time of the event (as a RFC3339 timestamp). Read-only. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** The creator of the event. Read-only. */
  var creator: js.UndefOr[gapiDotClientDotCalendarLib.Anon_DisplayName] = js.undefined
  /** Description of the event. Optional. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The (exclusive) end time of the event. For a recurring event, this is the end time of the first instance. */
  var end: js.UndefOr[EventDateTime] = js.undefined
  /**
               * Whether the end time is actually unspecified. An end time is still provided for compatibility reasons, even if this attribute is set to True. The
               * default is False.
               */
  var endTimeUnspecified: js.UndefOr[scala.Boolean] = js.undefined
  /** ETag of the resource. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** Extended properties of the event. */
  var extendedProperties: js.UndefOr[gapiDotClientDotCalendarLib.Anon_Shared] = js.undefined
  /** A gadget that extends this event. */
  var gadget: js.UndefOr[gapiDotClientDotCalendarLib.Anon_Height] = js.undefined
  /** Whether attendees other than the organizer can invite others to the event. Optional. The default is True. */
  var guestsCanInviteOthers: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether attendees other than the organizer can modify the event. Optional. The default is False. */
  var guestsCanModify: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether attendees other than the organizer can see who the event's attendees are. Optional. The default is True. */
  var guestsCanSeeOtherGuests: js.UndefOr[scala.Boolean] = js.undefined
  /** An absolute link to the Google+ hangout associated with this event. Read-only. */
  var hangoutLink: js.UndefOr[java.lang.String] = js.undefined
  /** An absolute link to this event in the Google Calendar Web UI. Read-only. */
  var htmlLink: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Event unique identifier as defined in RFC5545. It is used to uniquely identify events accross calendaring systems and must be supplied when importing
               * events via the import method.
               * Note that the icalUID and the id are not identical and only one of them should be supplied at event creation time. One difference in their semantics is
               * that in recurring events, all occurrences of one event have different ids while they all share the same icalUIDs.
               */
  var iCalUID: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Opaque identifier of the event. When creating new single or recurring events, you can specify their IDs. Provided IDs must follow these rules:
               * - characters allowed in the ID are those used in base32hex encoding, i.e. lowercase letters a-v and digits 0-9, see section 3.1.2 in RFC2938
               * - the length of the ID must be between 5 and 1024 characters
               * - the ID must be unique per calendar  Due to the globally distributed nature of the system, we cannot guarantee that ID collisions will be detected at
               * event creation time. To minimize the risk of collisions we recommend using an established UUID algorithm such as one described in RFC4122.
               * If you do not specify an ID, it will be automatically generated by the server.
               * Note that the icalUID and the id are not identical and only one of them should be supplied at event creation time. One difference in their semantics is
               * that in recurring events, all occurrences of one event have different ids while they all share the same icalUIDs.
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the resource ("calendar#event"). */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Geographic location of the event as free-form text. Optional. */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Whether this is a locked event copy where no changes can be made to the main event fields "summary", "description", "location", "start", "end" or
               * "recurrence". The default is False. Read-Only.
               */
  var locked: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * The organizer of the event. If the organizer is also an attendee, this is indicated with a separate entry in attendees with the organizer field set to
               * True. To change the organizer, use the move operation. Read-only, except when importing an event.
               */
  var organizer: js.UndefOr[gapiDotClientDotCalendarLib.Anon_DisplayName] = js.undefined
  /**
               * For an instance of a recurring event, this is the time at which this event would start according to the recurrence data in the recurring event
               * identified by recurringEventId. Immutable.
               */
  var originalStartTime: js.UndefOr[EventDateTime] = js.undefined
  /** Whether this is a private event copy where changes are not shared with other copies on other calendars. Optional. Immutable. The default is False. */
  var privateCopy: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * List of RRULE, EXRULE, RDATE and EXDATE lines for a recurring event, as specified in RFC5545. Note that DTSTART and DTEND lines are not allowed in this
               * field; event start and end times are specified in the start and end fields. This field is omitted for single events or instances of recurring events.
               */
  var recurrence: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** For an instance of a recurring event, this is the id of the recurring event to which this instance belongs. Immutable. */
  var recurringEventId: js.UndefOr[java.lang.String] = js.undefined
  /** Information about the event's reminders for the authenticated user. */
  var reminders: js.UndefOr[gapiDotClientDotCalendarLib.Anon_Overrides] = js.undefined
  /** Sequence number as per iCalendar. */
  var sequence: js.UndefOr[scala.Double] = js.undefined
  /**
               * Source from which the event was created. For example, a web page, an email message or any document identifiable by an URL with HTTP or HTTPS scheme.
               * Can only be seen or modified by the creator of the event.
               */
  var source: js.UndefOr[gapiDotClientDotCalendarLib.Anon_Url] = js.undefined
  /** The (inclusive) start time of the event. For a recurring event, this is the start time of the first instance. */
  var start: js.UndefOr[EventDateTime] = js.undefined
  /**
               * Status of the event. Optional. Possible values are:
               * - "confirmed" - The event is confirmed. This is the default status.
               * - "tentative" - The event is tentatively confirmed.
               * - "cancelled" - The event is cancelled.
               */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /** Title of the event. */
  var summary: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Whether the event blocks time on the calendar. Optional. Possible values are:
               * - "opaque" - Default value. The event does block time on the calendar. This is equivalent to setting Show me as to Busy in the Calendar UI.
               * - "transparent" - The event does not block time on the calendar. This is equivalent to setting Show me as to Available in the Calendar UI.
               */
  var transparency: js.UndefOr[java.lang.String] = js.undefined
  /** Last modification time of the event (as a RFC3339 timestamp). Read-only. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Visibility of the event. Optional. Possible values are:
               * - "default" - Uses the default visibility for events on the calendar. This is the default value.
               * - "public" - The event is public and event details are visible to all readers of the calendar.
               * - "private" - The event is private and only event attendees may view event details.
               * - "confidential" - The event is private. This value is provided for compatibility reasons.
               */
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}
