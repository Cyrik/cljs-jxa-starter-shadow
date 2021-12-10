(ns cljs-jxa-starter.focus-resize-window
  (:require [clojure.string :as str]))

(def desired-width 800)
(def se (js/Application. "System Events"))

(defn main []
  (let [browser (js/Application. "Google Chrome")
        ^js win (aget ^js (.-windows (aget (.whose (.-processes se) #js{:frontmost #js{:= true}}) 0)) 0)
        vsCodeName (.name win)
        bounds #js{:x (- (+ (aget (.. win properties -position) 0) (aget (.. win properties -size) 0)) desired-width) 
                   :y 0 
                   :width desired-width 
                   :height (aget (.. win properties -size) 1)}]
    (when (.-running browser)
      (when-let [^js found (some #(when (str/includes? (.name %) vsCodeName) %) (.windows browser))]
        (.activate browser)
        (set! (.-index found) 1)
        (set! (.-bounds found) bounds)
        true))))
