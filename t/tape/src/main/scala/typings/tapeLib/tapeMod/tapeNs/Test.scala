package typings
package tapeLib.tapeMod.tapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Test extends js.Object {
  def assert(value: js.Any): scala.Unit = js.native
  def assert(value: js.Any, msg: java.lang.String): scala.Unit = js.native
  /**
           * Print a message without breaking the tap output.
           * (Useful when using e.g. tap-colorize where output is buffered & console.log will print in incorrect order vis-a-vis tap output.)
           */
  def comment(msg: java.lang.String): scala.Unit = js.native
  /**
           * Assert that a and b have the same structure and nested values using node's deepEqual() algorithm with strict comparisons (===) on leaf nodes and an optional description msg.
           */
  def deepEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
           * Assert that a and b have the same structure and nested values using node's deepEqual() algorithm with strict comparisons (===) on leaf nodes and an optional description msg.
           */
  def deepEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def deepEquals(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def deepEquals(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  /**
           * Assert that a and b have the same structure and nested values using node's deepEqual() algorithm with loose comparisons (==) on leaf nodes and an optional description msg.
           */
  def deepLooseEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
           * Assert that a and b have the same structure and nested values using node's deepEqual() algorithm with loose comparisons (==) on leaf nodes and an optional description msg.
           */
  def deepLooseEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def doesNotEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def doesNotEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  /**
           * Assert that the function call fn() does not throw an exception.
           */
  def doesNotThrow(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def doesNotThrow(fn: js.Function0[scala.Unit], exceptionExpected: js.Function): scala.Unit = js.native
  def doesNotThrow(fn: js.Function0[scala.Unit], exceptionExpected: js.Function, msg: java.lang.String): scala.Unit = js.native
  def doesNotThrow(fn: js.Function0[scala.Unit], exceptionExpected: stdLib.RegExp): scala.Unit = js.native
  def doesNotThrow(fn: js.Function0[scala.Unit], exceptionExpected: stdLib.RegExp, msg: java.lang.String): scala.Unit = js.native
  /**
           * Assert that the function call fn() does not throw an exception.
           */
  def doesNotThrow(fn: js.Function0[scala.Unit], msg: java.lang.String): scala.Unit = js.native
  /**
           * Declare the end of a test explicitly.
           * If err is passed in t.end will assert that it is falsey.
           */
  def end(): scala.Unit = js.native
  /**
           * Declare the end of a test explicitly.
           * If err is passed in t.end will assert that it is falsey.
           */
  def end(err: js.Any): scala.Unit = js.native
  /**
           * Assert that a === b with an optional description msg.
           */
  def equal(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
           * Assert that a === b with an optional description msg.
           */
  def equal(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def equals(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def equals(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  /**
           * Assert that err is falsy.
           * If err is non-falsy, use its err.message as the description message.
           */
  def error(err: js.Any): scala.Unit = js.native
  /**
           * Assert that err is falsy.
           * If err is non-falsy, use its err.message as the description message.
           */
  def error(err: js.Any, msg: java.lang.String): scala.Unit = js.native
  /**
           * Generate a failing assertion with a message msg.
           */
  def fail(): scala.Unit = js.native
  /**
           * Generate a failing assertion with a message msg.
           */
  def fail(msg: java.lang.String): scala.Unit = js.native
  def `false`(value: js.Any): scala.Unit = js.native
  def `false`(value: js.Any, msg: java.lang.String): scala.Unit = js.native
  def ifErr(err: js.Any): scala.Unit = js.native
  def ifErr(err: js.Any, msg: java.lang.String): scala.Unit = js.native
  def ifError(err: js.Any): scala.Unit = js.native
  def ifError(err: js.Any, msg: java.lang.String): scala.Unit = js.native
  def iferror(err: js.Any): scala.Unit = js.native
  def iferror(err: js.Any, msg: java.lang.String): scala.Unit = js.native
  def is(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def is(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def isEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isEquivalent(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def isEquivalent(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isInequal(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def isInequal(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isInequivalent(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def isInequivalent(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNot(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def isNot(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNotDeepEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def isNotDeepEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNotDeeply(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def isNotDeeply(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNotEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def isNotEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def isNotEquivalent(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def isNotEquivalent(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def looseEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def looseEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def looseEquals(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def looseEquals(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def not(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def not(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  /**
           * Assert that a and b do not have the same structure and nested values using node's deepEqual() algorithm with strict comparisons (===) on leaf nodes and an optional description msg.
           */
  def notDeepEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
           * Assert that a and b do not have the same structure and nested values using node's deepEqual() algorithm with strict comparisons (===) on leaf nodes and an optional description msg.
           */
  def notDeepEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  /**
           * Assert that a and b do not have the same structure and nested values using node's deepEqual() algorithm with loose comparisons (==) on leaf nodes and an optional description msg.
           */
  def notDeepLooseEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
           * Assert that a and b do not have the same structure and nested values using node's deepEqual() algorithm with loose comparisons (==) on leaf nodes and an optional description msg.
           */
  def notDeepLooseEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notDeeply(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notDeeply(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  /**
           * Assert that a !== b with an optional description msg.
           */
  def notEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  /**
           * Assert that a !== b with an optional description msg.
           */
  def notEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notEquals(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notEquals(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notEquivalent(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notEquivalent(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notLooseEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notLooseEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notLooseEquals(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notLooseEquals(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  /**
           * Assert that value is falsy with an optional description message msg.
           */
  def notOk(value: js.Any): scala.Unit = js.native
  /**
           * Assert that value is falsy with an optional description message msg.
           */
  def notOk(value: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notSame(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notSame(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notStrictEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notStrictEquals(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def notStrictEquals(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def notok(value: js.Any): scala.Unit = js.native
  def notok(value: js.Any, msg: java.lang.String): scala.Unit = js.native
  /**
           * Assert that value is truthy with an optional description message msg.
           */
  def ok(value: js.Any): scala.Unit = js.native
  /**
           * Assert that value is truthy with an optional description message msg.
           */
  def ok(value: js.Any, msg: java.lang.String): scala.Unit = js.native
  /**
           * Generate a passing assertion with a message msg.
           */
  def pass(): scala.Unit = js.native
  /**
           * Generate a passing assertion with a message msg.
           */
  def pass(msg: java.lang.String): scala.Unit = js.native
  /**
           * Declare that n assertions should be run. end() will be called automatically after the nth assertion.
           * If there are any more assertions after the nth, or after end() is called, they will generate errors.
           */
  def plan(n: scala.Double): scala.Unit = js.native
  def same(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def same(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  /**
           * Generate an assertion that will be skipped over.
           */
  def skip(): scala.Unit = js.native
  /**
           * Generate an assertion that will be skipped over.
           */
  def skip(msg: java.lang.String): scala.Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def strictEqual(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  def strictEquals(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def strictEquals(actual: js.Any, expected: js.Any, msg: java.lang.String): scala.Unit = js.native
  /**
           * Create a subtest with a new test handle st from cb(st) inside the current test.
           * cb(st) will only fire when t finishes.
           * Additional tests queued up after t will not be run until all subtests finish.
           */
  def test(name: java.lang.String, cb: TestCase): scala.Unit = js.native
  def test(name: java.lang.String, opts: TestOptions, cb: TestCase): scala.Unit = js.native
  /**
           * Assert that the function call fn() throws an exception.
           * expected, if present, must be a RegExp or Function, which is used to test the exception object.
           */
  def throws(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  def throws(fn: js.Function0[scala.Unit], exceptionExpected: js.Function): scala.Unit = js.native
  def throws(fn: js.Function0[scala.Unit], exceptionExpected: js.Function, msg: java.lang.String): scala.Unit = js.native
  def throws(fn: js.Function0[scala.Unit], exceptionExpected: stdLib.RegExp): scala.Unit = js.native
  def throws(fn: js.Function0[scala.Unit], exceptionExpected: stdLib.RegExp, msg: java.lang.String): scala.Unit = js.native
  /**
           * Assert that the function call fn() throws an exception.
           * expected, if present, must be a RegExp or Function, which is used to test the exception object.
           */
  def throws(fn: js.Function0[scala.Unit], msg: java.lang.String): scala.Unit = js.native
  /**
           * Automatically timeout the test after X ms.
           */
  def timeoutAfter(ms: scala.Double): scala.Unit = js.native
  def `true`(value: js.Any): scala.Unit = js.native
  def `true`(value: js.Any, msg: java.lang.String): scala.Unit = js.native
}
