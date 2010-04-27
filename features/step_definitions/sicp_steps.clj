(ns sicp.features
  (:use [sicp.chapter1.chapter1] :reload-all)
  (:use [clojure.test])
  )

(After)

(Before)

(Given #"^I match a given line$"
       #(+ 3 4)
       )

(When #"^I match a when line$"
     #(+ 2 3)
      )

(Then #"^I should also match a then line with a number (\d+)$"
      (fn [expected]
        (def testval 3)
        (is (= testval (Integer. expected)))
        (assert (= testval (Integer. expected))))
      )

