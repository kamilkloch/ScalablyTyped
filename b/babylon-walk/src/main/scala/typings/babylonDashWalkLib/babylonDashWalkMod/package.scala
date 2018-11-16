package typings
package babylonDashWalkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object babylonDashWalkMod {
  type AncestorStatelessVisitor = js.Function3[
    /* node */ NodeTypes, 
    /* state */ js.Any, 
    /* ancestors */ js.Array[babelDashTypesLib.babelDashTypesMod.Node], 
    scala.Unit
  ]
  type AncestorVisitor = js.Function3[
    /* node */ NodeTypes, 
    /* state */ js.Any, 
    /* ancestors */ js.Array[babelDashTypesLib.babelDashTypesMod.Node], 
    scala.Unit
  ]
  type NodeTypes = coreTypes | es2015Types | flowTypes | jsxTypes | miscTypes
  type RecursiveVisitor = js.Function3[
    /* node */ NodeTypes, 
    /* state */ js.Any, 
    /* next */ js.Function1[/* node */ babelDashTypesLib.babelDashTypesMod.Node, scala.Unit], 
    scala.Unit
  ]
  type SimpleVisitor = js.Function2[/* node */ NodeTypes, /* state */ js.Any, scala.Unit]
  type Visitor = js.Function2[/* commentBlock */ NodeTypes, /* state */ js.Any, scala.Unit]
  type coreTypes = babelDashTypesLib.babelDashTypesMod.ArrayExpression | babelDashTypesLib.babelDashTypesMod.AssignmentExpression | babelDashTypesLib.babelDashTypesMod.BinaryExpression | babelDashTypesLib.babelDashTypesMod.Directive | babelDashTypesLib.babelDashTypesMod.DirectiveLiteral | babelDashTypesLib.babelDashTypesMod.BlockStatement | babelDashTypesLib.babelDashTypesMod.BreakStatement | babelDashTypesLib.babelDashTypesMod.CallExpression | babelDashTypesLib.babelDashTypesMod.CatchClause | babelDashTypesLib.babelDashTypesMod.ConditionalExpression | babelDashTypesLib.babelDashTypesMod.ContinueStatement | babelDashTypesLib.babelDashTypesMod.DebuggerStatement | babelDashTypesLib.babelDashTypesMod.DoWhileStatement | babelDashTypesLib.babelDashTypesMod.EmptyStatement | babelDashTypesLib.babelDashTypesMod.ExpressionStatement | babelDashTypesLib.babelDashTypesMod.File | babelDashTypesLib.babelDashTypesMod.ForInStatement | babelDashTypesLib.babelDashTypesMod.ForStatement | babelDashTypesLib.babelDashTypesMod.FunctionDeclaration | babelDashTypesLib.babelDashTypesMod.FunctionExpression | babelDashTypesLib.babelDashTypesMod.Identifier | babelDashTypesLib.babelDashTypesMod.IfStatement | babelDashTypesLib.babelDashTypesMod.LabeledStatement | babelDashTypesLib.babelDashTypesMod.StringLiteral | babelDashTypesLib.babelDashTypesMod.NumericLiteral | babelDashTypesLib.babelDashTypesMod.NullLiteral | babelDashTypesLib.babelDashTypesMod.BooleanLiteral | babelDashTypesLib.babelDashTypesMod.RegExpLiteral | babelDashTypesLib.babelDashTypesMod.LogicalExpression | babelDashTypesLib.babelDashTypesMod.MemberExpression | babelDashTypesLib.babelDashTypesMod.NewExpression | babelDashTypesLib.babelDashTypesMod.Program | babelDashTypesLib.babelDashTypesMod.ObjectExpression | babelDashTypesLib.babelDashTypesMod.ObjectMethod | babelDashTypesLib.babelDashTypesMod.ObjectProperty | babelDashTypesLib.babelDashTypesMod.RestElement | babelDashTypesLib.babelDashTypesMod.ReturnStatement | babelDashTypesLib.babelDashTypesMod.SequenceExpression | babelDashTypesLib.babelDashTypesMod.SwitchCase | babelDashTypesLib.babelDashTypesMod.SwitchStatement | babelDashTypesLib.babelDashTypesMod.ThisExpression | babelDashTypesLib.babelDashTypesMod.ThrowStatement | babelDashTypesLib.babelDashTypesMod.TryStatement | babelDashTypesLib.babelDashTypesMod.UnaryExpression | babelDashTypesLib.babelDashTypesMod.UpdateExpression | babelDashTypesLib.babelDashTypesMod.VariableDeclaration | babelDashTypesLib.babelDashTypesMod.VariableDeclarator | babelDashTypesLib.babelDashTypesMod.WhileStatement | babelDashTypesLib.babelDashTypesMod.WithStatement
  type es2015Types = babelDashTypesLib.babelDashTypesMod.AssignmentPattern | babelDashTypesLib.babelDashTypesMod.ArrayPattern | babelDashTypesLib.babelDashTypesMod.ArrowFunctionExpression | babelDashTypesLib.babelDashTypesMod.ClassBody | babelDashTypesLib.babelDashTypesMod.ClassDeclaration | babelDashTypesLib.babelDashTypesMod.ClassExpression | babelDashTypesLib.babelDashTypesMod.ExportAllDeclaration | babelDashTypesLib.babelDashTypesMod.ExportDefaultDeclaration | babelDashTypesLib.babelDashTypesMod.ExportNamedDeclaration | babelDashTypesLib.babelDashTypesMod.ExportSpecifier | babelDashTypesLib.babelDashTypesMod.ForOfStatement | babelDashTypesLib.babelDashTypesMod.ImportDeclaration | babelDashTypesLib.babelDashTypesMod.ImportDefaultSpecifier | babelDashTypesLib.babelDashTypesMod.ImportNamespaceSpecifier | babelDashTypesLib.babelDashTypesMod.ImportSpecifier | babelDashTypesLib.babelDashTypesMod.MetaProperty | babelDashTypesLib.babelDashTypesMod.ClassMethod | babelDashTypesLib.babelDashTypesMod.ObjectPattern | babelDashTypesLib.babelDashTypesMod.SpreadElement | babelDashTypesLib.babelDashTypesMod.Super | babelDashTypesLib.babelDashTypesMod.TaggedTemplateExpression | babelDashTypesLib.babelDashTypesMod.TemplateElement | babelDashTypesLib.babelDashTypesMod.TemplateLiteral | babelDashTypesLib.babelDashTypesMod.YieldExpression | babelDashTypesLib.babelDashTypesMod.AwaitExpression | babelDashTypesLib.babelDashTypesMod.BindExpression | babelDashTypesLib.babelDashTypesMod.ClassProperty | babelDashTypesLib.babelDashTypesMod.Decorator | babelDashTypesLib.babelDashTypesMod.DoExpression | babelDashTypesLib.babelDashTypesMod.ExportDefaultSpecifier | babelDashTypesLib.babelDashTypesMod.ExportNamespaceSpecifier
  type flowTypes = babelDashTypesLib.babelDashTypesMod.AnyTypeAnnotation | babelDashTypesLib.babelDashTypesMod.ArrayTypeAnnotation | babelDashTypesLib.babelDashTypesMod.BooleanTypeAnnotation | babelDashTypesLib.babelDashTypesMod.BooleanLiteralTypeAnnotation | babelDashTypesLib.babelDashTypesMod.NullLiteralTypeAnnotation | babelDashTypesLib.babelDashTypesMod.ClassImplements | babelDashTypesLib.babelDashTypesMod.DeclareClass | babelDashTypesLib.babelDashTypesMod.DeclareFunction | babelDashTypesLib.babelDashTypesMod.DeclareInterface | babelDashTypesLib.babelDashTypesMod.DeclareModule | babelDashTypesLib.babelDashTypesMod.DeclareTypeAlias | babelDashTypesLib.babelDashTypesMod.DeclareVariable | babelDashTypesLib.babelDashTypesMod.FunctionTypeAnnotation | babelDashTypesLib.babelDashTypesMod.FunctionTypeParam | babelDashTypesLib.babelDashTypesMod.GenericTypeAnnotation | babelDashTypesLib.babelDashTypesMod.InterfaceExtends | babelDashTypesLib.babelDashTypesMod.InterfaceDeclaration | babelDashTypesLib.babelDashTypesMod.IntersectionTypeAnnotation | babelDashTypesLib.babelDashTypesMod.MixedTypeAnnotation | babelDashTypesLib.babelDashTypesMod.NullableTypeAnnotation | babelDashTypesLib.babelDashTypesMod.NumberTypeAnnotation | babelDashTypesLib.babelDashTypesMod.ObjectTypeAnnotation | babelDashTypesLib.babelDashTypesMod.ObjectTypeCallProperty | babelDashTypesLib.babelDashTypesMod.ObjectTypeIndexer | babelDashTypesLib.babelDashTypesMod.ObjectTypeProperty | babelDashTypesLib.babelDashTypesMod.QualifiedTypeIdentifier | babelDashTypesLib.babelDashTypesMod.StringLiteralTypeAnnotation | babelDashTypesLib.babelDashTypesMod.StringTypeAnnotation | babelDashTypesLib.babelDashTypesMod.ThisTypeAnnotation | babelDashTypesLib.babelDashTypesMod.TupleTypeAnnotation | babelDashTypesLib.babelDashTypesMod.TypeofTypeAnnotation | babelDashTypesLib.babelDashTypesMod.TypeAlias | babelDashTypesLib.babelDashTypesMod.TypeAnnotation | babelDashTypesLib.babelDashTypesMod.TypeCastExpression | babelDashTypesLib.babelDashTypesMod.TypeParameterDeclaration | babelDashTypesLib.babelDashTypesMod.TypeParameterInstantiation | babelDashTypesLib.babelDashTypesMod.UnionTypeAnnotation | babelDashTypesLib.babelDashTypesMod.VoidTypeAnnotation
  type jsxTypes = babelDashTypesLib.babelDashTypesMod.JSXAttribute | babelDashTypesLib.babelDashTypesMod.JSXClosingElement | babelDashTypesLib.babelDashTypesMod.JSXElement | babelDashTypesLib.babelDashTypesMod.JSXEmptyExpression | babelDashTypesLib.babelDashTypesMod.JSXExpressionContainer | babelDashTypesLib.babelDashTypesMod.JSXIdentifier | babelDashTypesLib.babelDashTypesMod.JSXMemberExpression | babelDashTypesLib.babelDashTypesMod.JSXNamespacedName | babelDashTypesLib.babelDashTypesMod.JSXOpeningElement | babelDashTypesLib.babelDashTypesMod.JSXSpreadAttribute | babelDashTypesLib.babelDashTypesMod.JSXText
  type miscTypes = babelDashTypesLib.babelDashTypesMod.Noop | babelDashTypesLib.babelDashTypesMod.ParenthesizedExpression
}