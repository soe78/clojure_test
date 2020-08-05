(ns tests (:use hello))

(-greet nil "Soeren")

(assert (= (hello "World") "Hello World"))
(assert (= (hello "de" "Welt") "Hallo Welt"))

(assert (= (language "de") "Hallo"))
(assert (= (language "en") "Hello"))
(assert (= (language) "Hello"))