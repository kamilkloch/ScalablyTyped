package typings
package oraLib.oraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ora extends js.Object {
  /**
  		Change the spinner color.
  		*/
  var color: Color = js.native
  /**
  		Change the spinner indent.
  		*/
  var indent: scala.Double = js.native
  /**
  		A boolean of whether the instance is currently spinning.
  		*/
  val isSpinning: scala.Boolean = js.native
  /**
  		Change the text before the spinner.
  		*/
  var prefixText: java.lang.String = js.native
  /**
  		Change the spinner.
  		*/
  var spinner: cliDashSpinnersLib.cliDashSpinnersMod.SpinnerName | Spinner = js.native
  /**
  		Change the text after the spinner.
  		*/
  var text: java.lang.String = js.native
  /**
  		Clear the spinner.
  		@returns The spinner instance.
  		*/
  def clear(): Ora = js.native
  /**
  		Stop the spinner, change it to a red `✖` and persist the current text, or `text` if provided.
  		@param text - Will persist text if provided.
  		@returns The spinner instance.
  		*/
  def fail(): Ora = js.native
  def fail(text: java.lang.String): Ora = js.native
  /**
  		Get a new frame.
  		@returns The spinner instance.
  		*/
  def frame(): Ora = js.native
  /**
  		Stop the spinner, change it to a blue `ℹ` and persist the current text, or `text` if provided.
  		@param text - Will persist text if provided.
  		@returns The spinner instance.
  		*/
  def info(): Ora = js.native
  def info(text: java.lang.String): Ora = js.native
  /**
  		Manually render a new frame.
  		@returns The spinner instance.
  		*/
  def render(): Ora = js.native
  /**
  		Start the spinner.
  		@param text - Set the current text.
  		@returns The spinner instance.
  		*/
  def start(): Ora = js.native
  def start(text: java.lang.String): Ora = js.native
  /**
  		Stop and clear the spinner.
  		@returns The spinner instance.
  		*/
  def stop(): Ora = js.native
  /**
  		Stop the spinner and change the symbol or text.
  		@returns The spinner instance.
  		*/
  def stopAndPersist(): Ora = js.native
  def stopAndPersist(options: PersistOptions): Ora = js.native
  /**
  		Stop the spinner, change it to a green `✔` and persist the current text, or `text` if provided.
  		@param text - Will persist text if provided.
  		@returns The spinner instance.
  		*/
  def succeed(): Ora = js.native
  def succeed(text: java.lang.String): Ora = js.native
  /**
  		Stop the spinner, change it to a yellow `⚠` and persist the current text, or `text` if provided.
  		@param text - Will persist text if provided.
  		@returns The spinner instance.
  		*/
  def warn(): Ora = js.native
  def warn(text: java.lang.String): Ora = js.native
}

