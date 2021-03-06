package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the interface for binding programmatic names to aliases. Aliases can be provided in several locales for the same programmatic name. */
trait XLocalizedAliases
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** registers an alias for a programmatic name. */
  def bindAlias(
    programmaticName: java.lang.String,
    locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    alias: java.lang.String
  ): scala.Unit
  /**
    * retrieves a list of all registered aliases for a certain language.
    * @param locale specifies the locale scope.
    * @returns a sequence of registered pair of alias and programmatic name.
    */
  def listAliases(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[AliasProgrammaticPair]
  /** retrieves a registered programmatic name identified by an alias. */
  def lookupAlias(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, Alias: java.lang.String): java.lang.String
  /** retrieves a given alias for a programmatic name. */
  def lookupProgrammatic(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, programmatic: java.lang.String): java.lang.String
  /** rebinds all aliases registered to a given {@link URL} to a new one. */
  def rebindAliases(currentProgrammatic: java.lang.String, newProgrammatic: java.lang.String): scala.Unit
  /** renames an alias for a programmatic name. */
  def renameAlias(
    locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    oldName: java.lang.String,
    aNewName: java.lang.String
  ): scala.Unit
  /** revokes an alias for a programmatic name. */
  def unbindAlias(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, alias: java.lang.String): scala.Unit
  /** removes all aliases for a programmatic name. */
  def unbindAliases(programmaticName: java.lang.String): scala.Unit
}

object XLocalizedAliases {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    bindAlias: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String) => scala.Unit,
    listAliases: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[AliasProgrammaticPair],
    lookupAlias: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String) => java.lang.String,
    lookupProgrammatic: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String) => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    rebindAliases: (java.lang.String, java.lang.String) => scala.Unit,
    release: () => scala.Unit,
    renameAlias: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String, java.lang.String) => scala.Unit,
    unbindAlias: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, java.lang.String) => scala.Unit,
    unbindAliases: java.lang.String => scala.Unit
  ): XLocalizedAliases = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), bindAlias = js.Any.fromFunction3(bindAlias), listAliases = js.Any.fromFunction1(listAliases), lookupAlias = js.Any.fromFunction2(lookupAlias), lookupProgrammatic = js.Any.fromFunction2(lookupProgrammatic), queryInterface = js.Any.fromFunction1(queryInterface), rebindAliases = js.Any.fromFunction2(rebindAliases), release = js.Any.fromFunction0(release), renameAlias = js.Any.fromFunction3(renameAlias), unbindAlias = js.Any.fromFunction2(unbindAlias), unbindAliases = js.Any.fromFunction1(unbindAliases))
  
    __obj.asInstanceOf[XLocalizedAliases]
  }
}

