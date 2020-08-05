(ns tests (:use hello))

(-greet nil "Soeren")

(assert (= (hello "World") "Hello World"))