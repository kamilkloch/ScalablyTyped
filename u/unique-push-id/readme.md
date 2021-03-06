
# Scala.js typings for unique-push-id

Typings are for version 1.0

## Library description:
🆔 Generates unique, chronological, lexicographical push IDs similar to Firebase

|                    |                 |
| ------------------ | :-------------: |
| Full name          | unique-push-id |
| Keywords           | push, id, guid, uuid, chronological, sortable |
| # releases         | 5 |
| # dependents       | 0 |
| # downloads        | 600 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/limit-zero/unique-push-id#readme)
- [Bugs](https://github.com/limit-zero/unique-push-id/issues)
- [Repository](https://github.com/limit-zero/unique-push-id)
- [Npm](https://www.npmjs.com/package/unique-push-id)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for unique-push-id 1.0
// Project: https://github.com/limit-zero/unique-push-id
// Definitions by: Nathan Amick <https://github.com/namick>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.7
/**
 * Fancy ID generator that creates 20-character string identifiers with the following properties:
 *
 * 1. They're based on timestamp so that they sort *after* any existing ids.
 * 2. They contain 72-bits of random data after the timestamp so that IDs won't collide with other clients' IDs.
 * 3. They sort *lexicographically* (so the timestamp is converted to characters that will sort properly).
 * 4. They're monotonically increasing.  Even if you generate more than one in the same timestamp, the
 *    latter ones will sort after the former ones.  We do this by using the previous random bits
 *    but "incrementing" them by 1 (only in the case of a timestamp collision).
 *
 * @returns A unique, chronological, lexicographical 20-character string identifier.
 */

```

