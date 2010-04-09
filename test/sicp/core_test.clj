(ns sicp.core-test
  (:use [sicp.core] :reload-all)
  (:use [clojure.test]))

(deftest dummy-test
  (is (= testval 3)))
