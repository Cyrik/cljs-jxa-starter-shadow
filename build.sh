rm -rf resources/compiled/app.app
shadow-cljs release frontend
osacompile -s -o resources/compiled/app.app -l JavaScript -s resources/compiled/core.js
./resources/compiled/app.app/Contents/MacOS/applet 
