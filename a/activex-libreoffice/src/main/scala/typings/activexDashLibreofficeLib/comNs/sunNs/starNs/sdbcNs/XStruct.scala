package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is used for the standard mapping for a SQL structured type.
  *
  * A `Struct` object contains a value for each attribute of the SQL structured type that it represents. By default, an instance of `Struct` is valid as
  * long as the application has a reference to it.
  */
trait XStruct
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * retrieves the SQL type name of the SQL structured type that this `Struct` object represents.
    * @returns the name of the SQL type.
    * @throws SQLException if a database access error occurs.
    */
  val SQLTypeName: java.lang.String
  /**
    * produces the ordered values of the attributes of the SQL structured type that this `Struct` object represents.
    *
    * This method uses the given type map for customizations of the type mappings. If there is no entry in the given type map that matches or the given type
    * map is `NULL` , the structured type that this `Struct` object represents, the driver uses the connection type mapping.
    * @param typeMap is a map object that contains mappings of SQL type names to services. If the `typeMap` is `NULL` , the type-map associated with the conne
    * @returns an array containing the ordered attribute values.
    * @throws SQLException if a database access error occurs.
    */
  def getAttributes(typeMap: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess): stdLib.SafeArray[_]
  /**
    * retrieves the SQL type name of the SQL structured type that this `Struct` object represents.
    * @returns the name of the SQL type.
    * @throws SQLException if a database access error occurs.
    */
  def getSQLTypeName(): java.lang.String
}

object XStruct {
  @scala.inline
  def apply(
    SQLTypeName: java.lang.String,
    acquire: () => scala.Unit,
    getAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess => stdLib.SafeArray[_],
    getSQLTypeName: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XStruct = {
    val __obj = js.Dynamic.literal(SQLTypeName = SQLTypeName, acquire = js.Any.fromFunction0(acquire), getAttributes = js.Any.fromFunction1(getAttributes), getSQLTypeName = js.Any.fromFunction0(getSQLTypeName), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XStruct]
  }
}

