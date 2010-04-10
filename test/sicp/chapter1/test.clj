(ns sicp.chapter1.test
  (:use [clojure.test]))

(deftest exercise-1-1
  (testing "what is printed by the interpreter?"
    (is (= 10 10))
  
    (is (= 12 (+ 5 4 3)))
  
    (is (= 8 (- 9 1)))

    (is (= 3 (/ 6 2)))
  
    (is (= 6 (+ (* 2 4) (- 4 6))))

  
    (def a 3)
    (def b (+ a 1))
  
    (is (=
         19
         (+ a b (* a b))))

    (is (=
         false
         (= a b)))

    (is (=
         b
         (if (and (> b a)
                  (< b (* a b)))
           b
           a)
         ))
  
    (is (=
         (+ 6 7 a) 
         (cond (= a 4) 6
               (= b 4) (+ 6 7 a)
               :else 25)
         ))
  
    (is (=
         6
         (+ 2 (if (> b a) b a))
         ))

    (is (=
         16
         (* (cond (> a b) a
                  (< a b) b
                  :else -1)
            (+ a 1))
         ))
    )
  )

(deftest exercise-1-2
  (testing "exercise 1.2"
    (testing "convert to prefix"
      (is (=
           (/ 37 -150)
           (/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5))))) (* 3 (- 6 2) (- 2 7)))))
      ))
  )
