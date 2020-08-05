(ns tests (:use hello))

(-greet nil "Soeren")

(assert (= (sayHello "World") "Hello World"))
(assert (= (sayHello "de" "Welt") "Hallo Welt"))

(assert (= (language "de") "Hallo"))
(assert (= (language "en") "Hello"))
(assert (= (language) "Hello"))

(printEven '(7 14 21))
(printEven (range 20))

(doseq [n (range 20)] (println n " " (wuerfeln))) 

