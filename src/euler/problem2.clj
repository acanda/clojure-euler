(ns euler.problem2
  (:gen-class))

(def fib-seq 
  ((fn rfib [a b] 
     (lazy-seq (cons a (rfib b (+ a b)))))
   0 1))

(defn lessThan4M? [n] (< n 4000000))

(defn solve-problem-2 [] (reduce + (take-while lessThan4M? (filter even? fib-seq))))