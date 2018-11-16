package typings
package reactLib.reactMod.ReactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeprecatedLifecycle[P, S] extends js.Object {
  /**
           * Called immediately before mounting occurs, and before `Component#render`.
           * Avoid introducing any side-effects or subscriptions in this method.
           *
           * This method will not stop working in React 17.
           *
           * Note: the presence of getSnapshotBeforeUpdate or getDerivedStateFromProps
           * prevents this from being invoked.
           *
           * @deprecated 16.3, use componentDidMount or the constructor instead
           * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#initializing-state
           * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#gradual-migration-path
           */
  var UNSAFE_componentWillMount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
           * Called when the component may be receiving new props.
           * React may call this even if props have not changed, so be sure to compare new and existing
           * props if you only want to handle changes.
           *
           * Calling `Component#setState` generally does not trigger this method.
           *
           * This method will not stop working in React 17.
           *
           * Note: the presence of getSnapshotBeforeUpdate or getDerivedStateFromProps
           * prevents this from being invoked.
           *
           * @deprecated 16.3, use static getDerivedStateFromProps instead
           * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#updating-state-based-on-props
           * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#gradual-migration-path
           */
  var UNSAFE_componentWillReceiveProps: js.UndefOr[
    js.Function2[/* nextProps */ stdLib.Readonly[P], /* nextContext */ js.Any, scala.Unit]
  ] = js.undefined
  /**
           * Called immediately before rendering when new props or state is received. Not called for the initial render.
           *
           * Note: You cannot call `Component#setState` here.
           *
           * This method will not stop working in React 17.
           *
           * Note: the presence of getSnapshotBeforeUpdate or getDerivedStateFromProps
           * prevents this from being invoked.
           *
           * @deprecated 16.3, use getSnapshotBeforeUpdate instead
           * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#reading-dom-properties-before-an-update
           * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#gradual-migration-path
           */
  var UNSAFE_componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ stdLib.Readonly[P], 
      /* nextState */ stdLib.Readonly[S], 
      /* nextContext */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  /**
           * Called immediately before mounting occurs, and before `Component#render`.
           * Avoid introducing any side-effects or subscriptions in this method.
           *
           * Note: the presence of getSnapshotBeforeUpdate or getDerivedStateFromProps
           * prevents this from being invoked.
           *
           * @deprecated 16.3, use componentDidMount or the constructor instead; will stop working in React 17
           * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#initializing-state
           * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#gradual-migration-path
           */
  var componentWillMount: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
           * Called when the component may be receiving new props.
           * React may call this even if props have not changed, so be sure to compare new and existing
           * props if you only want to handle changes.
           *
           * Calling `Component#setState` generally does not trigger this method.
           *
           * Note: the presence of getSnapshotBeforeUpdate or getDerivedStateFromProps
           * prevents this from being invoked.
           *
           * @deprecated 16.3, use static getDerivedStateFromProps instead; will stop working in React 17
           * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#updating-state-based-on-props
           * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#gradual-migration-path
           */
  var componentWillReceiveProps: js.UndefOr[
    js.Function2[/* nextProps */ stdLib.Readonly[P], /* nextContext */ js.Any, scala.Unit]
  ] = js.undefined
  /**
           * Called immediately before rendering when new props or state is received. Not called for the initial render.
           *
           * Note: You cannot call `Component#setState` here.
           *
           * Note: the presence of getSnapshotBeforeUpdate or getDerivedStateFromProps
           * prevents this from being invoked.
           *
           * @deprecated 16.3, use getSnapshotBeforeUpdate instead; will stop working in React 17
           * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#reading-dom-properties-before-an-update
           * @see https://reactjs.org/blog/2018/03/27/update-on-async-rendering.html#gradual-migration-path
           */
  var componentWillUpdate: js.UndefOr[
    js.Function3[
      /* nextProps */ stdLib.Readonly[P], 
      /* nextState */ stdLib.Readonly[S], 
      /* nextContext */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
}
