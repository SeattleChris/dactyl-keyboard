;;; Unit tests for the compass module.

(ns dactyl-keyboard.compass-test
  (:require [clojure.test :refer [deftest testing is]]
            [dactyl-keyboard.compass :as compass]))

(deftest turning
  (testing "reversal"
    (is (= (compass/reverse :N) :S))
    (is (= (compass/reverse :E) :W))
    (is (= (compass/reverse :S) :N))
    (is (= (compass/reverse :NE) :SW))
    (is (= (compass/reverse :SE) :NW))
    (is (= (compass/reverse :SSW) :NNE)))
  (testing "right turn"
    (is (= (compass/sharp-right :N) :E))
    (is (= (compass/sharp-right :NE) :SE))
    (is (= (compass/sharp-right :NNE) :ESE)))
  (testing "left turn"
    (is (= (compass/sharp-left :N) :W))
    (is (= (compass/sharp-left :NE) :NW))
    (is (= (compass/sharp-left :NNE) :WNW))))