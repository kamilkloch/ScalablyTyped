package typings
package officeDashJsLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * An abstract class that represents the document the add-in is interacting with.
     *
     * @remarks
     * <table><tr><td>Hosts</td><td>Access, Excel, PowerPoint, Project, Word</td></tr></table>
     */
@js.native
trait Document extends js.Object {
  /**
           * Gets an object that provides access to the bindings defined in the document.
           *
           * @remarks
           * You don't instantiate the Document object directly in your script. To call members of the Document object to interact with the current 
           * document or worksheet, use `Office.context.document` in your script.
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this property is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this property.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           */
  var bindings: Bindings = js.native
  /**
           * Gets an object that represents the custom XML parts in the document.
           *
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this property is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this property.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           */
  var customXmlParts: CustomXmlParts = js.native
  /**
           * Gets the mode the document is in.
           *
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this property is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this property.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           */
  var mode: DocumentMode = js.native
  /**
           * Gets an object that represents the saved custom settings of the content or task pane add-in for the current document.
           *
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this property is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this property.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           */
  var settings: Settings = js.native
  /**
           * Gets the URL of the document that the host application currently has open. Returns null if the URL is unavailable.
           *
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this property is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this property.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           */
  var url: java.lang.String = js.native
  /**
           * Adds an event handler for a Document object event.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>DocumentEvents</td></tr></table>
           *
           * You can add multiple event handlers for the specified eventType as long as the name of each event handler function is unique.
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           *
           * @param eventType For a Document object event, the eventType parameter can be specified as `Office.EventType.Document.SelectionChanged` or 
           *                  `Office.EventType.Document.ActiveViewChanged`, or the corresponding text value of this enumeration.
           * @param handler The event handler function to add, whose only parameter is of type {@link Office.DocumentSelectionChangedEventArgs}. Required.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           */
  def addHandlerAsync(eventType: EventType, handler: js.Any): scala.Unit = js.native
  /**
           * Adds an event handler for a Document object event.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>DocumentEvents</td></tr></table>
           *
           * You can add multiple event handlers for the specified eventType as long as the name of each event handler function is unique.
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           *
           * @param eventType For a Document object event, the eventType parameter can be specified as `Office.EventType.Document.SelectionChanged` or 
           *                  `Office.EventType.Document.ActiveViewChanged`, or the corresponding text value of this enumeration.
           * @param handler The event handler function to add, whose only parameter is of type {@link Office.DocumentSelectionChangedEventArgs}. Required.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           */
  def addHandlerAsync(eventType: EventType, handler: js.Any, options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Adds an event handler for a Document object event.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>DocumentEvents</td></tr></table>
           *
           * You can add multiple event handlers for the specified eventType as long as the name of each event handler function is unique.
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           *
           * @param eventType For a Document object event, the eventType parameter can be specified as `Office.EventType.Document.SelectionChanged` or 
           *                  `Office.EventType.Document.ActiveViewChanged`, or the corresponding text value of this enumeration.
           * @param handler The event handler function to add, whose only parameter is of type {@link Office.DocumentSelectionChangedEventArgs}. Required.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           */
  def addHandlerAsync(
    eventType: EventType,
    handler: js.Any,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Returns the state of the current view of the presentation (edit or read).
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>ActiveView</td></tr></table>
           *
           * Can trigger an event when the view changes.
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td>                            </td><td>                            </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td>                            </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           *
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the state of the presentation's current view. 
           *                  The value returned can be either "edit" or "read". "edit" corresponds to any of the views in which you can edit slides, 
           *                  such as Normal or Outline View. "read" corresponds to either Slide Show or Reading View.
          */
  def getActiveViewAsync(): scala.Unit = js.native
  /**
           * Returns the state of the current view of the presentation (edit or read).
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>ActiveView</td></tr></table>
           *
           * Can trigger an event when the view changes.
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td>                            </td><td>                            </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td>                            </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           *
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the state of the presentation's current view. 
           *                  The value returned can be either "edit" or "read". "edit" corresponds to any of the views in which you can edit slides, 
           *                  such as Normal or Outline View. "read" corresponds to either Slide Show or Reading View.
          */
  def getActiveViewAsync(options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Returns the state of the current view of the presentation (edit or read).
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>ActiveView</td></tr></table>
           *
           * Can trigger an event when the view changes.
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td>                            </td><td>                            </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td>                            </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           *
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the state of the presentation's current view. 
           *                  The value returned can be either "edit" or "read". "edit" corresponds to any of the views in which you can edit slides, 
           *                  such as Normal or Outline View. "read" corresponds to either Slide Show or Reading View.
          */
  def getActiveViewAsync(
    options: AsyncContextOptions,
    callback: js.Function1[
      /* result */ AsyncResult[
        officeDashJsLib.officeDashJsLibStrings.edit | officeDashJsLib.officeDashJsLibStrings.read
      ], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
           * Returns the entire document file in slices of up to 4194304 bytes (4 MB). For add-ins for iOS, file slice is supported up to 65536 (64 KB). 
           * Note that specifying file slice size of above permitted limit will result in an "Internal Error" failure.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>File</td></tr></table>
           *
           * For add-ins running in Office host applications other than Office for iOS, the getFileAsync method supports getting files in slices of up 
           * to 4194304 bytes (4 MB). For add-ins running in Office for iOS apps, the getFileAsync method supports getting files in slices of up to 
           * 65536 (64 KB).
           *
           * The fileType parameter can be specified by using the {@link Office.FileType} enumeration or text values. But the possible values vary with 
           * the host:
           *
           * Excel Online, Win32, Mac, and iOS: `Office.FileType.Compressed`
           *
           * PowerPoint on Windows desktop, Mac, and iPad, and PowerPoint Online: `Office.FileType.Compressed`, `Office.FileType.Pdf`
           *
           * Word on Windows desktop, Word on Mac, and Word Online: `Office.FileType.Compressed`, `Office.FileType.Pdf`, `Office.FileType.Text`
           *
           * Word on iPad: `Office.FileType.Compressed`, `Office.FileType.Text`
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           *
           * @param fileType The format in which the file will be returned
           * @param options Provides options for setting the size of slices that the document will be divided into.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the File object.
           */
  def getFileAsync(fileType: FileType): scala.Unit = js.native
  /**
           * Returns the entire document file in slices of up to 4194304 bytes (4 MB). For add-ins for iOS, file slice is supported up to 65536 (64 KB). 
           * Note that specifying file slice size of above permitted limit will result in an "Internal Error" failure.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>File</td></tr></table>
           *
           * For add-ins running in Office host applications other than Office for iOS, the getFileAsync method supports getting files in slices of up 
           * to 4194304 bytes (4 MB). For add-ins running in Office for iOS apps, the getFileAsync method supports getting files in slices of up to 
           * 65536 (64 KB).
           *
           * The fileType parameter can be specified by using the {@link Office.FileType} enumeration or text values. But the possible values vary with 
           * the host:
           *
           * Excel Online, Win32, Mac, and iOS: `Office.FileType.Compressed`
           *
           * PowerPoint on Windows desktop, Mac, and iPad, and PowerPoint Online: `Office.FileType.Compressed`, `Office.FileType.Pdf`
           *
           * Word on Windows desktop, Word on Mac, and Word Online: `Office.FileType.Compressed`, `Office.FileType.Pdf`, `Office.FileType.Text`
           *
           * Word on iPad: `Office.FileType.Compressed`, `Office.FileType.Text`
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           *
           * @param fileType The format in which the file will be returned
           * @param options Provides options for setting the size of slices that the document will be divided into.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the File object.
           */
  def getFileAsync(fileType: FileType, options: GetFileOptions): scala.Unit = js.native
  /**
           * Returns the entire document file in slices of up to 4194304 bytes (4 MB). For add-ins for iOS, file slice is supported up to 65536 (64 KB). 
           * Note that specifying file slice size of above permitted limit will result in an "Internal Error" failure.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>File</td></tr></table>
           *
           * For add-ins running in Office host applications other than Office for iOS, the getFileAsync method supports getting files in slices of up 
           * to 4194304 bytes (4 MB). For add-ins running in Office for iOS apps, the getFileAsync method supports getting files in slices of up to 
           * 65536 (64 KB).
           *
           * The fileType parameter can be specified by using the {@link Office.FileType} enumeration or text values. But the possible values vary with 
           * the host:
           *
           * Excel Online, Win32, Mac, and iOS: `Office.FileType.Compressed`
           *
           * PowerPoint on Windows desktop, Mac, and iPad, and PowerPoint Online: `Office.FileType.Compressed`, `Office.FileType.Pdf`
           *
           * Word on Windows desktop, Word on Mac, and Word Online: `Office.FileType.Compressed`, `Office.FileType.Pdf`, `Office.FileType.Text`
           *
           * Word on iPad: `Office.FileType.Compressed`, `Office.FileType.Text`
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           *
           * @param fileType The format in which the file will be returned
           * @param options Provides options for setting the size of slices that the document will be divided into.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the File object.
           */
  def getFileAsync(
    fileType: FileType,
    options: GetFileOptions,
    callback: js.Function1[/* result */ AsyncResult[File], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Gets file properties of the current document.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Not in a set</td></tr></table>
           *
           * You get the file's URL with the url property `asyncResult.value.url`.
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           *
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the file's properties (with the URL found at `asyncResult.value.url`).
          */
  def getFilePropertiesAsync(): scala.Unit = js.native
  /**
           * Gets file properties of the current document.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Not in a set</td></tr></table>
           *
           * You get the file's URL with the url property `asyncResult.value.url`.
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           *
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the file's properties (with the URL found at `asyncResult.value.url`).
          */
  def getFilePropertiesAsync(options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Gets file properties of the current document.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Not in a set</td></tr></table>
           *
           * You get the file's URL with the url property `asyncResult.value.url`.
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           *
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the file's properties (with the URL found at `asyncResult.value.url`).
          */
  def getFilePropertiesAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[FileProperties], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Get the maximum index of the collection of resources in the current project.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the highest index number in the current project's resource collection.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getMaxResourceIndexAsync(): scala.Unit = js.native
  /**
           * Project documents only. Get the maximum index of the collection of resources in the current project.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the highest index number in the current project's resource collection.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getMaxResourceIndexAsync(options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Project documents only. Get the maximum index of the collection of resources in the current project.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the highest index number in the current project's resource collection.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getMaxResourceIndexAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Double], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Get the maximum index of the collection of tasks in the current project.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the highest index number in the current project's task collection.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getMaxTaskIndexAsync(): scala.Unit = js.native
  /**
           * Project documents only. Get the maximum index of the collection of tasks in the current project.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the highest index number in the current project's task collection.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getMaxTaskIndexAsync(options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Project documents only. Get the maximum index of the collection of tasks in the current project.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the highest index number in the current project's task collection.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getMaxTaskIndexAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Double], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Get Project field (Ex. ProjectWebAccessURL).
           * @param fieldId Project level fields.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the `fieldValue` property, which represents the value of the specified field.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getProjectFieldAsync(fieldId: scala.Double): scala.Unit = js.native
  /**
           * Project documents only. Get Project field (Ex. ProjectWebAccessURL).
           * @param fieldId Project level fields.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the `fieldValue` property, which represents the value of the specified field.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getProjectFieldAsync(fieldId: scala.Double, options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Project documents only. Get Project field (Ex. ProjectWebAccessURL).
           * @param fieldId Project level fields.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the `fieldValue` property, which represents the value of the specified field.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getProjectFieldAsync(
    fieldId: scala.Double,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[_], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Get the GUID of the resource that has the specified index in the resource collection.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceIndex The index of the resource in the collection of resources for the project.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the resource as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getResourceByIndexAsync(resourceIndex: scala.Double): scala.Unit = js.native
  /**
           * Project documents only. Get the GUID of the resource that has the specified index in the resource collection.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceIndex The index of the resource in the collection of resources for the project.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the resource as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getResourceByIndexAsync(resourceIndex: scala.Double, options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Project documents only. Get the GUID of the resource that has the specified index in the resource collection.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceIndex The index of the resource in the collection of resources for the project.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the resource as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getResourceByIndexAsync(
    resourceIndex: scala.Double,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Get resource field for provided resource Id. (Ex.ResourceName)
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the resource as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getResourceFieldAsync(resourceId: java.lang.String, fieldId: scala.Double): scala.Unit = js.native
  /**
           * Project documents only. Get resource field for provided resource Id. (Ex.ResourceName)
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the resource as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getResourceFieldAsync(resourceId: java.lang.String, fieldId: scala.Double, options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Project documents only. Get resource field for provided resource Id. (Ex.ResourceName)
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the resource as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getResourceFieldAsync(
    resourceId: java.lang.String,
    fieldId: scala.Double,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Reads the data contained in the current selection in the document.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Selection</td></tr></table>
           * 
           * In the callback function that is passed to the getSelectedDataAsync method, you can use the properties of the AsyncResult object to return 
           * the following information.
           * 
           * <table>
           *   <tr>
           *     <th>Property</th>
           *     <th>Use to...</th>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.value</td>
           *     <td>Always returns undefined because there is no object or data to retrieve.</td>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.status</td>
           *     <td>Determine the success or failure of the operation.</td>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.error</td>
           *     <td>Access an Error object that provides error information if the operation failed.</td>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.asyncContext</td>
           *     <td>A user-defined item of any type that is returned in the AsyncResult object without being altered.</td>
           *   </tr>
           * </table>
           * 
           * The possible values for the {@link Office.CoercionType} parameter vary by the host. 
           * 
           * <table>
           *   <tr>
           *     <th>Host</th>
           *     <th>Supported coercionType</th>
           *   </tr>
           *   <tr>
           *     <td>Excel, Excel Online, PowerPoint, PowerPoint Online, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Text` (string)</td>
           *   </tr>
           *   <tr>
           *     <td>Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Matrix` (array of arrays)</td>
           *   </tr>
           *   <tr>
           *     <td>Access, Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Table` (TableData object)</td>
           *   </tr>
           *   <tr>
           *     <td>Word</td>
           *     <td>`Office.CoercionType.Html`</td>
           *   </tr>
           *   <tr>
           *     <td>Word and Word Online </td>
           *     <td>`Office.CoercionType.Ooxml` (Office Open XML)</td>
           *   </tr>
           *   <tr>
           *     <td>PowerPoint and PowerPoint Online</td>
           *     <td>`Office.CoercionType.SlideRange`</td>
           *   </tr>
           * </table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           * 
           * @param coercionType The type of data structure to return. See the remarks section for each host's supported coercion types.
           * 
           * @param options Provides options for customizing what data is returned and how it is formatted.
           * 
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the data in the current selection. 
           *                  This is returned in the data structure or format you specified with the coercionType parameter. 
           *                  (See Remarks for more information about data coercion.)
           */
  def getSelectedDataAsync[T](coerciontype: CoercionType): scala.Unit = js.native
  /**
           * Reads the data contained in the current selection in the document.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Selection</td></tr></table>
           * 
           * In the callback function that is passed to the getSelectedDataAsync method, you can use the properties of the AsyncResult object to return 
           * the following information.
           * 
           * <table>
           *   <tr>
           *     <th>Property</th>
           *     <th>Use to...</th>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.value</td>
           *     <td>Always returns undefined because there is no object or data to retrieve.</td>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.status</td>
           *     <td>Determine the success or failure of the operation.</td>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.error</td>
           *     <td>Access an Error object that provides error information if the operation failed.</td>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.asyncContext</td>
           *     <td>A user-defined item of any type that is returned in the AsyncResult object without being altered.</td>
           *   </tr>
           * </table>
           * 
           * The possible values for the {@link Office.CoercionType} parameter vary by the host. 
           * 
           * <table>
           *   <tr>
           *     <th>Host</th>
           *     <th>Supported coercionType</th>
           *   </tr>
           *   <tr>
           *     <td>Excel, Excel Online, PowerPoint, PowerPoint Online, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Text` (string)</td>
           *   </tr>
           *   <tr>
           *     <td>Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Matrix` (array of arrays)</td>
           *   </tr>
           *   <tr>
           *     <td>Access, Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Table` (TableData object)</td>
           *   </tr>
           *   <tr>
           *     <td>Word</td>
           *     <td>`Office.CoercionType.Html`</td>
           *   </tr>
           *   <tr>
           *     <td>Word and Word Online </td>
           *     <td>`Office.CoercionType.Ooxml` (Office Open XML)</td>
           *   </tr>
           *   <tr>
           *     <td>PowerPoint and PowerPoint Online</td>
           *     <td>`Office.CoercionType.SlideRange`</td>
           *   </tr>
           * </table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           * 
           * @param coercionType The type of data structure to return. See the remarks section for each host's supported coercion types.
           * 
           * @param options Provides options for customizing what data is returned and how it is formatted.
           * 
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the data in the current selection. 
           *                  This is returned in the data structure or format you specified with the coercionType parameter. 
           *                  (See Remarks for more information about data coercion.)
           */
  def getSelectedDataAsync[T](coerciontype: CoercionType, options: GetSelectedDataOptions): scala.Unit = js.native
  /**
           * Reads the data contained in the current selection in the document.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Selection</td></tr></table>
           * 
           * In the callback function that is passed to the getSelectedDataAsync method, you can use the properties of the AsyncResult object to return 
           * the following information.
           * 
           * <table>
           *   <tr>
           *     <th>Property</th>
           *     <th>Use to...</th>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.value</td>
           *     <td>Always returns undefined because there is no object or data to retrieve.</td>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.status</td>
           *     <td>Determine the success or failure of the operation.</td>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.error</td>
           *     <td>Access an Error object that provides error information if the operation failed.</td>
           *   </tr>
           *   <tr>
           *     <td>AsyncResult.asyncContext</td>
           *     <td>A user-defined item of any type that is returned in the AsyncResult object without being altered.</td>
           *   </tr>
           * </table>
           * 
           * The possible values for the {@link Office.CoercionType} parameter vary by the host. 
           * 
           * <table>
           *   <tr>
           *     <th>Host</th>
           *     <th>Supported coercionType</th>
           *   </tr>
           *   <tr>
           *     <td>Excel, Excel Online, PowerPoint, PowerPoint Online, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Text` (string)</td>
           *   </tr>
           *   <tr>
           *     <td>Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Matrix` (array of arrays)</td>
           *   </tr>
           *   <tr>
           *     <td>Access, Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Table` (TableData object)</td>
           *   </tr>
           *   <tr>
           *     <td>Word</td>
           *     <td>`Office.CoercionType.Html`</td>
           *   </tr>
           *   <tr>
           *     <td>Word and Word Online </td>
           *     <td>`Office.CoercionType.Ooxml` (Office Open XML)</td>
           *   </tr>
           *   <tr>
           *     <td>PowerPoint and PowerPoint Online</td>
           *     <td>`Office.CoercionType.SlideRange`</td>
           *   </tr>
           * </table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td>                            </td><td> Y                          </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td> Y                          </td><td>                 </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           * 
           * @param coercionType The type of data structure to return. See the remarks section for each host's supported coercion types.
           * 
           * @param options Provides options for customizing what data is returned and how it is formatted.
           * 
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the data in the current selection. 
           *                  This is returned in the data structure or format you specified with the coercionType parameter. 
           *                  (See Remarks for more information about data coercion.)
           */
  def getSelectedDataAsync[T](
    coerciontype: CoercionType,
    options: GetSelectedDataOptions,
    callback: js.Function1[/* result */ AsyncResult[T], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Get the current selected Resource's Id.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the resource as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getSelectedResourceAsync(): scala.Unit = js.native
  /**
           * Project documents only. Get the current selected Resource's Id.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the resource as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getSelectedResourceAsync(options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Project documents only. Get the current selected Resource's Id.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the resource as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getSelectedResourceAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Get the current selected Task's Id.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the resource as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getSelectedTaskAsync(): scala.Unit = js.native
  /**
           * Project documents only. Get the current selected Task's Id.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the resource as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getSelectedTaskAsync(options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Project documents only. Get the current selected Task's Id.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the resource as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getSelectedTaskAsync(
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Get the current selected View Type (Ex. Gantt) and View Name.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the following properties:
           *                  `viewName` - The name of the view, as a ProjectViewTypes constant.
           *                  `viewType` - The type of view, as the integer value of a ProjectViewTypes constant.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getSelectedViewAsync(): scala.Unit = js.native
  /**
           * Project documents only. Get the current selected View Type (Ex. Gantt) and View Name.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the following properties:
           *                  `viewName` - The name of the view, as a ProjectViewTypes constant.
           *                  `viewType` - The type of view, as the integer value of a ProjectViewTypes constant.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getSelectedViewAsync(options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Project documents only. Get the current selected View Type (Ex. Gantt) and View Name.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the following properties:
           *                  `viewName` - The name of the view, as a ProjectViewTypes constant.
           *                  `viewType` - The type of view, as the integer value of a ProjectViewTypes constant.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getSelectedViewAsync(options: AsyncContextOptions, callback: js.Function1[/* result */ AsyncResult[_], scala.Unit]): scala.Unit = js.native
  /**
           * Project documents only. Get the Task Name, WSS Task Id, and ResourceNames for given taskId.
           * @param taskId Either a string or value of the Task Id.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the following properties:
           *                  `taskName` - The name of the task.
           *                  `wssTaskId` - The ID of the task in the synchronized SharePoint task list. If the project is not synchronized with a SharePoint task list, the value is 0.
           *                  `resourceNames` - The comma-separated list of the names of resources that are assigned to the task.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getTaskAsync(taskId: java.lang.String): scala.Unit = js.native
  /**
           * Project documents only. Get the Task Name, WSS Task Id, and ResourceNames for given taskId.
           * @param taskId Either a string or value of the Task Id.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the following properties:
           *                  `taskName` - The name of the task.
           *                  `wssTaskId` - The ID of the task in the synchronized SharePoint task list. If the project is not synchronized with a SharePoint task list, the value is 0.
           *                  `resourceNames` - The comma-separated list of the names of resources that are assigned to the task.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getTaskAsync(taskId: java.lang.String, options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Project documents only. Get the Task Name, WSS Task Id, and ResourceNames for given taskId.
           * @param taskId Either a string or value of the Task Id.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the following properties:
           *                  `taskName` - The name of the task.
           *                  `wssTaskId` - The ID of the task in the synchronized SharePoint task list. If the project is not synchronized with a SharePoint task list, the value is 0.
           *                  `resourceNames` - The comma-separated list of the names of resources that are assigned to the task.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getTaskAsync(
    taskId: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[_], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Get the GUID of the task that has the specified index in the task collection.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskIndex The index of the task in the collection of tasks for the project.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the task as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getTaskByIndexAsync(taskIndex: scala.Double): scala.Unit = js.native
  /**
           * Project documents only. Get the GUID of the task that has the specified index in the task collection.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskIndex The index of the task in the collection of tasks for the project.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the task as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getTaskByIndexAsync(taskIndex: scala.Double, options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Project documents only. Get the GUID of the task that has the specified index in the task collection.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskIndex The index of the task in the collection of tasks for the project.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the GUID of the task as a string.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getTaskByIndexAsync(
    taskIndex: scala.Double,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Get task field for provided task Id. (Ex. StartDate).
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the `fieldValue` property, which represents the value of the specified field.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getTaskFieldAsync(taskId: java.lang.String, fieldId: scala.Double): scala.Unit = js.native
  /**
           * Project documents only. Get task field for provided task Id. (Ex. StartDate).
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the `fieldValue` property, which represents the value of the specified field.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getTaskFieldAsync(taskId: java.lang.String, fieldId: scala.Double, options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Project documents only. Get task field for provided task Id. (Ex. StartDate).
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the `fieldValue` property, which represents the value of the specified field.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getTaskFieldAsync(
    taskId: java.lang.String,
    fieldId: scala.Double,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[_], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Get the WSS Url and list name for the Tasks List, the MPP is synced too.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the following properties:
           *                  `listName` - the name of the synchronized SharePoint task list.
           *                  `serverUrl` - the URL of the synchronized SharePoint task list.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getWSSUrlAsync(): scala.Unit = js.native
  /**
           * Project documents only. Get the WSS Url and list name for the Tasks List, the MPP is synced too.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the following properties:
           *                  `listName` - the name of the synchronized SharePoint task list.
           *                  `serverUrl` - the URL of the synchronized SharePoint task list.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getWSSUrlAsync(options: AsyncContextOptions): scala.Unit = js.native
  /**
           * Project documents only. Get the WSS Url and list name for the Tasks List, the MPP is synced too.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result contains the following properties:
           *                  `listName` - the name of the synchronized SharePoint task list.
           *                  `serverUrl` - the URL of the synchronized SharePoint task list.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def getWSSUrlAsync(options: AsyncContextOptions, callback: js.Function1[/* result */ AsyncResult[_], scala.Unit]): scala.Unit = js.native
  /**
           * Goes to the specified object or location in the document.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>not in a set</td></tr></table>
           *
           * PowerPoint doesn't support the goToByIdAsync method in Master Views.
           *
           * The behavior caused by the selectionMode option varies by host:
           *
           * In Excel: `Office.SelectionMode.Selected` selects all content in the binding, or named item. Office.SelectionMode.None for text bindings, 
           * selects the cell; for matrix bindings, table bindings, and named items, selects the first data cell (not first cell in header row for tables).
           *
           * In PowerPoint: `Office.SelectionMode.Selected` selects the slide title or first textbox on the slide. 
           * `Office.SelectionMode.None` doesn't select anything.
           *
           * In Word: `Office.SelectionMode.Selected` selects all content in the binding. Office.SelectionMode.None for text bindings, moves the cursor 
           * to the beginning of the text; for matrix bindings and table bindings, selects the first data cell (not first cell in header row for tables).
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           *
           * @param id The identifier of the object or location to go to.
           * @param goToType The type of the location to go to.
           * @param options Provides options for whether to select the location that is navigated to.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the current view.
           */
  def goToByIdAsync(id: java.lang.String, goToType: GoToType): scala.Unit = js.native
  /**
           * Goes to the specified object or location in the document.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>not in a set</td></tr></table>
           *
           * PowerPoint doesn't support the goToByIdAsync method in Master Views.
           *
           * The behavior caused by the selectionMode option varies by host:
           *
           * In Excel: `Office.SelectionMode.Selected` selects all content in the binding, or named item. Office.SelectionMode.None for text bindings, 
           * selects the cell; for matrix bindings, table bindings, and named items, selects the first data cell (not first cell in header row for tables).
           *
           * In PowerPoint: `Office.SelectionMode.Selected` selects the slide title or first textbox on the slide. 
           * `Office.SelectionMode.None` doesn't select anything.
           *
           * In Word: `Office.SelectionMode.Selected` selects all content in the binding. Office.SelectionMode.None for text bindings, moves the cursor 
           * to the beginning of the text; for matrix bindings and table bindings, selects the first data cell (not first cell in header row for tables).
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           *
           * @param id The identifier of the object or location to go to.
           * @param goToType The type of the location to go to.
           * @param options Provides options for whether to select the location that is navigated to.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the current view.
           */
  def goToByIdAsync(id: java.lang.String, goToType: GoToType, options: GoToByIdOptions): scala.Unit = js.native
  /**
           * Goes to the specified object or location in the document.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>not in a set</td></tr></table>
           *
           * PowerPoint doesn't support the goToByIdAsync method in Master Views.
           *
           * The behavior caused by the selectionMode option varies by host:
           *
           * In Excel: `Office.SelectionMode.Selected` selects all content in the binding, or named item. Office.SelectionMode.None for text bindings, 
           * selects the cell; for matrix bindings, table bindings, and named items, selects the first data cell (not first cell in header row for tables).
           *
           * In PowerPoint: `Office.SelectionMode.Selected` selects the slide title or first textbox on the slide. 
           * `Office.SelectionMode.None` doesn't select anything.
           *
           * In Word: `Office.SelectionMode.Selected` selects all content in the binding. Office.SelectionMode.None for text bindings, moves the cursor 
           * to the beginning of the text; for matrix bindings and table bindings, selects the first data cell (not first cell in header row for tables).
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           *
           * @param id The identifier of the object or location to go to.
           * @param goToType The type of the location to go to.
           * @param options Provides options for whether to select the location that is navigated to.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the current view.
           */
  def goToByIdAsync(
    id: java.lang.String,
    goToType: GoToType,
    options: GoToByIdOptions,
    callback: js.Function1[/* result */ AsyncResult[_], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Goes to the specified object or location in the document.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>not in a set</td></tr></table>
           *
           * PowerPoint doesn't support the goToByIdAsync method in Master Views.
           *
           * The behavior caused by the selectionMode option varies by host:
           *
           * In Excel: `Office.SelectionMode.Selected` selects all content in the binding, or named item. Office.SelectionMode.None for text bindings, 
           * selects the cell; for matrix bindings, table bindings, and named items, selects the first data cell (not first cell in header row for tables).
           *
           * In PowerPoint: `Office.SelectionMode.Selected` selects the slide title or first textbox on the slide. 
           * `Office.SelectionMode.None` doesn't select anything.
           *
           * In Word: `Office.SelectionMode.Selected` selects all content in the binding. Office.SelectionMode.None for text bindings, moves the cursor 
           * to the beginning of the text; for matrix bindings and table bindings, selects the first data cell (not first cell in header row for tables).
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           *
           * @param id The identifier of the object or location to go to.
           * @param goToType The type of the location to go to.
           * @param options Provides options for whether to select the location that is navigated to.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the current view.
           */
  def goToByIdAsync(id: scala.Double, goToType: GoToType): scala.Unit = js.native
  /**
           * Goes to the specified object or location in the document.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>not in a set</td></tr></table>
           *
           * PowerPoint doesn't support the goToByIdAsync method in Master Views.
           *
           * The behavior caused by the selectionMode option varies by host:
           *
           * In Excel: `Office.SelectionMode.Selected` selects all content in the binding, or named item. Office.SelectionMode.None for text bindings, 
           * selects the cell; for matrix bindings, table bindings, and named items, selects the first data cell (not first cell in header row for tables).
           *
           * In PowerPoint: `Office.SelectionMode.Selected` selects the slide title or first textbox on the slide. 
           * `Office.SelectionMode.None` doesn't select anything.
           *
           * In Word: `Office.SelectionMode.Selected` selects all content in the binding. Office.SelectionMode.None for text bindings, moves the cursor 
           * to the beginning of the text; for matrix bindings and table bindings, selects the first data cell (not first cell in header row for tables).
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           *
           * @param id The identifier of the object or location to go to.
           * @param goToType The type of the location to go to.
           * @param options Provides options for whether to select the location that is navigated to.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the current view.
           */
  def goToByIdAsync(id: scala.Double, goToType: GoToType, options: GoToByIdOptions): scala.Unit = js.native
  /**
           * Goes to the specified object or location in the document.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>not in a set</td></tr></table>
           *
           * PowerPoint doesn't support the goToByIdAsync method in Master Views.
           *
           * The behavior caused by the selectionMode option varies by host:
           *
           * In Excel: `Office.SelectionMode.Selected` selects all content in the binding, or named item. Office.SelectionMode.None for text bindings, 
           * selects the cell; for matrix bindings, table bindings, and named items, selects the first data cell (not first cell in header row for tables).
           *
           * In PowerPoint: `Office.SelectionMode.Selected` selects the slide title or first textbox on the slide. 
           * `Office.SelectionMode.None` doesn't select anything.
           *
           * In Word: `Office.SelectionMode.Selected` selects all content in the binding. Office.SelectionMode.None for text bindings, moves the cursor 
           * to the beginning of the text; for matrix bindings and table bindings, selects the first data cell (not first cell in header row for tables).
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td>                            </td><td> Y               </td></tr>
           *  </table>
           *
           * @param id The identifier of the object or location to go to.
           * @param goToType The type of the location to go to.
           * @param options Provides options for whether to select the location that is navigated to.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The `value` property of the result is the current view.
           */
  def goToByIdAsync(
    id: scala.Double,
    goToType: GoToType,
    options: GoToByIdOptions,
    callback: js.Function1[/* result */ AsyncResult[_], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Removes an event handler for the specified event type.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>DocumentEvents</td></tr></table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           *
           * @param eventType The event type. For document can be 'Document.SelectionChanged' or 'Document.ActiveViewChanged'.
           * @param options Provides options to determine which event handler or handlers are removed.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           */
  def removeHandlerAsync(eventType: EventType): scala.Unit = js.native
  /**
           * Removes an event handler for the specified event type.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>DocumentEvents</td></tr></table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           *
           * @param eventType The event type. For document can be 'Document.SelectionChanged' or 'Document.ActiveViewChanged'.
           * @param options Provides options to determine which event handler or handlers are removed.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           */
  def removeHandlerAsync(eventType: EventType, options: RemoveHandlerOptions): scala.Unit = js.native
  /**
           * Removes an event handler for the specified event type.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>DocumentEvents</td></tr></table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           *
           * @param eventType The event type. For document can be 'Document.SelectionChanged' or 'Document.ActiveViewChanged'.
           * @param options Provides options to determine which event handler or handlers are removed.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           */
  def removeHandlerAsync(
    eventType: EventType,
    options: RemoveHandlerOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Set resource field for specified resource Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setResourceFieldAsync(resourceId: java.lang.String, fieldId: scala.Double, fieldValue: java.lang.String): scala.Unit = js.native
  /**
           * Project documents only. Set resource field for specified resource Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setResourceFieldAsync(
    resourceId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: java.lang.String,
    options: AsyncContextOptions
  ): scala.Unit = js.native
  /**
           * Project documents only. Set resource field for specified resource Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setResourceFieldAsync(
    resourceId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Set resource field for specified resource Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setResourceFieldAsync(resourceId: java.lang.String, fieldId: scala.Double, fieldValue: js.Object): scala.Unit = js.native
  /**
           * Project documents only. Set resource field for specified resource Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setResourceFieldAsync(
    resourceId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: js.Object,
    options: AsyncContextOptions
  ): scala.Unit = js.native
  /**
           * Project documents only. Set resource field for specified resource Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setResourceFieldAsync(
    resourceId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: js.Object,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Set resource field for specified resource Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setResourceFieldAsync(resourceId: java.lang.String, fieldId: scala.Double, fieldValue: scala.Boolean): scala.Unit = js.native
  /**
           * Project documents only. Set resource field for specified resource Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setResourceFieldAsync(
    resourceId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: scala.Boolean,
    options: AsyncContextOptions
  ): scala.Unit = js.native
  /**
           * Project documents only. Set resource field for specified resource Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setResourceFieldAsync(
    resourceId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: scala.Boolean,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Set resource field for specified resource Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setResourceFieldAsync(resourceId: java.lang.String, fieldId: scala.Double, fieldValue: scala.Double): scala.Unit = js.native
  /**
           * Project documents only. Set resource field for specified resource Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setResourceFieldAsync(
    resourceId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: scala.Double,
    options: AsyncContextOptions
  ): scala.Unit = js.native
  /**
           * Project documents only. Set resource field for specified resource Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param resourceId Either a string or value of the Resource Id.
           * @param fieldId Resource Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setResourceFieldAsync(
    resourceId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: scala.Double,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Writes the specified data into the current selection.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Selection</td></tr></table>
           * 
           * **Application-specific behaviors**
           * 
           * The following application-specific actions apply when writing data to a selection.
           * 
           * <table>
           * <tr><td>Word</td><td>If there is no selection and the insertion point is at a valid location, the specified `data` is inserted at the insertion point</td><td>If `data` is a string, the specified text is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix") or a TableData object, a new Word table is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is HTML, the specified HTML is inserted. (Important: If any of the HTML you insert is invalid, Word won't raise an error. Word will insert as much of the HTML as it can and omits any invalid data).</td></tr>
           * <tr><td></td><td></td><td>If `data` is Office Open XML, the specified XML is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a base64 encoded image stream, the specified image is inserted.</td></tr></td></tr>
           * <tr><td></td><td>If there is a selection</td><td>It will be replaced with the specified `data` following the same rules as above.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are placed inline. The imageLeft and imageTop parameters are ignored. The image aspect ratio is always locked. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * 
           * <tr><td>Excel</td><td>If a single cell is selected</td><td>If `data` is a string, the specified text is inserted as the value of the current cell.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix"), the specified set of rows and columns are inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a TableData object, a new Excel table with the specified set of rows and headers is inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td>If multiple cells are selected</td><td>If the shape does not match the shape of `data`, an error is returned.</td></tr>
           * <tr><td></td><td></td><td>If the shape of the selection exactly matches the shape of `data`, the values of the selected cells are updated based on the values in `data`.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are relative to currently selected cell(s). Negative imageLeft and imageTop values are allowed and possibly readjusted by Excel to position the image inside a worksheet. Image aspect ratio is locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * <tr><td></td><td>All other cases</td><td>An error is returned.</td></tr>
           * 
           * <tr><td>Excel Online</td><td>In addition to the behaviors described for Excel above, these limits apply when writing data in Excel Online</td><td>The total number of cells you can write to a worksheet with the `data` parameter can't exceed 20,000 in a single call to this method.</td></tr>
           * <tr><td></td><td></td><td>The number of formatting groups passed to the `cellFormat` parameter can't exceed 100. A single formatting group consists of a set of formatting applied to a specified range of cells.</td></tr>
           * 
           * <tr><td>PowerPoint</td><td>Insert image</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are optional but if provided, both should be present. If a single value is provided, it will be ignored. Negative imageLeft and imageTop values are allowed and can position an image outside of a slide. If no optional parameter is given and slide has a placeholder, the image will replace the placeholder in the slide. Image aspect ratio will be locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * </table>
           * 
           * The possible values for the {@link Office.CoercionType} parameter vary by the host. 
           * 
           * <table>
           *   <tr>
           *     <th>Host</th>
           *     <th>Supported coercionType</th>
           *   </tr>
           *   <tr>
           *     <td>Excel, Excel Online, PowerPoint, PowerPoint Online, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Text` (string)</td>
           *   </tr>
           *   <tr>
           *     <td>Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Matrix` (array of arrays)</td>
           *   </tr>
           *   <tr>
           *     <td>Access, Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Table` (TableData object)</td>
           *   </tr>
           *   <tr>
           *     <td>Word</td>
           *     <td>`Office.CoercionType.Html`</td>
           *   </tr>
           *   <tr>
           *     <td>Word and Word Online </td>
           *     <td>`Office.CoercionType.Ooxml` (Office Open XML)</td>
           *   </tr>
           *   <tr>
           *     <td>PowerPoint and PowerPoint Online</td>
           *     <td>`Office.CoercionType.SlideRange`</td>
           *   </tr>
           * </table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td> y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           * 
           * @param data The data to be set. Either a string or  {@link Office.CoercionType} value, 2d array or TableData object.
           * 
           * If the value passed for `data` is:
           * 
           * - A string: Plain text or anything that can be coerced to a string will be inserted. 
           * In Excel, you can also specify data as a valid formula to add that formula to the selected cell. For example, setting data to "=SUM(A1:A5)" 
           * will total the values in the specified range. However, when you set a formula on the bound cell, after doing so, you can't read the added 
           * formula (or any pre-existing formula) from the bound cell. If you call the Document.getSelectedDataAsync method on the selected cell to 
           * read its data, the method can return only the data displayed in the cell (the formula's result).
           * 
           * - An array of arrays ("matrix"): Tabular data without headers will be inserted. For example, to write data to three rows in two columns, 
           * you can pass an array like this: [["R1C1", "R1C2"], ["R2C1", "R2C2"], ["R3C1", "R3C2"]]. To write a single column of three rows, pass an 
           * array like this: [["R1C1"], ["R2C1"], ["R3C1"]]
           * 
           * In Excel, you can also specify data as an array of arrays that contains valid formulas to add them to the selected cells. For example if no 
           * other data will be overwritten, setting data to [["=SUM(A1:A5)","=AVERAGE(A1:A5)"]] will add those two formulas to the selection. Just as 
           * when setting a formula on a single cell as "text", you can't read the added formulas (or any pre-existing formulas) after they have been 
           * set - you can only read the formulas' results.
           * 
           * - A TableData object: A table with headers will be inserted.
           * In Excel, if you specify formulas in the TableData object you pass for the data parameter, you might not get the results you expect due to 
           * the "calculated columns" feature of Excel, which automatically duplicates formulas within a column. To work around this when you want to 
           * write `data` that contains formulas to a selected table, try specifying the data as an array of arrays (instead of a TableData object), and 
           * specify the coercionType as Microsoft.Office.Matrix or "matrix".
           * 
           * @param options Provides options for how to insert data to the selection.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The AsyncResult.value property always returns undefined because there is no object or data to retrieve.
           */
  def setSelectedDataAsync(data: java.lang.String): scala.Unit = js.native
  /**
           * Writes the specified data into the current selection.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Selection</td></tr></table>
           * 
           * **Application-specific behaviors**
           * 
           * The following application-specific actions apply when writing data to a selection.
           * 
           * <table>
           * <tr><td>Word</td><td>If there is no selection and the insertion point is at a valid location, the specified `data` is inserted at the insertion point</td><td>If `data` is a string, the specified text is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix") or a TableData object, a new Word table is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is HTML, the specified HTML is inserted. (Important: If any of the HTML you insert is invalid, Word won't raise an error. Word will insert as much of the HTML as it can and omits any invalid data).</td></tr>
           * <tr><td></td><td></td><td>If `data` is Office Open XML, the specified XML is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a base64 encoded image stream, the specified image is inserted.</td></tr></td></tr>
           * <tr><td></td><td>If there is a selection</td><td>It will be replaced with the specified `data` following the same rules as above.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are placed inline. The imageLeft and imageTop parameters are ignored. The image aspect ratio is always locked. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * 
           * <tr><td>Excel</td><td>If a single cell is selected</td><td>If `data` is a string, the specified text is inserted as the value of the current cell.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix"), the specified set of rows and columns are inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a TableData object, a new Excel table with the specified set of rows and headers is inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td>If multiple cells are selected</td><td>If the shape does not match the shape of `data`, an error is returned.</td></tr>
           * <tr><td></td><td></td><td>If the shape of the selection exactly matches the shape of `data`, the values of the selected cells are updated based on the values in `data`.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are relative to currently selected cell(s). Negative imageLeft and imageTop values are allowed and possibly readjusted by Excel to position the image inside a worksheet. Image aspect ratio is locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * <tr><td></td><td>All other cases</td><td>An error is returned.</td></tr>
           * 
           * <tr><td>Excel Online</td><td>In addition to the behaviors described for Excel above, these limits apply when writing data in Excel Online</td><td>The total number of cells you can write to a worksheet with the `data` parameter can't exceed 20,000 in a single call to this method.</td></tr>
           * <tr><td></td><td></td><td>The number of formatting groups passed to the `cellFormat` parameter can't exceed 100. A single formatting group consists of a set of formatting applied to a specified range of cells.</td></tr>
           * 
           * <tr><td>PowerPoint</td><td>Insert image</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are optional but if provided, both should be present. If a single value is provided, it will be ignored. Negative imageLeft and imageTop values are allowed and can position an image outside of a slide. If no optional parameter is given and slide has a placeholder, the image will replace the placeholder in the slide. Image aspect ratio will be locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * </table>
           * 
           * The possible values for the {@link Office.CoercionType} parameter vary by the host. 
           * 
           * <table>
           *   <tr>
           *     <th>Host</th>
           *     <th>Supported coercionType</th>
           *   </tr>
           *   <tr>
           *     <td>Excel, Excel Online, PowerPoint, PowerPoint Online, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Text` (string)</td>
           *   </tr>
           *   <tr>
           *     <td>Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Matrix` (array of arrays)</td>
           *   </tr>
           *   <tr>
           *     <td>Access, Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Table` (TableData object)</td>
           *   </tr>
           *   <tr>
           *     <td>Word</td>
           *     <td>`Office.CoercionType.Html`</td>
           *   </tr>
           *   <tr>
           *     <td>Word and Word Online </td>
           *     <td>`Office.CoercionType.Ooxml` (Office Open XML)</td>
           *   </tr>
           *   <tr>
           *     <td>PowerPoint and PowerPoint Online</td>
           *     <td>`Office.CoercionType.SlideRange`</td>
           *   </tr>
           * </table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td> y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           * 
           * @param data The data to be set. Either a string or  {@link Office.CoercionType} value, 2d array or TableData object.
           * 
           * If the value passed for `data` is:
           * 
           * - A string: Plain text or anything that can be coerced to a string will be inserted. 
           * In Excel, you can also specify data as a valid formula to add that formula to the selected cell. For example, setting data to "=SUM(A1:A5)" 
           * will total the values in the specified range. However, when you set a formula on the bound cell, after doing so, you can't read the added 
           * formula (or any pre-existing formula) from the bound cell. If you call the Document.getSelectedDataAsync method on the selected cell to 
           * read its data, the method can return only the data displayed in the cell (the formula's result).
           * 
           * - An array of arrays ("matrix"): Tabular data without headers will be inserted. For example, to write data to three rows in two columns, 
           * you can pass an array like this: [["R1C1", "R1C2"], ["R2C1", "R2C2"], ["R3C1", "R3C2"]]. To write a single column of three rows, pass an 
           * array like this: [["R1C1"], ["R2C1"], ["R3C1"]]
           * 
           * In Excel, you can also specify data as an array of arrays that contains valid formulas to add them to the selected cells. For example if no 
           * other data will be overwritten, setting data to [["=SUM(A1:A5)","=AVERAGE(A1:A5)"]] will add those two formulas to the selection. Just as 
           * when setting a formula on a single cell as "text", you can't read the added formulas (or any pre-existing formulas) after they have been 
           * set - you can only read the formulas' results.
           * 
           * - A TableData object: A table with headers will be inserted.
           * In Excel, if you specify formulas in the TableData object you pass for the data parameter, you might not get the results you expect due to 
           * the "calculated columns" feature of Excel, which automatically duplicates formulas within a column. To work around this when you want to 
           * write `data` that contains formulas to a selected table, try specifying the data as an array of arrays (instead of a TableData object), and 
           * specify the coercionType as Microsoft.Office.Matrix or "matrix".
           * 
           * @param options Provides options for how to insert data to the selection.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The AsyncResult.value property always returns undefined because there is no object or data to retrieve.
           */
  def setSelectedDataAsync(data: java.lang.String, options: SetSelectedDataOptions): scala.Unit = js.native
  /**
           * Writes the specified data into the current selection.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Selection</td></tr></table>
           * 
           * **Application-specific behaviors**
           * 
           * The following application-specific actions apply when writing data to a selection.
           * 
           * <table>
           * <tr><td>Word</td><td>If there is no selection and the insertion point is at a valid location, the specified `data` is inserted at the insertion point</td><td>If `data` is a string, the specified text is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix") or a TableData object, a new Word table is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is HTML, the specified HTML is inserted. (Important: If any of the HTML you insert is invalid, Word won't raise an error. Word will insert as much of the HTML as it can and omits any invalid data).</td></tr>
           * <tr><td></td><td></td><td>If `data` is Office Open XML, the specified XML is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a base64 encoded image stream, the specified image is inserted.</td></tr></td></tr>
           * <tr><td></td><td>If there is a selection</td><td>It will be replaced with the specified `data` following the same rules as above.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are placed inline. The imageLeft and imageTop parameters are ignored. The image aspect ratio is always locked. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * 
           * <tr><td>Excel</td><td>If a single cell is selected</td><td>If `data` is a string, the specified text is inserted as the value of the current cell.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix"), the specified set of rows and columns are inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a TableData object, a new Excel table with the specified set of rows and headers is inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td>If multiple cells are selected</td><td>If the shape does not match the shape of `data`, an error is returned.</td></tr>
           * <tr><td></td><td></td><td>If the shape of the selection exactly matches the shape of `data`, the values of the selected cells are updated based on the values in `data`.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are relative to currently selected cell(s). Negative imageLeft and imageTop values are allowed and possibly readjusted by Excel to position the image inside a worksheet. Image aspect ratio is locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * <tr><td></td><td>All other cases</td><td>An error is returned.</td></tr>
           * 
           * <tr><td>Excel Online</td><td>In addition to the behaviors described for Excel above, these limits apply when writing data in Excel Online</td><td>The total number of cells you can write to a worksheet with the `data` parameter can't exceed 20,000 in a single call to this method.</td></tr>
           * <tr><td></td><td></td><td>The number of formatting groups passed to the `cellFormat` parameter can't exceed 100. A single formatting group consists of a set of formatting applied to a specified range of cells.</td></tr>
           * 
           * <tr><td>PowerPoint</td><td>Insert image</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are optional but if provided, both should be present. If a single value is provided, it will be ignored. Negative imageLeft and imageTop values are allowed and can position an image outside of a slide. If no optional parameter is given and slide has a placeholder, the image will replace the placeholder in the slide. Image aspect ratio will be locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * </table>
           * 
           * The possible values for the {@link Office.CoercionType} parameter vary by the host. 
           * 
           * <table>
           *   <tr>
           *     <th>Host</th>
           *     <th>Supported coercionType</th>
           *   </tr>
           *   <tr>
           *     <td>Excel, Excel Online, PowerPoint, PowerPoint Online, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Text` (string)</td>
           *   </tr>
           *   <tr>
           *     <td>Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Matrix` (array of arrays)</td>
           *   </tr>
           *   <tr>
           *     <td>Access, Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Table` (TableData object)</td>
           *   </tr>
           *   <tr>
           *     <td>Word</td>
           *     <td>`Office.CoercionType.Html`</td>
           *   </tr>
           *   <tr>
           *     <td>Word and Word Online </td>
           *     <td>`Office.CoercionType.Ooxml` (Office Open XML)</td>
           *   </tr>
           *   <tr>
           *     <td>PowerPoint and PowerPoint Online</td>
           *     <td>`Office.CoercionType.SlideRange`</td>
           *   </tr>
           * </table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td> y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           * 
           * @param data The data to be set. Either a string or  {@link Office.CoercionType} value, 2d array or TableData object.
           * 
           * If the value passed for `data` is:
           * 
           * - A string: Plain text or anything that can be coerced to a string will be inserted. 
           * In Excel, you can also specify data as a valid formula to add that formula to the selected cell. For example, setting data to "=SUM(A1:A5)" 
           * will total the values in the specified range. However, when you set a formula on the bound cell, after doing so, you can't read the added 
           * formula (or any pre-existing formula) from the bound cell. If you call the Document.getSelectedDataAsync method on the selected cell to 
           * read its data, the method can return only the data displayed in the cell (the formula's result).
           * 
           * - An array of arrays ("matrix"): Tabular data without headers will be inserted. For example, to write data to three rows in two columns, 
           * you can pass an array like this: [["R1C1", "R1C2"], ["R2C1", "R2C2"], ["R3C1", "R3C2"]]. To write a single column of three rows, pass an 
           * array like this: [["R1C1"], ["R2C1"], ["R3C1"]]
           * 
           * In Excel, you can also specify data as an array of arrays that contains valid formulas to add them to the selected cells. For example if no 
           * other data will be overwritten, setting data to [["=SUM(A1:A5)","=AVERAGE(A1:A5)"]] will add those two formulas to the selection. Just as 
           * when setting a formula on a single cell as "text", you can't read the added formulas (or any pre-existing formulas) after they have been 
           * set - you can only read the formulas' results.
           * 
           * - A TableData object: A table with headers will be inserted.
           * In Excel, if you specify formulas in the TableData object you pass for the data parameter, you might not get the results you expect due to 
           * the "calculated columns" feature of Excel, which automatically duplicates formulas within a column. To work around this when you want to 
           * write `data` that contains formulas to a selected table, try specifying the data as an array of arrays (instead of a TableData object), and 
           * specify the coercionType as Microsoft.Office.Matrix or "matrix".
           * 
           * @param options Provides options for how to insert data to the selection.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The AsyncResult.value property always returns undefined because there is no object or data to retrieve.
           */
  def setSelectedDataAsync(
    data: java.lang.String,
    options: SetSelectedDataOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Writes the specified data into the current selection.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Selection</td></tr></table>
           * 
           * **Application-specific behaviors**
           * 
           * The following application-specific actions apply when writing data to a selection.
           * 
           * <table>
           * <tr><td>Word</td><td>If there is no selection and the insertion point is at a valid location, the specified `data` is inserted at the insertion point</td><td>If `data` is a string, the specified text is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix") or a TableData object, a new Word table is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is HTML, the specified HTML is inserted. (Important: If any of the HTML you insert is invalid, Word won't raise an error. Word will insert as much of the HTML as it can and omits any invalid data).</td></tr>
           * <tr><td></td><td></td><td>If `data` is Office Open XML, the specified XML is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a base64 encoded image stream, the specified image is inserted.</td></tr></td></tr>
           * <tr><td></td><td>If there is a selection</td><td>It will be replaced with the specified `data` following the same rules as above.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are placed inline. The imageLeft and imageTop parameters are ignored. The image aspect ratio is always locked. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * 
           * <tr><td>Excel</td><td>If a single cell is selected</td><td>If `data` is a string, the specified text is inserted as the value of the current cell.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix"), the specified set of rows and columns are inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a TableData object, a new Excel table with the specified set of rows and headers is inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td>If multiple cells are selected</td><td>If the shape does not match the shape of `data`, an error is returned.</td></tr>
           * <tr><td></td><td></td><td>If the shape of the selection exactly matches the shape of `data`, the values of the selected cells are updated based on the values in `data`.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are relative to currently selected cell(s). Negative imageLeft and imageTop values are allowed and possibly readjusted by Excel to position the image inside a worksheet. Image aspect ratio is locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * <tr><td></td><td>All other cases</td><td>An error is returned.</td></tr>
           * 
           * <tr><td>Excel Online</td><td>In addition to the behaviors described for Excel above, these limits apply when writing data in Excel Online</td><td>The total number of cells you can write to a worksheet with the `data` parameter can't exceed 20,000 in a single call to this method.</td></tr>
           * <tr><td></td><td></td><td>The number of formatting groups passed to the `cellFormat` parameter can't exceed 100. A single formatting group consists of a set of formatting applied to a specified range of cells.</td></tr>
           * 
           * <tr><td>PowerPoint</td><td>Insert image</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are optional but if provided, both should be present. If a single value is provided, it will be ignored. Negative imageLeft and imageTop values are allowed and can position an image outside of a slide. If no optional parameter is given and slide has a placeholder, the image will replace the placeholder in the slide. Image aspect ratio will be locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * </table>
           * 
           * The possible values for the {@link Office.CoercionType} parameter vary by the host. 
           * 
           * <table>
           *   <tr>
           *     <th>Host</th>
           *     <th>Supported coercionType</th>
           *   </tr>
           *   <tr>
           *     <td>Excel, Excel Online, PowerPoint, PowerPoint Online, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Text` (string)</td>
           *   </tr>
           *   <tr>
           *     <td>Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Matrix` (array of arrays)</td>
           *   </tr>
           *   <tr>
           *     <td>Access, Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Table` (TableData object)</td>
           *   </tr>
           *   <tr>
           *     <td>Word</td>
           *     <td>`Office.CoercionType.Html`</td>
           *   </tr>
           *   <tr>
           *     <td>Word and Word Online </td>
           *     <td>`Office.CoercionType.Ooxml` (Office Open XML)</td>
           *   </tr>
           *   <tr>
           *     <td>PowerPoint and PowerPoint Online</td>
           *     <td>`Office.CoercionType.SlideRange`</td>
           *   </tr>
           * </table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td> y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           * 
           * @param data The data to be set. Either a string or  {@link Office.CoercionType} value, 2d array or TableData object.
           * 
           * If the value passed for `data` is:
           * 
           * - A string: Plain text or anything that can be coerced to a string will be inserted. 
           * In Excel, you can also specify data as a valid formula to add that formula to the selected cell. For example, setting data to "=SUM(A1:A5)" 
           * will total the values in the specified range. However, when you set a formula on the bound cell, after doing so, you can't read the added 
           * formula (or any pre-existing formula) from the bound cell. If you call the Document.getSelectedDataAsync method on the selected cell to 
           * read its data, the method can return only the data displayed in the cell (the formula's result).
           * 
           * - An array of arrays ("matrix"): Tabular data without headers will be inserted. For example, to write data to three rows in two columns, 
           * you can pass an array like this: [["R1C1", "R1C2"], ["R2C1", "R2C2"], ["R3C1", "R3C2"]]. To write a single column of three rows, pass an 
           * array like this: [["R1C1"], ["R2C1"], ["R3C1"]]
           * 
           * In Excel, you can also specify data as an array of arrays that contains valid formulas to add them to the selected cells. For example if no 
           * other data will be overwritten, setting data to [["=SUM(A1:A5)","=AVERAGE(A1:A5)"]] will add those two formulas to the selection. Just as 
           * when setting a formula on a single cell as "text", you can't read the added formulas (or any pre-existing formulas) after they have been 
           * set - you can only read the formulas' results.
           * 
           * - A TableData object: A table with headers will be inserted.
           * In Excel, if you specify formulas in the TableData object you pass for the data parameter, you might not get the results you expect due to 
           * the "calculated columns" feature of Excel, which automatically duplicates formulas within a column. To work around this when you want to 
           * write `data` that contains formulas to a selected table, try specifying the data as an array of arrays (instead of a TableData object), and 
           * specify the coercionType as Microsoft.Office.Matrix or "matrix".
           * 
           * @param options Provides options for how to insert data to the selection.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The AsyncResult.value property always returns undefined because there is no object or data to retrieve.
           */
  def setSelectedDataAsync(data: js.Array[js.Array[_]]): scala.Unit = js.native
  /**
           * Writes the specified data into the current selection.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Selection</td></tr></table>
           * 
           * **Application-specific behaviors**
           * 
           * The following application-specific actions apply when writing data to a selection.
           * 
           * <table>
           * <tr><td>Word</td><td>If there is no selection and the insertion point is at a valid location, the specified `data` is inserted at the insertion point</td><td>If `data` is a string, the specified text is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix") or a TableData object, a new Word table is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is HTML, the specified HTML is inserted. (Important: If any of the HTML you insert is invalid, Word won't raise an error. Word will insert as much of the HTML as it can and omits any invalid data).</td></tr>
           * <tr><td></td><td></td><td>If `data` is Office Open XML, the specified XML is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a base64 encoded image stream, the specified image is inserted.</td></tr></td></tr>
           * <tr><td></td><td>If there is a selection</td><td>It will be replaced with the specified `data` following the same rules as above.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are placed inline. The imageLeft and imageTop parameters are ignored. The image aspect ratio is always locked. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * 
           * <tr><td>Excel</td><td>If a single cell is selected</td><td>If `data` is a string, the specified text is inserted as the value of the current cell.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix"), the specified set of rows and columns are inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a TableData object, a new Excel table with the specified set of rows and headers is inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td>If multiple cells are selected</td><td>If the shape does not match the shape of `data`, an error is returned.</td></tr>
           * <tr><td></td><td></td><td>If the shape of the selection exactly matches the shape of `data`, the values of the selected cells are updated based on the values in `data`.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are relative to currently selected cell(s). Negative imageLeft and imageTop values are allowed and possibly readjusted by Excel to position the image inside a worksheet. Image aspect ratio is locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * <tr><td></td><td>All other cases</td><td>An error is returned.</td></tr>
           * 
           * <tr><td>Excel Online</td><td>In addition to the behaviors described for Excel above, these limits apply when writing data in Excel Online</td><td>The total number of cells you can write to a worksheet with the `data` parameter can't exceed 20,000 in a single call to this method.</td></tr>
           * <tr><td></td><td></td><td>The number of formatting groups passed to the `cellFormat` parameter can't exceed 100. A single formatting group consists of a set of formatting applied to a specified range of cells.</td></tr>
           * 
           * <tr><td>PowerPoint</td><td>Insert image</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are optional but if provided, both should be present. If a single value is provided, it will be ignored. Negative imageLeft and imageTop values are allowed and can position an image outside of a slide. If no optional parameter is given and slide has a placeholder, the image will replace the placeholder in the slide. Image aspect ratio will be locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * </table>
           * 
           * The possible values for the {@link Office.CoercionType} parameter vary by the host. 
           * 
           * <table>
           *   <tr>
           *     <th>Host</th>
           *     <th>Supported coercionType</th>
           *   </tr>
           *   <tr>
           *     <td>Excel, Excel Online, PowerPoint, PowerPoint Online, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Text` (string)</td>
           *   </tr>
           *   <tr>
           *     <td>Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Matrix` (array of arrays)</td>
           *   </tr>
           *   <tr>
           *     <td>Access, Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Table` (TableData object)</td>
           *   </tr>
           *   <tr>
           *     <td>Word</td>
           *     <td>`Office.CoercionType.Html`</td>
           *   </tr>
           *   <tr>
           *     <td>Word and Word Online </td>
           *     <td>`Office.CoercionType.Ooxml` (Office Open XML)</td>
           *   </tr>
           *   <tr>
           *     <td>PowerPoint and PowerPoint Online</td>
           *     <td>`Office.CoercionType.SlideRange`</td>
           *   </tr>
           * </table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td> y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           * 
           * @param data The data to be set. Either a string or  {@link Office.CoercionType} value, 2d array or TableData object.
           * 
           * If the value passed for `data` is:
           * 
           * - A string: Plain text or anything that can be coerced to a string will be inserted. 
           * In Excel, you can also specify data as a valid formula to add that formula to the selected cell. For example, setting data to "=SUM(A1:A5)" 
           * will total the values in the specified range. However, when you set a formula on the bound cell, after doing so, you can't read the added 
           * formula (or any pre-existing formula) from the bound cell. If you call the Document.getSelectedDataAsync method on the selected cell to 
           * read its data, the method can return only the data displayed in the cell (the formula's result).
           * 
           * - An array of arrays ("matrix"): Tabular data without headers will be inserted. For example, to write data to three rows in two columns, 
           * you can pass an array like this: [["R1C1", "R1C2"], ["R2C1", "R2C2"], ["R3C1", "R3C2"]]. To write a single column of three rows, pass an 
           * array like this: [["R1C1"], ["R2C1"], ["R3C1"]]
           * 
           * In Excel, you can also specify data as an array of arrays that contains valid formulas to add them to the selected cells. For example if no 
           * other data will be overwritten, setting data to [["=SUM(A1:A5)","=AVERAGE(A1:A5)"]] will add those two formulas to the selection. Just as 
           * when setting a formula on a single cell as "text", you can't read the added formulas (or any pre-existing formulas) after they have been 
           * set - you can only read the formulas' results.
           * 
           * - A TableData object: A table with headers will be inserted.
           * In Excel, if you specify formulas in the TableData object you pass for the data parameter, you might not get the results you expect due to 
           * the "calculated columns" feature of Excel, which automatically duplicates formulas within a column. To work around this when you want to 
           * write `data` that contains formulas to a selected table, try specifying the data as an array of arrays (instead of a TableData object), and 
           * specify the coercionType as Microsoft.Office.Matrix or "matrix".
           * 
           * @param options Provides options for how to insert data to the selection.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The AsyncResult.value property always returns undefined because there is no object or data to retrieve.
           */
  def setSelectedDataAsync(data: js.Array[js.Array[_]], options: SetSelectedDataOptions): scala.Unit = js.native
  /**
           * Writes the specified data into the current selection.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Selection</td></tr></table>
           * 
           * **Application-specific behaviors**
           * 
           * The following application-specific actions apply when writing data to a selection.
           * 
           * <table>
           * <tr><td>Word</td><td>If there is no selection and the insertion point is at a valid location, the specified `data` is inserted at the insertion point</td><td>If `data` is a string, the specified text is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix") or a TableData object, a new Word table is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is HTML, the specified HTML is inserted. (Important: If any of the HTML you insert is invalid, Word won't raise an error. Word will insert as much of the HTML as it can and omits any invalid data).</td></tr>
           * <tr><td></td><td></td><td>If `data` is Office Open XML, the specified XML is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a base64 encoded image stream, the specified image is inserted.</td></tr></td></tr>
           * <tr><td></td><td>If there is a selection</td><td>It will be replaced with the specified `data` following the same rules as above.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are placed inline. The imageLeft and imageTop parameters are ignored. The image aspect ratio is always locked. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * 
           * <tr><td>Excel</td><td>If a single cell is selected</td><td>If `data` is a string, the specified text is inserted as the value of the current cell.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix"), the specified set of rows and columns are inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a TableData object, a new Excel table with the specified set of rows and headers is inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td>If multiple cells are selected</td><td>If the shape does not match the shape of `data`, an error is returned.</td></tr>
           * <tr><td></td><td></td><td>If the shape of the selection exactly matches the shape of `data`, the values of the selected cells are updated based on the values in `data`.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are relative to currently selected cell(s). Negative imageLeft and imageTop values are allowed and possibly readjusted by Excel to position the image inside a worksheet. Image aspect ratio is locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * <tr><td></td><td>All other cases</td><td>An error is returned.</td></tr>
           * 
           * <tr><td>Excel Online</td><td>In addition to the behaviors described for Excel above, these limits apply when writing data in Excel Online</td><td>The total number of cells you can write to a worksheet with the `data` parameter can't exceed 20,000 in a single call to this method.</td></tr>
           * <tr><td></td><td></td><td>The number of formatting groups passed to the `cellFormat` parameter can't exceed 100. A single formatting group consists of a set of formatting applied to a specified range of cells.</td></tr>
           * 
           * <tr><td>PowerPoint</td><td>Insert image</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are optional but if provided, both should be present. If a single value is provided, it will be ignored. Negative imageLeft and imageTop values are allowed and can position an image outside of a slide. If no optional parameter is given and slide has a placeholder, the image will replace the placeholder in the slide. Image aspect ratio will be locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * </table>
           * 
           * The possible values for the {@link Office.CoercionType} parameter vary by the host. 
           * 
           * <table>
           *   <tr>
           *     <th>Host</th>
           *     <th>Supported coercionType</th>
           *   </tr>
           *   <tr>
           *     <td>Excel, Excel Online, PowerPoint, PowerPoint Online, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Text` (string)</td>
           *   </tr>
           *   <tr>
           *     <td>Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Matrix` (array of arrays)</td>
           *   </tr>
           *   <tr>
           *     <td>Access, Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Table` (TableData object)</td>
           *   </tr>
           *   <tr>
           *     <td>Word</td>
           *     <td>`Office.CoercionType.Html`</td>
           *   </tr>
           *   <tr>
           *     <td>Word and Word Online </td>
           *     <td>`Office.CoercionType.Ooxml` (Office Open XML)</td>
           *   </tr>
           *   <tr>
           *     <td>PowerPoint and PowerPoint Online</td>
           *     <td>`Office.CoercionType.SlideRange`</td>
           *   </tr>
           * </table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td> y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           * 
           * @param data The data to be set. Either a string or  {@link Office.CoercionType} value, 2d array or TableData object.
           * 
           * If the value passed for `data` is:
           * 
           * - A string: Plain text or anything that can be coerced to a string will be inserted. 
           * In Excel, you can also specify data as a valid formula to add that formula to the selected cell. For example, setting data to "=SUM(A1:A5)" 
           * will total the values in the specified range. However, when you set a formula on the bound cell, after doing so, you can't read the added 
           * formula (or any pre-existing formula) from the bound cell. If you call the Document.getSelectedDataAsync method on the selected cell to 
           * read its data, the method can return only the data displayed in the cell (the formula's result).
           * 
           * - An array of arrays ("matrix"): Tabular data without headers will be inserted. For example, to write data to three rows in two columns, 
           * you can pass an array like this: [["R1C1", "R1C2"], ["R2C1", "R2C2"], ["R3C1", "R3C2"]]. To write a single column of three rows, pass an 
           * array like this: [["R1C1"], ["R2C1"], ["R3C1"]]
           * 
           * In Excel, you can also specify data as an array of arrays that contains valid formulas to add them to the selected cells. For example if no 
           * other data will be overwritten, setting data to [["=SUM(A1:A5)","=AVERAGE(A1:A5)"]] will add those two formulas to the selection. Just as 
           * when setting a formula on a single cell as "text", you can't read the added formulas (or any pre-existing formulas) after they have been 
           * set - you can only read the formulas' results.
           * 
           * - A TableData object: A table with headers will be inserted.
           * In Excel, if you specify formulas in the TableData object you pass for the data parameter, you might not get the results you expect due to 
           * the "calculated columns" feature of Excel, which automatically duplicates formulas within a column. To work around this when you want to 
           * write `data` that contains formulas to a selected table, try specifying the data as an array of arrays (instead of a TableData object), and 
           * specify the coercionType as Microsoft.Office.Matrix or "matrix".
           * 
           * @param options Provides options for how to insert data to the selection.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The AsyncResult.value property always returns undefined because there is no object or data to retrieve.
           */
  def setSelectedDataAsync(
    data: js.Array[js.Array[_]],
    options: SetSelectedDataOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Writes the specified data into the current selection.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Selection</td></tr></table>
           * 
           * **Application-specific behaviors**
           * 
           * The following application-specific actions apply when writing data to a selection.
           * 
           * <table>
           * <tr><td>Word</td><td>If there is no selection and the insertion point is at a valid location, the specified `data` is inserted at the insertion point</td><td>If `data` is a string, the specified text is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix") or a TableData object, a new Word table is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is HTML, the specified HTML is inserted. (Important: If any of the HTML you insert is invalid, Word won't raise an error. Word will insert as much of the HTML as it can and omits any invalid data).</td></tr>
           * <tr><td></td><td></td><td>If `data` is Office Open XML, the specified XML is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a base64 encoded image stream, the specified image is inserted.</td></tr></td></tr>
           * <tr><td></td><td>If there is a selection</td><td>It will be replaced with the specified `data` following the same rules as above.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are placed inline. The imageLeft and imageTop parameters are ignored. The image aspect ratio is always locked. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * 
           * <tr><td>Excel</td><td>If a single cell is selected</td><td>If `data` is a string, the specified text is inserted as the value of the current cell.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix"), the specified set of rows and columns are inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a TableData object, a new Excel table with the specified set of rows and headers is inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td>If multiple cells are selected</td><td>If the shape does not match the shape of `data`, an error is returned.</td></tr>
           * <tr><td></td><td></td><td>If the shape of the selection exactly matches the shape of `data`, the values of the selected cells are updated based on the values in `data`.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are relative to currently selected cell(s). Negative imageLeft and imageTop values are allowed and possibly readjusted by Excel to position the image inside a worksheet. Image aspect ratio is locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * <tr><td></td><td>All other cases</td><td>An error is returned.</td></tr>
           * 
           * <tr><td>Excel Online</td><td>In addition to the behaviors described for Excel above, these limits apply when writing data in Excel Online</td><td>The total number of cells you can write to a worksheet with the `data` parameter can't exceed 20,000 in a single call to this method.</td></tr>
           * <tr><td></td><td></td><td>The number of formatting groups passed to the `cellFormat` parameter can't exceed 100. A single formatting group consists of a set of formatting applied to a specified range of cells.</td></tr>
           * 
           * <tr><td>PowerPoint</td><td>Insert image</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are optional but if provided, both should be present. If a single value is provided, it will be ignored. Negative imageLeft and imageTop values are allowed and can position an image outside of a slide. If no optional parameter is given and slide has a placeholder, the image will replace the placeholder in the slide. Image aspect ratio will be locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * </table>
           * 
           * The possible values for the {@link Office.CoercionType} parameter vary by the host. 
           * 
           * <table>
           *   <tr>
           *     <th>Host</th>
           *     <th>Supported coercionType</th>
           *   </tr>
           *   <tr>
           *     <td>Excel, Excel Online, PowerPoint, PowerPoint Online, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Text` (string)</td>
           *   </tr>
           *   <tr>
           *     <td>Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Matrix` (array of arrays)</td>
           *   </tr>
           *   <tr>
           *     <td>Access, Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Table` (TableData object)</td>
           *   </tr>
           *   <tr>
           *     <td>Word</td>
           *     <td>`Office.CoercionType.Html`</td>
           *   </tr>
           *   <tr>
           *     <td>Word and Word Online </td>
           *     <td>`Office.CoercionType.Ooxml` (Office Open XML)</td>
           *   </tr>
           *   <tr>
           *     <td>PowerPoint and PowerPoint Online</td>
           *     <td>`Office.CoercionType.SlideRange`</td>
           *   </tr>
           * </table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td> y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           * 
           * @param data The data to be set. Either a string or  {@link Office.CoercionType} value, 2d array or TableData object.
           * 
           * If the value passed for `data` is:
           * 
           * - A string: Plain text or anything that can be coerced to a string will be inserted. 
           * In Excel, you can also specify data as a valid formula to add that formula to the selected cell. For example, setting data to "=SUM(A1:A5)" 
           * will total the values in the specified range. However, when you set a formula on the bound cell, after doing so, you can't read the added 
           * formula (or any pre-existing formula) from the bound cell. If you call the Document.getSelectedDataAsync method on the selected cell to 
           * read its data, the method can return only the data displayed in the cell (the formula's result).
           * 
           * - An array of arrays ("matrix"): Tabular data without headers will be inserted. For example, to write data to three rows in two columns, 
           * you can pass an array like this: [["R1C1", "R1C2"], ["R2C1", "R2C2"], ["R3C1", "R3C2"]]. To write a single column of three rows, pass an 
           * array like this: [["R1C1"], ["R2C1"], ["R3C1"]]
           * 
           * In Excel, you can also specify data as an array of arrays that contains valid formulas to add them to the selected cells. For example if no 
           * other data will be overwritten, setting data to [["=SUM(A1:A5)","=AVERAGE(A1:A5)"]] will add those two formulas to the selection. Just as 
           * when setting a formula on a single cell as "text", you can't read the added formulas (or any pre-existing formulas) after they have been 
           * set - you can only read the formulas' results.
           * 
           * - A TableData object: A table with headers will be inserted.
           * In Excel, if you specify formulas in the TableData object you pass for the data parameter, you might not get the results you expect due to 
           * the "calculated columns" feature of Excel, which automatically duplicates formulas within a column. To work around this when you want to 
           * write `data` that contains formulas to a selected table, try specifying the data as an array of arrays (instead of a TableData object), and 
           * specify the coercionType as Microsoft.Office.Matrix or "matrix".
           * 
           * @param options Provides options for how to insert data to the selection.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The AsyncResult.value property always returns undefined because there is no object or data to retrieve.
           */
  def setSelectedDataAsync(data: TableData): scala.Unit = js.native
  /**
           * Writes the specified data into the current selection.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Selection</td></tr></table>
           * 
           * **Application-specific behaviors**
           * 
           * The following application-specific actions apply when writing data to a selection.
           * 
           * <table>
           * <tr><td>Word</td><td>If there is no selection and the insertion point is at a valid location, the specified `data` is inserted at the insertion point</td><td>If `data` is a string, the specified text is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix") or a TableData object, a new Word table is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is HTML, the specified HTML is inserted. (Important: If any of the HTML you insert is invalid, Word won't raise an error. Word will insert as much of the HTML as it can and omits any invalid data).</td></tr>
           * <tr><td></td><td></td><td>If `data` is Office Open XML, the specified XML is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a base64 encoded image stream, the specified image is inserted.</td></tr></td></tr>
           * <tr><td></td><td>If there is a selection</td><td>It will be replaced with the specified `data` following the same rules as above.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are placed inline. The imageLeft and imageTop parameters are ignored. The image aspect ratio is always locked. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * 
           * <tr><td>Excel</td><td>If a single cell is selected</td><td>If `data` is a string, the specified text is inserted as the value of the current cell.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix"), the specified set of rows and columns are inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a TableData object, a new Excel table with the specified set of rows and headers is inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td>If multiple cells are selected</td><td>If the shape does not match the shape of `data`, an error is returned.</td></tr>
           * <tr><td></td><td></td><td>If the shape of the selection exactly matches the shape of `data`, the values of the selected cells are updated based on the values in `data`.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are relative to currently selected cell(s). Negative imageLeft and imageTop values are allowed and possibly readjusted by Excel to position the image inside a worksheet. Image aspect ratio is locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * <tr><td></td><td>All other cases</td><td>An error is returned.</td></tr>
           * 
           * <tr><td>Excel Online</td><td>In addition to the behaviors described for Excel above, these limits apply when writing data in Excel Online</td><td>The total number of cells you can write to a worksheet with the `data` parameter can't exceed 20,000 in a single call to this method.</td></tr>
           * <tr><td></td><td></td><td>The number of formatting groups passed to the `cellFormat` parameter can't exceed 100. A single formatting group consists of a set of formatting applied to a specified range of cells.</td></tr>
           * 
           * <tr><td>PowerPoint</td><td>Insert image</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are optional but if provided, both should be present. If a single value is provided, it will be ignored. Negative imageLeft and imageTop values are allowed and can position an image outside of a slide. If no optional parameter is given and slide has a placeholder, the image will replace the placeholder in the slide. Image aspect ratio will be locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * </table>
           * 
           * The possible values for the {@link Office.CoercionType} parameter vary by the host. 
           * 
           * <table>
           *   <tr>
           *     <th>Host</th>
           *     <th>Supported coercionType</th>
           *   </tr>
           *   <tr>
           *     <td>Excel, Excel Online, PowerPoint, PowerPoint Online, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Text` (string)</td>
           *   </tr>
           *   <tr>
           *     <td>Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Matrix` (array of arrays)</td>
           *   </tr>
           *   <tr>
           *     <td>Access, Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Table` (TableData object)</td>
           *   </tr>
           *   <tr>
           *     <td>Word</td>
           *     <td>`Office.CoercionType.Html`</td>
           *   </tr>
           *   <tr>
           *     <td>Word and Word Online </td>
           *     <td>`Office.CoercionType.Ooxml` (Office Open XML)</td>
           *   </tr>
           *   <tr>
           *     <td>PowerPoint and PowerPoint Online</td>
           *     <td>`Office.CoercionType.SlideRange`</td>
           *   </tr>
           * </table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td> y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           * 
           * @param data The data to be set. Either a string or  {@link Office.CoercionType} value, 2d array or TableData object.
           * 
           * If the value passed for `data` is:
           * 
           * - A string: Plain text or anything that can be coerced to a string will be inserted. 
           * In Excel, you can also specify data as a valid formula to add that formula to the selected cell. For example, setting data to "=SUM(A1:A5)" 
           * will total the values in the specified range. However, when you set a formula on the bound cell, after doing so, you can't read the added 
           * formula (or any pre-existing formula) from the bound cell. If you call the Document.getSelectedDataAsync method on the selected cell to 
           * read its data, the method can return only the data displayed in the cell (the formula's result).
           * 
           * - An array of arrays ("matrix"): Tabular data without headers will be inserted. For example, to write data to three rows in two columns, 
           * you can pass an array like this: [["R1C1", "R1C2"], ["R2C1", "R2C2"], ["R3C1", "R3C2"]]. To write a single column of three rows, pass an 
           * array like this: [["R1C1"], ["R2C1"], ["R3C1"]]
           * 
           * In Excel, you can also specify data as an array of arrays that contains valid formulas to add them to the selected cells. For example if no 
           * other data will be overwritten, setting data to [["=SUM(A1:A5)","=AVERAGE(A1:A5)"]] will add those two formulas to the selection. Just as 
           * when setting a formula on a single cell as "text", you can't read the added formulas (or any pre-existing formulas) after they have been 
           * set - you can only read the formulas' results.
           * 
           * - A TableData object: A table with headers will be inserted.
           * In Excel, if you specify formulas in the TableData object you pass for the data parameter, you might not get the results you expect due to 
           * the "calculated columns" feature of Excel, which automatically duplicates formulas within a column. To work around this when you want to 
           * write `data` that contains formulas to a selected table, try specifying the data as an array of arrays (instead of a TableData object), and 
           * specify the coercionType as Microsoft.Office.Matrix or "matrix".
           * 
           * @param options Provides options for how to insert data to the selection.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The AsyncResult.value property always returns undefined because there is no object or data to retrieve.
           */
  def setSelectedDataAsync(data: TableData, options: SetSelectedDataOptions): scala.Unit = js.native
  /**
           * Writes the specified data into the current selection.
           *
           * @remarks
           * <table><tr><td>Requirement Sets</td><td>Selection</td></tr></table>
           * 
           * **Application-specific behaviors**
           * 
           * The following application-specific actions apply when writing data to a selection.
           * 
           * <table>
           * <tr><td>Word</td><td>If there is no selection and the insertion point is at a valid location, the specified `data` is inserted at the insertion point</td><td>If `data` is a string, the specified text is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix") or a TableData object, a new Word table is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is HTML, the specified HTML is inserted. (Important: If any of the HTML you insert is invalid, Word won't raise an error. Word will insert as much of the HTML as it can and omits any invalid data).</td></tr>
           * <tr><td></td><td></td><td>If `data` is Office Open XML, the specified XML is inserted.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a base64 encoded image stream, the specified image is inserted.</td></tr></td></tr>
           * <tr><td></td><td>If there is a selection</td><td>It will be replaced with the specified `data` following the same rules as above.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are placed inline. The imageLeft and imageTop parameters are ignored. The image aspect ratio is always locked. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * 
           * <tr><td>Excel</td><td>If a single cell is selected</td><td>If `data` is a string, the specified text is inserted as the value of the current cell.</td></tr>
           * <tr><td></td><td></td><td>If `data` is an array of arrays ("matrix"), the specified set of rows and columns are inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td></td><td>If `data` is a TableData object, a new Excel table with the specified set of rows and headers is inserted, if no other data in surrounding cells will be overwritten.</td></tr>
           * <tr><td></td><td>If multiple cells are selected</td><td>If the shape does not match the shape of `data`, an error is returned.</td></tr>
           * <tr><td></td><td></td><td>If the shape of the selection exactly matches the shape of `data`, the values of the selected cells are updated based on the values in `data`.</td></tr>
           * <tr><td></td><td>Insert images</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are relative to currently selected cell(s). Negative imageLeft and imageTop values are allowed and possibly readjusted by Excel to position the image inside a worksheet. Image aspect ratio is locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * <tr><td></td><td>All other cases</td><td>An error is returned.</td></tr>
           * 
           * <tr><td>Excel Online</td><td>In addition to the behaviors described for Excel above, these limits apply when writing data in Excel Online</td><td>The total number of cells you can write to a worksheet with the `data` parameter can't exceed 20,000 in a single call to this method.</td></tr>
           * <tr><td></td><td></td><td>The number of formatting groups passed to the `cellFormat` parameter can't exceed 100. A single formatting group consists of a set of formatting applied to a specified range of cells.</td></tr>
           * 
           * <tr><td>PowerPoint</td><td>Insert image</td><td>Inserted images are floating. The position imageLeft and imageTop parameters are optional but if provided, both should be present. If a single value is provided, it will be ignored. Negative imageLeft and imageTop values are allowed and can position an image outside of a slide. If no optional parameter is given and slide has a placeholder, the image will replace the placeholder in the slide. Image aspect ratio will be locked unless both imageWidth and imageHeight parameters are provided. If only one of the imageWidth and imageHeight parameter is given, the other value will be automatically scaled to keep the original aspect ratio.</td></tr>
           * </table>
           * 
           * The possible values for the {@link Office.CoercionType} parameter vary by the host. 
           * 
           * <table>
           *   <tr>
           *     <th>Host</th>
           *     <th>Supported coercionType</th>
           *   </tr>
           *   <tr>
           *     <td>Excel, Excel Online, PowerPoint, PowerPoint Online, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Text` (string)</td>
           *   </tr>
           *   <tr>
           *     <td>Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Matrix` (array of arrays)</td>
           *   </tr>
           *   <tr>
           *     <td>Access, Excel, Word, and Word Online</td>
           *     <td>`Office.CoercionType.Table` (TableData object)</td>
           *   </tr>
           *   <tr>
           *     <td>Word</td>
           *     <td>`Office.CoercionType.Html`</td>
           *   </tr>
           *   <tr>
           *     <td>Word and Word Online </td>
           *     <td>`Office.CoercionType.Ooxml` (Office Open XML)</td>
           *   </tr>
           *   <tr>
           *     <td>PowerPoint and PowerPoint Online</td>
           *     <td>`Office.CoercionType.SlideRange`</td>
           *   </tr>
           * </table>
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser) </th><th> Office for iPad </th></tr>
           *   <tr><td><strong> Access     </strong></td><td> y                          </td><td>                            </td><td>                 </td></tr>
           *   <tr><td><strong> Excel      </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> PowerPoint </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *   <tr><td><strong> Word       </strong></td><td> Y                          </td><td> Y                          </td><td> Y               </td></tr>
           *  </table>
           * 
           * @param data The data to be set. Either a string or  {@link Office.CoercionType} value, 2d array or TableData object.
           * 
           * If the value passed for `data` is:
           * 
           * - A string: Plain text or anything that can be coerced to a string will be inserted. 
           * In Excel, you can also specify data as a valid formula to add that formula to the selected cell. For example, setting data to "=SUM(A1:A5)" 
           * will total the values in the specified range. However, when you set a formula on the bound cell, after doing so, you can't read the added 
           * formula (or any pre-existing formula) from the bound cell. If you call the Document.getSelectedDataAsync method on the selected cell to 
           * read its data, the method can return only the data displayed in the cell (the formula's result).
           * 
           * - An array of arrays ("matrix"): Tabular data without headers will be inserted. For example, to write data to three rows in two columns, 
           * you can pass an array like this: [["R1C1", "R1C2"], ["R2C1", "R2C2"], ["R3C1", "R3C2"]]. To write a single column of three rows, pass an 
           * array like this: [["R1C1"], ["R2C1"], ["R3C1"]]
           * 
           * In Excel, you can also specify data as an array of arrays that contains valid formulas to add them to the selected cells. For example if no 
           * other data will be overwritten, setting data to [["=SUM(A1:A5)","=AVERAGE(A1:A5)"]] will add those two formulas to the selection. Just as 
           * when setting a formula on a single cell as "text", you can't read the added formulas (or any pre-existing formulas) after they have been 
           * set - you can only read the formulas' results.
           * 
           * - A TableData object: A table with headers will be inserted.
           * In Excel, if you specify formulas in the TableData object you pass for the data parameter, you might not get the results you expect due to 
           * the "calculated columns" feature of Excel, which automatically duplicates formulas within a column. To work around this when you want to 
           * write `data` that contains formulas to a selected table, try specifying the data as an array of arrays (instead of a TableData object), and 
           * specify the coercionType as Microsoft.Office.Matrix or "matrix".
           * 
           * @param options Provides options for how to insert data to the selection.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           *                  The AsyncResult.value property always returns undefined because there is no object or data to retrieve.
           */
  def setSelectedDataAsync(
    data: TableData,
    options: SetSelectedDataOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Set task field for specified task Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setTaskFieldAsync(taskId: java.lang.String, fieldId: scala.Double, fieldValue: java.lang.String): scala.Unit = js.native
  /**
           * Project documents only. Set task field for specified task Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setTaskFieldAsync(
    taskId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: java.lang.String,
    options: AsyncContextOptions
  ): scala.Unit = js.native
  /**
           * Project documents only. Set task field for specified task Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setTaskFieldAsync(
    taskId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: java.lang.String,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Set task field for specified task Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setTaskFieldAsync(taskId: java.lang.String, fieldId: scala.Double, fieldValue: js.Object): scala.Unit = js.native
  /**
           * Project documents only. Set task field for specified task Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setTaskFieldAsync(
    taskId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: js.Object,
    options: AsyncContextOptions
  ): scala.Unit = js.native
  /**
           * Project documents only. Set task field for specified task Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setTaskFieldAsync(
    taskId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: js.Object,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Set task field for specified task Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setTaskFieldAsync(taskId: java.lang.String, fieldId: scala.Double, fieldValue: scala.Boolean): scala.Unit = js.native
  /**
           * Project documents only. Set task field for specified task Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setTaskFieldAsync(
    taskId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: scala.Boolean,
    options: AsyncContextOptions
  ): scala.Unit = js.native
  /**
           * Project documents only. Set task field for specified task Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setTaskFieldAsync(
    taskId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: scala.Boolean,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
  /**
           * Project documents only. Set task field for specified task Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setTaskFieldAsync(taskId: java.lang.String, fieldId: scala.Double, fieldValue: scala.Double): scala.Unit = js.native
  /**
           * Project documents only. Set task field for specified task Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setTaskFieldAsync(
    taskId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: scala.Double,
    options: AsyncContextOptions
  ): scala.Unit = js.native
  /**
           * Project documents only. Set task field for specified task Id.
           * 
           * Important: This API works only in Project 2016 on Windows desktop.
           * 
           * @param taskId Either a string or value of the Task Id.
           * @param fieldId Task Fields.
           * @param fieldValue Value of the target field.
           * @param options Provides an option for preserving context data of any type, unchanged, for use in a callback.
           * @param callback Optional. A function that is invoked when the callback returns, whose only parameter is of type {@link Office.AsyncResult}.
           * 
           * @remarks
           * 
           * **Support details**
           * 
           * A capital Y in the following matrix indicates that this method is supported in the corresponding Office host application. 
           * An empty cell indicates that the Office host application doesn't support this method.
           * 
           * For more information about Office host application and server requirements, see 
           * {@link https://docs.microsoft.com/office/dev/add-ins/concepts/requirements-for-running-office-add-ins | Requirements for running Office Add-ins}.
           * 
           * *Supported hosts, by platform*
           *  <table>
           *   <tr><th>                    </th><th> Office for Windows desktop </th><th> Office Online (in browser)</th></tr>
           *   <tr><td><strong> Project    </strong></td><td> Y                          </td><td>                           </td></tr>
           *  </table>
           */
  def setTaskFieldAsync(
    taskId: java.lang.String,
    fieldId: scala.Double,
    fieldValue: scala.Double,
    options: AsyncContextOptions,
    callback: js.Function1[/* result */ AsyncResult[scala.Unit], scala.Unit]
  ): scala.Unit = js.native
}
