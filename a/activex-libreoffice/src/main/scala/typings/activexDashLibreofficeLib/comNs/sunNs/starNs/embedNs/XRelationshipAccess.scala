package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to get access to relationship data.
  *
  * The relationship data is organized as a set of entries. Each of entry is represented by a set of tags, where each tag has unique for this entry name
  * and a string value. An entry must contain at least one tag named "ID", the value of this tag must be unique for the whole set of entries, this tag is
  * used as a unique identifier of an entry.
  */
trait XRelationshipAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves the sequence containing all the entries controlled by the object.
    * @returns sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.Fir
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  val AllRelationships: stdLib.SafeArray[
    stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair]
  ]
  /**
    * allows to clear the set of entries.
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    */
  def clearRelationships(): scala.Unit
  /**
    * retrieves the sequence containing all the entries controlled by the object.
    * @returns sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.Fir
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getAllRelationships(): stdLib.SafeArray[
    stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair]
  ]
  /**
    * retrieves the sequence containing all the tags from the entry with specified value of "ID" tag.
    * @param sID the value of "ID" tag
    * @returns sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.First} represents the tag name and {@link com.sun.sta
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getRelationshipByID(sID: java.lang.String): stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair]
  /**
    * retrieves the sequence containing all the entries which "Type" tag takes the specified value.
    * @param sType specified value of "Type" tag, the parameter can contain an empty string, in this case all the entries that have empty "Type" tag or no suc
    * @returns sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.Fir
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getRelationshipsByType(sType: java.lang.String): stdLib.SafeArray[
    stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair]
  ]
  /**
    * retrieves the value of "Target" tag from the entry with specified "ID" tag.
    *
    * If the entry has no "Target" tag an empty string is returned.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getTargetByID(sID: java.lang.String): java.lang.String
  /**
    * retrieves the value of "Type" tag from the entry with specified "ID" tag.
    *
    * If the entry has no "Type" tag an empty string is returned.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getTypeByID(sID: java.lang.String): java.lang.String
  /**
    * allows to detect whether there is an entry with specified value of "ID" tag.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def hasByID(sID: java.lang.String): scala.Boolean
  /**
    * allows to insert an entry.
    * @param sID the value of "ID" tag
    * @param aEntry a sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.First} represents the tag name and {@link co
    * @param bReplace specifies whether the replacement of existing entry is allowed
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    * @throws com::sun::star::container::ElementExistException in case an element with the specified "ID" tag exists already, and no replacement is allowed
    */
  def insertRelationshipByID(
    sID: java.lang.String,
    aEntry: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair],
    bReplace: scala.Boolean
  ): scala.Unit
  /**
    * allows to insert a set of entries
    * @param aEntries sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.Strin
    * @param bReplace specifies whether the replacement of existing entry is allowed
    * @throws com::sun::star::container::ElementExistException in case an element with the provided "ID" tag exists already, and no replacement is allowed
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    */
  def insertRelationships(
    aEntries: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair]
    ],
    bReplace: scala.Boolean
  ): scala.Unit
  /**
    * allows to remove an entry.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    */
  def removeRelationshipByID(sID: java.lang.String): scala.Unit
}

object XRelationshipAccess {
  @scala.inline
  def apply(
    AllRelationships: stdLib.SafeArray[
      stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair]
    ],
    acquire: () => scala.Unit,
    clearRelationships: () => scala.Unit,
    getAllRelationships: () => stdLib.SafeArray[
      stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair]
    ],
    getRelationshipByID: java.lang.String => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair],
    getRelationshipsByType: java.lang.String => stdLib.SafeArray[
      stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair]
    ],
    getTargetByID: java.lang.String => java.lang.String,
    getTypeByID: java.lang.String => java.lang.String,
    hasByID: java.lang.String => scala.Boolean,
    insertRelationshipByID: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair], scala.Boolean) => scala.Unit,
    insertRelationships: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair]
    ], scala.Boolean) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeRelationshipByID: java.lang.String => scala.Unit
  ): XRelationshipAccess = {
    val __obj = js.Dynamic.literal(AllRelationships = AllRelationships, acquire = js.Any.fromFunction0(acquire), clearRelationships = js.Any.fromFunction0(clearRelationships), getAllRelationships = js.Any.fromFunction0(getAllRelationships), getRelationshipByID = js.Any.fromFunction1(getRelationshipByID), getRelationshipsByType = js.Any.fromFunction1(getRelationshipsByType), getTargetByID = js.Any.fromFunction1(getTargetByID), getTypeByID = js.Any.fromFunction1(getTypeByID), hasByID = js.Any.fromFunction1(hasByID), insertRelationshipByID = js.Any.fromFunction3(insertRelationshipByID), insertRelationships = js.Any.fromFunction2(insertRelationships), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeRelationshipByID = js.Any.fromFunction1(removeRelationshipByID))
  
    __obj.asInstanceOf[XRelationshipAccess]
  }
}

