(ns hello)
(import java.util.Random)
(gen-class
      :name "de.axa.clojuretest.MyMain"
      :prefix "-"
      :main false
      :methods [[greet [String] void]])

(defn language ([lang] (if (= lang "de") "Hallo" "Hello"))
  ([] (str "Hello")))

(defn sayHello ([who] (str (language) " " who))
  ([lang who] (str (language lang) " " who)))

(defn -greet [this who] (println (sayHello who)))

(defn printEven [x] (doseq [n x] (if (= (mod n 2) 0) (println n))))

(def rando (Random.))
(defn wuerfeln [] (+ 1 (mod (.nextInt rando) 6)) )

