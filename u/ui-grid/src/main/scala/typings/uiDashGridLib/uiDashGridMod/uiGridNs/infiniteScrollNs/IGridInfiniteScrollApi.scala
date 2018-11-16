package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.infiniteScrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGridInfiniteScrollApi[TEntity] extends js.Object {
  // Events
  var on: uiDashGridLib.Anon_NeedLoadMoreDataTop = js.native
  // Methods
  /**
               * Call this function when you have loaded the additional data requested.
               * You should set scrollUp and scrollDown to indicate whether there are still more pages in each direction.
               *
               * If you call dataLoaded without first calling saveScrollPercentage, then we will scroll the user to the
               * start of the newly loaded data.  This usually makes scrolling smooth, but be jumpy with large
               * infiniteScrollRowsFromEnd values, and on variable speed internet connections.
               * Using saveScrollPercentage as demonstrated in the tutorial should give a smoother scrolling experience
               * for users.
               *
               * See infinite_scroll tutorial for example of usage
               * @param {boolean} scrollUp if set to false flags that there are no more pages upwards, so don't fire any
               *        more infinite scroll events upward
               * @param {boolean} scrollDown if set to false flags that there are no more pages downwards, so don't fire
               *        any more infinite scroll events downward
               * @returns {ng.IPromise<any>} a promise that is resolved when the grid scrolling is fully adjusted.
               *          If you're planning to remove pages, you should wait on this promise first, or you'll break the
               *          scroll positioning
               */
  def dataLoaded(scrollUp: scala.Boolean, scrollDown: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
               * Adjusts the scroll position after you've removed data at the bottom.
               * You should have called saveScrollPercentage before you remove the data,
               * and if you're doing this in response to a needMoreData you should wait
               * until the promise from loadData has resolved before you start removing data
               *
               * @param {IGridInstance} grid the grid we're working on
               * @param {boolean} scrollUp flag that there are pages upwards, fire infinite scroll events upward
               * @param {boolean} scrollDown flag that there are pages downwards, so fire infinite scroll events downward
               * @returns {ng.IPromise<any>} A promise that is resolved when scrolling finishes
               */
  def dataRemovedBottom(
    grid: uiDashGridLib.uiDashGridMod.uiGridNs.IGridInstanceOf[TEntity],
    scrollUp: scala.Boolean,
    scrollDown: scala.Boolean
  ): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
               * Adjusts the scroll position after you've removed data at the bottom
               * @param {boolean} scrollUp flag that there are pages upwards, fire infinite scroll events upward
               * @param {boolean} scrollDown flag that there are pages downwards, so fire infinite scroll events downward
               * @returns {ng.IPromise<any>} A promise that is resolved when scrolling finishes
               */
  def dataRemovedBottom(scrollUp: scala.Boolean, scrollDown: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
               * Adjusts the scroll position after you've removed data at the bottom.
               * You should have called saveScrollPercentage before you remove the data,
               * and if you're doing this in response to a needMoreData you should wait
               * until the promise from loadData has resolved before you start removing data
               *
               * @param {IGridInstance} grid the grid we're working on
               * @param {boolean} scrollUp flag that there are pages upwards, fire infinite scroll events upward
               * @param {boolean} scrollDown flag that there are pages downwards, so fire infinite scroll events downward
               * @returns {ng.IPromise<any>} A promise that is resolved when scrolling finishes
               */
  def dataRemovedTop(
    grid: uiDashGridLib.uiDashGridMod.uiGridNs.IGridInstanceOf[TEntity],
    scrollUp: scala.Boolean,
    scrollDown: scala.Boolean
  ): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
               * Adjusts the scroll position after you've removed data at the bottom
               * @param {boolean} scrollUp flag that there are pages upwards, fire infinite scroll events upward
               * @param {boolean} scrollDown flag that there are pages downwards, so fire infinite scroll events downward
               * @returns {ng.IPromise<any>} A promise that is resolved when scrolling finishes
               */
  def dataRemovedTop(scrollUp: scala.Boolean, scrollDown: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
               * Call this function when you have taken some action that makes the current scroll position invalid.
               * For example, if you're using external sorting and you've resorted then you might reset the scroll,
               * or if you've otherwise substantially changed the data, perhaps you've reused an
               * existing grid for a new data set
               *
               * You must tell us whether there is data upwards or downwards after the reset
               * @param {boolean} scrollUp flag that there are pages upwards, fire infinite scroll events upward
               * @param {boolean} scrollDown flag that there are pages downwards, so fire infinite scroll events downward
               * @returns {ng.IPromise<any>} A promise that is resolved when scrolling finishes
               */
  def resetScroll(scrollUp: scala.Boolean, scrollDown: scala.Boolean): angularLib.angularMod.angularNs.IPromise[_] = js.native
  /**
               * Saves the scroll percentage and number of visible rows before you adjust the data,
               * used if you're subsequently going to call dataRemovedTop or dataRemovedBottom
               */
  def saveScrollPercentage(): scala.Unit = js.native
}
