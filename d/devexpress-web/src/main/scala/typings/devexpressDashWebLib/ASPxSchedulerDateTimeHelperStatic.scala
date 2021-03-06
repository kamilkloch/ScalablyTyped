package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxSchedulerDateTimeHelperStatic extends js.Object {
  /**
    * Adds the specified number of days to a DateTime object and returns the result.
    * @param date A DateTime object to which to add days.
    * @param dayCount The number of days to add.
    */
  def AddDays(date: stdLib.Date, dayCount: scala.Double): stdLib.Date
  /**
    * Adds the specified timespan to a DateTime object and returns the result.
    * @param date A DateTime object to which to add a timespan.
    * @param timeSpan A TimeSpan object specifying the timespan to add.
    */
  def AddTimeSpan(date: stdLib.Date, timeSpan: js.Any): stdLib.Date
  /**
    * Rounds a DateTime value up to the nearest interval.
    * @param date A DateTime object containing a value to round.
    * @param spanInMs A TimeSpan object specifying an interval to which to round.
    */
  def CeilDateTime(date: stdLib.Date, spanInMs: js.Any): stdLib.Date
  /**
    * Returns the day time part of the specified DateTime value.
    * @param date A DateTime object from which to extract the day time.
    */
  def ToDayTime(date: stdLib.Date): js.Any
  /**
    * Returns the date part of the specified DateTime value.
    * @param date A DateTime object from which to extract the date.
    */
  def TruncToDate(date: stdLib.Date): stdLib.Date
}

object ASPxSchedulerDateTimeHelperStatic {
  @scala.inline
  def apply(
    AddDays: (stdLib.Date, scala.Double) => stdLib.Date,
    AddTimeSpan: (stdLib.Date, js.Any) => stdLib.Date,
    CeilDateTime: (stdLib.Date, js.Any) => stdLib.Date,
    ToDayTime: stdLib.Date => js.Any,
    TruncToDate: stdLib.Date => stdLib.Date
  ): ASPxSchedulerDateTimeHelperStatic = {
    val __obj = js.Dynamic.literal(AddDays = js.Any.fromFunction2(AddDays), AddTimeSpan = js.Any.fromFunction2(AddTimeSpan), CeilDateTime = js.Any.fromFunction2(CeilDateTime), ToDayTime = js.Any.fromFunction1(ToDayTime), TruncToDate = js.Any.fromFunction1(TruncToDate))
  
    __obj.asInstanceOf[ASPxSchedulerDateTimeHelperStatic]
  }
}

