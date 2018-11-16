package typings
package inversifyLib.inversifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify", JSImport.Namespace)
@js.native
object inversifyModMembers extends js.Object {
  val BindingScopeEnum: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.BindingScopeEnum = js.native
  val BindingTypeEnum: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.BindingTypeEnum = js.native
  val METADATA_KEY: js.Any = js.native
  val TargetTypeEnum: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.TargetTypeEnum = js.native
  val multiBindToService: js.Function1[
    /* container */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, 
    js.Function1[
      /* service */ java.lang.String | js.Symbol | inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Newable[js.Any] | inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Abstract[js.Any], 
      js.Function1[
        /* repeated */java.lang.String | js.Symbol | inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Newable[js.Any] | inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Abstract[js.Any], 
        scala.Unit
      ]
    ]
  ] = js.native
  val namedConstraint: js.Function1[
    /* value */ js.Any, 
    inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ConstraintFunction
  ] = js.native
  val taggedConstraint: js.Function1[
    /* key */ stdLib.PropertyKey, 
    js.Function1[
      /* value */ js.Any, 
      inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ConstraintFunction
    ]
  ] = js.native
  val traverseAncerstors: js.Function2[
    /* request */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Request, 
    /* constraint */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ConstraintFunction, 
    scala.Boolean
  ] = js.native
  val typeConstraint: js.Function1[
    /* type */ java.lang.String | js.Function, 
    js.Function1[
      /* request */ inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Request | scala.Null, 
      scala.Boolean
    ]
  ] = js.native
  def decorate(decorator: stdLib.MethodDecorator | stdLib.ParameterDecorator, target: js.Any): scala.Unit = js.native
  def decorate(
    decorator: stdLib.MethodDecorator | stdLib.ParameterDecorator,
    target: js.Any,
    parameterIndex: java.lang.String
  ): scala.Unit = js.native
  def decorate(
    decorator: stdLib.MethodDecorator | stdLib.ParameterDecorator,
    target: js.Any,
    parameterIndex: scala.Double
  ): scala.Unit = js.native
  def decorate(decorator: stdLib.ClassDecorator, target: js.Any): scala.Unit = js.native
  def decorate(decorator: stdLib.ClassDecorator, target: js.Any, parameterIndex: java.lang.String): scala.Unit = js.native
  def decorate(decorator: stdLib.ClassDecorator, target: js.Any, parameterIndex: scala.Double): scala.Unit = js.native
  def getServiceIdentifierAsString(serviceIdentifier: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[_]): java.lang.String = js.native
  def id(): scala.Double = js.native
  def inject(serviceIdentifier: inversifyLib.dtsAnnotationInjectMod.ServiceIdentifierOrFunc): js.Function3[
    /* target */ js.Any, 
    /* targetKey */ java.lang.String, 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  def injectable(): js.Function1[/* target */ js.Any, _] = js.native
  def multiInject(serviceIdentifier: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[_]): js.Function3[
    /* target */ js.Any, 
    /* targetKey */ java.lang.String, 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  def named(name: java.lang.String): js.Function3[
    /* target */ js.Any, 
    /* targetKey */ java.lang.String, 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  def named(name: js.Symbol): js.Function3[
    /* target */ js.Any, 
    /* targetKey */ java.lang.String, 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  def named(name: scala.Double): js.Function3[
    /* target */ js.Any, 
    /* targetKey */ java.lang.String, 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  def optional(): js.Function3[
    /* target */ js.Any, 
    /* targetKey */ java.lang.String, 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  def postConstruct(): js.Function3[
    /* target */ js.Any, 
    /* propertyKey */ java.lang.String, 
    /* descriptor */ stdLib.PropertyDescriptor, 
    scala.Unit
  ] = js.native
  def tagged(metadataKey: java.lang.String, metadataValue: js.Any): js.Function3[
    /* target */ js.Any, 
    /* targetKey */ java.lang.String, 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  def tagged(metadataKey: js.Symbol, metadataValue: js.Any): js.Function3[
    /* target */ js.Any, 
    /* targetKey */ java.lang.String, 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  def tagged(metadataKey: scala.Double, metadataValue: js.Any): js.Function3[
    /* target */ js.Any, 
    /* targetKey */ java.lang.String, 
    /* index */ js.UndefOr[scala.Double], 
    scala.Unit
  ] = js.native
  def targetName(name: java.lang.String): js.Function3[
    /* target */ js.Any, 
    /* targetKey */ java.lang.String, 
    /* index */ scala.Double, 
    scala.Unit
  ] = js.native
  def unmanaged(): js.Function3[
    /* target */ js.Any, 
    /* targetKey */ java.lang.String, 
    /* index */ scala.Double, 
    scala.Unit
  ] = js.native
}
