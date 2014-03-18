(ns euler.problem1
  (:gen-class))

(defn multiple-of?
  [factor number]
  (= (mod number factor) 0))

(defn value-of
  [n]
  (if (or (multiple-of? 3 n) (multiple-of? 5 n))
    n
    0))

(defn multiples
  [limit]
  (map value-of (range limit)))

(defn solve-problem-1
  []
  (reduce + (multiples 1000)))