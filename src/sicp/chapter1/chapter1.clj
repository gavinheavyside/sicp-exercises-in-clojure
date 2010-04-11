(ns sicp.chapter1.chapter1)


;; exercise 1.3
(defn square-and-sum-two-largest-of
  [args]
  (reduce
   + (map
      (fn [x] (* x x))
      (take-last 2
                 (sort args)))))


;; exercise 1.4
;; The if expression returns either the + or - function, which is then
;; applied to a and b.
;; If b is positive (a + b) == (a + (abs b))
;; If b is negative (a - b) == (a + (abs b))
(defn a-plus-abs-b
  [a b]
  ((if (> b 0) + -) a b))
  
;; exercise 1.5
;; applicative order: returns 0 because if is evaluated first, and x is 0
;; normal order: infinite recursion as p evaluates to p, which is
;;               recursively evaluated to p
(defn p-1-5 [] (p-1-5))
(defn test-1-5
  [x y]
  (if (= x 0)
    0
    y))
