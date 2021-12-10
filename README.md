# cljs-jxa-starter

Cocoa JXA(Javascript Automation) Hello World Application, written in
ClojureScript.
Updated for shadow-cljs and jdk 9+

## Usage

Just run `sh ./build_core.sh` or make it executable `chmod +x build_core.sh` and then run
`./build_core.sh`. This will execute the cljs as jxa and also build a compiled version.

`./build_lein.sh` and `./build_focus.sh` exist to build with lein or to build the focus_resize_window ns.

The resources/compiled/app.app folder will have compiled version in resources/compiled/app.app/Contents/Resources/Scripts/main.scpt,
but resources/compiled/core.js can also be used as a jxa file.

## License

Initial version: Copyright © 2015 blackgate
Modifications: Copyright © 2021 cyrik

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
