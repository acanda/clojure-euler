(ns euler.problem1
  (:gen-class))

(defn multiple-of? [factor number] (= (mod number factor) 0))

(defn multiple-of-3-or-5? [n] (or (multiple-of? 3 n) (multiple-of? 5 n)))

(defn solve-problem-1 [] (reduce + (filter multiple-of-3-or-5? (range 1000))))