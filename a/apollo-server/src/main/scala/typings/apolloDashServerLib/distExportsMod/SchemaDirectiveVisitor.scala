package typings
package apolloDashServerLib.distExportsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-server/dist/exports", "SchemaDirectiveVisitor")
@js.native
class SchemaDirectiveVisitor protected ()
  extends graphqlDashToolsLib.graphqlDashToolsMod.SchemaDirectiveVisitor {
  protected def this(config: graphqlDashToolsLib.Anon_Name) = this()
}

@JSImport("apollo-server/dist/exports", "SchemaDirectiveVisitor")
@js.native
object SchemaDirectiveVisitor extends js.Object {
  /* protected */ def getDeclaredDirectives(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    directiveVisitors: ScalablyTyped.runtime.StringDictionary[
      ScalablyTyped.runtime.Instantiable1[
        /* config */ graphqlDashToolsLib.Anon_Name, 
        graphqlDashToolsLib.distSchemaVisitorMod.SchemaDirectiveVisitor
      ]
    ]
  ): ScalablyTyped.runtime.StringDictionary[graphqlLib.graphqlMod.GraphQLDirective] = js.native
  def getDirectiveDeclaration(directiveName: java.lang.String, schema: graphqlLib.graphqlMod.GraphQLSchema): graphqlLib.graphqlMod.GraphQLDirective = js.native
  def visitSchemaDirectives(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    directiveVisitors: ScalablyTyped.runtime.StringDictionary[
      ScalablyTyped.runtime.Instantiable1[
        /* config */ graphqlDashToolsLib.Anon_Name, 
        graphqlDashToolsLib.distSchemaVisitorMod.SchemaDirectiveVisitor
      ]
    ]
  ): ScalablyTyped.runtime.StringDictionary[js.Array[graphqlDashToolsLib.distSchemaVisitorMod.SchemaDirectiveVisitor]] = js.native
  def visitSchemaDirectives(
    schema: graphqlLib.graphqlMod.GraphQLSchema,
    directiveVisitors: ScalablyTyped.runtime.StringDictionary[
      ScalablyTyped.runtime.Instantiable1[
        /* config */ graphqlDashToolsLib.Anon_Name, 
        graphqlDashToolsLib.distSchemaVisitorMod.SchemaDirectiveVisitor
      ]
    ],
    context: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): ScalablyTyped.runtime.StringDictionary[js.Array[graphqlDashToolsLib.distSchemaVisitorMod.SchemaDirectiveVisitor]] = js.native
}
