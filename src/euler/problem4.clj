(ns euler.problem4
  (:gen-class))

(defn halfLength
  [s]
  (/ (.length s) 2))


(defn isPalindrome
  [s i]
  (if (>= i (halfLength s))
    true
    (if (= (get s i) (get s (- (.length s) i 1)))
      (recur s (inc i))
      false)))

(defn findNewMax
  [a b max]
  (if (isPalindrome (.toString (* a b)) 0)
                     (* a b)
                     max))
 
(defn findLargest
  [a b max]
  (if (<= (* a a) max)
    max
    (if (< (* a b) max)
      (findLargest (dec a) (dec a) max)
      (findLargest a (dec b) (findNewMax a b max)))))
                   
    
    
