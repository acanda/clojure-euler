(ns euler.problem3
  (:use clojure.contrib.math)
  (:gen-class))

(defn primeHelper 
  [x i]
  (if (= i 1)
    true
    (if (= (mod x i) 0)
      false
      (recur x (- i 1)))))
    

(defn isPrime
  [x]
  (primeHelper x (first (exact-integer-sqrt x))))

(defn getLargestPrime
  [num i]
  (if (and (= (mod num i) 0) (isPrime (/ num i)))
      (/ num i)
      (recur num (+ i 1))))