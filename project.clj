(defproject cljs-jxa-starter "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.glassfish.jaxb/jaxb-runtime "2.3.2"]
                 [org.clojure/clojurescript "1.10.896"]]

  :plugins [[lein-cljsbuild "1.1.8"]]
  :clean-targets ^{:protect false} ["resources/compiled" "target"]

  :cljsbuild {
    :builds [{:id "core"
              :source-paths ["src/cljs_jxa_starter"]
              :compiler {:output-to "resources/compiled/core.js"
                         :main cljs-jxa-starter.focus-resize-window
                         :optimizations :whitespace
                         :pretty-print true}}]})
