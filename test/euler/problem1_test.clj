(ns euler.problem1-test
  (:require [clojure.test :refer :all]
            [euler.problem1 :refer :all]))

(deftest solution-test
  (testing "The solution to problem one should be 233168"
    (is (= (solve-problem-1) 233168))))
