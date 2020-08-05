(ns hello)
(gen-class
      :name "de.axa.clojuretest.MyMain"
      :prefix "-"
      :main false
      :methods [[greet [String] void]])

(defn hello [who] (str "Hello " who))

(defn -greet [this who] (println (hello who)))

