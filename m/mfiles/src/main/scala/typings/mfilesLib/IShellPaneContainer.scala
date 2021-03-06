package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShellPaneContainer extends js.Object {
  val Content: js.Any
  val Events: IShellPaneContainerEvents
  val IsFocused: scala.Boolean
  var Minimized: scala.Boolean
  val ShellFrame: IShellFrame
  var Size: scala.Double
  val TabTitleSize: scala.Double
  var Visible: scala.Boolean
  def AddTab(TabId: java.lang.String, tabTitle: java.lang.String, insertBeforeTabId: java.lang.String): IShellPaneTab
  def Focus(): scala.Unit
  def GetSelectedTab(): IShellPaneTab
  def GetTab(TabId: java.lang.String): IShellPaneTab
  def SetDefaultSize(defaultSize: scala.Double, resizeToDefault: scala.Boolean): scala.Unit
  def SetDefaultVisibility(Visible: scala.Boolean, resetToDefault: scala.Boolean): scala.Unit
}

object IShellPaneContainer {
  @scala.inline
  def apply(
    AddTab: (java.lang.String, java.lang.String, java.lang.String) => IShellPaneTab,
    Content: js.Any,
    Events: IShellPaneContainerEvents,
    Focus: () => scala.Unit,
    GetSelectedTab: () => IShellPaneTab,
    GetTab: java.lang.String => IShellPaneTab,
    IsFocused: scala.Boolean,
    Minimized: scala.Boolean,
    SetDefaultSize: (scala.Double, scala.Boolean) => scala.Unit,
    SetDefaultVisibility: (scala.Boolean, scala.Boolean) => scala.Unit,
    ShellFrame: IShellFrame,
    Size: scala.Double,
    TabTitleSize: scala.Double,
    Visible: scala.Boolean
  ): IShellPaneContainer = {
    val __obj = js.Dynamic.literal(AddTab = js.Any.fromFunction3(AddTab), Content = Content, Events = Events, Focus = js.Any.fromFunction0(Focus), GetSelectedTab = js.Any.fromFunction0(GetSelectedTab), GetTab = js.Any.fromFunction1(GetTab), IsFocused = IsFocused, Minimized = Minimized, SetDefaultSize = js.Any.fromFunction2(SetDefaultSize), SetDefaultVisibility = js.Any.fromFunction2(SetDefaultVisibility), ShellFrame = ShellFrame, Size = Size, TabTitleSize = TabTitleSize, Visible = Visible)
  
    __obj.asInstanceOf[IShellPaneContainer]
  }
}

