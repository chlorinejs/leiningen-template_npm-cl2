# {{name}}

A ChlorineJS library designed to ... well, that part is up to you.

## Prerequisites

You will need [nodejs][1] and [Leiningen][2] 2.0 or above installed.

[1]: http://nodejs.org
[2]: http://leiningen.org

## Installation

Add {{name}} to your [lein-npm][3]-powered project:

[3]: https://github.com/bodil/lein-npm

```clojure
;; project.clj
:node-dependencies [{{name}} "0.1.0-SNAPSHOT"]
```

Pull {{name}} to your machine:

```
lein npm install
```

Now you should have `{{sanitized}}/src/core.cl2` in your `node_modules` directory.
Include it in your ChlorineJs source file(s):

```clojure
;; some-file.cl2
(load-file "{{sanitized}}/src/core.cl2")
```

## Develope {{name}}

### Live coding

Have your files watched and auto-compiled:

```bash
lein cl2c auto dev
```
This will watch for changes and re-compile `*.cl2` files to Javascript.

Now open an other terminal, have mocha run the tests automatically:

```bash
lein npm run-script mocha-auto
```

### Unit tests

If you just want to run the tests once:

```bash
lein npm run-script mocha
```

## Usage

FIXME

## License

Copyright © {{year}} FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
