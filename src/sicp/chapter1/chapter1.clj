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

;; exercise 1.6
;; in an if expression the alternative is not evaluated unless the
;; predicate fails. This is not the case for the cond expression, and
;; the alternative is evaluated (recursively)


;; exercise 1.7
;; v big or v small numbers, being within 0.001 is not useful to get
;; an accurate square root.  One option is to consider accuracy as a
;; fraction of the square rather than an absolute
(defn good-enough? [guess x]
  (< (abs (/ (- (square guess) x) x)) 0.0001))
