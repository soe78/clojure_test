(ns hello)
(gen-class
      :name "de.axa.clojuretest.MyMain"
      :prefix "-"
      :main false
      :methods [[greet [String] void]])

(defn language ([lang] (if (= lang "de") "Hallo" "Hello"))
  ([] (str "Hello")))

(defn hello ([who] (str (language) " " who))
  ([lang who] (str (language lang) " " who)))

(defn -greet [this who] (println (hello who)))

 