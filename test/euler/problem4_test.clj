(ns euler.problem4-test
  (:require [clojure.test :refer :all]
            [euler.problem4 :refer :all]))

(deftest anna-test
  (testing "anna should be a palindrome"
    (is (isPalindrome "anna" 0))))

(deftest a-test
  (testing "a should be a palindrome"
    (is (isPalindrome "a" 0))))

(deftest empty-test
  (testing "an empty string should be a palindrome"
    (is (isPalindrome "" 0))))

(deftest abc-test
  (testing "abc should not be a palindrome"
    (is (not (isPalindrome "abc" 0)))))

(deftest odbo-test
  (testing "odbo should not be a palindrome"
    (is (not (isPalindrome "odbo" 0)))))
