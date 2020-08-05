(ns hello)
(gen-class
	:name "de.axa.clojuretest.MyMain"
       :prefix "-"
      :main false
      :methods [[greet [String] void]])

(defn -greet [this who] (println "Hello " who))

