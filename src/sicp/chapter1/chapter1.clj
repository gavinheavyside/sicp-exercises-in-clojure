(ns sicp.chapter1.chapter1
  (:use [ clojure.contrib.math :only ( abs)]))


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
(defn sqrt-iter [guess x]
  (let [square #(* % %)
        good-enough #(< (abs (/ (- (square %1) %2) %2)) 0.00001)
        average #(/ (+ %1 %2) 2)
        improve #(average %1 (/ %2 %1))]
    (if (good-enough? guess x)
      guess
      (sqrt-iter (improve guess x)
                 x))))

(defn sqrt [x]
  (sqrt-iter 1.0 x))


;; a non-recursive implementation that uses a lazy sequence to
;; calculate the next improved estimate
(defn lazy-sqrt-iter [guess x]
  (let [square #(* % %)
        good-enough #(< (abs (/ (- (square %) x) x)) 0.00001)
        average #(/ (+ %1 %2) 2)
        improve #(average % (/ x %))]
    (first (drop-while #(not (good-enough %)) (iterate improve guess)))))

(defn lazy-sqrt [x]
  (lazy-sqrt-iter 1.0 x))
